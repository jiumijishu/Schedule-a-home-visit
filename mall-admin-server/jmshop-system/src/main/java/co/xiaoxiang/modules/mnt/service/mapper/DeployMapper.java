package co.xiaoxiang.modules.mnt.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.mnt.domain.Deploy;
import co.xiaoxiang.modules.mnt.service.dto.DeployDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Mapper(componentModel = "spring",uses = {AppMapper.class, ServerDeployMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeployMapper extends BaseMapper<DeployDto, Deploy> {

}
