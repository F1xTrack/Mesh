package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.AbstractC3004Vd;
import javax.net.ssl.HttpsURLConnection;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Ob */
/* loaded from: classes2.dex */
public final class C2828Ob {

    /* renamed from: a */
    private final C3654ui f21863a;

    public C2828Ob(C3654ui c3654ui) {
        this.f21863a = c3654ui;
    }

    /* renamed from: a */
    public final HttpsURLConnection m14699a() {
        HttpsURLConnection httpsURLConnectionM15540a;
        String strM16927c = this.f21863a.m16927c();
        try {
            C2842P0 c2842p0M14728i = C2842P0.m14728i();
            O90.m5967e(c2842p0M14728i, "GlobalServiceLocator.getInstance()");
            httpsURLConnectionM15540a = c2842p0M14728i.m14753x().m15540a(strM16927c);
        } catch (Throwable unused) {
            httpsURLConnectionM15540a = null;
        }
        if (httpsURLConnectionM15540a == null) {
            return null;
        }
        httpsURLConnectionM15540a.setInstanceFollowRedirects(true);
        int i = AbstractC3004Vd.a.f22536a;
        httpsURLConnectionM15540a.setConnectTimeout(i);
        httpsURLConnectionM15540a.setReadTimeout(i);
        httpsURLConnectionM15540a.setUseCaches(false);
        return httpsURLConnectionM15540a;
    }
}
