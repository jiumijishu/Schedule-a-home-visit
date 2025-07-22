package co.xiaoxiang.service.mapper;

import co.xiaoxiang.domain.Log;
import co.xiaoxiang.service.dto.LogErrorDTO;
import co.xiaoxiang.base.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Zheng Jie
 * @date 2019-5-22
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LogErrorMapper extends BaseMapper<LogErrorDTO, Log> {

}
