package gov.epa.analyticalqc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="experiment_annotations")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ExperimentAnnotation {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
	@JoinColumn(name="experiment_id")
	private Experiment experiment;

    private String annotation;
    
}
