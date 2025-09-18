package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: L7 */
/* loaded from: classes.dex */
public final class C0701L7 implements AR1 {

    /* renamed from: a */
    public final OF1 f6495a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f6496b;

    public C0701L7(AppMeasurementDynamiteService appMeasurementDynamiteService, OF1 of1) {
        this.f6496b = appMeasurementDynamiteService;
        this.f6495a = of1;
    }

    @Override // p000.AR1
    /* renamed from: a */
    public final void mo181a(long j, Bundle bundle, String str, String str2) {
        try {
            this.f6495a.mo6001x(j, bundle, str, str2);
        } catch (RemoteException e) {
            C9110dP1 c9110dP1 = this.f6496b.f18050a;
            if (c9110dP1 != null) {
                OL1 ol1 = c9110dP1.f26039i;
                C9110dP1.m17592e(ol1);
                ol1.f8381j.m24554c(e, "Event listener threw exception");
            }
        }
    }
}
