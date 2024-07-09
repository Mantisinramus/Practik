package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ParticipantInfo")
@Getter
@Setter
public class ParticipantInfo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer ID;
    @Column(name = "nameP")
    private String nameP;
    @Column(name = "engName")
    private String engName;
    @Column(name = "regN")
    private String regN;
    @Column(name = "cntrCd")
    private String cntrCd;
    @Column(name = "rgn")
    private String rgn;
    @Column(name = "ind")
    private String ind;
    @Column(name = "tnp")
    private String tnp;
    @Column(name = "nnp")
    private String nnp;
    @Column(name = "adr")
    private String adr;
    @Column(name = "prntBIC")
    private String prntBIC;
    @Column(name = "dateIn")
    @Temporal(TemporalType.DATE)
    private Date dateIn;
    @Column(name = "dateOut")
    @Temporal(TemporalType.DATE)
    private Date dateOut;
    @Column(name = "ptType")
    private String ptType;
    @Column(name = "srvcs")
    private String srvcs;
    @Column(name = "xchType")
    private String xchType;
    @Column(name = "uid")
    private String uid;
    @Column(name = "participantStatus")
    private String participantStatus;

    @OneToMany(mappedBy = "participantInfo", cascade = CascadeType.ALL)
    private List<Restrictions> restrictions;

    @OneToMany(mappedBy = "participantInfo", cascade = CascadeType.ALL)
    private List<SWBICS> swbics;

    @OneToMany(mappedBy = "participantInfo", cascade = CascadeType.ALL)
    private List<Accounts> accounts;

    @ManyToOne
    @MapsId
    @JoinColumn(name = "edNo")
    private ElectronicDocuments electronicDocuments;
}
