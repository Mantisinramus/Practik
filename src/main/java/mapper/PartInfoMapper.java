package mapper;


import dto.PartInfoDTO;
import entity.PartInfo;
import org.springframework.beans.BeanUtils;


public class PartInfoMapper
{
    public static PartInfoDTO toDTO(PartInfo entity)
    {
        if (entity == null)
        {
            return null;
        }
        PartInfoDTO dto = new PartInfoDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public static PartInfo toEntity(PartInfoDTO dto)
    {
        if (dto == null)
        {
            return null;
        }
        PartInfo entity = new PartInfo();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

}
