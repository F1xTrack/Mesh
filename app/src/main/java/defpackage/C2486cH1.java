package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: cH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2486cH1 extends AbstractRunnableC7951xG1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ CG1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2486cH1(CG1 cg1, String str, int i) {
        super(cg1, true);
        this.e = i;
        this.f = str;
        this.g = cg1;
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void a() {
        switch (this.e) {
            case 0:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).setUserId(this.f, this.a);
                break;
            case 1:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).beginAdUnitExposure(this.f, this.b);
                break;
            default:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).endAdUnitExposure(this.f, this.b);
                break;
        }
    }
}
