package p000;

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
import com.p019vk.push.core.filedatastore.FileDataStore;
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
public final class C10641pN0 implements InterfaceC7430Cg0, InterfaceC8633Zj1, OR0, X51, InterfaceC4163hB, InterfaceC9286en1, InterfaceC9307ey0, InterfaceC8348Tx0, InterfaceC7932Lx0, InterfaceC8036Nx0, InterfaceC11050sZ1 {

    /* renamed from: a */
    public final /* synthetic */ int f40041a;

    /* renamed from: b */
    public Object f40042b;

    public /* synthetic */ C10641pN0(int i, Object obj) {
        this.f40041a = i;
        this.f40042b = obj;
    }

    /* renamed from: A */
    public void m23747A(int i, int i2) {
        ((C9498gR1) this.f40042b).m18543B(i, i2);
    }

    /* renamed from: B */
    public void m23748B(int i, long j) {
        ((C9498gR1) this.f40042b).m18546E(i, j);
    }

    /* renamed from: C */
    public void m23749C(int i, Object obj, InterfaceC9122dV1 interfaceC9122dV1) {
        IP1 ip1 = (IP1) obj;
        C9498gR1 c9498gR1 = (C9498gR1) this.f40042b;
        c9498gR1.m18549H(i, 2);
        c9498gR1.m18550I(ip1.mo3856a(interfaceC9122dV1));
        interfaceC9122dV1.mo17699g(ip1, c9498gR1.f27801b);
    }

    /* renamed from: D */
    public void m23750D(int i, int i2) {
        ((C9498gR1) this.f40042b).m18545D(i, i2);
    }

    /* renamed from: E */
    public void m23751E(int i, long j) {
        ((C9498gR1) this.f40042b).m18556y(i, j);
    }

    /* renamed from: F */
    public void m23752F(int i, int i2) {
        ((C9498gR1) this.f40042b).m18543B(i, i2);
    }

    @Override // p000.OR0
    /* renamed from: F0 */
    public Set mo53F0() {
        Set setM4643a = ((KR0) this.f40042b).m4643a();
        HashSet hashSet = new HashSet(setM4643a.size());
        Iterator it = setM4643a.iterator();
        while (it.hasNext()) {
            JR0 jr0 = ((KR0) it.next()).f6108d;
            if (jr0 != null) {
                hashSet.add(jr0);
            }
        }
        return hashSet;
    }

    /* renamed from: G */
    public void m23753G(int i, long j) {
        ((C9498gR1) this.f40042b).m18546E(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: H */
    public void m23754H(int i, int i2) {
        ((C9498gR1) this.f40042b).m18551J(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: I */
    public void m23755I(int i, long j) {
        ((C9498gR1) this.f40042b).m18546E(i, j);
    }

    /* renamed from: J */
    public void m23756J(int i, int i2) {
        ((C9498gR1) this.f40042b).m18551J(i, i2);
    }

    @Override // p000.InterfaceC9286en1
    /* renamed from: a */
    public int mo4741a() {
        InputStream inputStream = (InputStream) this.f40042b;
        return (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE) | ((inputStream.read() << 8) & 65280);
    }

    @Override // p000.InterfaceC7932Lx0
    /* renamed from: b */
    public void mo4300b() {
        ((CountDownLatch) this.f40042b).countDown();
    }

    @Override // p000.InterfaceC11050sZ1
    /* renamed from: c */
    public void mo23757c(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C10152lY1 c10152lY1 = (C10152lY1) this.f40042b;
        if (!zIsEmpty) {
            c10152lY1.mo6071p0().m25412E1(new RunnableC6704qp(this, str, str2, bundle, 13, false));
            return;
        }
        C9110dP1 c9110dP1 = c10152lY1.f37134l;
        if (c9110dP1 != null) {
            OL1 ol1 = c9110dP1.f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8378g.m24554c(str2, "AppId not known when logging event");
        }
    }

    @Override // p000.InterfaceC9286en1
    /* renamed from: d */
    public int mo4744d() {
        return ((InputStream) this.f40042b).read();
    }

    @Override // p000.InterfaceC8633Zj1
    /* renamed from: e */
    public int mo2896e(View view) {
        AO0 ao0 = (AO0) view.getLayoutParams();
        ((AbstractC11919zO0) this.f40042b).getClass();
        return (view.getLeft() - ((AO0) view.getLayoutParams()).f183b.left) - ((ViewGroup.MarginLayoutParams) ao0).leftMargin;
    }

    @Override // p000.InterfaceC8633Zj1
    /* renamed from: f */
    public int mo2897f() {
        return ((AbstractC11919zO0) this.f40042b).m26411E();
    }

    @Override // p000.InterfaceC9286en1
    /* renamed from: g */
    public long mo4747g() throws IOException {
        long j = 4;
        while (j > 0) {
            InputStream inputStream = (InputStream) this.f40042b;
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

    @Override // p000.InterfaceC8633Zj1
    /* renamed from: h */
    public int mo2899h() {
        AbstractC11919zO0 abstractC11919zO0 = (AbstractC11919zO0) this.f40042b;
        return abstractC11919zO0.f46826n - abstractC11919zO0.m26412F();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m23758i(java.lang.String r6, p000.AbstractC1571Yy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.C9688hw1
            if (r0 == 0) goto L13
            r0 = r7
            hw1 r0 = (p000.C9688hw1) r0
            int r1 = r0.f28690d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28690d = r1
            goto L18
        L13:
            hw1 r0 = new hw1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f28688b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f28690d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            p000.RQ1.m7017d(r7)
            PS0 r7 = (p000.PS0) r7
            java.lang.Object r6 = r7.f9075a
            goto L5e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.String r6 = r0.f28687a
            p000.RQ1.m7017d(r7)
            goto L4e
        L3c:
            p000.RQ1.m7017d(r7)
            java.lang.Object r7 = r5.f40042b
            Rr1 r7 = (p000.C8233Rr1) r7
            r0.f28687a = r6
            r0.f28690d = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            Sr1 r7 = (p000.C8285Sr1) r7
            Xq1 r7 = r7.f11014b
            r2 = 0
            r0.f28687a = r2
            r0.f28690d = r3
            java.lang.Object r6 = r7.mo9157b(r6, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10641pN0.m23758i(java.lang.String, Yy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m23759j(boolean r10, p000.AbstractC1571Yy r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p000.C11092su1
            if (r0 == 0) goto L13
            r0 = r11
            su1 r0 = (p000.C11092su1) r0
            int r1 = r0.f42718f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42718f = r1
            goto L18
        L13:
            su1 r0 = new su1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f42716d
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f42718f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            int r10 = r0.f42715c
            boolean r0 = r0.f42714b
            p000.RQ1.m7017d(r11)
            goto L79
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            boolean r10 = r0.f42714b
            pN0 r2 = r0.f42713a
            p000.RQ1.m7017d(r11)
            goto L54
        L3f:
            p000.RQ1.m7017d(r11)
            r0.f42713a = r9
            r0.f42714b = r10
            r0.f42718f = r5
            java.lang.Object r11 = r9.f40042b
            com.vk.push.core.filedatastore.FileDataStore r11 = (com.p019vk.push.core.filedatastore.FileDataStore) r11
            java.lang.Object r11 = r11.read(r0)
            if (r11 != r1) goto L53
            return r1
        L53:
            r2 = r9
        L54:
            pu1 r11 = (p000.C10708pu1) r11
            if (r11 == 0) goto L5b
            boolean r11 = r11.f40431a
            goto L5c
        L5b:
            r11 = r3
        L5c:
            java.lang.Object r2 = r2.f40042b
            com.vk.push.core.filedatastore.FileDataStore r2 = (com.p019vk.push.core.filedatastore.FileDataStore) r2
            pu1 r6 = new pu1
            r6.<init>(r10)
            r7 = 0
            r0.f42713a = r7
            r0.f42714b = r10
            r0.f42715c = r11
            r0.f42718f = r4
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C10641pN0.m23759j(boolean, Yy):java.lang.Object");
    }

    /* renamed from: m */
    public C7629Gb1 m23760m() {
        List listUnmodifiableList;
        C7473Db1 c7473Db1M3100N = C7629Gb1.m3100N();
        c7473Db1M3100N.m1735s(((Trace) this.f40042b).f18509d);
        c7473Db1M3100N.m1733q(((Trace) this.f40042b).f18516k.f5021a);
        Trace trace = (Trace) this.f40042b;
        c7473Db1M3100N.m1734r(trace.f18516k.m3947b(trace.f18517l));
        for (C1320Uz c1320Uz : ((Trace) this.f40042b).f18510e.values()) {
            c7473Db1M3100N.m1732p(c1320Uz.f12270b.get(), c1320Uz.f12269a);
        }
        ArrayList arrayList = ((Trace) this.f40042b).f18513h;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c7473Db1M3100N.m1731o(new C10641pN0(8, (Trace) it.next()).m23760m());
            }
        }
        Map<String, String> attributes = ((Trace) this.f40042b).getAttributes();
        c7473Db1M3100N.m23922n();
        C7629Gb1.m3105y((C7629Gb1) c7473Db1M3100N.f40483b).putAll(attributes);
        Trace trace2 = (Trace) this.f40042b;
        synchronized (trace2.f18512g) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (JA0 ja0 : trace2.f18512g) {
                    if (ja0 != null) {
                        arrayList2.add(ja0);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        IA0[] ia0ArrM4241b = JA0.m4241b(listUnmodifiableList);
        if (ia0ArrM4241b != null) {
            List listAsList = Arrays.asList(ia0ArrM4241b);
            c7473Db1M3100N.m23922n();
            C7629Gb1.m3096A((C7629Gb1) c7473Db1M3100N.f40483b, listAsList);
        }
        return (C7629Gb1) c7473Db1M3100N.m23920l();
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: n */
    public void mo1265n(C8340Tt0 c8340Tt0, C0181Cs c0181Cs) {
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: o */
    public InterfaceC7482Dg0 mo1266o(C8340Tt0 c8340Tt0) {
        if ("b".equals(c8340Tt0.m7801b())) {
            return new C10513oN0(this, 2);
        }
        return null;
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        AbstractC9596hC1 abstractC9596hC1 = (AbstractC9596hC1) this.f40042b;
        if (task.mo11144k()) {
            abstractC9596hC1.setResult((AbstractC9596hC1) Status.RESULT_SUCCESS);
            return;
        }
        if (((C9450g32) task).f27546d) {
            abstractC9596hC1.setFailedResult(Status.RESULT_CANCELED);
            return;
        }
        Exception excMo11141h = task.mo11141h();
        if (excMo11141h instanceof ApiException) {
            abstractC9596hC1.setFailedResult(((ApiException) excMo11141h).getStatus());
        } else {
            abstractC9596hC1.setFailedResult(Status.RESULT_INTERNAL_ERROR);
        }
    }

    @Override // p000.InterfaceC8348Tx0
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f40042b).countDown();
    }

    @Override // p000.InterfaceC9307ey0
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f40042b).countDown();
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: p */
    public void mo1267p(C8340Tt0 c8340Tt0, C0055As c0055As, C8340Tt0 c8340Tt02) {
    }

    /* renamed from: q */
    public void m23761q(float f, int i) {
        C9498gR1 c9498gR1 = (C9498gR1) this.f40042b;
        c9498gR1.getClass();
        c9498gR1.m18543B(i, Float.floatToRawIntBits(f));
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: r */
    public InterfaceC7430Cg0 mo1268r(C0055As c0055As, C8340Tt0 c8340Tt0) {
        return null;
    }

    /* renamed from: s */
    public void m23762s(int i, double d) {
        C9498gR1 c9498gR1 = (C9498gR1) this.f40042b;
        c9498gR1.getClass();
        c9498gR1.m18556y(i, Double.doubleToRawLongBits(d));
    }

    @Override // p000.InterfaceC8633Zj1
    /* renamed from: t */
    public View mo2905t(int i) {
        return ((AbstractC11919zO0) this.f40042b).m26425u(i);
    }

    public String toString() {
        switch (this.f40041a) {
            case 2:
                return super.toString() + "{fragment=" + ((KR0) this.f40042b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC8633Zj1
    /* renamed from: u */
    public int mo2906u(View view) {
        AO0 ao0 = (AO0) view.getLayoutParams();
        ((AbstractC11919zO0) this.f40042b).getClass();
        return view.getRight() + ((AO0) view.getLayoutParams()).f183b.right + ((ViewGroup.MarginLayoutParams) ao0).rightMargin;
    }

    /* renamed from: v */
    public void m23763v(int i, int i2) {
        ((C9498gR1) this.f40042b).m18545D(i, i2);
    }

    /* renamed from: w */
    public void m23764w(int i, long j) {
        ((C9498gR1) this.f40042b).m18556y(i, j);
    }

    /* renamed from: x */
    public void m23765x(int i, Object obj, InterfaceC9122dV1 interfaceC9122dV1) {
        C9498gR1 c9498gR1 = (C9498gR1) this.f40042b;
        c9498gR1.m18549H(i, 3);
        interfaceC9122dV1.mo17699g((IP1) obj, c9498gR1.f27801b);
        c9498gR1.m18549H(i, 4);
    }

    /* renamed from: y */
    public void m23766y(int i, JQ1 jq1) {
        C9498gR1 c9498gR1 = (C9498gR1) this.f40042b;
        c9498gR1.m18549H(i, 2);
        c9498gR1.m18554n(jq1);
    }

    /* renamed from: z */
    public void m23767z(int i, boolean z) {
        C9498gR1 c9498gR1 = (C9498gR1) this.f40042b;
        c9498gR1.m18549H(i, 0);
        c9498gR1.m18552g(z ? (byte) 1 : (byte) 0);
    }

    public C10641pN0(FileDataStore fileDataStore) {
        this.f40041a = 12;
        O90.m5968f(fileDataStore, "storage");
        this.f40042b = fileDataStore;
    }

    public C10641pN0(C9498gR1 c9498gR1) {
        this.f40041a = 17;
        Charset charset = BS1.f826a;
        if (c9498gR1 != null) {
            this.f40042b = c9498gR1;
            c9498gR1.f27801b = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public C10641pN0(int i) {
        this.f40041a = i;
        switch (i) {
            case 6:
                this.f40042b = new C7408Bv0(12);
                break;
            case 14:
                this.f40042b = new CountDownLatch(1);
                break;
            case 16:
                break;
            default:
                this.f40042b = new C9937jt0(21);
                break;
        }
    }

    public C10641pN0(View view) {
        this.f40041a = 5;
        if (Build.VERSION.SDK_INT >= 30) {
            O21 o21 = new O21(0, view);
            o21.f8190c = view;
            this.f40042b = o21;
            return;
        }
        this.f40042b = new L21(0, view);
    }

    public C10641pN0(WindowInsetsController windowInsetsController) {
        this.f40041a = 5;
        O21 o21 = new O21(0, null);
        o21.f8191d = windowInsetsController;
        this.f40042b = o21;
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: k */
    public void mo1263k() {
    }

    public C10641pN0(ThreadFactoryC11577wh1 threadFactoryC11577wh1) {
        this.f40041a = 7;
        this.f40042b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC11577wh1);
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: l */
    public void mo1264l(C8340Tt0 c8340Tt0, Object obj) {
    }
}
