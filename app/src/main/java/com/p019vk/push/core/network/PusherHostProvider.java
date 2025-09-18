package com.p019vk.push.core.network;

import com.p019vk.push.common.HostInfoProvider;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m22267d2 = {"Lcom/vk/push/core/network/PusherHostProvider;", "Lcom/vk/push/common/HostInfoProvider;", "<init>", "()V", "", "scheme", "Ljava/lang/String;", "getScheme", "()Ljava/lang/String;", "host", "getHost", "core-network_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PusherHostProvider implements HostInfoProvider {
    @Override // com.p019vk.push.common.HostInfoProvider
    public String getHost() {
        return "vkpns.rustore.ru";
    }

    @Override // com.p019vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.p019vk.push.common.HostInfoProvider
    public String getScheme() {
        return "https";
    }
}
