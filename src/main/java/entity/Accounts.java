package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Accounts")
@Getter
@Setter
public class Accounts implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "account")
    private String account;
    @Column(name = "regulationAccountType")
    private String regulationAccountType;
    @Column(name = "accountCBDate")
    @Temporal(TemporalType.DATE)
    private Date accountCBDate;
    @Column(name = "cbDateIn")
    @Temporal(TemporalType.DATE)
    private Date cbDateIn;
    @Column(name = "cbDateOut")
    @Temporal(TemporalType.DATE)
    private Date cbDateOut;

    @ManyToOne
    @JoinColumn(name = "participant_id")
    private ParticipantInfo participantInfo;

}
