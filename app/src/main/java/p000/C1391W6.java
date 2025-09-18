package p000;

/* renamed from: W6 */
/* loaded from: classes.dex */
public final class C1391W6 extends AbstractViewOnTouchListenerC0034AX {

    /* renamed from: j */
    public final /* synthetic */ C3908d7 f12993j;

    /* renamed from: k */
    public final /* synthetic */ C4096g7 f12994k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1391W6(C4096g7 c4096g7, C4096g7 c4096g72, C3908d7 c3908d7) {
        super(c4096g72);
        this.f12994k = c4096g7;
        this.f12993j = c3908d7;
    }

    @Override // p000.AbstractViewOnTouchListenerC0034AX
    /* renamed from: b */
    public final InterfaceC11742y01 mo200b() {
        return this.f12993j;
    }

    @Override // p000.AbstractViewOnTouchListenerC0034AX
    /* renamed from: c */
    public final boolean mo201c() {
        C4096g7 c4096g7 = this.f12994k;
        if (c4096g7.getInternalPopup().mo9475a()) {
            return true;
        }
        c4096g7.f27573f.mo9484l(c4096g7.getTextDirection(), c4096g7.getTextAlignment());
        return true;
    }
}
