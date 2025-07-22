/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.shop.service;

import co.xiaoxiang.modules.shop.entity.YxStoreCouponUser;
import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.modules.shop.web.param.YxStoreCouponUserQueryParam;
import co.xiaoxiang.modules.shop.web.vo.StoreCouponUserVo;
import co.xiaoxiang.modules.shop.web.vo.YxStoreCouponIssueQueryVo;
import co.xiaoxiang.modules.shop.web.vo.YxStoreCouponUserQueryVo;
import co.xiaoxiang.common.web.vo.Paging;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 优惠券发放记录表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-10-27
 */
public interface YxStoreCouponUserService extends BaseService<YxStoreCouponUser> {

    int getUserValidCouponCount(int uid);

    void useCoupon(int id);

    YxStoreCouponUser getCoupon(int id, int uid);

    List<StoreCouponUserVo> beUsableCouponList(int uid, String cartIds);

    /**
     * 获取下单时候满足的优惠券
     *
     * @param uid        uid
     * @param price      总价格
     * @param productIds list
     * @return list
     */
    List<StoreCouponUserVo> getUsableCouponList(int uid, double price, List<String> productIds, Map<Integer, BigDecimal> proPriceMap);

    /**
     * 获取可用优惠券
     *
     * @param uid
     * @param price
     * @return
     */
    YxStoreCouponUser beUsableCoupon(int uid, double price, List<String> productIds, Map<Integer, BigDecimal> proPriceMap);

    void checkInvalidCoupon(int uid);

    List<YxStoreCouponUserQueryVo> getUserCoupon(int uid);

    void addUserCoupon(int uid, YxStoreCouponIssueQueryVo couponIssueQueryVo);

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    YxStoreCouponUserQueryVo getYxStoreCouponUserById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param yxStoreCouponUserQueryParam
     * @return
     */
    Paging<YxStoreCouponUserQueryVo> getYxStoreCouponUserPageList(YxStoreCouponUserQueryParam yxStoreCouponUserQueryParam) throws Exception;

}
