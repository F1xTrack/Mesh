package defpackage;

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
public class C2005Zm {
    public int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;

    public C2005Zm(boolean z, boolean z2, InterfaceC1009Ms interfaceC1009Ms, C1052Ng0 c1052Ng0, C1130Og0 c1130Og0) {
        O90.f(interfaceC1009Ms, "typeSystemContext");
        O90.f(c1052Ng0, "kotlinTypePreparator");
        O90.f(c1130Og0, "kotlinTypeRefiner");
        this.b = z;
        this.c = z2;
        this.d = interfaceC1009Ms;
        this.e = c1052Ng0;
        this.f = c1130Og0;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean i(android.hardware.camera2.TotalCaptureResult r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2005Zm.i(android.hardware.camera2.TotalCaptureResult, boolean):boolean");
    }

    public static boolean j(TotalCaptureResult totalCaptureResult, int i) {
        AbstractC0759Jm0.f("Camera2CapturePipeline");
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            AbstractC0759Jm0.f("Camera2CapturePipeline");
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

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((AbstractC6141nn) it.next());
        }
    }

    public void b(AbstractC6141nn abstractC6141nn) {
        ArrayList arrayList = (ArrayList) this.f;
        if (arrayList.contains(abstractC6141nn)) {
            return;
        }
        arrayList.add(abstractC6141nn);
    }

    public void c(InterfaceC7122sw interfaceC7122sw) {
        for (C0572Hc c0572Hc : interfaceC7122sw.u()) {
            C0468Ft0 c0468Ft0 = (C0468Ft0) this.e;
            c0468Ft0.getClass();
            try {
                c0468Ft0.w(c0572Hc);
            } catch (IllegalArgumentException unused) {
            }
            ((C0468Ft0) this.e).d(c0572Hc, interfaceC7122sw.d0(c0572Hc), interfaceC7122sw.w(c0572Hc));
        }
    }

    public void d(AbstractC4314iH abstractC4314iH) {
        ((HashSet) this.d).add(abstractC4314iH);
    }

    public C1702Vp e() {
        ArrayList arrayList = new ArrayList((HashSet) this.d);
        C0873Ky0 c0873Ky0A = C0873Ky0.a((C0468Ft0) this.e);
        int i = this.a;
        boolean z = this.b;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f);
        boolean z2 = this.c;
        C6974s81 c6974s81 = C6974s81.b;
        ArrayMap arrayMap = new ArrayMap();
        C0858Kt0 c0858Kt0 = (C0858Kt0) this.g;
        for (String str : c0858Kt0.a.keySet()) {
            arrayMap.put(str, c0858Kt0.a.get(str));
        }
        return new C1702Vp(arrayList, c0873Ky0A, i, z, arrayList2, z2, new C6974s81(arrayMap), (InterfaceC7668vn) this.h);
    }

    public void f() {
        ArrayDeque arrayDeque = (ArrayDeque) this.g;
        O90.c(arrayDeque);
        arrayDeque.clear();
        C8098y21 c8098y21 = (C8098y21) this.h;
        O90.c(c8098y21);
        c8098y21.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.C1303Qm g(int r12, int r13, int r14) {
        /*
            r11 = this;
            Nb r0 = new Nb
            java.lang.Object r1 = r11.f
            e41 r1 = (defpackage.C3513e41) r1
            r3 = 1
            r0.<init>(r1, r3)
            Qm r10 = new Qm
            int r4 = r11.a
            java.lang.Object r3 = r11.g
            r5 = r3
            lY0 r5 = (defpackage.ExecutorC5715lY0) r5
            java.lang.Object r3 = r11.h
            r6 = r3
            C20 r6 = (defpackage.C20) r6
            java.lang.Object r3 = r11.d
            r7 = r3
            om r7 = (defpackage.C6329om) r7
            boolean r8 = r11.c
            r3 = r10
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r6 = r10.h
            java.lang.Object r3 = r11.d
            om r3 = (defpackage.C6329om) r3
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
            java.lang.Object r1 = r11.g
            lY0 r1 = (defpackage.ExecutorC5715lY0) r1
            java.lang.Object r4 = r11.h
            C20 r4 = (defpackage.C20) r4
            r0.<init>(r3, r1, r4, r2)
            r6.add(r0)
            goto L98
        L4d:
            boolean r1 = r11.b
            if (r1 == 0) goto L98
            java.lang.Object r1 = r11.e
            FC r1 = (defpackage.FC) r1
            boolean r1 = r1.a
            r5 = 1
            if (r1 != 0) goto L6a
            int r7 = r11.a
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
            VH r0 = r3.n
            java.lang.Object r0 = r0.c
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.get()
            java.lang.String r1 = "Camera2CameraControlImp"
            defpackage.AbstractC0759Jm0.f(r1)
            if (r0 <= 0) goto L7f
        L7d:
            r0 = 0
            r5 = r0
        L7f:
            Ym r7 = new Ym
            java.lang.Object r0 = r11.h
            r4 = r0
            C20 r4 = (defpackage.C20) r4
            java.lang.Object r0 = r11.d
            r1 = r0
            om r1 = (defpackage.C6329om) r1
            java.lang.Object r0 = r11.g
            r3 = r0
            lY0 r3 = (defpackage.ExecutorC5715lY0) r3
            r0 = r7
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r6.add(r7)
        L98:
            java.util.Objects.toString(r6)
            java.lang.String r0 = "Camera2CapturePipeline"
            defpackage.AbstractC0759Jm0.f(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2005Zm.g(int, int, int):Qm");
    }

    public void h() {
        if (((ArrayDeque) this.g) == null) {
            this.g = new ArrayDeque(4);
        }
        if (((C8098y21) this.h) == null) {
            this.h = new C8098y21();
        }
    }

    public AbstractC1521Tg1 k(InterfaceC0974Mg0 interfaceC0974Mg0) {
        O90.f(interfaceC0974Mg0, "type");
        return ((C1052Ng0) this.e).a(interfaceC0974Mg0);
    }

    public AbstractC0663Ig0 l(InterfaceC0974Mg0 interfaceC0974Mg0) {
        O90.f(interfaceC0974Mg0, "type");
        ((C1130Og0) this.f).getClass();
        return (AbstractC0663Ig0) interfaceC0974Mg0;
    }

    public C2005Zm(C6329om c6329om, C0527Gn c0527Gn, C3513e41 c3513e41, ExecutorC5715lY0 executorC5715lY0, C20 c20) {
        this.a = 1;
        this.d = c6329om;
        Integer num = (Integer) c0527Gn.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.c = num != null && num.intValue() == 2;
        this.g = executorC5715lY0;
        this.h = c20;
        this.f = c3513e41;
        this.e = new FC(c3513e41, 11);
        this.b = AbstractC3884g12.b(new B7(5, c0527Gn));
    }

    public C2005Zm() {
        this.d = new HashSet();
        this.e = C0468Ft0.b();
        this.a = -1;
        this.b = false;
        this.f = new ArrayList();
        this.c = false;
        this.g = C0858Kt0.a();
    }

    public C2005Zm(C1702Vp c1702Vp) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = C0468Ft0.b();
        this.a = -1;
        this.b = false;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.c = false;
        this.g = C0858Kt0.a();
        hashSet.addAll(c1702Vp.a);
        this.e = C0468Ft0.c(c1702Vp.b);
        this.a = c1702Vp.c;
        arrayList.addAll(c1702Vp.e);
        this.c = c1702Vp.f;
        ArrayMap arrayMap = new ArrayMap();
        C6974s81 c6974s81 = c1702Vp.g;
        for (String str : c6974s81.a.keySet()) {
            arrayMap.put(str, c6974s81.a.get(str));
        }
        this.g = new C0858Kt0(arrayMap);
        this.b = c1702Vp.d;
    }
}
