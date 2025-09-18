package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class PG1 extends AbstractRunnableC7951xG1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PG1(CG1 cg1, Object obj, Object obj2, int i) {
        super(cg1, true);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.f = cg1;
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void a() {
        InterfaceC2099aF1 interfaceC2099aF1AsInterface;
        Bundle bundle;
        switch (this.e) {
            case 0:
                try {
                    ((CG1) this.f).getClass();
                    Preconditions.checkNotNull((Context) this.g);
                    CG1 cg1 = (CG1) this.f;
                    Context context = (Context) this.g;
                    cg1.getClass();
                    try {
                        interfaceC2099aF1AsInterface = AbstractBinderC5850mF1.asInterface(MM.c(context, MM.d, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (JM e) {
                        cg1.e(e, true, false);
                        interfaceC2099aF1AsInterface = null;
                    }
                    cg1.h = interfaceC2099aF1AsInterface;
                    if (((CG1) this.f).h != null) {
                        int iA = MM.a((Context) this.g, ModuleDescriptor.MODULE_ID);
                        ((InterfaceC2099aF1) Preconditions.checkNotNull(((CG1) this.f).h)).initialize(new BinderC2421bx0((Context) this.g), new C3359dG1(114010L, Math.max(iA, r2), MM.d((Context) this.g, ModuleDescriptor.MODULE_ID, false) < iA, null, null, null, (Bundle) this.h, AO1.a((Context) this.g)), this.a);
                        break;
                    } else {
                        String str = ((CG1) this.f).a;
                        break;
                    }
                } catch (Exception e2) {
                    ((CG1) this.f).e(e2, true, false);
                    return;
                }
            case 1:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(((CG1) this.f).h)).logHealthData(5, (String) this.g, new BinderC2421bx0((Exception) this.h), new BinderC2421bx0(null), new BinderC2421bx0(null));
                break;
            case 2:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(((CG1) this.f).h)).getMaxUserProperties((String) this.g, (BinderC3546eF1) this.h);
                break;
            case 3:
                if (((Bundle) this.h) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.h).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.h).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                ((InterfaceC2099aF1) Preconditions.checkNotNull(((CG1) ((IS) this.f).b).h)).onActivityCreatedByScionActivityInfo(C7380uG1.i0((Activity) this.g), bundle, this.b);
                break;
            default:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(((CG1) ((IS) this.f).b).h)).onActivitySaveInstanceStateByScionActivityInfo(C7380uG1.i0((Activity) this.g), (BinderC3546eF1) this.h, this.b);
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public void b() {
        switch (this.e) {
            case 2:
                ((BinderC3546eF1) this.h).zza(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PG1(IS is, Activity activity, BinderC3546eF1 binderC3546eF1) {
        super((CG1) is.b, true);
        this.e = 4;
        this.g = activity;
        this.h = binderC3546eF1;
        this.f = is;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PG1(IS is, Bundle bundle, Activity activity) {
        super((CG1) is.b, true);
        this.e = 3;
        this.h = bundle;
        this.g = activity;
        this.f = is;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PG1(CG1 cg1, String str, Exception exc) {
        super(cg1, false);
        this.e = 1;
        this.g = str;
        this.h = exc;
        this.f = cg1;
    }
}
