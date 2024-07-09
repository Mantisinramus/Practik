package mapper;

import dto.AccountsDTO;
import entity.Accounts;
import org.springframework.beans.BeanUtils;


public class AccountsMapper
{

    public static AccountsDTO toDTO(Accounts entity)
    {
        if (entity == null)
        {
            return null;
        }
        AccountsDTO dto = new AccountsDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public static Accounts toEntity(AccountsDTO dto)
    {
        if (dto == null)
        {
            return null;
        }
        Accounts entity = new Accounts();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
