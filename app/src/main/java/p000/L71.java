package p000;

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
public final class L71 implements InterfaceC3989eQ {

    /* renamed from: j */
    public static final /* synthetic */ int f6500j = 0;

    /* renamed from: a */
    public final Context f6501a;

    /* renamed from: b */
    public final C8539Xo1 f6502b;

    /* renamed from: c */
    public final C8773ap1 f6503c;

    /* renamed from: d */
    public final PD0 f6504d;

    /* renamed from: e */
    public final C7863Ko1 f6505e;

    /* renamed from: f */
    public final C0875Nu f6506f;

    /* renamed from: g */
    public final ArrayList f6507g;

    /* renamed from: h */
    public Intent f6508h;

    /* renamed from: i */
    public SystemAlarmService f6509i;

    static {
        C1210TE.m7637M("SystemAlarmDispatcher");
    }

    public L71(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f6501a = applicationContext;
        this.f6506f = new C0875Nu(applicationContext, new C4238iN(27, (byte) 0));
        C7863Ko1 c7863Ko1M4736d = C7863Ko1.m4736d(systemAlarmService);
        this.f6505e = c7863Ko1M4736d;
        this.f6503c = new C8773ap1((C8342Tu0) c7863Ko1M4736d.f6315b.f42157g);
        PD0 pd0 = c7863Ko1M4736d.f6319f;
        this.f6504d = pd0;
        this.f6502b = c7863Ko1M4736d.f6317d;
        pd0.m6258b(this);
        this.f6507g = new ArrayList();
        this.f6508h = null;
    }

    /* renamed from: c */
    public static void m4901c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // p000.InterfaceC3989eQ
    /* renamed from: a */
    public final void mo4902a(C7551Eo1 c7551Eo1, boolean z) {
        ExecutorC9387fa0 executorC9387fa0 = (ExecutorC9387fa0) this.f6502b.f13983d;
        int i = C0875Nu.f8119e;
        Intent intent = new Intent(this.f6501a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        C0875Nu.m5902e(intent, c7551Eo1);
        executorC9387fa0.execute(new RunnableC6217j7(this, intent, 0, 4));
    }

    /* renamed from: b */
    public final void m4903b(int i, Intent intent) {
        C1210TE c1210teM7634G = C1210TE.m7634G();
        Objects.toString(intent);
        c1210teM7634G.getClass();
        m4901c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C1210TE.m7634G().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m4904d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f6507g) {
            try {
                boolean zIsEmpty = this.f6507g.isEmpty();
                this.f6507g.add(intent);
                if (zIsEmpty) {
                    m4905e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final boolean m4904d() {
        m4901c();
        synchronized (this.f6507g) {
            try {
                Iterator it = this.f6507g.iterator();
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

    /* renamed from: e */
    public final void m4905e() {
        m4901c();
        PowerManager.WakeLock wakeLockM24777a = AbstractC11076sm1.m24777a(this.f6501a, "ProcessCommand");
        try {
            wakeLockM24777a.acquire();
            this.f6505e.f6317d.m9154x(new K71(this, 0));
        } finally {
            wakeLockM24777a.release();
        }
    }
}
