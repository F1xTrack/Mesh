package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class JH1 extends AbstractRunnableC7951xG1 {
    public final /* synthetic */ long e;
    public final /* synthetic */ CG1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JH1(CG1 cg1, long j) {
        super(cg1, true);
        this.e = j;
        this.f = cg1;
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void a() {
        ((InterfaceC2099aF1) Preconditions.checkNotNull(this.f.h)).setSessionTimeoutDuration(this.e);
    }
}
