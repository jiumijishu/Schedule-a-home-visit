package co.xiaoxiang.modules.mnt.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.mnt.domain.DeployHistory;
import co.xiaoxiang.modules.mnt.service.dto.DeployHistoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeployHistoryMapper extends BaseMapper<DeployHistoryDto, DeployHistory> {

}
