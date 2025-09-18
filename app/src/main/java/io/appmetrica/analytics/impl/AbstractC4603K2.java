package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.K2 */
/* loaded from: classes2.dex */
public abstract class AbstractC4603K2 implements ModulePreferences {

    /* renamed from: a */
    public final InterfaceC5529vk f30382a;

    public AbstractC4603K2(InterfaceC5529vk interfaceC5529vk) {
        this.f30382a = interfaceC5529vk;
    }

    /* renamed from: a */
    public abstract String mo19467a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((AbstractC5022bd) this.f30382a).m20182c(str, z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i) {
        return ((AbstractC5022bd) this.f30382a).m20179c(str, i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j) {
        return ((AbstractC5022bd) this.f30382a).m20180c(mo19467a(str), j);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((AbstractC5022bd) this.f30382a).m20181c(mo19467a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z) {
        AbstractC5022bd abstractC5022bd = (AbstractC5022bd) this.f30382a;
        ((AbstractC5348oe) ((InterfaceC5529vk) abstractC5022bd.m20874b(abstractC5022bd.mo20188f(mo19467a(str)), z))).m20875b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i) {
        AbstractC5022bd abstractC5022bd = (AbstractC5022bd) this.f30382a;
        ((AbstractC5348oe) ((InterfaceC5529vk) abstractC5022bd.m20871b(abstractC5022bd.mo20188f(str), i))).m20875b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j) {
        AbstractC5022bd abstractC5022bd = (AbstractC5022bd) this.f30382a;
        ((AbstractC5348oe) ((InterfaceC5529vk) abstractC5022bd.m20872b(abstractC5022bd.mo20188f(mo19467a(str)), j))).m20875b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        AbstractC5022bd abstractC5022bd = (AbstractC5022bd) this.f30382a;
        ((AbstractC5348oe) ((InterfaceC5529vk) abstractC5022bd.m20873b(abstractC5022bd.mo20188f(mo19467a(str)), str2))).m20875b();
    }
}
