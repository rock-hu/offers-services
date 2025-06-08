package com.openbanking.offers.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * OBReadOffer1DataOffer
 */
@Getter
@Setter
public class OBReadOffer1DataOffer implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Offer type, in a coded form.
	 */
	public enum OfferTypeEnum {
		BALANCETRANSFER("BalanceTransfer"),

		LIMITINCREASE("LimitIncrease"),

		MONEYTRANSFER("MoneyTransfer"),

		OTHER("Other"),

		PROMOTIONALRATE("PromotionalRate");

		private String value;

		OfferTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static OfferTypeEnum fromValue(String text) {
			for (OfferTypeEnum b : OfferTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
