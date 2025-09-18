package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.widget.EditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.nio.BufferUnderflowException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: iN */
/* loaded from: classes2.dex */
public class C4332iN implements InterfaceC5248j6, InterfaceC0609Ho0, QR0, InterfaceC7668vn, PZ, InterfaceC5441k61, InterfaceC3732fE, InterfaceC6472pW, InterfaceC1290Qh1, InterfaceC6187o11 {
    public static final C7532v32 d = new C7532v32(16);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ C4332iN(char c, int i) {
        this.a = i;
    }

    public static ArrayList B(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1808Wy0) it.next()).a.e());
        }
        return arrayList;
    }

    public static void m(CameraDevice cameraDevice, DY0 dy0) {
        cameraDevice.getClass();
        CY0 cy0 = dy0.a;
        cy0.e().getClass();
        List listF = cy0.f();
        if (listF == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (cy0.c() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        cameraDevice.getId();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            String strD = ((C1808Wy0) it.next()).a.d();
            if (strD != null && !strD.isEmpty()) {
                AbstractC0759Jm0.f("CameraDeviceCompat");
            }
        }
    }

    public C7725w41 A(C0376Eo1 c0376Eo1) {
        C7725w41 c7725w41;
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                Object c7725w412 = linkedHashMap.get(c0376Eo1);
                if (c7725w412 == null) {
                    c7725w412 = new C7725w41(c0376Eo1);
                    linkedHashMap.put(c0376Eo1, c7725w412);
                }
                c7725w41 = (C7725w41) c7725w412;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7725w41;
    }

    public void C(XH1 xh1) {
        if (((HashMap) this.c) == null) {
            this.c = new HashMap();
        }
        ((HashMap) this.c).put(InterfaceC6623qI1.class, xh1);
    }

    @Override // defpackage.InterfaceC7668vn
    public void a(C6263oQ c6263oQ) {
        Integer num;
        CaptureResult captureResult = (CaptureResult) this.c;
        AbstractC8235ym.a(this, c6263oQ);
        try {
            Integer num2 = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num2 != null) {
                c6263oQ.g(num2.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC0759Jm0.f("C2CameraCaptureResult");
        }
        Long l = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            c6263oQ.d(l.longValue());
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            c6263oQ.c(c6263oQ.a, "FNumber", String.valueOf(f.floatValue()));
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            c6263oQ.f(numValueOf.intValue());
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            c6263oQ.e(f2.floatValue());
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            c6263oQ.h(num3.intValue() == 0 ? 2 : 1);
        }
    }

    @Override // defpackage.InterfaceC7668vn
    public C6974s81 b() {
        return (C6974s81) this.b;
    }

    @Override // defpackage.InterfaceC3732fE
    public Throwable c() {
        return (Throwable) this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    @Override // defpackage.InterfaceC6472pW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(defpackage.InterfaceC6853rW r6, defpackage.InterfaceC1729Vy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C7044sW
            if (r0 == 0) goto L13
            r0 = r7
            sW r0 = (defpackage.C7044sW) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            sW r0 = new sW
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.RQ1.d(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            rW r6 = r0.e
            iN r2 = r0.d
            defpackage.RQ1.d(r7)
            goto L4f
        L3a:
            defpackage.RQ1.d(r7)
            r0.d = r5
            r0.e = r6
            r0.b = r4
            java.lang.Object r7 = r5.b
            pW r7 = (defpackage.InterfaceC6472pW) r7
            java.io.Serializable r7 = defpackage.AbstractC5615l12.a(r7, r6, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L65
            java.lang.Object r2 = r2.c
            IY0 r2 = (defpackage.IY0) r2
            r4 = 0
            r0.d = r4
            r0.e = r4
            r0.b = r3
            java.lang.Object r6 = r2.b(r6, r7, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            Tf1 r6 = defpackage.C1518Tf1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4332iN.collect(rW, Vy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3732fE
    public void d(C1942Yr c1942Yr, Throwable th) {
        this.b = c1942Yr;
        this.c = th;
    }

    @Override // defpackage.InterfaceC6187o11
    public void e0(KK kk) {
        KK kk2;
        C5614l11 c5614l11 = (C5614l11) this.b;
        AtomicReference atomicReference = c5614l11.b;
        while (!atomicReference.compareAndSet(null, kk) && atomicReference.get() == null) {
        }
        if (!c5614l11.a.get() || (kk2 = (KK) atomicReference.getAndSet(null)) == null) {
            return;
        }
        kk2.a();
    }

    @Override // defpackage.InterfaceC1290Qh1
    public int f(Object obj) {
        ((C0213Cm0) this.c).getClass();
        return ((InterfaceC1290Qh1) this.b).f(((C1732Vz) obj).b.w());
    }

    @Override // defpackage.InterfaceC3732fE
    public void g(C1864Xr c1864Xr) {
        C6027nB c6027nB = new C6027nB("Non interactive decryption mode.");
        this.b = null;
        this.c = c6027nB;
    }

    @Override // defpackage.InterfaceC3732fE
    public C1942Yr getResult() {
        return (C1942Yr) this.b;
    }

    @Override // defpackage.InterfaceC7668vn
    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC7286tn h() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AWB_STATE);
        EnumC7286tn enumC7286tn = EnumC7286tn.a;
        if (num == null) {
            return enumC7286tn;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC7286tn.b;
        }
        if (iIntValue == 1) {
            return EnumC7286tn.c;
        }
        if (iIntValue == 2) {
            return EnumC7286tn.d;
        }
        if (iIntValue == 3) {
            return EnumC7286tn.e;
        }
        AbstractC0759Jm0.f("C2CameraCaptureResult");
        return enumC7286tn;
    }

    @Override // defpackage.InterfaceC7668vn
    public int i() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return 2;
        }
        if (iIntValue == 2) {
            return 3;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return 4;
        }
        AbstractC0759Jm0.f("C2CameraCaptureResult");
        return 1;
    }

    @Override // defpackage.InterfaceC5248j6
    public void j(C2251b3 c2251b3) {
        O90.f(c2251b3, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((CopyOnWriteArrayList) this.b).remove(c2251b3);
    }

    public C2520cT k() {
        return new C2520cT((String) this.b, ((HashMap) this.c) == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap((HashMap) this.c)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:585:0x017f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:131)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void l(android.graphics.Bitmap r33, android.graphics.Bitmap r34, android.graphics.Bitmap r35) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4332iN.l(android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.Bitmap):void");
    }

    public boolean n(int i) {
        return ((VV) this.b).a.get(i);
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC6904rn o() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AE_STATE);
        EnumC6904rn enumC6904rn = EnumC6904rn.a;
        if (num == null) {
            return enumC6904rn;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC6904rn.b;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC6904rn.e;
            }
            if (iIntValue == 3) {
                return EnumC6904rn.f;
            }
            if (iIntValue == 4) {
                return EnumC6904rn.d;
            }
            if (iIntValue != 5) {
                AbstractC0759Jm0.f("C2CameraCaptureResult");
                return enumC6904rn;
            }
        }
        return EnumC6904rn.c;
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureBufferLost(RR0 rr0, long j, int i) {
    }

    @Override // defpackage.QR0
    public void onCaptureCompleted(RR0 rr0, InterfaceC7668vn interfaceC7668vn) {
        C4332iN c4332iN = (C4332iN) interfaceC7668vn;
        c4332iN.getTimestamp();
        N8 n8 = new N8((C6974s81) this.c, 5, (CaptureResult) c4332iN.c);
        VY vy = (VY) this.b;
        vy.d = n8;
        vy.g();
    }

    @Override // defpackage.QR0
    public void onCaptureFailed(RR0 rr0, C6714qn c6714qn) {
        ((VY) this.b).d();
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureProgressed(RR0 rr0, InterfaceC7668vn interfaceC7668vn) {
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureSequenceAborted(int i) {
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureStarted(RR0 rr0, long j, long j2) {
    }

    @Override // defpackage.InterfaceC6187o11
    public void onError(Throwable th) {
        O90.f(th, "e");
        if (((C5614l11) this.b).a.compareAndSet(false, true)) {
            ((InterfaceC6187o11) this.c).onError(th);
        }
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        C6687qe c6687qe;
        switch (this.a) {
            case 9:
                DV1.a();
                C0593Hj c0593Hj = (C0593Hj) this.c;
                OD0 od0 = (OD0) c0593Hj.b;
                if (((OD0) this.b) == od0) {
                    int i = od0.a;
                    AbstractC0759Jm0.f("CaptureNode");
                    C3383dO1 c3383dO1 = (C3383dO1) c0593Hj.h;
                    if (c3383dO1 != null) {
                        c3383dO1.c = null;
                    }
                    c0593Hj.b = null;
                    return;
                }
                return;
            case 20:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            case 24:
                Objects.toString(th);
                AbstractC0759Jm0.f("Recorder");
                C3572eO0 c3572eO0 = (C3572eO0) this.c;
                int i2 = c3572eO0.e;
                if (i2 < c3572eO0.c) {
                    c3572eO0.e = i2 + 1;
                    RunnableC1577Tz0 runnableC1577Tz0 = new RunnableC1577Tz0(15, this);
                    c3572eO0.f = QR1.h().schedule(new MD0(c3572eO0.g.d, 16, runnableC1577Tz0), C3954gO0.s0, TimeUnit.MILLISECONDS);
                    return;
                }
                C3954gO0 c3954gO0 = c3572eO0.g;
                synchronized (c3954gO0.h) {
                    try {
                        c6687qe = null;
                        switch (c3954gO0.k.ordinal()) {
                            case 1:
                            case 2:
                                C6687qe c6687qe2 = c3954gO0.o;
                                c3954gO0.o = null;
                                c6687qe = c6687qe2;
                            case 0:
                                c3954gO0.C(-1);
                                c3954gO0.B(EnumC3763fO0.i);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                throw new AssertionError("Encountered encoder setup error while in unexpected state " + c3954gO0.k + ": " + th);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c6687qe != null) {
                    c3954gO0.i(c6687qe, 7, th);
                    return;
                }
                return;
            default:
                AbstractC3377dM1.i(th instanceof X61, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
                ((InterfaceC6556py) this.b).b(new C1045Ne(1, (Surface) this.c));
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0117 A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:113:0x00c3, B:114:0x00c9, B:141:0x013d, B:116:0x00ce, B:119:0x00d8, B:122:0x00de, B:123:0x00e5, B:126:0x00e9, B:127:0x00f7, B:128:0x010a, B:131:0x010e, B:135:0x0117, B:137:0x011c, B:138:0x0127, B:139:0x0133), top: B:159:0x00c3 }] */
    @Override // defpackage.PZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4332iN.onSuccess(java.lang.Object):void");
    }

    public boolean p(C0376Eo1 c0376Eo1) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = ((LinkedHashMap) this.c).containsKey(c0376Eo1);
        }
        return zContainsKey;
    }

    @Override // defpackage.InterfaceC0609Ho0
    /* renamed from: q */
    public WB e(C0531Go0 c0531Go0) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        InterfaceC0921Lo0 c6273oT0;
        int i;
        WB wb;
        String str = c0531Go0.a.a;
        WB wb2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C6666qX c6666qX = c0531Go0.c;
                int i2 = AbstractC0277Dh1.a;
                if (i2 >= 34 && (i2 >= 35 || AbstractC1865Xr0.m(c6666qX.m))) {
                    c6273oT0 = new C6273oT0(mediaCodecCreateByCodecName);
                    i = 4;
                } else {
                    c6273oT0 = new A9(mediaCodecCreateByCodecName, (HandlerThread) ((C8118y9) this.c).get());
                    i = 0;
                }
                wb = new WB(mediaCodecCreateByCodecName, (HandlerThread) ((C8118y9) this.b).get(), c6273oT0);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                WB.e(wb, c0531Go0.b, c0531Go0.d, c0531Go0.e, i);
                return wb;
            } catch (Exception e2) {
                e = e2;
                wb2 = wb;
                if (wb2 != null) {
                    wb2.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    public void r(DY0 dy0) throws C5950mn, CameraAccessException {
        CameraDevice cameraDevice = (CameraDevice) this.b;
        m(cameraDevice, dy0);
        CY0 cy0 = dy0.a;
        C0137Bn c0137Bn = new C0137Bn(cy0.c(), cy0.e());
        ArrayList arrayListB = B(cy0.f());
        C3866fw1 c3866fw1 = (C3866fw1) this.c;
        c3866fw1.getClass();
        C8306z80 c8306z80B = cy0.b();
        Handler handler = (Handler) c3866fw1.b;
        try {
            if (c8306z80B != null) {
                InputConfiguration inputConfiguration = c8306z80B.a.a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayListB, c0137Bn, handler);
            } else {
                if (cy0.d() == 1) {
                    cameraDevice.createConstrainedHighSpeedCaptureSession(arrayListB, c0137Bn, handler);
                    return;
                }
                try {
                    cameraDevice.createCaptureSession(arrayListB, c0137Bn, handler);
                } catch (CameraAccessException e) {
                    throw new C5950mn(e);
                }
            }
        } catch (CameraAccessException e2) {
            throw new C5950mn(e2);
        }
    }

    public void s(YR yr, YM0 ym0) {
        int i = 0;
        while (true) {
            InterfaceC1584Ub1[] interfaceC1584Ub1Arr = (InterfaceC1584Ub1[]) this.b;
            if (i >= interfaceC1584Ub1Arr.length) {
                return;
            }
            ym0.a();
            ym0.b();
            InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(ym0.e, 3);
            C6666qX c6666qX = (C6666qX) ((List) this.c).get(i);
            String str = c6666qX.m;
            YN1.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c6666qX.a;
            if (str2 == null) {
                ym0.b();
                str2 = (String) ym0.b;
            }
            C6475pX c6475pX = new C6475pX();
            c6475pX.a = str2;
            c6475pX.l = AbstractC1865Xr0.n(str);
            c6475pX.e = c6666qX.e;
            c6475pX.d = c6666qX.d;
            c6475pX.E = c6666qX.F;
            c6475pX.o = c6666qX.p;
            F91.B(c6475pX, interfaceC1584Ub1W);
            interfaceC1584Ub1Arr[i] = interfaceC1584Ub1W;
            i++;
        }
    }

    @Override // defpackage.InterfaceC7668vn
    public CaptureResult t() {
        return (CaptureResult) this.c;
    }

    @Override // defpackage.InterfaceC5441k61
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        C5833mA c5833mA = (C5833mA) this.c;
        if (zBooleanValue) {
            boolean zBooleanValue2 = bool.booleanValue();
            DC dc = (DC) c5833mA.b;
            if (!zBooleanValue2) {
                dc.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            dc.g.d(null);
            return ((C3892g32) this.b).n((ZA) ((C6846rT1) c5833mA.e).b, new C1016Mu0(9, this));
        }
        Iterator it = HT.m(((File) ((HT) c5833mA.g).c).listFiles(C5833mA.s)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        HT ht = ((XA) ((C1252Pv) c5833mA.m).b).b;
        XA.a(HT.m(((File) ht.e).listFiles()));
        XA.a(HT.m(((File) ht.f).listFiles()));
        XA.a(HT.m(((File) ht.g).listFiles()));
        ((S81) c5833mA.q).d(null);
        return AbstractC3782fU1.e(null);
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC7095sn u() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_STATE);
        EnumC7095sn enumC7095sn = EnumC7095sn.a;
        if (num == null) {
            return enumC7095sn;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                AbstractC0759Jm0.f("C2CameraCaptureResult");
                break;
        }
        return enumC7095sn;
    }

    public int v() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return 3;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return 4;
            }
            if (iIntValue != 5) {
                AbstractC0759Jm0.f("C2CameraCaptureResult");
                return 1;
            }
        }
        return 2;
    }

    public WR w(Object... objArr) {
        Constructor constructorD;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    constructorD = ((C6799rE) this.b).d();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorD = null;
        }
        if (constructorD == null) {
            return null;
        }
        try {
            return (WR) constructorD.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public void x(String str) {
        C3941gK c3941gK;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.b).get(str);
                IL1.d(obj, "Argument must not be null");
                c3941gK = (C3941gK) obj;
                int i = c3941gK.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c3941gK.b);
                }
                int i2 = i - 1;
                c3941gK.b = i2;
                if (i2 == 0) {
                    C3941gK c3941gK2 = (C3941gK) ((HashMap) this.b).remove(str);
                    if (!c3941gK2.equals(c3941gK)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c3941gK + ", but actually removed: " + c3941gK2 + ", safeKey: " + str);
                    }
                    ((C4132hK) this.c).b(c3941gK2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c3941gK.a.unlock();
    }

    public C7725w41 y(C0376Eo1 c0376Eo1) {
        C7725w41 c7725w41;
        synchronized (this.b) {
            c7725w41 = (C7725w41) ((LinkedHashMap) this.c).remove(c0376Eo1);
        }
        return c7725w41;
    }

    public List z(String str) {
        List listB0;
        O90.f(str, "workSpecId");
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (O90.a(((C0376Eo1) entry.getKey()).a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.c).remove((C0376Eo1) it.next());
                }
                listB0 = AbstractC8069xu.b0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listB0;
    }

    public /* synthetic */ C4332iN(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ C4332iN(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public C4332iN(int i, byte b) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new HashMap();
                this.c = new C4132hK(0);
                break;
            case 18:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 21:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
            case 27:
                this.b = new Object();
                this.c = new LinkedHashMap();
                break;
            default:
                this.b = new CopyOnWriteArrayList();
                this.c = new WeakReference(null);
                break;
        }
    }

    public C4332iN(ExecutorService executorService) {
        this.a = 29;
        O90.f(executorService, "executor");
        this.b = executorService;
        this.c = new ArrayDeque();
    }

    public C4332iN(Object obj, ArrayList arrayList, List list) {
        this.a = 0;
        O90.f(obj, "bareValue");
        this.b = obj;
        this.c = list;
    }

    public C4332iN(HT ht) {
        this.a = 2;
        this.b = ht;
        this.c = d;
    }

    public C4332iN(CameraDevice cameraDevice, C3866fw1 c3866fw1) {
        this.a = 8;
        cameraDevice.getClass();
        this.b = cameraDevice;
        this.c = c3866fw1;
    }

    public C4332iN(List list) {
        this.a = 25;
        this.c = list;
        this.b = new InterfaceC1584Ub1[list.size()];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4332iN(HT ht, String str) {
        this(ht);
        this.a = 2;
        C7532v32 c7532v32 = d;
        c7532v32.a();
        this.c = c7532v32;
        if (str == null) {
            return;
        }
        this.c = new AG0(ht.j(str, "userlog"));
    }

    public C4332iN(InterfaceC3739fG0 interfaceC3739fG0) {
        this.a = 22;
        this.c = Collections.synchronizedMap(new HashMap());
        this.b = interfaceC3739fG0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4332iN(CaptureResult captureResult) {
        this(C6974s81.b, 7, captureResult);
        this.a = 7;
    }

    public C4332iN(int i) {
        this.a = 5;
        C8118y9 c8118y9 = new C8118y9(i, 0);
        C8118y9 c8118y92 = new C8118y9(i, 1);
        this.b = c8118y9;
        this.c = c8118y92;
    }

    public C4332iN(VV vv, SparseArray sparseArray) {
        this.a = 3;
        this.b = vv;
        SparseBooleanArray sparseBooleanArray = vv.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iA = vv.a(i);
            Y3 y3 = (Y3) sparseArray.get(iA);
            y3.getClass();
            sparseArray2.append(iA, y3);
        }
        this.c = sparseArray2;
    }

    public C4332iN(String str) {
        this.a = 14;
        this.c = null;
        this.b = str;
    }

    public C4332iN(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 16;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C4332iN(int i, int i2) {
        this.a = 16;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public C4332iN(int i, int i2, int i3) {
        this.a = 16;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C4332iN(EditText editText) {
        this.a = 1;
        this.b = editText;
        CN cn = new CN(editText);
        this.c = cn;
        editText.addTextChangedListener(cn);
        if (C7399uN.b == null) {
            synchronized (C7399uN.a) {
                try {
                    if (C7399uN.b == null) {
                        C7399uN c7399uN = new C7399uN();
                        try {
                            C7399uN.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C7399uN.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C7399uN.b = c7399uN;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C7399uN.b);
    }

    public C4332iN(C6799rE c6799rE) {
        this.a = 12;
        this.b = c6799rE;
        this.c = new AtomicBoolean(false);
    }

    public C4332iN(VY vy, int i, C6974s81 c6974s81) {
        this.a = 6;
        this.b = vy;
        this.c = c6974s81;
    }
}
