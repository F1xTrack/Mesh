package defpackage;

/* renamed from: tq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7295tq {
    public final String a;
    public final int b;
    public final AbstractC6080nS1 c;

    public C7295tq(String str, int i, AbstractC6080nS1 abstractC6080nS1) {
        O90.g(str, "string");
        this.a = str;
        this.b = i;
        this.c = abstractC6080nS1;
    }

    public final C7295tq a() {
        String str = this.a;
        if (str != null) {
            return new C7295tq(AbstractC7538v51.M(str).toString(), str.length() - this.b, this.c);
        }
        throw new C0811Kd1("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7295tq)) {
            return false;
        }
        C7295tq c7295tq = (C7295tq) obj;
        return O90.a(this.a, c7295tq.a) && this.b == c7295tq.b && O90.a(this.c, c7295tq.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
        AbstractC6080nS1 abstractC6080nS1 = this.c;
        return iHashCode + (abstractC6080nS1 != null ? abstractC6080nS1.hashCode() : 0);
    }

    public final String toString() {
        return "CaretString(string=" + this.a + ", caretPosition=" + this.b + ", caretGravity=" + this.c + ")";
    }
}
