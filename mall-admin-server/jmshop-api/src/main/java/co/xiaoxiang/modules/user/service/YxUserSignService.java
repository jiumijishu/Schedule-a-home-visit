/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.user.service;

import co.xiaoxiang.modules.user.entity.YxUserSign;
import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.modules.user.web.dto.SignDTO;
import co.xiaoxiang.modules.user.web.param.YxUserSignQueryParam;
import co.xiaoxiang.modules.user.web.vo.YxUserSignQueryVo;
import co.xiaoxiang.common.web.vo.Paging;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 签到记录表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-12-05
 */
public interface YxUserSignService extends BaseService<YxUserSign> {

    int sign(int uid);

    List<SignDTO>  getSignList(int uid,int page,int limit);

    boolean getYesterDayIsSign(int uid);

    boolean getToDayIsSign(int uid);

    int getSignSumDay(int uid);

    /**
     * 根据ID获取查询对象
     * @param id
     * @return
     */
    YxUserSignQueryVo getYxUserSignById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     * @param yxUserSignQueryParam
     * @return
     */
    Paging<YxUserSignQueryVo> getYxUserSignPageList(YxUserSignQueryParam yxUserSignQueryParam) throws Exception;

}
