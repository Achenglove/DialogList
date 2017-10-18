package com.ccr.dialoglist.dialog;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.ccr.achengdialoglibrary.animation.FlipEnter.FlipVerticalSwingEnter;
import com.ccr.achengdialoglibrary.dialog.widget.base.TopBaseDialog;
import com.ccr.dialoglist.R;
import com.ccr.dialoglist.util.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ShareTopDialog extends TopBaseDialog<ShareTopDialog> {

    @BindView(R.id.ll_wechat_friend_circle)
    LinearLayout mLlWechatFriendCircle;
    @BindView(R.id.ll_wechat_friend)
    LinearLayout mLlWechatFriend;
    @BindView(R.id.ll_qq)
    LinearLayout mLlQq;
    @BindView(R.id.ll_sms)
    LinearLayout mLlSms;

    public ShareTopDialog(Context context, View animateView) {
        super(context, animateView);
    }

    public ShareTopDialog(Context context) {
        super(context);
    }

    @Override
    public View onCreateView() {
        showAnim(new FlipVerticalSwingEnter());
        dismissAnim(null);
        View inflate = View.inflate(mContext, R.layout.dialog_bottom_share, null);
        ButterKnife.bind(this,inflate);
        return inflate;
    }

    @Override
    public void setUiBeforShow() {
        mLlWechatFriendCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showToast("朋友圈");
                dismiss();
            }
        });
        mLlWechatFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showToast("微信");
                dismiss();
            }
        });
        mLlQq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showToast("QQ");
                dismiss();
            }
        });
        mLlSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showToast("短信");
                dismiss();
            }
        });
    }
}
