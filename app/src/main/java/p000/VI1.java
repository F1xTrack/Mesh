package p000;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class VI1 extends AbstractRunnableC11650xG1 {

    /* renamed from: e */
    public final /* synthetic */ int f12509e;

    /* renamed from: f */
    public final /* synthetic */ Activity f12510f;

    /* renamed from: g */
    public final /* synthetic */ C0533IS f12511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VI1(C0533IS c0533is, Activity activity, int i) {
        super((CG1) c0533is.f4939b, true);
        this.f12509e = i;
        switch (i) {
            case 1:
                this.f12510f = activity;
                this.f12511g = c0533is;
                super((CG1) c0533is.f4939b, true);
                break;
            case 2:
                this.f12510f = activity;
                this.f12511g = c0533is;
                super((CG1) c0533is.f4939b, true);
                break;
            case 3:
                this.f12510f = activity;
                this.f12511g = c0533is;
                super((CG1) c0533is.f4939b, true);
                break;
            case 4:
                this.f12510f = activity;
                this.f12511g = c0533is;
                super((CG1) c0533is.f4939b, true);
                break;
            default:
                this.f12510f = activity;
                this.f12511g = c0533is;
                break;
        }
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: a */
    public final void mo1137a() {
        switch (this.f12509e) {
            case 0:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(((CG1) this.f12511g.f4939b).f1294h)).onActivityStartedByScionActivityInfo(C11268uG1.m25147i0(this.f12510f), this.f45511b);
                break;
            case 1:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(((CG1) this.f12511g.f4939b).f1294h)).onActivityPausedByScionActivityInfo(C11268uG1.m25147i0(this.f12510f), this.f45511b);
                break;
            case 2:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(((CG1) this.f12511g.f4939b).f1294h)).onActivityResumedByScionActivityInfo(C11268uG1.m25147i0(this.f12510f), this.f45511b);
                break;
            case 3:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(((CG1) this.f12511g.f4939b).f1294h)).onActivityStoppedByScionActivityInfo(C11268uG1.m25147i0(this.f12510f), this.f45511b);
                break;
            default:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(((CG1) this.f12511g.f4939b).f1294h)).onActivityDestroyedByScionActivityInfo(C11268uG1.m25147i0(this.f12510f), this.f45511b);
                break;
        }
    }
}
