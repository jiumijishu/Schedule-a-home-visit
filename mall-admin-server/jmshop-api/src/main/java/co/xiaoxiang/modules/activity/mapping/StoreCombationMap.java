package co.xiaoxiang.modules.activity.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.activity.entity.YxStoreCombination;
import co.xiaoxiang.modules.activity.web.vo.YxStoreCombinationQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2019-10-19
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StoreCombationMap extends EntityMapper<YxStoreCombinationQueryVo, YxStoreCombination> {

}
