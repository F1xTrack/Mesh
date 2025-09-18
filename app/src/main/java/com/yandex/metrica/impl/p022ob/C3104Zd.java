package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.yandex.metrica.impl.ob.Zd */
/* loaded from: classes2.dex */
public final class C3104Zd {

    /* renamed from: a */
    private boolean f22953a = true;

    /* renamed from: b */
    private final Context f22954b;

    /* renamed from: c */
    private final C3079Yd f22955c;

    /* renamed from: d */
    private final C3054Xd f22956d;

    public C3104Zd(Context context, C3079Yd c3079Yd, C3054Xd c3054Xd) {
        this.f22954b = context;
        this.f22955c = c3079Yd;
        this.f22956d = c3054Xd;
    }

    /* renamed from: a */
    public void m15541a(C2885Qi c2885Qi) {
        Boolean bool = c2885Qi.m14880f().f24732y;
        this.f22953a = bool != null ? bool.booleanValue() : true;
    }

    /* renamed from: a */
    public final HttpsURLConnection m15540a(String str) throws IOException {
        this.f22955c.getClass();
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        if (!(uRLConnection instanceof HttpsURLConnection)) {
            uRLConnection = null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        if (httpsURLConnection == null) {
            return null;
        }
        if (this.f22953a) {
            this.f22956d.getClass();
        }
        return httpsURLConnection;
    }
}
