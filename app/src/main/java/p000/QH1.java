package p000;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class QH1 extends AbstractRunnableC11650xG1 {

    /* renamed from: e */
    public final /* synthetic */ int f9556e;

    /* renamed from: f */
    public final /* synthetic */ BinderC9218eF1 f9557f;

    /* renamed from: g */
    public final /* synthetic */ CG1 f9558g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QH1(CG1 cg1, BinderC9218eF1 binderC9218eF1, int i) {
        super(cg1, true);
        this.f9556e = i;
        this.f9557f = binderC9218eF1;
        this.f9558g = cg1;
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: a */
    public final void mo1137a() {
        switch (this.f9556e) {
            case 0:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f9558g.f1294h)).getGmpAppId(this.f9557f);
                break;
            case 1:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f9558g.f1294h)).generateEventId(this.f9557f);
                break;
            case 2:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f9558g.f1294h)).getCachedAppInstanceId(this.f9557f);
                break;
            case 3:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f9558g.f1294h)).getCurrentScreenClass(this.f9557f);
                break;
            case 4:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f9558g.f1294h)).getCurrentScreenName(this.f9557f);
                break;
            case 5:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f9558g.f1294h)).getAppInstanceId(this.f9557f);
                break;
            default:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f9558g.f1294h)).getSessionId(this.f9557f);
                break;
        }
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: b */
    public final void mo4940b() {
        switch (this.f9556e) {
            case 0:
                this.f9557f.zza(null);
                break;
            case 1:
                this.f9557f.zza(null);
                break;
            case 2:
                this.f9557f.zza(null);
                break;
            case 3:
                this.f9557f.zza(null);
                break;
            case 4:
                this.f9557f.zza(null);
                break;
            case 5:
                this.f9557f.zza(null);
                break;
            default:
                this.f9557f.zza(null);
                break;
        }
    }
}
