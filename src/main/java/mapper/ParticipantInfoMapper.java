package mapper;
import dto.ParticipantInfoDTO;
import entity.ParticipantInfo;
import org.springframework.beans.BeanUtils;


public class ParticipantInfoMapper
{
    public static ParticipantInfoDTO toDTO(ParticipantInfo entity)
    {
        if (entity == null)
        {
            return null;
        }
        ParticipantInfoDTO dto = new ParticipantInfoDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public static ParticipantInfo toEntity(ParticipantInfoDTO dto)
    {
        if (dto == null)
        {
            return null;
        }
        ParticipantInfo entity = new ParticipantInfo();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
