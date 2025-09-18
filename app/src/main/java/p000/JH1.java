package p000;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class JH1 extends AbstractRunnableC11650xG1 {

    /* renamed from: e */
    public final /* synthetic */ long f5443e;

    /* renamed from: f */
    public final /* synthetic */ CG1 f5444f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JH1(CG1 cg1, long j) {
        super(cg1, true);
        this.f5443e = j;
        this.f5444f = cg1;
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: a */
    public final void mo1137a() {
        ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f5444f.f1294h)).setSessionTimeoutDuration(this.f5443e);
    }
}
