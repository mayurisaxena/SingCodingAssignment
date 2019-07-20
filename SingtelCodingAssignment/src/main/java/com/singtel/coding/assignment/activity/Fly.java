package com.singtel.coding.assignment.activity;

import com.singtel.coding.assignment.constants.ActivityConstants;

public interface Fly {

	default void fly(boolean can) {
		if (can) {
			System.out.println(ActivityConstants.I_AM_FLYING);

		} else {
			System.out.println(ActivityConstants.I_CANNOT_FLY);
		}
	}
}
