package com.ccr.achengdialoglibrary.animation.FlipExit;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

import com.ccr.achengdialoglibrary.animation.Base.BaseAnimatorSet;

public class FlipVerticalExit extends BaseAnimatorSet {
	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(ObjectAnimator.ofFloat(view, "rotationX", 0, 90),//
				ObjectAnimator.ofFloat(view, "alpha", 1, 0));
	}
}
