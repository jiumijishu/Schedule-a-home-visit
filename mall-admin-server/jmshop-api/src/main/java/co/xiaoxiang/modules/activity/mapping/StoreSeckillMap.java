package co.xiaoxiang.modules.activity.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.activity.entity.YxStoreSeckill;
import co.xiaoxiang.modules.activity.web.vo.YxStoreSeckillQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2019-12-17
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StoreSeckillMap extends EntityMapper<YxStoreSeckillQueryVo, YxStoreSeckill> {

}
