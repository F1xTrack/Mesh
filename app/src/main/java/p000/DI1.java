package p000;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class DI1 extends AbstractRunnableC11650xG1 {

    /* renamed from: e */
    public final /* synthetic */ boolean f1965e;

    /* renamed from: f */
    public final /* synthetic */ CG1 f1966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DI1(CG1 cg1, boolean z) {
        super(cg1, true);
        this.f1965e = z;
        this.f1966f = cg1;
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: a */
    public final void mo1137a() {
        ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f1966f.f1294h)).setDataCollectionEnabled(this.f1965e);
    }
}
