package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* loaded from: classes.dex */
public final class K71 implements Runnable {
    public final /* synthetic */ int a;
    public final L71 b;

    public /* synthetic */ K71(L71 l71, int i) {
        this.a = i;
        this.b = l71;
    }

    private final void a() {
        ExecutorC3799fa0 executorC3799fa0;
        K71 k71;
        int i = 1;
        synchronized (this.b.g) {
            L71 l71 = this.b;
            l71.h = (Intent) l71.g.get(0);
        }
        Intent intent = this.b.h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.b.h.getIntExtra("KEY_START_ID", 0);
            TE teG = TE.G();
            int i2 = L71.j;
            Objects.toString(this.b.h);
            teG.getClass();
            PowerManager.WakeLock wakeLockA = AbstractC7094sm1.a(this.b.a, action + " (" + intExtra + ")");
            try {
                try {
                    TE teG2 = TE.G();
                    wakeLockA.toString();
                    teG2.getClass();
                    wakeLockA.acquire();
                    L71 l712 = this.b;
                    l712.f.c(l712.h, intExtra, l712);
                    TE teG3 = TE.G();
                    wakeLockA.toString();
                    teG3.getClass();
                    wakeLockA.release();
                    L71 l713 = this.b;
                    executorC3799fa0 = (ExecutorC3799fa0) l713.b.d;
                    k71 = new K71(l713, i);
                } catch (Throwable unused) {
                    TE teG4 = TE.G();
                    int i3 = L71.j;
                    teG4.getClass();
                    TE teG5 = TE.G();
                    wakeLockA.toString();
                    teG5.getClass();
                    wakeLockA.release();
                    L71 l714 = this.b;
                    executorC3799fa0 = (ExecutorC3799fa0) l714.b.d;
                    k71 = new K71(l714, i);
                }
                executorC3799fa0.execute(k71);
            } catch (Throwable th) {
                TE teG6 = TE.G();
                int i4 = L71.j;
                wakeLockA.toString();
                teG6.getClass();
                wakeLockA.release();
                L71 l715 = this.b;
                ((ExecutorC3799fa0) l715.b.d).execute(new K71(l715, i));
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                L71 l71 = this.b;
                l71.getClass();
                TE.G().getClass();
                L71.c();
                synchronized (l71.g) {
                    try {
                        if (l71.h != null) {
                            TE teG = TE.G();
                            Objects.toString(l71.h);
                            teG.getClass();
                            if (!((Intent) l71.g.remove(0)).equals(l71.h)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            l71.h = null;
                        }
                        ExecutorC7157t6 executorC7157t6 = (ExecutorC7157t6) l71.b.b;
                        if (!l71.f.b() && l71.g.isEmpty() && !executorC7157t6.b()) {
                            TE.G().getClass();
                            SystemAlarmService systemAlarmService = l71.i;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        } else if (!l71.g.isEmpty()) {
                            l71.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
