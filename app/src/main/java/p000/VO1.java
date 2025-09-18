package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class VO1 extends FutureTask implements Comparable {

    /* renamed from: a */
    public final long f12540a;

    /* renamed from: b */
    public final boolean f12541b;

    /* renamed from: c */
    public final String f12542c;

    /* renamed from: d */
    public final /* synthetic */ C11412vO1 f12543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO1(C11412vO1 c11412vO1, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f12543d = c11412vO1;
        Preconditions.checkNotNull(str);
        long andIncrement = C11412vO1.f44353l.getAndIncrement();
        this.f12540a = andIncrement;
        this.f12542c = str;
        this.f12541b = z;
        if (andIncrement == Long.MAX_VALUE) {
            c11412vO1.mo6070n().f8378g.m24555d("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        VO1 vo1 = (VO1) obj;
        boolean z = vo1.f12541b;
        boolean z2 = this.f12541b;
        if (z2 != z) {
            return z2 ? -1 : 1;
        }
        long j = vo1.f12540a;
        long j2 = this.f12540a;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        this.f12543d.mo6070n().f8379h.m24554c(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        OL1 ol1Mo6070n = this.f12543d.mo6070n();
        ol1Mo6070n.f8378g.m24554c(th, this.f12542c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO1(C11412vO1 c11412vO1, Callable callable, boolean z) {
        super(callable);
        this.f12543d = c11412vO1;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = C11412vO1.f44353l.getAndIncrement();
        this.f12540a = andIncrement;
        this.f12542c = "Task exception on worker thread";
        this.f12541b = z;
        if (andIncrement == Long.MAX_VALUE) {
            c11412vO1.mo6070n().f8378g.m24555d("Tasks index overflow");
        }
    }
}
