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
import co.xiaoxiang.modules.shop.entity.YxSystemGroupData;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 组合数据详情表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2019-10-19
 */
public interface YxSystemGroupDataService extends BaseService<YxSystemGroupData> {

    List<Map<String,Object>> getDatas(String name);

    YxSystemGroupData findData(Integer id);

}
