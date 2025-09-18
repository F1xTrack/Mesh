package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Fm0 */
/* loaded from: classes.dex */
public abstract class AbstractC0447Fm0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public AbstractC0447Fm0() {
        this.a = 0;
        this.c = new AtomicInteger(0);
        this.d = new AtomicBoolean(false);
        this.b = new VG(8, (byte) 0);
    }

    public C3414dZ a() {
        ((AbstractC6464pT0) this.b).a();
        return ((AtomicBoolean) this.d).compareAndSet(false, true) ? (C3414dZ) ((F71) this.c).getValue() : c();
    }

    public C3892g32 b(Executor executor, Callable callable, FA1 fa1) {
        Preconditions.checkState(((AtomicInteger) this.c).get() > 0);
        if (fa1.a.j()) {
            C3892g32 c3892g32 = new C3892g32();
            c3892g32.q();
            return c3892g32;
        }
        G10 g10 = new G10(7);
        S81 s81 = new S81((FA1) g10.b);
        ((VG) this.b).n(new RunnableC0220Co1(this, fa1, g10, callable, s81), new ExecutorC7157t6(executor, fa1, g10, s81));
        return s81.a;
    }

    public C3414dZ c() {
        String strD = d();
        AbstractC6464pT0 abstractC6464pT0 = (AbstractC6464pT0) this.b;
        abstractC6464pT0.getClass();
        abstractC6464pT0.a();
        abstractC6464pT0.b();
        return abstractC6464pT0.g().M().o(strD);
    }

    public abstract String d();

    public abstract KX e();

    public void f(C3414dZ c3414dZ) {
        O90.f(c3414dZ, "statement");
        if (c3414dZ == ((C3414dZ) ((F71) this.c).getValue())) {
            ((AtomicBoolean) this.d).set(false);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return getClass().getSimpleName() + ": " + e();
            default:
                return super.toString();
        }
    }

    public AbstractC0447Fm0(InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, W21 w21) {
        this.a = 1;
        this.b = interfaceC1637Ut0;
        this.c = c5826m71;
        this.d = w21;
    }

    public AbstractC0447Fm0(AbstractC6464pT0 abstractC6464pT0) {
        this.a = 2;
        O90.f(abstractC6464pT0, "database");
        this.b = abstractC6464pT0;
        this.d = new AtomicBoolean(false);
        this.c = LB.b(new C6685qd0(26, this));
    }
}
