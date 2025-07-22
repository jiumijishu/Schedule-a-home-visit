/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.xiaoxiang.co
 * 注意：
 * 本软件为www.xiaoxiang.co开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package co.xiaoxiang.modules.user.service.impl;

import co.xiaoxiang.modules.user.entity.YxUserTaskFinish;
import co.xiaoxiang.modules.user.mapper.YxUserTaskFinishMapper;
import co.xiaoxiang.modules.user.service.YxUserTaskFinishService;
import co.xiaoxiang.modules.user.web.param.YxUserTaskFinishQueryParam;
import co.xiaoxiang.modules.user.web.vo.YxUserTaskFinishQueryVo;
import co.xiaoxiang.common.service.impl.BaseServiceImpl;
import co.xiaoxiang.common.web.vo.Paging;
import co.xiaoxiang.utils.OrderUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.io.Serializable;


/**
 * <p>
 * 用户任务完成记录表 服务实现类
 * </p>
 *
 * @author hupeng
 * @since 2019-12-07
 */
@Slf4j
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class YxUserTaskFinishServiceImpl extends BaseServiceImpl<YxUserTaskFinishMapper, YxUserTaskFinish> implements YxUserTaskFinishService {

    private final YxUserTaskFinishMapper yxUserTaskFinishMapper;


    /**
     * 设置任务完成
     * @param uid
     * @param taskId
     */
    @Override
    public void setFinish(int uid, int taskId) {
        QueryWrapper<YxUserTaskFinish> wrapper = new QueryWrapper<>();
        wrapper.eq("uid",uid).eq("task_id",taskId);
        int count = yxUserTaskFinishMapper.selectCount(wrapper);
        if(count == 0){
            YxUserTaskFinish userTaskFinish = new YxUserTaskFinish();
            userTaskFinish.setAddTime(OrderUtil.getSecondTimestampTwo());
            userTaskFinish.setUid(uid);
            userTaskFinish.setTaskId(taskId);
            userTaskFinish.setStatus(0);

            yxUserTaskFinishMapper.insert(userTaskFinish);
        }

    }

    @Override
    public YxUserTaskFinishQueryVo getYxUserTaskFinishById(Serializable id) throws Exception{
        return yxUserTaskFinishMapper.getYxUserTaskFinishById(id);
    }

    @Override
    public Paging<YxUserTaskFinishQueryVo> getYxUserTaskFinishPageList(YxUserTaskFinishQueryParam yxUserTaskFinishQueryParam) throws Exception{
        Page page = setPageParam(yxUserTaskFinishQueryParam,OrderItem.desc("create_time"));
        IPage<YxUserTaskFinishQueryVo> iPage = yxUserTaskFinishMapper.getYxUserTaskFinishPageList(page,yxUserTaskFinishQueryParam);
        return new Paging(iPage);
    }

}
