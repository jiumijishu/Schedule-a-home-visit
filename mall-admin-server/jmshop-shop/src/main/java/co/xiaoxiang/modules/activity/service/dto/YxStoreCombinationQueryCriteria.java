package co.xiaoxiang.modules.activity.service.dto;

import co.xiaoxiang.annotation.Query;
import lombok.Data;

/**
* @author hupeng
* @date 2019-11-18
*/
@Data
public class YxStoreCombinationQueryCriteria{

    // 模糊
    @Query(type = Query.Type.INNER_LIKE)
    private String title;

    @Query
    private Integer isDel;
}
