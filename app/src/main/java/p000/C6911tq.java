package p000;

/* renamed from: tq */
/* loaded from: classes2.dex */
public final class C6911tq {

    /* renamed from: a */
    public final String f43353a;

    /* renamed from: b */
    public final int f43354b;

    /* renamed from: c */
    public final AbstractC10396nS1 f43355c;

    public C6911tq(String str, int i, AbstractC10396nS1 abstractC10396nS1) {
        O90.m5969g(str, "string");
        this.f43353a = str;
        this.f43354b = i;
        this.f43355c = abstractC10396nS1;
    }

    /* renamed from: a */
    public final C6911tq m24995a() {
        String str = this.f43353a;
        if (str != null) {
            return new C6911tq(AbstractC11374v51.m25338M(str).toString(), str.length() - this.f43354b, this.f43355c);
        }
        throw new C7841Kd1("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6911tq)) {
            return false;
        }
        C6911tq c6911tq = (C6911tq) obj;
        return O90.m5963a(this.f43353a, c6911tq.f43353a) && this.f43354b == c6911tq.f43354b && O90.m5963a(this.f43355c, c6911tq.f43355c);
    }

    public final int hashCode() {
        String str = this.f43353a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f43354b) * 31;
        AbstractC10396nS1 abstractC10396nS1 = this.f43355c;
        return iHashCode + (abstractC10396nS1 != null ? abstractC10396nS1.hashCode() : 0);
    }

    public final String toString() {
        return "CaretString(string=" + this.f43353a + ", caretPosition=" + this.f43354b + ", caretGravity=" + this.f43355c + ")";
    }
}
