package com.mtx.argservr.model;

import com.mtx.argservr.util.Constants.Tables;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = Tables.EDUCATIONS)
@Getter
@Setter
@NoArgsConstructor
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String institution;
    private String aboutInstitution;
    private Long index_position;
    @CreationTimestamp
    private Timestamp creationDate;
    @UpdateTimestamp
    private Timestamp updateDate;
}
