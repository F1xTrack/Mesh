package defpackage;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class VI1 extends AbstractRunnableC7951xG1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ IS g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VI1(IS is, Activity activity, int i) {
        super((CG1) is.b, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = activity;
                this.g = is;
                super((CG1) is.b, true);
                break;
            case 2:
                this.f = activity;
                this.g = is;
                super((CG1) is.b, true);
                break;
            case 3:
                this.f = activity;
                this.g = is;
                super((CG1) is.b, true);
                break;
            case 4:
                this.f = activity;
                this.g = is;
                super((CG1) is.b, true);
                break;
            default:
                this.f = activity;
                this.g = is;
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void a() {
        switch (this.e) {
            case 0:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(((CG1) this.g.b).h)).onActivityStartedByScionActivityInfo(C7380uG1.i0(this.f), this.b);
                break;
            case 1:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(((CG1) this.g.b).h)).onActivityPausedByScionActivityInfo(C7380uG1.i0(this.f), this.b);
                break;
            case 2:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(((CG1) this.g.b).h)).onActivityResumedByScionActivityInfo(C7380uG1.i0(this.f), this.b);
                break;
            case 3:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(((CG1) this.g.b).h)).onActivityStoppedByScionActivityInfo(C7380uG1.i0(this.f), this.b);
                break;
            default:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(((CG1) this.g.b).h)).onActivityDestroyedByScionActivityInfo(C7380uG1.i0(this.f), this.b);
                break;
        }
    }
}
