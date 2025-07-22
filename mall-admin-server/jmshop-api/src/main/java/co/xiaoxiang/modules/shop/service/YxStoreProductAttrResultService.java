/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.shop.service;

import co.xiaoxiang.modules.shop.entity.YxStoreProductAttrResult;
import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.modules.shop.web.param.YxStoreProductAttrResultQueryParam;
import co.xiaoxiang.modules.shop.web.vo.YxStoreProductAttrResultQueryVo;
import co.xiaoxiang.common.web.vo.Paging;

import java.io.Serializable;

/**
 * <p>
 * 商品属性详情表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-10-23
 */
public interface YxStoreProductAttrResultService extends BaseService<YxStoreProductAttrResult> {

    /**
     * 根据ID获取查询对象
     * @param id
     * @return
     */
    YxStoreProductAttrResultQueryVo getYxStoreProductAttrResultById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     * @param yxStoreProductAttrResultQueryParam
     * @return
     */
    Paging<YxStoreProductAttrResultQueryVo> getYxStoreProductAttrResultPageList(YxStoreProductAttrResultQueryParam yxStoreProductAttrResultQueryParam) throws Exception;

}
