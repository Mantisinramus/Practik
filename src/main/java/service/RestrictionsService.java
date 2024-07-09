package service;

import dto.RestrictionsDTO;
import entity.Restrictions;
import jakarta.persistence.EntityNotFoundException;
import mapper.RestrictionsMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import repository.RestrictionsRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestrictionsService
{
    private final RestrictionsRepository RestrictionsRepository;



    public RestrictionsService(RestrictionsRepository RestrictionsRepository) {
        this.RestrictionsRepository = RestrictionsRepository;
    }

    public RestrictionsDTO createRestrictions(RestrictionsDTO RestrictionsDTO) {
        Restrictions entity = RestrictionsMapper.toEntity(RestrictionsDTO);
        entity = RestrictionsRepository.save(entity);
        return RestrictionsMapper.toDTO(entity);
    }

    public RestrictionsDTO getRestrictions(Integer id) {
        Restrictions entity = RestrictionsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        return RestrictionsMapper.toDTO(entity);
    }

    public List<RestrictionsDTO> getAllRestrictions() {
        List<Restrictions> entities = RestrictionsRepository.findAll();
        return entities.stream().map(RestrictionsMapper::toDTO).collect(Collectors.toList());
    }
    public RestrictionsDTO updateRestrictions(Integer id, RestrictionsDTO RestrictionsDTO) {
        Restrictions entity = RestrictionsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        BeanUtils.copyProperties(RestrictionsDTO, entity);
        entity = RestrictionsRepository.save(entity);
        return RestrictionsMapper.toDTO(entity);
    }

    public void deleteRestrictions(Integer id) {
        RestrictionsRepository.deleteById(id);
    }
}
