package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes2.dex */
public abstract class Vd {
    private final String a;

    public static final class a {
        public static final int a = (int) TimeUnit.SECONDS.toMillis(30);
    }

    public Vd(String str) {
        this.a = str;
    }

    public HttpsURLConnection a() throws IOException {
        HttpsURLConnection httpsURLConnectionA = P0.i().x().a(this.a);
        int i = a.a;
        httpsURLConnectionA.setConnectTimeout(i);
        httpsURLConnectionA.setReadTimeout(i);
        httpsURLConnectionA.setDoInput(true);
        httpsURLConnectionA.setRequestProperty("Accept", "application/json");
        httpsURLConnectionA.setRequestProperty("User-Agent", B2.c("com.yandex.mobile.metrica.sdk"));
        return httpsURLConnectionA;
    }
}
