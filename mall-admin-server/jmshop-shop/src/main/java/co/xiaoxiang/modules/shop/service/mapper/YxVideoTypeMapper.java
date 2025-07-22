package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.shop.domain.YxVideoType;
import co.xiaoxiang.modules.shop.service.dto.YxVideoTypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author yushen
* @date 2023-06-08
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxVideoTypeMapper extends BaseMapper<YxVideoTypeDto, YxVideoType> {

}
