package repository;

import entity.SWBICS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SWBICSRepository extends JpaRepository<SWBICS,Integer>{
}
