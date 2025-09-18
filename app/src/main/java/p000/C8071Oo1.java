package p000;

import android.R;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaMuxer;
import android.os.Message;
import android.util.Size;
import android.util.SparseArray;
import androidx.core.util.Pools$SimplePool;
import androidx.work.impl.WorkDatabase_Impl;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.yandex.metrica.impl.p022ob.InterfaceC3531q;
import com.yandex.varioqub.config.model.ConfigValue;
import java.security.Signature;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingDeque;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: Oo1 */
/* loaded from: classes.dex */
public final class C8071Oo1 implements BillingClientStateListener, InterfaceC8281Sp1, InterfaceC9200e61, InterfaceC3987eO, InterfaceC8439Vq1 {

    /* renamed from: a */
    public Object f8627a;

    /* renamed from: b */
    public Object f8628b;

    /* renamed from: c */
    public Object f8629c;

    /* renamed from: d */
    public Object f8630d;

    public /* synthetic */ C8071Oo1(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f8627a = obj2;
        this.f8628b = obj3;
        this.f8629c = obj4;
        this.f8630d = obj;
    }

    /* renamed from: r */
    public static final Message m6145r(C8071Oo1 c8071Oo1, ArrayList arrayList, int i) {
        Object obj;
        c8071Oo1.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Message) obj2).what == i) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    /* renamed from: A */
    public InterfaceC7885Kz1 m6146A(C10919rY0 c10919rY0, XL1... xl1Arr) {
        InterfaceC7885Kz1 interfaceC7885Kz1M2916b = InterfaceC7885Kz1.f6417i1;
        for (XL1 xl1 : xl1Arr) {
            interfaceC7885Kz1M2916b = G22.m2916b(xl1);
            AbstractC10983s22.m24591m((C10919rY0) this.f8629c);
            if ((interfaceC7885Kz1M2916b instanceof C8819bA1) || (interfaceC7885Kz1M2916b instanceof C8197Qz1)) {
                interfaceC7885Kz1M2916b = ((C8763ak1) this.f8627a).m9804d(c10919rY0, interfaceC7885Kz1M2916b);
            }
        }
        return interfaceC7885Kz1M2916b;
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: G */
    public int mo4559G() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Override // p000.InterfaceC8439Vq1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo6147a(p000.AbstractC1571Yy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.C10960rs1
            if (r0 == 0) goto L13
            r0 = r6
            rs1 r0 = (p000.C10960rs1) r0
            int r1 = r0.f41941c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41941c = r1
            goto L18
        L13:
            rs1 r0 = new rs1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f41939a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f41941c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000.RQ1.m7017d(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            p000.RQ1.m7017d(r6)
            Wr1 r6 = new Wr1
            r2 = 0
            r4 = 1
            r6.<init>(r5, r2, r4)
            r0.f41941c = r3
            java.lang.Object r2 = r5.f8630d
            QF r2 = (p000.ExecutorC1023QF) r2
            java.lang.Object r6 = p000.AbstractC9366fP1.m18233e(r2, r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            Wq1 r6 = (p000.C8491Wq1) r6
            java.lang.String r6 = r6.f13419a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8071Oo1.mo6147a(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Override // p000.InterfaceC8439Vq1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo6148b(java.lang.String r5, p000.AbstractC1571Yy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.C10192ls1
            if (r0 == 0) goto L13
            r0 = r6
            ls1 r0 = (p000.C10192ls1) r0
            int r1 = r0.f37331c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37331c = r1
            goto L18
        L13:
            ls1 r0 = new ls1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f37329a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f37331c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000.RQ1.m7017d(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p000.RQ1.m7017d(r6)
            ps1 r6 = new ps1
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.f37331c = r3
            java.lang.Object r5 = r4.f8630d
            QF r5 = (p000.ExecutorC1023QF) r5
            java.lang.Object r6 = p000.AbstractC9366fP1.m18233e(r5, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            PS0 r6 = (p000.PS0) r6
            java.lang.Object r5 = r6.f9075a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8071Oo1.mo6148b(java.lang.String, Yy):java.lang.Object");
    }

    @Override // p000.InterfaceC8281Sp1
    /* renamed from: c */
    public void mo482c(TotalCaptureResult totalCaptureResult) {
        if (((C0300El) this.f8629c) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = (Rect) this.f8630d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            ((C0300El) this.f8629c).m2375b(null);
            this.f8629c = null;
            this.f8630d = null;
        }
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: d */
    public /* synthetic */ void mo4560d() {
    }

    @Override // p000.InterfaceC8439Vq1
    /* renamed from: e */
    public Object mo6149e(C10830qr1 c10830qr1) {
        Object objM18233e = AbstractC9366fP1.m18233e((ExecutorC1023QF) this.f8630d, new C8493Wr1(this, null, 0), c10830qr1);
        return objM18233e == EnumC0817Mz.f7418a ? objM18233e : C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: f */
    public void mo389f(C0267EE c0267ee) {
        ((C9491gO0) this.f8630d).f27727I = c0267ee;
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: g */
    public /* synthetic */ U51 mo4561g(byte[] bArr, int i, int i2) {
        return AbstractC11153tN0.m24896h(this, bArr, i2);
    }

    @Override // p000.InterfaceC8281Sp1
    public float getMaxZoom() {
        Float f = (Float) ((C0428Gn) this.f8627a).m3155a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @Override // p000.InterfaceC8281Sp1
    public float getMinZoom() {
        return 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Override // p000.InterfaceC8439Vq1
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo6150h(java.lang.String r5, com.p019vk.push.common.clientid.ClientId r6, p000.InterfaceC1382Vy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p000.C11344us1
            if (r0 == 0) goto L13
            r0 = r7
            us1 r0 = (p000.C11344us1) r0
            int r1 = r0.f44001c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44001c = r1
            goto L1a
        L13:
            us1 r0 = new us1
            Yy r7 = (p000.AbstractC1571Yy) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.f43999a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f44001c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p000.RQ1.m7017d(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p000.RQ1.m7017d(r7)
            xs1 r7 = new xs1
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.f44001c = r3
            java.lang.Object r5 = r4.f8630d
            QF r5 = (p000.ExecutorC1023QF) r5
            java.lang.Object r7 = p000.AbstractC9366fP1.m18233e(r5, r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            PS0 r7 = (p000.PS0) r7
            java.lang.Object r5 = r7.f9075a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8071Oo1.mo6150h(java.lang.String, com.vk.push.common.clientid.ClientId, Vy):java.lang.Object");
    }

    @Override // p000.InterfaceC8439Vq1
    /* renamed from: i */
    public Object mo6151i(String str, C10700pq1 c10700pq1) {
        return AbstractC9366fP1.m18233e((ExecutorC1023QF) this.f8630d, new C8441Vr1(this, str, null, 2), c10700pq1);
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: j */
    public void mo393j() {
        ((C0300El) this.f8627a).m2375b(null);
    }

    @Override // p000.InterfaceC8281Sp1
    /* renamed from: k */
    public Rect mo483k() {
        Rect rect = (Rect) this.f8628b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) ((C0428Gn) this.f8627a).m3155a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: l */
    public void mo395l(InterfaceC1345VN interfaceC1345VN) throws Exception {
        C9491gO0 c9491gO0 = (C9491gO0) this.f8630d;
        if (c9491gO0.f27760h0 == 3) {
            interfaceC1345VN.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }
        MediaMuxer mediaMuxer = c9491gO0.f27721C;
        C6693qe c6693qe = (C6693qe) this.f8629c;
        if (mediaMuxer != null) {
            try {
                c9491gO0.m18494K(interfaceC1345VN, c6693qe);
                interfaceC1345VN.close();
                return;
            } catch (Throwable th) {
                try {
                    interfaceC1345VN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c9491gO0.f27771r) {
            AbstractC7806Jm0.m4412f("Recorder");
        } else {
            c9491gO0.f27740V.mo954b(new C6761rj(interfaceC1345VN));
            if (c9491gO0.f27739U != null) {
                AbstractC7806Jm0.m4412f("Recorder");
                c9491gO0.m18487D(c6693qe);
            } else {
                AbstractC7806Jm0.m4412f("Recorder");
            }
        }
        interfaceC1345VN.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0092  */
    @Override // p000.InterfaceC9200e61
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4562m(byte[] r38, int r39, int r40, p000.C9072d61 r41, p000.InterfaceC6587oy r42) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8071Oo1.mo4562m(byte[], int, int, d61, oy):void");
    }

    @Override // p000.InterfaceC8281Sp1
    /* renamed from: n */
    public void mo484n(C1869cn c1869cn) {
        Rect rect = (Rect) this.f8628b;
        if (rect != null) {
            c1869cn.m10868e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // p000.InterfaceC8281Sp1
    /* renamed from: o */
    public void mo485o(float f, C0300El c0300El) {
        ((Rect) ((C0428Gn) this.f8627a).m3155a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float fWidth = r0.width() / f;
        float fHeight = r0.height() / f;
        float fWidth2 = (r0.width() - fWidth) / 2.0f;
        float fHeight2 = (r0.height() - fHeight) / 2.0f;
        this.f8628b = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        C0300El c0300El2 = (C0300El) this.f8629c;
        if (c0300El2 != null) {
            c0300El2.m2377d(new C1434Wn("There is a new zoomRatio being set"));
        }
        this.f8630d = (Rect) this.f8628b;
        this.f8629c = c0300El;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        O90.m5968f(billingResult, "billingResult");
        ((InterfaceC3531q) this.f8629c).mo3440a().execute(new C6253jh(this, 0, billingResult));
    }

    @Override // p000.InterfaceC8281Sp1
    /* renamed from: p */
    public void mo486p() {
        this.f8630d = null;
        this.f8628b = null;
        C0300El c0300El = (C0300El) this.f8629c;
        if (c0300El != null) {
            c0300El.m2377d(new C1434Wn("Camera is not active."));
            this.f8629c = null;
        }
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: q */
    public void mo400q(C1282UN c1282un) {
        if (((C9491gO0) this.f8630d).f27741W == null) {
            ((C1372Vo) this.f8628b).mo3020b(c1282un);
        }
    }

    /* renamed from: s */
    public void m6152s(C7988Mz0 c7988Mz0) {
        synchronized (this.f8630d) {
            m6157x();
            ((PriorityQueue) this.f8628b).offer(c7988Mz0);
        }
    }

    /* renamed from: t */
    public void m6153t(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8627a;
        workDatabase_Impl.m23792b();
        C10061kr0 c10061kr0 = (C10061kr0) this.f8629c;
        C3936dZ c3936dZM2771a = c10061kr0.m2771a();
        if (str == null) {
            c3936dZM2771a.mo2032V(1);
        } else {
            c3936dZM2771a.mo2033d(1, str);
        }
        workDatabase_Impl.m23793c();
        try {
            c3936dZM2771a.m17710m();
            workDatabase_Impl.m23799n();
        } finally {
            workDatabase_Impl.m23795j();
            c10061kr0.m2776f(c3936dZM2771a);
        }
    }

    /* renamed from: u */
    public void m6154u(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((L01) this.f8628b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m6154u(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* renamed from: v */
    public Size[] m6155v(int i) {
        HashMap map = (HashMap) this.f8629c;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        Size[] outputSizes = ((StreamConfigurationMap) ((C10525oT0) this.f8627a).f39025a).getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            AbstractC7806Jm0.m4412f("StreamConfigurationMapCompat");
            return outputSizes;
        }
        Size[] sizeArrM8365g = ((C1339VH) this.f8628b).m8365g(outputSizes, i);
        map.put(Integer.valueOf(i), sizeArrM8365g);
        return (Size[]) sizeArrM8365g.clone();
    }

    /* renamed from: w */
    public ArrayList m6156w() {
        ArrayList arrayList;
        synchronized (this.f8630d) {
            arrayList = new ArrayList((PriorityQueue) this.f8627a);
            arrayList.addAll((PriorityQueue) this.f8628b);
        }
        return arrayList;
    }

    /* renamed from: x */
    public void m6157x() {
        synchronized (this.f8630d) {
            while (((PriorityQueue) this.f8628b).size() + ((PriorityQueue) this.f8627a).size() >= 120 && !((PriorityQueue) this.f8627a).isEmpty()) {
                try {
                    ((C7988Mz0) ((PriorityQueue) this.f8627a).poll()).f7423b.recycle();
                } catch (Throwable th) {
                    throw th;
                }
            }
            while (((PriorityQueue) this.f8628b).size() + ((PriorityQueue) this.f8627a).size() >= 120 && !((PriorityQueue) this.f8628b).isEmpty()) {
                ((C7988Mz0) ((PriorityQueue) this.f8628b).poll()).f7423b.recycle();
            }
        }
    }

    /* renamed from: y */
    public void m6158y(int i) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f8629c).drainTo(arrayList);
        Message messageObtain = Message.obtain(null, i, 0, 0);
        O90.m5967e(messageObtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(messageObtain);
        AbstractC9366fP1.m18230b(AbstractC11432vY1.m25444a((InterfaceC0125Bz) this.f8627a), null, new YY0(this, arrayList, null), 3);
    }

    /* renamed from: z */
    public void m6159z() {
        int iMo3173a;
        int i = R.id.accessibilityActionPageLeft;
        C10050kl1 c10050kl1 = (C10050kl1) this.f8630d;
        AbstractC10944rk1.m24479k(R.id.accessibilityActionPageLeft, c10050kl1);
        AbstractC10944rk1.m24476h(0, c10050kl1);
        AbstractC10944rk1.m24479k(R.id.accessibilityActionPageRight, c10050kl1);
        AbstractC10944rk1.m24476h(0, c10050kl1);
        AbstractC10944rk1.m24479k(R.id.accessibilityActionPageUp, c10050kl1);
        AbstractC10944rk1.m24476h(0, c10050kl1);
        AbstractC10944rk1.m24479k(R.id.accessibilityActionPageDown, c10050kl1);
        AbstractC10944rk1.m24476h(0, c10050kl1);
        if (c10050kl1.getAdapter() == null || (iMo3173a = c10050kl1.getAdapter().mo3173a()) == 0 || !c10050kl1.f36678r) {
            return;
        }
        int orientation = c10050kl1.getOrientation();
        C10226m71 c10226m71 = (C10226m71) this.f8628b;
        C10339n11 c10339n11 = (C10339n11) this.f8627a;
        if (orientation != 0) {
            if (c10050kl1.f36664d < iMo3173a - 1) {
                AbstractC10944rk1.m24480l(c10050kl1, new C0695L1(R.id.accessibilityActionPageDown, (String) null), c10339n11);
            }
            if (c10050kl1.f36664d > 0) {
                AbstractC10944rk1.m24480l(c10050kl1, new C0695L1(R.id.accessibilityActionPageUp, (String) null), c10226m71);
                return;
            }
            return;
        }
        boolean z = c10050kl1.f36667g.m26409C() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (c10050kl1.f36664d < iMo3173a - 1) {
            AbstractC10944rk1.m24480l(c10050kl1, new C0695L1(i2, (String) null), c10339n11);
        }
        if (c10050kl1.f36664d > 0) {
            AbstractC10944rk1.m24480l(c10050kl1, new C0695L1(i, (String) null), c10226m71);
        }
    }

    public C8071Oo1(int i) {
        switch (i) {
            case 7:
                this.f8627a = new Pools$SimplePool(10);
                this.f8628b = new L01();
                this.f8629c = new ArrayList();
                this.f8630d = new HashSet();
                break;
            case 10:
                this.f8627a = new C9591hA0();
                this.f8628b = new C9591hA0();
                this.f8629c = new XA0();
                break;
            case 15:
                this.f8627a = new C7119x8();
                this.f8628b = new SparseArray();
                this.f8629c = new C7544El0();
                this.f8630d = new C7119x8();
                break;
            case 18:
                C8763ak1 c8763ak1 = new C8763ak1();
                c8763ak1.f15666b = new HashMap();
                c8763ak1.f15667c = new C10616pA1(6);
                C10616pA1 c10616pA1 = new C10616pA1(0);
                ArrayList arrayList = c10616pA1.f39879a;
                arrayList.add(EnumC9724iC1.BITWISE_AND);
                arrayList.add(EnumC9724iC1.BITWISE_LEFT_SHIFT);
                arrayList.add(EnumC9724iC1.BITWISE_NOT);
                arrayList.add(EnumC9724iC1.BITWISE_OR);
                arrayList.add(EnumC9724iC1.BITWISE_RIGHT_SHIFT);
                arrayList.add(EnumC9724iC1.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(EnumC9724iC1.BITWISE_XOR);
                c8763ak1.m9805e(c10616pA1);
                C10616pA1 c10616pA12 = new C10616pA1(1);
                ArrayList arrayList2 = c10616pA12.f39879a;
                arrayList2.add(EnumC9724iC1.EQUALS);
                arrayList2.add(EnumC9724iC1.GREATER_THAN);
                arrayList2.add(EnumC9724iC1.GREATER_THAN_EQUALS);
                arrayList2.add(EnumC9724iC1.IDENTITY_EQUALS);
                arrayList2.add(EnumC9724iC1.IDENTITY_NOT_EQUALS);
                arrayList2.add(EnumC9724iC1.LESS_THAN);
                arrayList2.add(EnumC9724iC1.LESS_THAN_EQUALS);
                arrayList2.add(EnumC9724iC1.NOT_EQUALS);
                c8763ak1.m9805e(c10616pA12);
                C10616pA1 c10616pA13 = new C10616pA1(2);
                ArrayList arrayList3 = c10616pA13.f39879a;
                arrayList3.add(EnumC9724iC1.APPLY);
                arrayList3.add(EnumC9724iC1.BLOCK);
                arrayList3.add(EnumC9724iC1.BREAK);
                arrayList3.add(EnumC9724iC1.CASE);
                arrayList3.add(EnumC9724iC1.DEFAULT);
                arrayList3.add(EnumC9724iC1.CONTINUE);
                arrayList3.add(EnumC9724iC1.DEFINE_FUNCTION);
                arrayList3.add(EnumC9724iC1.FN);
                arrayList3.add(EnumC9724iC1.IF);
                arrayList3.add(EnumC9724iC1.QUOTE);
                arrayList3.add(EnumC9724iC1.RETURN);
                arrayList3.add(EnumC9724iC1.SWITCH);
                arrayList3.add(EnumC9724iC1.TERNARY);
                c8763ak1.m9805e(c10616pA13);
                C10616pA1 c10616pA14 = new C10616pA1(3);
                ArrayList arrayList4 = c10616pA14.f39879a;
                arrayList4.add(EnumC9724iC1.AND);
                arrayList4.add(EnumC9724iC1.NOT);
                arrayList4.add(EnumC9724iC1.OR);
                c8763ak1.m9805e(c10616pA14);
                C10616pA1 c10616pA15 = new C10616pA1(4);
                ArrayList arrayList5 = c10616pA15.f39879a;
                arrayList5.add(EnumC9724iC1.FOR_IN);
                arrayList5.add(EnumC9724iC1.FOR_IN_CONST);
                arrayList5.add(EnumC9724iC1.FOR_IN_LET);
                arrayList5.add(EnumC9724iC1.FOR_LET);
                arrayList5.add(EnumC9724iC1.FOR_OF);
                arrayList5.add(EnumC9724iC1.FOR_OF_CONST);
                arrayList5.add(EnumC9724iC1.FOR_OF_LET);
                arrayList5.add(EnumC9724iC1.WHILE);
                c8763ak1.m9805e(c10616pA15);
                C10616pA1 c10616pA16 = new C10616pA1(5);
                ArrayList arrayList6 = c10616pA16.f39879a;
                arrayList6.add(EnumC9724iC1.ADD);
                arrayList6.add(EnumC9724iC1.DIVIDE);
                arrayList6.add(EnumC9724iC1.MODULUS);
                arrayList6.add(EnumC9724iC1.MULTIPLY);
                arrayList6.add(EnumC9724iC1.NEGATE);
                arrayList6.add(EnumC9724iC1.POST_DECREMENT);
                arrayList6.add(EnumC9724iC1.POST_INCREMENT);
                arrayList6.add(EnumC9724iC1.PRE_DECREMENT);
                arrayList6.add(EnumC9724iC1.PRE_INCREMENT);
                arrayList6.add(EnumC9724iC1.SUBTRACT);
                c8763ak1.m9805e(c10616pA16);
                C10616pA1 c10616pA17 = new C10616pA1(7);
                ArrayList arrayList7 = c10616pA17.f39879a;
                arrayList7.add(EnumC9724iC1.ASSIGN);
                arrayList7.add(EnumC9724iC1.CONST);
                arrayList7.add(EnumC9724iC1.CREATE_ARRAY);
                arrayList7.add(EnumC9724iC1.CREATE_OBJECT);
                arrayList7.add(EnumC9724iC1.EXPRESSION_LIST);
                arrayList7.add(EnumC9724iC1.GET);
                arrayList7.add(EnumC9724iC1.GET_INDEX);
                arrayList7.add(EnumC9724iC1.GET_PROPERTY);
                arrayList7.add(EnumC9724iC1.NULL);
                arrayList7.add(EnumC9724iC1.SET_PROPERTY);
                arrayList7.add(EnumC9724iC1.TYPEOF);
                arrayList7.add(EnumC9724iC1.UNDEFINED);
                arrayList7.add(EnumC9724iC1.VAR);
                c8763ak1.m9805e(c10616pA17);
                this.f8627a = c8763ak1;
                C10919rY0 c10919rY0 = new C10919rY0((C10919rY0) null, c8763ak1);
                this.f8629c = c10919rY0;
                this.f8628b = c10919rY0.m24410I();
                C10226m71 c10226m71 = new C10226m71(10);
                c10226m71.f37493b = new HashMap();
                this.f8630d = c10226m71;
                c10919rY0.m24416O("require", new R32(c10226m71));
                ((HashMap) c10226m71.f37493b).put("internal.platform", new JA1(1));
                c10919rY0.m24416O("runtime.counter", new C7987My1(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)));
                break;
            default:
                this.f8630d = new Object();
                C8774aq0 c8774aq0 = new C8774aq0(4);
                this.f8628b = new PriorityQueue(120, c8774aq0);
                this.f8627a = new PriorityQueue(120, c8774aq0);
                this.f8629c = new ArrayList();
                break;
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
    }

    public C8071Oo1(Signature signature) {
        this.f8627a = signature;
        this.f8628b = null;
        this.f8629c = null;
        this.f8630d = null;
    }

    public C8071Oo1(Cipher cipher) {
        this.f8627a = null;
        this.f8628b = cipher;
        this.f8629c = null;
        this.f8630d = null;
    }

    public C8071Oo1(Mac mac) {
        this.f8627a = null;
        this.f8628b = null;
        this.f8629c = mac;
        this.f8630d = null;
    }
}
