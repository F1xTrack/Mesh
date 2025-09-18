package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class PG1 extends AbstractRunnableC11650xG1 {

    /* renamed from: e */
    public final /* synthetic */ int f8972e;

    /* renamed from: f */
    public final /* synthetic */ Object f8973f;

    /* renamed from: g */
    public final /* synthetic */ Object f8974g;

    /* renamed from: h */
    public final /* synthetic */ Object f8975h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PG1(CG1 cg1, Object obj, Object obj2, int i) {
        super(cg1, true);
        this.f8972e = i;
        this.f8974g = obj;
        this.f8975h = obj2;
        this.f8973f = cg1;
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: a */
    public final void mo1137a() {
        InterfaceC8701aF1 interfaceC8701aF1AsInterface;
        Bundle bundle;
        switch (this.f8972e) {
            case 0:
                try {
                    ((CG1) this.f8973f).getClass();
                    Preconditions.checkNotNull((Context) this.f8974g);
                    CG1 cg1 = (CG1) this.f8973f;
                    Context context = (Context) this.f8974g;
                    cg1.getClass();
                    try {
                        interfaceC8701aF1AsInterface = AbstractBinderC10242mF1.asInterface(C0778MM.m5342c(context, C0778MM.f7102d, ModuleDescriptor.MODULE_ID).m5348b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (C0590JM e) {
                        cg1.m1135e(e, true, false);
                        interfaceC8701aF1AsInterface = null;
                    }
                    cg1.f1294h = interfaceC8701aF1AsInterface;
                    if (((CG1) this.f8973f).f1294h != null) {
                        int iM5341a = C0778MM.m5341a((Context) this.f8974g, ModuleDescriptor.MODULE_ID);
                        ((InterfaceC8701aF1) Preconditions.checkNotNull(((CG1) this.f8973f).f1294h)).initialize(new BinderC8916bx0((Context) this.f8974g), new C9092dG1(114010L, Math.max(iM5341a, r2), C0778MM.m5343d((Context) this.f8974g, ModuleDescriptor.MODULE_ID, false) < iM5341a, null, null, null, (Bundle) this.f8975h, AO1.m173a((Context) this.f8974g)), this.f45510a);
                        break;
                    } else {
                        String str = ((CG1) this.f8973f).f1287a;
                        break;
                    }
                } catch (Exception e2) {
                    ((CG1) this.f8973f).m1135e(e2, true, false);
                    return;
                }
            case 1:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(((CG1) this.f8973f).f1294h)).logHealthData(5, (String) this.f8974g, new BinderC8916bx0((Exception) this.f8975h), new BinderC8916bx0(null), new BinderC8916bx0(null));
                break;
            case 2:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(((CG1) this.f8973f).f1294h)).getMaxUserProperties((String) this.f8974g, (BinderC9218eF1) this.f8975h);
                break;
            case 3:
                if (((Bundle) this.f8975h) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f8975h).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f8975h).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                ((InterfaceC8701aF1) Preconditions.checkNotNull(((CG1) ((C0533IS) this.f8973f).f4939b).f1294h)).onActivityCreatedByScionActivityInfo(C11268uG1.m25147i0((Activity) this.f8974g), bundle, this.f45511b);
                break;
            default:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(((CG1) ((C0533IS) this.f8973f).f4939b).f1294h)).onActivitySaveInstanceStateByScionActivityInfo(C11268uG1.m25147i0((Activity) this.f8974g), (BinderC9218eF1) this.f8975h, this.f45511b);
                break;
        }
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: b */
    public void mo4940b() {
        switch (this.f8972e) {
            case 2:
                ((BinderC9218eF1) this.f8975h).zza(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PG1(C0533IS c0533is, Activity activity, BinderC9218eF1 binderC9218eF1) {
        super((CG1) c0533is.f4939b, true);
        this.f8972e = 4;
        this.f8974g = activity;
        this.f8975h = binderC9218eF1;
        this.f8973f = c0533is;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PG1(C0533IS c0533is, Bundle bundle, Activity activity) {
        super((CG1) c0533is.f4939b, true);
        this.f8972e = 3;
        this.f8975h = bundle;
        this.f8974g = activity;
        this.f8973f = c0533is;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PG1(CG1 cg1, String str, Exception exc) {
        super(cg1, false);
        this.f8972e = 1;
        this.f8974g = str;
        this.f8975h = exc;
        this.f8973f = cg1;
    }
}
