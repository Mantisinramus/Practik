package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Restrictions")
@Getter
@Setter
public class Restrictions
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "rstr")
    private String rstr;
    @Column(name = "rstrDate")
    @Temporal(TemporalType.DATE)
    private Date rstrDate;
    @ManyToOne
    @JoinColumn(name = "participant_id")
    private ParticipantInfo participantInfo;
}
