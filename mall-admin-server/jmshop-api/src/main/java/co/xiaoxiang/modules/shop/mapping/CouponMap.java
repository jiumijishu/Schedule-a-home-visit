package co.xiaoxiang.modules.shop.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.shop.entity.YxStoreCouponUser;
import co.xiaoxiang.modules.shop.web.vo.YxStoreCouponUserQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2019-10-26
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CouponMap extends EntityMapper<YxStoreCouponUserQueryVo, YxStoreCouponUser> {

}
