package com.yandex.metrica.impl.ob;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.yandex.metrica.impl.ob.lh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2906lh implements InterfaceC2956nh<C2777gc> {
    public void a(Uri.Builder builder, C2777gc c2777gc) {
        a(builder, CommonUrlParts.ADV_ID, CommonUrlParts.LIMIT_AD_TRACKING, c2777gc.a().a);
        a(builder, CommonUrlParts.HUAWEI_OAID, CommonUrlParts.HUAWEI_OAID_LIMIT_TRACKING, c2777gc.b().a);
        a(builder, CommonUrlParts.YANDEX_ADV_ID, CommonUrlParts.YANDEX_ADV_ID_LIMIT_TRACKING, c2777gc.c().a);
    }

    private void a(Uri.Builder builder, String str, String str2, C2627ac c2627ac) {
        String str3 = "";
        if (c2627ac == null) {
            builder.appendQueryParameter(str, "");
            builder.appendQueryParameter(str2, "");
            return;
        }
        builder.appendQueryParameter(str, O2.b(c2627ac.b));
        Boolean bool = c2627ac.c;
        if (bool != null) {
            str3 = bool.booleanValue() ? "1" : "0";
        }
        builder.appendQueryParameter(str2, str3);
    }
}
