package defpackage;

import android.content.ComponentName;

/* renamed from: vW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7619vW1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ServiceConnectionC6855rW1 b;

    public /* synthetic */ RunnableC7619vW1(ServiceConnectionC6855rW1 serviceConnectionC6855rW1, int i) {
        this.a = i;
        this.b = serviceConnectionC6855rW1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C2528cV1 c2528cV1 = this.b.c;
                c2528cV1.e = null;
                c2528cV1.L1();
                break;
            default:
                ServiceConnectionC6855rW1 serviceConnectionC6855rW1 = this.b;
                C2528cV1 c2528cV12 = serviceConnectionC6855rW1.c;
                ComponentName componentName = new ComponentName(((C3386dP1) serviceConnectionC6855rW1.c.b).a, "com.google.android.gms.measurement.AppMeasurementService");
                c2528cV12.v1();
                if (c2528cV12.e != null) {
                    c2528cV12.e = null;
                    c2528cV12.n().o.c(componentName, "Disconnected from device MeasurementService");
                    c2528cV12.v1();
                    c2528cV12.G1();
                    break;
                }
                break;
        }
    }
}
