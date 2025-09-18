package com.yandex.metrica.impl.p022ob;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.yandex.metrica.impl.ob.Vd */
/* loaded from: classes2.dex */
public abstract class AbstractC3004Vd {

    /* renamed from: a */
    private final String f22535a;

    /* renamed from: com.yandex.metrica.impl.ob.Vd$a */
    public static final class a {

        /* renamed from: a */
        public static final int f22536a = (int) TimeUnit.SECONDS.toMillis(30);
    }

    public AbstractC3004Vd(String str) {
        this.f22535a = str;
    }

    /* renamed from: a */
    public HttpsURLConnection m15307a() throws IOException {
        HttpsURLConnection httpsURLConnectionM15540a = C2842P0.m14728i().m14753x().m15540a(this.f22535a);
        int i = a.f22536a;
        httpsURLConnectionM15540a.setConnectTimeout(i);
        httpsURLConnectionM15540a.setReadTimeout(i);
        httpsURLConnectionM15540a.setDoInput(true);
        httpsURLConnectionM15540a.setRequestProperty("Accept", "application/json");
        httpsURLConnectionM15540a.setRequestProperty("User-Agent", C2494B2.m13914c("com.yandex.mobile.metrica.sdk"));
        return httpsURLConnectionM15540a;
    }
}
