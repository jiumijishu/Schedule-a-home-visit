package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.shop.domain.YxStoreProductReply;
import co.xiaoxiang.modules.shop.service.dto.YxStoreProductReplyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-11-03
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxStoreProductReplyMapper extends EntityMapper<YxStoreProductReplyDTO, YxStoreProductReply> {

}
