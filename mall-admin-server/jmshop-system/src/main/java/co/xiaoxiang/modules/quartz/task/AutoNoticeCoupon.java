package co.xiaoxiang.modules.quartz.task;

import co.xiaoxiang.modules.activity.service.YxStoreCouponIssueUserService;
import co.xiaoxiang.modules.activity.service.YxStoreCouponUserService;
import co.xiaoxiang.modules.shop.service.YxStoreProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Zheng Jie
 * @date 2018-12-25
 */
@Slf4j
@Component
public class AutoNoticeCoupon {

    private final YxStoreCouponUserService yxStoreCouponUserService;

    public AutoNoticeCoupon(YxStoreCouponUserService yxStoreCouponUserService) {
        this.yxStoreCouponUserService = yxStoreCouponUserService;
    }

    public void run(){
        yxStoreCouponUserService.autoNoticeExpireUser();
    }
}
