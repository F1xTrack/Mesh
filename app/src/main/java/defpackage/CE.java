package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import com.my.tracker.personalize.PersonalizeApiClient;
import com.my.tracker.personalize.PersonalizeRequest;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.protocol.F;
import io.sentry.protocol.G;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class CE implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ CE(PersonalizeApiClient personalizeApiClient, String str, PersonalizeRequest personalizeRequest, Handler handler, PersonalizeApiClient.OnCompleteListener onCompleteListener) {
        this.a = 1;
        this.c = personalizeApiClient;
        this.d = str;
        this.e = personalizeRequest;
        this.b = handler;
        this.f = onCompleteListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) this.c;
                G10 g10 = (G10) this.d;
                Handler handler = (Handler) this.b;
                C0020Aa c0020Aa = (C0020Aa) this.e;
                FC fc = (FC) this.f;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (g10 != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC3529eA(g10, 5, c0020Aa));
                    }
                    fc.g();
                    synchronized (NE.m0) {
                        try {
                            int i = NE.o0 - 1;
                            NE.o0 = i;
                            if (i == 0) {
                                NE.n0.shutdown();
                                NE.n0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (g10 != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC3529eA(g10, 5, c0020Aa));
                    }
                    fc.g();
                    synchronized (NE.m0) {
                        try {
                            int i2 = NE.o0 - 1;
                            NE.o0 = i2;
                            if (i2 == 0) {
                                NE.n0.shutdown();
                                NE.n0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 1:
                ((PersonalizeApiClient) this.c).a((String) this.d, (PersonalizeRequest) this.e, (Handler) this.b, (PersonalizeApiClient.OnCompleteListener) this.f);
                return;
            case 2:
                C1371Ri1 c1371Ri1 = (C1371Ri1) this.c;
                InterfaceC7480uo interfaceC7480uoD = c1371Ri1.d();
                InterfaceC7480uo interfaceC7480uo = (InterfaceC7480uo) this.b;
                if (interfaceC7480uo == interfaceC7480uoD) {
                    c1371Ri1.t = ((R61) this.d).d(interfaceC7480uo, true);
                    C1449Si1 c1449Si1 = (C1449Si1) this.e;
                    c1449Si1.getClass();
                    InterfaceC0517Gj1 interfaceC0517Gj1 = (InterfaceC0517Gj1) AbstractC7209tN0.i(c1449Si1, C1449Si1.b);
                    Objects.requireNonNull(interfaceC0517Gj1);
                    interfaceC0517Gj1.e(c1371Ri1.t, (EnumC8011xa1) this.f);
                    c1371Ri1.P();
                    return;
                }
                return;
            case 3:
                C0844Ko1 c0844Ko1 = (C0844Ko1) this.c;
                O90.f(c0844Ko1, "$this_enqueueUniquelyNamedPeriodic");
                String str = (String) this.d;
                ES1 es1 = (ES1) this.b;
                C4263i1 c4263i1 = (C4263i1) this.e;
                NA0 na0 = (NA0) this.f;
                O90.f(na0, "$workRequest");
                C1701Vo1 c1701Vo1U = c0844Ko1.c.u();
                ArrayList arrayListM = c1701Vo1U.m(str);
                if (arrayListM.size() > 1) {
                    es1.C(new C6938ry0(new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.")));
                    return;
                }
                C1467So1 c1467So1 = (C1467So1) AbstractC8069xu.C(arrayListM);
                if (c1467So1 == null) {
                    c4263i1.invoke();
                    return;
                }
                String str2 = c1467So1.a;
                C1623Uo1 c1623Uo1L = c1701Vo1U.l(str2);
                if (c1623Uo1L == null) {
                    es1.C(new C6938ry0(new IllegalStateException(AbstractC7209tN0.x("WorkSpec with ", str2, ", that matches a name \"", str, "\", wasn't found"))));
                    return;
                }
                if (!c1623Uo1L.d()) {
                    es1.C(new C6938ry0(new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.")));
                    return;
                }
                if (c1467So1.b == 6) {
                    c1701Vo1U.e(str2);
                    c4263i1.invoke();
                    return;
                }
                C1623Uo1 c1623Uo1B = C1623Uo1.b(na0.b, c1467So1.a, 0, null, null, 0, 0L, 0, 1048574);
                try {
                    PD0 pd0 = c0844Ko1.f;
                    O90.e(pd0, "processor");
                    WorkDatabase workDatabase = c0844Ko1.c;
                    O90.e(workDatabase, "workDatabase");
                    C6928rv c6928rv = c0844Ko1.b;
                    O90.e(c6928rv, "configuration");
                    List list = c0844Ko1.e;
                    O90.e(list, "schedulers");
                    AbstractC6188o12.a(pd0, workDatabase, c6928rv, list, c1623Uo1B, na0.c);
                    es1.C(ES1.d);
                    return;
                } catch (Throwable th2) {
                    es1.C(new C6938ry0(th2));
                    return;
                }
            default:
                AtomicReference atomicReference = (AtomicReference) this.c;
                View view = (View) this.d;
                List list2 = (List) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    F f = new F("android_view_system", arrayList);
                    G gF = ViewHierarchyEventProcessor.f(view);
                    arrayList.add(gF);
                    ViewHierarchyEventProcessor.b(view, gF, list2);
                    atomicReference.set(f);
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th3) {
                    ((ILogger) this.f).d(EnumC5148n1.ERROR, "Failed to process view hierarchy.", th3);
                    return;
                }
        }
    }

    public /* synthetic */ CE(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
