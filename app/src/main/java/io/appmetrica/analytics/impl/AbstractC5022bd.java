package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bd */
/* loaded from: classes2.dex */
public abstract class AbstractC5022bd extends AbstractC5348oe implements InterfaceC5529vk {
    public AbstractC5022bd(InterfaceC4467Ea interfaceC4467Ea, String str) {
        super(interfaceC4467Ea, str);
    }

    /* renamed from: c */
    public final String m20181c(String str, String str2) {
        return this.f32347a.getString(mo20188f(str), str2);
    }

    /* renamed from: d */
    public final InterfaceC5529vk m20185d(String str, String str2) {
        return (InterfaceC5529vk) m20873b(mo20188f(str), str2);
    }

    /* renamed from: e */
    public final boolean m20187e(String str) {
        return this.f32347a.mo19348a(mo20188f(str));
    }

    /* renamed from: f */
    public abstract String mo20188f(String str);

    /* renamed from: g */
    public InterfaceC5529vk mo20189g(String str) {
        return (InterfaceC5529vk) m20878d(mo20188f(str));
    }

    public AbstractC5022bd(InterfaceC4467Ea interfaceC4467Ea) {
        this(interfaceC4467Ea, null);
    }

    /* renamed from: d */
    public final InterfaceC5529vk m20183d(String str, int i) {
        return (InterfaceC5529vk) m20871b(mo20188f(str), i);
    }

    /* renamed from: c */
    public final int m20179c(String str, int i) {
        return this.f32347a.getInt(mo20188f(str), i);
    }

    /* renamed from: d */
    public final InterfaceC5529vk m20184d(String str, long j) {
        return (InterfaceC5529vk) m20872b(mo20188f(str), j);
    }

    /* renamed from: d */
    public final InterfaceC5529vk m20186d(String str, boolean z) {
        return (InterfaceC5529vk) m20874b(mo20188f(str), z);
    }

    /* renamed from: c */
    public final long m20180c(String str, long j) {
        return this.f32347a.getLong(mo20188f(str), j);
    }

    /* renamed from: c */
    public final boolean m20182c(String str, boolean z) {
        return this.f32347a.getBoolean(mo20188f(str), z);
    }
}
