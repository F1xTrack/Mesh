package p000;

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
public final class RunnableC10431nk0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f38497a;

    /* renamed from: b */
    public Object f38498b;

    public /* synthetic */ RunnableC10431nk0(int i) {
        this.f38497a = i;
    }

    /* renamed from: a */
    private final void m23207a() {
        try {
            m23211e();
        } catch (Error e) {
            synchronized (((ExecutorC10151lY0) this.f38498b).f37107a) {
                ((ExecutorC10151lY0) this.f38498b).f37110d = 1;
                throw e;
            }
        }
    }

    /* renamed from: b */
    private final void m23208b() {
        P81 p81M10427c;
        long jNanoTime;
        while (true) {
            C8817b91 c8817b91 = (C8817b91) this.f38498b;
            synchronized (c8817b91) {
                p81M10427c = c8817b91.m10427c();
            }
            if (p81M10427c == null) {
                return;
            }
            C8689a91 c8689a91 = p81M10427c.f8873c;
            O90.m5965c(c8689a91);
            C8817b91 c8817b912 = (C8817b91) this.f38498b;
            boolean zIsLoggable = C8817b91.f16829i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                C10641pN0 c10641pN0 = c8689a91.f15333a.f16830a;
                jNanoTime = System.nanoTime();
                AbstractC9120dU1.m17691a(p81M10427c, c8689a91, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                C8817b91.m10425a(c8817b912, p81M10427c);
                if (zIsLoggable) {
                    C10641pN0 c10641pN02 = c8689a91.f15333a.f16830a;
                    AbstractC9120dU1.m17691a(p81M10427c, c8689a91, "finished run in ".concat(AbstractC9120dU1.m17692b(System.nanoTime() - jNanoTime)));
                }
            } finally {
            }
        }
    }

    /* renamed from: c */
    private final void m23209c() {
        C10820qm1 c10820qm1 = (C10820qm1) this.f38498b;
        synchronized (c10820qm1.f41140a) {
            try {
                if (c10820qm1.m24060b()) {
                    String.valueOf(c10820qm1.f41149j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    c10820qm1.m24062d();
                    if (c10820qm1.m24060b()) {
                        c10820qm1.f41142c = 1;
                        c10820qm1.m24063e();
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: d */
    private final void m23210d() {
        synchronized (((JM1) this.f38498b).f5497c) {
            try {
                InterfaceC7932Lx0 interfaceC7932Lx0 = (InterfaceC7932Lx0) ((JM1) this.f38498b).f5498d;
                if (interfaceC7932Lx0 != null) {
                    interfaceC7932Lx0.mo4300b();
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
        p000.AbstractC7806Jm0.m4412f("SequentialExecutor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m23211e() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f38498b     // Catch: java.lang.Throwable -> L55
            lY0 r2 = (p000.ExecutorC10151lY0) r2     // Catch: java.lang.Throwable -> L55
            java.util.ArrayDeque r2 = r2.f37107a     // Catch: java.lang.Throwable -> L55
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L55
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f38498b     // Catch: java.lang.Throwable -> L20
            lY0 r0 = (p000.ExecutorC10151lY0) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f37110d     // Catch: java.lang.Throwable -> L20
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
            long r6 = r0.f37111e     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f37111e = r6     // Catch: java.lang.Throwable -> L20
            r0.f37110d = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f38498b     // Catch: java.lang.Throwable -> L20
            lY0 r4 = (p000.ExecutorC10151lY0) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f37107a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L4b
            java.lang.Object r0 = r10.f38498b     // Catch: java.lang.Throwable -> L20
            lY0 r0 = (p000.ExecutorC10151lY0) r0     // Catch: java.lang.Throwable -> L20
            r0.f37110d = r3     // Catch: java.lang.Throwable -> L20
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
            p000.AbstractC7806Jm0.m4412f(r2)     // Catch: java.lang.Throwable -> L55
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
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC10431nk0.m23211e():void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mk0] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC7292zt abstractC7292zt;
        int i;
        int iDelete;
        switch (this.f38497a) {
            case 0:
                this.f38498b.mo1998c();
                return;
            case 1:
                ((C7962Mm0) this.f38498b).m5431a();
                return;
            case 2:
                synchronized (((C10875rC0) this.f38498b)) {
                    C10875rC0 c10875rC0 = (C10875rC0) this.f38498b;
                    abstractC7292zt = c10875rC0.f41380g;
                    i = c10875rC0.f41381h;
                    c10875rC0.f41380g = null;
                    c10875rC0.f41382i = false;
                }
                if (AbstractC7292zt.m26565D(abstractC7292zt)) {
                    try {
                        C10875rC0.m24236n((C10875rC0) this.f38498b, abstractC7292zt, i);
                    } finally {
                        AbstractC7292zt.m26569p(abstractC7292zt);
                    }
                }
                C10875rC0.m24235m((C10875rC0) this.f38498b);
                return;
            case 3:
                ((C1555Yi) this.f38498b).getClass();
                return;
            case 4:
                RunnableC11786yL0 runnableC11786yL0 = (RunnableC11786yL0) this.f38498b;
                Message messageObtainMessage = runnableC11786yL0.f46219v.obtainMessage();
                Bundle bundle = new Bundle();
                bundle.putLong("downloadManagerId", runnableC11786yL0.f46207j);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 1314;
                runnableC11786yL0.f46219v.sendMessage(messageObtainMessage);
                return;
            case 5:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f38498b;
                if (searchView$SearchAutoComplete.f15867g) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f15867g = false;
                    return;
                }
                return;
            case 6:
                m23207a();
                return;
            case 7:
                ((StaggeredGridLayoutManager) this.f38498b).m10290E0();
                return;
            case 8:
                m23208b();
                return;
            case 9:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f38498b).f18302c.f782g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 10:
                ((Toolbar) this.f38498b).m9870v();
                return;
            case 11:
                C9262eb1 c9262eb1 = (C9262eb1) this.f38498b;
                WindowCallbackC0070B6 windowCallbackC0070B6 = c9262eb1.f26764b;
                Menu menuM18013u = c9262eb1.m18013u();
                MenuC7450Cq0 menuC7450Cq0 = menuM18013u instanceof MenuC7450Cq0 ? (MenuC7450Cq0) menuM18013u : null;
                if (menuC7450Cq0 != null) {
                    menuC7450Cq0.m1424w();
                }
                try {
                    menuM18013u.clear();
                    if (!windowCallbackC0070B6.onCreatePanelMenu(0, menuM18013u) || !windowCallbackC0070B6.onPreparePanel(0, null, menuM18013u)) {
                        menuM18013u.clear();
                    }
                    if (menuC7450Cq0 != null) {
                        menuC7450Cq0.m1423v();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (menuC7450Cq0 != null) {
                        menuC7450Cq0.m1423v();
                    }
                    throw th;
                }
            case 12:
                ((C11583wk1) this.f38498b).m25689o(0);
                return;
            case 13:
                Iterator it = ((ArrayList) this.f38498b).iterator();
                while (it.hasNext()) {
                    ((ViewManager) it.next()).trimMemory();
                }
                return;
            case 14:
                RunnableC9290ep1 runnableC9290ep1 = (RunnableC9290ep1) this.f38498b;
                try {
                    try {
                        AbstractC8008Nj0 abstractC8008Nj0 = (AbstractC8008Nj0) runnableC9290ep1.f26907q.get();
                        if (abstractC8008Nj0 == null) {
                            C1210TE c1210teM7634G = C1210TE.m7634G();
                            int i2 = RunnableC9290ep1.f26890s;
                            String str = runnableC9290ep1.f26895e.f12136c;
                            c1210teM7634G.getClass();
                        } else {
                            C1210TE c1210teM7634G2 = C1210TE.m7634G();
                            int i3 = RunnableC9290ep1.f26890s;
                            String str2 = runnableC9290ep1.f26895e.f12136c;
                            abstractC8008Nj0.toString();
                            c1210teM7634G2.getClass();
                            runnableC9290ep1.f26898h = abstractC8008Nj0;
                        }
                    } catch (InterruptedException | ExecutionException unused) {
                        C1210TE c1210teM7634G3 = C1210TE.m7634G();
                        int i4 = RunnableC9290ep1.f26890s;
                        c1210teM7634G3.getClass();
                    } catch (CancellationException unused2) {
                        C1210TE c1210teM7634G4 = C1210TE.m7634G();
                        int i5 = RunnableC9290ep1.f26890s;
                        c1210teM7634G4.getClass();
                    }
                    runnableC9290ep1.m18052b();
                    return;
                } catch (Throwable th2) {
                    runnableC9290ep1.m18052b();
                    throw th2;
                }
            case 15:
                m23209c();
                return;
            case 16:
                ((S81) this.f38498b).m7185c(new IOException("TIMEOUT"));
                return;
            case 17:
                m23210d();
                return;
            case 18:
                ((EM1) this.f38498b).f2672a.m22459H();
                return;
            case 19:
                C10910rT1 c10910rT1 = (C10910rT1) this.f38498b;
                long j = C10910rT1.m24364K((Context) c10910rT1.f41678b).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? j + 33696000000L : -1L;
                if (j2 == -1 || DefaultClock.getInstance().currentTimeMillis() <= j2) {
                    return;
                }
                Context context = (Context) c10910rT1.f41678b;
                if (!C10910rT1.m24364K(context).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
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
                RunnableC10278mX1 runnableC10278mX1 = (RunnableC10278mX1) this.f38498b;
                ES1 es1 = runnableC10278mX1.f37765c;
                ((WW1) es1.f2709c).mo7681v1();
                WW1 ww1 = (WW1) es1.f2709c;
                ww1.mo6070n().f8385n.m24555d("Application going to the background");
                ww1.m7851t1().f11760u.m17920a(true);
                ww1.mo7681v1();
                ww1.f13243e = true;
                C9110dP1 c9110dP1 = (C9110dP1) ww1.f11615b;
                if (!c9110dP1.f26037g.m6513G1()) {
                    long j3 = runnableC10278mX1.f37764b;
                    C0451H9 c0451h9 = ww1.f13245g;
                    c0451h9.m3318c(j3, false, false);
                    ((C10662pX1) c0451h9.f4148c).m8321a();
                }
                ww1.mo6070n().f8384m.m24554c(Long.valueOf(runnableC10278mX1.f37763a), "Application backgrounded at: timestamp_millis");
                FR1 fr1M7682w1 = ww1.m7682w1();
                fr1M7682w1.mo7681v1();
                fr1M7682w1.m18793A1();
                C9110dP1 c9110dP12 = (C9110dP1) fr1M7682w1.f11615b;
                C8989cV1 c8989cV1M6946j = RI1.m6946j(c9110dP12);
                if (!c8989cV1M6946j.m10749K1() || c8989cV1M6946j.m7852u1().m22861B2() >= 242600) {
                    C8989cV1 c8989cV1M6946j2 = RI1.m6946j(c9110dP12);
                    c8989cV1M6946j2.m10744F1(new FV1(c8989cV1M6946j2, c8989cV1M6946j2.m10752N1(true), 1));
                }
                GJ1 gj1 = IB1.f4755N0;
                C8143Py1 c8143Py1 = c9110dP1.f26037g;
                if (c8143Py1.m6511E1(null, gj1)) {
                    C10282mZ1 c10282mZ1M7852u1 = ww1.m7852u1();
                    Context context2 = c9110dP1.f26031a;
                    long jM6507A1 = c10282mZ1M7852u1.m22897y2(context2.getPackageName(), c8143Py1.f9377d) ? 1000L : c8143Py1.m6507A1(context2.getPackageName(), IB1.f4728A);
                    ww1.mo6070n().f8386o.m24554c(Long.valueOf(jM6507A1), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    c9110dP1.m17600m().m25196C1(jM6507A1);
                    return;
                }
                return;
            case 21:
                C10152lY1 c10152lY1 = (C10152lY1) this.f38498b;
                c10152lY1.mo6071p0().mo7681v1();
                c10152lY1.f37133k = new AN1(c10152lY1);
                C8405Uz1 c8405Uz1 = new C8405Uz1(c10152lY1);
                c8405Uz1.m18575A1();
                c10152lY1.f37125c = c8405Uz1;
                c10152lY1.m22472U().f9378e = (InterfaceC9182dz1) Preconditions.checkNotNull(c10152lY1.f37123a);
                DW1 dw1 = new DW1(c10152lY1);
                dw1.m18575A1();
                c10152lY1.f37131i = dw1;
                C10986s32 c10986s32 = new C10986s32(c10152lY1);
                c10986s32.m18575A1();
                c10152lY1.f37128f = c10986s32;
                C10896rM1 c10896rM1 = new C10896rM1(c10152lY1, 1);
                c10896rM1.m18575A1();
                c10152lY1.f37130h = c10896rM1;
                EX1 ex1 = new EX1(c10152lY1);
                ex1.m18575A1();
                c10152lY1.f37127e = ex1;
                c10152lY1.f37126d = new EM1(c10152lY1);
                if (c10152lY1.f37140r != c10152lY1.f37141s) {
                    c10152lY1.mo6070n().f8378g.m24553b(Integer.valueOf(c10152lY1.f37140r), Integer.valueOf(c10152lY1.f37141s), "Not all upload components initialized");
                }
                c10152lY1.f37135m = true;
                c10152lY1.mo6071p0().mo7681v1();
                C8405Uz1 c8405Uz12 = c10152lY1.f37125c;
                C10152lY1.m22451w(c8405Uz12);
                c8405Uz12.m8229K2();
                C8405Uz1 c8405Uz13 = c10152lY1.f37125c;
                C10152lY1.m22451w(c8405Uz13);
                c8405Uz13.mo7681v1();
                c8405Uz13.m18576z1();
                if (c8405Uz13.m8252h2()) {
                    GJ1 gj12 = IB1.f4819q0;
                    if (((Long) gj12.m3028a(null)).longValue() != 0 && (iDelete = c8405Uz13.m8212C1().delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(((C9110dP1) c8405Uz13.f11615b).f26044n.currentTimeMillis()), String.valueOf(gj12.m3028a(null))})) > 0) {
                        c8405Uz13.mo6070n().f8386o.m24554c(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                    }
                }
                if (c10152lY1.f37131i.f2035i.m18962g() == 0) {
                    c10152lY1.f37131i.f2035i.m18963h(c10152lY1.zzb().currentTimeMillis());
                }
                c10152lY1.m22459H();
                return;
            case 22:
                C9110dP1 c9110dP13 = (C9110dP1) this.f38498b;
                C10282mZ1 c10282mZ1 = c9110dP13.f26042l;
                C9110dP1.m17589b(c10282mZ1);
                c10282mZ1.mo7681v1();
                if (c10282mZ1.m22863E2() != 1) {
                    OL1 ol1 = c9110dP13.f26039i;
                    C9110dP1.m17592e(ol1);
                    ol1.f8381j.m24555d("registerTrigger called but app not eligible");
                    return;
                }
                FR1 fr1 = c9110dP13.f26046p;
                C9110dP1.m17590c(fr1);
                fr1.mo7681v1();
                AS1 as1 = fr1.f3214m;
                if (as1 != null) {
                    as1.m8321a();
                }
                C9110dP1.m17590c(fr1);
                ZO1 zo1 = new ZO1(4);
                zo1.f14878b = fr1;
                new Thread(zo1).start();
                return;
            default:
                ((C9110dP1) ((C0196D6) this.f38498b).f1842b).m17600m().m25196C1(((Long) IB1.f4836z.m3028a(null)).longValue());
                return;
        }
    }

    public /* synthetic */ RunnableC10431nk0(int i, Object obj) {
        this.f38497a = i;
        this.f38498b = obj;
    }

    public /* synthetic */ RunnableC10431nk0(Object obj, int i, Object obj2) {
        this.f38497a = i;
        this.f38498b = obj;
    }

    public RunnableC10431nk0(EM1 em1, boolean z) {
        this.f38497a = 18;
        this.f38498b = em1;
    }
}
