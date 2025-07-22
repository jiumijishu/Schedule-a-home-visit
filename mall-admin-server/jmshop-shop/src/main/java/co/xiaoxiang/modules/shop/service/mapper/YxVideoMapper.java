package co.xiaoxiang.modules.shop.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.shop.domain.YxVideo;
import co.xiaoxiang.modules.shop.service.dto.YxVideoDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author yushen
* @date 2023-06-08
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxVideoMapper extends BaseMapper<YxVideoDto, YxVideo> {

}
