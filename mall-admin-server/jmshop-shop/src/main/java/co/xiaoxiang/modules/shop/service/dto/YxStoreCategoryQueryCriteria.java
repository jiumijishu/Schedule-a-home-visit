package co.xiaoxiang.modules.shop.service.dto;

import co.xiaoxiang.annotation.Query;
import lombok.Data;

/**
* @author hupeng
* @date 2019-10-03
*/
@Data
public class YxStoreCategoryQueryCriteria{

    // 模糊
    @Query(type = Query.Type.INNER_LIKE)
    private String cateName;

    @Query
    private Integer isDel = 0;
}
