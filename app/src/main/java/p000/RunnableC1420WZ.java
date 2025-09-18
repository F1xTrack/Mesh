package p000;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import com.dylanvann.fastimage.FastImageSource;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.p015rn.push.constants.Core;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import ru.mes.dnevnik.MainApplication;

/* renamed from: WZ */
/* loaded from: classes.dex */
public final class RunnableC1420WZ implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f13259a;

    /* renamed from: b */
    public Object f13260b;

    /* renamed from: c */
    public Object f13261c;

    public /* synthetic */ RunnableC1420WZ() {
        this.f13259a = 29;
    }

    /* renamed from: a */
    private final void m8809a() {
        AbstractC11739xz0 abstractC11739xz0 = ((HandlerC9241eR0) this.f13261c).f26709a;
        C7988Mz0 c7988Mz0 = (C7988Mz0) this.f13260b;
        if (abstractC11739xz0.f45933M == 2) {
            abstractC11739xz0.f45933M = 3;
            C0471HT c0471ht = abstractC11739xz0.f45950q;
            int i = abstractC11739xz0.f45940g.f46111c;
            c0471ht.getClass();
        }
        if (c7988Mz0.f7425d) {
            C8071Oo1 c8071Oo1 = abstractC11739xz0.f45937d;
            synchronized (((ArrayList) c8071Oo1.f8629c)) {
                while (((ArrayList) c8071Oo1.f8629c).size() >= 8) {
                    try {
                        ((C7988Mz0) ((ArrayList) c8071Oo1.f8629c).remove(0)).f7423b.recycle();
                    } finally {
                    }
                }
                ArrayList arrayList = (ArrayList) c8071Oo1.f8629c;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList.add(c7988Mz0);
                        break;
                    } else if (((C7988Mz0) it.next()).equals(c7988Mz0)) {
                        c7988Mz0.f7423b.recycle();
                        break;
                    }
                }
            }
        } else {
            abstractC11739xz0.f45937d.m6152s(c7988Mz0);
        }
        abstractC11739xz0.invalidate();
    }

    /* renamed from: b */
    private final void m8810b() {
        try {
            m8817i();
        } catch (Error e) {
            synchronized (((ExecutorC10023kY0) this.f13261c).f36537b) {
                ((ExecutorC10023kY0) this.f13261c).f36538c = 1;
                throw e;
            }
        }
    }

    /* renamed from: c */
    private final void m8811c() {
        C8383Uo1 c8383Uo1M6259c = ((N71) this.f13261c).f7512a.f6319f.m6259c((String) this.f13260b);
        if (c8383Uo1M6259c == null || !c8383Uo1M6259c.m8184c()) {
            return;
        }
        synchronized (((N71) this.f13261c).f7514c) {
            ((N71) this.f13261c).f7517f.put(AbstractC10084l12.m22338d(c8383Uo1M6259c), c8383Uo1M6259c);
            ((N71) this.f13261c).f7518g.add(c8383Uo1M6259c);
            N71 n71 = (N71) this.f13261c;
            n71.f7519h.m22567Z(n71.f7518g);
        }
    }

    /* renamed from: d */
    private final void m8812d() {
        synchronized (((C11218tt1) this.f13261c).f43402c) {
            ((InterfaceC7984Mx0) ((C11218tt1) this.f13261c).f43403d).onComplete((C8499Wu1) this.f13260b);
        }
    }

    /* renamed from: e */
    private final void m8813e() {
        synchronized (((C11218tt1) this.f13261c).f43402c) {
            ((InterfaceC9051cy0) ((C11218tt1) this.f13261c).f43403d).onSuccess(((C8499Wu1) this.f13260b).mo8875e());
        }
    }

    /* renamed from: f */
    private final void m8814f() {
        synchronized (((JM1) this.f13261c).f5497c) {
            try {
                InterfaceC8036Nx0 interfaceC8036Nx0 = (InterfaceC8036Nx0) ((JM1) this.f13261c).f5498d;
                if (interfaceC8036Nx0 != null) {
                    interfaceC8036Nx0.onComplete((Task) this.f13260b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:413|763|414|415|(1:418)(7:420|(1:422)|757|423|(7:425|(1:427)(1:429)|753|430|751|431|432)(1:434)|435|436)|419|757|423|(0)(0)|435|436) */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0195, code lost:
    
        r6 = "Unknown";
     */
    /* JADX WARN: Removed duplicated region for block: B:425:0x016c A[Catch: NameNotFoundException -> 0x0195, TryCatch #3 {NameNotFoundException -> 0x0195, blocks: (B:423:0x0161, B:425:0x016c, B:427:0x0178), top: B:757:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x028f A[Catch: IllegalStateException -> 0x02d2, TryCatch #2 {IllegalStateException -> 0x02d2, blocks: (B:464:0x027e, B:468:0x0293, B:472:0x029f, B:476:0x02a7, B:478:0x02af, B:482:0x02c1, B:486:0x02cf, B:485:0x02cb, B:481:0x02bd, B:490:0x02d6, B:492:0x02e8, B:494:0x02ed, B:493:0x02eb, B:471:0x029b, B:467:0x028f), top: B:755:0x027e }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x02af A[Catch: IllegalStateException -> 0x02d2, TryCatch #2 {IllegalStateException -> 0x02d2, blocks: (B:464:0x027e, B:468:0x0293, B:472:0x029f, B:476:0x02a7, B:478:0x02af, B:482:0x02c1, B:486:0x02cf, B:485:0x02cb, B:481:0x02bd, B:490:0x02d6, B:492:0x02e8, B:494:0x02ed, B:493:0x02eb, B:471:0x029b, B:467:0x028f), top: B:755:0x027e }] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x02d6 A[Catch: IllegalStateException -> 0x02d2, TryCatch #2 {IllegalStateException -> 0x02d2, blocks: (B:464:0x027e, B:468:0x0293, B:472:0x029f, B:476:0x02a7, B:478:0x02af, B:482:0x02c1, B:486:0x02cf, B:485:0x02cb, B:481:0x02bd, B:490:0x02d6, B:492:0x02e8, B:494:0x02ed, B:493:0x02eb, B:471:0x029b, B:467:0x028f), top: B:755:0x027e }] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x029b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:765:0x0331 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m8815g() throws org.json.JSONException, android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 2636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC1420WZ.m8815g():void");
    }

    /* renamed from: h */
    public List m8816h() {
        C8435Vo1 c8435Vo1Mo10328u = ((C7863Ko1) this.f13261c).f6316c.mo10328u();
        c8435Vo1Mo10328u.getClass();
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c10781qT0M24005a.mo2033d(1, "push_sdk_omicron_update_work");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c8435Vo1Mo10328u.f12763a;
        workDatabase_Impl.m23792b();
        workDatabase_Impl.m23793c();
        try {
            Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, true);
            try {
                C7119x8 c7119x8 = new C7119x8();
                C7119x8 c7119x82 = new C7119x8();
                while (cursorM7035c.moveToNext()) {
                    String string = cursorM7035c.getString(0);
                    if (((ArrayList) c7119x8.getOrDefault(string, null)) == null) {
                        c7119x8.put(string, new ArrayList());
                    }
                    String string2 = cursorM7035c.getString(0);
                    if (((ArrayList) c7119x82.getOrDefault(string2, null)) == null) {
                        c7119x82.put(string2, new ArrayList());
                    }
                }
                cursorM7035c.moveToPosition(-1);
                c8435Vo1Mo10328u.m8560b(c7119x8);
                c8435Vo1Mo10328u.m8559a(c7119x82);
                ArrayList arrayList = new ArrayList(cursorM7035c.getCount());
                while (cursorM7035c.moveToNext()) {
                    String string3 = cursorM7035c.isNull(0) ? null : cursorM7035c.getString(0);
                    int iM23052g = AbstractC10340n12.m23052g(cursorM7035c.getInt(1));
                    C7249zC c7249zCM26326a = C7249zC.m26326a(cursorM7035c.isNull(2) ? null : cursorM7035c.getBlob(2));
                    int i = cursorM7035c.getInt(3);
                    int i2 = cursorM7035c.getInt(4);
                    ArrayList arrayList2 = (ArrayList) c7119x8.getOrDefault(cursorM7035c.getString(0), null);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) c7119x82.getOrDefault(cursorM7035c.getString(0), null);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new C8331To1(string3, iM23052g, c7249zCM26326a, i, i2, arrayList3, arrayList4));
                }
                workDatabase_Impl.m23799n();
                cursorM7035c.close();
                c10781qT0M24005a.release();
                workDatabase_Impl.m23795j();
                return (List) C8383Uo1.f12133u.apply(arrayList);
            } catch (Throwable th) {
                cursorM7035c.close();
                c10781qT0M24005a.release();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.m23795j();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0052, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0054, code lost:
    
        ((java.lang.Runnable) r10.f13260b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0062, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0063, code lost:
    
        p000.ExecutorC10023kY0.f36535f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f13260b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0080, code lost:
    
        r10.f13260b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0082, code lost:
    
        throw r0;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m8817i() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f13261c     // Catch: java.lang.Throwable -> L5e
            kY0 r2 = (p000.ExecutorC10023kY0) r2     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayDeque r2 = r2.f36537b     // Catch: java.lang.Throwable -> L5e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f13261c     // Catch: java.lang.Throwable -> L20
            kY0 r0 = (p000.ExecutorC10023kY0) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f36538c     // Catch: java.lang.Throwable -> L20
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
            goto L83
        L22:
            long r6 = r0.f36539d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f36539d = r6     // Catch: java.lang.Throwable -> L20
            r0.f36538c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f13261c     // Catch: java.lang.Throwable -> L20
            kY0 r4 = (p000.ExecutorC10023kY0) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f36537b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f13260b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L4d
            java.lang.Object r0 = r10.f13261c     // Catch: java.lang.Throwable -> L20
            kY0 r0 = (p000.ExecutorC10023kY0) r0     // Catch: java.lang.Throwable -> L20
            r0.f36538c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L4c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4c:
            return
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f13260b     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
        L5b:
            r10.f13260b = r2     // Catch: java.lang.Throwable -> L5e
            goto L2
        L5e:
            r0 = move-exception
            goto L85
        L60:
            r0 = move-exception
            goto L80
        L62:
            r3 = move-exception
            java.util.logging.Logger r4 = p000.ExecutorC10023kY0.f36535f     // Catch: java.lang.Throwable -> L60
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r6.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r10.f13260b     // Catch: java.lang.Throwable -> L60
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L60
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
            goto L5b
        L80:
            r10.f13260b = r2     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L83:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L5e
        L85:
            if (r1 == 0) goto L8e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC1420WZ.m8817i():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [Jj0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Jj0] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ES1] */
    @Override // java.lang.Runnable
    public final void run() throws JSONException, Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException {
        ?? r2 = 0;
        String string = null;
        r2 = 0;
        int i = 0;
        try {
            switch (this.f13259a) {
                case 0:
                    ?? r0 = (InterfaceFutureC7800Jj0) this.f13260b;
                    boolean z = r0 instanceof C90;
                    ?? r5 = (ES1) this.f13261c;
                    if (z) {
                        AbstractC6336l0 abstractC6336l0 = (AbstractC6336l0) ((C90) r0);
                        if (abstractC6336l0 instanceof InterfaceC3901d0) {
                            Object obj = abstractC6336l0.f36799a;
                            if (obj instanceof C1258U) {
                                r2 = ((C1258U) obj).f11613a;
                            }
                        }
                        if (r2 != 0) {
                            r5.onFailure(r2);
                            return;
                        }
                    }
                    try {
                        B12.m465b(r0);
                        FR1 fr1 = (FR1) r5.f2709c;
                        fr1.mo7681v1();
                        r5.m2290M();
                        fr1.f3211j = false;
                        fr1.f3212k = 1;
                        fr1.mo6070n().f8385n.m24554c(((C11938zX1) r5.f2708b).f46861a, "Successfully registered trigger URI");
                        fr1.m2650U1();
                        return;
                    } catch (ExecutionException e) {
                        r5.onFailure(e.getCause());
                        return;
                    } catch (Throwable th) {
                        r5.onFailure(th);
                        return;
                    }
                case 1:
                    ((InterfaceC4228iD) this.f13260b).onProgressUpdate((AbstractC0504I) this.f13261c);
                    return;
                case 2:
                    ((C0318F2) this.f13260b).f3020a = this.f13261c;
                    return;
                case 3:
                    try {
                        Method method = AbstractC0381G2.f3538d;
                        Object obj2 = this.f13261c;
                        Object obj3 = this.f13260b;
                        if (method != null) {
                            method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                        } else {
                            AbstractC0381G2.f3539e.invoke(obj3, obj2, Boolean.FALSE);
                        }
                        return;
                    } catch (RuntimeException e2) {
                        if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                            throw e2;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                case 4:
                    C0988Ph c0988Ph = ((C0359Fh) this.f13261c).f3389b;
                    if (c0988Ph.f9228e == null) {
                        c0988Ph.f9228e = new C0736Lh();
                    }
                    c0988Ph.f9228e.mo2213e((C0548Ih) this.f13260b);
                    return;
                case 5:
                    try {
                        RunnableC3953dr runnableC3953dr = (RunnableC3953dr) this.f13261c;
                        Object objM7483f = AbstractC8301Sz1.m7483f((InterfaceFutureC7800Jj0) this.f13260b);
                        C0300El c0300El = runnableC3953dr.f9669b;
                        if (c0300El != null) {
                            c0300El.m2375b(objM7483f);
                        }
                    } catch (CancellationException unused2) {
                        ((RunnableC3953dr) this.f13261c).cancel(false);
                    } catch (ExecutionException e3) {
                        RunnableC3953dr runnableC3953dr2 = (RunnableC3953dr) this.f13261c;
                        Throwable cause = e3.getCause();
                        C0300El c0300El2 = runnableC3953dr2.f9669b;
                        if (c0300El2 != null) {
                            c0300El2.m2377d(cause);
                        }
                    }
                    return;
                case 6:
                    J11 j11 = (J11) this.f13260b;
                    j11.f5261a.m2490a();
                    synchronized (j11.f5262b) {
                        synchronized (((C0466HO) this.f13261c)) {
                            C0403GO c0403go = ((C0466HO) this.f13261c).f4256a;
                            J11 j112 = (J11) this.f13260b;
                            c0403go.getClass();
                            if (c0403go.f3728a.contains(new C0340FO(j112, AbstractC11984zu1.f47093c))) {
                                C0466HO c0466ho = (C0466HO) this.f13261c;
                                J11 j113 = (J11) this.f13260b;
                                c0466ho.getClass();
                                try {
                                    j113.m4123h(c0466ho.f4275t, 5);
                                } catch (Throwable th2) {
                                    throw new C0174Cl(th2);
                                }
                            }
                            ((C0466HO) this.f13261c).m3391d();
                        }
                    }
                    return;
                case 7:
                    while (true) {
                        ReadableArray readableArray = (ReadableArray) this.f13260b;
                        if (i >= readableArray.size()) {
                            return;
                        }
                        ReadableMap map = readableArray.getMap(i);
                        Activity activity = (Activity) this.f13261c;
                        FastImageSource fastImageSourceM26150a = AbstractC7202yS.m26150a(activity, map);
                        if (map == null || !map.hasKey("uri") || map.getString("uri").isEmpty()) {
                            System.out.println("Source is null or URI is empty");
                        } else {
                            ComponentCallbacks2C1874a.m10888h(activity.getApplicationContext()).m26653load(fastImageSourceM26150a.isBase64Resource() ? fastImageSourceM26150a.getSource() : fastImageSourceM26150a.isResource() ? fastImageSourceM26150a.getUri() : fastImageSourceM26150a.getGlideUrl()).apply((AbstractC0106Bg) AbstractC7202yS.m26151b(activity, fastImageSourceM26150a, map)).preload();
                        }
                        i++;
                    }
                    break;
                case 8:
                    A10 a10 = (A10) this.f13261c;
                    if (a10.f16d) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        ((Runnable) this.f13260b).run();
                        return;
                    } catch (Throwable unused3) {
                        a10.f15c.getClass();
                        return;
                    }
                case 9:
                    while (true) {
                        try {
                            ((Runnable) this.f13260b).run();
                        } catch (Throwable th3) {
                            AbstractC11176tY1.m24942a(C0591JN.f5499a, th3);
                        }
                        C8266Si0 c8266Si0 = (C8266Si0) this.f13261c;
                        Runnable runnableM7420p = c8266Si0.m7420p();
                        if (runnableM7420p == null) {
                            return;
                        }
                        this.f13260b = runnableM7420p;
                        i++;
                        if (i >= 16) {
                            AbstractC0377Fz abstractC0377Fz = c8266Si0.f10919d;
                            if (abstractC0377Fz.mo2868n(c8266Si0)) {
                                abstractC0377Fz.mo732l(c8266Si0, this);
                                return;
                            }
                        }
                    }
                case 10:
                    RunnableC6662q9 runnableC6662q9 = (RunnableC6662q9) this.f13261c;
                    Object obj4 = this.f13260b;
                    if (runnableC6662q9.f40632c.get()) {
                        AbstractC6725r9 abstractC6725r9 = runnableC6662q9.f40634e;
                        abstractC6725r9.mo1584h(obj4);
                        if (abstractC6725r9.f41365j == runnableC6662q9) {
                            if (abstractC6725r9.f41362g) {
                                if (abstractC6725r9.f41358c) {
                                    abstractC6725r9.m24165f();
                                } else {
                                    abstractC6725r9.f41361f = true;
                                }
                            }
                            SystemClock.uptimeMillis();
                            abstractC6725r9.f41365j = null;
                            abstractC6725r9.m24164e();
                        }
                    } else {
                        AbstractC6725r9 abstractC6725r92 = runnableC6662q9.f40634e;
                        if (abstractC6725r92.f41364i != runnableC6662q9) {
                            abstractC6725r92.mo1584h(obj4);
                            if (abstractC6725r92.f41365j == runnableC6662q9) {
                                if (abstractC6725r92.f41362g) {
                                    if (abstractC6725r92.f41358c) {
                                        abstractC6725r92.m24165f();
                                    } else {
                                        abstractC6725r92.f41361f = true;
                                    }
                                }
                                SystemClock.uptimeMillis();
                                abstractC6725r92.f41365j = null;
                                abstractC6725r92.m24164e();
                            }
                        } else if (abstractC6725r92.f41359d) {
                            abstractC6725r92.mo1584h(obj4);
                        } else {
                            abstractC6725r92.f41362g = false;
                            SystemClock.uptimeMillis();
                            abstractC6725r92.f41364i = null;
                            abstractC6725r92.mo1581c(obj4);
                        }
                    }
                    runnableC6662q9.f40631b = 3;
                    return;
                case 11:
                    QK0 qk0M6302a = ((MainApplication) ((IJ0) ((Context) this.f13260b).getApplicationContext())).f41951a.m6302a();
                    ReactContext reactContextM6636f = qk0M6302a.m6636f();
                    if (reactContextM6636f == null) {
                        qk0M6302a.m6632a(new C8706aI0(this, qk0M6302a, 0));
                        if (qk0M6302a.f9583s) {
                            return;
                        }
                        qk0M6302a.m6635d();
                        return;
                    }
                    try {
                        string = C9223eI0.m17897a((Bundle) this.f13261c).toString();
                    } catch (JSONException unused4) {
                    }
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString(Core.Event.Result.DATA_JSON, string);
                    if (reactContextM6636f.hasActiveCatalystInstance()) {
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextM6636f.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("notificationActionReceived", writableMapCreateMap);
                        return;
                    }
                    return;
                case 12:
                    m8809a();
                    return;
                case 13:
                    ((C1218TM) this.f13260b).mo3020b(this.f13261c);
                    return;
                case 14:
                    m8810b();
                    return;
                case 15:
                    C11687xZ0 c11687xZ0 = (C11687xZ0) this.f13260b;
                    try {
                        c11687xZ0.m25921j(m8816h());
                        return;
                    } catch (Throwable th4) {
                        c11687xZ0.m25922k(th4);
                        return;
                    }
                case 16:
                    m8811c();
                    return;
                case 17:
                    L21 l21 = (L21) this.f13260b;
                    R81 r81 = (R81) l21.f6473b;
                    try {
                        if (r81.m6916i(((Callable) this.f13261c).call())) {
                            return;
                        } else {
                            throw new IllegalStateException("Cannot set the result of a completed task.");
                        }
                    } catch (CancellationException unused5) {
                        if (!r81.m6915h()) {
                            throw new IllegalStateException("Cannot cancel a completed task.");
                        }
                        return;
                    } catch (Exception e4) {
                        l21.m4874f(e4);
                        return;
                    }
                case 18:
                    C10910rT1 c10910rT1 = ((C8623Ze1) this.f13261c).f15073d;
                    ((C11287uQ0) c10910rT1.f41680d).m25186a();
                    EM0 em0 = (EM0) this.f13260b;
                    int i2 = em0.f2649a;
                    ((SparseArray) c10910rT1.f41678b).put(i2, em0);
                    ((SparseBooleanArray) c10910rT1.f41679c).put(i2, true);
                    return;
                case 19:
                    C11687xZ0 c11687xZ02 = (C11687xZ0) this.f13260b;
                    try {
                        c11687xZ02.m25921j(((Worker) this.f13261c).getForegroundInfo());
                        return;
                    } catch (Throwable th5) {
                        c11687xZ02.m25922k(th5);
                        return;
                    }
                case 20:
                    m8812d();
                    return;
                case 21:
                    m8813e();
                    return;
                case 22:
                    ReferenceQueue referenceQueue = (ReferenceQueue) this.f13260b;
                    while (!((Set) this.f13261c).isEmpty()) {
                        try {
                            C10752qE1 c10752qE1 = (C10752qE1) referenceQueue.remove();
                            if (c10752qE1.f40675a.remove(c10752qE1)) {
                                c10752qE1.clear();
                                c10752qE1.f40676b.getClass();
                            }
                        } catch (InterruptedException unused6) {
                        }
                    }
                    return;
                case 23:
                    if (((C9450g32) ((Task) this.f13260b)).f27546d) {
                        ((C11519wE1) this.f13261c).f44724d.m18390q();
                        return;
                    }
                    try {
                        ((C11519wE1) this.f13261c).f44724d.m18389p(((C11519wE1) this.f13261c).f44723c.then((Task) this.f13260b));
                        return;
                    } catch (C10143lU0 e5) {
                        if (e5.getCause() instanceof Exception) {
                            ((C11519wE1) this.f13261c).f44724d.m18388o((Exception) e5.getCause());
                            return;
                        } else {
                            ((C11519wE1) this.f13261c).f44724d.m18388o(e5);
                            return;
                        }
                    } catch (Exception e6) {
                        ((C11519wE1) this.f13261c).f44724d.m18388o(e6);
                        return;
                    }
                case 24:
                    Callable callable = (Callable) this.f13260b;
                    S81 s81 = (S81) this.f13261c;
                    try {
                        s81.m7184b(callable.call());
                        return;
                    } catch (C9039cs0 e7) {
                        s81.m7183a(e7);
                        return;
                    } catch (Exception e8) {
                        s81.m7183a(new C9039cs0("Internal error has occurred when executing ML Kit tasks", e8));
                        return;
                    }
                case 25:
                    ServiceConnectionC11664xN1 serviceConnectionC11664xN1 = (ServiceConnectionC11664xN1) this.f13261c;
                    C9110dP1 c9110dP1 = serviceConnectionC11664xN1.f45569b.f180a;
                    C11412vO1 c11412vO1 = c9110dP1.f26040j;
                    C9110dP1.m17592e(c11412vO1);
                    c11412vO1.mo7681v1();
                    InterfaceC11388vC1 interfaceC11388vC1 = (InterfaceC11388vC1) this.f13260b;
                    OL1 ol1 = c9110dP1.f26039i;
                    Bundle bundle = new Bundle();
                    bundle.putString(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, serviceConnectionC11664xN1.f45568a);
                    try {
                        QC1 qc1 = (QC1) interfaceC11388vC1;
                        Parcel parcelM23898G = qc1.m23898G();
                        AbstractC10364nC1.m23102c(parcelM23898G, bundle);
                        Parcel parcelM23901J = qc1.m23901J(1, parcelM23898G);
                        Bundle bundle2 = (Bundle) AbstractC10364nC1.m23100a(parcelM23901J, Bundle.CREATOR);
                        parcelM23901J.recycle();
                        if (bundle2 == null) {
                            C9110dP1.m17592e(ol1);
                            ol1.f8378g.m24555d("Install Referrer Service returned a null response");
                        }
                    } catch (Exception e9) {
                        C9110dP1.m17592e(ol1);
                        ol1.f8378g.m24554c(e9.getMessage(), "Exception occurred while retrieving the Install Referrer");
                    }
                    C11412vO1 c11412vO12 = c9110dP1.f26040j;
                    C9110dP1.m17592e(c11412vO12);
                    c11412vO12.mo7681v1();
                    throw new IllegalStateException("Unexpected call on client side");
                case 26:
                    m8814f();
                    return;
                case 27:
                    m8815g();
                    return;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    BinderC10262mP1 binderC10262mP1 = (BinderC10262mP1) this.f13261c;
                    binderC10262mP1.f37671a.m22486f0();
                    C7571Ey1 c7571Ey1 = (C7571Ey1) this.f13260b;
                    if (c7571Ey1.f2989c.zza() == null) {
                        C10152lY1 c10152lY1 = binderC10262mP1.f37671a;
                        c10152lY1.getClass();
                        EY1 ey1M22467P = c10152lY1.m22467P((String) Preconditions.checkNotNull(c7571Ey1.f2987a));
                        if (ey1M22467P != null) {
                            c10152lY1.m22498q(c7571Ey1, ey1M22467P);
                            return;
                        }
                        return;
                    }
                    C10152lY1 c10152lY12 = binderC10262mP1.f37671a;
                    c10152lY12.getClass();
                    EY1 ey1M22467P2 = c10152lY12.m22467P((String) Preconditions.checkNotNull(c7571Ey1.f2987a));
                    if (ey1M22467P2 != null) {
                        c10152lY12.m22462K(c7571Ey1, ey1M22467P2);
                        return;
                    }
                    return;
                default:
                    FR1 fr12 = (FR1) this.f13260b;
                    C9870jL1 c9870jL1M17597j = ((C9110dP1) fr12.f11615b).m17597j();
                    String str = c9870jL1M17597j.f35086r;
                    String str2 = (String) this.f13261c;
                    if (str != null && !str.equals(str2)) {
                        i = 1;
                    }
                    c9870jL1M17597j.f35086r = str2;
                    if (i != 0) {
                        ((C9110dP1) fr12.f11615b).m17597j().m22027E1();
                        return;
                    }
                    return;
            }
        } finally {
            ((RunnableC3953dr) this.f13261c).f26337g = null;
        }
    }

    public String toString() {
        switch (this.f13259a) {
            case 0:
                C8539Xo1 c8539Xo1 = new C8539Xo1(RunnableC1420WZ.class.getSimpleName(), 18);
                C9108dO1 c9108dO1 = new C9108dO1(18, false);
                ((C9108dO1) c8539Xo1.f13983d).f26013c = c9108dO1;
                c8539Xo1.f13983d = c9108dO1;
                c9108dO1.f26012b = (ES1) this.f13261c;
                return c8539Xo1.toString();
            case 14:
                Runnable runnable = (Runnable) this.f13260b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((ExecutorC10023kY0) this.f13261c).f36538c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC1420WZ(Object obj, int i, Object obj2) {
        this.f13259a = i;
        this.f13260b = obj;
        this.f13261c = obj2;
    }

    public /* synthetic */ RunnableC1420WZ(Object obj, Object obj2, boolean z, int i) {
        this.f13259a = i;
        this.f13261c = obj;
        this.f13260b = obj2;
    }

    public RunnableC1420WZ(ServiceConnectionC11664xN1 serviceConnectionC11664xN1, InterfaceC11388vC1 interfaceC11388vC1, ServiceConnectionC11664xN1 serviceConnectionC11664xN12) {
        this.f13259a = 25;
        this.f13260b = interfaceC11388vC1;
        this.f13261c = serviceConnectionC11664xN1;
    }

    public RunnableC1420WZ(C7863Ko1 c7863Ko1) {
        this.f13259a = 15;
        this.f13261c = c7863Ko1;
        this.f13260b = new C11687xZ0();
    }

    public RunnableC1420WZ(ExecutorC10023kY0 executorC10023kY0) {
        this.f13259a = 14;
        this.f13261c = executorC10023kY0;
    }
}
