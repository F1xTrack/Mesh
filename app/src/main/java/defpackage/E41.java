package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class E41 implements Runnable {
    public static final Object h = new Object();
    public final Executor a;
    public final InterfaceC3296cx0 b;
    public final AtomicReference d;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public Object e = h;
    public int f = -1;
    public boolean g = false;

    public E41(AtomicReference atomicReference, Executor executor, InterfaceC3296cx0 interfaceC3296cx0) {
        this.d = atomicReference;
        this.a = executor;
        this.b = interfaceC3296cx0;
    }

    public final void a(int i) {
        synchronized (this) {
            try {
                if (!this.c.get()) {
                    return;
                }
                if (i <= this.f) {
                    return;
                }
                this.f = i;
                if (this.g) {
                    return;
                }
                this.g = true;
                try {
                    this.a.execute(this);
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
                if (!this.c.get()) {
                    this.g = false;
                    return;
                }
                Object obj = this.d.get();
                int i = this.f;
                while (true) {
                    if (!Objects.equals(this.e, obj)) {
                        this.e = obj;
                        if (obj instanceof C0032Ae) {
                            this.b.onError(((C0032Ae) obj).a);
                        } else {
                            this.b.a(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.f || !this.c.get()) {
                                break;
                            }
                            obj = this.d.get();
                            i = this.f;
                        } finally {
                        }
                    }
                }
                this.g = false;
            } finally {
            }
        }
    }
}
