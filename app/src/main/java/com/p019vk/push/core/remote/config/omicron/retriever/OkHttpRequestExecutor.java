package com.p019vk.push.core.remote.config.omicron.retriever;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p000.C10457nx0;
import p000.C10585ox0;
import p000.C10777qR0;
import p000.C11097sx0;
import p000.C11225tx0;
import p000.HS0;

/* loaded from: classes2.dex */
public final class OkHttpRequestExecutor implements RequestExecutor {

    /* renamed from: a */
    public final C10585ox0 f20564a;

    public OkHttpRequestExecutor(boolean z) {
        this(null, z);
    }

    @Override // com.p019vk.push.core.remote.config.omicron.retriever.RequestExecutor
    public HS0 execute(C10777qR0 c10777qR0) throws IOException {
        return FirebasePerfOkHttpClient.execute(this.f20564a.m23580b(c10777qR0));
    }

    public OkHttpRequestExecutor(C10585ox0 c10585ox0, boolean z) throws NoSuchAlgorithmException, KeyManagementException {
        C10457nx0 c10457nx0 = c10585ox0 == null ? new C10457nx0() : c10585ox0.m23579a();
        if (z) {
            TrustManager[] trustManagerArr = {new C11225tx0()};
            try {
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                sSLContext.init(null, trustManagerArr, new SecureRandom());
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                C11097sx0 c11097sx0 = new C11097sx0();
                if (!c11097sx0.equals(c10457nx0.f38642u)) {
                    c10457nx0.f38621C = null;
                }
                c10457nx0.f38642u = c11097sx0;
                c10457nx0.m23288c(socketFactory, (X509TrustManager) trustManagerArr[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f20564a = new C10585ox0(c10457nx0);
    }
}
