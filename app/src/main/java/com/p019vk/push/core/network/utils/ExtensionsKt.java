package com.p019vk.push.core.network.utils;

import com.p019vk.push.common.HostInfoProvider;
import kotlin.Metadata;
import p000.C40;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Lcom/vk/push/common/HostInfoProvider;", "LC40;", "getHostInfoHttpBuilder", "(Lcom/vk/push/common/HostInfoProvider;)LC40;", "core-network_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ExtensionsKt {
    public static final C40 getHostInfoHttpBuilder(HostInfoProvider hostInfoProvider) {
        O90.m5968f(hostInfoProvider, "<this>");
        C40 c40 = new C40();
        c40.m976i(hostInfoProvider.getScheme());
        c40.m972e(hostInfoProvider.getHost());
        Integer port = hostInfoProvider.getPort();
        if (port != null) {
            c40.m974g(port.intValue());
        }
        return c40;
    }
}
