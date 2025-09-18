package defpackage;

/* renamed from: j80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5255j80 {
    public final int a;
    public final Object b;

    public C5255j80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5255j80)) {
            return false;
        }
        C5255j80 c5255j80 = (C5255j80) obj;
        return this.a == c5255j80.a && O90.a(this.b, c5255j80.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Object obj = this.b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
