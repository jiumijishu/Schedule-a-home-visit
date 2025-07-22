/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.activity.service;

import co.xiaoxiang.modules.activity.entity.YxStoreBargainUser;
import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.modules.activity.web.param.YxStoreBargainUserQueryParam;
import co.xiaoxiang.modules.activity.web.vo.YxStoreBargainUserQueryVo;
import co.xiaoxiang.common.web.vo.Paging;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 用户参与砍价表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-12-21
 */
public interface YxStoreBargainUserService extends BaseService<YxStoreBargainUser> {

    void setBargainUserStatus(int bargainId,int uid);

    void bargainCancel(int bargainId,int uid);

    List<YxStoreBargainUserQueryVo> bargainUserList(int bargainUserUid,int page,int limit);

    boolean isBargainUserHelp(int bargainId,int bargainUserUid,int uid);

    void setBargain(Integer bargainId,Integer uid);

    double getBargainUserDiffPrice(int id);


    YxStoreBargainUser getBargainUserInfo(int bargainId, int uid);

    List<YxStoreBargainUserQueryVo> getBargainUserList(int bargainId,int status);

    /**
     * 根据ID获取查询对象
     * @param id
     * @return
     */
    YxStoreBargainUserQueryVo getYxStoreBargainUserById(Serializable id);

    /**
     * 获取分页对象
     * @param yxStoreBargainUserQueryParam
     * @return
     */
    Paging<YxStoreBargainUserQueryVo> getYxStoreBargainUserPageList(YxStoreBargainUserQueryParam yxStoreBargainUserQueryParam) throws Exception;

}
