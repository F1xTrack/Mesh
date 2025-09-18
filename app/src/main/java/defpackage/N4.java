package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class N4 implements R4 {
    public final L4 a;
    public final L4 b;

    public N4(L4 l4, L4 l42) {
        this.a = l4;
        this.b = l42;
    }

    @Override // defpackage.R4
    public final AbstractC5738lg M0() {
        return new C7722w31(this.a.M0(), this.b.M0());
    }

    @Override // defpackage.R4
    public final List V0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.R4
    public final boolean Z0() {
        return this.a.Z0() && this.b.Z0();
    }
}
