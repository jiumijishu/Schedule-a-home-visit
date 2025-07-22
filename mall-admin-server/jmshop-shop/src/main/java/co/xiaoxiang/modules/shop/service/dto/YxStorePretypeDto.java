package co.xiaoxiang.modules.shop.service.dto;

import lombok.Data;
import java.io.Serializable;

/**
* @author 雨神
* @date 2023-07-16
*/
@Data
public class YxStorePretypeDto implements Serializable {

    /** id */
    private Integer id;

    private String typeName;

    /** 备注 */
    private String remark;

    /** 是否展示 */
    private String showFlag;

    /** 排序 */
    private Integer sortNo;
}
