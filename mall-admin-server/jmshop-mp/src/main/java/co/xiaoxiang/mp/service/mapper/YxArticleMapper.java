package co.xiaoxiang.mp.service.mapper;

import co.xiaoxiang.mapper.EntityMapper;

import co.xiaoxiang.mp.domain.YxArticle;
import co.xiaoxiang.mp.service.dto.YxArticleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-10-07
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxArticleMapper extends EntityMapper<YxArticleDTO, YxArticle> {

}
