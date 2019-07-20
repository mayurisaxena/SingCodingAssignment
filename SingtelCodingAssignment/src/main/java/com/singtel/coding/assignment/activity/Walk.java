package com.singtel.coding.assignment.activity;

import com.singtel.coding.assignment.constants.ActivityConstants;

public interface Walk {

	default void walk(boolean can) {
		if (can) {
			System.out.println(ActivityConstants.I_AM_WALKING);

		} else {
			System.out.println(ActivityConstants.I_CANNOT_WALK);
		}
	}
}
