package defpackage;

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
public final class C2528cV1 extends AbstractC4128hI1 {
    public final ServiceConnectionC6855rW1 d;
    public MJ1 e;
    public volatile Boolean f;
    public final C6280oV1 g;
    public final C0617Hr h;
    public final ArrayList i;
    public final C6280oV1 j;

    public C2528cV1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        this.i = new ArrayList();
        this.h = new C0617Hr(c3386dP1.n);
        this.d = new ServiceConnectionC6855rW1(this);
        this.g = new C6280oV1(this, c3386dP1, 0);
        this.j = new C6280oV1(this, c3386dP1, 1);
    }

    public final void C1(AtomicReference atomicReference) {
        v1();
        A1();
        F1(new RunnableC1492Sx(this, atomicReference, N1(false), 26, false));
    }

    public final void D1(C0406Ey1 c0406Ey1) {
        boolean zD1;
        Preconditions.checkNotNull(c0406Ey1);
        v1();
        A1();
        C7966xL1 c7966xL1K = ((C3386dP1) this.b).k();
        c7966xL1K.u1();
        byte[] bArrL2 = C5910mZ1.l2(c0406Ey1);
        if (bArrL2.length > 131072) {
            c7966xL1K.n().h.d("Conditional user property too long for local database. Sending directly to service");
            zD1 = false;
        } else {
            zD1 = c7966xL1K.D1(2, bArrL2);
        }
        boolean z = zD1;
        F1(new RunnableC7012sL0(this, N1(true), z, new C0406Ey1(c0406Ey1), c0406Ey1));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E1(defpackage.MJ1 r37, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r38, defpackage.EY1 r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2528cV1.E1(MJ1, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, EY1):void");
    }

    public final void F1(Runnable runnable) {
        v1();
        if (I1()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.i;
        if (arrayList.size() >= 1000) {
            n().g.d("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.j.b(60000L);
        G1();
    }

    public final void G1() {
        v1();
        A1();
        if (I1()) {
            return;
        }
        if (!K1()) {
            if (((C3386dP1) this.b).g.H1()) {
                return;
            }
            List<ResolveInfo> listQueryIntentServices = ((C3386dP1) this.b).a.getPackageManager().queryIntentServices(new Intent().setClassName(((C3386dP1) this.b).a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                n().g.d("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            intent.setComponent(new ComponentName(((C3386dP1) this.b).a, "com.google.android.gms.measurement.AppMeasurementService"));
            this.d.a(intent);
            return;
        }
        ServiceConnectionC6855rW1 serviceConnectionC6855rW1 = this.d;
        serviceConnectionC6855rW1.c.v1();
        Context context = ((C3386dP1) serviceConnectionC6855rW1.c.b).a;
        synchronized (serviceConnectionC6855rW1) {
            try {
                if (serviceConnectionC6855rW1.a) {
                    serviceConnectionC6855rW1.c.n().o.d("Connection attempt already in progress");
                    return;
                }
                if (serviceConnectionC6855rW1.b != null && (serviceConnectionC6855rW1.b.isConnecting() || serviceConnectionC6855rW1.b.isConnected())) {
                    serviceConnectionC6855rW1.c.n().o.d("Already awaiting connection attempt");
                    return;
                }
                serviceConnectionC6855rW1.b = new LL1(context, Looper.getMainLooper(), 93, serviceConnectionC6855rW1, serviceConnectionC6855rW1, null);
                serviceConnectionC6855rW1.c.n().o.d("Connecting to remote service");
                serviceConnectionC6855rW1.a = true;
                Preconditions.checkNotNull(serviceConnectionC6855rW1.b);
                serviceConnectionC6855rW1.b.checkAvailabilityAndConnect();
            } finally {
            }
        }
    }

    public final void H1() {
        v1();
        A1();
        ServiceConnectionC6855rW1 serviceConnectionC6855rW1 = this.d;
        if (serviceConnectionC6855rW1.b != null && (serviceConnectionC6855rW1.b.isConnected() || serviceConnectionC6855rW1.b.isConnecting())) {
            serviceConnectionC6855rW1.b.disconnect();
        }
        serviceConnectionC6855rW1.b = null;
        try {
            ConnectionTracker.getInstance().unbindService(((C3386dP1) this.b).a, this.d);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.e = null;
    }

    public final boolean I1() {
        v1();
        A1();
        return this.e != null;
    }

    public final boolean J1() {
        v1();
        A1();
        return !K1() || u1().B2() >= ((Integer) IB1.E0.a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K1() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2528cV1.K1():boolean");
    }

    public final void L1() {
        v1();
        OL1 ol1N = n();
        ArrayList arrayList = this.i;
        ol1N.o.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                n().g.c(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.j.a();
    }

    public final void M1() {
        v1();
        C0617Hr c0617Hr = this.h;
        c0617Hr.b = ((Clock) c0617Hr.c).elapsedRealtime();
        this.g.b(((Long) IB1.U.a(null)).longValue());
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.EY1 N1(boolean r51) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2528cV1.N1(boolean):EY1");
    }

    @Override // defpackage.AbstractC4128hI1
    public final boolean z1() {
        return false;
    }
}
