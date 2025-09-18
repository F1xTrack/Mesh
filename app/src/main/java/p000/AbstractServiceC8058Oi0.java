package p000;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.C1742a;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* renamed from: Oi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC8058Oi0 extends Service implements InterfaceC7902Li0 {

    /* renamed from: a */
    public final C8539Xo1 f8577a = new C8539Xo1(this);

    @Override // p000.InterfaceC7902Li0
    public final AbstractC7538Ei0 getLifecycle() {
        return (C1742a) this.f8577a.f13981b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        this.f8577a.m9128K(EnumC7382Bi0.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f8577a.m9128K(EnumC7382Bi0.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC7382Bi0 enumC7382Bi0 = EnumC7382Bi0.ON_STOP;
        C8539Xo1 c8539Xo1 = this.f8577a;
        c8539Xo1.m9128K(enumC7382Bi0);
        c8539Xo1.m9128K(EnumC7382Bi0.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f8577a.m9128K(EnumC7382Bi0.ON_START);
        super.onStart(intent, i);
    }
}
