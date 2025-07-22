package co.xiaoxiang.modules.shop.service.dto;

import lombok.Data;
import java.util.List;
import co.xiaoxiang.annotation.Query;

import javax.persistence.Column;

/**
* @author yushen
* @date 2023-06-08
*/
@Data
public class YxVideoQueryCriteria{


    @Query
    private Integer typeId;

    @Query
    private String title;

}
