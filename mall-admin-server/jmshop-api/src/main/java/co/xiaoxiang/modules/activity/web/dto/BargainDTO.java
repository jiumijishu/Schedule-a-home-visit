package co.xiaoxiang.modules.activity.web.dto;

import co.xiaoxiang.modules.activity.web.vo.YxStoreBargainQueryVo;
import co.xiaoxiang.modules.user.web.vo.YxUserQueryVo;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BargainDTO
 * @Author hupeng <610796224@qq.com>
 * @Date 2019/12/21
 **/
@Data
@Builder
public class BargainDTO implements Serializable {
    private YxStoreBargainQueryVo bargain;
    private YxUserQueryVo userInfo;
    private Integer bargainSumCount;//砍价支付成功订单数量
}
