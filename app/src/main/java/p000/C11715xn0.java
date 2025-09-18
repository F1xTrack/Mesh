package p000;

/* renamed from: xn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11715xn0 {

    /* renamed from: a */
    public final C6911tq f45787a;

    /* renamed from: b */
    public final String f45788b;

    /* renamed from: c */
    public final int f45789c;

    /* renamed from: d */
    public final boolean f45790d;

    public C11715xn0(C6911tq c6911tq, String str, int i, boolean z) {
        O90.m5969g(str, "extractedValue");
        this.f45787a = c6911tq;
        this.f45788b = str;
        this.f45789c = i;
        this.f45790d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11715xn0)) {
            return false;
        }
        C11715xn0 c11715xn0 = (C11715xn0) obj;
        return O90.m5963a(this.f45787a, c11715xn0.f45787a) && O90.m5963a(this.f45788b, c11715xn0.f45788b) && this.f45789c == c11715xn0.f45789c && this.f45790d == c11715xn0.f45790d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C6911tq c6911tq = this.f45787a;
        int iHashCode = (c6911tq != null ? c6911tq.hashCode() : 0) * 31;
        String str = this.f45788b;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f45789c) * 31;
        boolean z = this.f45790d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(formattedText=");
        sb.append(this.f45787a);
        sb.append(", extractedValue=");
        sb.append(this.f45788b);
        sb.append(", affinity=");
        sb.append(this.f45789c);
        sb.append(", complete=");
        return AbstractC7222ym.m26236m(sb, this.f45790d, ")");
    }
}
