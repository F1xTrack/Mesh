package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class FY1 implements ServiceConnection {

    /* renamed from: a */
    public int f3302a = 0;

    /* renamed from: b */
    public final Messenger f3303b;

    /* renamed from: c */
    public C8165Qj1 f3304c;

    /* renamed from: d */
    public final ArrayDeque f3305d;

    /* renamed from: e */
    public final SparseArray f3306e;

    /* renamed from: f */
    public final /* synthetic */ C22 f3307f;

    public FY1(C22 c22) {
        this.f3307f = c22;
        HandlerC11145tJ0 handlerC11145tJ0 = new HandlerC11145tJ0(Looper.getMainLooper(), new C9954k10(3, this));
        Looper.getMainLooper();
        this.f3303b = new Messenger(handlerC11145tJ0);
        this.f3305d = new ArrayDeque();
        this.f3306e = new SparseArray();
    }

    /* renamed from: a */
    public final synchronized void m2668a(int i, String str) {
        m2669b(str, null);
    }

    /* renamed from: b */
    public final synchronized void m2669b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.f3302a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f3302a = 4;
                return;
            }
            this.f3302a = 4;
            ConnectionTracker.getInstance().unbindService((Context) this.f3307f.f1150b, this);
            C0226Da c0226Da = new C0226Da(14, str, securityException);
            Iterator it = this.f3305d.iterator();
            while (it.hasNext()) {
                ((C10209m02) it.next()).m22626b(c0226Da);
            }
            this.f3305d.clear();
            for (int i2 = 0; i2 < this.f3306e.size(); i2++) {
                ((C10209m02) this.f3306e.valueAt(i2)).m22626b(c0226Da);
            }
            this.f3306e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m2670c() {
        if (this.f3302a == 2 && this.f3305d.isEmpty() && this.f3306e.size() == 0) {
            this.f3302a = 3;
            ConnectionTracker.getInstance().unbindService((Context) this.f3307f.f1150b, this);
        }
    }

    /* renamed from: d */
    public final synchronized boolean m2671d(C10209m02 c10209m02) {
        int i = this.f3302a;
        if (i != 0) {
            if (i == 1) {
                this.f3305d.add(c10209m02);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f3305d.add(c10209m02);
            ((ScheduledExecutorService) this.f3307f.f1151c).execute(new RunnableC10776qQ1(this, 0));
            return true;
        }
        this.f3305d.add(c10209m02);
        Preconditions.checkState(this.f3302a == 0);
        this.f3302a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService((Context) this.f3307f.f1150b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f3307f.f1151c).schedule(new RunnableC10776qQ1(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                m2668a(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            m2669b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ScheduledExecutorService) this.f3307f.f1151c).execute(new RO1(this, 0, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ScheduledExecutorService) this.f3307f.f1151c).execute(new RunnableC10776qQ1(this, 2));
    }
}
