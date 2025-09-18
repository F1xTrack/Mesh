package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: um0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11331um0 {

    /* renamed from: e */
    public static final ExecutorService f43855e = Executors.newCachedThreadPool(new ThreadFactoryC11459vm0());

    /* renamed from: a */
    public final LinkedHashSet f43856a = new LinkedHashSet(1);

    /* renamed from: b */
    public final LinkedHashSet f43857b = new LinkedHashSet(1);

    /* renamed from: c */
    public final Handler f43858c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public volatile C11075sm0 f43859d = null;

    public C11331um0(C8532Xl0 c8532Xl0) {
        m25237f(new C11075sm0(c8532Xl0));
    }

    /* renamed from: a */
    public final synchronized void m25232a(InterfaceC10819qm0 interfaceC10819qm0) {
        Throwable th;
        try {
            C11075sm0 c11075sm0 = this.f43859d;
            if (c11075sm0 != null && (th = c11075sm0.f42592b) != null) {
                interfaceC10819qm0.onResult(th);
            }
            this.f43857b.add(interfaceC10819qm0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b */
    public final synchronized void m25233b(InterfaceC10819qm0 interfaceC10819qm0) {
        C8532Xl0 c8532Xl0;
        try {
            C11075sm0 c11075sm0 = this.f43859d;
            if (c11075sm0 != null && (c8532Xl0 = c11075sm0.f42591a) != null) {
                interfaceC10819qm0.onResult(c8532Xl0);
            }
            this.f43856a.add(interfaceC10819qm0);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m25234c(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f43857b);
        if (arrayList.isEmpty()) {
            AbstractC11201tl0.m24981c("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC10819qm0) it.next()).onResult(th);
        }
    }

    /* renamed from: d */
    public final void m25235d() {
        C11075sm0 c11075sm0 = this.f43859d;
        if (c11075sm0 == null) {
            return;
        }
        C8532Xl0 c8532Xl0 = c11075sm0.f42591a;
        if (c8532Xl0 == null) {
            m25234c(c11075sm0.f42592b);
            return;
        }
        synchronized (this) {
            Iterator it = new ArrayList(this.f43856a).iterator();
            while (it.hasNext()) {
                ((InterfaceC10819qm0) it.next()).onResult(c8532Xl0);
            }
        }
    }

    /* renamed from: e */
    public final synchronized void m25236e(C8012Nl0 c8012Nl0) {
        this.f43857b.remove(c8012Nl0);
    }

    /* renamed from: f */
    public final void m25237f(C11075sm0 c11075sm0) {
        if (this.f43859d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f43859d = c11075sm0;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m25235d();
        } else {
            this.f43858c.post(new RunnableC0204DE(24, this));
        }
    }

    public C11331um0(Callable callable, boolean z) {
        if (z) {
            try {
                m25237f((C11075sm0) callable.call());
                return;
            } catch (Throwable th) {
                m25237f(new C11075sm0(th));
                return;
            }
        }
        ExecutorService executorService = f43855e;
        C11203tm0 c11203tm0 = new C11203tm0(callable);
        c11203tm0.f43248b = this;
        executorService.execute(c11203tm0);
    }
}
