package p000;

/* renamed from: qQ */
/* loaded from: classes2.dex */
public final class C6679qQ {

    /* renamed from: a */
    public int f40863a;

    /* renamed from: b */
    public int f40864b;

    /* renamed from: c */
    public int f40865c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6679qQ.class != obj.getClass()) {
            return false;
        }
        C6679qQ c6679qQ = (C6679qQ) obj;
        return this.f40863a == c6679qQ.f40863a && this.f40864b == c6679qQ.f40864b && this.f40865c == c6679qQ.f40865c;
    }

    public final int hashCode() {
        return (((this.f40863a * 31) + this.f40864b) * 31) + this.f40865c;
    }
}
