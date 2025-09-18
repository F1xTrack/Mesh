package defpackage;

import java.util.ArrayList;

/* renamed from: kr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5582kr1 extends AbstractC6537pr1 {
    public final String a;
    public final ArrayList b;

    public C5582kr1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5582kr1)) {
            return false;
        }
        C5582kr1 c5582kr1 = (C5582kr1) obj;
        return O90.a(this.a, c5582kr1.a) && O90.a(this.b, c5582kr1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "NoMasterInHostsList(master=" + this.a + ", installedHosts=" + this.b + ')';
    }
}
