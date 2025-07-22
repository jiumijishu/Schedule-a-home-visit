package co.xiaoxiang.modules.quartz.task;

import co.xiaoxiang.modules.activity.service.YxStoreCouponUserService;
import co.xiaoxiang.modules.shop.service.YxUserLevelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Zheng Jie
 * @date 2018-12-25
 */
@Slf4j
@Component
public class AutoNoticeMemberExpire {

    private final YxUserLevelService yxUserLevelService;

    public AutoNoticeMemberExpire(YxUserLevelService yxUserLevelService) {
        this.yxUserLevelService = yxUserLevelService;
    }

    public void run(){
        yxUserLevelService.autoNoticeExpireUser();
    }
}
