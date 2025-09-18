package defpackage;

/* renamed from: di1 */
/* loaded from: classes2.dex */
public final class C3443di1 extends U0 {
    public final AbstractC7711w02 c;

    public C3443di1(AbstractC7711w02 abstractC7711w02) {
        super(10, (Object) null);
        this.c = new C2186ai1(abstractC7711w02);
    }

    @Override // defpackage.U0
    public final C8073xv0 d1(char c) {
        boolean zQ;
        AbstractC7711w02 abstractC7711w02 = this.c;
        if (abstractC7711w02 instanceof C2567ci1) {
            zQ = Character.isDigit(c);
        } else if (abstractC7711w02 instanceof C2377bi1) {
            zQ = Character.isLetter(c);
        } else if (abstractC7711w02 instanceof C1914Yh1) {
            zQ = Character.isLetterOrDigit(c);
        } else if (abstractC7711w02 instanceof C2186ai1) {
            AbstractC7711w02 abstractC7711w022 = ((C2186ai1) abstractC7711w02).a;
            zQ = abstractC7711w022 instanceof C2567ci1 ? Character.isDigit(c) : abstractC7711w022 instanceof C2377bi1 ? Character.isLetter(c) : abstractC7711w022 instanceof C1914Yh1 ? Character.isLetterOrDigit(c) : abstractC7711w022 instanceof C1992Zh1 ? AbstractC7538v51.q(((C1992Zh1) abstractC7711w022).b, c) : false;
        } else {
            if (!(abstractC7711w02 instanceof C1992Zh1)) {
                throw new C7074sg();
            }
            zQ = AbstractC7538v51.q(((C1992Zh1) abstractC7711w02).b, c);
        }
        if (zQ) {
            return new C8073xv0(m1(), Character.valueOf(c), true, Character.valueOf(c));
        }
        return null;
    }

    @Override // defpackage.U0
    public final U0 m1() {
        return this.c instanceof C2186ai1 ? this : super.m1();
    }

    @Override // defpackage.U0
    public final String toString() {
        AbstractC7711w02 abstractC7711w02 = this.c;
        boolean z = abstractC7711w02 instanceof C2377bi1;
        U0 u0 = (U0) this.b;
        if (z) {
            StringBuilder sb = new StringBuilder("[A] -> ");
            sb.append(u0 != null ? u0.toString() : "null");
            return sb.toString();
        }
        if (abstractC7711w02 instanceof C2567ci1) {
            StringBuilder sb2 = new StringBuilder("[0] -> ");
            sb2.append(u0 != null ? u0.toString() : "null");
            return sb2.toString();
        }
        if (abstractC7711w02 instanceof C1914Yh1) {
            StringBuilder sb3 = new StringBuilder("[_] -> ");
            sb3.append(u0 != null ? u0.toString() : "null");
            return sb3.toString();
        }
        if (abstractC7711w02 instanceof C2186ai1) {
            StringBuilder sb4 = new StringBuilder("[…] -> ");
            sb4.append(u0 != null ? u0.toString() : "null");
            return sb4.toString();
        }
        if (!(abstractC7711w02 instanceof C1992Zh1)) {
            throw new C7074sg();
        }
        StringBuilder sb5 = new StringBuilder("[");
        sb5.append(((C1992Zh1) abstractC7711w02).a);
        sb5.append("] -> ");
        sb5.append(u0 != null ? u0.toString() : "null");
        return sb5.toString();
    }

    public C3443di1(U0 u0, AbstractC7711w02 abstractC7711w02) {
        super(10, u0);
        this.c = abstractC7711w02;
    }
}
