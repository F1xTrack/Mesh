package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class ZY0 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ int f14964a;

    /* renamed from: b */
    public final /* synthetic */ Object f14965b;

    public /* synthetic */ ZY0(int i, Object obj) {
        this.f14964a = i;
        this.f14965b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj = this.f14965b;
        switch (this.f14964a) {
            case 0:
                C8071Oo1 c8071Oo1 = (C8071Oo1) obj;
                ((LinkedBlockingDeque) c8071Oo1.f8629c).size();
                c8071Oo1.f8628b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                ((LinkedBlockingDeque) c8071Oo1.f8629c).drainTo(arrayList);
                AbstractC9366fP1.m18230b(AbstractC11432vY1.m25444a((InterfaceC0125Bz) c8071Oo1.f8627a), null, new YY0(c8071Oo1, arrayList, null), 3);
                break;
            case 1:
                C7463Cw1 c7463Cw1 = (C7463Cw1) obj;
                c7463Cw1.f1768b.m409a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                c7463Cw1.m1477a().post(new C9176dw1(this, iBinder));
                break;
            default:
                C11364v12 c11364v12 = (C11364v12) obj;
                c11364v12.f44093b.m24361q("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                c11364v12.m25306a().post(new ZH1(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj = this.f14965b;
        switch (this.f14964a) {
            case 0:
                C8071Oo1 c8071Oo1 = (C8071Oo1) obj;
                c8071Oo1.f8628b = null;
                c8071Oo1.getClass();
                break;
            case 1:
                C7463Cw1 c7463Cw1 = (C7463Cw1) obj;
                c7463Cw1.f1768b.m409a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                c7463Cw1.m1477a().post(new C9816iw1(1, this));
                break;
            default:
                C11364v12 c11364v12 = (C11364v12) obj;
                c11364v12.f44093b.m24361q("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                c11364v12.m25306a().post(new WV1(1, this));
                break;
        }
    }
}
