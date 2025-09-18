package defpackage;

import java.io.Serializable;

/* renamed from: fd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3809fd1 implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public C3809fd1(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3809fd1)) {
            return false;
        }
        C3809fd1 c3809fd1 = (C3809fd1) obj;
        return O90.a(this.a, c3809fd1.a) && O90.a(this.b, c3809fd1.b) && O90.a(this.c, c3809fd1.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}
