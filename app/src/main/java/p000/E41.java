package p000;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class E41 implements Runnable {

    /* renamed from: h */
    public static final Object f2451h = new Object();

    /* renamed from: a */
    public final Executor f2452a;

    /* renamed from: b */
    public final InterfaceC9049cx0 f2453b;

    /* renamed from: d */
    public final AtomicReference f2455d;

    /* renamed from: c */
    public final AtomicBoolean f2454c = new AtomicBoolean(true);

    /* renamed from: e */
    public Object f2456e = f2451h;

    /* renamed from: f */
    public int f2457f = -1;

    /* renamed from: g */
    public boolean f2458g = false;

    public E41(AtomicReference atomicReference, Executor executor, InterfaceC9049cx0 interfaceC9049cx0) {
        this.f2455d = atomicReference;
        this.f2452a = executor;
        this.f2453b = interfaceC9049cx0;
    }

    /* renamed from: a */
    public final void m2014a(int i) {
        synchronized (this) {
            try {
                if (!this.f2454c.get()) {
                    return;
                }
                if (i <= this.f2457f) {
                    return;
                }
                this.f2457f = i;
                if (this.f2458g) {
                    return;
                }
                this.f2458g = true;
                try {
                    this.f2452a.execute(this);
                } finally {
                    synchronized (this) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.f2454c.get()) {
                    this.f2458g = false;
                    return;
                }
                Object obj = this.f2455d.get();
                int i = this.f2457f;
                while (true) {
                    if (!Objects.equals(this.f2456e, obj)) {
                        this.f2456e = obj;
                        if (obj instanceof C0041Ae) {
                            this.f2453b.onError(((C0041Ae) obj).f298a);
                        } else {
                            this.f2453b.mo2107a(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.f2457f || !this.f2454c.get()) {
                                break;
                            }
                            obj = this.f2455d.get();
                            i = this.f2457f;
                        } finally {
                        }
                    }
                }
                this.f2458g = false;
            } finally {
            }
        }
    }
}
