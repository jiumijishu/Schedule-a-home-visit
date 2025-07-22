package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.shop.domain.YxCityRegion;
import co.xiaoxiang.modules.shop.service.dto.YxCityRegionDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author ys
* @date 2023-08-13
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxCityRegionMapper extends BaseMapper<YxCityRegionDto, YxCityRegion> {

}
