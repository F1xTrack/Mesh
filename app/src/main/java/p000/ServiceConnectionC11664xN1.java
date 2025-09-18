package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: xN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC11664xN1 implements ServiceConnection {

    /* renamed from: a */
    public final String f45568a;

    /* renamed from: b */
    public final /* synthetic */ AN1 f45569b;

    public ServiceConnectionC11664xN1(AN1 an1, String str) {
        this.f45569b = an1;
        this.f45568a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C9110dP1 c9110dP1 = this.f45569b.f180a;
        if (iBinder == null) {
            OL1 ol1 = c9110dP1.f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24555d("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = AbstractBinderC11132tC1.f42949a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            InterfaceC11388vC1 qc1 = iInterfaceQueryLocalInterface instanceof InterfaceC11388vC1 ? (InterfaceC11388vC1) iInterfaceQueryLocalInterface : new QC1(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            if (qc1 == null) {
                OL1 ol12 = c9110dP1.f26039i;
                C9110dP1.m17592e(ol12);
                ol12.f8381j.m24555d("Install Referrer Service implementation was not found");
            } else {
                OL1 ol13 = c9110dP1.f26039i;
                C9110dP1.m17592e(ol13);
                ol13.f8386o.m24555d("Install Referrer Service connected");
                C11412vO1 c11412vO1 = c9110dP1.f26040j;
                C9110dP1.m17592e(c11412vO1);
                c11412vO1.m25412E1(new RunnableC1420WZ(this, qc1, this));
            }
        } catch (RuntimeException e) {
            OL1 ol14 = c9110dP1.f26039i;
            C9110dP1.m17592e(ol14);
            ol14.f8381j.m24554c(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        OL1 ol1 = this.f45569b.f180a.f26039i;
        C9110dP1.m17592e(ol1);
        ol1.f8386o.m24555d("Install Referrer Service disconnected");
    }
}
