package defpackage;

/* renamed from: gt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4047gt0 {
    public Class a;
    public Class b;
    public Class c;

    public C4047gt0(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4047gt0.class != obj.getClass()) {
            return false;
        }
        C4047gt0 c4047gt0 = (C4047gt0) obj;
        return this.a.equals(c4047gt0.a) && this.b.equals(c4047gt0.b) && AbstractC0121Bh1.b(this.c, c4047gt0.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
