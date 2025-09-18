package p000;

import java.util.ArrayList;

/* renamed from: mm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10308mm1 extends W02 {

    /* renamed from: a */
    public final ArrayList f37913a;

    public C10308mm1(ArrayList arrayList) {
        this.f37913a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10308mm1) && this.f37913a.equals(((C10308mm1) obj).f37913a);
    }

    public final int hashCode() {
        return this.f37913a.hashCode();
    }

    public final String toString() {
        return "Sent(values=" + this.f37913a + ')';
    }
}
