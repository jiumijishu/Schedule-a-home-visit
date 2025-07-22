package co.xiaoxiang.modules.activity.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.activity.domain.YxStoreVisit;
import co.xiaoxiang.modules.activity.service.dto.YxStoreVisitDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-11-18
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxStoreVisitMapper extends EntityMapper<YxStoreVisitDTO, YxStoreVisit> {

}
