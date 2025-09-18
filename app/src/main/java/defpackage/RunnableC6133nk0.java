package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.Menu;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.react.uimanager.ViewManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* renamed from: nk0 */
/* loaded from: classes.dex */
public final class RunnableC6133nk0 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ RunnableC6133nk0(int i) {
        this.a = i;
    }

    private final void a() {
        try {
            e();
        } catch (Error e) {
            synchronized (((ExecutorC5715lY0) this.b).a) {
                ((ExecutorC5715lY0) this.b).d = 1;
                throw e;
            }
        }
    }

    private final void b() {
        P81 p81C;
        long jNanoTime;
        while (true) {
            C2272b91 c2272b91 = (C2272b91) this.b;
            synchronized (c2272b91) {
                p81C = c2272b91.c();
            }
            if (p81C == null) {
                return;
            }
            C2081a91 c2081a91 = p81C.c;
            O90.c(c2081a91);
            C2272b91 c2272b912 = (C2272b91) this.b;
            boolean zIsLoggable = C2272b91.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                C6446pN0 c6446pN0 = c2081a91.a.a;
                jNanoTime = System.nanoTime();
                AbstractC3401dU1.a(p81C, c2081a91, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                C2272b91.a(c2272b912, p81C);
                if (zIsLoggable) {
                    C6446pN0 c6446pN02 = c2081a91.a.a;
                    AbstractC3401dU1.a(p81C, c2081a91, "finished run in ".concat(AbstractC3401dU1.b(System.nanoTime() - jNanoTime)));
                }
            } finally {
            }
        }
    }

    private final void c() {
        C6713qm1 c6713qm1 = (C6713qm1) this.b;
        synchronized (c6713qm1.a) {
            try {
                if (c6713qm1.b()) {
                    String.valueOf(c6713qm1.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    c6713qm1.d();
                    if (c6713qm1.b()) {
                        c6713qm1.c = 1;
                        c6713qm1.e();
                    }
                }
            } finally {
            }
        }
    }

    private final void d() {
        synchronized (((JM1) this.b).c) {
            try {
                InterfaceC0947Lx0 interfaceC0947Lx0 = (InterfaceC0947Lx0) ((JM1) this.b).d;
                if (interfaceC0947Lx0 != null) {
                    interfaceC0947Lx0.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0050, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0051, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0057, code lost:
    
        r4.toString();
        defpackage.AbstractC0759Jm0.f("SequentialExecutor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.b     // Catch: java.lang.Throwable -> L55
            lY0 r2 = (defpackage.ExecutorC5715lY0) r2     // Catch: java.lang.Throwable -> L55
            java.util.ArrayDeque r2 = r2.a     // Catch: java.lang.Throwable -> L55
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L55
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.b     // Catch: java.lang.Throwable -> L20
            lY0 r0 = (defpackage.ExecutorC5715lY0) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.d     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1f:
            return
        L20:
            r0 = move-exception
            goto L60
        L22:
            long r6 = r0.e     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.e = r6     // Catch: java.lang.Throwable -> L20
            r0.d = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.b     // Catch: java.lang.Throwable -> L20
            lY0 r4 = (defpackage.ExecutorC5715lY0) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L4b
            java.lang.Object r0 = r10.b     // Catch: java.lang.Throwable -> L20
            lY0 r0 = (defpackage.ExecutorC5715lY0) r0     // Catch: java.lang.Throwable -> L20
            r0.d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L4a
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4a:
            return
        L4b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L55
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
            goto L2
        L55:
            r0 = move-exception
            goto L62
        L57:
            java.lang.String r2 = "SequentialExecutor"
            r4.toString()     // Catch: java.lang.Throwable -> L55
            defpackage.AbstractC0759Jm0.f(r2)     // Catch: java.lang.Throwable -> L55
            goto L2
        L60:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L55
        L62:
            if (r1 == 0) goto L6b
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L6b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC6133nk0.e():void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mk0] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8446zt abstractC8446zt;
        int i;
        int iDelete;
        switch (this.a) {
            case 0:
                this.b.c();
                return;
            case 1:
                ((C0992Mm0) this.b).a();
                return;
            case 2:
                synchronized (((C6794rC0) this.b)) {
                    C6794rC0 c6794rC0 = (C6794rC0) this.b;
                    abstractC8446zt = c6794rC0.g;
                    i = c6794rC0.h;
                    c6794rC0.g = null;
                    c6794rC0.i = false;
                }
                if (AbstractC8446zt.D(abstractC8446zt)) {
                    try {
                        C6794rC0.n((C6794rC0) this.b, abstractC8446zt, i);
                    } finally {
                        AbstractC8446zt.p(abstractC8446zt);
                    }
                }
                C6794rC0.m((C6794rC0) this.b);
                return;
            case 3:
                ((C1915Yi) this.b).getClass();
                return;
            case 4:
                RunnableC8155yL0 runnableC8155yL0 = (RunnableC8155yL0) this.b;
                Message messageObtainMessage = runnableC8155yL0.v.obtainMessage();
                Bundle bundle = new Bundle();
                bundle.putLong("downloadManagerId", runnableC8155yL0.j);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 1314;
                runnableC8155yL0.v.sendMessage(messageObtainMessage);
                return;
            case 5:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.b;
                if (searchView$SearchAutoComplete.g) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.g = false;
                    return;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                ((StaggeredGridLayoutManager) this.b).E0();
                return;
            case 8:
                b();
                return;
            case 9:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.b).c.g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 10:
                ((Toolbar) this.b).v();
                return;
            case 11:
                C3612eb1 c3612eb1 = (C3612eb1) this.b;
                B6 b6 = c3612eb1.b;
                Menu menuU = c3612eb1.u();
                MenuC0225Cq0 menuC0225Cq0 = menuU instanceof MenuC0225Cq0 ? (MenuC0225Cq0) menuU : null;
                if (menuC0225Cq0 != null) {
                    menuC0225Cq0.w();
                }
                try {
                    menuU.clear();
                    if (!b6.onCreatePanelMenu(0, menuU) || !b6.onPreparePanel(0, null, menuU)) {
                        menuU.clear();
                    }
                    if (menuC0225Cq0 != null) {
                        menuC0225Cq0.v();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (menuC0225Cq0 != null) {
                        menuC0225Cq0.v();
                    }
                    throw th;
                }
            case 12:
                ((C7851wk1) this.b).o(0);
                return;
            case 13:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ViewManager) it.next()).trimMemory();
                }
                return;
            case 14:
                RunnableC3654ep1 runnableC3654ep1 = (RunnableC3654ep1) this.b;
                try {
                    try {
                        AbstractC1061Nj0 abstractC1061Nj0 = (AbstractC1061Nj0) runnableC3654ep1.q.get();
                        if (abstractC1061Nj0 == null) {
                            TE teG = TE.G();
                            int i2 = RunnableC3654ep1.s;
                            String str = runnableC3654ep1.e.c;
                            teG.getClass();
                        } else {
                            TE teG2 = TE.G();
                            int i3 = RunnableC3654ep1.s;
                            String str2 = runnableC3654ep1.e.c;
                            abstractC1061Nj0.toString();
                            teG2.getClass();
                            runnableC3654ep1.h = abstractC1061Nj0;
                        }
                    } catch (InterruptedException | ExecutionException unused) {
                        TE teG3 = TE.G();
                        int i4 = RunnableC3654ep1.s;
                        teG3.getClass();
                    } catch (CancellationException unused2) {
                        TE teG4 = TE.G();
                        int i5 = RunnableC3654ep1.s;
                        teG4.getClass();
                    }
                    runnableC3654ep1.b();
                    return;
                } catch (Throwable th2) {
                    runnableC3654ep1.b();
                    throw th2;
                }
            case 15:
                c();
                return;
            case 16:
                ((S81) this.b).c(new IOException("TIMEOUT"));
                return;
            case 17:
                d();
                return;
            case 18:
                ((EM1) this.b).a.H();
                return;
            case 19:
                C6846rT1 c6846rT1 = (C6846rT1) this.b;
                long j = C6846rT1.K((Context) c6846rT1.b).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? j + 33696000000L : -1L;
                if (j2 == -1 || DefaultClock.getInstance().currentTimeMillis() <= j2) {
                    return;
                }
                Context context = (Context) c6846rT1.b;
                if (!C6846rT1.K(context).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    if (strValueOf.length() != 0) {
                        "Failed to clear app set ID generated for App ".concat(strValueOf);
                    }
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context.getPackageName());
                if (strValueOf2.length() != 0) {
                    "Failed to clear app set ID last used time for App ".concat(strValueOf2);
                    return;
                }
                return;
            case 20:
                RunnableC5904mX1 runnableC5904mX1 = (RunnableC5904mX1) this.b;
                ES1 es1 = runnableC5904mX1.c;
                ((WW1) es1.c).v1();
                WW1 ww1 = (WW1) es1.c;
                ww1.n().n.d("Application going to the background");
                ww1.t1().u.a(true);
                ww1.v1();
                ww1.e = true;
                C3386dP1 c3386dP1 = (C3386dP1) ww1.b;
                if (!c3386dP1.g.G1()) {
                    long j3 = runnableC5904mX1.b;
                    H9 h9 = ww1.g;
                    h9.c(j3, false, false);
                    ((C6477pX1) h9.c).a();
                }
                ww1.n().m.c(Long.valueOf(runnableC5904mX1.a), "Application backgrounded at: timestamp_millis");
                FR1 fr1W1 = ww1.w1();
                fr1W1.v1();
                fr1W1.A1();
                C3386dP1 c3386dP12 = (C3386dP1) fr1W1.b;
                C2528cV1 c2528cV1J = RI1.j(c3386dP12);
                if (!c2528cV1J.K1() || c2528cV1J.u1().B2() >= 242600) {
                    C2528cV1 c2528cV1J2 = RI1.j(c3386dP12);
                    c2528cV1J2.F1(new FV1(c2528cV1J2, c2528cV1J2.N1(true), 1));
                }
                GJ1 gj1 = IB1.N0;
                C1263Py1 c1263Py1 = c3386dP1.g;
                if (c1263Py1.E1(null, gj1)) {
                    C5910mZ1 c5910mZ1U1 = ww1.u1();
                    Context context2 = c3386dP1.a;
                    long jA1 = c5910mZ1U1.y2(context2.getPackageName(), c1263Py1.d) ? 1000L : c1263Py1.A1(context2.getPackageName(), IB1.A);
                    ww1.n().o.c(Long.valueOf(jA1), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    c3386dP1.m().C1(jA1);
                    return;
                }
                return;
            case 21:
                C5716lY1 c5716lY1 = (C5716lY1) this.b;
                c5716lY1.p0().v1();
                c5716lY1.k = new AN1(c5716lY1);
                C1656Uz1 c1656Uz1 = new C1656Uz1(c5716lY1);
                c1656Uz1.A1();
                c5716lY1.c = c1656Uz1;
                c5716lY1.U().e = (InterfaceC3493dz1) Preconditions.checkNotNull(c5716lY1.a);
                DW1 dw1 = new DW1(c5716lY1);
                dw1.A1();
                c5716lY1.i = dw1;
                C6959s32 c6959s32 = new C6959s32(c5716lY1);
                c6959s32.A1();
                c5716lY1.f = c6959s32;
                C6825rM1 c6825rM1 = new C6825rM1(c5716lY1, 1);
                c6825rM1.A1();
                c5716lY1.h = c6825rM1;
                EX1 ex1 = new EX1(c5716lY1);
                ex1.A1();
                c5716lY1.e = ex1;
                c5716lY1.d = new EM1(c5716lY1);
                if (c5716lY1.r != c5716lY1.s) {
                    c5716lY1.n().g.b(Integer.valueOf(c5716lY1.r), Integer.valueOf(c5716lY1.s), "Not all upload components initialized");
                }
                c5716lY1.m = true;
                c5716lY1.p0().v1();
                C1656Uz1 c1656Uz12 = c5716lY1.c;
                C5716lY1.w(c1656Uz12);
                c1656Uz12.K2();
                C1656Uz1 c1656Uz13 = c5716lY1.c;
                C5716lY1.w(c1656Uz13);
                c1656Uz13.v1();
                c1656Uz13.z1();
                if (c1656Uz13.h2()) {
                    GJ1 gj12 = IB1.q0;
                    if (((Long) gj12.a(null)).longValue() != 0 && (iDelete = c1656Uz13.C1().delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(((C3386dP1) c1656Uz13.b).n.currentTimeMillis()), String.valueOf(gj12.a(null))})) > 0) {
                        c1656Uz13.n().o.c(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                    }
                }
                if (c5716lY1.i.i.g() == 0) {
                    c5716lY1.i.i.h(c5716lY1.zzb().currentTimeMillis());
                }
                c5716lY1.H();
                return;
            case 22:
                C3386dP1 c3386dP13 = (C3386dP1) this.b;
                C5910mZ1 c5910mZ1 = c3386dP13.l;
                C3386dP1.b(c5910mZ1);
                c5910mZ1.v1();
                if (c5910mZ1.E2() != 1) {
                    OL1 ol1 = c3386dP13.i;
                    C3386dP1.e(ol1);
                    ol1.j.d("registerTrigger called but app not eligible");
                    return;
                }
                FR1 fr1 = c3386dP13.p;
                C3386dP1.c(fr1);
                fr1.v1();
                AS1 as1 = fr1.m;
                if (as1 != null) {
                    as1.a();
                }
                C3386dP1.c(fr1);
                ZO1 zo1 = new ZO1(4);
                zo1.b = fr1;
                new Thread(zo1).start();
                return;
            default:
                ((C3386dP1) ((D6) this.b).b).m().C1(((Long) IB1.z.a(null)).longValue());
                return;
        }
    }

    public /* synthetic */ RunnableC6133nk0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ RunnableC6133nk0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    public RunnableC6133nk0(EM1 em1, boolean z) {
        this.a = 18;
        this.b = em1;
    }
}
