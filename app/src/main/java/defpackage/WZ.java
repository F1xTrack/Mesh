package defpackage;

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
import com.bumptech.glide.a;
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
import com.huawei.hms.rn.push.constants.Core;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
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

/* loaded from: classes.dex */
public final class WZ implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ WZ() {
        this.a = 29;
    }

    private final void a() {
        AbstractC8085xz0 abstractC8085xz0 = ((HandlerC3581eR0) this.c).a;
        C1031Mz0 c1031Mz0 = (C1031Mz0) this.b;
        if (abstractC8085xz0.M == 2) {
            abstractC8085xz0.M = 3;
            HT ht = abstractC8085xz0.q;
            int i = abstractC8085xz0.g.c;
            ht.getClass();
        }
        if (c1031Mz0.d) {
            C1155Oo1 c1155Oo1 = abstractC8085xz0.d;
            synchronized (((ArrayList) c1155Oo1.c)) {
                while (((ArrayList) c1155Oo1.c).size() >= 8) {
                    try {
                        ((C1031Mz0) ((ArrayList) c1155Oo1.c).remove(0)).b.recycle();
                    } finally {
                    }
                }
                ArrayList arrayList = (ArrayList) c1155Oo1.c;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList.add(c1031Mz0);
                        break;
                    } else if (((C1031Mz0) it.next()).equals(c1031Mz0)) {
                        c1031Mz0.b.recycle();
                        break;
                    }
                }
            }
        } else {
            abstractC8085xz0.d.s(c1031Mz0);
        }
        abstractC8085xz0.invalidate();
    }

    private final void b() {
        try {
            i();
        } catch (Error e) {
            synchronized (((ExecutorC5524kY0) this.c).b) {
                ((ExecutorC5524kY0) this.c).c = 1;
                throw e;
            }
        }
    }

    private final void c() {
        C1623Uo1 c1623Uo1C = ((N71) this.c).a.f.c((String) this.b);
        if (c1623Uo1C == null || !c1623Uo1C.c()) {
            return;
        }
        synchronized (((N71) this.c).c) {
            ((N71) this.c).f.put(AbstractC5615l12.d(c1623Uo1C), c1623Uo1C);
            ((N71) this.c).g.add(c1623Uo1C);
            N71 n71 = (N71) this.c;
            n71.h.Z(n71.g);
        }
    }

    private final void d() {
        synchronized (((C7306tt1) this.c).c) {
            ((InterfaceC1025Mx0) ((C7306tt1) this.c).d).onComplete((C1797Wu1) this.b);
        }
    }

    private final void e() {
        synchronized (((C7306tt1) this.c).c) {
            ((InterfaceC3299cy0) ((C7306tt1) this.c).d).onSuccess(((C1797Wu1) this.b).e());
        }
    }

    private final void f() {
        synchronized (((JM1) this.c).c) {
            try {
                InterfaceC1103Nx0 interfaceC1103Nx0 = (InterfaceC1103Nx0) ((JM1) this.c).d;
                if (interfaceC1103Nx0 != null) {
                    interfaceC1103Nx0.onComplete((Task) this.b);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() throws org.json.JSONException, android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 2636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WZ.g():void");
    }

    public List h() {
        C1701Vo1 c1701Vo1U = ((C0844Ko1) this.c).c.u();
        c1701Vo1U.getClass();
        C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c6655qT0A.d(1, "push_sdk_omicron_update_work");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1701Vo1U.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, true);
            try {
                C7925x8 c7925x8 = new C7925x8();
                C7925x8 c7925x82 = new C7925x8();
                while (cursorC.moveToNext()) {
                    String string = cursorC.getString(0);
                    if (((ArrayList) c7925x8.getOrDefault(string, null)) == null) {
                        c7925x8.put(string, new ArrayList());
                    }
                    String string2 = cursorC.getString(0);
                    if (((ArrayList) c7925x82.getOrDefault(string2, null)) == null) {
                        c7925x82.put(string2, new ArrayList());
                    }
                }
                cursorC.moveToPosition(-1);
                c1701Vo1U.b(c7925x8);
                c1701Vo1U.a(c7925x82);
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    String string3 = cursorC.isNull(0) ? null : cursorC.getString(0);
                    int iG = AbstractC5997n12.g(cursorC.getInt(1));
                    C8317zC c8317zCA = C8317zC.a(cursorC.isNull(2) ? null : cursorC.getBlob(2));
                    int i = cursorC.getInt(3);
                    int i2 = cursorC.getInt(4);
                    ArrayList arrayList2 = (ArrayList) c7925x8.getOrDefault(cursorC.getString(0), null);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) c7925x82.getOrDefault(cursorC.getString(0), null);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new C1545To1(string3, iG, c8317zCA, i, i2, arrayList3, arrayList4));
                }
                workDatabase_Impl.n();
                cursorC.close();
                c6655qT0A.release();
                workDatabase_Impl.j();
                return (List) C1623Uo1.u.apply(arrayList);
            } catch (Throwable th) {
                cursorC.close();
                c6655qT0A.release();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.j();
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
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0062, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0063, code lost:
    
        defpackage.ExecutorC5524kY0.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0080, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0082, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L5e
            kY0 r2 = (defpackage.ExecutorC5524kY0) r2     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L5e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            kY0 r0 = (defpackage.ExecutorC5524kY0) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.c     // Catch: java.lang.Throwable -> L20
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
            long r6 = r0.d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L20
            r0.c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L20
            kY0 r4 = (defpackage.ExecutorC5524kY0) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L4d
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            kY0 r0 = (defpackage.ExecutorC5524kY0) r0     // Catch: java.lang.Throwable -> L20
            r0.c = r3     // Catch: java.lang.Throwable -> L20
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
            java.lang.Object r3 = r10.b     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
        L5b:
            r10.b = r2     // Catch: java.lang.Throwable -> L5e
            goto L2
        L5e:
            r0 = move-exception
            goto L85
        L60:
            r0 = move-exception
            goto L80
        L62:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.ExecutorC5524kY0.f     // Catch: java.lang.Throwable -> L60
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r6.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r10.b     // Catch: java.lang.Throwable -> L60
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L60
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
            goto L5b
        L80:
            r10.b = r2     // Catch: java.lang.Throwable -> L5e
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WZ.i():void");
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
            switch (this.a) {
                case 0:
                    ?? r0 = (InterfaceFutureC0750Jj0) this.b;
                    boolean z = r0 instanceof C90;
                    ?? r5 = (ES1) this.c;
                    if (z) {
                        AbstractC5608l0 abstractC5608l0 = (AbstractC5608l0) ((C90) r0);
                        if (abstractC5608l0 instanceof InterfaceC3305d0) {
                            Object obj = abstractC5608l0.a;
                            if (obj instanceof U) {
                                r2 = ((U) obj).a;
                            }
                        }
                        if (r2 != 0) {
                            r5.onFailure(r2);
                            return;
                        }
                    }
                    try {
                        B12.b(r0);
                        FR1 fr1 = (FR1) r5.c;
                        fr1.v1();
                        r5.M();
                        fr1.j = false;
                        fr1.k = 1;
                        fr1.n().n.c(((C8382zX1) r5.b).a, "Successfully registered trigger URI");
                        fr1.U1();
                        return;
                    } catch (ExecutionException e) {
                        r5.onFailure(e.getCause());
                        return;
                    } catch (Throwable th) {
                        r5.onFailure(th);
                        return;
                    }
                case 1:
                    ((InterfaceC4302iD) this.b).onProgressUpdate((I) this.c);
                    return;
                case 2:
                    ((F2) this.b).a = this.c;
                    return;
                case 3:
                    try {
                        Method method = G2.d;
                        Object obj2 = this.c;
                        Object obj3 = this.b;
                        if (method != null) {
                            method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                        } else {
                            G2.e.invoke(obj3, obj2, Boolean.FALSE);
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
                    C1210Ph c1210Ph = ((C0431Fh) this.c).b;
                    if (c1210Ph.e == null) {
                        c1210Ph.e = new C0899Lh();
                    }
                    c1210Ph.e.e((C0665Ih) this.b);
                    return;
                case 5:
                    try {
                        RunnableC3467dr runnableC3467dr = (RunnableC3467dr) this.c;
                        Object objF = AbstractC1500Sz1.f((InterfaceFutureC0750Jj0) this.b);
                        C0365El c0365El = runnableC3467dr.b;
                        if (c0365El != null) {
                            c0365El.b(objF);
                        }
                    } catch (CancellationException unused2) {
                        ((RunnableC3467dr) this.c).cancel(false);
                    } catch (ExecutionException e3) {
                        RunnableC3467dr runnableC3467dr2 = (RunnableC3467dr) this.c;
                        Throwable cause = e3.getCause();
                        C0365El c0365El2 = runnableC3467dr2.b;
                        if (c0365El2 != null) {
                            c0365El2.d(cause);
                        }
                    }
                    return;
                case 6:
                    J11 j11 = (J11) this.b;
                    j11.a.a();
                    synchronized (j11.b) {
                        synchronized (((HO) this.c)) {
                            GO go = ((HO) this.c).a;
                            J11 j112 = (J11) this.b;
                            go.getClass();
                            if (go.a.contains(new FO(j112, AbstractC8451zu1.c))) {
                                HO ho = (HO) this.c;
                                J11 j113 = (J11) this.b;
                                ho.getClass();
                                try {
                                    j113.h(ho.t, 5);
                                } catch (Throwable th2) {
                                    throw new C0209Cl(th2);
                                }
                            }
                            ((HO) this.c).d();
                        }
                    }
                    return;
                case 7:
                    while (true) {
                        ReadableArray readableArray = (ReadableArray) this.b;
                        if (i >= readableArray.size()) {
                            return;
                        }
                        ReadableMap map = readableArray.getMap(i);
                        Activity activity = (Activity) this.c;
                        FastImageSource fastImageSourceA = AbstractC8175yS.a(activity, map);
                        if (map == null || !map.hasKey("uri") || map.getString("uri").isEmpty()) {
                            System.out.println("Source is null or URI is empty");
                        } else {
                            a.h(activity.getApplicationContext()).m59load(fastImageSourceA.isBase64Resource() ? fastImageSourceA.getSource() : fastImageSourceA.isResource() ? fastImageSourceA.getUri() : fastImageSourceA.getGlideUrl()).apply((AbstractC0116Bg) AbstractC8175yS.b(activity, fastImageSourceA, map)).preload();
                        }
                        i++;
                    }
                    break;
                case 8:
                    A10 a10 = (A10) this.c;
                    if (a10.d) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        ((Runnable) this.b).run();
                        return;
                    } catch (Throwable unused3) {
                        a10.c.getClass();
                        return;
                    }
                case 9:
                    while (true) {
                        try {
                            ((Runnable) this.b).run();
                        } catch (Throwable th3) {
                            AbstractC7243tY1.a(JN.a, th3);
                        }
                        C1448Si0 c1448Si0 = (C1448Si0) this.c;
                        Runnable runnableP = c1448Si0.p();
                        if (runnableP == null) {
                            return;
                        }
                        this.b = runnableP;
                        i++;
                        if (i >= 16) {
                            AbstractC0485Fz abstractC0485Fz = c1448Si0.d;
                            if (abstractC0485Fz.n(c1448Si0)) {
                                abstractC0485Fz.l(c1448Si0, this);
                                return;
                            }
                        }
                    }
                case 10:
                    RunnableC6594q9 runnableC6594q9 = (RunnableC6594q9) this.c;
                    Object obj4 = this.b;
                    if (runnableC6594q9.c.get()) {
                        AbstractC6784r9 abstractC6784r9 = runnableC6594q9.e;
                        abstractC6784r9.h(obj4);
                        if (abstractC6784r9.j == runnableC6594q9) {
                            if (abstractC6784r9.g) {
                                if (abstractC6784r9.c) {
                                    abstractC6784r9.f();
                                } else {
                                    abstractC6784r9.f = true;
                                }
                            }
                            SystemClock.uptimeMillis();
                            abstractC6784r9.j = null;
                            abstractC6784r9.e();
                        }
                    } else {
                        AbstractC6784r9 abstractC6784r92 = runnableC6594q9.e;
                        if (abstractC6784r92.i != runnableC6594q9) {
                            abstractC6784r92.h(obj4);
                            if (abstractC6784r92.j == runnableC6594q9) {
                                if (abstractC6784r92.g) {
                                    if (abstractC6784r92.c) {
                                        abstractC6784r92.f();
                                    } else {
                                        abstractC6784r92.f = true;
                                    }
                                }
                                SystemClock.uptimeMillis();
                                abstractC6784r92.j = null;
                                abstractC6784r92.e();
                            }
                        } else if (abstractC6784r92.d) {
                            abstractC6784r92.h(obj4);
                        } else {
                            abstractC6784r92.g = false;
                            SystemClock.uptimeMillis();
                            abstractC6784r92.i = null;
                            abstractC6784r92.c(obj4);
                        }
                    }
                    runnableC6594q9.b = 3;
                    return;
                case 11:
                    QK0 qk0A = ((MainApplication) ((IJ0) ((Context) this.b).getApplicationContext())).a.a();
                    ReactContext reactContextF = qk0A.f();
                    if (reactContextF == null) {
                        qk0A.a(new C2107aI0(this, qk0A, 0));
                        if (qk0A.s) {
                            return;
                        }
                        qk0A.d();
                        return;
                    }
                    try {
                        string = C3554eI0.a((Bundle) this.c).toString();
                    } catch (JSONException unused4) {
                    }
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString(Core.Event.Result.DATA_JSON, string);
                    if (reactContextF.hasActiveCatalystInstance()) {
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextF.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("notificationActionReceived", writableMapCreateMap);
                        return;
                    }
                    return;
                case 12:
                    a();
                    return;
                case 13:
                    ((TM) this.b).b(this.c);
                    return;
                case 14:
                    b();
                    return;
                case 15:
                    C8007xZ0 c8007xZ0 = (C8007xZ0) this.b;
                    try {
                        c8007xZ0.j(h());
                        return;
                    } catch (Throwable th4) {
                        c8007xZ0.k(th4);
                        return;
                    }
                case 16:
                    c();
                    return;
                case 17:
                    L21 l21 = (L21) this.b;
                    R81 r81 = (R81) l21.b;
                    try {
                        if (r81.i(((Callable) this.c).call())) {
                            return;
                        } else {
                            throw new IllegalStateException("Cannot set the result of a completed task.");
                        }
                    } catch (CancellationException unused5) {
                        if (!r81.h()) {
                            throw new IllegalStateException("Cannot cancel a completed task.");
                        }
                        return;
                    } catch (Exception e4) {
                        l21.f(e4);
                        return;
                    }
                case 18:
                    C6846rT1 c6846rT1 = ((C1983Ze1) this.c).d;
                    ((C7409uQ0) c6846rT1.d).a();
                    EM0 em0 = (EM0) this.b;
                    int i2 = em0.a;
                    ((SparseArray) c6846rT1.b).put(i2, em0);
                    ((SparseBooleanArray) c6846rT1.c).put(i2, true);
                    return;
                case 19:
                    C8007xZ0 c8007xZ02 = (C8007xZ0) this.b;
                    try {
                        c8007xZ02.j(((Worker) this.c).getForegroundInfo());
                        return;
                    } catch (Throwable th5) {
                        c8007xZ02.k(th5);
                        return;
                    }
                case 20:
                    d();
                    return;
                case 21:
                    e();
                    return;
                case 22:
                    ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                    while (!((Set) this.c).isEmpty()) {
                        try {
                            C6611qE1 c6611qE1 = (C6611qE1) referenceQueue.remove();
                            if (c6611qE1.a.remove(c6611qE1)) {
                                c6611qE1.clear();
                                c6611qE1.b.getClass();
                            }
                        } catch (InterruptedException unused6) {
                        }
                    }
                    return;
                case 23:
                    if (((C3892g32) ((Task) this.b)).d) {
                        ((C7755wE1) this.c).d.q();
                        return;
                    }
                    try {
                        ((C7755wE1) this.c).d.p(((C7755wE1) this.c).c.then((Task) this.b));
                        return;
                    } catch (C5703lU0 e5) {
                        if (e5.getCause() instanceof Exception) {
                            ((C7755wE1) this.c).d.o((Exception) e5.getCause());
                            return;
                        } else {
                            ((C7755wE1) this.c).d.o(e5);
                            return;
                        }
                    } catch (Exception e6) {
                        ((C7755wE1) this.c).d.o(e6);
                        return;
                    }
                case 24:
                    Callable callable = (Callable) this.b;
                    S81 s81 = (S81) this.c;
                    try {
                        s81.b(callable.call());
                        return;
                    } catch (C3281cs0 e7) {
                        s81.a(e7);
                        return;
                    } catch (Exception e8) {
                        s81.a(new C3281cs0("Internal error has occurred when executing ML Kit tasks", e8));
                        return;
                    }
                case 25:
                    ServiceConnectionC7972xN1 serviceConnectionC7972xN1 = (ServiceConnectionC7972xN1) this.c;
                    C3386dP1 c3386dP1 = serviceConnectionC7972xN1.b.a;
                    C7595vO1 c7595vO1 = c3386dP1.j;
                    C3386dP1.e(c7595vO1);
                    c7595vO1.v1();
                    InterfaceC7559vC1 interfaceC7559vC1 = (InterfaceC7559vC1) this.b;
                    OL1 ol1 = c3386dP1.i;
                    Bundle bundle = new Bundle();
                    bundle.putString(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, serviceConnectionC7972xN1.a);
                    try {
                        QC1 qc1 = (QC1) interfaceC7559vC1;
                        Parcel parcelG = qc1.G();
                        AbstractC6032nC1.c(parcelG, bundle);
                        Parcel parcelJ = qc1.J(1, parcelG);
                        Bundle bundle2 = (Bundle) AbstractC6032nC1.a(parcelJ, Bundle.CREATOR);
                        parcelJ.recycle();
                        if (bundle2 == null) {
                            C3386dP1.e(ol1);
                            ol1.g.d("Install Referrer Service returned a null response");
                        }
                    } catch (Exception e9) {
                        C3386dP1.e(ol1);
                        ol1.g.c(e9.getMessage(), "Exception occurred while retrieving the Install Referrer");
                    }
                    C7595vO1 c7595vO12 = c3386dP1.j;
                    C3386dP1.e(c7595vO12);
                    c7595vO12.v1();
                    throw new IllegalStateException("Unexpected call on client side");
                case 26:
                    f();
                    return;
                case 27:
                    g();
                    return;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    BinderC5880mP1 binderC5880mP1 = (BinderC5880mP1) this.c;
                    binderC5880mP1.a.f0();
                    C0406Ey1 c0406Ey1 = (C0406Ey1) this.b;
                    if (c0406Ey1.c.zza() == null) {
                        C5716lY1 c5716lY1 = binderC5880mP1.a;
                        c5716lY1.getClass();
                        EY1 ey1P = c5716lY1.P((String) Preconditions.checkNotNull(c0406Ey1.a));
                        if (ey1P != null) {
                            c5716lY1.q(c0406Ey1, ey1P);
                            return;
                        }
                        return;
                    }
                    C5716lY1 c5716lY12 = binderC5880mP1.a;
                    c5716lY12.getClass();
                    EY1 ey1P2 = c5716lY12.P((String) Preconditions.checkNotNull(c0406Ey1.a));
                    if (ey1P2 != null) {
                        c5716lY12.K(c0406Ey1, ey1P2);
                        return;
                    }
                    return;
                default:
                    FR1 fr12 = (FR1) this.b;
                    C5295jL1 c5295jL1J = ((C3386dP1) fr12.b).j();
                    String str = c5295jL1J.r;
                    String str2 = (String) this.c;
                    if (str != null && !str.equals(str2)) {
                        i = 1;
                    }
                    c5295jL1J.r = str2;
                    if (i != 0) {
                        ((C3386dP1) fr12.b).j().E1();
                        return;
                    }
                    return;
            }
        } finally {
            ((RunnableC3467dr) this.c).g = null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                C1857Xo1 c1857Xo1 = new C1857Xo1(WZ.class.getSimpleName(), 18);
                C3383dO1 c3383dO1 = new C3383dO1(18, false);
                ((C3383dO1) c1857Xo1.d).c = c3383dO1;
                c1857Xo1.d = c3383dO1;
                c3383dO1.b = (ES1) this.c;
                return c1857Xo1.toString();
            case 14:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((ExecutorC5524kY0) this.c).c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ WZ(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ WZ(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public WZ(ServiceConnectionC7972xN1 serviceConnectionC7972xN1, InterfaceC7559vC1 interfaceC7559vC1, ServiceConnectionC7972xN1 serviceConnectionC7972xN12) {
        this.a = 25;
        this.b = interfaceC7559vC1;
        this.c = serviceConnectionC7972xN1;
    }

    public WZ(C0844Ko1 c0844Ko1) {
        this.a = 15;
        this.c = c0844Ko1;
        this.b = new C8007xZ0();
    }

    public WZ(ExecutorC5524kY0 executorC5524kY0) {
        this.a = 14;
        this.c = executorC5524kY0;
    }
}
