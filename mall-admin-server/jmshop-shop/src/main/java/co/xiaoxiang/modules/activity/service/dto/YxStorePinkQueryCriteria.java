package co.xiaoxiang.modules.activity.service.dto;

import co.xiaoxiang.annotation.Query;
import lombok.Data;

/**
* @author hupeng
* @date 2019-11-18
*/
@Data
public class YxStorePinkQueryCriteria{
    @Query
    private Integer kId;
}
