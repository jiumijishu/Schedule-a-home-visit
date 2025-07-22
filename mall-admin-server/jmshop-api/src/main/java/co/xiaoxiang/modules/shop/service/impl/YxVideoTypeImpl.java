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
import co.xiaoxiang.modules.shop.entity.YxProductTemplate;
import co.xiaoxiang.modules.shop.entity.YxStoreProductAttrValue;
import co.xiaoxiang.modules.shop.entity.YxVideoType;
import co.xiaoxiang.modules.shop.mapper.*;
import co.xiaoxiang.modules.shop.service.YxStoreProductAttrService;
import co.xiaoxiang.modules.shop.service.YxStoreProductService;
import co.xiaoxiang.modules.shop.service.YxStoreTemplateService;
import co.xiaoxiang.modules.shop.service.YxVideoTypeService;
import co.xiaoxiang.modules.shop.web.param.YxStoreProductQueryParam;
import co.xiaoxiang.modules.shop.web.vo.YxProductTemplateVo;
import co.xiaoxiang.modules.shop.web.vo.YxStoreCategoryQueryVo;
import co.xiaoxiang.modules.shop.web.vo.YxStoreProductAttrQueryVo;
import co.xiaoxiang.modules.shop.web.vo.YxStoreProductQueryVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


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
public class YxVideoTypeImpl extends BaseServiceImpl<YxVideoTypeMapper, YxVideoType> implements YxVideoTypeService {

    private final YxVideoTypeMapper yxVideoTypeMapper;


    @Override
    public List<YxVideoType> selectVideoTypeList() {
        return yxVideoTypeMapper.selectVideoTypeList();
    }
}
