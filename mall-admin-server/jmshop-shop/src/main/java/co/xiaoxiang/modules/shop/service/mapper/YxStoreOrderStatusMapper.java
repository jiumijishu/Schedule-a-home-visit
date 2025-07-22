package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.shop.domain.YxStoreOrderStatus;
import co.xiaoxiang.modules.shop.service.dto.YxStoreOrderStatusDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-11-02
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxStoreOrderStatusMapper extends EntityMapper<YxStoreOrderStatusDTO, YxStoreOrderStatus> {

}
