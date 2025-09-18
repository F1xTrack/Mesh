package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: Gt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC7665Gt1 implements ServiceConnection {

    /* renamed from: a */
    public final Context f3946a;

    /* renamed from: b */
    public final String f3947b;

    /* renamed from: c */
    public final C8501Wv1 f3948c;

    /* renamed from: d */
    public final C8501Wv1 f3949d;

    public ServiceConnectionC7665Gt1(Context context, String str, C8501Wv1 c8501Wv1, C8501Wv1 c8501Wv12) {
        O90.m5968f(str, "applicationId");
        this.f3946a = context;
        this.f3947b = str;
        this.f3948c = c8501Wv1;
        this.f3949d = c8501Wv12;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC7879Kw1 c7671Gw1;
        try {
            int i = AbstractBinderC7723Hw1.f4610a;
            if (iBinder == null) {
                c7671Gw1 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.review.ReviewProvider");
                c7671Gw1 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7879Kw1)) ? new C7671Gw1(iBinder) : (InterfaceC7879Kw1) iInterfaceQueryLocalInterface;
            }
            ((C7671Gw1) c7671Gw1).m3200H(this.f3947b, new BinderC10193lt0(this));
        } catch (Exception e) {
            C8501Wv1 c8501Wv1 = this.f3949d;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            c8501Wv1.invoke(new TT0(message));
            try {
                this.f3946a.unbindService(this);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f3949d.invoke(new TT0("onServiceDisconnected"));
        try {
            this.f3946a.unbindService(this);
        } catch (Throwable unused) {
        }
    }
}
