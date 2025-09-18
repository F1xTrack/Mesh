package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class CH1 extends AbstractRunnableC7951xG1 {
    public final /* synthetic */ CG1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CH1(CG1 cg1) {
        super(cg1, true);
        this.e = cg1;
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void a() {
        ((InterfaceC2099aF1) Preconditions.checkNotNull(this.e.h)).resetAnalyticsData(this.a);
    }
}
