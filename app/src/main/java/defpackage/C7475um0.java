package defpackage;

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
public final class C7475um0 {
    public static final ExecutorService e = Executors.newCachedThreadPool(new ThreadFactoryC7666vm0());
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile C7093sm0 d = null;

    public C7475um0(C1847Xl0 c1847Xl0) {
        f(new C7093sm0(c1847Xl0));
    }

    public final synchronized void a(InterfaceC6712qm0 interfaceC6712qm0) {
        Throwable th;
        try {
            C7093sm0 c7093sm0 = this.d;
            if (c7093sm0 != null && (th = c7093sm0.b) != null) {
                interfaceC6712qm0.onResult(th);
            }
            this.b.add(interfaceC6712qm0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(InterfaceC6712qm0 interfaceC6712qm0) {
        C1847Xl0 c1847Xl0;
        try {
            C7093sm0 c7093sm0 = this.d;
            if (c7093sm0 != null && (c1847Xl0 = c7093sm0.a) != null) {
                interfaceC6712qm0.onResult(c1847Xl0);
            }
            this.a.add(interfaceC6712qm0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            AbstractC7281tl0.c("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC6712qm0) it.next()).onResult(th);
        }
    }

    public final void d() {
        C7093sm0 c7093sm0 = this.d;
        if (c7093sm0 == null) {
            return;
        }
        C1847Xl0 c1847Xl0 = c7093sm0.a;
        if (c1847Xl0 == null) {
            c(c7093sm0.b);
            return;
        }
        synchronized (this) {
            Iterator it = new ArrayList(this.a).iterator();
            while (it.hasNext()) {
                ((InterfaceC6712qm0) it.next()).onResult(c1847Xl0);
            }
        }
    }

    public final synchronized void e(C1067Nl0 c1067Nl0) {
        this.b.remove(c1067Nl0);
    }

    public final void f(C7093sm0 c7093sm0) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = c7093sm0;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d();
        } else {
            this.c.post(new DE(24, this));
        }
    }

    public C7475um0(Callable callable, boolean z) {
        if (z) {
            try {
                f((C7093sm0) callable.call());
                return;
            } catch (Throwable th) {
                f(new C7093sm0(th));
                return;
            }
        }
        ExecutorService executorService = e;
        C7284tm0 c7284tm0 = new C7284tm0(callable);
        c7284tm0.b = this;
        executorService.execute(c7284tm0);
    }
}
