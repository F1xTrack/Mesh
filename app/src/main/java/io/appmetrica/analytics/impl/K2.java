package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* loaded from: classes2.dex */
public abstract class K2 implements ModulePreferences {
    public final InterfaceC4940vk a;

    public K2(InterfaceC4940vk interfaceC4940vk) {
        this.a = interfaceC4940vk;
    }

    public abstract String a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((AbstractC4452bd) this.a).c(str, z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i) {
        return ((AbstractC4452bd) this.a).c(str, i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j) {
        return ((AbstractC4452bd) this.a).c(a(str), j);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((AbstractC4452bd) this.a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z) {
        AbstractC4452bd abstractC4452bd = (AbstractC4452bd) this.a;
        ((AbstractC4767oe) ((InterfaceC4940vk) abstractC4452bd.b(abstractC4452bd.f(a(str)), z))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i) {
        AbstractC4452bd abstractC4452bd = (AbstractC4452bd) this.a;
        ((AbstractC4767oe) ((InterfaceC4940vk) abstractC4452bd.b(abstractC4452bd.f(str), i))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j) {
        AbstractC4452bd abstractC4452bd = (AbstractC4452bd) this.a;
        ((AbstractC4767oe) ((InterfaceC4940vk) abstractC4452bd.b(abstractC4452bd.f(a(str)), j))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        AbstractC4452bd abstractC4452bd = (AbstractC4452bd) this.a;
        ((AbstractC4767oe) ((InterfaceC4940vk) abstractC4452bd.b(abstractC4452bd.f(a(str)), str2))).b();
    }
}
