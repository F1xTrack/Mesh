package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: xw */
/* loaded from: classes.dex */
public final class C8075xw {
    public static final HashMap d = new HashMap();
    public static final ExecutorC4096h8 e = new ExecutorC4096h8(2);
    public final Executor a;
    public final C1177Ow b;
    public C3892g32 c = null;

    public C8075xw(Executor executor, C1177Ow c1177Ow) {
        this.a = executor;
        this.b = c1177Ow;
    }

    public static Object a(Task task, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        C7885ww c7885ww = new C7885ww();
        Executor executor = e;
        task.e(executor, c7885ww);
        task.d(executor, c7885ww);
        task.a(executor, c7885ww);
        if (!c7885ww.a.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.k()) {
            return task.i();
        }
        throw new ExecutionException(task.h());
    }

    public static synchronized C8075xw e(Executor executor, C1177Ow c1177Ow) {
        String str;
        HashMap map;
        try {
            str = c1177Ow.b;
            map = d;
            if (!map.containsKey(str)) {
                map.put(str, new C8075xw(executor, c1177Ow));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C8075xw) map.get(str);
    }

    public final void b() {
        synchronized (this) {
            this.c = AbstractC3782fU1.e(null);
        }
        this.b.a();
    }

    public final synchronized Task c() {
        try {
            C3892g32 c3892g32 = this.c;
            if (c3892g32 == null || (c3892g32.j() && !this.c.k())) {
                Executor executor = this.a;
                C1177Ow c1177Ow = this.b;
                Objects.requireNonNull(c1177Ow);
                this.c = AbstractC3782fU1.c(executor, new CallableC0437Fj(1, c1177Ow));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final C8265yw d() {
        synchronized (this) {
            try {
                C3892g32 c3892g32 = this.c;
                if (c3892g32 == null || !c3892g32.k()) {
                    try {
                        return (C8265yw) a(c(), TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        return null;
                    }
                }
                return (C8265yw) this.c.i();
            } finally {
            }
        }
    }

    public final C3892g32 f(C8265yw c8265yw) {
        CallableC7695vw callableC7695vw = new CallableC7695vw(this, 0, c8265yw);
        Executor executor = this.a;
        return AbstractC3782fU1.c(executor, callableC7695vw).n(executor, new C0515Gj(this, 7, c8265yw));
    }
}
