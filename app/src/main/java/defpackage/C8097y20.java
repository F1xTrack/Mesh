package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* renamed from: y20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8097y20 extends AbstractC0485Fz implements InterfaceC7381uH {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final C8097y20 f;

    public C8097y20(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new C8097y20(handler, str, true);
    }

    @Override // defpackage.InterfaceC7381uH
    public final MK a(long j, final RunnableC0490Ga1 runnableC0490Ga1, InterfaceC0173Bz interfaceC0173Bz) {
        if (this.c.postDelayed(runnableC0490Ga1, AbstractC5686lO1.b(j, 4611686018427387903L))) {
            return new MK() { // from class: w20
                @Override // defpackage.MK
                public final void a() {
                    this.a.c.removeCallbacks(runnableC0490Ga1);
                }
            };
        }
        p(interfaceC0173Bz, runnableC0490Ga1);
        return C0864Kv0.a;
    }

    @Override // defpackage.InterfaceC7381uH
    public final void e(long j, C0767Jp c0767Jp) {
        XZ xz = new XZ(c0767Jp, 10, this);
        if (this.c.postDelayed(xz, AbstractC5686lO1.b(j, 4611686018427387903L))) {
            c0767Jp.u(new C7907x20(this, 0, xz));
        } else {
            p(c0767Jp.e, xz);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8097y20) {
            C8097y20 c8097y20 = (C8097y20) obj;
            if (c8097y20.c == this.c && c8097y20.e == this.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.e ? 1231 : 1237);
    }

    @Override // defpackage.AbstractC0485Fz
    public final void l(InterfaceC0173Bz interfaceC0173Bz, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        p(interfaceC0173Bz, runnable);
    }

    @Override // defpackage.AbstractC0485Fz
    public final boolean n(InterfaceC0173Bz interfaceC0173Bz) {
        return (this.e && O90.a(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final void p(InterfaceC0173Bz interfaceC0173Bz, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) interfaceC0173Bz.g(C0396Ev0.e);
        if (interfaceC1115Ob0 != null) {
            ((C2548cc0) interfaceC1115Ob0).l(cancellationException);
        }
        GK gk = GK.a;
        QF.c.l(interfaceC0173Bz, runnable);
    }

    @Override // defpackage.AbstractC0485Fz
    public final String toString() {
        C8097y20 c8097y20;
        String str;
        GK gk = GK.a;
        C8097y20 c8097y202 = AbstractC0603Hm0.a;
        if (this == c8097y202) {
            str = "Dispatchers.Main";
        } else {
            try {
                c8097y20 = c8097y202.f;
            } catch (UnsupportedOperationException unused) {
                c8097y20 = null;
            }
            str = this == c8097y20 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.d;
        if (string == null) {
            string = this.c.toString();
        }
        return this.e ? AbstractC8235ym.i(string, ".immediate") : string;
    }

    public C8097y20(Handler handler) {
        this(handler, null, false);
    }
}
