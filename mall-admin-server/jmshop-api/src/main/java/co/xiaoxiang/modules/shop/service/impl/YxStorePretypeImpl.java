/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.shop.service.impl;

import co.xiaoxiang.common.service.impl.BaseServiceImpl;
import co.xiaoxiang.modules.shop.entity.YxStorePretype;
import co.xiaoxiang.modules.shop.entity.YxVideoType;
import co.xiaoxiang.modules.shop.mapper.YxStorePretypeMapper;
import co.xiaoxiang.modules.shop.mapper.YxVideoTypeMapper;
import co.xiaoxiang.modules.shop.service.YxStorePreTypeService;
import co.xiaoxiang.modules.shop.service.YxVideoTypeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * <p>
 * 文章管理表 服务实现类
 * </p>
 *
 * @author hupeng
 * @since 2019-10-02
 */
@Slf4j
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class YxStorePretypeImpl extends BaseServiceImpl<YxStorePretypeMapper, YxStorePretype> implements YxStorePreTypeService {

    private final YxStorePretypeMapper yxStorepreTypeMapper;


    @Override
    public List<YxStorePretype> selectPretypeList() {
        return yxStorepreTypeMapper.selectPretypeList();
    }
}
