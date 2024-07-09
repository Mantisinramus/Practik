package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SWBICSDTO
{
    @JsonProperty("SWBIC")
    private String swbic;
}
