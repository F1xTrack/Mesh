package defpackage;

/* renamed from: nC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6030nC {
    public String a;
    public String b;
    public String[] c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6030nC)) {
            return false;
        }
        C6030nC c6030nC = (C6030nC) obj;
        return O90.a(this.a, c6030nC.a) && O90.a(this.b, c6030nC.b) && this.d == c6030nC.d && J8.f(this.c, c6030nC.c);
    }
}
