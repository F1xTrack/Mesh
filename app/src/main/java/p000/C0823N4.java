package p000;

import java.util.List;

/* renamed from: N4 */
/* loaded from: classes.dex */
public final class C0823N4 implements InterfaceC1074R4 {

    /* renamed from: a */
    public final C0698L4 f7484a;

    /* renamed from: b */
    public final C0698L4 f7485b;

    public C0823N4(C0698L4 c0698l4, C0698L4 c0698l42) {
        this.f7484a = c0698l4;
        this.f7485b = c0698l42;
    }

    @Override // p000.InterfaceC1074R4
    /* renamed from: M0 */
    public final AbstractC6378lg mo4553M0() {
        return new C11497w31(this.f7484a.mo4553M0(), this.f7485b.mo4553M0());
    }

    @Override // p000.InterfaceC1074R4
    /* renamed from: V0 */
    public final List mo5469V0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p000.InterfaceC1074R4
    /* renamed from: Z0 */
    public final boolean mo5470Z0() {
        return this.f7484a.mo5470Z0() && this.f7485b.mo5470Z0();
    }
}
