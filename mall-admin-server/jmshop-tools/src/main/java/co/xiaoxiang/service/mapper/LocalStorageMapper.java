package co.xiaoxiang.service.mapper;

import co.xiaoxiang.domain.LocalStorage;
import co.xiaoxiang.service.dto.LocalStorageDTO;
import co.xiaoxiang.base.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-09-05
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LocalStorageMapper extends BaseMapper<LocalStorageDTO, LocalStorage> {

}
