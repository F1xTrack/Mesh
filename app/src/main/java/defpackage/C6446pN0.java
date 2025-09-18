package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.firebase.perf.metrics.Trace;
import com.vk.push.core.filedatastore.FileDataStore;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* renamed from: pN0 */
/* loaded from: classes2.dex */
public final class C6446pN0 implements InterfaceC0195Cg0, InterfaceC1998Zj1, OR0, X51, InterfaceC4105hB, InterfaceC3648en1, InterfaceC3680ey0, InterfaceC1571Tx0, InterfaceC0947Lx0, InterfaceC1103Nx0, InterfaceC7055sZ1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C6446pN0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void A(int i, int i2) {
        ((C3964gR1) this.b).B(i, i2);
    }

    public void B(int i, long j) {
        ((C3964gR1) this.b).E(i, j);
    }

    public void C(int i, Object obj, InterfaceC3404dV1 interfaceC3404dV1) {
        IP1 ip1 = (IP1) obj;
        C3964gR1 c3964gR1 = (C3964gR1) this.b;
        c3964gR1.H(i, 2);
        c3964gR1.I(ip1.a(interfaceC3404dV1));
        interfaceC3404dV1.g(ip1, c3964gR1.b);
    }

    public void D(int i, int i2) {
        ((C3964gR1) this.b).D(i, i2);
    }

    public void E(int i, long j) {
        ((C3964gR1) this.b).y(i, j);
    }

    public void F(int i, int i2) {
        ((C3964gR1) this.b).B(i, i2);
    }

    @Override // defpackage.OR0
    public Set F0() {
        Set setA = ((KR0) this.b).a();
        HashSet hashSet = new HashSet(setA.size());
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            JR0 jr0 = ((KR0) it.next()).d;
            if (jr0 != null) {
                hashSet.add(jr0);
            }
        }
        return hashSet;
    }

    public void G(int i, long j) {
        ((C3964gR1) this.b).E(i, (j >> 63) ^ (j << 1));
    }

    public void H(int i, int i2) {
        ((C3964gR1) this.b).J(i, (i2 >> 31) ^ (i2 << 1));
    }

    public void I(int i, long j) {
        ((C3964gR1) this.b).E(i, j);
    }

    public void J(int i, int i2) {
        ((C3964gR1) this.b).J(i, i2);
    }

    @Override // defpackage.InterfaceC3648en1
    public int a() {
        InputStream inputStream = (InputStream) this.b;
        return (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) | ((inputStream.read() << 8) & 65280);
    }

    @Override // defpackage.InterfaceC0947Lx0
    public void b() {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.InterfaceC7055sZ1
    public void c(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C5716lY1 c5716lY1 = (C5716lY1) this.b;
        if (!zIsEmpty) {
            c5716lY1.p0().E1(new RunnableC6720qp(this, str, str2, bundle, 13, false));
            return;
        }
        C3386dP1 c3386dP1 = c5716lY1.l;
        if (c3386dP1 != null) {
            OL1 ol1 = c3386dP1.i;
            C3386dP1.e(ol1);
            ol1.g.c(str2, "AppId not known when logging event");
        }
    }

    @Override // defpackage.InterfaceC3648en1
    public int d() {
        return ((InputStream) this.b).read();
    }

    @Override // defpackage.InterfaceC1998Zj1
    public int e(View view) {
        AO0 ao0 = (AO0) view.getLayoutParams();
        ((AbstractC8354zO0) this.b).getClass();
        return (view.getLeft() - ((AO0) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ao0).leftMargin;
    }

    @Override // defpackage.InterfaceC1998Zj1
    public int f() {
        return ((AbstractC8354zO0) this.b).E();
    }

    @Override // defpackage.InterfaceC3648en1
    public long g() throws IOException {
        long j = 4;
        while (j > 0) {
            InputStream inputStream = (InputStream) this.b;
            long jSkip = inputStream.skip(j);
            if (jSkip > 0) {
                j -= jSkip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j--;
            }
        }
        return 4 - j;
    }

    @Override // defpackage.InterfaceC1998Zj1
    public int h() {
        AbstractC8354zO0 abstractC8354zO0 = (AbstractC8354zO0) this.b;
        return abstractC8354zO0.n - abstractC8354zO0.F();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(java.lang.String r6, defpackage.AbstractC1963Yy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C4248hw1
            if (r0 == 0) goto L13
            r0 = r7
            hw1 r0 = (defpackage.C4248hw1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            hw1 r0 = new hw1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.RQ1.d(r7)
            PS0 r7 = (defpackage.PS0) r7
            java.lang.Object r6 = r7.a
            goto L5e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.String r6 = r0.a
            defpackage.RQ1.d(r7)
            goto L4e
        L3c:
            defpackage.RQ1.d(r7)
            java.lang.Object r7 = r5.b
            Rr1 r7 = (defpackage.C1398Rr1) r7
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            Sr1 r7 = (defpackage.C1476Sr1) r7
            Xq1 r7 = r7.b
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6446pN0.i(java.lang.String, Yy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(boolean r10, defpackage.AbstractC1963Yy r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.C7118su1
            if (r0 == 0) goto L13
            r0 = r11
            su1 r0 = (defpackage.C7118su1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            su1 r0 = new su1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.d
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            int r10 = r0.c
            boolean r0 = r0.b
            defpackage.RQ1.d(r11)
            goto L79
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            boolean r10 = r0.b
            pN0 r2 = r0.a
            defpackage.RQ1.d(r11)
            goto L54
        L3f:
            defpackage.RQ1.d(r11)
            r0.a = r9
            r0.b = r10
            r0.f = r5
            java.lang.Object r11 = r9.b
            com.vk.push.core.filedatastore.FileDataStore r11 = (com.vk.push.core.filedatastore.FileDataStore) r11
            java.lang.Object r11 = r11.read(r0)
            if (r11 != r1) goto L53
            return r1
        L53:
            r2 = r9
        L54:
            pu1 r11 = (defpackage.C6546pu1) r11
            if (r11 == 0) goto L5b
            boolean r11 = r11.a
            goto L5c
        L5b:
            r11 = r3
        L5c:
            java.lang.Object r2 = r2.b
            com.vk.push.core.filedatastore.FileDataStore r2 = (com.vk.push.core.filedatastore.FileDataStore) r2
            pu1 r6 = new pu1
            r6.<init>(r10)
            r7 = 0
            r0.a = r7
            r0.b = r10
            r0.c = r11
            r0.f = r4
            java.lang.Object r0 = r2.write(r6, r0)
            if (r0 != r1) goto L75
            return r1
        L75:
            r8 = r0
            r0 = r10
            r10 = r11
            r11 = r8
        L79:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r10 == r0) goto L84
            if (r11 == 0) goto L84
            r3 = r5
        L84:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6446pN0.j(boolean, Yy):java.lang.Object");
    }

    public C0493Gb1 m() {
        List listUnmodifiableList;
        C0259Db1 c0259Db1N = C0493Gb1.N();
        c0259Db1N.s(((Trace) this.b).d);
        c0259Db1N.q(((Trace) this.b).k.a);
        Trace trace = (Trace) this.b;
        c0259Db1N.r(trace.k.b(trace.l));
        for (C1654Uz c1654Uz : ((Trace) this.b).e.values()) {
            c0259Db1N.p(c1654Uz.b.get(), c1654Uz.a);
        }
        ArrayList arrayList = ((Trace) this.b).h;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0259Db1N.o(new C6446pN0(8, (Trace) it.next()).m());
            }
        }
        Map<String, String> attributes = ((Trace) this.b).getAttributes();
        c0259Db1N.n();
        C0493Gb1.y((C0493Gb1) c0259Db1N.b).putAll(attributes);
        Trace trace2 = (Trace) this.b;
        synchronized (trace2.g) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (JA0 ja0 : trace2.g) {
                    if (ja0 != null) {
                        arrayList2.add(ja0);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        IA0[] ia0ArrB = JA0.b(listUnmodifiableList);
        if (ia0ArrB != null) {
            List listAsList = Arrays.asList(ia0ArrB);
            c0259Db1N.n();
            C0493Gb1.A((C0493Gb1) c0259Db1N.b, listAsList);
        }
        return (C0493Gb1) c0259Db1N.l();
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void n(C1559Tt0 c1559Tt0, C0230Cs c0230Cs) {
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0273Dg0 o(C1559Tt0 c1559Tt0) {
        if ("b".equals(c1559Tt0.b())) {
            return new C6255oN0(this, 2);
        }
        return null;
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        AbstractC4110hC1 abstractC4110hC1 = (AbstractC4110hC1) this.b;
        if (task.k()) {
            abstractC4110hC1.setResult((AbstractC4110hC1) Status.RESULT_SUCCESS);
            return;
        }
        if (((C3892g32) task).d) {
            abstractC4110hC1.setFailedResult(Status.RESULT_CANCELED);
            return;
        }
        Exception excH = task.h();
        if (excH instanceof ApiException) {
            abstractC4110hC1.setFailedResult(((ApiException) excH).getStatus());
        } else {
            abstractC4110hC1.setFailedResult(Status.RESULT_INTERNAL_ERROR);
        }
    }

    @Override // defpackage.InterfaceC1571Tx0
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.InterfaceC3680ey0
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void p(C1559Tt0 c1559Tt0, C0074As c0074As, C1559Tt0 c1559Tt02) {
    }

    public void q(float f, int i) {
        C3964gR1 c3964gR1 = (C3964gR1) this.b;
        c3964gR1.getClass();
        c3964gR1.B(i, Float.floatToRawIntBits(f));
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0195Cg0 r(C0074As c0074As, C1559Tt0 c1559Tt0) {
        return null;
    }

    public void s(int i, double d) {
        C3964gR1 c3964gR1 = (C3964gR1) this.b;
        c3964gR1.getClass();
        c3964gR1.y(i, Double.doubleToRawLongBits(d));
    }

    @Override // defpackage.InterfaceC1998Zj1
    public View t(int i) {
        return ((AbstractC8354zO0) this.b).u(i);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return super.toString() + "{fragment=" + ((KR0) this.b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC1998Zj1
    public int u(View view) {
        AO0 ao0 = (AO0) view.getLayoutParams();
        ((AbstractC8354zO0) this.b).getClass();
        return view.getRight() + ((AO0) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ao0).rightMargin;
    }

    public void v(int i, int i2) {
        ((C3964gR1) this.b).D(i, i2);
    }

    public void w(int i, long j) {
        ((C3964gR1) this.b).y(i, j);
    }

    public void x(int i, Object obj, InterfaceC3404dV1 interfaceC3404dV1) {
        C3964gR1 c3964gR1 = (C3964gR1) this.b;
        c3964gR1.H(i, 3);
        interfaceC3404dV1.g((IP1) obj, c3964gR1.b);
        c3964gR1.H(i, 4);
    }

    public void y(int i, JQ1 jq1) {
        C3964gR1 c3964gR1 = (C3964gR1) this.b;
        c3964gR1.H(i, 2);
        c3964gR1.n(jq1);
    }

    public void z(int i, boolean z) {
        C3964gR1 c3964gR1 = (C3964gR1) this.b;
        c3964gR1.H(i, 0);
        c3964gR1.g(z ? (byte) 1 : (byte) 0);
    }

    public C6446pN0(FileDataStore fileDataStore) {
        this.a = 12;
        O90.f(fileDataStore, "storage");
        this.b = fileDataStore;
    }

    public C6446pN0(C3964gR1 c3964gR1) {
        this.a = 17;
        Charset charset = BS1.a;
        if (c3964gR1 != null) {
            this.b = c3964gR1;
            c3964gR1.b = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public C6446pN0(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = new C0162Bv0(12);
                break;
            case 14:
                this.b = new CountDownLatch(1);
                break;
            case 16:
                break;
            default:
                this.b = new C5396jt0(21);
                break;
        }
    }

    public C6446pN0(View view) {
        this.a = 5;
        if (Build.VERSION.SDK_INT >= 30) {
            O21 o21 = new O21(0, view);
            o21.c = view;
            this.b = o21;
            return;
        }
        this.b = new L21(0, view);
    }

    public C6446pN0(WindowInsetsController windowInsetsController) {
        this.a = 5;
        O21 o21 = new O21(0, null);
        o21.d = windowInsetsController;
        this.b = o21;
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void k() {
    }

    public C6446pN0(ThreadFactoryC7842wh1 threadFactoryC7842wh1) {
        this.a = 7;
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC7842wh1);
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void l(C1559Tt0 c1559Tt0, Object obj) {
    }
}
