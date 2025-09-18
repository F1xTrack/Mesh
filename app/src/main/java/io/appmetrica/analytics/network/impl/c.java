package io.appmetrica.analytics.network.impl;

import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class c implements Call {
    public final NetworkClient a;
    public final Request b;
    public final d c;

    public c(NetworkClient networkClient, Request request, d dVar) {
        this.a = networkClient;
        this.b = request;
        this.c = dVar;
    }

    public final void a(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        Iterator<T> it = this.b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.b.getMethod());
        SSLSocketFactory sslSocketFactory = this.a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:66|105|67|(2:69|(3:106|71|72))|80|103|81|(3:99|82|83)|84|101|92|93|94) */
    @Override // io.appmetrica.analytics.network.internal.Call
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.network.internal.Response execute() {
        /*
            r15 = this;
            io.appmetrica.analytics.network.impl.d r0 = r15.c     // Catch: java.lang.Throwable -> Lc9
            io.appmetrica.analytics.network.internal.Request r1 = r15.b     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.getUrl()     // Catch: java.lang.Throwable -> Lc9
            r0.getClass()     // Catch: java.lang.Throwable -> Lc9
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc9
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch: java.lang.Throwable -> Lc9
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch: java.lang.Throwable -> Lc9
            boolean r1 = r0 instanceof javax.net.ssl.HttpsURLConnection
            r2 = 0
            if (r1 == 0) goto L22
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 != 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Connection created for "
            r0.<init>(r1)
            io.appmetrica.analytics.network.internal.Request r1 = r15.b
            java.lang.String r1 = r1.getUrl()
            r0.append(r1)
            java.lang.String r1 = " does not represent https connection"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.appmetrica.analytics.network.internal.Response r1 = new io.appmetrica.analytics.network.internal.Response
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0)
            r1.<init>(r2)
            return r1
        L49:
            r1 = 0
            byte[] r3 = new byte[r1]
            byte[] r4 = new byte[r1]
            r15.a(r0)     // Catch: java.lang.Throwable -> Lb7
            io.appmetrica.analytics.network.internal.Request r5 = r15.b     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = r5.getMethod()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r6 = "POST"
            boolean r5 = defpackage.O90.a(r5, r6)     // Catch: java.lang.Throwable -> Lb7
            r6 = 1
            if (r5 == 0) goto L84
            r0.setDoOutput(r6)     // Catch: java.lang.Throwable -> Lb7
            java.io.OutputStream r5 = r0.getOutputStream()     // Catch: java.lang.Throwable -> Lb7
            if (r5 == 0) goto L84
            io.appmetrica.analytics.network.internal.Request r7 = r15.b     // Catch: java.lang.Throwable -> L79
            byte[] r7 = r7.getBody()     // Catch: java.lang.Throwable -> L79
            r5.write(r7)     // Catch: java.lang.Throwable -> L79
            r5.flush()     // Catch: java.lang.Throwable -> L79
            defpackage.AbstractC2141aT1.a(r5, r2)     // Catch: java.lang.Throwable -> Lb7
            goto L84
        L79:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L7b
        L7b:
            r7 = move-exception
            defpackage.AbstractC2141aT1.a(r5, r6)     // Catch: java.lang.Throwable -> Lb7
            throw r7     // Catch: java.lang.Throwable -> Lb7
        L80:
            r7 = r2
            r2 = r5
            r5 = r1
            goto Lb9
        L84:
            int r5 = r0.getResponseCode()     // Catch: java.lang.Throwable -> Lb7
            java.util.Map r7 = r0.getHeaderFields()     // Catch: java.lang.Throwable -> Lb3
            io.appmetrica.analytics.network.internal.NetworkClient r8 = r15.a     // Catch: java.lang.Throwable -> Lb1
            int r8 = r8.getMaxResponseSize()     // Catch: java.lang.Throwable -> Lb1
            io.appmetrica.analytics.network.impl.a r9 = new io.appmetrica.analytics.network.impl.a     // Catch: java.lang.Throwable -> Lb1
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lb1
            byte[] r3 = io.appmetrica.analytics.network.impl.e.a(r8, r9)     // Catch: java.lang.Throwable -> Lb1
            io.appmetrica.analytics.network.internal.NetworkClient r8 = r15.a     // Catch: java.lang.Throwable -> Lb1
            int r8 = r8.getMaxResponseSize()     // Catch: java.lang.Throwable -> Lb1
            io.appmetrica.analytics.network.impl.b r9 = new io.appmetrica.analytics.network.impl.b     // Catch: java.lang.Throwable -> Lb1
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lb1
            byte[] r4 = io.appmetrica.analytics.network.impl.e.a(r8, r9)     // Catch: java.lang.Throwable -> Lb1
            r14 = r2
            r11 = r3
            r12 = r4
            r10 = r5
            r9 = r6
        Laf:
            r13 = r7
            goto Lbf
        Lb1:
            r2 = move-exception
            goto Lb9
        Lb3:
            r6 = move-exception
            r7 = r2
            r2 = r6
            goto Lb9
        Lb7:
            r5 = move-exception
            goto L80
        Lb9:
            r9 = r1
            r14 = r2
            r11 = r3
            r12 = r4
            r10 = r5
            goto Laf
        Lbf:
            r0.disconnect()     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            io.appmetrica.analytics.network.internal.Response r0 = new io.appmetrica.analytics.network.internal.Response
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r0
        Lc9:
            r0 = move-exception
            io.appmetrica.analytics.network.internal.Response r1 = new io.appmetrica.analytics.network.internal.Response
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.network.impl.c.execute():io.appmetrica.analytics.network.internal.Response");
    }

    public c(NetworkClient networkClient, Request request) {
        this(networkClient, request, new d());
    }
}
