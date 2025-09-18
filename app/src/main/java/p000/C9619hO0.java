package p000;

import android.os.Build;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hO0 */
/* loaded from: classes.dex */
public final class C9619hO0 implements AutoCloseable {

    /* renamed from: a */
    public final AtomicBoolean f28401a;

    /* renamed from: b */
    public final C9491gO0 f28402b;

    /* renamed from: c */
    public final long f28403c;

    /* renamed from: d */
    public final C0093BT f28404d;

    /* renamed from: e */
    public final C7621Fx1 f28405e;

    public C9619hO0(C9491gO0 c9491gO0, long j, C0093BT c0093bt, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f28401a = atomicBoolean;
        C7621Fx1 c7621Fx1 = Build.VERSION.SDK_INT >= 30 ? new C7621Fx1(new C6977ut()) : new C7621Fx1(new C7616Fv0(9));
        this.f28405e = c7621Fx1;
        this.f28402b = c9491gO0;
        this.f28403c = j;
        this.f28404d = c0093bt;
        if (z) {
            atomicBoolean.set(true);
        } else {
            ((InterfaceC7040vt) c7621Fx1.f3494a).mo2832m("stop");
        }
    }

    /* renamed from: a */
    public final void m18812a(final int i, final RuntimeException runtimeException) {
        ((InterfaceC7040vt) this.f28405e.f3494a).close();
        if (this.f28401a.getAndSet(true)) {
            return;
        }
        final C9491gO0 c9491gO0 = this.f28402b;
        synchronized (c9491gO0.f27759h) {
            try {
                if (!C9491gO0.m18482o(this, c9491gO0.f27768o) && !C9491gO0.m18482o(this, c9491gO0.f27767n)) {
                    Objects.toString(this.f28404d);
                    AbstractC7806Jm0.m4412f("Recorder");
                    return;
                }
                C6693qe c6693qe = null;
                switch (c9491gO0.f27764k.ordinal()) {
                    case 0:
                    case 3:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                    case 1:
                    case 2:
                        AbstractC9104dM1.m17550i(C9491gO0.m18482o(this, c9491gO0.f27768o), null);
                        C6693qe c6693qe2 = c9491gO0.f27768o;
                        c9491gO0.f27768o = null;
                        c9491gO0.m18509x();
                        c6693qe = c6693qe2;
                        break;
                    case 4:
                    case 5:
                        c9491gO0.m18485B(EnumC9363fO0.f27171g);
                        final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                        final C6693qe c6693qe3 = c9491gO0.f27767n;
                        c9491gO0.f27751d.execute(new Runnable() { // from class: YN0
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                c9491gO0.m18490G(c6693qe3, micros, i, runtimeException);
                            }
                        });
                        break;
                    case 6:
                    case 7:
                        AbstractC9104dM1.m17550i(C9491gO0.m18482o(this, c9491gO0.f27767n), null);
                        break;
                }
                if (c6693qe != null) {
                    if (i == 10) {
                        AbstractC7806Jm0.m4412f("Recorder");
                    }
                    c9491gO0.m18498i(c6693qe, 8, new RuntimeException("Recording was stopped before any data could be produced.", runtimeException));
                }
            } finally {
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m18812a(0, null);
    }

    public final void finalize() throws Throwable {
        try {
            ((InterfaceC7040vt) this.f28405e.f3494a).mo2826a();
            m18812a(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
