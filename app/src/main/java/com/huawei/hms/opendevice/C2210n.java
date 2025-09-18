package com.huawei.hms.opendevice;

import android.text.TextUtils;

/* renamed from: com.huawei.hms.opendevice.n */
/* loaded from: classes.dex */
public class C2210n {
    /* renamed from: a */
    public static boolean m12390a(String... strArr) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }
}
