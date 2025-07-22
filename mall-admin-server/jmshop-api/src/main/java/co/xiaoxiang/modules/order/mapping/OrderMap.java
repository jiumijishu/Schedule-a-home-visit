package co.xiaoxiang.modules.order.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.order.entity.YxStoreOrder;
import co.xiaoxiang.modules.order.web.vo.YxStoreOrderQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2019-10-26
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMap extends EntityMapper<YxStoreOrderQueryVo, YxStoreOrder> {

}
