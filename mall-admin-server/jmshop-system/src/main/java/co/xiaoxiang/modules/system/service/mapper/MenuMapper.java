package co.xiaoxiang.modules.system.service.mapper;

import co.xiaoxiang.base.BaseMapper;
import co.xiaoxiang.modules.system.domain.Menu;
import co.xiaoxiang.modules.system.service.dto.MenuDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Zheng Jie
 * @date 2018-12-17
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuMapper extends BaseMapper<MenuDTO, Menu> {

}
