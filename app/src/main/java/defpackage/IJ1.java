package defpackage;

import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class IJ1 {
    public static final C8139yG a = new C8139yG("NO_THREAD_ELEMENTS");
    public static final C0251Cz b = new C0251Cz(4);
    public static final C0251Cz c = new C0251Cz(5);
    public static final C0251Cz d = new C0251Cz(6);

    public static void a(long j, C6129nj c6129nj, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        C6129nj c6129nj2;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((C0674Ik) arrayList.get(i9)).c() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0674Ik c0674Ik = (C0674Ik) arrayList.get(i2);
        C0674Ik c0674Ik2 = (C0674Ik) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == c0674Ik.c()) {
            int iIntValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            C0674Ik c0674Ik3 = (C0674Ik) arrayList.get(i11);
            i4 = i11;
            i5 = iIntValue;
            c0674Ik = c0674Ik3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c0674Ik.f(i8) == c0674Ik2.f(i8)) {
            int iMin = Math.min(c0674Ik.c(), c0674Ik2.c());
            int i12 = 0;
            for (int i13 = i8; i13 < iMin && c0674Ik.f(i13) == c0674Ik2.f(i13); i13++) {
                i12++;
            }
            long j2 = 4;
            long j3 = (c6129nj.b / j2) + j + 2 + i12 + 1;
            c6129nj.u0(-i12);
            c6129nj.u0(i5);
            int i14 = i12 + i8;
            while (i8 < i14) {
                c6129nj.u0(c0674Ik.f(i8) & KotlinVersion.MAX_COMPONENT_VALUE);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i14 != ((C0674Ik) arrayList.get(i4)).c()) {
                    throw new IllegalStateException("Check failed.");
                }
                c6129nj.u0(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                C6129nj c6129nj3 = new C6129nj();
                c6129nj.u0(((int) ((c6129nj3.b / j2) + j3)) * (-1));
                a(j3, c6129nj3, i14, arrayList, i4, i3, arrayList2);
                c6129nj.i(c6129nj3);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((C0674Ik) arrayList.get(i16 - 1)).f(i8) != ((C0674Ik) arrayList.get(i16)).f(i8)) {
                i15++;
            }
        }
        long j4 = 4;
        long j5 = (c6129nj.b / j4) + j + 2 + (i15 * 2);
        c6129nj.u0(i15);
        c6129nj.u0(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int iF = ((C0674Ik) arrayList.get(i17)).f(i8);
            if (i17 == i4 || iF != ((C0674Ik) arrayList.get(i17 - 1)).f(i8)) {
                c6129nj.u0(iF & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        C6129nj c6129nj4 = new C6129nj();
        int i18 = i4;
        while (i18 < i3) {
            byte bF = ((C0674Ik) arrayList.get(i18)).f(i8);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (bF != ((C0674Ik) arrayList.get(i20)).f(i8)) {
                        i6 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i6 && i8 + 1 == ((C0674Ik) arrayList.get(i18)).c()) {
                c6129nj.u0(((Number) arrayList2.get(i18)).intValue());
                i7 = i6;
                c6129nj2 = c6129nj4;
            } else {
                c6129nj.u0(((int) ((c6129nj4.b / j4) + j5)) * i10);
                i7 = i6;
                c6129nj2 = c6129nj4;
                a(j5, c6129nj4, i8 + 1, arrayList, i18, i6, arrayList2);
            }
            c6129nj4 = c6129nj2;
            i18 = i7;
            i10 = -1;
        }
        c6129nj.i(c6129nj4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x011d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C0717Iy0 b(defpackage.C0674Ik... r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IJ1.b(Ik[]):Iy0");
    }

    public static final void c(InterfaceC0173Bz interfaceC0173Bz, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof Z91)) {
            Object objJ = interfaceC0173Bz.j(null, c);
            O90.d(objJ, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC1705Vq.p(objJ);
            throw null;
        }
        Z91 z91 = (Z91) obj;
        V91[] v91Arr = z91.b;
        int length = v91Arr.length - 1;
        if (length < 0) {
            return;
        }
        V91 v91 = v91Arr[length];
        O90.c(null);
        Object obj2 = z91.a[length];
        throw null;
    }

    public static final Object d(InterfaceC0173Bz interfaceC0173Bz, Object obj) {
        if (obj == null) {
            obj = interfaceC0173Bz.j(0, b);
            O90.c(obj);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return interfaceC0173Bz.j(new Z91(((Number) obj).intValue(), interfaceC0173Bz), d);
        }
        AbstractC1705Vq.p(obj);
        throw null;
    }
}
