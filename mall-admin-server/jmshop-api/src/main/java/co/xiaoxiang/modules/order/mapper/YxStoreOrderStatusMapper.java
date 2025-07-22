package co.xiaoxiang.modules.order.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import co.xiaoxiang.modules.order.entity.YxStoreOrderStatus;
import co.xiaoxiang.modules.order.web.param.YxStoreOrderStatusQueryParam;
import co.xiaoxiang.modules.order.web.vo.YxStoreOrderStatusQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <p>
 * 订单操作记录表 Mapper 接口
 * </p>
 *
 * @author hupeng
 * @since 2019-10-27
 */
@Repository
public interface YxStoreOrderStatusMapper extends BaseMapper<YxStoreOrderStatus> {

    /**
     * 根据ID获取查询对象
     * @param id
     * @return
     */
    YxStoreOrderStatusQueryVo getYxStoreOrderStatusById(Serializable id);

    /**
     * 获取分页对象
     * @param page
     * @param yxStoreOrderStatusQueryParam
     * @return
     */
    IPage<YxStoreOrderStatusQueryVo> getYxStoreOrderStatusPageList(@Param("page") Page page, @Param("param") YxStoreOrderStatusQueryParam yxStoreOrderStatusQueryParam);

}
