package com.p019vk.push.core.network.http;

import com.p019vk.push.core.network.http.HttpHeadersInterceptorFactory;
import java.util.UUID;
import kotlin.Metadata;
import p000.InterfaceC10869r90;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m22267d2 = {"Lcom/vk/push/core/network/http/HttpHeadersInterceptorFactory;", "", "", "versionName", "packageName", "Lr90;", "create", "(Ljava/lang/String;Ljava/lang/String;)Lr90;", "DEFAULT_DEBUG_HEADER", "Ljava/lang/String;", "core-network_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class HttpHeadersInterceptorFactory {
    public static final String DEFAULT_DEBUG_HEADER = "x-vkpns-request-id";
    public static final HttpHeadersInterceptorFactory INSTANCE = new HttpHeadersInterceptorFactory();

    public final InterfaceC10869r90 create(final String versionName, final String packageName) {
        O90.m5968f(versionName, "versionName");
        O90.m5968f(packageName, "packageName");
        return new InterfaceC10869r90() { // from class: x40
            @Override // p000.InterfaceC10869r90
            /* renamed from: a */
            public final HS0 mo18634a(GN0 gn0) {
                String str = versionName;
                O90.m5968f(str, "$versionName");
                String str2 = packageName;
                O90.m5968f(str2, "$packageName");
                C6937uF c6937uFM23998a = gn0.f3715e.m23998a();
                String string = UUID.randomUUID().toString();
                O90.m5967e(string, "randomUUID().toString()");
                c6937uFM23998a.m25145y(HttpHeadersInterceptorFactory.DEFAULT_DEBUG_HEADER, string);
                c6937uFM23998a.m25145y("User-Agent", str);
                c6937uFM23998a.m25145y("X-Vkpns-Package-Name", str2);
                return gn0.m3055b(c6937uFM23998a.m25141o());
            }
        };
    }
}
