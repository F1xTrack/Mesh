package com.huawei.hms.push;

import android.app.Notification;
import android.text.TextUtils;

/* renamed from: com.huawei.hms.push.j */
/* loaded from: classes.dex */
public class C2224j {
    /* renamed from: a */
    public static EnumC2225k m12453a(C2229o c2229o) {
        EnumC2225k enumC2225k = EnumC2225k.STYLE_DEFAULT;
        return (c2229o.m12507v() < 0 || c2229o.m12507v() >= EnumC2225k.values().length) ? enumC2225k : EnumC2225k.values()[c2229o.m12507v()];
    }

    /* renamed from: a */
    public static void m12454a(Notification.Builder builder, String str, C2229o c2229o) {
        Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
        if (!TextUtils.isEmpty(c2229o.m12494g())) {
            bigTextStyle.setBigContentTitle(c2229o.m12494g());
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            bigTextStyle.bigText(str);
        }
        builder.setStyle(bigTextStyle);
    }
}
