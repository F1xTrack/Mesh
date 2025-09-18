package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class L71 implements InterfaceC3577eQ {
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final C1857Xo1 b;
    public final C2207ap1 c;
    public final PD0 d;
    public final C0844Ko1 e;
    public final C1093Nu f;
    public final ArrayList g;
    public Intent h;
    public SystemAlarmService i;

    static {
        TE.M("SystemAlarmDispatcher");
    }

    public L71(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.a = applicationContext;
        this.f = new C1093Nu(applicationContext, new C4332iN(27, (byte) 0));
        C0844Ko1 c0844Ko1D = C0844Ko1.d(systemAlarmService);
        this.e = c0844Ko1D;
        this.c = new C2207ap1((C1562Tu0) c0844Ko1D.b.g);
        PD0 pd0 = c0844Ko1D.f;
        this.d = pd0;
        this.b = c0844Ko1D.d;
        pd0.b(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // defpackage.InterfaceC3577eQ
    public final void a(C0376Eo1 c0376Eo1, boolean z) {
        ExecutorC3799fa0 executorC3799fa0 = (ExecutorC3799fa0) this.b.d;
        int i = C1093Nu.e;
        Intent intent = new Intent(this.a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        C1093Nu.e(intent, c0376Eo1);
        executorC3799fa0.execute(new RunnableC5251j7(this, intent, 0, 4));
    }

    public final void b(int i, Intent intent) {
        TE teG = TE.G();
        Objects.toString(intent);
        teG.getClass();
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            TE.G().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            try {
                boolean zIsEmpty = this.g.isEmpty();
                this.g.add(intent);
                if (zIsEmpty) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        c();
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        c();
        PowerManager.WakeLock wakeLockA = AbstractC7094sm1.a(this.a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.e.d.x(new K71(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
