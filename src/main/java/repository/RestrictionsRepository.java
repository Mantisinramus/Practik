package repository;

import entity.Restrictions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestrictionsRepository extends JpaRepository<Restrictions,Integer>{
}
