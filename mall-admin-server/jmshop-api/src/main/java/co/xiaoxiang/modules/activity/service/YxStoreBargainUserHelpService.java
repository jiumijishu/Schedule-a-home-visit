/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.activity.service;

import co.xiaoxiang.modules.activity.entity.YxStoreBargainUserHelp;
import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.modules.activity.web.param.YxStoreBargainUserHelpQueryParam;
import co.xiaoxiang.modules.activity.web.vo.YxStoreBargainUserHelpQueryVo;
import co.xiaoxiang.common.web.vo.Paging;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 砍价用户帮助表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-12-21
 */
public interface YxStoreBargainUserHelpService extends BaseService<YxStoreBargainUserHelp> {

    List<YxStoreBargainUserHelpQueryVo> getList(int bargainId,int bargainUserUid,int page,int limit);

    int getBargainUserHelpPeopleCount(int bargainId,int bargainUserUid);

    /**
     * 根据ID获取查询对象
     * @param id
     * @return
     */
    YxStoreBargainUserHelpQueryVo getYxStoreBargainUserHelpById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     * @param yxStoreBargainUserHelpQueryParam
     * @return
     */
    Paging<YxStoreBargainUserHelpQueryVo> getYxStoreBargainUserHelpPageList(YxStoreBargainUserHelpQueryParam yxStoreBargainUserHelpQueryParam) throws Exception;

}
