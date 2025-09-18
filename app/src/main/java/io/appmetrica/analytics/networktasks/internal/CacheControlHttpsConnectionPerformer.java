package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.C5676a;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public class CacheControlHttpsConnectionPerformer {

    /* renamed from: a */
    private final C5676a f33104a;

    /* renamed from: b */
    private final SSLSocketFactory f33105b;

    public interface Client {
        String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(String str, byte[] bArr);
    }

    public CacheControlHttpsConnectionPerformer(SSLSocketFactory sSLSocketFactory) {
        this(new C5676a(), sSLSocketFactory);
    }

    public void performConnection(String str, Client client) {
        Response responseM21291a;
        int code;
        String str2;
        try {
            C5676a c5676a = this.f33104a;
            String oldETag = client.getOldETag();
            SSLSocketFactory sSLSocketFactory = this.f33105b;
            c5676a.getClass();
            responseM21291a = C5676a.m21291a(oldETag, str, sSLSocketFactory);
            code = responseM21291a.getCode();
        } catch (Throwable unused) {
        }
        if (code != 200) {
            if (code != 304) {
                client.onError();
                return;
            } else {
                client.onNotModified();
                return;
            }
        }
        List list = (List) CollectionUtils.getFromMapIgnoreCase(responseM21291a.getHeaders(), "ETag");
        if (list == null || list.size() <= 0 || (str2 = (String) list.get(0)) == null) {
            str2 = "";
        }
        client.onResponse(str2, responseM21291a.getResponseData());
    }

    public CacheControlHttpsConnectionPerformer(C5676a c5676a, SSLSocketFactory sSLSocketFactory) {
        this.f33104a = c5676a;
        this.f33105b = sSLSocketFactory;
    }
}
