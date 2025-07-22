package co.xiaoxiang.modules.shop.mapper;

import co.xiaoxiang.modules.shop.entity.YxStorePretype;
import co.xiaoxiang.modules.shop.entity.YxVideoType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface YxStorePretypeMapper extends BaseMapper<YxStorePretype> {


    @Select("select id,type_name,remark,show_flag,sort_no from yx_store_pretype where show_flag='Y' order by sort_no asc")
    List<YxStorePretype> selectPretypeList();
}
