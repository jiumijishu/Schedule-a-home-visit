package co.xiaoxiang.modules.activity.service.dto;

import co.xiaoxiang.annotation.Query;
import lombok.Data;

/**
* @author hupeng
* @date 2019-11-09
*/
@Data
public class YxStoreCouponIssueUserQueryCriteria{

    @Query
    private Integer issueCouponId;

    @Query
    private Integer uid;
}
