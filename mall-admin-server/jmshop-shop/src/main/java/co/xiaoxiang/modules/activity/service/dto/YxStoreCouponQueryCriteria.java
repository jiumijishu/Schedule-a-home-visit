package co.xiaoxiang.modules.activity.service.dto;

import co.xiaoxiang.annotation.Query;
import lombok.Data;

/**
* @author hupeng
* @date 2019-11-09
*/
@Data
public class YxStoreCouponQueryCriteria{
    @Query
    private Integer isDel;
}
