package defpackage;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public abstract class VA1 {
    public static volatile HandlerC7197tJ0 d;
    public final OQ1 a;
    public final XZ b;
    public volatile long c;

    public VA1(OQ1 oq1) {
        Preconditions.checkNotNull(oq1);
        this.a = oq1;
        this.b = new XZ(this, oq1, false, 26);
    }

    public final void a() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final void b(long j) {
        a();
        if (j >= 0) {
            this.c = this.a.zzb().currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            this.a.n().g.c(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public abstract void c();

    public final Handler d() {
        HandlerC7197tJ0 handlerC7197tJ0;
        if (d != null) {
            return d;
        }
        synchronized (VA1.class) {
            try {
                if (d == null) {
                    d = new HandlerC7197tJ0(this.a.zza().getMainLooper());
                }
                handlerC7197tJ0 = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC7197tJ0;
    }
}
