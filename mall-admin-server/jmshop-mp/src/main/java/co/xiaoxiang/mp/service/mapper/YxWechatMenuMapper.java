package co.xiaoxiang.mp.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.mp.domain.YxWechatMenu;
import co.xiaoxiang.mp.service.dto.YxWechatMenuDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-10-06
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxWechatMenuMapper extends EntityMapper<YxWechatMenuDTO, YxWechatMenu> {

}
