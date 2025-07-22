package co.xiaoxiang.modules.shop.domain;

import lombok.Data;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Timestamp;
import java.io.Serializable;

/**
* @author ys
* @date 2023-08-13
*/
@Entity
@Data
@Table(name="yx_city_region")
public class YxCityRegion implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /** 名称 */
    @Column(name = "name")
    private String name;

    /** code */
    @Column(name = "code")
    private String code;

    /** 父级code */
    @Column(name = "parent_code")
    private Long parentCode;

    /** 创建时间 */
    @Column(name = "create_time")
    private Timestamp createTime;

    public void copy(YxCityRegion source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }
}
