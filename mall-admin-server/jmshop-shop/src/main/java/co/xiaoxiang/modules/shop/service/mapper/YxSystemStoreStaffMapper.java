package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.shop.domain.YxSystemStoreStaff;
import co.xiaoxiang.modules.shop.service.dto.YxSystemStoreStaffDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2020-03-22
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxSystemStoreStaffMapper extends BaseMapper<YxSystemStoreStaffDto, YxSystemStoreStaff> {

}
