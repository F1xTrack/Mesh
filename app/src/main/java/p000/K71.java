package p000;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* loaded from: classes.dex */
public final class K71 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5911a;

    /* renamed from: b */
    public final L71 f5912b;

    public /* synthetic */ K71(L71 l71, int i) {
        this.f5911a = i;
        this.f5912b = l71;
    }

    /* renamed from: a */
    private final void m4567a() {
        ExecutorC9387fa0 executorC9387fa0;
        K71 k71;
        int i = 1;
        synchronized (this.f5912b.f6507g) {
            L71 l71 = this.f5912b;
            l71.f6508h = (Intent) l71.f6507g.get(0);
        }
        Intent intent = this.f5912b.f6508h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f5912b.f6508h.getIntExtra("KEY_START_ID", 0);
            C1210TE c1210teM7634G = C1210TE.m7634G();
            int i2 = L71.f6500j;
            Objects.toString(this.f5912b.f6508h);
            c1210teM7634G.getClass();
            PowerManager.WakeLock wakeLockM24777a = AbstractC11076sm1.m24777a(this.f5912b.f6501a, action + " (" + intExtra + ")");
            try {
                try {
                    C1210TE c1210teM7634G2 = C1210TE.m7634G();
                    wakeLockM24777a.toString();
                    c1210teM7634G2.getClass();
                    wakeLockM24777a.acquire();
                    L71 l712 = this.f5912b;
                    l712.f6506f.m5904c(l712.f6508h, intExtra, l712);
                    C1210TE c1210teM7634G3 = C1210TE.m7634G();
                    wakeLockM24777a.toString();
                    c1210teM7634G3.getClass();
                    wakeLockM24777a.release();
                    L71 l713 = this.f5912b;
                    executorC9387fa0 = (ExecutorC9387fa0) l713.f6502b.f13983d;
                    k71 = new K71(l713, i);
                } catch (Throwable unused) {
                    C1210TE c1210teM7634G4 = C1210TE.m7634G();
                    int i3 = L71.f6500j;
                    c1210teM7634G4.getClass();
                    C1210TE c1210teM7634G5 = C1210TE.m7634G();
                    wakeLockM24777a.toString();
                    c1210teM7634G5.getClass();
                    wakeLockM24777a.release();
                    L71 l714 = this.f5912b;
                    executorC9387fa0 = (ExecutorC9387fa0) l714.f6502b.f13983d;
                    k71 = new K71(l714, i);
                }
                executorC9387fa0.execute(k71);
            } catch (Throwable th) {
                C1210TE c1210teM7634G6 = C1210TE.m7634G();
                int i4 = L71.f6500j;
                wakeLockM24777a.toString();
                c1210teM7634G6.getClass();
                wakeLockM24777a.release();
                L71 l715 = this.f5912b;
                ((ExecutorC9387fa0) l715.f6502b.f13983d).execute(new K71(l715, i));
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5911a) {
            case 0:
                m4567a();
                return;
            default:
                L71 l71 = this.f5912b;
                l71.getClass();
                C1210TE.m7634G().getClass();
                L71.m4901c();
                synchronized (l71.f6507g) {
                    try {
                        if (l71.f6508h != null) {
                            C1210TE c1210teM7634G = C1210TE.m7634G();
                            Objects.toString(l71.f6508h);
                            c1210teM7634G.getClass();
                            if (!((Intent) l71.f6507g.remove(0)).equals(l71.f6508h)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            l71.f6508h = null;
                        }
                        ExecutorC6865t6 executorC6865t6 = (ExecutorC6865t6) l71.f6502b.f13981b;
                        if (!l71.f6506f.m5903b() && l71.f6507g.isEmpty() && !executorC6865t6.m24837b()) {
                            C1210TE.m7634G().getClass();
                            SystemAlarmService systemAlarmService = l71.f6509i;
                            if (systemAlarmService != null) {
                                systemAlarmService.m10335a();
                            }
                        } else if (!l71.f6507g.isEmpty()) {
                            l71.m4905e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
