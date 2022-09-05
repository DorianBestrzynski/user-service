package com.zpi.userservice.group;
import com.zpi.userservice.commons.Currency;
import com.zpi.userservice.commons.GroupStage;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Group {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "group_sequence"
    )
    @SequenceGenerator(
            name = "group_sequence",
            sequenceName = "group_sequence", allocationSize = 10)
    @Column(unique = true, nullable = false)
    private Long groupId;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "currency", nullable = false)
    private Currency currency;

    @Column(name = "description", length = 120)
    private String description;

    @Column(name = "votes_limit")
    private Integer votesLimit;

    @Column(name = "start_location", nullable = false, length = 100)
    private String startLocation;

    @Column(name = "group_stage", nullable = false)
    private GroupStage groupStage;


}
