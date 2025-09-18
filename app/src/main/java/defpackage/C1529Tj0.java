package defpackage;

/* renamed from: Tj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1529Tj0 {
    public final Object a;
    public C1135Oi b = new C1135Oi(4);
    public boolean c;
    public boolean d;

    public C1529Tj0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1529Tj0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C1529Tj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
