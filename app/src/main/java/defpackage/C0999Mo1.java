package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Mo1 */
/* loaded from: classes.dex */
public final class C0999Mo1 implements InterfaceC6842rS0, InterfaceC8101y30, InterfaceC3486dx0, InterfaceC4347iS, InterfaceC1637Ut0, InterfaceC7211tO, InterfaceC6472pW, PZ, InterfaceC5521kX0, InterfaceC1103Nx0, AB1 {
    public static final Object c = new Object();
    public static ServiceConnectionC7673vo1 d;
    public Object a;
    public Object b;

    public /* synthetic */ C0999Mo1(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static C3892g32 p(Context context, Intent intent, boolean z) {
        ServiceConnectionC7673vo1 serviceConnectionC7673vo1;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new ServiceConnectionC7673vo1(context);
                }
                serviceConnectionC7673vo1 = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return serviceConnectionC7673vo1.b(intent).f(new ExecutorC4096h8(2), new C6799rE(26));
        }
        if (C6860rY0.x().z(context)) {
            AbstractC6903rm1.c(context, serviceConnectionC7673vo1, intent);
        } else {
            serviceConnectionC7673vo1.b(intent);
        }
        return AbstractC3782fU1.e(-1);
    }

    public C3809fd1 A(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C7185tF0 c7185tF0 = (C7185tF0) ((C7376uF0) this.b).b.get(i);
            String str = (String) ((C7567vF0) this.a).b.get(c7185tF0.d);
            EnumC6994sF0 enumC6994sF0 = c7185tF0.e;
            O90.c(enumC6994sF0);
            int iOrdinal = enumC6994sF0.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else if (iOrdinal == 2) {
                linkedList2.addFirst(str);
                z = true;
            }
            i = c7185tF0.c;
        }
        return new C3809fd1(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // defpackage.InterfaceC3486dx0
    public void a(Executor executor, InterfaceC3296cx0 interfaceC3296cx0) {
        synchronized (((HashMap) this.b)) {
            C2382bk0 c2382bk0 = (C2382bk0) ((HashMap) this.b).get(interfaceC3296cx0);
            if (c2382bk0 != null) {
                c2382bk0.a.set(false);
            }
            C2382bk0 c2382bk02 = new C2382bk0(executor, interfaceC3296cx0);
            ((HashMap) this.b).put(interfaceC3296cx0, c2382bk02);
            QR1.h().execute(new RunnableC1557Ts1(this, c2382bk0, c2382bk02, 26));
        }
    }

    @Override // defpackage.InterfaceC5521kX0
    public void b(C4103hA0 c4103hA0) {
        C4382id1 c4382id1;
        if (c4103hA0.u() == 0 && (c4103hA0.u() & 128) != 0) {
            c4103hA0.H(6);
            int iA = c4103hA0.a() / 4;
            int i = 0;
            while (true) {
                c4382id1 = (C4382id1) this.b;
                if (i >= iA) {
                    break;
                }
                C0848Kq c0848Kq = (C0848Kq) this.a;
                c4103hA0.e(c0848Kq.b, 0, 4);
                c0848Kq.t(0);
                int iL = c0848Kq.l(16);
                c0848Kq.w(3);
                if (iL == 0) {
                    c0848Kq.w(13);
                } else {
                    int iL2 = c0848Kq.l(13);
                    if (c4382id1.h.get(iL2) == null) {
                        c4382id1.h.put(iL2, new C5712lX0(new C2359bc1(c4382id1, iL2)));
                        c4382id1.n++;
                    }
                }
                i++;
            }
            if (c4382id1.a != 2) {
                c4382id1.h.remove(0);
            }
        }
    }

    @Override // defpackage.InterfaceC1637Ut0
    public String c(int i) {
        C3809fd1 c3809fd1A = A(i);
        List list = (List) c3809fd1A.a;
        String strH = AbstractC8069xu.H((List) c3809fd1A.b, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strH;
        }
        return AbstractC8069xu.H(list, "/", null, null, null, 62) + '/' + strH;
    }

    @Override // defpackage.InterfaceC6472pW
    public Object collect(InterfaceC6853rW interfaceC6853rW, InterfaceC1729Vy interfaceC1729Vy) {
        Object objCollect = ((C4332iN) this.a).collect(new C7617vW(interfaceC6853rW, (MY0) this.b, 1), interfaceC1729Vy);
        return objCollect == EnumC1030Mz.a ? objCollect : C1518Tf1.a;
    }

    @Override // defpackage.AB1
    public C6860rY0 d(InterfaceC0877Kz1 interfaceC0877Kz1) {
        String str = (String) this.b;
        C6860rY0 c6860rY0 = (C6860rY0) this.a;
        c6860rY0.M(str, interfaceC0877Kz1);
        return c6860rY0;
    }

    @Override // defpackage.InterfaceC8101y30
    public InterfaceC5834mA0 f(C7339u30 c7339u30, C6576q30 c6576q30) {
        ((C6518pl0) this.a).getClass();
        return new C3383dO1(new C7911x30(c7339u30, c6576q30), (List) this.b, false, 12);
    }

    @Override // defpackage.InterfaceC3486dx0
    public InterfaceFutureC0750Jj0 g() {
        return AbstractC8171yQ1.b(new EE(24, this));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new C0618Hr0((Context) ((C0552Gv0) this.a).a, (C3532eB) ((QQ0) this.b).get());
    }

    @Override // defpackage.InterfaceC1637Ut0
    public String getString(int i) {
        String str = (String) ((C7567vF0) this.a).b.get(i);
        O90.e(str, "getString(...)");
        return str;
    }

    @Override // defpackage.InterfaceC7211tO
    public boolean h(int i) {
        return s(i) != null;
    }

    @Override // defpackage.InterfaceC7211tO
    public InterfaceC7402uO i(int i) {
        return s(i);
    }

    @Override // defpackage.InterfaceC8101y30
    public InterfaceC5834mA0 j() {
        return new C3383dO1(((C6518pl0) this.a).j(), (List) this.b, false, 12);
    }

    @Override // defpackage.InterfaceC1637Ut0
    public boolean k(int i) {
        return ((Boolean) A(i).c).booleanValue();
    }

    @Override // defpackage.InterfaceC3486dx0
    public void l(InterfaceC3296cx0 interfaceC3296cx0) {
        synchronized (((HashMap) this.b)) {
            try {
                C2382bk0 c2382bk0 = (C2382bk0) ((HashMap) this.b).remove(interfaceC3296cx0);
                if (c2382bk0 != null) {
                    c2382bk0.a.set(false);
                    QR1.h().execute(new RQ(this, 14, c2382bk0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(java.lang.Object r7, defpackage.T71 r8, defpackage.AbstractC1963Yy r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C2419bw1
            if (r0 == 0) goto L13
            r0 = r9
            bw1 r0 = (defpackage.C2419bw1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bw1 r0 = new bw1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.RQ1.d(r9)
            PS0 r9 = (defpackage.PS0) r9
            java.lang.Object r7 = r9.a
            goto L57
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.RQ1.d(r9)
            boolean r9 = r7 instanceof defpackage.OS0
            r2 = 2
            java.lang.Object r4 = r6.b
            com.vk.push.common.Logger r4 = (com.vk.push.common.Logger) r4
            r5 = 0
            if (r9 != 0) goto L58
            java.lang.String r9 = "Start send test push"
            com.vk.push.common.Logger.DefaultImpls.info$default(r4, r9, r5, r2, r5)
            defpackage.RQ1.d(r7)
            java.lang.String r7 = (java.lang.String) r7
            r0.c = r3
            java.lang.Object r9 = r6.a
            xv1 r9 = (defpackage.C8074xv1) r9
            java.lang.Object r7 = r9.a(r7, r8, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            return r7
        L58:
            java.lang.String r8 = "Unable to send test push, token is not exists. You need to get Push Token before use sendTestPush"
            com.vk.push.common.Logger.DefaultImpls.warn$default(r4, r8, r5, r2, r5)
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.Throwable r7 = defpackage.PS0.a(r7)
            r8.<init>(r7)
            OS0 r7 = defpackage.RQ1.b(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0999Mo1.m(java.lang.Object, T71, Yy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC2315bO
    public boolean n(Object obj, File file, C0795Jy0 c0795Jy0) {
        return ((C1912Yh) this.b).n(new C6126ni((InterfaceC5935mi) this.a, ((BitmapDrawable) ((InterfaceC5506kS0) obj).get()).getBitmap()), file, c0795Jy0);
    }

    public void o(OO0 oo0, C7950xG0 c7950xG0) {
        L01 l01 = (L01) this.a;
        C0130Bk1 c0130Bk1A = (C0130Bk1) l01.getOrDefault(oo0, null);
        if (c0130Bk1A == null) {
            c0130Bk1A = C0130Bk1.a();
            l01.put(oo0, c0130Bk1A);
        }
        c0130Bk1A.c = c7950xG0;
        c0130Bk1A.a |= 8;
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        if (task.k()) {
            ((AtomicReference) this.a).set((Location) task.i());
        }
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        if (th instanceof X61) {
            AbstractC3377dM1.i(((C0599Hl) this.b).cancel(false), null);
        } else {
            AbstractC3377dM1.i(((C0365El) this.a).b(null), null);
        }
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        AbstractC3377dM1.i(((C0365El) this.a).b(null), null);
    }

    public void q() {
        C1857Xo1 c1857Xo1 = (C1857Xo1) this.a;
        if (c1857Xo1 != null) {
            ((AtomicBoolean) c1857Xo1.c).set(true);
            ((ScheduledFuture) c1857Xo1.b).cancel(true);
        }
        this.a = null;
    }

    @Override // defpackage.InterfaceC6842rS0
    public int r(C0795Jy0 c0795Jy0) {
        return 2;
    }

    public InterfaceC7402uO s(int i) {
        HashMap map = (HashMap) this.b;
        return (map == null || !map.containsKey(Integer.valueOf(i))) ? ((InterfaceC7211tO) this.a).i(i) : (InterfaceC7402uO) map.get(Integer.valueOf(i));
    }

    public void t(Exception exc, boolean z) {
        this.b = null;
        HashSet hashSet = (HashSet) this.a;
        P70 p70U = P70.u(hashSet);
        hashSet.clear();
        N70 n70ListIterator = p70U.listIterator(0);
        while (n70ListIterator.hasNext()) {
            C5466kF c5466kF = (C5466kF) n70ListIterator.next();
            c5466kF.getClass();
            c5466kF.k(z ? 1 : 3, exc);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x01cb, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(android.content.Context r13, android.content.res.XmlResourceParser r14) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0999Mo1.u(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public C7950xG0 v(OO0 oo0, int i) {
        C0130Bk1 c0130Bk1;
        C7950xG0 c7950xG0;
        L01 l01 = (L01) this.a;
        int iE = l01.e(oo0);
        if (iE >= 0 && (c0130Bk1 = (C0130Bk1) l01.m(iE)) != null) {
            int i2 = c0130Bk1.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c0130Bk1.a = i3;
                if (i == 4) {
                    c7950xG0 = c0130Bk1.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c7950xG0 = c0130Bk1.c;
                }
                if ((i3 & 12) == 0) {
                    l01.k(iE);
                    c0130Bk1.a = 0;
                    c0130Bk1.b = null;
                    c0130Bk1.c = null;
                    C0130Bk1.d.d(c0130Bk1);
                }
                return c7950xG0;
            }
        }
        return null;
    }

    public C3892g32 w(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zIsAtLeastO = PlatformVersion.isAtLeastO();
        final Context context = (Context) this.a;
        boolean z = zIsAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return p(context, intent, z2);
        }
        ExecutorC4096h8 executorC4096h8 = (ExecutorC4096h8) this.b;
        return AbstractC3782fU1.c(executorC4096h8, new CallableC7695vw(context, 1, intent)).g(executorC4096h8, new InterfaceC1651Uy() { // from class: HS
            @Override // defpackage.InterfaceC1651Uy
            public final Object then(Task task) {
                if (!PlatformVersion.isAtLeastO() || ((Integer) task.i()).intValue() != 402) {
                    return task;
                }
                return C0999Mo1.p(context, intent, z2).f(new ExecutorC4096h8(2), new C6799rE(25));
            }
        });
    }

    public void x(C5466kF c5466kF) {
        ((HashSet) this.a).add(c5466kF);
        if (((C5466kF) this.b) != null) {
            return;
        }
        this.b = c5466kF;
        GQ gqH = c5466kF.b.h();
        c5466kF.x = gqH;
        HandlerC4308iF handlerC4308iF = c5466kF.r;
        int i = AbstractC0277Dh1.a;
        gqH.getClass();
        handlerC4308iF.getClass();
        handlerC4308iF.obtainMessage(1, new C5275jF(C4020gk0.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), gqH)).sendToTarget();
    }

    public void y(OO0 oo0) {
        C0130Bk1 c0130Bk1 = (C0130Bk1) ((L01) this.a).getOrDefault(oo0, null);
        if (c0130Bk1 == null) {
            return;
        }
        c0130Bk1.a &= -2;
    }

    public void z(OO0 oo0) {
        C0366El0 c0366El0 = (C0366El0) this.b;
        int iL = c0366El0.l() - 1;
        while (true) {
            if (iL < 0) {
                break;
            }
            if (oo0 == c0366El0.m(iL)) {
                Object[] objArr = c0366El0.c;
                Object obj = objArr[iL];
                Object obj2 = C0366El0.e;
                if (obj != obj2) {
                    objArr[iL] = obj2;
                    c0366El0.a = true;
                }
            } else {
                iL--;
            }
        }
        C0130Bk1 c0130Bk1 = (C0130Bk1) ((L01) this.a).remove(oo0);
        if (c0130Bk1 != null) {
            c0130Bk1.a = 0;
            c0130Bk1.b = null;
            c0130Bk1.c = null;
            C0130Bk1.d.d(c0130Bk1);
        }
    }

    public /* synthetic */ C0999Mo1(Object obj, Object obj2, boolean z) {
        this.a = obj2;
        this.b = obj;
    }

    public C0999Mo1(Context context, int i) {
        switch (i) {
            case 25:
                this.a = context;
                this.b = LB.b(new S51(6, this));
                break;
            default:
                this.a = context;
                this.b = new ExecutorC4096h8(2);
                break;
        }
    }

    public C0999Mo1(int i) {
        switch (i) {
            case 9:
                this.a = new HashSet();
                break;
            case 14:
                this.a = new C0390Et0();
                this.b = new HashMap();
                break;
            case 24:
                this.a = new L01();
                this.b = new C0366El0();
                break;
        }
    }

    @Override // defpackage.InterfaceC5521kX0
    public void e(C0724Ja1 c0724Ja1, YR yr, YM0 ym0) {
    }
}
