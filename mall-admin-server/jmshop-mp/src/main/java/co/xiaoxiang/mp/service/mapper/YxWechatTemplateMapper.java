package co.xiaoxiang.mp.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.mp.domain.YxWechatTemplate;
import co.xiaoxiang.mp.service.dto.YxWechatTemplateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author xuwenbo
* @date 2019-12-10
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxWechatTemplateMapper extends EntityMapper<YxWechatTemplateDTO, YxWechatTemplate> {

}
