package defpackage;

/* renamed from: qQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6645qQ {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6645qQ.class != obj.getClass()) {
            return false;
        }
        C6645qQ c6645qQ = (C6645qQ) obj;
        return this.a == c6645qQ.a && this.b == c6645qQ.b && this.c == c6645qQ.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
