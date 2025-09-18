package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4452bd extends AbstractC4767oe implements InterfaceC4940vk {
    public AbstractC4452bd(Ea ea, String str) {
        super(ea, str);
    }

    public final String c(String str, String str2) {
        return this.a.getString(f(str), str2);
    }

    public final InterfaceC4940vk d(String str, String str2) {
        return (InterfaceC4940vk) b(f(str), str2);
    }

    public final boolean e(String str) {
        return this.a.a(f(str));
    }

    public abstract String f(String str);

    public InterfaceC4940vk g(String str) {
        return (InterfaceC4940vk) d(f(str));
    }

    public AbstractC4452bd(Ea ea) {
        this(ea, null);
    }

    public final InterfaceC4940vk d(String str, int i) {
        return (InterfaceC4940vk) b(f(str), i);
    }

    public final int c(String str, int i) {
        return this.a.getInt(f(str), i);
    }

    public final InterfaceC4940vk d(String str, long j) {
        return (InterfaceC4940vk) b(f(str), j);
    }

    public final InterfaceC4940vk d(String str, boolean z) {
        return (InterfaceC4940vk) b(f(str), z);
    }

    public final long c(String str, long j) {
        return this.a.getLong(f(str), j);
    }

    public final boolean c(String str, boolean z) {
        return this.a.getBoolean(f(str), z);
    }
}
