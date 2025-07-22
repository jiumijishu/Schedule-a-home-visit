package co.xiaoxiang.modules.shop.entity;

import co.xiaoxiang.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import java.sql.Timestamp;

/**
* @author yushen
* @date 2023-05-11
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "YxCityRegion对象", description = "地区类型")
public class YxCityRegion extends BaseEntity {

    private static final long serialVersionUID = 1L;
    /** 模板id */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /** 名称 */
    private String name;

    /** code */
    private String code;

    /** 父级code */
    private Long parentCode;

    /** 创建时间 */
    private Timestamp createTime;



}
