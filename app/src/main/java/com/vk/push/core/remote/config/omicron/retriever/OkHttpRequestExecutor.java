package com.vk.push.core.remote.config.omicron.retriever;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import defpackage.C6172nx0;
import defpackage.C6363ox0;
import defpackage.C6649qR0;
import defpackage.C7126sx0;
import defpackage.C7317tx0;
import defpackage.HS0;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class OkHttpRequestExecutor implements RequestExecutor {
    public final C6363ox0 a;

    public OkHttpRequestExecutor(boolean z) {
        this(null, z);
    }

    @Override // com.vk.push.core.remote.config.omicron.retriever.RequestExecutor
    public HS0 execute(C6649qR0 c6649qR0) throws IOException {
        return FirebasePerfOkHttpClient.execute(this.a.b(c6649qR0));
    }

    public OkHttpRequestExecutor(C6363ox0 c6363ox0, boolean z) throws NoSuchAlgorithmException, KeyManagementException {
        C6172nx0 c6172nx0 = c6363ox0 == null ? new C6172nx0() : c6363ox0.a();
        if (z) {
            TrustManager[] trustManagerArr = {new C7317tx0()};
            try {
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                sSLContext.init(null, trustManagerArr, new SecureRandom());
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                C7126sx0 c7126sx0 = new C7126sx0();
                if (!c7126sx0.equals(c6172nx0.u)) {
                    c6172nx0.C = null;
                }
                c6172nx0.u = c7126sx0;
                c6172nx0.c(socketFactory, (X509TrustManager) trustManagerArr[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.a = new C6363ox0(c6172nx0);
    }
}
