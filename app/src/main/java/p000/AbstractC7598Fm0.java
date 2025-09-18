package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Fm0 */
/* loaded from: classes.dex */
public abstract class AbstractC7598Fm0 {

    /* renamed from: a */
    public final /* synthetic */ int f3413a;

    /* renamed from: b */
    public final Object f3414b;

    /* renamed from: c */
    public final Object f3415c;

    /* renamed from: d */
    public final Object f3416d;

    public AbstractC7598Fm0() {
        this.f3413a = 0;
        this.f3415c = new AtomicInteger(0);
        this.f3416d = new AtomicBoolean(false);
        this.f3414b = new C1338VG(8, (byte) 0);
    }

    /* renamed from: a */
    public C3936dZ m2771a() {
        ((AbstractC10653pT0) this.f3414b).m23791a();
        return ((AtomicBoolean) this.f3416d).compareAndSet(false, true) ? (C3936dZ) ((F71) this.f3415c).getValue() : m2773c();
    }

    /* renamed from: b */
    public C9450g32 m2772b(Executor executor, Callable callable, FA1 fa1) {
        Preconditions.checkState(((AtomicInteger) this.f3415c).get() > 0);
        if (fa1.f3084a.mo11143j()) {
            C9450g32 c9450g32 = new C9450g32();
            c9450g32.m18390q();
            return c9450g32;
        }
        G10 g10 = new G10(7);
        S81 s81 = new S81((FA1) g10.f3531b);
        ((C1338VG) this.f3414b).m8349n(new RunnableC7447Co1(this, fa1, g10, callable, s81), new ExecutorC6865t6(executor, fa1, g10, s81));
        return s81.f10598a;
    }

    /* renamed from: c */
    public C3936dZ m2773c() {
        String strMo2774d = mo2774d();
        AbstractC10653pT0 abstractC10653pT0 = (AbstractC10653pT0) this.f3414b;
        abstractC10653pT0.getClass();
        abstractC10653pT0.m23791a();
        abstractC10653pT0.m23792b();
        return abstractC10653pT0.m23794g().mo1557M().m9079o(strMo2774d);
    }

    /* renamed from: d */
    public abstract String mo2774d();

    /* renamed from: e */
    public abstract C0664KX mo2775e();

    /* renamed from: f */
    public void m2776f(C3936dZ c3936dZ) {
        O90.m5968f(c3936dZ, "statement");
        if (c3936dZ == ((C3936dZ) ((F71) this.f3415c).getValue())) {
            ((AtomicBoolean) this.f3416d).set(false);
        }
    }

    public String toString() {
        switch (this.f3413a) {
            case 1:
                return getClass().getSimpleName() + ": " + mo2775e();
            default:
                return super.toString();
        }
    }

    public AbstractC7598Fm0(InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, W21 w21) {
        this.f3413a = 1;
        this.f3414b = interfaceC8392Ut0;
        this.f3415c = c10226m71;
        this.f3416d = w21;
    }

    public AbstractC7598Fm0(AbstractC10653pT0 abstractC10653pT0) {
        this.f3413a = 2;
        O90.m5968f(abstractC10653pT0, "database");
        this.f3414b = abstractC10653pT0;
        this.f3416d = new AtomicBoolean(false);
        this.f3415c = AbstractC0705LB.m4915b(new C10801qd0(26, this));
    }
}
