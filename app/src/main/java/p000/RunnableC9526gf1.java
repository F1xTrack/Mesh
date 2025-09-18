package p000;

import android.os.SystemClock;
import android.os.Trace;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: gf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC9526gf1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f27906a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f27907b;

    /* renamed from: c */
    public final /* synthetic */ ArrayDeque f27908c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f27909d;

    /* renamed from: e */
    public final /* synthetic */ long f27910e;

    /* renamed from: f */
    public final /* synthetic */ long f27911f;

    /* renamed from: g */
    public final /* synthetic */ long f27912g;

    /* renamed from: h */
    public final /* synthetic */ long f27913h;

    /* renamed from: i */
    public final /* synthetic */ C11827yf1 f27914i;

    public RunnableC9526gf1(C11827yf1 c11827yf1, int i, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j, long j2, long j3, long j4) {
        this.f27914i = c11827yf1;
        this.f27906a = i;
        this.f27907b = arrayList;
        this.f27908c = arrayDeque;
        this.f27909d = arrayList2;
        this.f27910e = j;
        this.f27911f = j2;
        this.f27912g = j3;
        this.f27913h = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11827yf1 c11827yf1 = this.f27914i;
        new ArrayList().add("BatchId: " + String.valueOf(this.f27906a));
        MT1.m5371b("DispatchUI".concat(""));
        try {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = this.f27907b;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        InterfaceC10166lf1 interfaceC10166lf1 = (InterfaceC10166lf1) it.next();
                        try {
                            interfaceC10166lf1.mo22240c();
                        } catch (RetryableMountingLayerException e) {
                            if (interfaceC10166lf1.mo22238a() == 0) {
                                interfaceC10166lf1.mo22239b();
                                c11827yf1.f46390g.add(interfaceC10166lf1);
                            } else {
                                ReactSoftExceptionLogger.logSoftException("yf1", new ReactNoCrashSoftException(e));
                            }
                        } catch (Throwable th) {
                            ReactSoftExceptionLogger.logSoftException("yf1", th);
                        }
                    }
                }
                ArrayDeque arrayDeque = this.f27908c;
                if (arrayDeque != null) {
                    Iterator it2 = arrayDeque.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC11318uf1) it2.next()).execute();
                    }
                }
                ArrayList arrayList2 = this.f27909d;
                if (arrayList2 != null) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC11318uf1) it3.next()).execute();
                    }
                }
                if (c11827yf1.f46396m && c11827yf1.f46398o == 0) {
                    c11827yf1.f46398o = this.f27910e;
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    c11827yf1.f46399p = jUptimeMillis2;
                    c11827yf1.f46400q = this.f27911f;
                    c11827yf1.f46401r = this.f27912g;
                    c11827yf1.f46402s = jUptimeMillis;
                    c11827yf1.f46403t = jUptimeMillis2;
                    c11827yf1.f46406w = this.f27913h;
                    MT1.m5370a(0, "delayBeforeDispatchViewUpdates");
                    MT1.m5372c(0, "delayBeforeDispatchViewUpdates");
                    MT1.m5370a(0, "delayBeforeBatchRunStart");
                    MT1.m5372c(0, "delayBeforeBatchRunStart");
                }
                c11827yf1.f46385b.clearLayoutAnimation();
                Trace.endSection();
            } catch (Exception e2) {
                c11827yf1.f46395l = true;
                throw e2;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
