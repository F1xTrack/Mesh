package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.f0 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC4538f0 implements ServiceConnection {
    public final /* synthetic */ C4562g0 a;

    public ServiceConnectionC4538f0(C4562g0 c4562g0) {
        this.a = c4562g0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a) {
            this.a.d = IAppMetricaService.Stub.asInterface(iBinder);
            this.a.e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a) {
            this.a.d = null;
        }
    }
}
