package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class VO1 extends FutureTask implements Comparable {
    public final long a;
    public final boolean b;
    public final String c;
    public final /* synthetic */ C7595vO1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO1(C7595vO1 c7595vO1, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.d = c7595vO1;
        Preconditions.checkNotNull(str);
        long andIncrement = C7595vO1.l.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            c7595vO1.n().g.d("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        VO1 vo1 = (VO1) obj;
        boolean z = vo1.b;
        boolean z2 = this.b;
        if (z2 != z) {
            return z2 ? -1 : 1;
        }
        long j = vo1.a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        this.d.n().h.c(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        OL1 ol1N = this.d.n();
        ol1N.g.c(th, this.c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO1(C7595vO1 c7595vO1, Callable callable, boolean z) {
        super(callable);
        this.d = c7595vO1;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = C7595vO1.l.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            c7595vO1.n().g.d("Tasks index overflow");
        }
    }
}
