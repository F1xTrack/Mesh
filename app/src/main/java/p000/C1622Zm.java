package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: Zm */
/* loaded from: classes.dex */
public class C1622Zm {

    /* renamed from: a */
    public int f15113a;

    /* renamed from: b */
    public boolean f15114b;

    /* renamed from: c */
    public boolean f15115c;

    /* renamed from: d */
    public final Object f15116d;

    /* renamed from: e */
    public Object f15117e;

    /* renamed from: f */
    public final Object f15118f;

    /* renamed from: g */
    public Object f15119g;

    /* renamed from: h */
    public Object f15120h;

    public C1622Zm(boolean z, boolean z2, InterfaceC0810Ms interfaceC0810Ms, C8002Ng0 c8002Ng0, C8054Og0 c8054Og0) {
        O90.m5968f(interfaceC0810Ms, "typeSystemContext");
        O90.m5968f(c8002Ng0, "kotlinTypePreparator");
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        this.f15114b = z;
        this.f15115c = z2;
        this.f15116d = interfaceC0810Ms;
        this.f15117e = c8002Ng0;
        this.f15118f = c8054Og0;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x003c  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m9586i(android.hardware.camera2.TotalCaptureResult r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1622Zm.m9586i(android.hardware.camera2.TotalCaptureResult, boolean):boolean");
    }

    /* renamed from: j */
    public static boolean m9587j(TotalCaptureResult totalCaptureResult, int i) {
        AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m9588a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m9589b((AbstractC6511nn) it.next());
        }
    }

    /* renamed from: b */
    public void m9589b(AbstractC6511nn abstractC6511nn) {
        ArrayList arrayList = (ArrayList) this.f15118f;
        if (arrayList.contains(abstractC6511nn)) {
            return;
        }
        arrayList.add(abstractC6511nn);
    }

    /* renamed from: c */
    public void m9590c(InterfaceC6854sw interfaceC6854sw) {
        for (C0480Hc c0480Hc : interfaceC6854sw.mo4793u()) {
            C7612Ft0 c7612Ft0 = (C7612Ft0) this.f15117e;
            c7612Ft0.getClass();
            try {
                c7612Ft0.mo4794w(c0480Hc);
            } catch (IllegalArgumentException unused) {
            }
            ((C7612Ft0) this.f15117e).m2814d(c0480Hc, interfaceC6854sw.mo4791d0(c0480Hc), interfaceC6854sw.mo4794w(c0480Hc));
        }
    }

    /* renamed from: d */
    public void m9591d(AbstractC4232iH abstractC4232iH) {
        ((HashSet) this.f15116d).add(abstractC4232iH);
    }

    /* renamed from: e */
    public C1373Vp m9592e() {
        ArrayList arrayList = new ArrayList((HashSet) this.f15116d);
        C7882Ky0 c7882Ky0M4786a = C7882Ky0.m4786a((C7612Ft0) this.f15117e);
        int i = this.f15113a;
        boolean z = this.f15114b;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f15118f);
        boolean z2 = this.f15115c;
        C10996s81 c10996s81 = C10996s81.f42278b;
        ArrayMap arrayMap = new ArrayMap();
        C7872Kt0 c7872Kt0 = (C7872Kt0) this.f15119g;
        for (String str : c7872Kt0.f42279a.keySet()) {
            arrayMap.put(str, c7872Kt0.f42279a.get(str));
        }
        return new C1373Vp(arrayList, c7882Ky0M4786a, i, z, arrayList2, z2, new C10996s81(arrayMap), (InterfaceC7034vn) this.f15120h);
    }

    /* renamed from: f */
    public void m9593f() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15119g;
        O90.m5965c(arrayDeque);
        arrayDeque.clear();
        C11748y21 c11748y21 = (C11748y21) this.f15120h;
        O90.m5965c(c11748y21);
        c11748y21.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C1056Qm m9594g(int r12, int r13, int r14) {
        /*
            r11 = this;
            Nb r0 = new Nb
            java.lang.Object r1 = r11.f15118f
            e41 r1 = (p000.C9196e41) r1
            r3 = 1
            r0.<init>(r1, r3)
            Qm r10 = new Qm
            int r4 = r11.f15113a
            java.lang.Object r3 = r11.f15119g
            r5 = r3
            lY0 r5 = (p000.ExecutorC10151lY0) r5
            java.lang.Object r3 = r11.f15120h
            r6 = r3
            C20 r6 = (p000.C20) r6
            java.lang.Object r3 = r11.f15116d
            r7 = r3
            om r7 = (p000.C6573om) r7
            boolean r8 = r11.f15115c
            r3 = r10
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r6 = r10.f9776h
            java.lang.Object r3 = r11.f15116d
            om r3 = (p000.C6573om) r3
            if (r12 != 0) goto L34
            Km r4 = new Km
            r4.<init>(r3)
            r6.add(r4)
        L34:
            r4 = 3
            if (r13 != r4) goto L4d
            Wm r0 = new Wm
            GQ0 r2 = new GQ0
            r2.<init>(r1)
            java.lang.Object r1 = r11.f15119g
            lY0 r1 = (p000.ExecutorC10151lY0) r1
            java.lang.Object r4 = r11.f15120h
            C20 r4 = (p000.C20) r4
            r0.<init>(r3, r1, r4, r2)
            r6.add(r0)
            goto L98
        L4d:
            boolean r1 = r11.f15114b
            if (r1 == 0) goto L98
            java.lang.Object r1 = r11.f15117e
            FC r1 = (p000.C0328FC) r1
            boolean r1 = r1.f3086a
            r5 = 1
            if (r1 != 0) goto L6a
            int r7 = r11.f15113a
            if (r7 == r4) goto L6a
            if (r14 != r5) goto L61
            goto L6a
        L61:
            Jm r1 = new Jm
            r1.<init>(r3, r13, r0)
            r6.add(r1)
            goto L98
        L6a:
            if (r1 != 0) goto L7d
            VH r0 = r3.f39242n
            java.lang.Object r0 = r0.f12487c
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.get()
            java.lang.String r1 = "Camera2CameraControlImp"
            p000.AbstractC7806Jm0.m4412f(r1)
            if (r0 <= 0) goto L7f
        L7d:
            r0 = 0
            r5 = r0
        L7f:
            Ym r7 = new Ym
            java.lang.Object r0 = r11.f15120h
            r4 = r0
            C20 r4 = (p000.C20) r4
            java.lang.Object r0 = r11.f15116d
            r1 = r0
            om r1 = (p000.C6573om) r1
            java.lang.Object r0 = r11.f15119g
            r3 = r0
            lY0 r3 = (p000.ExecutorC10151lY0) r3
            r0 = r7
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r6.add(r7)
        L98:
            java.util.Objects.toString(r6)
            java.lang.String r0 = "Camera2CapturePipeline"
            p000.AbstractC7806Jm0.m4412f(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1622Zm.m9594g(int, int, int):Qm");
    }

    /* renamed from: h */
    public void m9595h() {
        if (((ArrayDeque) this.f15119g) == null) {
            this.f15119g = new ArrayDeque(4);
        }
        if (((C11748y21) this.f15120h) == null) {
            this.f15120h = new C11748y21();
        }
    }

    /* renamed from: k */
    public AbstractC8315Tg1 m9596k(InterfaceC7950Mg0 interfaceC7950Mg0) {
        O90.m5968f(interfaceC7950Mg0, "type");
        return ((C8002Ng0) this.f15117e).m5798a(interfaceC7950Mg0);
    }

    /* renamed from: l */
    public AbstractC7742Ig0 m9597l(InterfaceC7950Mg0 interfaceC7950Mg0) {
        O90.m5968f(interfaceC7950Mg0, "type");
        ((C8054Og0) this.f15118f).getClass();
        return (AbstractC7742Ig0) interfaceC7950Mg0;
    }

    public C1622Zm(C6573om c6573om, C0428Gn c0428Gn, C9196e41 c9196e41, ExecutorC10151lY0 executorC10151lY0, C20 c20) {
        this.f15113a = 1;
        this.f15116d = c6573om;
        Integer num = (Integer) c0428Gn.m3155a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f15115c = num != null && num.intValue() == 2;
        this.f15119g = executorC10151lY0;
        this.f15120h = c20;
        this.f15118f = c9196e41;
        this.f15117e = new C0328FC(c9196e41, 11);
        this.f15114b = AbstractC9444g12.m18382b(new C0071B7(5, c0428Gn));
    }

    public C1622Zm() {
        this.f15116d = new HashSet();
        this.f15117e = C7612Ft0.m2812b();
        this.f15113a = -1;
        this.f15114b = false;
        this.f15118f = new ArrayList();
        this.f15115c = false;
        this.f15119g = C7872Kt0.m4776a();
    }

    public C1622Zm(C1373Vp c1373Vp) {
        HashSet hashSet = new HashSet();
        this.f15116d = hashSet;
        this.f15117e = C7612Ft0.m2812b();
        this.f15113a = -1;
        this.f15114b = false;
        ArrayList arrayList = new ArrayList();
        this.f15118f = arrayList;
        this.f15115c = false;
        this.f15119g = C7872Kt0.m4776a();
        hashSet.addAll(c1373Vp.f12778a);
        this.f15117e = C7612Ft0.m2813c(c1373Vp.f12779b);
        this.f15113a = c1373Vp.f12780c;
        arrayList.addAll(c1373Vp.f12782e);
        this.f15115c = c1373Vp.f12783f;
        ArrayMap arrayMap = new ArrayMap();
        C10996s81 c10996s81 = c1373Vp.f12784g;
        for (String str : c10996s81.f42279a.keySet()) {
            arrayMap.put(str, c10996s81.f42279a.get(str));
        }
        this.f15119g = new C7872Kt0(arrayMap);
        this.f15114b = c1373Vp.f12781d;
    }
}
