package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: Gt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC0547Gt1 implements ServiceConnection {
    public final Context a;
    public final String b;
    public final C1800Wv1 c;
    public final C1800Wv1 d;

    public ServiceConnectionC0547Gt1(Context context, String str, C1800Wv1 c1800Wv1, C1800Wv1 c1800Wv12) {
        O90.f(str, "applicationId");
        this.a = context;
        this.b = str;
        this.c = c1800Wv1;
        this.d = c1800Wv12;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0868Kw1 c0556Gw1;
        try {
            int i = AbstractBinderC0634Hw1.a;
            if (iBinder == null) {
                c0556Gw1 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.review.ReviewProvider");
                c0556Gw1 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0868Kw1)) ? new C0556Gw1(iBinder) : (InterfaceC0868Kw1) iInterfaceQueryLocalInterface;
            }
            ((C0556Gw1) c0556Gw1).H(this.b, new BinderC5778lt0(this));
        } catch (Exception e) {
            C1800Wv1 c1800Wv1 = this.d;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            c1800Wv1.invoke(new TT0(message));
            try {
                this.a.unbindService(this);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.d.invoke(new TT0("onServiceDisconnected"));
        try {
            this.a.unbindService(this);
        } catch (Throwable unused) {
        }
    }
}
