package co.xiaoxiang.modules.user.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.user.entity.YxSystemUserTask;
import co.xiaoxiang.modules.user.web.vo.YxSystemUserTaskQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2019-12-7
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SystemUserTaskMap extends EntityMapper<YxSystemUserTaskQueryVo, YxSystemUserTask> {

}
