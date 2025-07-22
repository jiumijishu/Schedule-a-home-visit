/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.order.service;

import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.modules.order.entity.YxStoreOrderCartInfo;
import co.xiaoxiang.modules.shop.web.vo.YxStoreCartQueryVo;

import java.util.List;

/**
 * <p>
 * 订单购物详情表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-10-27
 */
public interface YxStoreOrderCartInfoService extends BaseService<YxStoreOrderCartInfo> {

    void saveCartInfo(Integer oid, List<YxStoreCartQueryVo> cartInfo);

    YxStoreOrderCartInfo findByUni(String unique);


}
