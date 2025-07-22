package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.shop.domain.YxWechatUser;
import co.xiaoxiang.modules.shop.service.dto.YxWechatUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-12-13
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxWechatUserMapper extends EntityMapper<YxWechatUserDTO, YxWechatUser> {

}
