package p000;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public abstract class VA1 {

    /* renamed from: d */
    public static volatile HandlerC11145tJ0 f12393d;

    /* renamed from: a */
    public final OQ1 f12394a;

    /* renamed from: b */
    public final RunnableC1483XZ f12395b;

    /* renamed from: c */
    public volatile long f12396c;

    public VA1(OQ1 oq1) {
        Preconditions.checkNotNull(oq1);
        this.f12394a = oq1;
        this.f12395b = new RunnableC1483XZ(this, oq1, false, 26);
    }

    /* renamed from: a */
    public final void m8321a() {
        this.f12396c = 0L;
        m8323d().removeCallbacks(this.f12395b);
    }

    /* renamed from: b */
    public final void m8322b(long j) {
        m8321a();
        if (j >= 0) {
            this.f12396c = this.f12394a.zzb().currentTimeMillis();
            if (m8323d().postDelayed(this.f12395b, j)) {
                return;
            }
            this.f12394a.mo6070n().f8378g.m24554c(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    /* renamed from: c */
    public abstract void mo185c();

    /* renamed from: d */
    public final Handler m8323d() {
        HandlerC11145tJ0 handlerC11145tJ0;
        if (f12393d != null) {
            return f12393d;
        }
        synchronized (VA1.class) {
            try {
                if (f12393d == null) {
                    f12393d = new HandlerC11145tJ0(this.f12394a.zza().getMainLooper());
                }
                handlerC11145tJ0 = f12393d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC11145tJ0;
    }
}
