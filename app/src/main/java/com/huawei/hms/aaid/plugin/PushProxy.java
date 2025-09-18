package com.huawei.hms.aaid.plugin;

import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface PushProxy {
    void deleteAllToken(Context context) throws ApiException;

    void deleteToken(Context context, String str, String str2) throws ApiException;

    JSONObject getPlatform();

    String getProxyType();

    void getToken(Context context, String str, String str2) throws ApiException;

    Task subscribe(Context context, String str, String str2);

    Task turnOff(Context context, String str);

    Task turnOn(Context context, String str);

    Task unsubscribe(Context context, String str, String str2);
}
