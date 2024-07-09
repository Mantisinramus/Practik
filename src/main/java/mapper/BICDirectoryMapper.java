package mapper;


import dto.BICDirectoryEntryDTO;
import entity.BICDirectoryEntry;
import org.springframework.beans.BeanUtils;


public class BICDirectoryMapper
{
    public static BICDirectoryEntryDTO toDTO(BICDirectoryEntry entity)
    {
        if (entity == null)
        {
            return null;
        }
        BICDirectoryEntryDTO dto = new BICDirectoryEntryDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public static BICDirectoryEntry toEntity(BICDirectoryEntryDTO dto)
    {
        if (dto == null)
        {
            return null;
        }
        BICDirectoryEntry entity = new BICDirectoryEntry();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
