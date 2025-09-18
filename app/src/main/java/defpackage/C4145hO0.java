package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hO0 */
/* loaded from: classes.dex */
public final class C4145hO0 implements AutoCloseable {
    public final AtomicBoolean a;
    public final C3954gO0 b;
    public final long c;
    public final BT d;
    public final C0481Fx1 e;

    public C4145hO0(C3954gO0 c3954gO0, long j, BT bt, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = atomicBoolean;
        C0481Fx1 c0481Fx1 = Build.VERSION.SDK_INT >= 30 ? new C0481Fx1(new C7495ut()) : new C0481Fx1(new C0474Fv0(9));
        this.e = c0481Fx1;
        this.b = c3954gO0;
        this.c = j;
        this.d = bt;
        if (z) {
            atomicBoolean.set(true);
        } else {
            ((InterfaceC7686vt) c0481Fx1.a).m("stop");
        }
    }

    public final void a(final int i, final RuntimeException runtimeException) {
        ((InterfaceC7686vt) this.e.a).close();
        if (this.a.getAndSet(true)) {
            return;
        }
        final C3954gO0 c3954gO0 = this.b;
        synchronized (c3954gO0.h) {
            try {
                if (!C3954gO0.o(this, c3954gO0.o) && !C3954gO0.o(this, c3954gO0.n)) {
                    Objects.toString(this.d);
                    AbstractC0759Jm0.f("Recorder");
                    return;
                }
                C6687qe c6687qe = null;
                switch (c3954gO0.k.ordinal()) {
                    case 0:
                    case 3:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                    case 1:
                    case 2:
                        AbstractC3377dM1.i(C3954gO0.o(this, c3954gO0.o), null);
                        C6687qe c6687qe2 = c3954gO0.o;
                        c3954gO0.o = null;
                        c3954gO0.x();
                        c6687qe = c6687qe2;
                        break;
                    case 4:
                    case 5:
                        c3954gO0.B(EnumC3763fO0.g);
                        final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                        final C6687qe c6687qe3 = c3954gO0.n;
                        c3954gO0.d.execute(new Runnable() { // from class: YN0
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                c3954gO0.G(c6687qe3, micros, i, runtimeException);
                            }
                        });
                        break;
                    case 6:
                    case 7:
                        AbstractC3377dM1.i(C3954gO0.o(this, c3954gO0.n), null);
                        break;
                }
                if (c6687qe != null) {
                    if (i == 10) {
                        AbstractC0759Jm0.f("Recorder");
                    }
                    c3954gO0.i(c6687qe, 8, new RuntimeException("Recording was stopped before any data could be produced.", runtimeException));
                }
            } finally {
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a(0, null);
    }

    public final void finalize() throws Throwable {
        try {
            ((InterfaceC7686vt) this.e.a).a();
            a(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
