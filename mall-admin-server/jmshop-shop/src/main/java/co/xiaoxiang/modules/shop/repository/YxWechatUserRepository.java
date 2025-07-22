package co.xiaoxiang.modules.shop.repository;

import co.xiaoxiang.modules.shop.domain.YxWechatUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author hupeng
* @date 2019-12-13
*/
public interface YxWechatUserRepository extends JpaRepository<YxWechatUser, Integer>, JpaSpecificationExecutor {
}
