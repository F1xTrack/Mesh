package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: vo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC7673vo1 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public BinderC7291to1 e;
    public boolean f;

    public ServiceConnectionC7673vo1(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        while (!this.d.isEmpty()) {
            try {
                BinderC7291to1 binderC7291to1 = this.e;
                if (binderC7291to1 == null || !binderC7291to1.isBinderAlive()) {
                    if (!this.f) {
                        this.f = true;
                        if (!ConnectionTracker.getInstance().bindService(this.a, this.b, this, 65)) {
                            this.f = false;
                            while (true) {
                                ArrayDeque arrayDeque = this.d;
                                if (arrayDeque.isEmpty()) {
                                    break;
                                } else {
                                    ((C7482uo1) arrayDeque.poll()).b.d(null);
                                }
                            }
                        }
                    }
                    return;
                }
                this.e.a((C7482uo1) this.d.poll());
            } finally {
            }
        }
    }

    public final synchronized C3892g32 b(Intent intent) {
        C7482uo1 c7482uo1;
        c7482uo1 = new C7482uo1(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
        c7482uo1.b.a.m(scheduledThreadPoolExecutor, new C1724Vw0(29, scheduledThreadPoolExecutor.schedule(new N61(12, c7482uo1), 20L, TimeUnit.SECONDS)));
        this.d.add(c7482uo1);
        a();
        return c7482uo1.b.a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f = false;
            if (iBinder instanceof BinderC7291to1) {
                this.e = (BinderC7291to1) iBinder;
                a();
            } else {
                Objects.toString(iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.d;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((C7482uo1) arrayDeque.poll()).b.d(null);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
