package p000;

import android.content.ComponentName;

/* renamed from: vW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11428vW1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44400a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnectionC10916rW1 f44401b;

    public /* synthetic */ RunnableC11428vW1(ServiceConnectionC10916rW1 serviceConnectionC10916rW1, int i) {
        this.f44400a = i;
        this.f44401b = serviceConnectionC10916rW1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44400a) {
            case 0:
                C8989cV1 c8989cV1 = this.f44401b.f41719c;
                c8989cV1.f17574e = null;
                c8989cV1.m10750L1();
                break;
            default:
                ServiceConnectionC10916rW1 serviceConnectionC10916rW1 = this.f44401b;
                C8989cV1 c8989cV12 = serviceConnectionC10916rW1.f41719c;
                ComponentName componentName = new ComponentName(((C9110dP1) serviceConnectionC10916rW1.f41719c.f11615b).f26031a, "com.google.android.gms.measurement.AppMeasurementService");
                c8989cV12.mo7681v1();
                if (c8989cV12.f17574e != null) {
                    c8989cV12.f17574e = null;
                    c8989cV12.mo6070n().f8386o.m24554c(componentName, "Disconnected from device MeasurementService");
                    c8989cV12.mo7681v1();
                    c8989cV12.m10745G1();
                    break;
                }
                break;
        }
    }
}
