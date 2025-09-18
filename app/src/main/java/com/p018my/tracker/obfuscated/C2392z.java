package com.p018my.tracker.obfuscated;

import android.content.Intent;
import android.net.Uri;

/* renamed from: com.my.tracker.obfuscated.z */
/* loaded from: classes2.dex */
public final class C2392z {

    /* renamed from: a */
    private final C2313f0 f20167a;

    private C2392z(C2313f0 c2313f0) {
        this.f20167a = c2313f0;
    }

    /* renamed from: a */
    public String m13576a(Intent intent) {
        AbstractC2391y2.m13568a("DeeplinkHandler: handling deeplink");
        if (intent == null) {
            AbstractC2391y2.m13568a("DeeplinkHandler: intent is null");
            return null;
        }
        try {
            Uri data = intent.getData();
            if (data == null) {
                AbstractC2391y2.m13568a("DeeplinkHandler: intent data is null");
                return null;
            }
            AbstractC2391y2.m13568a("DeeplinkHandler: intent data: " + data);
            String queryParameter = data.getQueryParameter("mt_deeplink");
            String queryParameter2 = data.getQueryParameter("mt_click_id");
            if (queryParameter != null) {
                AbstractC2391y2.m13568a("DeeplinkHandler: found mt_deeplink in intent");
            } else {
                AbstractC2391y2.m13568a("DeeplinkHandler: mt_deeplink not found in intent");
                queryParameter = data.toString();
            }
            AbstractC2391y2.m13568a("DeeplinkHandler: deeplink " + queryParameter);
            AbstractC2391y2.m13568a("DeeplinkHandler: clickId " + queryParameter2);
            this.f20167a.m13062a(queryParameter, queryParameter2);
            return queryParameter;
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("DeeplinkHandler error: ", th);
            return null;
        }
    }

    /* renamed from: a */
    public static C2392z m13575a(C2313f0 c2313f0) {
        return new C2392z(c2313f0);
    }
}
