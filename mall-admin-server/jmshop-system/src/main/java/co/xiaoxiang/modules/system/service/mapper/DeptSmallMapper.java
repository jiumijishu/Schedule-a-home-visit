package co.xiaoxiang.modules.system.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.system.domain.Dept;
import co.xiaoxiang.modules.system.service.dto.DeptSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-03-25
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeptSmallMapper extends BaseMapper<DeptSmallDTO, Dept> {

}
