package co.xiaoxiang.modules.user.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.user.entity.YxUserBill;
import co.xiaoxiang.modules.user.web.vo.YxUserBillQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2019-10-26
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BiillMap extends EntityMapper<YxUserBillQueryVo, YxUserBill> {

}
