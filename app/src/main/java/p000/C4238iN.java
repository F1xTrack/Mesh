package p000;

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
public class C4238iN implements InterfaceC6216j6, InterfaceC7706Ho0, QR0, InterfaceC7034vn, InterfaceC0980PZ, InterfaceC9968k61, InterfaceC4040fE, InterfaceC6622pW, InterfaceC8161Qh1, InterfaceC10467o11 {

    /* renamed from: d */
    public static final C11370v32 f29111d = new C11370v32(16);

    /* renamed from: a */
    public final /* synthetic */ int f29112a;

    /* renamed from: b */
    public Object f29113b;

    /* renamed from: c */
    public Object f29114c;

    public /* synthetic */ C4238iN(char c, int i) {
        this.f29112a = i;
    }

    /* renamed from: B */
    public static ArrayList m19007B(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C8506Wy0) it.next()).f13467a.mo9439e());
        }
        return arrayList;
    }

    /* renamed from: m */
    public static void m19008m(CameraDevice cameraDevice, DY0 dy0) {
        cameraDevice.getClass();
        CY0 cy0 = dy0.f2043a;
        cy0.mo224e().getClass();
        List listMo225f = cy0.mo225f();
        if (listMo225f == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (cy0.mo222c() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        cameraDevice.getId();
        Iterator it = listMo225f.iterator();
        while (it.hasNext()) {
            String strMo9438d = ((C8506Wy0) it.next()).f13467a.mo9438d();
            if (strMo9438d != null && !strMo9438d.isEmpty()) {
                AbstractC7806Jm0.m4412f("CameraDeviceCompat");
            }
        }
    }

    /* renamed from: A */
    public C11499w41 m19009A(C7551Eo1 c7551Eo1) {
        C11499w41 c11499w41;
        synchronized (this.f29113b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f29114c;
                Object c11499w412 = linkedHashMap.get(c7551Eo1);
                if (c11499w412 == null) {
                    c11499w412 = new C11499w41(c7551Eo1);
                    linkedHashMap.put(c7551Eo1, c11499w412);
                }
                c11499w41 = (C11499w41) c11499w412;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11499w41;
    }

    /* renamed from: C */
    public void m19010C(XH1 xh1) {
        if (((HashMap) this.f29114c) == null) {
            this.f29114c = new HashMap();
        }
        ((HashMap) this.f29114c).put(InterfaceC10760qI1.class, xh1);
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: a */
    public void mo384a(C6551oQ c6551oQ) {
        Integer num;
        CaptureResult captureResult = (CaptureResult) this.f29114c;
        AbstractC7222ym.m26224a(this, c6551oQ);
        try {
            Integer num2 = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num2 != null) {
                c6551oQ.m23400g(num2.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC7806Jm0.m4412f("C2CameraCaptureResult");
        }
        Long l = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            c6551oQ.m23397d(l.longValue());
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            c6551oQ.m23396c(c6551oQ.f38994a, "FNumber", String.valueOf(f.floatValue()));
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            c6551oQ.m23399f(numValueOf.intValue());
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            c6551oQ.m23398e(f2.floatValue());
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            c6551oQ.m23401h(num3.intValue() == 0 ? 2 : 1);
        }
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: b */
    public C10996s81 mo385b() {
        return (C10996s81) this.f29113b;
    }

    @Override // p000.InterfaceC4040fE
    /* renamed from: c */
    public Throwable mo18196c() {
        return (Throwable) this.f29114c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    @Override // p000.InterfaceC6622pW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(p000.InterfaceC6748rW r6, p000.InterfaceC1382Vy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.C6828sW
            if (r0 == 0) goto L13
            r0 = r7
            sW r0 = (p000.C6828sW) r0
            int r1 = r0.f42468b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42468b = r1
            goto L18
        L13:
            sW r0 = new sW
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f42467a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f42468b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p000.RQ1.m7017d(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            rW r6 = r0.f42471e
            iN r2 = r0.f42470d
            p000.RQ1.m7017d(r7)
            goto L4f
        L3a:
            p000.RQ1.m7017d(r7)
            r0.f42470d = r5
            r0.f42471e = r6
            r0.f42468b = r4
            java.lang.Object r7 = r5.f29113b
            pW r7 = (p000.InterfaceC6622pW) r7
            java.io.Serializable r7 = p000.AbstractC10084l12.m22335a(r7, r6, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L65
            java.lang.Object r2 = r2.f29114c
            IY0 r2 = (p000.IY0) r2
            r4 = 0
            r0.f42470d = r4
            r0.f42471e = r4
            r0.f42468b = r3
            java.lang.Object r6 = r2.mo300b(r6, r7, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            Tf1 r6 = p000.C8313Tf1.f11463a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4238iN.collect(rW, Vy):java.lang.Object");
    }

    @Override // p000.InterfaceC4040fE
    /* renamed from: d */
    public void mo18197d(C1564Yr c1564Yr, Throwable th) {
        this.f29113b = c1564Yr;
        this.f29114c = th;
    }

    @Override // p000.InterfaceC10467o11
    /* renamed from: e0 */
    public void mo1066e0(InterfaceC0651KK interfaceC0651KK) {
        InterfaceC0651KK interfaceC0651KK2;
        C10083l11 c10083l11 = (C10083l11) this.f29113b;
        AtomicReference atomicReference = c10083l11.f36822b;
        while (!atomicReference.compareAndSet(null, interfaceC0651KK) && atomicReference.get() == null) {
        }
        if (!c10083l11.f36821a.get() || (interfaceC0651KK2 = (InterfaceC0651KK) atomicReference.getAndSet(null)) == null) {
            return;
        }
        interfaceC0651KK2.mo4596a();
    }

    @Override // p000.InterfaceC8161Qh1
    /* renamed from: f */
    public int mo6747f(Object obj) {
        ((C7442Cm0) this.f29114c).getClass();
        return ((InterfaceC8161Qh1) this.f29113b).mo6747f(((C1383Vz) obj).f12897b.m26572w());
    }

    @Override // p000.InterfaceC4040fE
    /* renamed from: g */
    public void mo18198g(C1501Xr c1501Xr) {
        C6473nB c6473nB = new C6473nB("Non interactive decryption mode.");
        this.f29113b = null;
        this.f29114c = c6473nB;
    }

    @Override // p000.InterfaceC4040fE
    public C1564Yr getResult() {
        return (C1564Yr) this.f29113b;
    }

    @Override // p000.InterfaceC7034vn
    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.f29114c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: h */
    public EnumC6908tn mo391h() {
        Integer num = (Integer) ((CaptureResult) this.f29114c).get(CaptureResult.CONTROL_AWB_STATE);
        EnumC6908tn enumC6908tn = EnumC6908tn.f43251a;
        if (num == null) {
            return enumC6908tn;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC6908tn.f43252b;
        }
        if (iIntValue == 1) {
            return EnumC6908tn.f43253c;
        }
        if (iIntValue == 2) {
            return EnumC6908tn.f43254d;
        }
        if (iIntValue == 3) {
            return EnumC6908tn.f43255e;
        }
        AbstractC7806Jm0.m4412f("C2CameraCaptureResult");
        return enumC6908tn;
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: i */
    public int mo392i() {
        Integer num = (Integer) ((CaptureResult) this.f29114c).get(CaptureResult.FLASH_STATE);
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
        AbstractC7806Jm0.m4412f("C2CameraCaptureResult");
        return 1;
    }

    @Override // p000.InterfaceC6216j6
    /* renamed from: j */
    public void mo8368j(C1761b3 c1761b3) {
        O90.m5968f(c1761b3, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((CopyOnWriteArrayList) this.f29113b).remove(c1761b3);
    }

    /* renamed from: k */
    public C1849cT m19011k() {
        return new C1849cT((String) this.f29113b, ((HashMap) this.f29114c) == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap((HashMap) this.f29114c)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:585:0x017f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:131)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: l */
    public void m19012l(android.graphics.Bitmap r33, android.graphics.Bitmap r34, android.graphics.Bitmap r35) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4238iN.m19012l(android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.Bitmap):void");
    }

    /* renamed from: n */
    public boolean m19013n(int i) {
        return ((C1353VV) this.f29113b).f12594a.get(i);
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: o */
    public EnumC6765rn mo398o() {
        Integer num = (Integer) ((CaptureResult) this.f29114c).get(CaptureResult.CONTROL_AE_STATE);
        EnumC6765rn enumC6765rn = EnumC6765rn.f41898a;
        if (num == null) {
            return enumC6765rn;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC6765rn.f41899b;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC6765rn.f41902e;
            }
            if (iIntValue == 3) {
                return EnumC6765rn.f41903f;
            }
            if (iIntValue == 4) {
                return EnumC6765rn.f41901d;
            }
            if (iIntValue != 5) {
                AbstractC7806Jm0.m4412f("C2CameraCaptureResult");
                return enumC6765rn;
            }
        }
        return EnumC6765rn.f41900c;
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureBufferLost(RR0 rr0, long j, int i) {
    }

    @Override // p000.QR0
    public void onCaptureCompleted(RR0 rr0, InterfaceC7034vn interfaceC7034vn) {
        C4238iN c4238iN = (C4238iN) interfaceC7034vn;
        c4238iN.getTimestamp();
        C0827N8 c0827n8 = new C0827N8((C10996s81) this.f29114c, 5, (CaptureResult) c4238iN.f29114c);
        C1356VY c1356vy = (C1356VY) this.f29113b;
        c1356vy.f12613d = c0827n8;
        c1356vy.mo8496g();
    }

    @Override // p000.QR0
    public void onCaptureFailed(RR0 rr0, C6702qn c6702qn) {
        ((C1356VY) this.f29113b).mo8492d();
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureProgressed(RR0 rr0, InterfaceC7034vn interfaceC7034vn) {
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureSequenceAborted(int i) {
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureStarted(RR0 rr0, long j, long j2) {
    }

    @Override // p000.InterfaceC10467o11
    public void onError(Throwable th) {
        O90.m5968f(th, "e");
        if (((C10083l11) this.f29113b).f36821a.compareAndSet(false, true)) {
            ((InterfaceC10467o11) this.f29114c).onError(th);
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        C6693qe c6693qe;
        switch (this.f29112a) {
            case 9:
                DV1.m1716a();
                C0487Hj c0487Hj = (C0487Hj) this.f29114c;
                OD0 od0 = (OD0) c0487Hj.f4445b;
                if (((OD0) this.f29113b) == od0) {
                    int i = od0.f8304a;
                    AbstractC7806Jm0.m4412f("CaptureNode");
                    C9108dO1 c9108dO1 = (C9108dO1) c0487Hj.f4451h;
                    if (c9108dO1 != null) {
                        c9108dO1.f26013c = null;
                    }
                    c0487Hj.f4445b = null;
                    return;
                }
                return;
            case 20:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            case 24:
                Objects.toString(th);
                AbstractC7806Jm0.m4412f("Recorder");
                C9235eO0 c9235eO0 = (C9235eO0) this.f29114c;
                int i2 = c9235eO0.f26691e;
                if (i2 < c9235eO0.f26689c) {
                    c9235eO0.f26691e = i2 + 1;
                    RunnableC8352Tz0 runnableC8352Tz0 = new RunnableC8352Tz0(15, this);
                    c9235eO0.f26692f = QR1.m6710h().schedule(new MD0(c9235eO0.f26693g.f27751d, 16, runnableC8352Tz0), C9491gO0.f27718s0, TimeUnit.MILLISECONDS);
                    return;
                }
                C9491gO0 c9491gO0 = c9235eO0.f26693g;
                synchronized (c9491gO0.f27759h) {
                    try {
                        c6693qe = null;
                        switch (c9491gO0.f27764k.ordinal()) {
                            case 1:
                            case 2:
                                C6693qe c6693qe2 = c9491gO0.f27768o;
                                c9491gO0.f27768o = null;
                                c6693qe = c6693qe2;
                            case 0:
                                c9491gO0.m18486C(-1);
                                c9491gO0.m18485B(EnumC9363fO0.f27173i);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                throw new AssertionError("Encountered encoder setup error while in unexpected state " + c9491gO0.f27764k + ": " + th);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c6693qe != null) {
                    c9491gO0.m18498i(c6693qe, 7, th);
                    return;
                }
                return;
            default:
                AbstractC9104dM1.m17550i(th instanceof X61, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
                ((InterfaceC6650py) this.f29113b).mo3020b(new C0859Ne(1, (Surface) this.f29114c));
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0117 A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:113:0x00c3, B:114:0x00c9, B:141:0x013d, B:116:0x00ce, B:119:0x00d8, B:122:0x00de, B:123:0x00e5, B:126:0x00e9, B:127:0x00f7, B:128:0x010a, B:131:0x010e, B:135:0x0117, B:137:0x011c, B:138:0x0127, B:139:0x0133), top: B:159:0x00c3 }] */
    @Override // p000.InterfaceC0980PZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4238iN.onSuccess(java.lang.Object):void");
    }

    /* renamed from: p */
    public boolean m19014p(C7551Eo1 c7551Eo1) {
        boolean zContainsKey;
        synchronized (this.f29113b) {
            zContainsKey = ((LinkedHashMap) this.f29114c).containsKey(c7551Eo1);
        }
        return zContainsKey;
    }

    @Override // p000.InterfaceC7706Ho0
    /* renamed from: q */
    public C1396WB mo2829e(C7654Go0 c7654Go0) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        InterfaceC7914Lo0 c10525oT0;
        int i;
        C1396WB c1396wb;
        String str = c7654Go0.f3907a.f8009a;
        C1396WB c1396wb2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C6686qX c6686qX = c7654Go0.f3909c;
                int i2 = AbstractC7485Dh1.f2166a;
                if (i2 >= 34 && (i2 >= 35 || AbstractC8544Xr0.m9170m(c6686qX.f40974m))) {
                    c10525oT0 = new C10525oT0(mediaCodecCreateByCodecName);
                    i = 4;
                } else {
                    c10525oT0 = new C0010A9(mediaCodecCreateByCodecName, (HandlerThread) ((C7183y9) this.f29114c).get());
                    i = 0;
                }
                c1396wb = new C1396WB(mediaCodecCreateByCodecName, (HandlerThread) ((C7183y9) this.f29113b).get(), c10525oT0);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                C1396WB.m8704e(c1396wb, c7654Go0.f3908b, c7654Go0.f3910d, c7654Go0.f3911e, i);
                return c1396wb;
            } catch (Exception e2) {
                e = e2;
                c1396wb2 = c1396wb;
                if (c1396wb2 != null) {
                    c1396wb2.release();
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

    /* renamed from: r */
    public void mo10521r(DY0 dy0) throws C6448mn, CameraAccessException {
        CameraDevice cameraDevice = (CameraDevice) this.f29113b;
        m19008m(cameraDevice, dy0);
        CY0 cy0 = dy0.f2043a;
        C0113Bn c0113Bn = new C0113Bn(cy0.mo222c(), cy0.mo224e());
        ArrayList arrayListM19007B = m19007B(cy0.mo225f());
        C9432fw1 c9432fw1 = (C9432fw1) this.f29114c;
        c9432fw1.getClass();
        C11887z80 c11887z80Mo221b = cy0.mo221b();
        Handler handler = (Handler) c9432fw1.f27505b;
        try {
            if (c11887z80Mo221b != null) {
                InputConfiguration inputConfiguration = c11887z80Mo221b.f46643a.f45419a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayListM19007B, c0113Bn, handler);
            } else {
                if (cy0.mo223d() == 1) {
                    cameraDevice.createConstrainedHighSpeedCaptureSession(arrayListM19007B, c0113Bn, handler);
                    return;
                }
                try {
                    cameraDevice.createCaptureSession(arrayListM19007B, c0113Bn, handler);
                } catch (CameraAccessException e) {
                    throw new C6448mn(e);
                }
            }
        } catch (CameraAccessException e2) {
            throw new C6448mn(e2);
        }
    }

    /* renamed from: s */
    public void m19016s(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        int i = 0;
        while (true) {
            InterfaceC8357Ub1[] interfaceC8357Ub1Arr = (InterfaceC8357Ub1[]) this.f29113b;
            if (i >= interfaceC8357Ub1Arr.length) {
                return;
            }
            ym0.m9266a();
            ym0.m9267b();
            InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(ym0.f14272e, 3);
            C6686qX c6686qX = (C6686qX) ((List) this.f29114c).get(i);
            String str = c6686qX.f40974m;
            YN1.m9277b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c6686qX.f40962a;
            if (str2 == null) {
                ym0.m9267b();
                str2 = (String) ym0.f14269b;
            }
            C6623pX c6623pX = new C6623pX();
            c6623pX.f40150a = str2;
            c6623pX.f40161l = AbstractC8544Xr0.m9171n(str);
            c6623pX.f40154e = c6686qX.f40966e;
            c6623pX.f40153d = c6686qX.f40965d;
            c6623pX.f40145E = c6686qX.f40956F;
            c6623pX.f40164o = c6686qX.f40977p;
            F91.m2512B(c6623pX, interfaceC8357Ub1Mo2005w);
            interfaceC8357Ub1Arr[i] = interfaceC8357Ub1Mo2005w;
            i++;
        }
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: t */
    public CaptureResult mo403t() {
        return (CaptureResult) this.f29114c;
    }

    @Override // p000.InterfaceC9968k61
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        C6409mA c6409mA = (C6409mA) this.f29114c;
        if (zBooleanValue) {
            boolean zBooleanValue2 = bool.booleanValue();
            C0202DC c0202dc = (C0202DC) c6409mA.f37528b;
            if (!zBooleanValue2) {
                c0202dc.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            c0202dc.f1893g.m7186d(null);
            return ((C9450g32) this.f29113b).m18387n((ExecutorC1584ZA) ((C10910rT1) c6409mA.f37531e).f41678b, new C7978Mu0(9, this));
        }
        Iterator it = C0471HT.m3439m(((File) ((C0471HT) c6409mA.f37533g).f4311c).listFiles(C6409mA.f37526s)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        C0471HT c0471ht = ((C1458XA) ((C1002Pv) c6409mA.f37539m).f9352b).f13590b;
        C1458XA.m8939a(C0471HT.m3439m(((File) c0471ht.f4313e).listFiles()));
        C1458XA.m8939a(C0471HT.m3439m(((File) c0471ht.f4314f).listFiles()));
        C1458XA.m8939a(C0471HT.m3439m(((File) c0471ht.f4315g).listFiles()));
        ((S81) c6409mA.f37543q).m7186d(null);
        return AbstractC9376fU1.m18244e(null);
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: u */
    public EnumC6845sn mo404u() {
        Integer num = (Integer) ((CaptureResult) this.f29114c).get(CaptureResult.CONTROL_AF_STATE);
        EnumC6845sn enumC6845sn = EnumC6845sn.f42594a;
        if (num == null) {
            return enumC6845sn;
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
                AbstractC7806Jm0.m4412f("C2CameraCaptureResult");
                break;
        }
        return enumC6845sn;
    }

    /* renamed from: v */
    public int m19017v() {
        Integer num = (Integer) ((CaptureResult) this.f29114c).get(CaptureResult.CONTROL_AF_MODE);
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
                AbstractC7806Jm0.m4412f("C2CameraCaptureResult");
                return 1;
            }
        }
        return 2;
    }

    /* renamed from: w */
    public InterfaceC1412WR m19018w(Object... objArr) {
        Constructor constructorM24242d;
        synchronized (((AtomicBoolean) this.f29114c)) {
            if (!((AtomicBoolean) this.f29114c).get()) {
                try {
                    constructorM24242d = ((C6730rE) this.f29113b).m24242d();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f29114c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorM24242d = null;
        }
        if (constructorM24242d == null) {
            return null;
        }
        try {
            return (InterfaceC1412WR) constructorM24242d.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    /* renamed from: x */
    public void m19019x(String str) {
        C4109gK c4109gK;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f29113b).get(str);
                IL1.m3830d(obj, "Argument must not be null");
                c4109gK = (C4109gK) obj;
                int i = c4109gK.f27676b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c4109gK.f27676b);
                }
                int i2 = i - 1;
                c4109gK.f27676b = i2;
                if (i2 == 0) {
                    C4109gK c4109gK2 = (C4109gK) ((HashMap) this.f29113b).remove(str);
                    if (!c4109gK2.equals(c4109gK)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c4109gK + ", but actually removed: " + c4109gK2 + ", safeKey: " + str);
                    }
                    ((C4172hK) this.f29114c).m18796b(c4109gK2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c4109gK.f27675a.unlock();
    }

    /* renamed from: y */
    public C11499w41 m19020y(C7551Eo1 c7551Eo1) {
        C11499w41 c11499w41;
        synchronized (this.f29113b) {
            c11499w41 = (C11499w41) ((LinkedHashMap) this.f29114c).remove(c7551Eo1);
        }
        return c11499w41;
    }

    /* renamed from: z */
    public List m19021z(String str) {
        List listM25982b0;
        O90.m5968f(str, "workSpecId");
        synchronized (this.f29113b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f29114c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (O90.m5963a(((C7551Eo1) entry.getKey()).f2911a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f29114c).remove((C7551Eo1) it.next());
                }
                listM25982b0 = AbstractC7167xu.m25982b0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listM25982b0;
    }

    public /* synthetic */ C4238iN(Object obj, int i, Object obj2) {
        this.f29112a = i;
        this.f29113b = obj;
        this.f29114c = obj2;
    }

    public /* synthetic */ C4238iN(Object obj, Object obj2, boolean z, int i) {
        this.f29112a = i;
        this.f29114c = obj;
        this.f29113b = obj2;
    }

    public C4238iN(int i, byte b) {
        this.f29112a = i;
        switch (i) {
            case 13:
                this.f29113b = new HashMap();
                this.f29114c = new C4172hK(0);
                break;
            case 18:
                this.f29113b = new HashMap();
                this.f29114c = new HashMap();
                break;
            case 21:
                this.f29113b = new AtomicInteger();
                this.f29114c = new AtomicInteger();
                break;
            case 27:
                this.f29113b = new Object();
                this.f29114c = new LinkedHashMap();
                break;
            default:
                this.f29113b = new CopyOnWriteArrayList();
                this.f29114c = new WeakReference(null);
                break;
        }
    }

    public C4238iN(ExecutorService executorService) {
        this.f29112a = 29;
        O90.m5968f(executorService, "executor");
        this.f29113b = executorService;
        this.f29114c = new ArrayDeque();
    }

    public C4238iN(Object obj, ArrayList arrayList, List list) {
        this.f29112a = 0;
        O90.m5968f(obj, "bareValue");
        this.f29113b = obj;
        this.f29114c = list;
    }

    public C4238iN(C0471HT c0471ht) {
        this.f29112a = 2;
        this.f29113b = c0471ht;
        this.f29114c = f29111d;
    }

    public C4238iN(CameraDevice cameraDevice, C9432fw1 c9432fw1) {
        this.f29112a = 8;
        cameraDevice.getClass();
        this.f29113b = cameraDevice;
        this.f29114c = c9432fw1;
    }

    public C4238iN(List list) {
        this.f29112a = 25;
        this.f29114c = list;
        this.f29113b = new InterfaceC8357Ub1[list.size()];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4238iN(C0471HT c0471ht, String str) {
        this(c0471ht);
        this.f29112a = 2;
        C11370v32 c11370v32 = f29111d;
        c11370v32.mo141a();
        this.f29114c = c11370v32;
        if (str == null) {
            return;
        }
        this.f29114c = new AG0(c0471ht.m3450j(str, "userlog"));
    }

    public C4238iN(InterfaceC9347fG0 interfaceC9347fG0) {
        this.f29112a = 22;
        this.f29114c = Collections.synchronizedMap(new HashMap());
        this.f29113b = interfaceC9347fG0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4238iN(CaptureResult captureResult) {
        this(C10996s81.f42278b, 7, captureResult);
        this.f29112a = 7;
    }

    public C4238iN(int i) {
        this.f29112a = 5;
        C7183y9 c7183y9 = new C7183y9(i, 0);
        C7183y9 c7183y92 = new C7183y9(i, 1);
        this.f29113b = c7183y9;
        this.f29114c = c7183y92;
    }

    public C4238iN(C1353VV c1353vv, SparseArray sparseArray) {
        this.f29112a = 3;
        this.f29113b = c1353vv;
        SparseBooleanArray sparseBooleanArray = c1353vv.f12594a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iM8443a = c1353vv.m8443a(i);
            C1514Y3 c1514y3 = (C1514Y3) sparseArray.get(iM8443a);
            c1514y3.getClass();
            sparseArray2.append(iM8443a, c1514y3);
        }
        this.f29114c = sparseArray2;
    }

    public C4238iN(String str) {
        this.f29112a = 14;
        this.f29114c = null;
        this.f29113b = str;
    }

    public C4238iN(ArrayList arrayList, ArrayList arrayList2) {
        this.f29112a = 16;
        int size = arrayList.size();
        this.f29113b = new int[size];
        this.f29114c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f29113b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f29114c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C4238iN(int i, int i2) {
        this.f29112a = 16;
        this.f29113b = new int[]{i, i2};
        this.f29114c = new float[]{0.0f, 1.0f};
    }

    public C4238iN(int i, int i2, int i3) {
        this.f29112a = 16;
        this.f29113b = new int[]{i, i2, i3};
        this.f29114c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C4238iN(EditText editText) {
        this.f29112a = 1;
        this.f29113b = editText;
        C0150CN c0150cn = new C0150CN(editText);
        this.f29114c = c0150cn;
        editText.addTextChangedListener(c0150cn);
        if (C6945uN.f43685b == null) {
            synchronized (C6945uN.f43684a) {
                try {
                    if (C6945uN.f43685b == null) {
                        C6945uN c6945uN = new C6945uN();
                        try {
                            C6945uN.f43686c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C6945uN.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C6945uN.f43685b = c6945uN;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C6945uN.f43685b);
    }

    public C4238iN(C6730rE c6730rE) {
        this.f29112a = 12;
        this.f29113b = c6730rE;
        this.f29114c = new AtomicBoolean(false);
    }

    public C4238iN(C1356VY c1356vy, int i, C10996s81 c10996s81) {
        this.f29112a = 6;
        this.f29113b = c1356vy;
        this.f29114c = c10996s81;
    }
}
