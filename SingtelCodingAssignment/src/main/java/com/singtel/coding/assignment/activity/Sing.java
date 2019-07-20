package com.singtel.coding.assignment.activity;

import com.singtel.coding.assignment.constants.ActivityConstants;

public interface Sing {
	default void sing(boolean can) {
		if (can) {
			System.out.println(ActivityConstants.I_AM_SINGING);

		} else {
			System.out.println(ActivityConstants.I_CANNOT_SING);
		}
	}
}
