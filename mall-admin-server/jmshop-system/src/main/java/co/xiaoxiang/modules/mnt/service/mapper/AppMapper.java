package co.xiaoxiang.modules.mnt.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.mnt.domain.App;
import co.xiaoxiang.modules.mnt.service.dto.AppDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AppMapper extends BaseMapper<AppDto, App> {

}
