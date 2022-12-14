package gov.epa.analyticalqc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="amenability_predictions")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class AmenabilityPrediction {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
	@JoinColumn(name="substance_id")
	private Substance substance;

    @Column(name="lcms_amen_neg")
    private Double lcmsAmenNeg;

    @Column(name="lcms_amen_pos")
    private Double lcmsAmenPos;

    @ManyToOne
	@JoinColumn(name="nmr_amen_flag_id")
    private NmrAmenFlag nmrAmenFlag;

    @Column(name="lcms_amen_neg_true")
    private Boolean lcmsAmenNegTrue;

    @Column(name="lcms_amen_pos_true")
    private Boolean lcmsAmenPosTrue;
    
}
