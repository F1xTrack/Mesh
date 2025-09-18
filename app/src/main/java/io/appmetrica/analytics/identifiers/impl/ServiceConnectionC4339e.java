package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: io.appmetrica.analytics.identifiers.impl.e */
/* loaded from: classes2.dex */
public final class ServiceConnectionC4339e implements ServiceConnection {

    /* renamed from: a */
    public final Intent f29818a;

    /* renamed from: b */
    public IBinder f29819b;

    /* renamed from: c */
    public final Object f29820c = new Object();

    public ServiceConnectionC4339e(Intent intent, String str) {
        this.f29818a = intent;
    }

    /* renamed from: a */
    public final void m19172a(Context context) {
        synchronized (this.f29820c) {
            this.f29819b = null;
            this.f29820c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f29820c) {
            this.f29819b = null;
            this.f29820c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f29820c) {
            this.f29820c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f29820c) {
            this.f29819b = iBinder;
            this.f29820c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f29820c) {
            this.f29819b = null;
            this.f29820c.notifyAll();
        }
    }
}
