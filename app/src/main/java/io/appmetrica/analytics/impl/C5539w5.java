package io.appmetrica.analytics.impl;

import p000.F91;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.w5 */
/* loaded from: classes2.dex */
public final class C5539w5 implements InterfaceC4394Bc {

    /* renamed from: a */
    public final String f32757a;

    public C5539w5(String str) {
        this.f32757a = str;
    }

    /* renamed from: a */
    public final C5539w5 m21171a(String str) {
        return new C5539w5(str);
    }

    /* renamed from: b */
    public final String m21172b() {
        return this.f32757a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5539w5) && O90.m5963a(this.f32757a, ((C5539w5) obj).f32757a);
    }

    public final int hashCode() {
        return this.f32757a.hashCode();
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("ConstantModuleEntryPointProvider(className="), this.f32757a, ')');
    }

    /* renamed from: a */
    public static C5539w5 m21170a(C5539w5 c5539w5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c5539w5.f32757a;
        }
        c5539w5.getClass();
        return new C5539w5(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4394Bc
    /* renamed from: a */
    public final String mo19232a() {
        return this.f32757a;
    }
}
