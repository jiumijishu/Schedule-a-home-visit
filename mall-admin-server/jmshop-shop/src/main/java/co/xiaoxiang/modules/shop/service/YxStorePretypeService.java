package co.xiaoxiang.modules.shop.service;

import co.xiaoxiang.modules.shop.domain.YxStorePretype;
import co.xiaoxiang.modules.shop.service.dto.YxStorePretypeDto;
import co.xiaoxiang.modules.shop.service.dto.YxStorePretypeQueryCriteria;
import org.springframework.data.domain.Pageable;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

/**
* @author 雨神
* @date 2023-07-16
*/
public interface YxStorePretypeService {

    /**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    Map<String,Object> queryAll(YxStorePretypeQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<YxStorePretypeDto>
    */
    List<YxStorePretypeDto> queryAll(YxStorePretypeQueryCriteria criteria);

    /**
     * 根据ID查询
     * @param id ID
     * @return YxStorePretypeDto
     */
    YxStorePretypeDto findById(Integer id);

    /**
    * 创建
    * @param resources /
    * @return YxStorePretypeDto
    */
    YxStorePretypeDto create(YxStorePretype resources);

    /**
    * 编辑
    * @param resources /
    */
    void update(YxStorePretype resources);

    /**
    * 多选删除
    * @param ids /
    */
    void deleteAll(Integer[] ids);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<YxStorePretypeDto> all, HttpServletResponse response) throws IOException;
}
