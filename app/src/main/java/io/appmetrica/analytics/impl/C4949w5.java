package io.appmetrica.analytics.impl;

import defpackage.F91;
import defpackage.O90;

/* renamed from: io.appmetrica.analytics.impl.w5 */
/* loaded from: classes2.dex */
public final class C4949w5 implements Bc {
    public final String a;

    public C4949w5(String str) {
        this.a = str;
    }

    public final C4949w5 a(String str) {
        return new C4949w5(str);
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4949w5) && O90.a(this.a, ((C4949w5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return F91.v(new StringBuilder("ConstantModuleEntryPointProvider(className="), this.a, ')');
    }

    public static C4949w5 a(C4949w5 c4949w5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4949w5.a;
        }
        c4949w5.getClass();
        return new C4949w5(str);
    }

    @Override // io.appmetrica.analytics.impl.Bc
    public final String a() {
        return this.a;
    }
}
