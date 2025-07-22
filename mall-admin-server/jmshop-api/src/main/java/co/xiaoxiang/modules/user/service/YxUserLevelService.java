/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.user.service;

import co.xiaoxiang.modules.user.entity.YxUserLevel;
import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.modules.user.web.dto.UserLevelInfoDTO;
import co.xiaoxiang.modules.user.web.param.YxUserLevelQueryParam;
import co.xiaoxiang.modules.user.web.vo.YxUserLevelQueryVo;
import co.xiaoxiang.common.web.vo.Paging;

import java.io.Serializable;

/**
 * <p>
 * 用户等级记录表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-12-06
 */
public interface YxUserLevelService extends BaseService<YxUserLevel> {

    /**
     * 设置会员等级
     *
     * @param uid 用户ID
     * @param levelId 等级ID
     */
    void setUserLevel(int uid,int levelId);

    boolean setLevelComplete(int uid);

    UserLevelInfoDTO getUserLevelInfo(int id);

    YxUserLevel getUserLevel(int uid,int grade);

    /**
     * 根据ID获取查询对象
     * @param id
     * @return
     */
    YxUserLevelQueryVo getYxUserLevelById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     * @param yxUserLevelQueryParam
     * @return
     */
    Paging<YxUserLevelQueryVo> getYxUserLevelPageList(YxUserLevelQueryParam yxUserLevelQueryParam) throws Exception;

}
