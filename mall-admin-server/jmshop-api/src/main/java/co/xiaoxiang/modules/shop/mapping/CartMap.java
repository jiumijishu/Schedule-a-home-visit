package co.xiaoxiang.modules.shop.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.shop.entity.YxStoreCart;
import co.xiaoxiang.modules.shop.web.vo.YxStoreCartQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2019-10-26
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CartMap extends EntityMapper<YxStoreCartQueryVo, YxStoreCart> {

}
