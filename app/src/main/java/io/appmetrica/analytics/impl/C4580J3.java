package io.appmetrica.analytics.impl;

import java.util.List;
import p000.AbstractC11153tN0;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.J3 */
/* loaded from: classes2.dex */
public final class C4580J3 implements InterfaceC4680N7 {

    /* renamed from: a */
    public final C4556I3 f30330a;

    /* renamed from: b */
    public final List f30331b;

    public C4580J3(C4556I3 c4556i3, List<C4556I3> list) {
        this.f30330a = c4556i3;
        this.f30331b = list;
    }

    /* renamed from: a */
    public final C4580J3 m19522a(C4556I3 c4556i3, List<C4556I3> list) {
        return new C4580J3(c4556i3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4680N7
    /* renamed from: b */
    public final Object mo19524b() {
        return this.f30330a;
    }

    /* renamed from: c */
    public final C4556I3 m19525c() {
        return this.f30330a;
    }

    /* renamed from: d */
    public final List<C4556I3> m19526d() {
        return this.f30331b;
    }

    /* renamed from: e */
    public final C4556I3 m19527e() {
        return this.f30330a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4580J3)) {
            return false;
        }
        C4580J3 c4580j3 = (C4580J3) obj;
        return O90.m5963a(this.f30330a, c4580j3.f30330a) && O90.m5963a(this.f30331b, c4580j3.f30331b);
    }

    public final int hashCode() {
        return this.f30331b.hashCode() + (this.f30330a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClidsInfo(chosen=");
        sb.append(this.f30330a);
        sb.append(", candidates=");
        return AbstractC11153tN0.m24883A(sb, this.f30331b, ')');
    }

    /* renamed from: a */
    public static C4580J3 m19521a(C4580J3 c4580j3, C4556I3 c4556i3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            c4556i3 = c4580j3.f30330a;
        }
        if ((i & 2) != 0) {
            list = c4580j3.f30331b;
        }
        c4580j3.getClass();
        return new C4580J3(c4556i3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4680N7
    /* renamed from: a */
    public final List<C4556I3> mo19523a() {
        return this.f30331b;
    }
}
