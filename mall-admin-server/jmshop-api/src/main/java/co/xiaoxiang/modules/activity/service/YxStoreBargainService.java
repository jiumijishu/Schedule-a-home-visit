/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.activity.service;

import co.xiaoxiang.modules.activity.entity.YxStoreBargain;
import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.modules.activity.web.dto.BargainCountDTO;
import co.xiaoxiang.modules.activity.web.dto.BargainDTO;
import co.xiaoxiang.modules.activity.web.dto.TopCountDTO;
import co.xiaoxiang.modules.activity.web.param.YxStoreBargainQueryParam;
import co.xiaoxiang.modules.activity.web.vo.YxStoreBargainQueryVo;
import co.xiaoxiang.common.web.vo.Paging;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 砍价表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-12-21
 */
public interface YxStoreBargainService extends BaseService<YxStoreBargain> {

    void incStockDecSales(int num,int bargainId);

    void decStockIncSales(int num,int bargainId);

    YxStoreBargain getBargain(int bargainId);

    void doHelp(int bargainId,int bargainUserUid,int uid);

    TopCountDTO topCount(int bargainId);

    BargainCountDTO helpCount(int bargainId, int uid,int myUid);

    int getBargainPayCount(int bargainId);

    void addBargainShare(int id);

    void addBargainLook(int id);

    BargainDTO getDetail(int id, int uid);

    List<YxStoreBargainQueryVo> getList(int page, int limit);

    /**
     * 根据ID获取查询对象
     * @param id
     * @return
     */
    YxStoreBargainQueryVo getYxStoreBargainById(Serializable id);

    /**
     * 获取分页对象
     * @param yxStoreBargainQueryParam
     * @return
     */
    Paging<YxStoreBargainQueryVo> getYxStoreBargainPageList(YxStoreBargainQueryParam yxStoreBargainQueryParam) throws Exception;

}
