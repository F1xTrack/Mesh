package p000;

/* renamed from: di1 */
/* loaded from: classes2.dex */
public final class C9148di1 extends AbstractC1259U0 {

    /* renamed from: c */
    public final AbstractC11489w02 f26223c;

    public C9148di1(AbstractC11489w02 abstractC11489w02) {
        super(10, (Object) null);
        this.f26223c = new C8759ai1(abstractC11489w02);
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: d1 */
    public final C11731xv0 mo3655d1(char c) {
        boolean zM25352q;
        AbstractC11489w02 abstractC11489w02 = this.f26223c;
        if (abstractC11489w02 instanceof C9015ci1) {
            zM25352q = Character.isDigit(c);
        } else if (abstractC11489w02 instanceof C8887bi1) {
            zM25352q = Character.isLetter(c);
        } else if (abstractC11489w02 instanceof C8577Yh1) {
            zM25352q = Character.isLetterOrDigit(c);
        } else if (abstractC11489w02 instanceof C8759ai1) {
            AbstractC11489w02 abstractC11489w022 = ((C8759ai1) abstractC11489w02).f15634a;
            zM25352q = abstractC11489w022 instanceof C9015ci1 ? Character.isDigit(c) : abstractC11489w022 instanceof C8887bi1 ? Character.isLetter(c) : abstractC11489w022 instanceof C8577Yh1 ? Character.isLetterOrDigit(c) : abstractC11489w022 instanceof C8629Zh1 ? AbstractC11374v51.m25352q(((C8629Zh1) abstractC11489w022).f15097b, c) : false;
        } else {
            if (!(abstractC11489w02 instanceof C8629Zh1)) {
                throw new C6838sg();
            }
            zM25352q = AbstractC11374v51.m25352q(((C8629Zh1) abstractC11489w02).f15097b, c);
        }
        if (zM25352q) {
            return new C11731xv0(mo7844m1(), Character.valueOf(c), true, Character.valueOf(c));
        }
        return null;
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: m1 */
    public final AbstractC1259U0 mo7844m1() {
        return this.f26223c instanceof C8759ai1 ? this : super.mo7844m1();
    }

    @Override // p000.AbstractC1259U0
    public final String toString() {
        AbstractC11489w02 abstractC11489w02 = this.f26223c;
        boolean z = abstractC11489w02 instanceof C8887bi1;
        AbstractC1259U0 abstractC1259U0 = (AbstractC1259U0) this.f11615b;
        if (z) {
            StringBuilder sb = new StringBuilder("[A] -> ");
            sb.append(abstractC1259U0 != null ? abstractC1259U0.toString() : "null");
            return sb.toString();
        }
        if (abstractC11489w02 instanceof C9015ci1) {
            StringBuilder sb2 = new StringBuilder("[0] -> ");
            sb2.append(abstractC1259U0 != null ? abstractC1259U0.toString() : "null");
            return sb2.toString();
        }
        if (abstractC11489w02 instanceof C8577Yh1) {
            StringBuilder sb3 = new StringBuilder("[_] -> ");
            sb3.append(abstractC1259U0 != null ? abstractC1259U0.toString() : "null");
            return sb3.toString();
        }
        if (abstractC11489w02 instanceof C8759ai1) {
            StringBuilder sb4 = new StringBuilder("[…] -> ");
            sb4.append(abstractC1259U0 != null ? abstractC1259U0.toString() : "null");
            return sb4.toString();
        }
        if (!(abstractC11489w02 instanceof C8629Zh1)) {
            throw new C6838sg();
        }
        StringBuilder sb5 = new StringBuilder("[");
        sb5.append(((C8629Zh1) abstractC11489w02).f15096a);
        sb5.append("] -> ");
        sb5.append(abstractC1259U0 != null ? abstractC1259U0.toString() : "null");
        return sb5.toString();
    }

    public C9148di1(AbstractC1259U0 abstractC1259U0, AbstractC11489w02 abstractC11489w02) {
        super(10, abstractC1259U0);
        this.f26223c = abstractC11489w02;
    }
}
