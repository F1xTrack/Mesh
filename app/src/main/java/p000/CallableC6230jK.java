package p000;

import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.internal.LibraryVersion;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* renamed from: jK */
/* loaded from: classes.dex */
public final class CallableC6230jK implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f35064a;

    /* renamed from: b */
    public /* synthetic */ Object f35065b;

    public /* synthetic */ CallableC6230jK() {
        this.f35064a = 4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f35064a) {
            case 0:
                synchronized (((C6736rK) this.f35065b)) {
                    try {
                        C6736rK c6736rK = (C6736rK) this.f35065b;
                        if (c6736rK.f41522i == null) {
                            return null;
                        }
                        c6736rK.m24280D();
                        if (((C6736rK) this.f35065b).m24283m()) {
                            ((C6736rK) this.f35065b).m24287x();
                            ((C6736rK) this.f35065b).f41524k = 0;
                        }
                        return null;
                    } finally {
                    }
                }
            case 1:
                ((Runnable) this.f35065b).run();
                return null;
            case 2:
                C10285mb0 c10285mb0 = new C10285mb0();
                c10285mb0.f37783a = (JsReplyProxyBoundaryInterface) this.f35065b;
                return c10285mb0;
            case 3:
                RunnableC6662q9 runnableC6662q9 = (RunnableC6662q9) this.f35065b;
                AtomicBoolean atomicBoolean = runnableC6662q9.f40633d;
                AtomicBoolean atomicBoolean2 = runnableC6662q9.f40632c;
                atomicBoolean.set(true);
                Object objMo1583g = null;
                try {
                    Process.setThreadPriority(10);
                    try {
                        objMo1583g = runnableC6662q9.f40634e.mo1583g();
                    } catch (C11355uy0 e) {
                        if (!atomicBoolean2.get()) {
                            throw e;
                        }
                    }
                    Binder.flushPendingCommands();
                    return objMo1583g;
                } catch (Throwable th) {
                    try {
                        atomicBoolean2.set(true);
                        throw th;
                    } finally {
                        runnableC6662q9.m23935a(null);
                    }
                }
            case 4:
                return new UR1(((NN1) this.f35065b).f7743l);
            case 5:
                BinderC10262mP1 binderC10262mP1 = (BinderC10262mP1) this.f35065b;
                binderC10262mP1.f37671a.m22486f0();
                C10896rM1 c10896rM1 = binderC10262mP1.f37671a.f37130h;
                C10152lY1.m22451w(c10896rM1);
                c10896rM1.mo7681v1();
                ((C9110dP1) c10896rM1.f11615b).getClass();
                throw new IllegalStateException("Unexpected call on client side");
            case 6:
                C10274mV1 c10274mV1 = (C10274mV1) this.f35065b;
                c10274mV1.getClass();
                return LibraryVersion.getInstance().getVersion(c10274mV1.f37740g);
            case 7:
                V02 v02 = (V02) this.f35065b;
                v02.getClass();
                return LibraryVersion.getInstance().getVersion(v02.f12295a);
            default:
                C10218m32 c10218m32 = (C10218m32) this.f35065b;
                c10218m32.getClass();
                return LibraryVersion.getInstance().getVersion(c10218m32.f37456g);
        }
    }

    public /* synthetic */ CallableC6230jK(int i, Object obj) {
        this.f35064a = i;
        this.f35065b = obj;
    }

    public CallableC6230jK(BinderC10262mP1 binderC10262mP1, C11894zB1 c11894zB1, String str) {
        this.f35064a = 5;
        this.f35065b = binderC10262mP1;
    }
}
