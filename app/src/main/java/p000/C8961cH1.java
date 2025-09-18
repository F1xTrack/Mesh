package p000;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: cH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8961cH1 extends AbstractRunnableC11650xG1 {

    /* renamed from: e */
    public final /* synthetic */ int f17410e;

    /* renamed from: f */
    public final /* synthetic */ String f17411f;

    /* renamed from: g */
    public final /* synthetic */ CG1 f17412g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8961cH1(CG1 cg1, String str, int i) {
        super(cg1, true);
        this.f17410e = i;
        this.f17411f = str;
        this.f17412g = cg1;
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: a */
    public final void mo1137a() {
        switch (this.f17410e) {
            case 0:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f17412g.f1294h)).setUserId(this.f17411f, this.f45510a);
                break;
            case 1:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f17412g.f1294h)).beginAdUnitExposure(this.f17411f, this.f45511b);
                break;
            default:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f17412g.f1294h)).endAdUnitExposure(this.f17411f, this.f45511b);
                break;
        }
    }
}
