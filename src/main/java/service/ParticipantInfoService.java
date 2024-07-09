package service;

import dto.ParticipantInfoDTO;
import entity.ParticipantInfo;
import jakarta.persistence.EntityNotFoundException;
import mapper.ParticipantInfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import repository.ParticipantInfoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParticipantInfoService 
{
    private final ParticipantInfoRepository ParticipantInfoRepository;

    public ParticipantInfoService(ParticipantInfoRepository ParticipantInfoRepository) {
        this.ParticipantInfoRepository = ParticipantInfoRepository;
    }

    public ParticipantInfoDTO createParticipantInfo(ParticipantInfoDTO ParticipantInfoDTO) {
        ParticipantInfo entity = ParticipantInfoMapper.toEntity(ParticipantInfoDTO);
        entity = ParticipantInfoRepository.save(entity);
        return ParticipantInfoMapper.toDTO(entity);
    }

    public ParticipantInfoDTO getParticipantInfo(Integer id) {
        ParticipantInfo entity = ParticipantInfoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        return ParticipantInfoMapper.toDTO(entity);
    }

    public List<ParticipantInfoDTO> getAllParticipantInfo() {
        List<ParticipantInfo> entities = ParticipantInfoRepository.findAll();
        return entities.stream().map(ParticipantInfoMapper::toDTO).collect(Collectors.toList());
    }
    public ParticipantInfoDTO updateParticipantInfo(Integer id, ParticipantInfoDTO ParticipantInfoDTO) {
        ParticipantInfo entity = ParticipantInfoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        BeanUtils.copyProperties(ParticipantInfoDTO, entity);
        entity = ParticipantInfoRepository.save(entity);
        return ParticipantInfoMapper.toDTO(entity);
    }

    public void deleteParticipantInfo(Integer id) {
        ParticipantInfoRepository.deleteById(id);
    }
}
