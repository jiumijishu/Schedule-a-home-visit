package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.shop.domain.YxUserRecharge;
import co.xiaoxiang.modules.shop.service.dto.YxUserRechargeDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2020-03-02
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxUserRechargeMapper extends BaseMapper<YxUserRechargeDto, YxUserRecharge> {

}
