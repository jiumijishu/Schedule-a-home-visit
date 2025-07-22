/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.wechat.service.impl;

import co.xiaoxiang.common.service.impl.BaseServiceImpl;
import co.xiaoxiang.common.web.vo.Paging;
import co.xiaoxiang.modules.wechat.entity.YxWechatTemplate;
import co.xiaoxiang.modules.wechat.mapper.YxWechatTemplateMapper;
import co.xiaoxiang.modules.wechat.service.YxWechatTemplateService;
import co.xiaoxiang.modules.wechat.web.param.YxWechatTemplateQueryParam;
import co.xiaoxiang.modules.wechat.web.vo.YxWechatTemplateQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;


/**
 * <p>
 * 微信模板 服务实现类
 * </p>
 *
 * @author xuwenbo
 * @since 2019-12-10
 */
@Slf4j
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class WechatTemplateServiceImpl extends BaseServiceImpl<YxWechatTemplateMapper, YxWechatTemplate> implements YxWechatTemplateService {

    private final YxWechatTemplateMapper yxWechatTemplateMapper;

    @Override
    public YxWechatTemplateQueryVo getYxWechatTemplateById(Serializable id) throws Exception{
        return yxWechatTemplateMapper.getYxWechatTemplateById(id);
    }

    @Override
    public Paging<YxWechatTemplateQueryVo> getYxWechatTemplatePageList(YxWechatTemplateQueryParam yxWechatTemplateQueryParam) throws Exception{
        Page page = setPageParam(yxWechatTemplateQueryParam,OrderItem.desc("create_time"));
        IPage<YxWechatTemplateQueryVo> iPage = yxWechatTemplateMapper.getYxWechatTemplatePageList(page,yxWechatTemplateQueryParam);
        return new Paging(iPage);
    }

}
