package co.xiaoxiang.modules.shop.service.impl;

import co.xiaoxiang.modules.shop.domain.YxStorePretype;
import co.xiaoxiang.utils.ValidationUtil;
import co.xiaoxiang.utils.FileUtil;
import co.xiaoxiang.modules.shop.repository.YxStorePretypeRepository;
import co.xiaoxiang.modules.shop.service.YxStorePretypeService;
import co.xiaoxiang.modules.shop.service.dto.YxStorePretypeDto;
import co.xiaoxiang.modules.shop.service.dto.YxStorePretypeQueryCriteria;
import co.xiaoxiang.modules.shop.service.mapper.YxStorePretypeMapper;
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
* @author 雨神
* @date 2023-07-16
*/
@Service
//@CacheConfig(cacheNames = "yxStorePretype")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class YxStorePretypeServiceImpl implements YxStorePretypeService {

    private final YxStorePretypeRepository yxStorePretypeRepository;

    private final YxStorePretypeMapper yxStorePretypeMapper;

    public YxStorePretypeServiceImpl(YxStorePretypeRepository yxStorePretypeRepository, YxStorePretypeMapper yxStorePretypeMapper) {
        this.yxStorePretypeRepository = yxStorePretypeRepository;
        this.yxStorePretypeMapper = yxStorePretypeMapper;
    }

    @Override
    //@Cacheable
    public Map<String,Object> queryAll(YxStorePretypeQueryCriteria criteria, Pageable pageable){
        Page<YxStorePretype> page = yxStorePretypeRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder),pageable);
        return PageUtil.toPage(page.map(yxStorePretypeMapper::toDto));
    }

    @Override
    //@Cacheable
    public List<YxStorePretypeDto> queryAll(YxStorePretypeQueryCriteria criteria){
        return yxStorePretypeMapper.toDto(yxStorePretypeRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder)));
    }

    @Override
    //@Cacheable(key = "#p0")
    public YxStorePretypeDto findById(Integer id) {
        YxStorePretype yxStorePretype = yxStorePretypeRepository.findById(id).orElseGet(YxStorePretype::new);
        ValidationUtil.isNull(yxStorePretype.getId(),"YxStorePretype","id",id);
        return yxStorePretypeMapper.toDto(yxStorePretype);
    }

    @Override
    //@CacheEvict(allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    public YxStorePretypeDto create(YxStorePretype resources) {
        return yxStorePretypeMapper.toDto(yxStorePretypeRepository.save(resources));
    }

    @Override
    //@CacheEvict(allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    public void update(YxStorePretype resources) {
        YxStorePretype yxStorePretype = yxStorePretypeRepository.findById(resources.getId()).orElseGet(YxStorePretype::new);
        ValidationUtil.isNull( yxStorePretype.getId(),"YxStorePretype","id",resources.getId());
        yxStorePretype.copy(resources);
        yxStorePretypeRepository.save(yxStorePretype);
    }

    @Override
    //@CacheEvict(allEntries = true)
    public void deleteAll(Integer[] ids) {
        for (Integer id : ids) {
            yxStorePretypeRepository.deleteById(id);
        }
    }

    @Override
    public void download(List<YxStorePretypeDto> all, HttpServletResponse response) throws IOException {
        List<Map<String, Object>> list = new ArrayList<>();
        for (YxStorePretypeDto yxStorePretype : all) {
            Map<String,Object> map = new LinkedHashMap<>();
            map.put(" typeName",  yxStorePretype.getTypeName());
            map.put("备注", yxStorePretype.getRemark());
            map.put("是否展示", yxStorePretype.getShowFlag());
            map.put("排序", yxStorePretype.getSortNo());
            list.add(map);
        }
        FileUtil.downloadExcel(list, response);
    }
}
