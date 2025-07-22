package co.xiaoxiang.mp.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.mp.domain.YxWechatReply;
import co.xiaoxiang.mp.service.dto.YxWechatReplyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-10-10
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxWechatReplyMapper extends EntityMapper<YxWechatReplyDTO, YxWechatReply> {

}
