package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.r4 */
/* loaded from: classes2.dex */
public final class C5413r4 implements ClientStorageProvider {

    /* renamed from: a */
    public final InterfaceC5529vk f32497a;

    public C5413r4(InterfaceC5529vk interfaceC5529vk) {
        this.f32497a = interfaceC5529vk;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C4541Hc(str, this.f32497a);
    }
}
