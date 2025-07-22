package co.xiaoxiang.modules.shop.service.impl;

import co.xiaoxiang.modules.shop.domain.YxCityRegion;
import co.xiaoxiang.utils.ValidationUtil;
import co.xiaoxiang.utils.FileUtil;
import co.xiaoxiang.modules.shop.repository.YxCityRegionRepository;
import co.xiaoxiang.modules.shop.service.YxCityRegionService;
import co.xiaoxiang.modules.shop.service.dto.YxCityRegionDto;
import co.xiaoxiang.modules.shop.service.dto.YxCityRegionQueryCriteria;
import co.xiaoxiang.modules.shop.service.mapper.YxCityRegionMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
// 默认不使用缓存
//import org.springframework.cache.annotation.CacheConfig;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import co.xiaoxiang.utils.PageUtil;
import co.xiaoxiang.utils.QueryHelp;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
* @author ys
* @date 2023-08-13
*/
@Service
//@CacheConfig(cacheNames = "yxCityRegion")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class YxCityRegionServiceImpl implements YxCityRegionService {

    private final YxCityRegionRepository yxCityRegionRepository;

    private final YxCityRegionMapper yxCityRegionMapper;

    public YxCityRegionServiceImpl(YxCityRegionRepository yxCityRegionRepository, YxCityRegionMapper yxCityRegionMapper) {
        this.yxCityRegionRepository = yxCityRegionRepository;
        this.yxCityRegionMapper = yxCityRegionMapper;
    }

    @Override
    //@Cacheable
    public Map<String,Object> queryAll(YxCityRegionQueryCriteria criteria, Pageable pageable){
        Page<YxCityRegion> page = yxCityRegionRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder),pageable);
        return PageUtil.toPage(page.map(yxCityRegionMapper::toDto));
    }

    @Override
    //@Cacheable
    public List<YxCityRegionDto> queryAll(YxCityRegionQueryCriteria criteria){
        return yxCityRegionMapper.toDto(yxCityRegionRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder)));
    }

    @Override
    //@Cacheable(key = "#p0")
    public YxCityRegionDto findById(Long id) {
        YxCityRegion yxCityRegion = yxCityRegionRepository.findById(id).orElseGet(YxCityRegion::new);
        ValidationUtil.isNull(yxCityRegion.getId(),"YxCityRegion","id",id);
        return yxCityRegionMapper.toDto(yxCityRegion);
    }

    @Override
    //@CacheEvict(allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    public YxCityRegionDto create(YxCityRegion resources) {
        return yxCityRegionMapper.toDto(yxCityRegionRepository.save(resources));
    }

    @Override
    //@CacheEvict(allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    public void update(YxCityRegion resources) {
        YxCityRegion yxCityRegion = yxCityRegionRepository.findById(resources.getId()).orElseGet(YxCityRegion::new);
        ValidationUtil.isNull( yxCityRegion.getId(),"YxCityRegion","id",resources.getId());
        yxCityRegion.copy(resources);
        yxCityRegionRepository.save(yxCityRegion);
    }

    @Override
    //@CacheEvict(allEntries = true)
    public void deleteAll(Long[] ids) {
        for (Long id : ids) {
            yxCityRegionRepository.deleteById(id);
        }
    }

    @Override
    public void download(List<YxCityRegionDto> all, HttpServletResponse response) throws IOException {
        List<Map<String, Object>> list = new ArrayList<>();
        for (YxCityRegionDto yxCityRegion : all) {
            Map<String,Object> map = new LinkedHashMap<>();
            map.put("名称", yxCityRegion.getName());
            map.put("code", yxCityRegion.getCode());
            map.put("父级code", yxCityRegion.getParentCode());
            map.put("创建时间", yxCityRegion.getCreateTime());
            list.add(map);
        }
        FileUtil.downloadExcel(list, response);
    }
}
