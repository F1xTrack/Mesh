package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.a;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* renamed from: Oi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1136Oi0 extends Service implements InterfaceC0903Li0 {
    public final C1857Xo1 a = new C1857Xo1(this);

    @Override // defpackage.InterfaceC0903Li0
    public final AbstractC0357Ei0 getLifecycle() {
        return (a) this.a.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        O90.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        this.a.K(EnumC0123Bi0.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.K(EnumC0123Bi0.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0123Bi0 enumC0123Bi0 = EnumC0123Bi0.ON_STOP;
        C1857Xo1 c1857Xo1 = this.a;
        c1857Xo1.K(enumC0123Bi0);
        c1857Xo1.K(EnumC0123Bi0.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.K(EnumC0123Bi0.ON_START);
        super.onStart(intent, i);
    }
}
