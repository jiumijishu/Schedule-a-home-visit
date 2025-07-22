package co.xiaoxiang.mp.repository;


import co.xiaoxiang.mp.domain.YxArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author hupeng
* @date 2019-10-07
*/
public interface YxArticleRepository extends JpaRepository<YxArticle, Integer>, JpaSpecificationExecutor {
}
