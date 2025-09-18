package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class TH0 implements ServiceConnection {
    public Context a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ VH0 c;

    public TH0(VH0 vh0, Context context) {
        this.c = vh0;
        this.b = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        T40 t40;
        boolean zI;
        if (this.a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = S40.a;
        if (iBinder == null) {
            t40 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(T40.d);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof T40)) {
                R40 r40 = new R40();
                r40.a = iBinder;
                t40 = r40;
            } else {
                t40 = (T40) iInterfaceQueryLocalInterface;
            }
        }
        C0481Fx1 c0481Fx1 = new C0481Fx1();
        c0481Fx1.a = t40;
        this.c.d = c0481Fx1;
        try {
            zI = ((R40) t40).I();
        } catch (RemoteException unused) {
            zI = false;
        }
        if (!zI) {
            System.err.println("Couldn't warmup custom tabs client");
        }
        this.b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.c.d = null;
    }
}
