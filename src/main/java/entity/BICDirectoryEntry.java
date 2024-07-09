package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "BICDirectoryEntry")
@Getter
@Setter
public class BICDirectoryEntry implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edNo")
    private Long edNo;
    @Column(name = "bic")
    private String bic;
    @Column(name = "change_type")
    private String changeType;

    @ManyToOne
    @JoinColumn(name = "edNo")
    private ElectronicDocuments electronicDocuments;
}
