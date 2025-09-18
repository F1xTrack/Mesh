package defpackage;

import java.util.List;

/* renamed from: Nv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1097Nv0 {
    public final C0074As a;
    public final List b;

    public C1097Nv0(C0074As c0074As, List list) {
        O90.f(c0074As, "classId");
        this.a = c0074As;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1097Nv0)) {
            return false;
        }
        C1097Nv0 c1097Nv0 = (C1097Nv0) obj;
        return O90.a(this.a, c1097Nv0.a) && O90.a(this.b, c1097Nv0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassRequest(classId=");
        sb.append(this.a);
        sb.append(", typeParametersCount=");
        return AbstractC7209tN0.A(sb, this.b, ')');
    }
}
