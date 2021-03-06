package cn.saiyi.doorlock.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.saiyi.framework.activity.AbsBaseActivity;

import cn.saiyi.doorlock.R;
import cn.saiyi.doorlock.other.Constant;

/**
 * 描述：关于我们
 * 创建作者：黎丝军
 * 创建时间：2016/10/27 17:09
 */

public class AboutActivity extends AbsBaseActivity {

    @Override
    public void onContentView() {
        setContentView(R.layout.activity_about);
    }

    @Override
    public void findViews() {

    }

    @Override
    public void initObjects() {

    }

    @Override
    public void initData(Bundle savedInstanceState) {
        setTitle(R.string.setting_about_us);
        setTitleSize(Constant.TEXT_SIZE);
        setActionBarBackgroundColor(Color.WHITE);
        setTitleColor(R.color.color7);
        actionBar.setLeftButtonBackground(R.mipmap.ic_blue_back,25,25);
    }

    @Override
    public void setListeners() {
        actionBar.setLeftClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected boolean isActionBar() {
        return true;
    }
}
