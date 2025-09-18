package io.appmetrica.analytics.impl;

import defpackage.AbstractC7209tN0;
import defpackage.O90;
import java.util.List;

/* loaded from: classes2.dex */
public final class J3 implements N7 {
    public final I3 a;
    public final List b;

    public J3(I3 i3, List<I3> list) {
        this.a = i3;
        this.b = list;
    }

    public final J3 a(I3 i3, List<I3> list) {
        return new J3(i3, list);
    }

    @Override // io.appmetrica.analytics.impl.N7
    public final Object b() {
        return this.a;
    }

    public final I3 c() {
        return this.a;
    }

    public final List<I3> d() {
        return this.b;
    }

    public final I3 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J3)) {
            return false;
        }
        J3 j3 = (J3) obj;
        return O90.a(this.a, j3.a) && O90.a(this.b, j3.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClidsInfo(chosen=");
        sb.append(this.a);
        sb.append(", candidates=");
        return AbstractC7209tN0.A(sb, this.b, ')');
    }

    public static J3 a(J3 j3, I3 i3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            i3 = j3.a;
        }
        if ((i & 2) != 0) {
            list = j3.b;
        }
        j3.getClass();
        return new J3(i3, list);
    }

    @Override // io.appmetrica.analytics.impl.N7
    public final List<I3> a() {
        return this.b;
    }
}
