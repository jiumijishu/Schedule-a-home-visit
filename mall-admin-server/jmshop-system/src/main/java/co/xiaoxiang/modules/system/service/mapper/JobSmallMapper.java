package co.xiaoxiang.modules.system.service.mapper;

import co.xiaoxiang.modules.system.service.dto.JobSmallDTO;
import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.system.domain.Job;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-03-29
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobSmallMapper extends BaseMapper<JobSmallDTO, Job> {

}
