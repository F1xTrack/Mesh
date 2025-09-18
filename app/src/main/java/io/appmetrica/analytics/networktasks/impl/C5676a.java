package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.networktasks.impl.a */
/* loaded from: classes2.dex */
public final class C5676a {
    /* renamed from: a */
    public static Response m21291a(String str, String str2, SSLSocketFactory sSLSocketFactory) {
        Request.Builder builderWithMethod = new Request.Builder(str2).withMethod("GET");
        if (!TextUtils.isEmpty(str)) {
            builderWithMethod.addHeader("If-None-Match", str);
        }
        NetworkClient.Builder builderWithSslSocketFactory = new NetworkClient.Builder().withInstanceFollowRedirects(true).withSslSocketFactory(sSLSocketFactory);
        int i = AbstractC5677b.f33087a;
        return builderWithSslSocketFactory.withConnectTimeout(i).withReadTimeout(i).build().newCall(builderWithMethod.build()).execute();
    }
}
