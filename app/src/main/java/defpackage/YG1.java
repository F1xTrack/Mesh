package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class YG1 extends AbstractRunnableC7951xG1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ CG1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ YG1(CG1 cg1, Bundle bundle, int i) {
        super(cg1, true);
        this.e = i;
        this.f = bundle;
        this.g = cg1;
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void a() {
        switch (this.e) {
            case 0:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).setConditionalUserProperty(this.f, this.a);
                break;
            case 1:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).setConsentThirdParty(this.f, this.a);
                break;
            default:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).setDefaultEventParameters(this.f);
                break;
        }
    }
}
