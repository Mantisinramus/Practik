package dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BICDirectoryEntryDTO
{
    @JsonProperty("BIC")
    private String bic;

    @JsonProperty("ChangeType")
    private String ChangeType;
}
