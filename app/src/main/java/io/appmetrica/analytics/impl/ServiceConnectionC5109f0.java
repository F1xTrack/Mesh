package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.f0 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC5109f0 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C5134g0 f31646a;

    public ServiceConnectionC5109f0(C5134g0 c5134g0) {
        this.f31646a = c5134g0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f31646a) {
            this.f31646a.f31709d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f31646a.f31710e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f31646a) {
            this.f31646a.f31709d = null;
        }
    }
}
