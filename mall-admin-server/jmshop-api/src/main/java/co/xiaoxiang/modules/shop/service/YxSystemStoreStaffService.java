package co.xiaoxiang.modules.shop.service;

import co.xiaoxiang.modules.shop.entity.YxSystemStoreStaff;
import co.xiaoxiang.common.service.BaseService;
import co.xiaoxiang.modules.shop.web.param.YxSystemStoreStaffQueryParam;
import co.xiaoxiang.modules.shop.web.vo.YxSystemStoreStaffQueryVo;
import co.xiaoxiang.common.web.vo.Paging;

import java.io.Serializable;

/**
 * <p>
 * 门店店员表 服务类
 * </p>
 *
 * @author hupeng
 * @since 2020-03-23
 */
public interface YxSystemStoreStaffService extends BaseService<YxSystemStoreStaff> {

    boolean checkStatus(int uid,int storeId);

    /**
     * 根据ID获取查询对象
     * @param id
     * @return
     */
    YxSystemStoreStaffQueryVo getYxSystemStoreStaffById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     * @param yxSystemStoreStaffQueryParam
     * @return
     */
    Paging<YxSystemStoreStaffQueryVo> getYxSystemStoreStaffPageList(YxSystemStoreStaffQueryParam yxSystemStoreStaffQueryParam) throws Exception;

}
