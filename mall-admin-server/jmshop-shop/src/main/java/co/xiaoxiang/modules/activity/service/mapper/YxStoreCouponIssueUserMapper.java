package co.xiaoxiang.modules.activity.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.activity.domain.YxStoreCouponIssueUser;
import co.xiaoxiang.modules.activity.service.dto.YxStoreCouponIssueUserDTO;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
* @author hupeng
* @date 2019-11-09
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxStoreCouponIssueUserMapper extends EntityMapper<YxStoreCouponIssueUserDTO, YxStoreCouponIssueUser> {


}
