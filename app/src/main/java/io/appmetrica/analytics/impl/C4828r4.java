package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.r4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4828r4 implements ClientStorageProvider {
    public final InterfaceC4940vk a;

    public C4828r4(InterfaceC4940vk interfaceC4940vk) {
        this.a = interfaceC4940vk;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new Hc(str, this.a);
    }
}
