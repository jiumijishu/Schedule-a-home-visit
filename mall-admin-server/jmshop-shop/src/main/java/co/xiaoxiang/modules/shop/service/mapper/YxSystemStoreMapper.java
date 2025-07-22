package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.shop.domain.YxSystemStore;
import co.xiaoxiang.modules.shop.service.dto.YxSystemStoreDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2020-03-03
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxSystemStoreMapper extends BaseMapper<YxSystemStoreDto, YxSystemStore> {

}
