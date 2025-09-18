package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class KO extends Service {
    public final ExecutorService a;
    public BinderC7291to1 b;
    public final Object c;
    public int d;
    public int e;

    public KO() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new Object();
        this.e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            AbstractC6903rm1.b(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    stopSelfResult(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.b == null) {
                this.b = new BinderC7291to1(new C1304Qm0(16, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) C6860rY0.x().e).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        S81 s81 = new S81();
        this.a.execute(new RunnableC1557Ts1(this, intent2, s81, 24));
        C3892g32 c3892g32 = s81.a;
        if (c3892g32.j()) {
            a(intent);
            return 2;
        }
        c3892g32.m(new ExecutorC4096h8(2), new C0515Gj(this, 27, intent));
        return 3;
    }
}
