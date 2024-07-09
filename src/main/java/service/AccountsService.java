package service;
import dto.AccountsDTO;
import entity.Accounts;
import jakarta.persistence.EntityNotFoundException;
import mapper.AccountsMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import repository.AccountsRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountsService 
{
    private final AccountsRepository AccountsRepository;

    public AccountsService(AccountsRepository AccountsRepository) {
        this.AccountsRepository = AccountsRepository;
    }

    public AccountsDTO createAccounts(AccountsDTO AccountsDTO) {
        Accounts entity = AccountsMapper.toEntity(AccountsDTO);
        entity = AccountsRepository.save(entity);
        return AccountsMapper.toDTO(entity);
    }

    public AccountsDTO getAccounts(Integer id) {
        Accounts entity = AccountsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        return AccountsMapper.toDTO(entity);
    }

    public List<AccountsDTO> getAllAccounts() {
        List<Accounts> entities = AccountsRepository.findAll();
        return entities.stream().map(AccountsMapper::toDTO).collect(Collectors.toList());
    }
    public AccountsDTO updateAccounts(Integer id, AccountsDTO AccountsDTO) {
        Accounts entity = AccountsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Electronic Document not found"));
        BeanUtils.copyProperties(AccountsDTO, entity);
        entity = AccountsRepository.save(entity);
        return AccountsMapper.toDTO(entity);
    }

    public void deleteAccounts(Integer id) {
        AccountsRepository.deleteById(id);
    }


}
