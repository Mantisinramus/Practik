package dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ParticipantInfoDTO
{
    @JsonProperty("ID")
    private Integer ID;
    @JsonProperty("NameP")
    private String nameP;

    @JsonProperty("EngName")
    private String engName;

    @JsonProperty("RegN")
    private String regN;

    @JsonProperty("CntrCd")
    private String cntrCd;

    @JsonProperty("Rgn")
    private String rgn;

    @JsonProperty("Ind")
    private String ind;

    @JsonProperty("Tnp")
    private String tnp;

    @JsonProperty("Nnp")
    private String nnp;

    @JsonProperty("Adr")
    private String adr;

    @JsonProperty("PrntBIC")
    private String prntBIC;

    @JsonProperty("DateIn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateIn;

    @JsonProperty("DateOut")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateOut;

    @JsonProperty("PtType")
    private String ptType;

    @JsonProperty("Srvcs")
    private String srvcs;

    @JsonProperty("XchType")
    private String xchType;

    @JsonProperty("UID")
    private String uid;

    @JsonProperty("ParticipantStatus")
    private String participantStatus;

    @JsonProperty("Restrictions")
    private List<RestrictionsDTO> restrictions;
    @JsonProperty("SWBICS")
    private List<SWBICSDTO> swbics;
    @JsonProperty("Accounts")
    private List<AccountsDTO> accounts;





}
