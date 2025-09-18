package p000;

import android.media.AudioTrack;
import android.os.Handler;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import com.p018my.tracker.personalize.PersonalizeApiClient;
import com.p018my.tracker.personalize.PersonalizeRequest;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.protocol.C6083F;
import io.sentry.protocol.C6084G;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: CE */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0141CE implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1258a;

    /* renamed from: b */
    public final /* synthetic */ Object f1259b;

    /* renamed from: c */
    public final /* synthetic */ Object f1260c;

    /* renamed from: d */
    public final /* synthetic */ Object f1261d;

    /* renamed from: e */
    public final /* synthetic */ Object f1262e;

    /* renamed from: f */
    public final /* synthetic */ Object f1263f;

    public /* synthetic */ RunnableC0141CE(PersonalizeApiClient personalizeApiClient, String str, PersonalizeRequest personalizeRequest, Handler handler, PersonalizeApiClient.OnCompleteListener onCompleteListener) {
        this.f1258a = 1;
        this.f1260c = personalizeApiClient;
        this.f1261d = str;
        this.f1262e = personalizeRequest;
        this.f1259b = handler;
        this.f1263f = onCompleteListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1258a) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) this.f1260c;
                G10 g10 = (G10) this.f1261d;
                Handler handler = (Handler) this.f1259b;
                C0037Aa c0037Aa = (C0037Aa) this.f1262e;
                C0328FC c0328fc = (C0328FC) this.f1263f;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (g10 != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC3973eA(g10, 5, c0037Aa));
                    }
                    c0328fc.m2551g();
                    synchronized (C0833NE.f7585m0) {
                        try {
                            int i = C0833NE.f7587o0 - 1;
                            C0833NE.f7587o0 = i;
                            if (i == 0) {
                                C0833NE.f7586n0.shutdown();
                                C0833NE.f7586n0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (g10 != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC3973eA(g10, 5, c0037Aa));
                    }
                    c0328fc.m2551g();
                    synchronized (C0833NE.f7585m0) {
                        try {
                            int i2 = C0833NE.f7587o0 - 1;
                            C0833NE.f7587o0 = i2;
                            if (i2 == 0) {
                                C0833NE.f7586n0.shutdown();
                                C0833NE.f7586n0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 1:
                ((PersonalizeApiClient) this.f1260c).m13631a((String) this.f1261d, (PersonalizeRequest) this.f1262e, (Handler) this.f1259b, (PersonalizeApiClient.OnCompleteListener) this.f1263f);
                return;
            case 2:
                C8215Ri1 c8215Ri1 = (C8215Ri1) this.f1260c;
                InterfaceC6972uo interfaceC6972uoM18274d = c8215Ri1.m18274d();
                InterfaceC6972uo interfaceC6972uo = (InterfaceC6972uo) this.f1259b;
                if (interfaceC6972uo == interfaceC6972uoM18274d) {
                    c8215Ri1.f10394t = ((R61) this.f1261d).m6899d(interfaceC6972uo, true);
                    C8267Si1 c8267Si1 = (C8267Si1) this.f1262e;
                    c8267Si1.getClass();
                    InterfaceC7645Gj1 interfaceC7645Gj1 = (InterfaceC7645Gj1) AbstractC11153tN0.m24897i(c8267Si1, C8267Si1.f10924b);
                    Objects.requireNonNull(interfaceC7645Gj1);
                    interfaceC7645Gj1.mo3142e(c8215Ri1.f10394t, (EnumC11690xa1) this.f1263f);
                    c8215Ri1.m7100P();
                    return;
                }
                return;
            case 3:
                C7863Ko1 c7863Ko1 = (C7863Ko1) this.f1260c;
                O90.m5968f(c7863Ko1, "$this_enqueueUniquelyNamedPeriodic");
                String str = (String) this.f1261d;
                ES1 es1 = (ES1) this.f1259b;
                C4216i1 c4216i1 = (C4216i1) this.f1262e;
                NA0 na0 = (NA0) this.f1263f;
                O90.m5968f(na0, "$workRequest");
                C8435Vo1 c8435Vo1Mo10328u = c7863Ko1.f6316c.mo10328u();
                ArrayList arrayListM8570m = c8435Vo1Mo10328u.m8570m(str);
                if (arrayListM8570m.size() > 1) {
                    es1.m2282C(new C10971ry0(new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.")));
                    return;
                }
                C8279So1 c8279So1 = (C8279So1) AbstractC7167xu.m25957C(arrayListM8570m);
                if (c8279So1 == null) {
                    c4216i1.invoke();
                    return;
                }
                String str2 = c8279So1.f10987a;
                C8383Uo1 c8383Uo1M8569l = c8435Vo1Mo10328u.m8569l(str2);
                if (c8383Uo1M8569l == null) {
                    es1.m2282C(new C10971ry0(new IllegalStateException(AbstractC11153tN0.m24912x("WorkSpec with ", str2, ", that matches a name \"", str, "\", wasn't found"))));
                    return;
                }
                if (!c8383Uo1M8569l.m8185d()) {
                    es1.m2282C(new C10971ry0(new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.")));
                    return;
                }
                if (c8279So1.f10988b == 6) {
                    c8435Vo1Mo10328u.m8562e(str2);
                    c4216i1.invoke();
                    return;
                }
                C8383Uo1 c8383Uo1M8182b = C8383Uo1.m8182b(na0.f10434b, c8279So1.f10987a, 0, null, null, 0, 0L, 0, 1048574);
                try {
                    PD0 pd0 = c7863Ko1.f6319f;
                    O90.m5967e(pd0, "processor");
                    WorkDatabase workDatabase = c7863Ko1.f6316c;
                    O90.m5967e(workDatabase, "workDatabase");
                    C6790rv c6790rv = c7863Ko1.f6315b;
                    O90.m5967e(c6790rv, "configuration");
                    List list = c7863Ko1.f6318e;
                    O90.m5967e(list, "schedulers");
                    AbstractC10468o12.m23309a(pd0, workDatabase, c6790rv, list, c8383Uo1M8182b, na0.f10435c);
                    es1.m2282C(ES1.f2705d);
                    return;
                } catch (Throwable th2) {
                    es1.m2282C(new C10971ry0(th2));
                    return;
                }
            default:
                AtomicReference atomicReference = (AtomicReference) this.f1260c;
                View view = (View) this.f1261d;
                List list2 = (List) this.f1259b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f1262e;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    C6083F c6083f = new C6083F("android_view_system", arrayList);
                    C6084G c6084gM21553f = ViewHierarchyEventProcessor.m21553f(view);
                    arrayList.add(c6084gM21553f);
                    ViewHierarchyEventProcessor.m21551b(view, c6084gM21553f, list2);
                    atomicReference.set(c6083f);
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th3) {
                    ((ILogger) this.f1263f).mo21406d(EnumC6069n1.ERROR, "Failed to process view hierarchy.", th3);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC0141CE(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1258a = i;
        this.f1260c = obj;
        this.f1261d = obj2;
        this.f1259b = obj3;
        this.f1262e = obj4;
        this.f1263f = obj5;
    }
}
