package co.xiaoxiang.modules.shop.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.shop.entity.YxStoreProduct;
import co.xiaoxiang.modules.shop.web.vo.YxStoreProductQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2019-10-19
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxStoreProductMap extends EntityMapper<YxStoreProductQueryVo, YxStoreProduct> {

}
