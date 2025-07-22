package co.xiaoxiang.modules.shop.service.dto;

import co.xiaoxiang.annotation.Query;
import lombok.Data;

/**
* @author hupeng
* @date 2019-10-18
*/
@Data
public class YxSystemGroupDataQueryCriteria{
    // 精确
    @Query
    private String groupName;
}
