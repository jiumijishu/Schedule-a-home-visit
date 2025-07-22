package co.xiaoxiang.modules.activity.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.activity.entity.YxStoreBargainUser;
import co.xiaoxiang.modules.activity.web.vo.YxStoreBargainUserQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2019-12-21
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StoreBargainUserMap extends EntityMapper<YxStoreBargainUserQueryVo, YxStoreBargainUser> {

}
