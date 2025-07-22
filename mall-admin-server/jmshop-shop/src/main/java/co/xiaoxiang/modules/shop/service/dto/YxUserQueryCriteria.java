package co.xiaoxiang.modules.shop.service.dto;

import co.xiaoxiang.annotation.Query;
import co.xiaoxiang.modules.shop.domain.YxSystemUserLevel;
import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
* @author hupeng
* @date 2019-10-06
*/
@Data
public class YxUserQueryCriteria{

    // 模糊
    @Query(type = Query.Type.INNER_LIKE)
    private String nickname;

    // 模糊
    @Query(type = Query.Type.INNER_LIKE)
    private String phone;

    // 模糊
    @Query(type = Query.Type.INNER_LIKE)
    private String uid;

    @Query
    private Integer isPromoter;

    @Query
    private String userType;

    @Query
    private Integer status;

    @Query
    @ManyToOne(fetch= FetchType.LAZY,optional = false)
    @JoinColumn(name = "level")
    @NotFound(action= NotFoundAction.IGNORE)
    private YxSystemUserLevel yxSystemUserLevel;
}
