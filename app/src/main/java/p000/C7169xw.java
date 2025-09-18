package p000;

import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: xw */
/* loaded from: classes.dex */
public final class C7169xw {

    /* renamed from: d */
    public static final HashMap f45904d = new HashMap();

    /* renamed from: e */
    public static final ExecutorC4160h8 f45905e = new ExecutorC4160h8(2);

    /* renamed from: a */
    public final Executor f45906a;

    /* renamed from: b */
    public final C0940Ow f45907b;

    /* renamed from: c */
    public C9450g32 f45908c = null;

    public C7169xw(Executor executor, C0940Ow c0940Ow) {
        this.f45906a = executor;
        this.f45907b = c0940Ow;
    }

    /* renamed from: a */
    public static Object m26002a(Task task, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        C7106ww c7106ww = new C7106ww();
        Executor executor = f45905e;
        task.mo11138e(executor, c7106ww);
        task.mo11137d(executor, c7106ww);
        task.mo11134a(executor, c7106ww);
        if (!c7106ww.f45171a.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.mo11144k()) {
            return task.mo11142i();
        }
        throw new ExecutionException(task.mo11141h());
    }

    /* renamed from: e */
    public static synchronized C7169xw m26003e(Executor executor, C0940Ow c0940Ow) {
        String str;
        HashMap map;
        try {
            str = c0940Ow.f8691b;
            map = f45904d;
            if (!map.containsKey(str)) {
                map.put(str, new C7169xw(executor, c0940Ow));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C7169xw) map.get(str);
    }

    /* renamed from: b */
    public final void m26004b() {
        synchronized (this) {
            this.f45908c = AbstractC9376fU1.m18244e(null);
        }
        this.f45907b.m6186a();
    }

    /* renamed from: c */
    public final synchronized Task m26005c() {
        try {
            C9450g32 c9450g32 = this.f45908c;
            if (c9450g32 == null || (c9450g32.mo11143j() && !this.f45908c.mo11144k())) {
                Executor executor = this.f45906a;
                C0940Ow c0940Ow = this.f45907b;
                Objects.requireNonNull(c0940Ow);
                this.f45908c = AbstractC9376fU1.m18242c(executor, new CallableC0361Fj(1, c0940Ow));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f45908c;
    }

    /* renamed from: d */
    public final C7232yw m26006d() {
        synchronized (this) {
            try {
                C9450g32 c9450g32 = this.f45908c;
                if (c9450g32 == null || !c9450g32.mo11144k()) {
                    try {
                        return (C7232yw) m26002a(m26005c(), TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        return null;
                    }
                }
                return (C7232yw) this.f45908c.mo11142i();
            } finally {
            }
        }
    }

    /* renamed from: f */
    public final C9450g32 m26007f(C7232yw c7232yw) {
        CallableC7043vw callableC7043vw = new CallableC7043vw(this, 0, c7232yw);
        Executor executor = this.f45906a;
        return AbstractC9376fU1.m18242c(executor, callableC7043vw).m18387n(executor, new C0424Gj(this, 7, c7232yw));
    }
}
