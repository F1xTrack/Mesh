package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes.dex */
public final class L7 implements AR1 {
    public final OF1 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public L7(AppMeasurementDynamiteService appMeasurementDynamiteService, OF1 of1) {
        this.b = appMeasurementDynamiteService;
        this.a = of1;
    }

    @Override // defpackage.AR1
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.a.x(j, bundle, str, str2);
        } catch (RemoteException e) {
            C3386dP1 c3386dP1 = this.b.a;
            if (c3386dP1 != null) {
                OL1 ol1 = c3386dP1.i;
                C3386dP1.e(ol1);
                ol1.j.c(e, "Event listener threw exception");
            }
        }
    }
}
