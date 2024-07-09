package dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AccountsDTO
{
    @JsonProperty("AccountID")
    private String accountID;

    @JsonProperty("RegulationAccountType")
    private String regulationAccountType;

    @JsonProperty("CBAccount")
    private String cbAccount;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonProperty("AccountCBDate")
    private Date accountCBDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonProperty("CBDateIn")
    private Date cbDateIn;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonProperty("CBDateOut")
    private Date cbDateOut;
}
