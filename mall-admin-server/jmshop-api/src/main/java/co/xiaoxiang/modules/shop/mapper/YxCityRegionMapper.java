package co.xiaoxiang.modules.shop.mapper;

import co.xiaoxiang.modules.shop.entity.YxCityRegion;
import co.xiaoxiang.modules.shop.entity.YxVideoType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 文章管理表 Mapper 接口
 * </p>
 *
 * @author hupeng
 * @since 2019-10-02
 */
@Repository
public interface YxCityRegionMapper extends BaseMapper<YxCityRegion> {


    @Select("select a.id,a.name,a.code,a.parent_code,a.create_time,b.`name` from yx_city_region a,yx_city_region b where a.parent_code=b.code  and b.`name`=#{name}")
    List<YxCityRegion> selectCityRegionList(@Param("name") String name);
}
