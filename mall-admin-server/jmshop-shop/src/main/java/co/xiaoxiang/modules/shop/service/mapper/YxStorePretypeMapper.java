package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.shop.domain.YxStorePretype;
import co.xiaoxiang.modules.shop.service.dto.YxStorePretypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author 雨神
* @date 2023-07-16
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxStorePretypeMapper extends BaseMapper<YxStorePretypeDto, YxStorePretype> {

}
