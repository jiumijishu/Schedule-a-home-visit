package co.xiaoxiang.modules.shop.entity;

import co.xiaoxiang.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* @author yushen
* @date 2023-05-11
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "YxStorePretype", description = "预售产品类型")
public class YxStorePretype extends BaseEntity {

    private static final long serialVersionUID = 1L;
    /** 模板id */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /** 类型名称 */
    private String typeName;

    /** 备注 */
    private String remark;

    /** 是否展示 */
    private String showFlag;

    /** 排序 */
    private Integer sortNo;


}
