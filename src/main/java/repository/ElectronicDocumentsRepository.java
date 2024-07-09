package repository;


import entity.ElectronicDocuments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicDocumentsRepository extends JpaRepository<ElectronicDocuments,Long>
{
}
