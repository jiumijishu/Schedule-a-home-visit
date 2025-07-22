package co.xiaoxiang.modules.shop.service.dto;

import co.xiaoxiang.annotation.Query;
import lombok.Data;

/**
* @author hupeng
* @date 2019-12-04
*/
@Data
public class YxSystemUserLevelQueryCriteria{
    @Query
    private Integer isDel;
}
