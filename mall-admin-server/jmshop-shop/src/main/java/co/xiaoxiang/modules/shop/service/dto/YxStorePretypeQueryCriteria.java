package co.xiaoxiang.modules.shop.service.dto;

import lombok.Data;
import java.util.List;
import co.xiaoxiang.annotation.Query;

/**
* @author 雨神
* @date 2023-07-16
*/
@Data
public class YxStorePretypeQueryCriteria{

    /** 精确 */
    @Query
    private String showFlag;
}
