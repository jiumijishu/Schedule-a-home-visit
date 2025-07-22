package co.xiaoxiang.modules.activity.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.activity.domain.YxStoreSeckill;
import co.xiaoxiang.modules.activity.service.dto.YxStoreSeckillDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author xuwenbo
* @date 2019-12-14
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxStoreSeckillMapper extends EntityMapper<YxStoreSeckillDTO, YxStoreSeckill> {

}
