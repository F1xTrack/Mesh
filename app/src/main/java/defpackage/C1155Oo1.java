package defpackage;

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
import com.yandex.metrica.impl.ob.InterfaceC3013q;
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
public final class C1155Oo1 implements BillingClientStateListener, InterfaceC1470Sp1, InterfaceC3519e61, InterfaceC3571eO, InterfaceC1707Vq1 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ C1155Oo1(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj2;
        this.b = obj3;
        this.c = obj4;
        this.d = obj;
    }

    public static final Message r(C1155Oo1 c1155Oo1, ArrayList arrayList, int i) {
        Object obj;
        c1155Oo1.getClass();
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

    public InterfaceC0877Kz1 A(C6860rY0 c6860rY0, XL1... xl1Arr) {
        InterfaceC0877Kz1 interfaceC0877Kz1B = InterfaceC0877Kz1.i1;
        for (XL1 xl1 : xl1Arr) {
            interfaceC0877Kz1B = G22.b(xl1);
            AbstractC6955s22.m((C6860rY0) this.c);
            if ((interfaceC0877Kz1B instanceof C2275bA1) || (interfaceC0877Kz1B instanceof C1344Qz1)) {
                interfaceC0877Kz1B = ((C2192ak1) this.a).d(c6860rY0, interfaceC0877Kz1B);
            }
        }
        return interfaceC0877Kz1B;
    }

    @Override // defpackage.InterfaceC3519e61
    public int G() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Override // defpackage.InterfaceC1707Vq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(defpackage.AbstractC1963Yy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C6921rs1
            if (r0 == 0) goto L13
            r0 = r6
            rs1 r0 = (defpackage.C6921rs1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rs1 r0 = new rs1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.RQ1.d(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.RQ1.d(r6)
            Wr1 r6 = new Wr1
            r2 = 0
            r4 = 1
            r6.<init>(r5, r2, r4)
            r0.c = r3
            java.lang.Object r2 = r5.d
            QF r2 = (defpackage.QF) r2
            java.lang.Object r6 = defpackage.AbstractC3767fP1.e(r2, r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            Wq1 r6 = (defpackage.C1785Wq1) r6
            java.lang.String r6 = r6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1155Oo1.a(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Override // defpackage.InterfaceC1707Vq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r5, defpackage.AbstractC1963Yy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C5776ls1
            if (r0 == 0) goto L13
            r0 = r6
            ls1 r0 = (defpackage.C5776ls1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ls1 r0 = new ls1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.RQ1.d(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.RQ1.d(r6)
            ps1 r6 = new ps1
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.c = r3
            java.lang.Object r5 = r4.d
            QF r5 = (defpackage.QF) r5
            java.lang.Object r6 = defpackage.AbstractC3767fP1.e(r5, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r5 = r6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1155Oo1.b(java.lang.String, Yy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1470Sp1
    public void c(TotalCaptureResult totalCaptureResult) {
        if (((C0365El) this.c) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = (Rect) this.d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            ((C0365El) this.c).b(null);
            this.c = null;
            this.d = null;
        }
    }

    @Override // defpackage.InterfaceC3519e61
    public /* synthetic */ void d() {
    }

    @Override // defpackage.InterfaceC1707Vq1
    public Object e(C6728qr1 c6728qr1) {
        Object objE = AbstractC3767fP1.e((QF) this.d, new C1788Wr1(this, null, 0), c6728qr1);
        return objE == EnumC1030Mz.a ? objE : C1518Tf1.a;
    }

    @Override // defpackage.InterfaceC3571eO
    public void f(EE ee) {
        ((C3954gO0) this.d).I = ee;
    }

    @Override // defpackage.InterfaceC3519e61
    public /* synthetic */ U51 g(byte[] bArr, int i, int i2) {
        return AbstractC7209tN0.h(this, bArr, i2);
    }

    @Override // defpackage.InterfaceC1470Sp1
    public float getMaxZoom() {
        Float f = (Float) ((C0527Gn) this.a).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @Override // defpackage.InterfaceC1470Sp1
    public float getMinZoom() {
        return 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Override // defpackage.InterfaceC1707Vq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(java.lang.String r5, com.vk.push.common.clientid.ClientId r6, defpackage.InterfaceC1729Vy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.C7494us1
            if (r0 == 0) goto L13
            r0 = r7
            us1 r0 = (defpackage.C7494us1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            us1 r0 = new us1
            Yy r7 = (defpackage.AbstractC1963Yy) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.RQ1.d(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.RQ1.d(r7)
            xs1 r7 = new xs1
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.c = r3
            java.lang.Object r5 = r4.d
            QF r5 = (defpackage.QF) r5
            java.lang.Object r7 = defpackage.AbstractC3767fP1.e(r5, r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            PS0 r7 = (defpackage.PS0) r7
            java.lang.Object r5 = r7.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1155Oo1.h(java.lang.String, com.vk.push.common.clientid.ClientId, Vy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1707Vq1
    public Object i(String str, C6534pq1 c6534pq1) {
        return AbstractC3767fP1.e((QF) this.d, new C1710Vr1(this, str, null, 2), c6534pq1);
    }

    @Override // defpackage.InterfaceC3571eO
    public void j() {
        ((C0365El) this.a).b(null);
    }

    @Override // defpackage.InterfaceC1470Sp1
    public Rect k() {
        Rect rect = (Rect) this.b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) ((C0527Gn) this.a).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // defpackage.InterfaceC3571eO
    public void l(VN vn) throws Exception {
        C3954gO0 c3954gO0 = (C3954gO0) this.d;
        if (c3954gO0.h0 == 3) {
            vn.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }
        MediaMuxer mediaMuxer = c3954gO0.C;
        C6687qe c6687qe = (C6687qe) this.c;
        if (mediaMuxer != null) {
            try {
                c3954gO0.K(vn, c6687qe);
                vn.close();
                return;
            } catch (Throwable th) {
                try {
                    vn.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c3954gO0.r) {
            AbstractC0759Jm0.f("Recorder");
        } else {
            c3954gO0.V.b(new C6892rj(vn));
            if (c3954gO0.U != null) {
                AbstractC0759Jm0.f("Recorder");
                c3954gO0.D(c6687qe);
            } else {
                AbstractC0759Jm0.f("Recorder");
            }
        }
        vn.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0092  */
    @Override // defpackage.InterfaceC3519e61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(byte[] r38, int r39, int r40, defpackage.C3329d61 r41, defpackage.InterfaceC6365oy r42) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1155Oo1.m(byte[], int, int, d61, oy):void");
    }

    @Override // defpackage.InterfaceC1470Sp1
    public void n(C2580cn c2580cn) {
        Rect rect = (Rect) this.b;
        if (rect != null) {
            c2580cn.e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // defpackage.InterfaceC1470Sp1
    public void o(float f, C0365El c0365El) {
        ((Rect) ((C0527Gn) this.a).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float fWidth = r0.width() / f;
        float fHeight = r0.height() / f;
        float fWidth2 = (r0.width() - fWidth) / 2.0f;
        float fHeight2 = (r0.height() - fHeight) / 2.0f;
        this.b = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        C0365El c0365El2 = (C0365El) this.c;
        if (c0365El2 != null) {
            c0365El2.d(new C1774Wn("There is a new zoomRatio being set"));
        }
        this.d = (Rect) this.b;
        this.c = c0365El;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        O90.f(billingResult, "billingResult");
        ((InterfaceC3013q) this.c).a().execute(new C5359jh(this, 0, billingResult));
    }

    @Override // defpackage.InterfaceC1470Sp1
    public void p() {
        this.d = null;
        this.b = null;
        C0365El c0365El = (C0365El) this.c;
        if (c0365El != null) {
            c0365El.d(new C1774Wn("Camera is not active."));
            this.c = null;
        }
    }

    @Override // defpackage.InterfaceC3571eO
    public void q(UN un) {
        if (((C3954gO0) this.d).W == null) {
            ((C1699Vo) this.b).b(un);
        }
    }

    public void s(C1031Mz0 c1031Mz0) {
        synchronized (this.d) {
            x();
            ((PriorityQueue) this.b).offer(c1031Mz0);
        }
    }

    public void t(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        C5581kr0 c5581kr0 = (C5581kr0) this.c;
        C3414dZ c3414dZA = c5581kr0.a();
        if (str == null) {
            c3414dZA.V(1);
        } else {
            c3414dZA.d(1, str);
        }
        workDatabase_Impl.c();
        try {
            c3414dZA.m();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            c5581kr0.f(c3414dZA);
        }
    }

    public void u(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((L01) this.b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                u(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public Size[] v(int i) {
        HashMap map = (HashMap) this.c;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        Size[] outputSizes = ((StreamConfigurationMap) ((C6273oT0) this.a).a).getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            AbstractC0759Jm0.f("StreamConfigurationMapCompat");
            return outputSizes;
        }
        Size[] sizeArrG = ((VH) this.b).g(outputSizes, i);
        map.put(Integer.valueOf(i), sizeArrG);
        return (Size[]) sizeArrG.clone();
    }

    public ArrayList w() {
        ArrayList arrayList;
        synchronized (this.d) {
            arrayList = new ArrayList((PriorityQueue) this.a);
            arrayList.addAll((PriorityQueue) this.b);
        }
        return arrayList;
    }

    public void x() {
        synchronized (this.d) {
            while (((PriorityQueue) this.b).size() + ((PriorityQueue) this.a).size() >= 120 && !((PriorityQueue) this.a).isEmpty()) {
                try {
                    ((C1031Mz0) ((PriorityQueue) this.a).poll()).b.recycle();
                } catch (Throwable th) {
                    throw th;
                }
            }
            while (((PriorityQueue) this.b).size() + ((PriorityQueue) this.a).size() >= 120 && !((PriorityQueue) this.b).isEmpty()) {
                ((C1031Mz0) ((PriorityQueue) this.b).poll()).b.recycle();
            }
        }
    }

    public void y(int i) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.c).drainTo(arrayList);
        Message messageObtain = Message.obtain(null, i, 0, 0);
        O90.e(messageObtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(messageObtain);
        AbstractC3767fP1.b(AbstractC7625vY1.a((InterfaceC0173Bz) this.a), null, new YY0(this, arrayList, null), 3);
    }

    public void z() {
        int iA;
        int i = R.id.accessibilityActionPageLeft;
        C5564kl1 c5564kl1 = (C5564kl1) this.d;
        AbstractC6897rk1.k(R.id.accessibilityActionPageLeft, c5564kl1);
        AbstractC6897rk1.h(0, c5564kl1);
        AbstractC6897rk1.k(R.id.accessibilityActionPageRight, c5564kl1);
        AbstractC6897rk1.h(0, c5564kl1);
        AbstractC6897rk1.k(R.id.accessibilityActionPageUp, c5564kl1);
        AbstractC6897rk1.h(0, c5564kl1);
        AbstractC6897rk1.k(R.id.accessibilityActionPageDown, c5564kl1);
        AbstractC6897rk1.h(0, c5564kl1);
        if (c5564kl1.getAdapter() == null || (iA = c5564kl1.getAdapter().a()) == 0 || !c5564kl1.r) {
            return;
        }
        int orientation = c5564kl1.getOrientation();
        C5826m71 c5826m71 = (C5826m71) this.b;
        C5996n11 c5996n11 = (C5996n11) this.a;
        if (orientation != 0) {
            if (c5564kl1.d < iA - 1) {
                AbstractC6897rk1.l(c5564kl1, new L1(R.id.accessibilityActionPageDown, (String) null), c5996n11);
            }
            if (c5564kl1.d > 0) {
                AbstractC6897rk1.l(c5564kl1, new L1(R.id.accessibilityActionPageUp, (String) null), c5826m71);
                return;
            }
            return;
        }
        boolean z = c5564kl1.g.C() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (c5564kl1.d < iA - 1) {
            AbstractC6897rk1.l(c5564kl1, new L1(i2, (String) null), c5996n11);
        }
        if (c5564kl1.d > 0) {
            AbstractC6897rk1.l(c5564kl1, new L1(i, (String) null), c5826m71);
        }
    }

    public C1155Oo1(int i) {
        switch (i) {
            case 7:
                this.a = new Pools$SimplePool(10);
                this.b = new L01();
                this.c = new ArrayList();
                this.d = new HashSet();
                break;
            case 10:
                this.a = new C4103hA0();
                this.b = new C4103hA0();
                this.c = new XA0();
                break;
            case 15:
                this.a = new C7925x8();
                this.b = new SparseArray();
                this.c = new C0366El0();
                this.d = new C7925x8();
                break;
            case 18:
                C2192ak1 c2192ak1 = new C2192ak1();
                c2192ak1.b = new HashMap();
                c2192ak1.c = new C6408pA1(6);
                C6408pA1 c6408pA1 = new C6408pA1(0);
                ArrayList arrayList = c6408pA1.a;
                arrayList.add(EnumC4301iC1.BITWISE_AND);
                arrayList.add(EnumC4301iC1.BITWISE_LEFT_SHIFT);
                arrayList.add(EnumC4301iC1.BITWISE_NOT);
                arrayList.add(EnumC4301iC1.BITWISE_OR);
                arrayList.add(EnumC4301iC1.BITWISE_RIGHT_SHIFT);
                arrayList.add(EnumC4301iC1.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(EnumC4301iC1.BITWISE_XOR);
                c2192ak1.e(c6408pA1);
                C6408pA1 c6408pA12 = new C6408pA1(1);
                ArrayList arrayList2 = c6408pA12.a;
                arrayList2.add(EnumC4301iC1.EQUALS);
                arrayList2.add(EnumC4301iC1.GREATER_THAN);
                arrayList2.add(EnumC4301iC1.GREATER_THAN_EQUALS);
                arrayList2.add(EnumC4301iC1.IDENTITY_EQUALS);
                arrayList2.add(EnumC4301iC1.IDENTITY_NOT_EQUALS);
                arrayList2.add(EnumC4301iC1.LESS_THAN);
                arrayList2.add(EnumC4301iC1.LESS_THAN_EQUALS);
                arrayList2.add(EnumC4301iC1.NOT_EQUALS);
                c2192ak1.e(c6408pA12);
                C6408pA1 c6408pA13 = new C6408pA1(2);
                ArrayList arrayList3 = c6408pA13.a;
                arrayList3.add(EnumC4301iC1.APPLY);
                arrayList3.add(EnumC4301iC1.BLOCK);
                arrayList3.add(EnumC4301iC1.BREAK);
                arrayList3.add(EnumC4301iC1.CASE);
                arrayList3.add(EnumC4301iC1.DEFAULT);
                arrayList3.add(EnumC4301iC1.CONTINUE);
                arrayList3.add(EnumC4301iC1.DEFINE_FUNCTION);
                arrayList3.add(EnumC4301iC1.FN);
                arrayList3.add(EnumC4301iC1.IF);
                arrayList3.add(EnumC4301iC1.QUOTE);
                arrayList3.add(EnumC4301iC1.RETURN);
                arrayList3.add(EnumC4301iC1.SWITCH);
                arrayList3.add(EnumC4301iC1.TERNARY);
                c2192ak1.e(c6408pA13);
                C6408pA1 c6408pA14 = new C6408pA1(3);
                ArrayList arrayList4 = c6408pA14.a;
                arrayList4.add(EnumC4301iC1.AND);
                arrayList4.add(EnumC4301iC1.NOT);
                arrayList4.add(EnumC4301iC1.OR);
                c2192ak1.e(c6408pA14);
                C6408pA1 c6408pA15 = new C6408pA1(4);
                ArrayList arrayList5 = c6408pA15.a;
                arrayList5.add(EnumC4301iC1.FOR_IN);
                arrayList5.add(EnumC4301iC1.FOR_IN_CONST);
                arrayList5.add(EnumC4301iC1.FOR_IN_LET);
                arrayList5.add(EnumC4301iC1.FOR_LET);
                arrayList5.add(EnumC4301iC1.FOR_OF);
                arrayList5.add(EnumC4301iC1.FOR_OF_CONST);
                arrayList5.add(EnumC4301iC1.FOR_OF_LET);
                arrayList5.add(EnumC4301iC1.WHILE);
                c2192ak1.e(c6408pA15);
                C6408pA1 c6408pA16 = new C6408pA1(5);
                ArrayList arrayList6 = c6408pA16.a;
                arrayList6.add(EnumC4301iC1.ADD);
                arrayList6.add(EnumC4301iC1.DIVIDE);
                arrayList6.add(EnumC4301iC1.MODULUS);
                arrayList6.add(EnumC4301iC1.MULTIPLY);
                arrayList6.add(EnumC4301iC1.NEGATE);
                arrayList6.add(EnumC4301iC1.POST_DECREMENT);
                arrayList6.add(EnumC4301iC1.POST_INCREMENT);
                arrayList6.add(EnumC4301iC1.PRE_DECREMENT);
                arrayList6.add(EnumC4301iC1.PRE_INCREMENT);
                arrayList6.add(EnumC4301iC1.SUBTRACT);
                c2192ak1.e(c6408pA16);
                C6408pA1 c6408pA17 = new C6408pA1(7);
                ArrayList arrayList7 = c6408pA17.a;
                arrayList7.add(EnumC4301iC1.ASSIGN);
                arrayList7.add(EnumC4301iC1.CONST);
                arrayList7.add(EnumC4301iC1.CREATE_ARRAY);
                arrayList7.add(EnumC4301iC1.CREATE_OBJECT);
                arrayList7.add(EnumC4301iC1.EXPRESSION_LIST);
                arrayList7.add(EnumC4301iC1.GET);
                arrayList7.add(EnumC4301iC1.GET_INDEX);
                arrayList7.add(EnumC4301iC1.GET_PROPERTY);
                arrayList7.add(EnumC4301iC1.NULL);
                arrayList7.add(EnumC4301iC1.SET_PROPERTY);
                arrayList7.add(EnumC4301iC1.TYPEOF);
                arrayList7.add(EnumC4301iC1.UNDEFINED);
                arrayList7.add(EnumC4301iC1.VAR);
                c2192ak1.e(c6408pA17);
                this.a = c2192ak1;
                C6860rY0 c6860rY0 = new C6860rY0((C6860rY0) null, c2192ak1);
                this.c = c6860rY0;
                this.b = c6860rY0.I();
                C5826m71 c5826m71 = new C5826m71(10);
                c5826m71.b = new HashMap();
                this.d = c5826m71;
                c6860rY0.O("require", new R32(c5826m71));
                ((HashMap) c5826m71.b).put("internal.platform", new JA1(1));
                c6860rY0.O("runtime.counter", new C1029My1(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)));
                break;
            default:
                this.d = new Object();
                C2209aq0 c2209aq0 = new C2209aq0(4);
                this.b = new PriorityQueue(120, c2209aq0);
                this.a = new PriorityQueue(120, c2209aq0);
                this.c = new ArrayList();
                break;
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
    }

    public C1155Oo1(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public C1155Oo1(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.d = null;
    }

    public C1155Oo1(Mac mac) {
        this.a = null;
        this.b = null;
        this.c = mac;
        this.d = null;
    }
}
