package service;

import dto.InitialEDDTO;
import entity.InitialED;
import jakarta.persistence.EntityNotFoundException;
import mapper.InitialEDMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import repository.InitialEDRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InitialEDService 
{
    private final InitialEDRepository InitialEDRepository;



    public InitialEDService(InitialEDRepository InitialEDRepository) {
        this.InitialEDRepository = InitialEDRepository;
    }

    public InitialEDDTO createInitialED(InitialEDDTO InitialEDDTO) {
        InitialED entity = InitialEDMapper.toEntity(InitialEDDTO);
        entity = InitialEDRepository.save(entity);
        return InitialEDMapper.toDTO(entity);
    }

    public InitialEDDTO getInitialED(Long id) {
        InitialED entity = InitialEDRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        return InitialEDMapper.toDTO(entity);
    }

    public List<InitialEDDTO> getAllInitialED() {
        List<InitialED> entities = InitialEDRepository.findAll();
        return entities.stream().map(InitialEDMapper::toDTO).collect(Collectors.toList());
    }
    public InitialEDDTO updateInitialED(Long id, InitialEDDTO InitialEDDTO) {
        InitialED entity = InitialEDRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        BeanUtils.copyProperties(InitialEDDTO, entity);
        entity = InitialEDRepository.save(entity);
        return InitialEDMapper.toDTO(entity);
    }

    public void deleteInitialED(Long edNo) {
        InitialEDRepository.deleteById(edNo);
    }


}
