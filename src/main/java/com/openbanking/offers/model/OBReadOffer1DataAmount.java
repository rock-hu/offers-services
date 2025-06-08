package com.openbanking.offers.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Amount of money associated with the offer type.
 */

@Schema(description = "Amount of money associated with the offer type.")
@Getter
@Setter
public class OBReadOffer1DataAmount implements Serializable {
	private static final long serialVersionUID = 1L;

}
