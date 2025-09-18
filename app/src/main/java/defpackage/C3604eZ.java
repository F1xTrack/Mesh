package defpackage;

/* renamed from: eZ */
/* loaded from: classes2.dex */
public final class C3604eZ extends U0 {
    public final char c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3604eZ(U0 u0, char c) {
        super(10, u0);
        O90.g(u0, "child");
        this.c = c;
    }

    @Override // defpackage.U0
    public final C8073xv0 d1(char c) {
        char c2 = this.c;
        return c2 == c ? new C8073xv0(m1(), Character.valueOf(c), true, null) : new C8073xv0(m1(), Character.valueOf(c2), false, null);
    }

    @Override // defpackage.U0
    public final C8073xv0 e1() {
        return new C8073xv0(m1(), Character.valueOf(this.c), false, null);
    }

    @Override // defpackage.U0
    public final String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.c);
        sb.append(" -> ");
        U0 u0 = (U0) this.b;
        sb.append(u0 == null ? "null" : u0.toString());
        return sb.toString();
    }
}
