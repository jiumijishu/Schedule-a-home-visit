package co.xiaoxiang.modules.shop.mapper;

import co.xiaoxiang.modules.shop.entity.YxStoreDiscount;
import co.xiaoxiang.modules.shop.web.param.YxStoreCouponQueryParam;
import co.xiaoxiang.modules.shop.web.vo.YxStoreCouponQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <p>
 * 优惠券表 Mapper 接口
 * </p>
 *
 * @author hupeng
 * @since 2019-10-27
 */
@Repository
public interface YxStoreDiscountMapper extends BaseMapper<YxStoreDiscount> {

}
