package mapper;

import dto.SWBICSDTO;
import entity.SWBICS;
import org.springframework.beans.BeanUtils;
;
public class SWBICSMapper
{
    public static SWBICSDTO toDTO(SWBICS entity)
    {
        if (entity == null)
        {
            return null;
        }
        SWBICSDTO dto = new SWBICSDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public static SWBICS toEntity(SWBICSDTO dto)
    {
        if (dto == null)
        {
            return null;
        }
        SWBICS entity = new SWBICS();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }   
}
