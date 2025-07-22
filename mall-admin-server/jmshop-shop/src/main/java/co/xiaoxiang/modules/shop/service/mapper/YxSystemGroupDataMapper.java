package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.shop.domain.YxSystemGroupData;
import co.xiaoxiang.modules.shop.service.dto.YxSystemGroupDataDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-10-18
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxSystemGroupDataMapper extends EntityMapper<YxSystemGroupDataDTO, YxSystemGroupData> {

}
