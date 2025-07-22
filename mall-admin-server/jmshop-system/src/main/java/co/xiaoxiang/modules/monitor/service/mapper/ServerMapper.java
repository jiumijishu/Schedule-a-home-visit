package co.xiaoxiang.modules.monitor.service.mapper;

import co.xiaoxiang.modules.monitor.domain.Server;
import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.monitor.service.dto.ServerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zhang houying
* @date 2019-11-03
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServerMapper extends BaseMapper<ServerDTO, Server> {

}
