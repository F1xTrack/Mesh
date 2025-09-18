package p000;

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
public final class C7967Mo1 implements InterfaceC10907rS0, InterfaceC11750y30, InterfaceC9177dx0, InterfaceC4243iS, InterfaceC8392Ut0, InterfaceC6883tO, InterfaceC6622pW, InterfaceC0980PZ, InterfaceC10021kX0, InterfaceC8036Nx0, AB1 {

    /* renamed from: c */
    public static final Object f7360c = new Object();

    /* renamed from: d */
    public static ServiceConnectionC11464vo1 f7361d;

    /* renamed from: a */
    public Object f7362a;

    /* renamed from: b */
    public Object f7363b;

    public /* synthetic */ C7967Mo1(Object obj, Object obj2) {
        this.f7362a = obj;
        this.f7363b = obj2;
    }

    /* renamed from: p */
    public static C9450g32 m5437p(Context context, Intent intent, boolean z) {
        ServiceConnectionC11464vo1 serviceConnectionC11464vo1;
        synchronized (f7360c) {
            try {
                if (f7361d == null) {
                    f7361d = new ServiceConnectionC11464vo1(context);
                }
                serviceConnectionC11464vo1 = f7361d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return serviceConnectionC11464vo1.m25491b(intent).mo11139f(new ExecutorC4160h8(2), new C6730rE(26));
        }
        if (C10919rY0.m24401x().m24426z(context)) {
            AbstractC10948rm1.m24487c(context, serviceConnectionC11464vo1, intent);
        } else {
            serviceConnectionC11464vo1.m25491b(intent);
        }
        return AbstractC9376fU1.m18244e(-1);
    }

    /* renamed from: A */
    public C9394fd1 m5438A(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C11137tF0 c11137tF0 = (C11137tF0) ((C11265uF0) this.f7363b).f43624b.get(i);
            String str = (String) ((C11393vF0) this.f7362a).f44302b.get(c11137tF0.f42968d);
            EnumC11009sF0 enumC11009sF0 = c11137tF0.f42969e;
            O90.m5965c(enumC11009sF0);
            int iOrdinal = enumC11009sF0.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else if (iOrdinal == 2) {
                linkedList2.addFirst(str);
                z = true;
            }
            i = c11137tF0.f42967c;
        }
        return new C9394fd1(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: a */
    public void mo1479a(Executor executor, InterfaceC9049cx0 interfaceC9049cx0) {
        synchronized (((HashMap) this.f7363b)) {
            C8890bk0 c8890bk0 = (C8890bk0) ((HashMap) this.f7363b).get(interfaceC9049cx0);
            if (c8890bk0 != null) {
                c8890bk0.f17127a.set(false);
            }
            C8890bk0 c8890bk02 = new C8890bk0(executor, interfaceC9049cx0);
            ((HashMap) this.f7363b).put(interfaceC9049cx0, c8890bk02);
            QR1.m6710h().execute(new RunnableC8339Ts1(this, c8890bk0, c8890bk02, 26));
        }
    }

    @Override // p000.InterfaceC10021kX0
    /* renamed from: b */
    public void mo5439b(C9591hA0 c9591hA0) {
        C9778id1 c9778id1;
        if (c9591hA0.m18763u() == 0 && (c9591hA0.m18763u() & 128) != 0) {
            c9591hA0.m18742H(6);
            int iM18743a = c9591hA0.m18743a() / 4;
            int i = 0;
            while (true) {
                c9778id1 = (C9778id1) this.f7363b;
                if (i >= iM18743a) {
                    break;
                }
                C0683Kq c0683Kq = (C0683Kq) this.f7362a;
                c9591hA0.m18747e(c0683Kq.f6325b, 0, 4);
                c0683Kq.m4760t(0);
                int iM4752l = c0683Kq.m4752l(16);
                c0683Kq.m4763w(3);
                if (iM4752l == 0) {
                    c0683Kq.m4763w(13);
                } else {
                    int iM4752l2 = c0683Kq.m4752l(13);
                    if (c9778id1.f29384h.get(iM4752l2) == null) {
                        c9778id1.f29384h.put(iM4752l2, new C10149lX0(new C8875bc1(c9778id1, iM4752l2)));
                        c9778id1.f29390n++;
                    }
                }
                i++;
            }
            if (c9778id1.f29377a != 2) {
                c9778id1.f29384h.remove(0);
            }
        }
    }

    @Override // p000.InterfaceC8392Ut0
    /* renamed from: c */
    public String mo5440c(int i) {
        C9394fd1 c9394fd1M5438A = m5438A(i);
        List list = (List) c9394fd1M5438A.f27302a;
        String strM25962H = AbstractC7167xu.m25962H((List) c9394fd1M5438A.f27303b, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strM25962H;
        }
        return AbstractC7167xu.m25962H(list, "/", null, null, null, 62) + '/' + strM25962H;
    }

    @Override // p000.InterfaceC6622pW
    public Object collect(InterfaceC6748rW interfaceC6748rW, InterfaceC1382Vy interfaceC1382Vy) {
        Object objCollect = ((C4238iN) this.f7362a).collect(new C7017vW(interfaceC6748rW, (MY0) this.f7363b, 1), interfaceC1382Vy);
        return objCollect == EnumC0817Mz.f7418a ? objCollect : C8313Tf1.f11463a;
    }

    @Override // p000.AB1
    /* renamed from: d */
    public C10919rY0 mo103d(InterfaceC7885Kz1 interfaceC7885Kz1) {
        String str = (String) this.f7363b;
        C10919rY0 c10919rY0 = (C10919rY0) this.f7362a;
        c10919rY0.m24414M(str, interfaceC7885Kz1);
        return c10919rY0;
    }

    @Override // p000.InterfaceC11750y30
    /* renamed from: f */
    public InterfaceC10231mA0 mo5442f(C11240u30 c11240u30, C10728q30 c10728q30) {
        ((C10689pl0) this.f7362a).getClass();
        return new C9108dO1(new C11623x30(c11240u30, c10728q30), (List) this.f7363b, false, 12);
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: g */
    public InterfaceFutureC7800Jj0 mo1480g() {
        return AbstractC11797yQ1.m26149b(new C0267EE(24, this));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new C7712Hr0((Context) ((C7668Gv0) this.f7362a).f3961a, (C3974eB) ((QQ0) this.f7363b).get());
    }

    @Override // p000.InterfaceC8392Ut0
    public String getString(int i) {
        String str = (String) ((C11393vF0) this.f7362a).f44302b.get(i);
        O90.m5967e(str, "getString(...)");
        return str;
    }

    @Override // p000.InterfaceC6883tO
    /* renamed from: h */
    public boolean mo5443h(int i) {
        return m5450s(i) != null;
    }

    @Override // p000.InterfaceC6883tO
    /* renamed from: i */
    public InterfaceC6946uO mo5444i(int i) {
        return m5450s(i);
    }

    @Override // p000.InterfaceC11750y30
    /* renamed from: j */
    public InterfaceC10231mA0 mo5445j() {
        return new C9108dO1(((C10689pl0) this.f7362a).mo5445j(), (List) this.f7363b, false, 12);
    }

    @Override // p000.InterfaceC8392Ut0
    /* renamed from: k */
    public boolean mo5446k(int i) {
        return ((Boolean) m5438A(i).f27304c).booleanValue();
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: l */
    public void mo1481l(InterfaceC9049cx0 interfaceC9049cx0) {
        synchronized (((HashMap) this.f7363b)) {
            try {
                C8890bk0 c8890bk0 = (C8890bk0) ((HashMap) this.f7363b).remove(interfaceC9049cx0);
                if (c8890bk0 != null) {
                    c8890bk0.f17127a.set(false);
                    QR1.m6710h().execute(new RunnableC1096RQ(this, 14, c8890bk0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m5447m(java.lang.Object r7, p000.T71 r8, p000.AbstractC1571Yy r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p000.C8915bw1
            if (r0 == 0) goto L13
            r0 = r9
            bw1 r0 = (p000.C8915bw1) r0
            int r1 = r0.f17239c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17239c = r1
            goto L18
        L13:
            bw1 r0 = new bw1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f17237a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f17239c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p000.RQ1.m7017d(r9)
            PS0 r9 = (p000.PS0) r9
            java.lang.Object r7 = r9.f9075a
            goto L57
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            p000.RQ1.m7017d(r9)
            boolean r9 = r7 instanceof p000.OS0
            r2 = 2
            java.lang.Object r4 = r6.f7363b
            com.vk.push.common.Logger r4 = (com.p019vk.push.common.Logger) r4
            r5 = 0
            if (r9 != 0) goto L58
            java.lang.String r9 = "Start send test push"
            com.vk.push.common.Logger.DefaultImpls.info$default(r4, r9, r5, r2, r5)
            p000.RQ1.m7017d(r7)
            java.lang.String r7 = (java.lang.String) r7
            r0.f17239c = r3
            java.lang.Object r9 = r6.f7362a
            xv1 r9 = (p000.C11732xv1) r9
            java.lang.Object r7 = r9.m26001a(r7, r8, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            return r7
        L58:
            java.lang.String r8 = "Unable to send test push, token is not exists. You need to get Push Token before use sendTestPush"
            com.vk.push.common.Logger.DefaultImpls.warn$default(r4, r8, r5, r2, r5)
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.Throwable r7 = p000.PS0.m6365a(r7)
            r8.<init>(r7)
            OS0 r7 = p000.RQ1.m7015b(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7967Mo1.m5447m(java.lang.Object, T71, Yy):java.lang.Object");
    }

    @Override // p000.InterfaceC1782bO
    /* renamed from: n */
    public boolean mo397n(Object obj, File file, C7830Jy0 c7830Jy0) {
        return ((C1554Yh) this.f7363b).mo397n(new C6506ni((InterfaceC6443mi) this.f7362a, ((BitmapDrawable) ((InterfaceC10011kS0) obj).get()).getBitmap()), file, c7830Jy0);
    }

    /* renamed from: o */
    public void m5448o(OO0 oo0, C11649xG0 c11649xG0) {
        L01 l01 = (L01) this.f7362a;
        C7387Bk1 c7387Bk1M850a = (C7387Bk1) l01.getOrDefault(oo0, null);
        if (c7387Bk1M850a == null) {
            c7387Bk1M850a = C7387Bk1.m850a();
            l01.put(oo0, c7387Bk1M850a);
        }
        c7387Bk1M850a.f1008c = c11649xG0;
        c7387Bk1M850a.f1006a |= 8;
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        if (task.mo11144k()) {
            ((AtomicReference) this.f7362a).set((Location) task.mo11142i());
        }
        ((CountDownLatch) this.f7363b).countDown();
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        if (th instanceof X61) {
            AbstractC9104dM1.m17550i(((C0489Hl) this.f7363b).cancel(false), null);
        } else {
            AbstractC9104dM1.m17550i(((C0300El) this.f7362a).m2375b(null), null);
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        AbstractC9104dM1.m17550i(((C0300El) this.f7362a).m2375b(null), null);
    }

    /* renamed from: q */
    public void m5449q() {
        C8539Xo1 c8539Xo1 = (C8539Xo1) this.f7362a;
        if (c8539Xo1 != null) {
            ((AtomicBoolean) c8539Xo1.f13982c).set(true);
            ((ScheduledFuture) c8539Xo1.f13981b).cancel(true);
        }
        this.f7362a = null;
    }

    @Override // p000.InterfaceC10907rS0
    /* renamed from: r */
    public int mo401r(C7830Jy0 c7830Jy0) {
        return 2;
    }

    /* renamed from: s */
    public InterfaceC6946uO m5450s(int i) {
        HashMap map = (HashMap) this.f7363b;
        return (map == null || !map.containsKey(Integer.valueOf(i))) ? ((InterfaceC6883tO) this.f7362a).mo5444i(i) : (InterfaceC6946uO) map.get(Integer.valueOf(i));
    }

    /* renamed from: t */
    public void m5451t(Exception exc, boolean z) {
        this.f7363b = null;
        HashSet hashSet = (HashSet) this.f7362a;
        P70 p70M6234u = P70.m6234u(hashSet);
        hashSet.clear();
        N70 n70ListIterator = p70M6234u.listIterator(0);
        while (n70ListIterator.hasNext()) {
            C6288kF c6288kF = (C6288kF) n70ListIterator.next();
            c6288kF.getClass();
            c6288kF.m22177k(z ? 1 : 3, exc);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x01cb, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00e5  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m5452u(android.content.Context r13, android.content.res.XmlResourceParser r14) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7967Mo1.m5452u(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* renamed from: v */
    public C11649xG0 m5453v(OO0 oo0, int i) {
        C7387Bk1 c7387Bk1;
        C11649xG0 c11649xG0;
        L01 l01 = (L01) this.f7362a;
        int iM4824e = l01.m4824e(oo0);
        if (iM4824e >= 0 && (c7387Bk1 = (C7387Bk1) l01.m4831m(iM4824e)) != null) {
            int i2 = c7387Bk1.f1006a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c7387Bk1.f1006a = i3;
                if (i == 4) {
                    c11649xG0 = c7387Bk1.f1007b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c11649xG0 = c7387Bk1.f1008c;
                }
                if ((i3 & 12) == 0) {
                    l01.mo4829k(iM4824e);
                    c7387Bk1.f1006a = 0;
                    c7387Bk1.f1007b = null;
                    c7387Bk1.f1008c = null;
                    C7387Bk1.f1005d.mo4580d(c7387Bk1);
                }
                return c11649xG0;
            }
        }
        return null;
    }

    /* renamed from: w */
    public C9450g32 m5454w(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zIsAtLeastO = PlatformVersion.isAtLeastO();
        final Context context = (Context) this.f7362a;
        boolean z = zIsAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return m5437p(context, intent, z2);
        }
        ExecutorC4160h8 executorC4160h8 = (ExecutorC4160h8) this.f7363b;
        return AbstractC9376fU1.m18242c(executorC4160h8, new CallableC7043vw(context, 1, intent)).mo11140g(executorC4160h8, new InterfaceC1319Uy() { // from class: HS
            @Override // p000.InterfaceC1319Uy
            public final Object then(Task task) {
                if (!PlatformVersion.isAtLeastO() || ((Integer) task.mo11142i()).intValue() != 402) {
                    return task;
                }
                return C7967Mo1.m5437p(context, intent, z2).mo11139f(new ExecutorC4160h8(2), new C6730rE(25));
            }
        });
    }

    /* renamed from: x */
    public void m5455x(C6288kF c6288kF) {
        ((HashSet) this.f7362a).add(c6288kF);
        if (((C6288kF) this.f7363b) != null) {
            return;
        }
        this.f7363b = c6288kF;
        C0405GQ c0405gqMo3412h = c6288kF.f36371b.mo3412h();
        c6288kF.f36393x = c0405gqMo3412h;
        HandlerC4230iF handlerC4230iF = c6288kF.f36387r;
        int i = AbstractC7485Dh1.f2166a;
        c0405gqMo3412h.getClass();
        handlerC4230iF.getClass();
        handlerC4230iF.obtainMessage(1, new C6225jF(C9535gk0.f27975b.getAndIncrement(), true, SystemClock.elapsedRealtime(), c0405gqMo3412h)).sendToTarget();
    }

    /* renamed from: y */
    public void m5456y(OO0 oo0) {
        C7387Bk1 c7387Bk1 = (C7387Bk1) ((L01) this.f7362a).getOrDefault(oo0, null);
        if (c7387Bk1 == null) {
            return;
        }
        c7387Bk1.f1006a &= -2;
    }

    /* renamed from: z */
    public void m5457z(OO0 oo0) {
        C7544El0 c7544El0 = (C7544El0) this.f7363b;
        int iM2384l = c7544El0.m2384l() - 1;
        while (true) {
            if (iM2384l < 0) {
                break;
            }
            if (oo0 == c7544El0.m2385m(iM2384l)) {
                Object[] objArr = c7544El0.f2883c;
                Object obj = objArr[iM2384l];
                Object obj2 = C7544El0.f2880e;
                if (obj != obj2) {
                    objArr[iM2384l] = obj2;
                    c7544El0.f2881a = true;
                }
            } else {
                iM2384l--;
            }
        }
        C7387Bk1 c7387Bk1 = (C7387Bk1) ((L01) this.f7362a).remove(oo0);
        if (c7387Bk1 != null) {
            c7387Bk1.f1006a = 0;
            c7387Bk1.f1007b = null;
            c7387Bk1.f1008c = null;
            C7387Bk1.f1005d.mo4580d(c7387Bk1);
        }
    }

    public /* synthetic */ C7967Mo1(Object obj, Object obj2, boolean z) {
        this.f7362a = obj2;
        this.f7363b = obj;
    }

    public C7967Mo1(Context context, int i) {
        switch (i) {
            case 25:
                this.f7362a = context;
                this.f7363b = AbstractC0705LB.m4915b(new S51(6, this));
                break;
            default:
                this.f7362a = context;
                this.f7363b = new ExecutorC4160h8(2);
                break;
        }
    }

    public C7967Mo1(int i) {
        switch (i) {
            case 9:
                this.f7362a = new HashSet();
                break;
            case 14:
                this.f7362a = new C7560Et0();
                this.f7363b = new HashMap();
                break;
            case 24:
                this.f7362a = new L01();
                this.f7363b = new C7544El0();
                break;
        }
    }

    @Override // p000.InterfaceC10021kX0
    /* renamed from: e */
    public void mo5441e(C7783Ja1 c7783Ja1, InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
    }
}
