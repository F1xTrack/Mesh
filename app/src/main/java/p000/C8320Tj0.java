package p000;

/* renamed from: Tj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8320Tj0 {

    /* renamed from: a */
    public final Object f11482a;

    /* renamed from: b */
    public C0926Oi f11483b = new C0926Oi(4);

    /* renamed from: c */
    public boolean f11484c;

    /* renamed from: d */
    public boolean f11485d;

    public C8320Tj0(Object obj) {
        this.f11482a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8320Tj0.class != obj.getClass()) {
            return false;
        }
        return this.f11482a.equals(((C8320Tj0) obj).f11482a);
    }

    public final int hashCode() {
        return this.f11482a.hashCode();
    }
}
