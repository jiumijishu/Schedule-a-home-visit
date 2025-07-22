package co.xiaoxiang.modules.activity.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.activity.entity.YxStoreBargain;
import co.xiaoxiang.modules.activity.web.vo.YxStoreBargainQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2019-12-21
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StoreBargainMap extends EntityMapper<YxStoreBargainQueryVo, YxStoreBargain> {

}
