package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class QH1 extends AbstractRunnableC7951xG1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ BinderC3546eF1 f;
    public final /* synthetic */ CG1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QH1(CG1 cg1, BinderC3546eF1 binderC3546eF1, int i) {
        super(cg1, true);
        this.e = i;
        this.f = binderC3546eF1;
        this.g = cg1;
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void a() {
        switch (this.e) {
            case 0:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).getGmpAppId(this.f);
                break;
            case 1:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).generateEventId(this.f);
                break;
            case 2:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).getCachedAppInstanceId(this.f);
                break;
            case 3:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).getCurrentScreenClass(this.f);
                break;
            case 4:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).getCurrentScreenName(this.f);
                break;
            case 5:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).getAppInstanceId(this.f);
                break;
            default:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.g.h)).getSessionId(this.f);
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void b() {
        switch (this.e) {
            case 0:
                this.f.zza(null);
                break;
            case 1:
                this.f.zza(null);
                break;
            case 2:
                this.f.zza(null);
                break;
            case 3:
                this.f.zza(null);
                break;
            case 4:
                this.f.zza(null);
                break;
            case 5:
                this.f.zza(null);
                break;
            default:
                this.f.zza(null);
                break;
        }
    }
}
