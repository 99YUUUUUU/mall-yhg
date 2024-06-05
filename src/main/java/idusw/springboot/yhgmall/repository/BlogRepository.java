package idusw.springboot.yhgmall.repository;

import idusw.springboot.yhgmall.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogEntity, Long> {

}
