package co.xiaoxiang.modules.shop.domain;

import lombok.Data;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;

/**
* @author 雨神
* @date 2023-07-16
*/
@Entity
@Data
@Table(name="yx_store_pretype")
public class YxStorePretype implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "type_name")
    private String typeName;

    /** 备注 */
    @Column(name = "remark")
    private String remark;

    /** 是否展示 */
    @Column(name = "show_flag")
    private String showFlag;

    /** 排序 */
    @Column(name = "sort_no")
    private Integer sortNo;

    public void copy(YxStorePretype source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }
}
