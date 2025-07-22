/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.shop.service;

import co.xiaoxiang.modules.shop.entity.YxStoreProductRelation;
import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.modules.shop.web.param.YxStoreProductRelationQueryParam;
import co.xiaoxiang.modules.shop.web.vo.YxStoreProductRelationQueryVo;
import co.xiaoxiang.common.web.vo.Paging;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 商品点赞和收藏表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-10-23
 */
public interface YxStoreProductRelationService extends BaseService<YxStoreProductRelation> {

    Boolean isProductRelation(int productId, String category,
                              int uid, String relationType);

    void addRroductRelation(YxStoreProductRelationQueryParam param,int uid,
                            String relationType);

    void delRroductRelation(YxStoreProductRelationQueryParam param,int uid,
                            String relationType);

    List<YxStoreProductRelationQueryVo> userCollectProduct(int page,int limit,int uid);


    /**
     * 根据ID获取查询对象
     * @param id
     * @return
     */
    YxStoreProductRelationQueryVo getYxStoreProductRelationById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     * @param yxStoreProductRelationQueryParam
     * @return
     */
    Paging<YxStoreProductRelationQueryVo> getYxStoreProductRelationPageList(YxStoreProductRelationQueryParam yxStoreProductRelationQueryParam) throws Exception;

}
