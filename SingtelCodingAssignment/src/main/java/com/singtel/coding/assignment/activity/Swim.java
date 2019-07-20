package com.singtel.coding.assignment.activity;

import com.singtel.coding.assignment.constants.ActivityConstants;

public interface Swim {
	default void swim(boolean can) {
		if (can) {
			System.out.println(ActivityConstants.I_AM_SWIMMING);

		} else {
			System.out.println(ActivityConstants.I_CANNOT_SWIM);
		}
	}
}
