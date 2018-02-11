package com.chaoya.appapi;

/**
 * Created by LiuChaoya on 2018/2/11 13:55.
 * email  1090969255@qq.com
 * UI绑定解绑接口
 * @param <T>
 */

public interface ViewBinder<T> {

    void bindView(T host, Object object, ViewFinder finder);

    void unBindView(T host);
}
