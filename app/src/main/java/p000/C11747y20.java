package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* renamed from: y20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11747y20 extends AbstractC0377Fz implements InterfaceC6939uH {

    /* renamed from: c */
    public final Handler f46043c;

    /* renamed from: d */
    public final String f46044d;

    /* renamed from: e */
    public final boolean f46045e;

    /* renamed from: f */
    public final C11747y20 f46046f;

    public C11747y20(Handler handler, String str, boolean z) {
        this.f46043c = handler;
        this.f46044d = str;
        this.f46045e = z;
        this.f46046f = z ? this : new C11747y20(handler, str, true);
    }

    @Override // p000.InterfaceC6939uH
    /* renamed from: a */
    public final InterfaceC0776MK mo4311a(long j, final RunnableC7627Ga1 runnableC7627Ga1, InterfaceC0125Bz interfaceC0125Bz) {
        if (this.f46043c.postDelayed(runnableC7627Ga1, AbstractC10132lO1.m22417b(j, 4611686018427387903L))) {
            return new InterfaceC0776MK() { // from class: w20
                @Override // p000.InterfaceC0776MK
                /* renamed from: a */
                public final void mo3407a() {
                    this.f44657a.f46043c.removeCallbacks(runnableC7627Ga1);
                }
            };
        }
        m26036p(interfaceC0125Bz, runnableC7627Ga1);
        return C7876Kv0.f6390a;
    }

    @Override // p000.InterfaceC6939uH
    /* renamed from: e */
    public final void mo4313e(long j, C0619Jp c0619Jp) {
        RunnableC1483XZ runnableC1483XZ = new RunnableC1483XZ(c0619Jp, 10, this);
        if (this.f46043c.postDelayed(runnableC1483XZ, AbstractC10132lO1.m22417b(j, 4611686018427387903L))) {
            c0619Jp.m4441u(new C11620x20(this, 0, runnableC1483XZ));
        } else {
            m26036p(c0619Jp.f5712e, runnableC1483XZ);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11747y20) {
            C11747y20 c11747y20 = (C11747y20) obj;
            if (c11747y20.f46043c == this.f46043c && c11747y20.f46045e == this.f46045e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f46043c) ^ (this.f46045e ? 1231 : 1237);
    }

    @Override // p000.AbstractC0377Fz
    /* renamed from: l */
    public final void mo732l(InterfaceC0125Bz interfaceC0125Bz, Runnable runnable) {
        if (this.f46043c.post(runnable)) {
            return;
        }
        m26036p(interfaceC0125Bz, runnable);
    }

    @Override // p000.AbstractC0377Fz
    /* renamed from: n */
    public final boolean mo2868n(InterfaceC0125Bz interfaceC0125Bz) {
        return (this.f46045e && O90.m5963a(Looper.myLooper(), this.f46043c.getLooper())) ? false : true;
    }

    /* renamed from: p */
    public final void m26036p(InterfaceC0125Bz interfaceC0125Bz, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) interfaceC0125Bz.mo937g(C7564Ev0.f2962e);
        if (interfaceC8044Ob0 != null) {
            ((C9002cc0) interfaceC8044Ob0).m10810l(cancellationException);
        }
        C0399GK c0399gk = C0399GK.f3694a;
        ExecutorC1023QF.f9548c.mo732l(interfaceC0125Bz, runnable);
    }

    @Override // p000.AbstractC0377Fz
    public final String toString() {
        C11747y20 c11747y20;
        String str;
        C0399GK c0399gk = C0399GK.f3694a;
        C11747y20 c11747y202 = AbstractC7702Hm0.f4486a;
        if (this == c11747y202) {
            str = "Dispatchers.Main";
        } else {
            try {
                c11747y20 = c11747y202.f46046f;
            } catch (UnsupportedOperationException unused) {
                c11747y20 = null;
            }
            str = this == c11747y20 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f46044d;
        if (string == null) {
            string = this.f46043c.toString();
        }
        return this.f46045e ? AbstractC7222ym.m26232i(string, ".immediate") : string;
    }

    public C11747y20(Handler handler) {
        this(handler, null, false);
    }
}
