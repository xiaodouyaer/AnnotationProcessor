package com.chaoya.appapi;

/**
 * Created by LiuChaoya on 2018/2/11 13:59.
 * email  1090969255@qq.com
 * Activity UI查找提供者
 */

import android.app.Activity;
import android.view.View;

public class ActivityViewFinder implements ViewFinder {
    @Override
    public View findView(Object object, int id) {
        return ((Activity) object).findViewById(id);
    }
}
