package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class DI1 extends AbstractRunnableC7951xG1 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ CG1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DI1(CG1 cg1, boolean z) {
        super(cg1, true);
        this.e = z;
        this.f = cg1;
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void a() {
        ((InterfaceC2099aF1) Preconditions.checkNotNull(this.f.h)).setDataCollectionEnabled(this.e);
    }
}
