package io.sentry;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.yandex.metrica.C2460e;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;

/* loaded from: classes2.dex */
public final class SpotlightIntegration implements InterfaceC5819Y, InterfaceC6167u1, Closeable {

    /* renamed from: a */
    public C5759D1 f33398a;

    /* renamed from: b */
    public ILogger f33399b = C6166u0.f34658a;

    /* renamed from: c */
    public InterfaceC5796Q f33400c = C6180v0.f34674d;

    /* renamed from: a */
    public static void m21469a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
    }

    /* renamed from: c */
    public static HttpURLConnection m21470c(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(URI.create(str).toURL().openConnection()));
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33400c.mo13812e(0L);
        C5759D1 c5759d1 = this.f33398a;
        if (c5759d1 == null || c5759d1.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f33398a.setBeforeEnvelopeCallback(null);
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        this.f33398a = c5759d1;
        this.f33399b = c5759d1.getLogger();
        if (c5759d1.getBeforeEnvelopeCallback() != null || !c5759d1.isEnableSpotlight()) {
            this.f33399b.mo21407k(EnumC6069n1.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f33400c = new C2460e(4, false);
        c5759d1.setBeforeEnvelopeCallback(this);
        this.f33399b.mo21407k(EnumC6069n1.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
    }
}
