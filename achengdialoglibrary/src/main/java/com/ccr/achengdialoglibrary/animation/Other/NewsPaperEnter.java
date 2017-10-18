package com.ccr.achengdialoglibrary.animation.Other;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

import com.ccr.achengdialoglibrary.animation.Base.BaseAnimatorSet;

public class NewsPaperEnter extends BaseAnimatorSet {
	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 0.5f, 1f), //
				ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 0.5f, 1f),//
				ObjectAnimator.ofFloat(view, "alpha", 0f, 1f),//
				ObjectAnimator.ofFloat(view, "rotation", 1080, 720, 360, 0));
	}
}
