package co.xiaoxiang.modules.quartz.task;

import co.xiaoxiang.modules.monitor.service.VisitsService;
import co.xiaoxiang.modules.shop.service.YxStoreOrderService;
import co.xiaoxiang.modules.shop.service.YxStoreProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Zheng Jie
 * @date 2018-12-25
 */
@Slf4j
@Component
public class AutoOfflineProduct {

    private final YxStoreProductService yxStoreProductService;

    public AutoOfflineProduct(YxStoreProductService yxStoreProductService) {
        this.yxStoreProductService = yxStoreProductService;
    }

    public void run(){
        yxStoreProductService.autoOfflineProduct();
    }
}
