package dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class InitialEDDTO
{
    @JsonProperty("EDNo")
    private Integer edNo;
    @JsonProperty("EDDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date edDate;
    @JsonProperty("EDAuthor")
    private String edAuthor;
    @JsonProperty("EDReceiver")
    private Integer edParentNo;
}
