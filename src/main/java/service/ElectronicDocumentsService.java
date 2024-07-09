package service;

import dto.ElectronicDocumentsDTO;
import entity.ElectronicDocuments;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import repository.ElectronicDocumentsRepository;
import mapper.ElectronicDocumentsMapper;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ElectronicDocumentsService
{

    private final ElectronicDocumentsRepository electronicDocumentsRepository;



    public ElectronicDocumentsService(ElectronicDocumentsRepository electronicDocumentsRepository) {
        this.electronicDocumentsRepository = electronicDocumentsRepository;
    }

    public ElectronicDocumentsDTO createElectronicDocument(ElectronicDocumentsDTO electronicDocumentsDTO) {
        ElectronicDocuments entity = ElectronicDocumentsMapper.toEntity(electronicDocumentsDTO);
        entity = electronicDocumentsRepository.save(entity);
        return ElectronicDocumentsMapper.toDTO(entity);
    }

    public ElectronicDocumentsDTO getElectronicDocument(Long id) {
        ElectronicDocuments entity = electronicDocumentsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        return ElectronicDocumentsMapper.toDTO(entity);
    }

    public List<ElectronicDocumentsDTO> getAllElectronicDocuments() {
        List<ElectronicDocuments> entities = electronicDocumentsRepository.findAll();
        return entities.stream().map(ElectronicDocumentsMapper::toDTO).collect(Collectors.toList());
    }
    public ElectronicDocumentsDTO updateElectronicDocument(Long id, ElectronicDocumentsDTO electronicDocumentsDTO) {
        ElectronicDocuments entity = electronicDocumentsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        BeanUtils.copyProperties(electronicDocumentsDTO, entity);
        entity = electronicDocumentsRepository.save(entity);
        return ElectronicDocumentsMapper.toDTO(entity);
    }

    public void deleteElectronicDocuments(Long edNo) {
        electronicDocumentsRepository.deleteById(edNo);
    }


}
