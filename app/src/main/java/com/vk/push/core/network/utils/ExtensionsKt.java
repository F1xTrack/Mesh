package com.vk.push.core.network.utils;

import com.vk.push.common.HostInfoProvider;
import defpackage.C40;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/common/HostInfoProvider;", "LC40;", "getHostInfoHttpBuilder", "(Lcom/vk/push/common/HostInfoProvider;)LC40;", "core-network_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ExtensionsKt {
    public static final C40 getHostInfoHttpBuilder(HostInfoProvider hostInfoProvider) {
        O90.f(hostInfoProvider, "<this>");
        C40 c40 = new C40();
        c40.i(hostInfoProvider.getScheme());
        c40.e(hostInfoProvider.getHost());
        Integer port = hostInfoProvider.getPort();
        if (port != null) {
            c40.g(port.intValue());
        }
        return c40;
    }
}
