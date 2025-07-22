/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.order.service.impl;

import co.xiaoxiang.modules.order.entity.YxStoreOrderStatus;
import co.xiaoxiang.modules.order.mapper.YxStoreOrderStatusMapper;
import co.xiaoxiang.modules.order.service.YxStoreOrderStatusService;
import co.xiaoxiang.common.service.impl.BaseServiceImpl;
import co.xiaoxiang.utils.OrderUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 订单操作记录表 服务实现类
 * </p>
 *
 * @author hupeng
 * @since 2019-10-27
 */
@Slf4j
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class YxStoreOrderStatusServiceImpl extends BaseServiceImpl<YxStoreOrderStatusMapper, YxStoreOrderStatus> implements YxStoreOrderStatusService {

    private final YxStoreOrderStatusMapper yxStoreOrderStatusMapper;

    @Override
    public void create(int oid, String changetype, String changeMessage) {
        YxStoreOrderStatus storeOrderStatus = new YxStoreOrderStatus();
        storeOrderStatus.setOid(oid);
        storeOrderStatus.setChangeType(changetype);
        storeOrderStatus.setChangeMessage(changeMessage);
        storeOrderStatus.setChangeTime(OrderUtil.getSecondTimestampTwo());

        yxStoreOrderStatusMapper.insert(storeOrderStatus);
    }
}
