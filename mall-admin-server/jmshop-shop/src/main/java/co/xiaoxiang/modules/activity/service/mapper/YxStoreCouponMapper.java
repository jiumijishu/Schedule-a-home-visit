package co.xiaoxiang.modules.activity.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.activity.domain.YxStoreCoupon;
import co.xiaoxiang.modules.activity.service.dto.YxStoreCouponDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author hupeng
 * @date 2019-11-09
 */
@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxStoreCouponMapper extends EntityMapper<YxStoreCouponDTO, YxStoreCoupon> {

}
