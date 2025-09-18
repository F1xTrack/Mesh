package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.reflect.InvocationTargetException;

/* renamed from: nf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6119nf1 extends AbstractChoreographerFrameCallbackC3695f20 {
    public final int a;
    public final /* synthetic */ C8216yf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6119nf1(C8216yf1 c8216yf1, ReactApplicationContext reactApplicationContext, int i) {
        super(reactApplicationContext);
        this.b = c8216yf1;
        this.a = i;
    }

    public final void a(long j) throws Exception {
        InterfaceC7455uf1 interfaceC7455uf1;
        while (16 - ((System.nanoTime() - j) / 1000000) >= this.a) {
            synchronized (this.b.d) {
                try {
                    if (this.b.j.isEmpty()) {
                        return;
                    } else {
                        interfaceC7455uf1 = (InterfaceC7455uf1) this.b.j.pollFirst();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                interfaceC7455uf1.execute();
                this.b.n += SystemClock.uptimeMillis() - jUptimeMillis;
            } catch (Exception e) {
                this.b.l = true;
                throw e;
            }
        }
    }

    @Override // defpackage.AbstractChoreographerFrameCallbackC3695f20
    public final void doFrameGuarded(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C8216yf1 c8216yf1 = this.b;
        if (c8216yf1.l) {
            AbstractC3393dS.p("ReactNative");
            return;
        }
        MT1.b("dispatchNonBatchedUIOperations");
        try {
            a(j);
            Trace.endSection();
            c8216yf1.c();
            MJ0.a().c(2, this);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
