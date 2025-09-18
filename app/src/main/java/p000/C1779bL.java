package p000;

/* renamed from: bL */
/* loaded from: classes.dex */
public final class C1779bL extends AbstractC1841cL {

    /* renamed from: h */
    public final /* synthetic */ int f16983h;

    @Override // p000.AbstractC1841cL
    /* renamed from: a */
    public final int mo10448a(int i, int i2, int i3, int i4) {
        switch (this.f16983h) {
            case 0:
                if (mo10449b(i, i2, i3, i4) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (AbstractC1841cL.f17438g) {
                }
                break;
        }
        return 2;
    }

    @Override // p000.AbstractC1841cL
    /* renamed from: b */
    public final float mo10449b(int i, int i2, int i3, int i4) {
        switch (this.f16983h) {
            case 0:
                return Math.min(1.0f, AbstractC1841cL.f17432a.mo10449b(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (AbstractC1841cL.f17438g) {
                    return Math.min(i3 / i, i4 / i2);
                }
                return Math.max(i2 / i4, i / i3) != 0 ? 1.0f / Integer.highestOneBit(r2) : 1.0f;
            default:
                return 1.0f;
        }
    }
}
