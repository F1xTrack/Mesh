package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.yandex.metrica.impl.ob.lh */
/* loaded from: classes2.dex */
public class C3419lh implements InterfaceC3471nh<C3284gc> {
    /* renamed from: a */
    public void m16420a(Uri.Builder builder, C3284gc c3284gc) {
        m16419a(builder, CommonUrlParts.ADV_ID, CommonUrlParts.LIMIT_AD_TRACKING, c3284gc.m15990a().f23129a);
        m16419a(builder, CommonUrlParts.HUAWEI_OAID, CommonUrlParts.HUAWEI_OAID_LIMIT_TRACKING, c3284gc.m15991b().f23129a);
        m16419a(builder, CommonUrlParts.YANDEX_ADV_ID, CommonUrlParts.YANDEX_ADV_ID_LIMIT_TRACKING, c3284gc.m15992c().f23129a);
    }

    /* renamed from: a */
    private void m16419a(Uri.Builder builder, String str, String str2, C3128ac c3128ac) {
        String str3 = "";
        if (c3128ac == null) {
            builder.appendQueryParameter(str, "");
            builder.appendQueryParameter(str2, "");
            return;
        }
        builder.appendQueryParameter(str, C2819O2.m14688b(c3128ac.f23041b));
        Boolean bool = c3128ac.f23042c;
        if (bool != null) {
            str3 = bool.booleanValue() ? "1" : "0";
        }
        builder.appendQueryParameter(str2, str3);
    }
}
