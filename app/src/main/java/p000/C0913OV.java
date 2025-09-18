package p000;

/* renamed from: OV */
/* loaded from: classes2.dex */
public final class C0913OV extends AbstractC1259U0 {

    /* renamed from: c */
    public final char f8459c;

    public C0913OV(AbstractC1259U0 abstractC1259U0, char c) {
        super(10, abstractC1259U0);
        this.f8459c = c;
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: d1 */
    public final C11731xv0 mo3655d1(char c) {
        char c2 = this.f8459c;
        return c2 == c ? new C11731xv0(mo7844m1(), Character.valueOf(c), true, Character.valueOf(c)) : new C11731xv0(mo7844m1(), Character.valueOf(c2), false, Character.valueOf(c2));
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: e1 */
    public final C11731xv0 mo6078e1() {
        AbstractC1259U0 abstractC1259U0Mo7844m1 = mo7844m1();
        char c = this.f8459c;
        return new C11731xv0(abstractC1259U0Mo7844m1, Character.valueOf(c), false, Character.valueOf(c));
    }

    @Override // p000.AbstractC1259U0
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f8459c);
        sb.append("} -> ");
        AbstractC1259U0 abstractC1259U0 = (AbstractC1259U0) this.f11615b;
        sb.append(abstractC1259U0 == null ? "null" : abstractC1259U0.toString());
        return sb.toString();
    }
}
