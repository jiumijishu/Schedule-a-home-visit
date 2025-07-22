package co.xiaoxiang.modules.system.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.system.domain.DictDetail;
import co.xiaoxiang.modules.system.service.dto.DictDetailDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-04-10
*/
@Mapper(componentModel = "spring", uses = {DictSmallMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictDetailMapper extends BaseMapper<DictDetailDTO, DictDetail> {

}
