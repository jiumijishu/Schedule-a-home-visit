package co.xiaoxiang.modules.activity.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.activity.domain.YxUserExtract;
import co.xiaoxiang.modules.activity.service.dto.YxUserExtractDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-11-14
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxUserExtractMapper extends EntityMapper<YxUserExtractDTO, YxUserExtract> {

}
