package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PartInfo")
@Getter
@Setter
public class PartInfo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edNo")
    private Long edNo;
    @Column(name = "partNo")
    private Integer partNo;
    @Column(name = "partQuantity")
    private Integer partQuantity;
    @Column(name = "partAggregateID")
    private String partAggregateID;

    @ManyToOne
    @MapsId
    @JoinColumn(name = "edNo")
    private ElectronicDocuments electronicDocuments;
}
