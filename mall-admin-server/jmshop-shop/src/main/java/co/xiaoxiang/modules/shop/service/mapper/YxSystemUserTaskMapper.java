package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.shop.domain.YxSystemUserTask;
import co.xiaoxiang.modules.shop.service.dto.YxSystemUserTaskDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-12-04
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxSystemUserTaskMapper extends EntityMapper<YxSystemUserTaskDTO, YxSystemUserTask> {

}
