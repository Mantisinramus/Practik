package mapper;


import dto.RestrictionsDTO;
import entity.Restrictions;
import org.springframework.beans.BeanUtils;

public class RestrictionsMapper
{
    public static RestrictionsDTO toDTO(Restrictions entity)
    {
        if (entity == null)
        {
            return null;
        }
        RestrictionsDTO dto = new RestrictionsDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public static Restrictions toEntity(RestrictionsDTO dto)
    {
        if (dto == null)
        {
            return null;
        }
        Restrictions entity = new Restrictions();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

}
