package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes2.dex */
public final class Zd {
    private boolean a = true;
    private final Context b;
    private final Yd c;
    private final Xd d;

    public Zd(Context context, Yd yd, Xd xd) {
        this.b = context;
        this.c = yd;
        this.d = xd;
    }

    public void a(Qi qi) {
        Boolean bool = qi.f().y;
        this.a = bool != null ? bool.booleanValue() : true;
    }

    public final HttpsURLConnection a(String str) throws IOException {
        this.c.getClass();
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        if (!(uRLConnection instanceof HttpsURLConnection)) {
            uRLConnection = null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        if (httpsURLConnection == null) {
            return null;
        }
        if (this.a) {
            this.d.getClass();
        }
        return httpsURLConnection;
    }
}
