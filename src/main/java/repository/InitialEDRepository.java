package repository;


import entity.InitialED;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InitialEDRepository extends JpaRepository<InitialED,Long>
{
}
