package defpackage;

import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.internal.LibraryVersion;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* renamed from: jK */
/* loaded from: classes.dex */
public final class CallableC5290jK implements Callable {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;

    public /* synthetic */ CallableC5290jK() {
        this.a = 4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                synchronized (((C6817rK) this.b)) {
                    try {
                        C6817rK c6817rK = (C6817rK) this.b;
                        if (c6817rK.i == null) {
                            return null;
                        }
                        c6817rK.D();
                        if (((C6817rK) this.b).m()) {
                            ((C6817rK) this.b).x();
                            ((C6817rK) this.b).k = 0;
                        }
                        return null;
                    } finally {
                    }
                }
            case 1:
                ((Runnable) this.b).run();
                return null;
            case 2:
                C5915mb0 c5915mb0 = new C5915mb0();
                c5915mb0.a = (JsReplyProxyBoundaryInterface) this.b;
                return c5915mb0;
            case 3:
                RunnableC6594q9 runnableC6594q9 = (RunnableC6594q9) this.b;
                AtomicBoolean atomicBoolean = runnableC6594q9.d;
                AtomicBoolean atomicBoolean2 = runnableC6594q9.c;
                atomicBoolean.set(true);
                Object objG = null;
                try {
                    Process.setThreadPriority(10);
                    try {
                        objG = runnableC6594q9.e.g();
                    } catch (C7511uy0 e) {
                        if (!atomicBoolean2.get()) {
                            throw e;
                        }
                    }
                    Binder.flushPendingCommands();
                    return objG;
                } catch (Throwable th) {
                    try {
                        atomicBoolean2.set(true);
                        throw th;
                    } finally {
                        runnableC6594q9.a(null);
                    }
                }
            case 4:
                return new UR1(((NN1) this.b).l);
            case 5:
                BinderC5880mP1 binderC5880mP1 = (BinderC5880mP1) this.b;
                binderC5880mP1.a.f0();
                C6825rM1 c6825rM1 = binderC5880mP1.a.h;
                C5716lY1.w(c6825rM1);
                c6825rM1.v1();
                ((C3386dP1) c6825rM1.b).getClass();
                throw new IllegalStateException("Unexpected call on client side");
            case 6:
                C5898mV1 c5898mV1 = (C5898mV1) this.b;
                c5898mV1.getClass();
                return LibraryVersion.getInstance().getVersion(c5898mV1.g);
            case 7:
                V02 v02 = (V02) this.b;
                v02.getClass();
                return LibraryVersion.getInstance().getVersion(v02.a);
            default:
                C5814m32 c5814m32 = (C5814m32) this.b;
                c5814m32.getClass();
                return LibraryVersion.getInstance().getVersion(c5814m32.g);
        }
    }

    public /* synthetic */ CallableC5290jK(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public CallableC5290jK(BinderC5880mP1 binderC5880mP1, C8316zB1 c8316zB1, String str) {
        this.a = 5;
        this.b = binderC5880mP1;
    }
}
