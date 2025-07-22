package co.xiaoxiang.modules.shop.service;

import co.xiaoxiang.modules.shop.domain.YxCityRegion;
import co.xiaoxiang.modules.shop.service.dto.YxCityRegionDto;
import co.xiaoxiang.modules.shop.service.dto.YxCityRegionQueryCriteria;
import org.springframework.data.domain.Pageable;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

/**
* @author ys
* @date 2023-08-13
*/
public interface YxCityRegionService {

    /**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    Map<String,Object> queryAll(YxCityRegionQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<YxCityRegionDto>
    */
    List<YxCityRegionDto> queryAll(YxCityRegionQueryCriteria criteria);

    /**
     * 根据ID查询
     * @param id ID
     * @return YxCityRegionDto
     */
    YxCityRegionDto findById(Long id);

    /**
    * 创建
    * @param resources /
    * @return YxCityRegionDto
    */
    YxCityRegionDto create(YxCityRegion resources);

    /**
    * 编辑
    * @param resources /
    */
    void update(YxCityRegion resources);

    /**
    * 多选删除
    * @param ids /
    */
    void deleteAll(Long[] ids);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<YxCityRegionDto> all, HttpServletResponse response) throws IOException;
}
