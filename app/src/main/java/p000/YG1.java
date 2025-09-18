package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class YG1 extends AbstractRunnableC11650xG1 {

    /* renamed from: e */
    public final /* synthetic */ int f14221e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f14222f;

    /* renamed from: g */
    public final /* synthetic */ CG1 f14223g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ YG1(CG1 cg1, Bundle bundle, int i) {
        super(cg1, true);
        this.f14221e = i;
        this.f14222f = bundle;
        this.f14223g = cg1;
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: a */
    public final void mo1137a() {
        switch (this.f14221e) {
            case 0:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f14223g.f1294h)).setConditionalUserProperty(this.f14222f, this.f45510a);
                break;
            case 1:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f14223g.f1294h)).setConsentThirdParty(this.f14222f, this.f45510a);
                break;
            default:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f14223g.f1294h)).setDefaultEventParameters(this.f14222f);
                break;
        }
    }
}
