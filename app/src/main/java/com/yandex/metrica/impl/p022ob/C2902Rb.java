package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2878Qb;
import java.io.Closeable;
import java.io.InputStream;
import javax.net.ssl.HttpsURLConnection;
import p000.BP0;
import p000.NP1;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Rb */
/* loaded from: classes2.dex */
public final class C2902Rb {

    /* renamed from: a */
    private final C2828Ob f22122a;

    /* renamed from: b */
    private final C2878Qb f22123b;

    public C2902Rb(C2828Ob c2828Ob, C2878Qb c2878Qb) {
        this.f22122a = c2828Ob;
        this.f22123b = c2878Qb;
    }

    /* renamed from: a */
    public final void m14995a() {
        int i;
        InputStream inputStream;
        Throwable th;
        int responseCode;
        HttpsURLConnection httpsURLConnectionM14699a = this.f22122a.m14699a();
        if (httpsURLConnectionM14699a == null) {
            this.f22123b.m14840a();
            return;
        }
        InputStream inputStream2 = null;
        try {
            httpsURLConnectionM14699a.connect();
            responseCode = httpsURLConnectionM14699a.getResponseCode();
        } catch (Throwable th2) {
            i = 0;
            inputStream = null;
            th = th2;
        }
        try {
            inputStream2 = httpsURLConnectionM14699a.getInputStream();
            O90.m5967e(inputStream2, "inputStream");
            int length = NP1.m5672f(inputStream2).length;
            httpsURLConnectionM14699a.disconnect();
            C2968U2.m15241a((Closeable) inputStream2);
            this.f22123b.m14841a(new C2878Qb.a(responseCode == 200, responseCode, length, null, 8));
        } catch (Throwable th3) {
            th = th3;
            inputStream = inputStream2;
            i = responseCode;
            try {
                this.f22123b.m14841a(new C2878Qb.a(false, i, 0, BP0.f799a.mo3846b(th.getClass()).mo2808f() + ": " + th.getLocalizedMessage(), 5));
            } finally {
                httpsURLConnectionM14699a.disconnect();
                C2968U2.m15241a((Closeable) inputStream);
            }
        }
    }
}
