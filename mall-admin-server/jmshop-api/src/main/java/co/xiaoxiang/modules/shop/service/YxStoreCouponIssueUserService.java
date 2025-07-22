/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.shop.service;

import co.xiaoxiang.modules.shop.entity.YxStoreCouponIssueUser;
import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.modules.shop.web.param.YxStoreCouponIssueUserQueryParam;
import co.xiaoxiang.modules.shop.web.vo.YxStoreCouponIssueUserQueryVo;
import co.xiaoxiang.common.web.vo.Paging;

import java.io.Serializable;

/**
 * <p>
 * 优惠券前台用户领取记录表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-10-27
 */
public interface YxStoreCouponIssueUserService extends BaseService<YxStoreCouponIssueUser> {


    void addUserIssue(int uid,int id);

    /**
     * 根据ID获取查询对象
     * @param id
     * @return
     */
    YxStoreCouponIssueUserQueryVo getYxStoreCouponIssueUserById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     * @param yxStoreCouponIssueUserQueryParam
     * @return
     */
    Paging<YxStoreCouponIssueUserQueryVo> getYxStoreCouponIssueUserPageList(YxStoreCouponIssueUserQueryParam yxStoreCouponIssueUserQueryParam) throws Exception;

}
