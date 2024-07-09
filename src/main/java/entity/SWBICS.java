package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "SWBICS")
@Getter
@Setter
public class SWBICS
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "swbic")
    private String swbic;

    @ManyToOne
    @JoinColumn(name = "participant_id")
    private ParticipantInfo participantInfo;
}
