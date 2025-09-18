package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cV1 */
/* loaded from: classes.dex */
public final class C8989cV1 extends AbstractC9608hI1 {

    /* renamed from: d */
    public final ServiceConnectionC10916rW1 f17573d;

    /* renamed from: e */
    public MJ1 f17574e;

    /* renamed from: f */
    public volatile Boolean f17575f;

    /* renamed from: g */
    public final C10530oV1 f17576g;

    /* renamed from: h */
    public final C0495Hr f17577h;

    /* renamed from: i */
    public final ArrayList f17578i;

    /* renamed from: j */
    public final C10530oV1 f17579j;

    public C8989cV1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        this.f17578i = new ArrayList();
        this.f17577h = new C0495Hr(c9110dP1.f26044n);
        this.f17573d = new ServiceConnectionC10916rW1(this);
        this.f17576g = new C10530oV1(this, c9110dP1, 0);
        this.f17579j = new C10530oV1(this, c9110dP1, 1);
    }

    /* renamed from: C1 */
    public final void m10741C1(AtomicReference atomicReference) {
        mo7681v1();
        m18793A1();
        m10744F1(new RunnableC1192Sx(this, atomicReference, m10752N1(false), 26, false));
    }

    /* renamed from: D1 */
    public final void m10742D1(C7571Ey1 c7571Ey1) {
        boolean zM25843D1;
        Preconditions.checkNotNull(c7571Ey1);
        mo7681v1();
        m18793A1();
        C11660xL1 c11660xL1M17598k = ((C9110dP1) this.f11615b).m17598k();
        c11660xL1M17598k.m7852u1();
        byte[] bArrM22853l2 = C10282mZ1.m22853l2(c7571Ey1);
        if (bArrM22853l2.length > 131072) {
            c11660xL1M17598k.mo6070n().f8379h.m24555d("Conditional user property too long for local database. Sending directly to service");
            zM25843D1 = false;
        } else {
            zM25843D1 = c11660xL1M17598k.m25843D1(2, bArrM22853l2);
        }
        boolean z = zM25843D1;
        m10744F1(new RunnableC11021sL0(this, m10752N1(true), z, new C7571Ey1(c7571Ey1), c7571Ey1));
    }

    /* JADX WARN: Removed duplicated region for block: B:399:0x019a A[Catch: all -> 0x00f6, SQLiteFullException -> 0x0100, SQLiteException -> 0x0180, SQLiteDatabaseLockedException -> 0x0204, TryCatch #16 {all -> 0x00f6, blocks: (B:331:0x00c0, B:334:0x00c7, B:336:0x00cc, B:338:0x00d7, B:342:0x00ed, B:344:0x00f2, B:432:0x0221, B:434:0x0227, B:435:0x022a, B:443:0x0248, B:451:0x025f, B:361:0x011e, B:362:0x0121, B:360:0x011a, B:370:0x0133, B:372:0x0147, B:379:0x015e, B:380:0x0162, B:381:0x0165, B:377:0x0158, B:383:0x0168, B:387:0x017c, B:399:0x019a, B:400:0x019e, B:401:0x01a1, B:397:0x0194, B:406:0x01aa, B:407:0x01b6, B:414:0x01d2, B:416:0x01eb, B:417:0x01f6), top: B:527:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0221 A[Catch: all -> 0x00f6, TRY_ENTER, TryCatch #16 {all -> 0x00f6, blocks: (B:331:0x00c0, B:334:0x00c7, B:336:0x00cc, B:338:0x00d7, B:342:0x00ed, B:344:0x00f2, B:432:0x0221, B:434:0x0227, B:435:0x022a, B:443:0x0248, B:451:0x025f, B:361:0x011e, B:362:0x0121, B:360:0x011a, B:370:0x0133, B:372:0x0147, B:379:0x015e, B:380:0x0162, B:381:0x0165, B:377:0x0158, B:383:0x0168, B:387:0x017c, B:399:0x019a, B:400:0x019e, B:401:0x01a1, B:397:0x0194, B:406:0x01aa, B:407:0x01b6, B:414:0x01d2, B:416:0x01eb, B:417:0x01f6), top: B:527:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x01c1 A[SYNTHETIC] */
    /* renamed from: E1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10743E1(p000.MJ1 r37, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r38, p000.EY1 r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8989cV1.m10743E1(MJ1, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, EY1):void");
    }

    /* renamed from: F1 */
    public final void m10744F1(Runnable runnable) {
        mo7681v1();
        if (m10747I1()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f17578i;
        if (arrayList.size() >= 1000) {
            mo6070n().f8378g.m24555d("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f17579j.m8322b(60000L);
        m10745G1();
    }

    /* renamed from: G1 */
    public final void m10745G1() {
        mo7681v1();
        m18793A1();
        if (m10747I1()) {
            return;
        }
        if (!m10749K1()) {
            if (((C9110dP1) this.f11615b).f26037g.m6514H1()) {
                return;
            }
            List<ResolveInfo> listQueryIntentServices = ((C9110dP1) this.f11615b).f26031a.getPackageManager().queryIntentServices(new Intent().setClassName(((C9110dP1) this.f11615b).f26031a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                mo6070n().f8378g.m24555d("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            intent.setComponent(new ComponentName(((C9110dP1) this.f11615b).f26031a, "com.google.android.gms.measurement.AppMeasurementService"));
            this.f17573d.m24397a(intent);
            return;
        }
        ServiceConnectionC10916rW1 serviceConnectionC10916rW1 = this.f17573d;
        serviceConnectionC10916rW1.f41719c.mo7681v1();
        Context context = ((C9110dP1) serviceConnectionC10916rW1.f41719c.f11615b).f26031a;
        synchronized (serviceConnectionC10916rW1) {
            try {
                if (serviceConnectionC10916rW1.f41717a) {
                    serviceConnectionC10916rW1.f41719c.mo6070n().f8386o.m24555d("Connection attempt already in progress");
                    return;
                }
                if (serviceConnectionC10916rW1.f41718b != null && (serviceConnectionC10916rW1.f41718b.isConnecting() || serviceConnectionC10916rW1.f41718b.isConnected())) {
                    serviceConnectionC10916rW1.f41719c.mo6070n().f8386o.m24555d("Already awaiting connection attempt");
                    return;
                }
                serviceConnectionC10916rW1.f41718b = new LL1(context, Looper.getMainLooper(), 93, serviceConnectionC10916rW1, serviceConnectionC10916rW1, null);
                serviceConnectionC10916rW1.f41719c.mo6070n().f8386o.m24555d("Connecting to remote service");
                serviceConnectionC10916rW1.f41717a = true;
                Preconditions.checkNotNull(serviceConnectionC10916rW1.f41718b);
                serviceConnectionC10916rW1.f41718b.checkAvailabilityAndConnect();
            } finally {
            }
        }
    }

    /* renamed from: H1 */
    public final void m10746H1() {
        mo7681v1();
        m18793A1();
        ServiceConnectionC10916rW1 serviceConnectionC10916rW1 = this.f17573d;
        if (serviceConnectionC10916rW1.f41718b != null && (serviceConnectionC10916rW1.f41718b.isConnected() || serviceConnectionC10916rW1.f41718b.isConnecting())) {
            serviceConnectionC10916rW1.f41718b.disconnect();
        }
        serviceConnectionC10916rW1.f41718b = null;
        try {
            ConnectionTracker.getInstance().unbindService(((C9110dP1) this.f11615b).f26031a, this.f17573d);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f17574e = null;
    }

    /* renamed from: I1 */
    public final boolean m10747I1() {
        mo7681v1();
        m18793A1();
        return this.f17574e != null;
    }

    /* renamed from: J1 */
    public final boolean m10748J1() {
        mo7681v1();
        m18793A1();
        return !m10749K1() || m7852u1().m22861B2() >= ((Integer) IB1.f4737E0.m3028a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /* renamed from: K1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m10749K1() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8989cV1.m10749K1():boolean");
    }

    /* renamed from: L1 */
    public final void m10750L1() {
        mo7681v1();
        OL1 ol1Mo6070n = mo6070n();
        ArrayList arrayList = this.f17578i;
        ol1Mo6070n.f8386o.m24554c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                mo6070n().f8378g.m24554c(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f17579j.m8321a();
    }

    /* renamed from: M1 */
    public final void m10751M1() {
        mo7681v1();
        C0495Hr c0495Hr = this.f17577h;
        c0495Hr.f4553b = ((Clock) c0495Hr.f4554c).elapsedRealtime();
        this.f17576g.m8322b(((Long) IB1.f4768U.m3028a(null)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03a8  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* renamed from: N1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.EY1 m10752N1(boolean r51) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8989cV1.m10752N1(boolean):EY1");
    }

    @Override // p000.AbstractC9608hI1
    /* renamed from: z1 */
    public final boolean mo2654z1() {
        return false;
    }
}
