package com.mtx.argservr.model;

import com.mtx.argservr.util.Constants.Tables;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author montexbjeliseo
 */

@Entity
@Table(name = Tables.LINKS)
@Getter
@Setter
@NoArgsConstructor
public class Link {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="project_id", nullable=false)
    private Project project;
}
