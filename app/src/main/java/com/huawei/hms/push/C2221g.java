package com.huawei.hms.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huawei.hms.support.log.HMSLog;

/* renamed from: com.huawei.hms.push.g */
/* loaded from: classes.dex */
public class C2221g {
    /* renamed from: a */
    public static int m12446a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return activeNetworkInfo.getType();
        }
        HMSLog.m12622i("NetworkUtil", "no connected network");
        return -1;
    }
}
