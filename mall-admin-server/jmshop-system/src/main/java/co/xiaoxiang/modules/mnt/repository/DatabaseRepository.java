package co.xiaoxiang.modules.mnt.repository;

import co.xiaoxiang.modules.mnt.domain.Database;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author zhanghouying
* @date 2019-08-24
*/
public interface DatabaseRepository extends JpaRepository<Database, String>, JpaSpecificationExecutor<Database> {
}
