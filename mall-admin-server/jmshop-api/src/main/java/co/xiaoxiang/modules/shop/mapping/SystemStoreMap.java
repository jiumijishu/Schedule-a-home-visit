package co.xiaoxiang.modules.shop.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.shop.entity.YxSystemStore;
import co.xiaoxiang.modules.shop.web.vo.YxSystemStoreQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2020-03-04
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SystemStoreMap extends EntityMapper<YxSystemStoreQueryVo, YxSystemStore> {

}
