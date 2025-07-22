/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.open.service;

import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.common.web.vo.Paging;
import co.xiaoxiang.modules.manage.web.dto.OrderDataDTO;
import co.xiaoxiang.modules.manage.web.dto.OrderTimeDataDTO;
import co.xiaoxiang.modules.manage.web.param.OrderDeliveryParam;
import co.xiaoxiang.modules.manage.web.param.OrderPriceParam;
import co.xiaoxiang.modules.manage.web.param.OrderRefundParam;
import co.xiaoxiang.modules.order.entity.YxStoreOrder;
import co.xiaoxiang.modules.order.web.dto.*;
import co.xiaoxiang.modules.order.web.param.OrderParam;
import co.xiaoxiang.modules.order.web.param.RefundParam;
import co.xiaoxiang.modules.order.web.param.YxStoreOrderQueryParam;
import co.xiaoxiang.modules.order.web.vo.YxStoreOrderQueryVo;
import co.xiaoxiang.modules.shop.web.vo.YxStoreCartQueryVo;
import com.github.binarywang.wxpay.bean.order.WxPayAppOrderResult;
import com.github.binarywang.wxpay.bean.order.WxPayMpOrderResult;
import com.github.binarywang.wxpay.bean.order.WxPayMwebOrderResult;
import com.github.binarywang.wxpay.exception.WxPayException;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-10-27
 */
public interface OpenStoreOrderService extends BaseService<YxStoreOrder> {

    /**
     * 获取分页对象
     * @param yxStoreOrderQueryParam
     * @return
     */
    Paging<YxStoreOrderQueryVo> getYxStoreOrderPageList(YxStoreOrderQueryParam yxStoreOrderQueryParam) throws Exception;

}
