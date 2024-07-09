package repository;

import entity.PartInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartInfoRepository extends JpaRepository<PartInfo, Long> {

}