package com.ccr.dialoglist.dialog;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.ccr.achengdialoglibrary.animation.Attention.Swing;
import com.ccr.achengdialoglibrary.dialog.utils.CornerUtils;
import com.ccr.achengdialoglibrary.dialog.widget.base.BaseDialog;
import com.ccr.dialoglist.R;
import com.ccr.dialoglist.util.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;


public class CustomBaseDialog extends BaseDialog<CustomBaseDialog> {
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.tv_exit)
    TextView tvExit;

    public CustomBaseDialog(Context context) {
        super(context);
    }

    @Override
    public View onCreateView() {
        widthScale(0.85f);
        showAnim(new Swing());

        // dismissAnim(this, new ZoomOutExit());
        View inflate = View.inflate(mContext, R.layout.dialog_custom_base, null);
        inflate.setBackgroundDrawable(CornerUtils.cornerDrawable(Color.parseColor("#ffffff"), dp2px(5)));
        ButterKnife.bind(this,inflate);
        return inflate;
    }

    @Override
    public void setUiBeforShow() {
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToastUtils.showToast(tvCancel.getText().toString());
                dismiss();
            }
        });
        tvExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showToast(tvExit.getText().toString());
                dismiss();
            }
        });
    }
}
