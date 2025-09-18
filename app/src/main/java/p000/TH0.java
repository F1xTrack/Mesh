package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class TH0 implements ServiceConnection {

    /* renamed from: a */
    public Context f11286a;

    /* renamed from: b */
    public final /* synthetic */ Context f11287b;

    /* renamed from: c */
    public final /* synthetic */ VH0 f11288c;

    public TH0(VH0 vh0, Context context) {
        this.f11288c = vh0;
        this.f11287b = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        T40 t40;
        boolean zM6894I;
        if (this.f11286a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = S40.f10575a;
        if (iBinder == null) {
            t40 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(T40.f11144d);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof T40)) {
                R40 r40 = new R40();
                r40.f9991a = iBinder;
                t40 = r40;
            } else {
                t40 = (T40) iInterfaceQueryLocalInterface;
            }
        }
        C7621Fx1 c7621Fx1 = new C7621Fx1();
        c7621Fx1.f3494a = t40;
        this.f11288c.f12493d = c7621Fx1;
        try {
            zM6894I = ((R40) t40).m6894I();
        } catch (RemoteException unused) {
            zM6894I = false;
        }
        if (!zM6894I) {
            System.err.println("Couldn't warmup custom tabs client");
        }
        this.f11287b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11288c.f12493d = null;
    }
}
