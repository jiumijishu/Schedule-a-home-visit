package co.xiaoxiang.modules.activity.mapping;

import co.xiaoxiang.mapper.EntityMapper;
import co.xiaoxiang.modules.activity.entity.YxStoreBargainUserHelp;
import co.xiaoxiang.modules.activity.web.vo.YxStoreBargainUserHelpQueryVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
* @author hupeng
* @date 2019-12-22
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StoreBargainHelpMap extends EntityMapper<YxStoreBargainUserHelpQueryVo, YxStoreBargainUserHelp> {

}
