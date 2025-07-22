package co.xiaoxiang.modules.mnt.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.mnt.domain.Database;
import co.xiaoxiang.modules.mnt.service.dto.DatabaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DatabaseMapper extends BaseMapper<DatabaseDto, Database> {

}
