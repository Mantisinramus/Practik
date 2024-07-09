package dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@JsonRootName(value = "ElectronicDocuments")
public class ElectronicDocumentsDTO
{
    @JsonProperty("xmlns")
    private String xmlns;
    @JsonProperty("EDNo")
    private Integer edNo;
    @JsonProperty("EDDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date edDate;
    @JsonProperty("EDAuthor")
    private String edAuthor;
    @JsonProperty("EDReceiver")
    private String edReceiver;
    @JsonProperty("CreationReason")
    private String creationReason;
    @JsonProperty("CreationDateTime")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date creationDateTime;
    @JsonProperty("InfoTypeCode")
    private String infoTypeCode;
    @JsonProperty("BusinessDay")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date businessDay;

    @JsonProperty("DirectoryVersion")
    private Integer directoryVersion;
    @JsonProperty("PartInfo")
    private List<PartInfoDTO> partInfos;
    @JsonProperty("InitialED")
    private List<InitialEDDTO> initialEDs;
    @JsonProperty("BICDirectoryEntry")
    private List<BICDirectoryEntryDTO> bicDirectoryEntries;
    @JsonProperty("ParticipantInfo")
    private List<ParticipantInfoDTO> participantInfos;


}
