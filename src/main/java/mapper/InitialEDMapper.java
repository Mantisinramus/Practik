package mapper;

import dto.InitialEDDTO;
import entity.InitialED;
import org.springframework.beans.BeanUtils;

public class InitialEDMapper
{
    public static InitialEDDTO toDTO(InitialED entity)
    {
        if (entity == null)
        {
            return null;
        }
        InitialEDDTO dto = new InitialEDDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public static InitialED toEntity(InitialEDDTO dto)
    {
        if (dto == null)
        {
            return null;
        }
        InitialED entity = new InitialED();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
