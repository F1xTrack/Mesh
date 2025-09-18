package defpackage;

/* renamed from: bL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2306bL extends AbstractC2496cL {
    public final /* synthetic */ int h;

    @Override // defpackage.AbstractC2496cL
    public final int a(int i, int i2, int i3, int i4) {
        switch (this.h) {
            case 0:
                if (b(i, i2, i3, i4) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (AbstractC2496cL.g) {
                }
                break;
        }
        return 2;
    }

    @Override // defpackage.AbstractC2496cL
    public final float b(int i, int i2, int i3, int i4) {
        switch (this.h) {
            case 0:
                return Math.min(1.0f, AbstractC2496cL.a.b(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (AbstractC2496cL.g) {
                    return Math.min(i3 / i, i4 / i2);
                }
                return Math.max(i2 / i4, i / i3) != 0 ? 1.0f / Integer.highestOneBit(r2) : 1.0f;
            default:
                return 1.0f;
        }
    }
}
