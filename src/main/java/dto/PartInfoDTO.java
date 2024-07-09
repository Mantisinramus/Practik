package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PartInfoDTO
{
    @JsonProperty("PartNo")
    private Integer partNo;

    @JsonProperty("PartQuantity")
    private Integer partQuantity;

    @JsonProperty("PartAggregateID")
    private String partAggregateID;
}
