package com.ccr.achengdialoglibrary.dialog.listerner;

import android.view.View;
import android.widget.AdapterView;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-04-12 13:58
 * @Version: V1.0 <描述当前版本功能>
 */

public interface OnOperClickListener {
    void onOperItemClick(AdapterView<?> parent, View view, int position, long id);
}
