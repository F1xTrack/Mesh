package defpackage;

/* loaded from: classes2.dex */
public final class OV extends U0 {
    public final char c;

    public OV(U0 u0, char c) {
        super(10, u0);
        this.c = c;
    }

    @Override // defpackage.U0
    public final C8073xv0 d1(char c) {
        char c2 = this.c;
        return c2 == c ? new C8073xv0(m1(), Character.valueOf(c), true, Character.valueOf(c)) : new C8073xv0(m1(), Character.valueOf(c2), false, Character.valueOf(c2));
    }

    @Override // defpackage.U0
    public final C8073xv0 e1() {
        U0 u0M1 = m1();
        char c = this.c;
        return new C8073xv0(u0M1, Character.valueOf(c), false, Character.valueOf(c));
    }

    @Override // defpackage.U0
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.c);
        sb.append("} -> ");
        U0 u0 = (U0) this.b;
        sb.append(u0 == null ? "null" : u0.toString());
        return sb.toString();
    }
}
