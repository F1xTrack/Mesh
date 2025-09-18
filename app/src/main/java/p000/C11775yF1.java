package p000;

/* renamed from: yF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11775yF1 {

    /* renamed from: a */
    public final DD1 f46158a;

    /* renamed from: b */
    public final int f46159b;

    public C11775yF1(DD1 dd1, int i) {
        this.f46158a = dd1;
        this.f46159b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11775yF1)) {
            return false;
        }
        C11775yF1 c11775yF1 = (C11775yF1) obj;
        return this.f46158a == c11775yF1.f46158a && this.f46159b == c11775yF1.f46159b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f46158a) * 65535) + this.f46159b;
    }
}
