package com.vk.push.core.network.http;

import com.vk.push.common.Logger;
import defpackage.A40;
import defpackage.C8294z40;
import defpackage.EE;
import defpackage.InterfaceC6785r90;
import defpackage.InterfaceC8104y40;
import defpackage.LB;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vk/push/core/network/http/HttpLoggingInterceptorFactory;", "", "Lcom/vk/push/common/Logger;", "logger", "", "enabled", "Lr90;", "create", "(Lcom/vk/push/common/Logger;Z)Lr90;", "httpLogger", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpLoggingInterceptorFactory {
    public static final HttpLoggingInterceptorFactory INSTANCE = new HttpLoggingInterceptorFactory();

    public final InterfaceC6785r90 create(Logger logger, boolean enabled) {
        O90.f(logger, "logger");
        C8294z40 c8294z40 = new C8294z40(enabled ? new EE(18, LB.b(new A40(logger, 0))) : InterfaceC8104y40.v0);
        c8294z40.b = enabled ? 4 : 1;
        return c8294z40;
    }
}
