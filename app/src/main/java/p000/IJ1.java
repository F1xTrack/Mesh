package p000;

import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class IJ1 {

    /* renamed from: a */
    public static final C7190yG f4892a = new C7190yG("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final C0188Cz f4893b = new C0188Cz(4);

    /* renamed from: c */
    public static final C0188Cz f4894c = new C0188Cz(5);

    /* renamed from: d */
    public static final C0188Cz f4895d = new C0188Cz(6);

    /* renamed from: a */
    public static void m3814a(long j, C6507nj c6507nj, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        C6507nj c6507nj2;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((C0551Ik) arrayList.get(i9)).mo3983c() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0551Ik c0551Ik = (C0551Ik) arrayList.get(i2);
        C0551Ik c0551Ik2 = (C0551Ik) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == c0551Ik.mo3983c()) {
            int iIntValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            C0551Ik c0551Ik3 = (C0551Ik) arrayList.get(i11);
            i4 = i11;
            i5 = iIntValue;
            c0551Ik = c0551Ik3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c0551Ik.mo3986f(i8) == c0551Ik2.mo3986f(i8)) {
            int iMin = Math.min(c0551Ik.mo3983c(), c0551Ik2.mo3983c());
            int i12 = 0;
            for (int i13 = i8; i13 < iMin && c0551Ik.mo3986f(i13) == c0551Ik2.mo3986f(i13); i13++) {
                i12++;
            }
            long j2 = 4;
            long j3 = (c6507nj.f38488b / j2) + j + 2 + i12 + 1;
            c6507nj.m23198u0(-i12);
            c6507nj.m23198u0(i5);
            int i14 = i12 + i8;
            while (i8 < i14) {
                c6507nj.m23198u0(c0551Ik.mo3986f(i8) & KotlinVersion.MAX_COMPONENT_VALUE);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i14 != ((C0551Ik) arrayList.get(i4)).mo3983c()) {
                    throw new IllegalStateException("Check failed.");
                }
                c6507nj.m23198u0(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                C6507nj c6507nj3 = new C6507nj();
                c6507nj.m23198u0(((int) ((c6507nj3.f38488b / j2) + j3)) * (-1));
                m3814a(j3, c6507nj3, i14, arrayList, i4, i3, arrayList2);
                c6507nj.mo4396i(c6507nj3);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((C0551Ik) arrayList.get(i16 - 1)).mo3986f(i8) != ((C0551Ik) arrayList.get(i16)).mo3986f(i8)) {
                i15++;
            }
        }
        long j4 = 4;
        long j5 = (c6507nj.f38488b / j4) + j + 2 + (i15 * 2);
        c6507nj.m23198u0(i15);
        c6507nj.m23198u0(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int iMo3986f = ((C0551Ik) arrayList.get(i17)).mo3986f(i8);
            if (i17 == i4 || iMo3986f != ((C0551Ik) arrayList.get(i17 - 1)).mo3986f(i8)) {
                c6507nj.m23198u0(iMo3986f & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        C6507nj c6507nj4 = new C6507nj();
        int i18 = i4;
        while (i18 < i3) {
            byte bMo3986f = ((C0551Ik) arrayList.get(i18)).mo3986f(i8);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (bMo3986f != ((C0551Ik) arrayList.get(i20)).mo3986f(i8)) {
                        i6 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i6 && i8 + 1 == ((C0551Ik) arrayList.get(i18)).mo3983c()) {
                c6507nj.m23198u0(((Number) arrayList2.get(i18)).intValue());
                i7 = i6;
                c6507nj2 = c6507nj4;
            } else {
                c6507nj.m23198u0(((int) ((c6507nj4.f38488b / j4) + j5)) * i10);
                i7 = i6;
                c6507nj2 = c6507nj4;
                m3814a(j5, c6507nj4, i8 + 1, arrayList, i18, i6, arrayList2);
            }
            c6507nj4 = c6507nj2;
            i18 = i7;
            i10 = -1;
        }
        c6507nj.mo4396i(c6507nj4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x011d, code lost:
    
        continue;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C7778Iy0 m3815b(p000.C0551Ik... r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.IJ1.m3815b(Ik[]):Iy0");
    }

    /* renamed from: c */
    public static final void m3816c(InterfaceC0125Bz interfaceC0125Bz, Object obj) {
        if (obj == f4892a) {
            return;
        }
        if (!(obj instanceof Z91)) {
            Object objMo938j = interfaceC0125Bz.mo938j(null, f4894c);
            O90.m5966d(objMo938j, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC1374Vq.m8597p(objMo938j);
            throw null;
        }
        Z91 z91 = (Z91) obj;
        V91[] v91Arr = z91.f14762b;
        int length = v91Arr.length - 1;
        if (length < 0) {
            return;
        }
        V91 v91 = v91Arr[length];
        O90.m5965c(null);
        Object obj2 = z91.f14761a[length];
        throw null;
    }

    /* renamed from: d */
    public static final Object m3817d(InterfaceC0125Bz interfaceC0125Bz, Object obj) {
        if (obj == null) {
            obj = interfaceC0125Bz.mo938j(0, f4893b);
            O90.m5965c(obj);
        }
        if (obj == 0) {
            return f4892a;
        }
        if (obj instanceof Integer) {
            return interfaceC0125Bz.mo938j(new Z91(((Number) obj).intValue(), interfaceC0125Bz), f4895d);
        }
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }
}
