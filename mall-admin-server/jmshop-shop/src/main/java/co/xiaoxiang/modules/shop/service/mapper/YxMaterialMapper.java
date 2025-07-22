package co.xiaoxiang.modules.shop.service.mapper;


import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.shop.domain.YxMaterial;
import co.xiaoxiang.modules.shop.service.dto.YxMaterialDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2020-01-09
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxMaterialMapper extends BaseMapper<YxMaterialDto, YxMaterial> {

}
