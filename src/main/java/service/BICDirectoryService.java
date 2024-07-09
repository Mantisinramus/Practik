package service;

import dto.BICDirectoryEntryDTO;
import entity.BICDirectoryEntry;
import jakarta.persistence.EntityNotFoundException;
import mapper.BICDirectoryMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import repository.BICDirectoryEntryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BICDirectoryService
{
    private final BICDirectoryEntryRepository BICDirectoryEntryRepository;



    public BICDirectoryService(BICDirectoryEntryRepository BICDirectoryEntryRepository) {
        this.BICDirectoryEntryRepository = BICDirectoryEntryRepository;
    }

    public BICDirectoryEntryDTO createBICDirectoryEntry(BICDirectoryEntryDTO BICDirectoryEntryDTO) {
        BICDirectoryEntry entity = BICDirectoryMapper.toEntity(BICDirectoryEntryDTO);
        entity = BICDirectoryEntryRepository.save(entity);
        return BICDirectoryMapper.toDTO(entity);
    }

    public BICDirectoryEntryDTO getBICDirectoryEntry(Long id) {
        BICDirectoryEntry entity = BICDirectoryEntryRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        return BICDirectoryMapper.toDTO(entity);
    }

    public List<BICDirectoryEntryDTO> getAllBICDirectoryEntry() {
        List<BICDirectoryEntry> entities = BICDirectoryEntryRepository.findAll();
        return entities.stream().map(BICDirectoryMapper::toDTO).collect(Collectors.toList());
    }
    public BICDirectoryEntryDTO updateBICDirectoryEntry(Long id, BICDirectoryEntryDTO BICDirectoryEntryDTO) {
        BICDirectoryEntry entity = BICDirectoryEntryRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        BeanUtils.copyProperties(BICDirectoryEntryDTO, entity);
        entity = BICDirectoryEntryRepository.save(entity);
        return BICDirectoryMapper.toDTO(entity);
    }

    public void deleteBICDirectoryEntry(Long edNo) {
        BICDirectoryEntryRepository.deleteById(edNo);
    }


}
