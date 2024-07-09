package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "InitialED")
@Getter
@Setter
public class InitialED
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edNo")
    private Long edNo;
    @Column(name = "edDate")
    @Temporal(TemporalType.DATE)
    private Date edDate;
    @Column(name = "edAuthor")
    private String edAuthor;
    @Column(name = "edParentNo")
    private Integer edParentNo;

    @ManyToOne
    @MapsId
    @JoinColumn(name = "edNo")
    private ElectronicDocuments electronicDocuments;
}
