package com.yzs.yzsbaseactivity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yzs.yzsbaseactivity.R;
import com.yzs.yzsbaseactivitylib.entity.EventCenter;
import com.yzs.yzsbaseactivitylib.fragment.YzsBaseFragment;


/**
 * Author: 姚智胜
 * Version: V1.0版本
 * Description:
 * Date: 2016/12/15.
 */
public class PersonFragment extends YzsBaseFragment {
    private static final String TAG = "PersonFragment";

    public static PersonFragment newInstance(Bundle bundle) {
        PersonFragment fragment = new PersonFragment();
        if (null != bundle) {
            fragment.setArguments(bundle);
        }
        return fragment;
    }

    @Override
    protected View initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_person, container, false);
        return view;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initLogic() {

    }


    @Override
    protected void getBundleExtras(Bundle bundle) {

    }

    @Override
    protected void onEventComing(EventCenter center) {

    }
}
