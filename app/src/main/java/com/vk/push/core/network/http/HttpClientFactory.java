package com.vk.push.core.network.http;

import defpackage.AbstractC0314Du;
import defpackage.C6172nx0;
import defpackage.C6363ox0;
import defpackage.InterfaceC6785r90;
import defpackage.O90;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vk/push/core/network/http/HttpClientFactory;", "", "", "timeoutSec", "", "retryOnConnectionFailure", "", "Lr90;", "interceptors", "Lox0;", "create", "(JZ[Lr90;)Lox0;", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpClientFactory {
    public static final HttpClientFactory INSTANCE = new HttpClientFactory();

    public static /* synthetic */ C6363ox0 create$default(HttpClientFactory httpClientFactory, long j, boolean z, InterfaceC6785r90[] interfaceC6785r90Arr, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 60;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return httpClientFactory.create(j, z, interfaceC6785r90Arr);
    }

    public final C6363ox0 create(long timeoutSec, boolean retryOnConnectionFailure, InterfaceC6785r90... interceptors) {
        O90.f(interceptors, "interceptors");
        C6172nx0 c6172nx0 = new C6172nx0();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c6172nx0.a(timeoutSec, timeUnit);
        c6172nx0.d(timeoutSec, timeUnit);
        c6172nx0.b(timeoutSec, timeUnit);
        c6172nx0.f = retryOnConnectionFailure;
        HttpClientFactory$create$okHttpClientBuilder$1 httpClientFactory$create$okHttpClientBuilder$1 = new HttpClientFactory$create$okHttpClientBuilder$1();
        if (!httpClientFactory$create$okHttpClientBuilder$1.equals(c6172nx0.n)) {
            c6172nx0.C = null;
        }
        c6172nx0.n = httpClientFactory$create$okHttpClientBuilder$1;
        AbstractC0314Du.n(c6172nx0.c, interceptors);
        return new C6363ox0(c6172nx0);
    }
}
