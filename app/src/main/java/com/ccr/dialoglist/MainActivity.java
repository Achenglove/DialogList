package com.ccr.dialoglist;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.ccr.achengdialoglibrary.animation.Base.BaseAnimatorSet;
import com.ccr.achengdialoglibrary.animation.BounceEnter.BounceTopEnter;
import com.ccr.achengdialoglibrary.animation.FadeExit.FadeExit;
import com.ccr.achengdialoglibrary.animation.SlideExit.SlideBottomExit;
import com.ccr.achengdialoglibrary.animation.ZoomEnter.ZoomInEnter;
import com.ccr.achengdialoglibrary.dialog.listerner.OnButtonClickListener;
import com.ccr.achengdialoglibrary.dialog.listerner.OnOperClickListener;
import com.ccr.achengdialoglibrary.dialog.widget.dialog.ActionSheetDialog;
import com.ccr.achengdialoglibrary.dialog.widget.dialog.NormalDialog;
import com.ccr.dialoglist.dialog.CustomBaseDialog;
import com.ccr.dialoglist.dialog.ShareBottomDialog;
import com.ccr.dialoglist.dialog.ShareTopDialog;


public class MainActivity extends AppCompatActivity {
    private BaseAnimatorSet bas_in;
    private BaseAnimatorSet bas_out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.custom_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] stringItems = {"我的", "你的", "他的", "她的"};
                final ActionSheetDialog dialog=new ActionSheetDialog(MainActivity.this,stringItems,null);
//                dialog.cancelText("关闭");
                dialog.isTitleShow(true);
//                dialog.cornerRadius(4.0f);
//                dialog.dividerColor(getResources().getColor(R.color.colorPrimary));
//                dialog.itemPressColor(getResources().getColor(R.color.colorAccent));
//                dialog.itemTextColor(getResources().getColor(R.color.colorPrimaryDark));

//                dialog.lvBgColor(getResources().getColor(R.color.colorPrimary));
                dialog.title("选择图片");
                dialog.showAnim(new ZoomInEnter());
                dialog.dismissAnim(new FadeExit());
                dialog.setOnOperItemClickListener(new OnOperClickListener() {
                    @Override
                    public void onOperItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position){
                            case 0:
                                Toast.makeText(MainActivity.this,stringItems[position],Toast.LENGTH_LONG).show();
                                break;
                            case 1:
                                Toast.makeText(MainActivity.this,stringItems[position],Toast.LENGTH_LONG).show();
                                break;
                            case 2:
                                Toast.makeText(MainActivity.this,stringItems[position],Toast.LENGTH_LONG).show();
                                break;
                            case 3:
                                Toast.makeText(MainActivity.this,stringItems[position],Toast.LENGTH_LONG).show();
                                break;

                        }
                        dialog.dismiss();
                    }
                });
                dialog.show();


            }
        });


        findViewById(R.id.share_dialog_buttom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ShareBottomDialog(MainActivity.this).show();

            }
        });

        findViewById(R.id.share_dialog_top).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ShareTopDialog(MainActivity.this).show();

            }
        });
        findViewById(R.id.dialog_center).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CustomBaseDialog(MainActivity.this).show();

            }
        });
        findViewById(R.id.exit_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bas_in = new BounceTopEnter();
                bas_out = new SlideBottomExit();
                final NormalDialog dialog = new NormalDialog(MainActivity.this);
                dialog.content("亲,真的要走吗?再看会儿吧~(●—●)")//
                        .style(NormalDialog.STYLE_TWO)//
                        .titleTextSize(23)//
                        .btnText("继续逛逛", "残忍退出")//
                        .btnTextColor(Color.parseColor("#383838"), Color.parseColor("#D4D4D4"))//
                        .btnTextSize(16f, 16f)//
                        .showAnim(bas_in)//
                        .dismissAnim(bas_out)//
                        .show();

                dialog.setOnButtonClickListener(
                        new OnButtonClickListener() {
                            @Override
                            public void onButtonClick() {
                                dialog.dismiss();
                            }
                        },
                        new OnButtonClickListener() {
                            @Override
                            public void onButtonClick() {
                                dialog.superDismiss();
                                finish();
                            }
                        });

            }
        });
    }
}
