package p000;

/* renamed from: gt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9553gt0 {

    /* renamed from: a */
    public Class f28073a;

    /* renamed from: b */
    public Class f28074b;

    /* renamed from: c */
    public Class f28075c;

    public C9553gt0(Class cls, Class cls2, Class cls3) {
        this.f28073a = cls;
        this.f28074b = cls2;
        this.f28075c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9553gt0.class != obj.getClass()) {
            return false;
        }
        C9553gt0 c9553gt0 = (C9553gt0) obj;
        return this.f28073a.equals(c9553gt0.f28073a) && this.f28074b.equals(c9553gt0.f28074b) && AbstractC7381Bh1.m803b(this.f28075c, c9553gt0.f28075c);
    }

    public final int hashCode() {
        int iHashCode = (this.f28074b.hashCode() + (this.f28073a.hashCode() * 31)) * 31;
        Class cls = this.f28075c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f28073a + ", second=" + this.f28074b + '}';
    }
}
