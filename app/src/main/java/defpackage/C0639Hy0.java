package defpackage;

/* renamed from: Hy0 */
/* loaded from: classes2.dex */
public final class C0639Hy0 extends U0 {
    public final DJ1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0639Hy0(U0 u0, DJ1 dj1) {
        super(10, u0);
        O90.g(u0, "child");
        this.c = dj1;
    }

    @Override // defpackage.U0
    public final C8073xv0 d1(char c) {
        boolean zQ;
        DJ1 dj1 = this.c;
        if (dj1 instanceof C0561Gy0) {
            zQ = Character.isDigit(c);
        } else if (dj1 instanceof C0483Fy0) {
            zQ = Character.isLetter(c);
        } else if (dj1 instanceof C0327Dy0) {
            zQ = Character.isLetterOrDigit(c);
        } else {
            if (!(dj1 instanceof C0405Ey0)) {
                throw new C7074sg();
            }
            zQ = AbstractC7538v51.q(((C0405Ey0) dj1).d, c);
        }
        return zQ ? new C8073xv0(m1(), Character.valueOf(c), true, Character.valueOf(c)) : new C8073xv0(m1(), null, false, null);
    }

    @Override // defpackage.U0
    public final String toString() {
        DJ1 dj1 = this.c;
        boolean z = dj1 instanceof C0483Fy0;
        U0 u0 = (U0) this.b;
        if (z) {
            StringBuilder sb = new StringBuilder("[a] -> ");
            sb.append(u0 != null ? u0.toString() : "null");
            return sb.toString();
        }
        if (dj1 instanceof C0561Gy0) {
            StringBuilder sb2 = new StringBuilder("[9] -> ");
            sb2.append(u0 != null ? u0.toString() : "null");
            return sb2.toString();
        }
        if (dj1 instanceof C0327Dy0) {
            StringBuilder sb3 = new StringBuilder("[-] -> ");
            sb3.append(u0 != null ? u0.toString() : "null");
            return sb3.toString();
        }
        if (!(dj1 instanceof C0405Ey0)) {
            throw new C7074sg();
        }
        StringBuilder sb4 = new StringBuilder("[");
        sb4.append(((C0405Ey0) dj1).c);
        sb4.append("] -> ");
        sb4.append(u0 != null ? u0.toString() : "null");
        return sb4.toString();
    }
}
