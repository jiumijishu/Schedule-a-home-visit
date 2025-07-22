package co.xiaoxiang.modules.shop.service.dto;

import lombok.Data;
import java.util.List;
import co.xiaoxiang.annotation.Query;

/**
* @author hupeng
* @date 2020-03-02
*/
@Data
public class YxUserRechargeQueryCriteria{

    /** 模糊 */
    @Query(type = Query.Type.INNER_LIKE)
    private String nickname;
}
