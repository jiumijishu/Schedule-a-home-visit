package co.xiaoxiang.modules.activity.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.activity.domain.YxStoreCouponUser;
import co.xiaoxiang.modules.activity.service.dto.YxStoreCouponUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-11-10
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxStoreCouponUserMapper extends EntityMapper<YxStoreCouponUserDTO, YxStoreCouponUser> {

}
