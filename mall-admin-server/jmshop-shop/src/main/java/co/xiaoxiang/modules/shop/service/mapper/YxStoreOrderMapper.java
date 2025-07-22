package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.shop.domain.YxStoreOrder;
import co.xiaoxiang.modules.shop.service.dto.YxStoreOrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-10-14
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxStoreOrderMapper extends EntityMapper<YxStoreOrderDTO, YxStoreOrder> {

}
