package entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "ElectronicDocuments")
@Getter
@Setter
public class ElectronicDocuments
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edNo")
    private Long edNo;
    @Column(name = "xmlns")
    private String xmlns;
    @Column(name = "edDate")
    @Temporal(TemporalType.DATE)
    private Date edDate;
    @Column(name = "edAuthor")
    private String edAuthor;
    @Column(name = "edReceiver")
    private String edReceiver;
    @Column(name = "creationReason")
    private String creationReason;
    @Column(name = "creationDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDateTime;
    @Column(name = "infoTypeCode")
    private String infoTypeCode;
    @Column(name = "businessDay")
    @Temporal(TemporalType.DATE)
    private Date businessDay;

    @Column(name = "directoryVersion")
    private Integer directoryVersion;
    @OneToMany(mappedBy = "electronicDocuments", cascade = CascadeType.ALL)
    private List<PartInfo> partInfos;
    @OneToMany(mappedBy = "electronicDocuments", cascade = CascadeType.ALL)
    private List<InitialED> initialEDs;
    @OneToMany(mappedBy = "electronicDocuments", cascade = CascadeType.ALL)
    private List<BICDirectoryEntry> bicDirectoryEntries;
    @OneToMany(mappedBy = "electronicDocuments", cascade = CascadeType.ALL)
    private List<ParticipantInfo> participantInfos;


}
