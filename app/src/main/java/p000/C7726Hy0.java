package p000;

/* renamed from: Hy0 */
/* loaded from: classes2.dex */
public final class C7726Hy0 extends AbstractC1259U0 {

    /* renamed from: c */
    public final DJ1 f4620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7726Hy0(AbstractC1259U0 abstractC1259U0, DJ1 dj1) {
        super(10, abstractC1259U0);
        O90.m5969g(abstractC1259U0, "child");
        this.f4620c = dj1;
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: d1 */
    public final C11731xv0 mo3655d1(char c) {
        boolean zM25352q;
        DJ1 dj1 = this.f4620c;
        if (dj1 instanceof C7674Gy0) {
            zM25352q = Character.isDigit(c);
        } else if (dj1 instanceof C7622Fy0) {
            zM25352q = Character.isLetter(c);
        } else if (dj1 instanceof C7518Dy0) {
            zM25352q = Character.isLetterOrDigit(c);
        } else {
            if (!(dj1 instanceof C7570Ey0)) {
                throw new C6838sg();
            }
            zM25352q = AbstractC11374v51.m25352q(((C7570Ey0) dj1).f2986d, c);
        }
        return zM25352q ? new C11731xv0(mo7844m1(), Character.valueOf(c), true, Character.valueOf(c)) : new C11731xv0(mo7844m1(), null, false, null);
    }

    @Override // p000.AbstractC1259U0
    public final String toString() {
        DJ1 dj1 = this.f4620c;
        boolean z = dj1 instanceof C7622Fy0;
        AbstractC1259U0 abstractC1259U0 = (AbstractC1259U0) this.f11615b;
        if (z) {
            StringBuilder sb = new StringBuilder("[a] -> ");
            sb.append(abstractC1259U0 != null ? abstractC1259U0.toString() : "null");
            return sb.toString();
        }
        if (dj1 instanceof C7674Gy0) {
            StringBuilder sb2 = new StringBuilder("[9] -> ");
            sb2.append(abstractC1259U0 != null ? abstractC1259U0.toString() : "null");
            return sb2.toString();
        }
        if (dj1 instanceof C7518Dy0) {
            StringBuilder sb3 = new StringBuilder("[-] -> ");
            sb3.append(abstractC1259U0 != null ? abstractC1259U0.toString() : "null");
            return sb3.toString();
        }
        if (!(dj1 instanceof C7570Ey0)) {
            throw new C6838sg();
        }
        StringBuilder sb4 = new StringBuilder("[");
        sb4.append(((C7570Ey0) dj1).f2985c);
        sb4.append("] -> ");
        sb4.append(abstractC1259U0 != null ? abstractC1259U0.toString() : "null");
        return sb4.toString();
    }
}
