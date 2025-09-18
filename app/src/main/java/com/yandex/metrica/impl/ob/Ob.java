package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Vd;
import defpackage.O90;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes2.dex */
public final class Ob {
    private final C3131ui a;

    public Ob(C3131ui c3131ui) {
        this.a = c3131ui;
    }

    public final HttpsURLConnection a() {
        HttpsURLConnection httpsURLConnectionA;
        String strC = this.a.c();
        try {
            P0 p0I = P0.i();
            O90.e(p0I, "GlobalServiceLocator.getInstance()");
            httpsURLConnectionA = p0I.x().a(strC);
        } catch (Throwable unused) {
            httpsURLConnectionA = null;
        }
        if (httpsURLConnectionA == null) {
            return null;
        }
        httpsURLConnectionA.setInstanceFollowRedirects(true);
        int i = Vd.a.a;
        httpsURLConnectionA.setConnectTimeout(i);
        httpsURLConnectionA.setReadTimeout(i);
        httpsURLConnectionA.setUseCaches(false);
        return httpsURLConnectionA;
    }
}
