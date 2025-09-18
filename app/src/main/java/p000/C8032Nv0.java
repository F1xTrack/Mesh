package p000;

import java.util.List;

/* renamed from: Nv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8032Nv0 {

    /* renamed from: a */
    public final C0055As f8128a;

    /* renamed from: b */
    public final List f8129b;

    public C8032Nv0(C0055As c0055As, List list) {
        O90.m5968f(c0055As, "classId");
        this.f8128a = c0055As;
        this.f8129b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8032Nv0)) {
            return false;
        }
        C8032Nv0 c8032Nv0 = (C8032Nv0) obj;
        return O90.m5963a(this.f8128a, c8032Nv0.f8128a) && O90.m5963a(this.f8129b, c8032Nv0.f8129b);
    }

    public final int hashCode() {
        return this.f8129b.hashCode() + (this.f8128a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassRequest(classId=");
        sb.append(this.f8128a);
        sb.append(", typeParametersCount=");
        return AbstractC11153tN0.m24883A(sb, this.f8129b, ')');
    }
}
