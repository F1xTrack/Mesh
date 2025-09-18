package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Qb;
import defpackage.BP0;
import defpackage.NP1;
import defpackage.O90;
import java.io.Closeable;
import java.io.InputStream;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes2.dex */
public final class Rb {
    private final Ob a;
    private final Qb b;

    public Rb(Ob ob, Qb qb) {
        this.a = ob;
        this.b = qb;
    }

    public final void a() {
        int i;
        InputStream inputStream;
        Throwable th;
        int responseCode;
        HttpsURLConnection httpsURLConnectionA = this.a.a();
        if (httpsURLConnectionA == null) {
            this.b.a();
            return;
        }
        InputStream inputStream2 = null;
        try {
            httpsURLConnectionA.connect();
            responseCode = httpsURLConnectionA.getResponseCode();
        } catch (Throwable th2) {
            i = 0;
            inputStream = null;
            th = th2;
        }
        try {
            inputStream2 = httpsURLConnectionA.getInputStream();
            O90.e(inputStream2, "inputStream");
            int length = NP1.f(inputStream2).length;
            httpsURLConnectionA.disconnect();
            U2.a((Closeable) inputStream2);
            this.b.a(new Qb.a(responseCode == 200, responseCode, length, null, 8));
        } catch (Throwable th3) {
            th = th3;
            inputStream = inputStream2;
            i = responseCode;
            try {
                this.b.a(new Qb.a(false, i, 0, BP0.a.b(th.getClass()).f() + ": " + th.getLocalizedMessage(), 5));
            } finally {
                httpsURLConnectionA.disconnect();
                U2.a((Closeable) inputStream);
            }
        }
    }
}
