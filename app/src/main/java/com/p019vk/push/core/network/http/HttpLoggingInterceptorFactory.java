package com.p019vk.push.core.network.http;

import com.p019vk.push.common.Logger;
import kotlin.Metadata;
import p000.A40;
import p000.AbstractC0705LB;
import p000.C0267EE;
import p000.C11879z40;
import p000.InterfaceC10869r90;
import p000.InterfaceC11752y40;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, m22267d2 = {"Lcom/vk/push/core/network/http/HttpLoggingInterceptorFactory;", "", "Lcom/vk/push/common/Logger;", "logger", "", "enabled", "Lr90;", "create", "(Lcom/vk/push/common/Logger;Z)Lr90;", "httpLogger", "core-network_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class HttpLoggingInterceptorFactory {
    public static final HttpLoggingInterceptorFactory INSTANCE = new HttpLoggingInterceptorFactory();

    public final InterfaceC10869r90 create(Logger logger, boolean enabled) {
        O90.m5968f(logger, "logger");
        C11879z40 c11879z40 = new C11879z40(enabled ? new C0267EE(18, AbstractC0705LB.m4915b(new A40(logger, 0))) : InterfaceC11752y40.f46076v0);
        c11879z40.f46628b = enabled ? 4 : 1;
        return c11879z40;
    }
}
