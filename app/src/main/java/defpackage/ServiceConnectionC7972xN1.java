package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: xN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC7972xN1 implements ServiceConnection {
    public final String a;
    public final /* synthetic */ AN1 b;

    public ServiceConnectionC7972xN1(AN1 an1, String str) {
        this.b = an1;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3386dP1 c3386dP1 = this.b.a;
        if (iBinder == null) {
            OL1 ol1 = c3386dP1.i;
            C3386dP1.e(ol1);
            ol1.j.d("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = AbstractBinderC7177tC1.a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            InterfaceC7559vC1 qc1 = iInterfaceQueryLocalInterface instanceof InterfaceC7559vC1 ? (InterfaceC7559vC1) iInterfaceQueryLocalInterface : new QC1(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            if (qc1 == null) {
                OL1 ol12 = c3386dP1.i;
                C3386dP1.e(ol12);
                ol12.j.d("Install Referrer Service implementation was not found");
            } else {
                OL1 ol13 = c3386dP1.i;
                C3386dP1.e(ol13);
                ol13.o.d("Install Referrer Service connected");
                C7595vO1 c7595vO1 = c3386dP1.j;
                C3386dP1.e(c7595vO1);
                c7595vO1.E1(new WZ(this, qc1, this));
            }
        } catch (RuntimeException e) {
            OL1 ol14 = c3386dP1.i;
            C3386dP1.e(ol14);
            ol14.j.c(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        OL1 ol1 = this.b.a.i;
        C3386dP1.e(ol1);
        ol1.o.d("Install Referrer Service disconnected");
    }
}
