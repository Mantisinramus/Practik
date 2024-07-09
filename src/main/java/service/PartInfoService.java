package service;

import dto.PartInfoDTO;
import entity.PartInfo;
import jakarta.persistence.EntityNotFoundException;
import mapper.PartInfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import repository.PartInfoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartInfoService 
{
    private final PartInfoRepository PartInfoRepository;



    public PartInfoService(PartInfoRepository PartInfoRepository) {
        this.PartInfoRepository = PartInfoRepository;
    }

    public PartInfoDTO createPartInfo(PartInfoDTO PartInfoDTO) {
        PartInfo entity = PartInfoMapper.toEntity(PartInfoDTO);
        entity = PartInfoRepository.save(entity);
        return PartInfoMapper.toDTO(entity);
    }

    public PartInfoDTO getPartInfo(Long id) {
        PartInfo entity = PartInfoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        return PartInfoMapper.toDTO(entity);
    }

    public List<PartInfoDTO> getAllPartInfo() {
        List<PartInfo> entities = PartInfoRepository.findAll();
        return entities.stream().map(PartInfoMapper::toDTO).collect(Collectors.toList());
    }
    public PartInfoDTO updatePartInfo(Long id, PartInfoDTO PartInfoDTO) {
        PartInfo entity = PartInfoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        BeanUtils.copyProperties(PartInfoDTO, entity);
        entity = PartInfoRepository.save(entity);
        return PartInfoMapper.toDTO(entity);
    }

    public void deletePartInfo(Long id) {
        PartInfoRepository.deleteById(id);
    }

}
