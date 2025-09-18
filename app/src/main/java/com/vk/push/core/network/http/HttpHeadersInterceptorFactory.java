package com.vk.push.core.network.http;

import com.vk.push.core.network.http.HttpHeadersInterceptorFactory;
import defpackage.InterfaceC6785r90;
import defpackage.O90;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/push/core/network/http/HttpHeadersInterceptorFactory;", "", "", "versionName", "packageName", "Lr90;", "create", "(Ljava/lang/String;Ljava/lang/String;)Lr90;", "DEFAULT_DEBUG_HEADER", "Ljava/lang/String;", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpHeadersInterceptorFactory {
    public static final String DEFAULT_DEBUG_HEADER = "x-vkpns-request-id";
    public static final HttpHeadersInterceptorFactory INSTANCE = new HttpHeadersInterceptorFactory();

    public final InterfaceC6785r90 create(final String versionName, final String packageName) {
        O90.f(versionName, "versionName");
        O90.f(packageName, "packageName");
        return new InterfaceC6785r90() { // from class: x40
            @Override // defpackage.InterfaceC6785r90
            public final HS0 a(GN0 gn0) {
                String str = versionName;
                O90.f(str, "$versionName");
                String str2 = packageName;
                O90.f(str2, "$packageName");
                C7375uF c7375uFA = gn0.e.a();
                String string = UUID.randomUUID().toString();
                O90.e(string, "randomUUID().toString()");
                c7375uFA.y(HttpHeadersInterceptorFactory.DEFAULT_DEBUG_HEADER, string);
                c7375uFA.y("User-Agent", str);
                c7375uFA.y("X-Vkpns-Package-Name", str2);
                return gn0.b(c7375uFA.o());
            }
        };
    }
}
