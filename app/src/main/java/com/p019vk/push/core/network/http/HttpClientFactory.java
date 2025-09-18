package com.p019vk.push.core.network.http;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p000.AbstractC0246Du;
import p000.C10457nx0;
import p000.C10585ox0;
import p000.InterfaceC10869r90;
import p000.O90;

@Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m22267d2 = {"Lcom/vk/push/core/network/http/HttpClientFactory;", "", "", "timeoutSec", "", "retryOnConnectionFailure", "", "Lr90;", "interceptors", "Lox0;", "create", "(JZ[Lr90;)Lox0;", "core-network_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class HttpClientFactory {
    public static final HttpClientFactory INSTANCE = new HttpClientFactory();

    public static /* synthetic */ C10585ox0 create$default(HttpClientFactory httpClientFactory, long j, boolean z, InterfaceC10869r90[] interfaceC10869r90Arr, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 60;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return httpClientFactory.create(j, z, interfaceC10869r90Arr);
    }

    public final C10585ox0 create(long timeoutSec, boolean retryOnConnectionFailure, InterfaceC10869r90... interceptors) {
        O90.m5968f(interceptors, "interceptors");
        C10457nx0 c10457nx0 = new C10457nx0();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c10457nx0.m23286a(timeoutSec, timeUnit);
        c10457nx0.m23289d(timeoutSec, timeUnit);
        c10457nx0.m23287b(timeoutSec, timeUnit);
        c10457nx0.f38627f = retryOnConnectionFailure;
        HttpClientFactory$create$okHttpClientBuilder$1 httpClientFactory$create$okHttpClientBuilder$1 = new HttpClientFactory$create$okHttpClientBuilder$1();
        if (!httpClientFactory$create$okHttpClientBuilder$1.equals(c10457nx0.f38635n)) {
            c10457nx0.f38621C = null;
        }
        c10457nx0.f38635n = httpClientFactory$create$okHttpClientBuilder$1;
        AbstractC0246Du.m1921n(c10457nx0.f38624c, interceptors);
        return new C10585ox0(c10457nx0);
    }
}
