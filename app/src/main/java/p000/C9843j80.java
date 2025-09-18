package p000;

/* renamed from: j80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9843j80 {

    /* renamed from: a */
    public final int f34932a;

    /* renamed from: b */
    public final Object f34933b;

    public C9843j80(int i, Object obj) {
        this.f34932a = i;
        this.f34933b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9843j80)) {
            return false;
        }
        C9843j80 c9843j80 = (C9843j80) obj;
        return this.f34932a == c9843j80.f34932a && O90.m5963a(this.f34933b, c9843j80.f34933b);
    }

    public final int hashCode() {
        int i = this.f34932a * 31;
        Object obj = this.f34933b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f34932a + ", value=" + this.f34933b + ')';
    }
}
