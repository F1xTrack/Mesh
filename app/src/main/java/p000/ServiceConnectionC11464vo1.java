package p000;

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
public final class ServiceConnectionC11464vo1 implements ServiceConnection {

    /* renamed from: a */
    public final Context f44543a;

    /* renamed from: b */
    public final Intent f44544b;

    /* renamed from: c */
    public final ScheduledThreadPoolExecutor f44545c;

    /* renamed from: d */
    public final ArrayDeque f44546d;

    /* renamed from: e */
    public BinderC11208to1 f44547e;

    /* renamed from: f */
    public boolean f44548f;

    public ServiceConnectionC11464vo1(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f44546d = new ArrayDeque();
        this.f44548f = false;
        Context applicationContext = context.getApplicationContext();
        this.f44543a = applicationContext;
        this.f44544b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f44545c = scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public final synchronized void m25490a() {
        while (!this.f44546d.isEmpty()) {
            try {
                BinderC11208to1 binderC11208to1 = this.f44547e;
                if (binderC11208to1 == null || !binderC11208to1.isBinderAlive()) {
                    if (!this.f44548f) {
                        this.f44548f = true;
                        if (!ConnectionTracker.getInstance().bindService(this.f44543a, this.f44544b, this, 65)) {
                            this.f44548f = false;
                            while (true) {
                                ArrayDeque arrayDeque = this.f44546d;
                                if (arrayDeque.isEmpty()) {
                                    break;
                                } else {
                                    ((C11336uo1) arrayDeque.poll()).f43928b.m7186d(null);
                                }
                            }
                        }
                    }
                    return;
                }
                this.f44547e.m24989a((C11336uo1) this.f44546d.poll());
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final synchronized C9450g32 m25491b(Intent intent) {
        C11336uo1 c11336uo1;
        c11336uo1 = new C11336uo1(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f44545c;
        c11336uo1.f43928b.f10598a.m18386m(scheduledThreadPoolExecutor, new C8450Vw0(29, scheduledThreadPoolExecutor.schedule(new N61(12, c11336uo1), 20L, TimeUnit.SECONDS)));
        this.f44546d.add(c11336uo1);
        m25490a();
        return c11336uo1.f43928b.f10598a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f44548f = false;
            if (iBinder instanceof BinderC11208to1) {
                this.f44547e = (BinderC11208to1) iBinder;
                m25490a();
            } else {
                Objects.toString(iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.f44546d;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((C11336uo1) arrayDeque.poll()).f43928b.m7186d(null);
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
        m25490a();
    }
}
