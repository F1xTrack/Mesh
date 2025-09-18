package defpackage;

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
public final class RunnableC4006gf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayDeque c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ C8216yf1 i;

    public RunnableC4006gf1(C8216yf1 c8216yf1, int i, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j, long j2, long j3, long j4) {
        this.i = c8216yf1;
        this.a = i;
        this.b = arrayList;
        this.c = arrayDeque;
        this.d = arrayList2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8216yf1 c8216yf1 = this.i;
        new ArrayList().add("BatchId: " + String.valueOf(this.a));
        MT1.b("DispatchUI".concat(""));
        try {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = this.b;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        InterfaceC5737lf1 interfaceC5737lf1 = (InterfaceC5737lf1) it.next();
                        try {
                            interfaceC5737lf1.c();
                        } catch (RetryableMountingLayerException e) {
                            if (interfaceC5737lf1.a() == 0) {
                                interfaceC5737lf1.b();
                                c8216yf1.g.add(interfaceC5737lf1);
                            } else {
                                ReactSoftExceptionLogger.logSoftException("yf1", new ReactNoCrashSoftException(e));
                            }
                        } catch (Throwable th) {
                            ReactSoftExceptionLogger.logSoftException("yf1", th);
                        }
                    }
                }
                ArrayDeque arrayDeque = this.c;
                if (arrayDeque != null) {
                    Iterator it2 = arrayDeque.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC7455uf1) it2.next()).execute();
                    }
                }
                ArrayList arrayList2 = this.d;
                if (arrayList2 != null) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC7455uf1) it3.next()).execute();
                    }
                }
                if (c8216yf1.m && c8216yf1.o == 0) {
                    c8216yf1.o = this.e;
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    c8216yf1.p = jUptimeMillis2;
                    c8216yf1.q = this.f;
                    c8216yf1.r = this.g;
                    c8216yf1.s = jUptimeMillis;
                    c8216yf1.t = jUptimeMillis2;
                    c8216yf1.w = this.h;
                    MT1.a(0, "delayBeforeDispatchViewUpdates");
                    MT1.c(0, "delayBeforeDispatchViewUpdates");
                    MT1.a(0, "delayBeforeBatchRunStart");
                    MT1.c(0, "delayBeforeBatchRunStart");
                }
                c8216yf1.b.clearLayoutAnimation();
                Trace.endSection();
            } catch (Exception e2) {
                c8216yf1.l = true;
                throw e2;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
