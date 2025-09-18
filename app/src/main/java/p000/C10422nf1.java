package p000;

import android.os.SystemClock;
import android.os.Trace;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.reflect.InvocationTargetException;

/* renamed from: nf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10422nf1 extends AbstractChoreographerFrameCallbackC9317f20 {

    /* renamed from: a */
    public final int f38437a;

    /* renamed from: b */
    public final /* synthetic */ C11827yf1 f38438b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10422nf1(C11827yf1 c11827yf1, ReactApplicationContext reactApplicationContext, int i) {
        super(reactApplicationContext);
        this.f38438b = c11827yf1;
        this.f38437a = i;
    }

    /* renamed from: a */
    public final void m23161a(long j) throws Exception {
        InterfaceC11318uf1 interfaceC11318uf1;
        while (16 - ((System.nanoTime() - j) / 1000000) >= this.f38437a) {
            synchronized (this.f38438b.f46387d) {
                try {
                    if (this.f38438b.f46393j.isEmpty()) {
                        return;
                    } else {
                        interfaceC11318uf1 = (InterfaceC11318uf1) this.f38438b.f46393j.pollFirst();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                interfaceC11318uf1.execute();
                this.f38438b.f46397n += SystemClock.uptimeMillis() - jUptimeMillis;
            } catch (Exception e) {
                this.f38438b.f46395l = true;
                throw e;
            }
        }
    }

    @Override // p000.AbstractChoreographerFrameCallbackC9317f20
    public final void doFrameGuarded(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C11827yf1 c11827yf1 = this.f38438b;
        if (c11827yf1.f46395l) {
            AbstractC3929dS.m17683p("ReactNative");
            return;
        }
        MT1.m5371b("dispatchNonBatchedUIOperations");
        try {
            m23161a(j);
            Trace.endSection();
            c11827yf1.m26214c();
            MJ0.m5303a().m5305c(2, this);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
