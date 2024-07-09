package service;

import dto.SWBICSDTO;
import entity.SWBICS;
import jakarta.persistence.EntityNotFoundException;
import mapper.SWBICSMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import repository.SWBICSRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SWBICSService
{
    private final SWBICSRepository SWBICSRepository;



    public SWBICSService(SWBICSRepository SWBICSRepository) {
        this.SWBICSRepository = SWBICSRepository;
    }

    public SWBICSDTO createSWBICS(SWBICSDTO SWBICSDTO) {
        SWBICS entity = SWBICSMapper.toEntity(SWBICSDTO);
        entity = SWBICSRepository.save(entity);
        return SWBICSMapper.toDTO(entity);
    }

    public SWBICSDTO getSWBICS(Integer id) {
        SWBICS entity = SWBICSRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        return SWBICSMapper.toDTO(entity);
    }

    public List<SWBICSDTO> getAllSWBICS() {
        List<SWBICS> entities = SWBICSRepository.findAll();
        return entities.stream().map(SWBICSMapper::toDTO).collect(Collectors.toList());
    }
    public SWBICSDTO updateSWBICS(Integer id, SWBICSDTO SWBICSDTO) {
        SWBICS entity = SWBICSRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        BeanUtils.copyProperties(SWBICSDTO, entity);
        entity = SWBICSRepository.save(entity);
        return SWBICSMapper.toDTO(entity);
    }

    public void deleteSWBICS(Integer id) {
        SWBICSRepository.deleteById(id);
    }
}
