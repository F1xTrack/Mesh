package p000;

/* renamed from: eZ */
/* loaded from: classes2.dex */
public final class C3998eZ extends AbstractC1259U0 {

    /* renamed from: c */
    public final char f26750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3998eZ(AbstractC1259U0 abstractC1259U0, char c) {
        super(10, abstractC1259U0);
        O90.m5969g(abstractC1259U0, "child");
        this.f26750c = c;
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: d1 */
    public final C11731xv0 mo3655d1(char c) {
        char c2 = this.f26750c;
        return c2 == c ? new C11731xv0(mo7844m1(), Character.valueOf(c), true, null) : new C11731xv0(mo7844m1(), Character.valueOf(c2), false, null);
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: e1 */
    public final C11731xv0 mo6078e1() {
        return new C11731xv0(mo7844m1(), Character.valueOf(this.f26750c), false, null);
    }

    @Override // p000.AbstractC1259U0
    public final String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.f26750c);
        sb.append(" -> ");
        AbstractC1259U0 abstractC1259U0 = (AbstractC1259U0) this.f11615b;
        sb.append(abstractC1259U0 == null ? "null" : abstractC1259U0.toString());
        return sb.toString();
    }
}
