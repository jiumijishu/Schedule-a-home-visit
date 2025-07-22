package co.xiaoxiang.modules.order.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import co.xiaoxiang.modules.order.entity.YxStoreOrderCartInfo;
import co.xiaoxiang.modules.order.web.param.YxStoreOrderCartInfoQueryParam;
import co.xiaoxiang.modules.order.web.vo.YxStoreOrderCartInfoQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <p>
 * 订单购物详情表 Mapper 接口
 * </p>
 *
 * @author hupeng
 * @since 2019-10-27
 */
@Repository
public interface YxStoreOrderCartInfoMapper extends BaseMapper<YxStoreOrderCartInfo> {

    /**
     * 根据ID获取查询对象
     * @param id
     * @return
     */
    YxStoreOrderCartInfoQueryVo getYxStoreOrderCartInfoById(Serializable id);

    /**
     * 获取分页对象
     * @param page
     * @param yxStoreOrderCartInfoQueryParam
     * @return
     */
    IPage<YxStoreOrderCartInfoQueryVo> getYxStoreOrderCartInfoPageList(@Param("page") Page page, @Param("param") YxStoreOrderCartInfoQueryParam yxStoreOrderCartInfoQueryParam);

}
