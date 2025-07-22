package co.xiaoxiang.modules.activity.service.impl;

import co.xiaoxiang.modules.activity.domain.YxStoreDiscount;
import co.xiaoxiang.modules.activity.repository.YxStoreDiscountRepository;
import co.xiaoxiang.modules.activity.service.YxStoreDiscountService;
import co.xiaoxiang.modules.activity.service.dto.YxStoreDiscountDTO;
import co.xiaoxiang.modules.activity.service.dto.YxStoreDiscountQueryCriteria;
import co.xiaoxiang.modules.activity.service.mapper.YxStoreDiscountMapper;
import co.xiaoxiang.utils.PageUtil;
import co.xiaoxiang.utils.QueryHelp;
import co.xiaoxiang.utils.ValidationUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public  class YxStoreDiscountServiceImpl implements YxStoreDiscountService {

    private final YxStoreDiscountRepository YxStoreDiscountRepository;

    private final YxStoreDiscountMapper YxStoreDiscountMapper;

    public YxStoreDiscountServiceImpl(YxStoreDiscountRepository YxStoreDiscountRepository, YxStoreDiscountMapper YxStoreDiscountMapper) {
        this.YxStoreDiscountRepository = YxStoreDiscountRepository;
        this.YxStoreDiscountMapper = YxStoreDiscountMapper;
    }

    @Override
    public Map<String,Object> queryAll(YxStoreDiscountQueryCriteria criteria, Pageable pageable){
        Page<YxStoreDiscount> page = YxStoreDiscountRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder),pageable);
        return PageUtil.toPage(page.map(YxStoreDiscountMapper::toDto));
    }

    @Override
    public List<YxStoreDiscountDTO> queryAll(YxStoreDiscountQueryCriteria criteria){
        return YxStoreDiscountMapper.toDto(YxStoreDiscountRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder)));
    }

    @Override
    public YxStoreDiscountDTO findById(Integer id) {
        Optional<YxStoreDiscount> YxStoreDiscount = YxStoreDiscountRepository.findById(id);
        ValidationUtil.isNull(YxStoreDiscount,"YxStoreDiscount","id",id);
        return YxStoreDiscountMapper.toDto(YxStoreDiscount.get());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public YxStoreDiscountDTO create(YxStoreDiscount resources) {
        return YxStoreDiscountMapper.toDto(YxStoreDiscountRepository.save(resources));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(YxStoreDiscount resources) {
        Optional<YxStoreDiscount> optionalYxStoreDiscount = YxStoreDiscountRepository.findById(resources.getId());
        ValidationUtil.isNull( optionalYxStoreDiscount,"YxStoreDiscount","id",resources.getId());
        YxStoreDiscount YxStoreDiscount = optionalYxStoreDiscount.get();
        YxStoreDiscount.copy(resources);
        YxStoreDiscountRepository.save(YxStoreDiscount);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer id) {
        YxStoreDiscountRepository.deleteById(id);
    }

    @Override
    public YxStoreDiscountDTO findByProductId(Integer id) {
        Optional<YxStoreDiscount> YxStoreDiscount = YxStoreDiscountRepository.findByProductId(id);
        if(YxStoreDiscount.isPresent()){
            return YxStoreDiscountMapper.toDto(YxStoreDiscount.get());
        }
        return new YxStoreDiscountDTO();
    }
}
