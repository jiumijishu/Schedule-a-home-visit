/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.shop.service;

import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.common.web.vo.Paging;
import co.xiaoxiang.modules.shop.entity.YxStoreProduct;
import co.xiaoxiang.modules.shop.web.dto.ProductDTO;
import co.xiaoxiang.modules.shop.web.param.YxStoreProductQueryParam;
import co.xiaoxiang.modules.shop.web.vo.YxStoreProductQueryVo;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-10-19
 */
public interface YxStoreProductService extends BaseService<YxStoreProduct> {

    YxStoreProduct getProductInfo(int id);


    void incProductStock(int num, int productId, String unique);

    void decProductStock(int num, int productId, String unique);

    int getProductStock(int productId, String unique);


    /**
     * 获取商品详情
     *
     * @param id
     * @param type
     * @param uid
     * @param latitude
     * @param longitude
     * @return
     */
    ProductDTO goodsDetail(int id, int type, int uid, String latitude, String longitude);

    /**
     * 获取商品列表
     *
     * @param productQueryParam
     * @return
     */
    List<YxStoreProductQueryVo> getGoodsList(YxStoreProductQueryParam productQueryParam);
    List<YxStoreProductQueryVo> getPreGoodsList(YxStoreProductQueryParam productQueryParam);

    /**
     * 商品列表
     *
     * @param page
     * @param limit
     * @param order
     * @return
     */
    List<YxStoreProductQueryVo> getList(int page, int limit, int order);

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    YxStoreProductQueryVo getYxStoreProductById(Serializable id);

    YxStoreProductQueryVo getNewStoreProductById(int id);

    /**
     * 获取分页对象
     *
     * @param yxStoreProductQueryParam
     * @return
     */
    Paging<YxStoreProductQueryVo> getYxStoreProductPageList(YxStoreProductQueryParam yxStoreProductQueryParam) throws Exception;

    List<YxStoreProductQueryVo> getCategoryGoodsList(YxStoreProductQueryParam yxStoreProductQueryParam);

    List<YxStoreProductQueryVo> getTemplateGoodsList(YxStoreProductQueryParam productQueryParam);
    List<YxStoreProductQueryVo> getVideoGoodsList(YxStoreProductQueryParam productQueryParam);
}
