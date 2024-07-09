package dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class RestrictionsDTO
{
    @JsonProperty("Rstr")
    private String rstr;

    @JsonProperty("RstrDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date rstrDate;
}
