package defpackage;

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
    public int a = 0;
    public final Messenger b;
    public C1296Qj1 c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ C22 f;

    public FY1(C22 c22) {
        this.f = c22;
        HandlerC7197tJ0 handlerC7197tJ0 = new HandlerC7197tJ0(Looper.getMainLooper(), new C5422k10(3, this));
        Looper.getMainLooper();
        this.b = new Messenger(handlerC7197tJ0);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized void a(int i, String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            this.a = 4;
            ConnectionTracker.getInstance().unbindService((Context) this.f.b, this);
            C0254Da c0254Da = new C0254Da(14, str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((C5802m02) it.next()).b(c0254Da);
            }
            this.d.clear();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                ((C5802m02) this.e.valueAt(i2)).b(c0254Da);
            }
            this.e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            this.a = 3;
            ConnectionTracker.getInstance().unbindService((Context) this.f.b, this);
        }
    }

    public final synchronized boolean d(C5802m02 c5802m02) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(c5802m02);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(c5802m02);
            ((ScheduledExecutorService) this.f.c).execute(new RunnableC6647qQ1(this, 0));
            return true;
        }
        this.d.add(c5802m02);
        Preconditions.checkState(this.a == 0);
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService((Context) this.f.b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f.c).schedule(new RunnableC6647qQ1(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ScheduledExecutorService) this.f.c).execute(new RO1(this, 0, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ScheduledExecutorService) this.f.c).execute(new RunnableC6647qQ1(this, 2));
    }
}
