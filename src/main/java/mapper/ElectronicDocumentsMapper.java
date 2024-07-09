package mapper;


import dto.ElectronicDocumentsDTO;
import entity.ElectronicDocuments;
import org.springframework.beans.BeanUtils;

public class ElectronicDocumentsMapper {

    public static ElectronicDocumentsDTO toDTO(ElectronicDocuments entity)
    {
        if (entity == null)
        {
            return null;
        }
        ElectronicDocumentsDTO dto = new ElectronicDocumentsDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public static ElectronicDocuments toEntity(ElectronicDocumentsDTO dto)
    {
        if (dto == null)
        {
            return null;
        }
        ElectronicDocuments entity = new ElectronicDocuments();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
