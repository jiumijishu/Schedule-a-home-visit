package co.xiaoxiang.modules.shop.service.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.io.Serializable;

/**
* @author ys
* @date 2023-08-13
*/
@Data
public class YxCityRegionDto implements Serializable {

    /** id */
    private Long id;

    /** 名称 */
    private String name;

    /** code */
    private String code;

    /** 父级code */
    private Long parentCode;

    /** 创建时间 */
    private Timestamp createTime;
}
