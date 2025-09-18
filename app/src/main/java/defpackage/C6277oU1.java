package defpackage;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.impl.C4473c9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* renamed from: oU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6277oU1 implements InterfaceC3404dV1 {
    public static final int[] i = new int[0];
    public static final Unsafe j = VV1.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final IP1 e;
    public final int[] f;
    public final int g;
    public final int h;

    public C6277oU1(int[] iArr, Object[] objArr, int i2, int i3, IP1 ip1, int[] iArr2, int i4, int i5, C4125hH1 c4125hH1) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        boolean z = ip1 instanceof AbstractC6843rS1;
        this.f = iArr2;
        this.g = i4;
        this.h = i5;
        this.e = ip1;
    }

    public static long A(long j2, Object obj) {
        return ((Long) VV1.o(j2, obj)).longValue();
    }

    public static boolean E(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC6843rS1) {
            return ((AbstractC6843rS1) obj).l();
        }
        return true;
    }

    public static Field m(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbX = F91.x("Field ", str, " for ", name, " not found. Known fields are ");
            sbX.append(string);
            throw new RuntimeException(sbX.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C6277oU1 n(defpackage.YU1 r31, defpackage.C4125hH1 r32) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6277oU1.n(YU1, hH1):oU1");
    }

    public static int v(long j2, Object obj) {
        return ((Integer) VV1.o(j2, obj)).intValue();
    }

    public static PV1 w(Object obj) {
        AbstractC6843rS1 abstractC6843rS1 = (AbstractC6843rS1) obj;
        PV1 pv1 = abstractC6843rS1.zzb;
        if (pv1 != PV1.f) {
            return pv1;
        }
        PV1 pv1E = PV1.e();
        abstractC6843rS1.zzb = pv1E;
        return pv1E;
    }

    public final IS1 B(int i2) {
        return (IS1) this.b[((i2 / 3) << 1) + 1];
    }

    public final InterfaceC3404dV1 C(int i2) {
        int i3 = (i2 / 3) << 1;
        Object[] objArr = this.b;
        InterfaceC3404dV1 interfaceC3404dV1 = (InterfaceC3404dV1) objArr[i3];
        if (interfaceC3404dV1 != null) {
            return interfaceC3404dV1;
        }
        InterfaceC3404dV1 interfaceC3404dV1A = TU1.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = interfaceC3404dV1A;
        return interfaceC3404dV1A;
    }

    public final Object D(int i2) {
        return this.b[(i2 / 3) << 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // defpackage.InterfaceC3404dV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.AbstractC6843rS1 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6277oU1.a(rS1, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    @Override // defpackage.InterfaceC3404dV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6277oU1.b(java.lang.Object):boolean");
    }

    @Override // defpackage.InterfaceC3404dV1
    public final void c(Object obj, byte[] bArr, int i2, int i3, VP1 vp1) {
        j(obj, bArr, i2, i3, 0, vp1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    @Override // defpackage.InterfaceC3404dV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = E(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof defpackage.AbstractC6843rS1
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            rS1 r0 = (defpackage.AbstractC6843rS1) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.h(r2)
            r0.zza = r1
            r0.k()
        L1a:
            int[] r0 = r7.a
            int r2 = r0.length
        L1d:
            if (r1 >= r2) goto L7c
            int r3 = r7.u(r1)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            r6 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r6
            int r3 = r3 >>> 20
            r6 = 9
            if (r3 == r6) goto L66
            r6 = 60
            if (r3 == r6) goto L50
            r6 = 68
            if (r3 == r6) goto L50
            switch(r3) {
                case 17: goto L66;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L79
        L3d:
            sun.misc.Unsafe r3 = defpackage.C6277oU1.j
            java.lang.Object r6 = r3.getObject(r8, r4)
            if (r6 == 0) goto L79
            defpackage.K22.f(r6)
            r3.putObject(r8, r4, r6)
            goto L79
        L4c:
            defpackage.J22.a(r4, r8)
            goto L79
        L50:
            r3 = r0[r1]
            boolean r3 = r7.x(r3, r1, r8)
            if (r3 == 0) goto L79
            dV1 r3 = r7.C(r1)
            sun.misc.Unsafe r6 = defpackage.C6277oU1.j
            java.lang.Object r4 = r6.getObject(r8, r4)
            r3.d(r4)
            goto L79
        L66:
            boolean r3 = r7.y(r1, r8)
            if (r3 == 0) goto L79
            dV1 r3 = r7.C(r1)
            sun.misc.Unsafe r6 = defpackage.C6277oU1.j
            java.lang.Object r4 = r6.getObject(r8, r4)
            r3.d(r4)
        L79:
            int r1 = r1 + 3
            goto L1d
        L7c:
            defpackage.C5396jt0.u(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6277oU1.d(java.lang.Object):void");
    }

    @Override // defpackage.InterfaceC3404dV1
    public final int e(AbstractC6843rS1 abstractC6843rS1) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iX;
        int iW;
        int iA;
        Unsafe unsafe = j;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i9 >= iArr.length) {
                return C5396jt0.r(C5396jt0.t(abstractC6843rS1)) + i10;
            }
            int iU = u(i9);
            int i11 = (267386880 & iU) >>> 20;
            int i12 = iArr[i9];
            int i13 = iArr[i9 + 2];
            int i14 = i13 & i6;
            if (i11 <= 17) {
                if (i14 != i7) {
                    i8 = i14 == i6 ? 0 : unsafe.getInt(abstractC6843rS1, i14);
                    i7 = i14;
                }
                i2 = i7;
                i3 = i8;
                i4 = 1 << (i13 >>> 20);
            } else {
                i2 = i7;
                i3 = i8;
                i4 = 0;
            }
            long j2 = iU & i6;
            if (i11 >= EnumC2519cS1.b.a()) {
                EnumC2519cS1.c.a();
            }
            switch (i11) {
                case 0:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.i(i12);
                        i10 += i5;
                        break;
                    }
                case 1:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.a(i12);
                        i10 += i5;
                        break;
                    }
                case 2:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.m(i12, unsafe.getLong(abstractC6843rS1, j2));
                        i10 += i5;
                        break;
                    }
                case 3:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.u(i12, unsafe.getLong(abstractC6843rS1, j2));
                        i10 += i5;
                        break;
                    }
                case 4:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.p(i12, unsafe.getInt(abstractC6843rS1, j2));
                        i10 += i5;
                        break;
                    }
                case 5:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.j(i12);
                        i10 += i5;
                        break;
                    }
                case 6:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.l(i12);
                        i10 += i5;
                        break;
                    }
                case 7:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.h(i12);
                        i10 += i5;
                        break;
                    }
                case 8:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC6843rS1, j2);
                        i5 = object instanceof JQ1 ? C3964gR1.e(i12, (JQ1) object) : C3964gR1.c(i12, (String) object);
                        i10 += i5;
                        break;
                    }
                case 9:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = BL1.b(i12, unsafe.getObject(abstractC6843rS1, j2), C(i9));
                        i10 += i5;
                        break;
                    }
                case 10:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.e(i12, (JQ1) unsafe.getObject(abstractC6843rS1, j2));
                        i10 += i5;
                        break;
                    }
                case 11:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.x(i12, unsafe.getInt(abstractC6843rS1, j2));
                        i10 += i5;
                        break;
                    }
                case 12:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.b(i12, unsafe.getInt(abstractC6843rS1, j2));
                        i10 += i5;
                        break;
                    }
                case 13:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.r(i12);
                        i10 += i5;
                        break;
                    }
                case 14:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.o(i12);
                        i10 += i5;
                        break;
                    }
                case 15:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.t(i12, unsafe.getInt(abstractC6843rS1, j2));
                        i10 += i5;
                        break;
                    }
                case 16:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.s(i12, unsafe.getLong(abstractC6843rS1, j2));
                        i10 += i5;
                        break;
                    }
                case 17:
                    if (!r(abstractC6843rS1, i9, i2, i3, i4)) {
                        break;
                    } else {
                        i5 = C3964gR1.d(i12, (IP1) unsafe.getObject(abstractC6843rS1, j2), C(i9));
                        i10 += i5;
                        break;
                    }
                case 18:
                    i5 = BL1.w(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 19:
                    i5 = BL1.t(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 20:
                    i5 = BL1.C(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 21:
                    i5 = BL1.O(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 22:
                    i5 = BL1.z(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 23:
                    i5 = BL1.w(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 24:
                    i5 = BL1.t(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 25:
                    i5 = BL1.c(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 26:
                    i5 = BL1.s(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 27:
                    i5 = BL1.n(i12, (List) unsafe.getObject(abstractC6843rS1, j2), C(i9));
                    i10 += i5;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    i5 = BL1.l(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 29:
                    i5 = BL1.L(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 30:
                    i5 = BL1.m(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 31:
                    i5 = BL1.t(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 32:
                    i5 = BL1.w(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 33:
                    i5 = BL1.F(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case 34:
                    i5 = BL1.I(i12, (List) unsafe.getObject(abstractC6843rS1, j2));
                    i10 += i5;
                    break;
                case C4473c9.J /* 35 */:
                    iX = BL1.x((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    iX = BL1.u((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case 37:
                    iX = BL1.D((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case C4473c9.K /* 38 */:
                    iX = BL1.P((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case 39:
                    iX = BL1.A((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case C4473c9.L /* 40 */:
                    iX = BL1.x((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case 41:
                    iX = BL1.u((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case C4473c9.M /* 42 */:
                    iX = BL1.e((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case 43:
                    iX = BL1.M((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case 44:
                    iX = BL1.o((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case 45:
                    iX = BL1.u((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case 46:
                    iX = BL1.x((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case 47:
                    iX = BL1.G((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case 48:
                    iX = BL1.J((List) unsafe.getObject(abstractC6843rS1, j2));
                    if (iX <= 0) {
                        break;
                    } else {
                        iW = C3964gR1.w(i12);
                        iA = C3964gR1.A(iX);
                        i10 += iA + iW + iX;
                        break;
                    }
                case 49:
                    i5 = BL1.d(i12, (List) unsafe.getObject(abstractC6843rS1, j2), C(i9));
                    i10 += i5;
                    break;
                case 50:
                    K22.d(unsafe.getObject(abstractC6843rS1, j2), D(i9));
                    break;
                case 51:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.i(i12);
                        i10 += i5;
                        break;
                    }
                case 52:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.a(i12);
                        i10 += i5;
                        break;
                    }
                case 53:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.m(i12, A(j2, abstractC6843rS1));
                        i10 += i5;
                        break;
                    }
                case 54:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.u(i12, A(j2, abstractC6843rS1));
                        i10 += i5;
                        break;
                    }
                case 55:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.p(i12, v(j2, abstractC6843rS1));
                        i10 += i5;
                        break;
                    }
                case 56:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.j(i12);
                        i10 += i5;
                        break;
                    }
                case 57:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.l(i12);
                        i10 += i5;
                        break;
                    }
                case 58:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.h(i12);
                        i10 += i5;
                        break;
                    }
                case 59:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(abstractC6843rS1, j2);
                        i5 = object2 instanceof JQ1 ? C3964gR1.e(i12, (JQ1) object2) : C3964gR1.c(i12, (String) object2);
                        i10 += i5;
                        break;
                    }
                case 60:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = BL1.b(i12, unsafe.getObject(abstractC6843rS1, j2), C(i9));
                        i10 += i5;
                        break;
                    }
                case 61:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.e(i12, (JQ1) unsafe.getObject(abstractC6843rS1, j2));
                        i10 += i5;
                        break;
                    }
                case 62:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.x(i12, v(j2, abstractC6843rS1));
                        i10 += i5;
                        break;
                    }
                case 63:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.b(i12, v(j2, abstractC6843rS1));
                        i10 += i5;
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.r(i12);
                        i10 += i5;
                        break;
                    }
                case 65:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.o(i12);
                        i10 += i5;
                        break;
                    }
                case 66:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.t(i12, v(j2, abstractC6843rS1));
                        i10 += i5;
                        break;
                    }
                case 67:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.s(i12, A(j2, abstractC6843rS1));
                        i10 += i5;
                        break;
                    }
                case 68:
                    if (!x(i12, i9, abstractC6843rS1)) {
                        break;
                    } else {
                        i5 = C3964gR1.d(i12, (IP1) unsafe.getObject(abstractC6843rS1, j2), C(i9));
                        i10 += i5;
                        break;
                    }
            }
            i9 += 3;
            i7 = i2;
            i8 = i3;
            i6 = 1048575;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[PHI: r3
  0x00d8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01fd, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC3404dV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.AbstractC6843rS1 r12) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6277oU1.f(rS1):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.InterfaceC3404dV1
    public final void g(Object obj, C6446pN0 c6446pN0) throws C6353ou {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        boolean z;
        C6277oU1 c6277oU1 = this;
        c6446pN0.getClass();
        int[] iArr2 = c6277oU1.a;
        int length = iArr2.length;
        Unsafe unsafe = j;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i10 < length) {
            int iU = c6277oU1.u(i10);
            int i11 = iArr2[i10];
            int i12 = (267386880 & iU) >>> 20;
            if (i12 <= 17) {
                int i13 = iArr2[i10 + 2];
                int i14 = i13 & i7;
                if (i14 != i8) {
                    i9 = i14 == i7 ? 0 : unsafe.getInt(obj, i14);
                    i8 = i14;
                }
                i2 = i8;
                i3 = i9;
                i4 = 1 << (i13 >>> 20);
            } else {
                i2 = i8;
                i3 = i9;
                i4 = 0;
            }
            long j2 = iU & i7;
            C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
            switch (i12) {
                case 0:
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    if (r(obj, i10, i6, i3, i4)) {
                        c6446pN0.s(i11, VV1.a(j2, obj));
                    }
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 1:
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    if (r(obj, i10, i6, i3, i4)) {
                        c6446pN0.q(VV1.g(j2, obj), i11);
                    }
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 2:
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    if (r(obj, i10, i6, i3, i4)) {
                        c6446pN0.B(i11, unsafe.getLong(obj, j2));
                    }
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 3:
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    if (r(obj, i10, i6, i3, i4)) {
                        c6446pN0.I(i11, unsafe.getLong(obj, j2));
                    }
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 4:
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    if (r(obj, i10, i6, i3, i4)) {
                        c6446pN0.D(i11, unsafe.getInt(obj, j2));
                    }
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 5:
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    if (r(obj, i10, i6, i3, i4)) {
                        c6446pN0.w(i11, unsafe.getLong(obj, j2));
                    }
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 6:
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    if (r(obj, i10, i6, i3, i4)) {
                        c6446pN0.A(i11, unsafe.getInt(obj, j2));
                    }
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 7:
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    if (r(obj, i10, i6, i3, i4)) {
                        c6446pN0.z(i11, VV1.p(j2, obj));
                    }
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 8:
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    if (r(obj, i10, i2, i3, i4)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            String str = (String) object;
                            c3964gR1.H(i11, 2);
                            int i15 = c3964gR1.e;
                            try {
                                int iA = C3964gR1.A(str.length() * 3);
                                int iA2 = C3964gR1.A(str.length());
                                byte[] bArr = c3964gR1.c;
                                if (iA2 == iA) {
                                    int i16 = i15 + iA2;
                                    c3964gR1.e = i16;
                                    int iB = AbstractC4170hW1.b(str, bArr, i16, c3964gR1.k());
                                    c3964gR1.e = i15;
                                    c3964gR1.I((iB - i15) - iA2);
                                    c3964gR1.e = iB;
                                } else {
                                    c3964gR1.I(AbstractC4170hW1.a(str));
                                    c3964gR1.e = AbstractC4170hW1.b(str, bArr, c3964gR1.e, c3964gR1.k());
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new C6353ou(e);
                            } catch (C5710lW1 e2) {
                                c3964gR1.e = i15;
                                C3964gR1.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                                byte[] bytes = str.getBytes(BS1.a);
                                try {
                                    c3964gR1.I(bytes.length);
                                    c3964gR1.q(bytes, 0, bytes.length);
                                } catch (IndexOutOfBoundsException e3) {
                                    throw new C6353ou(e3);
                                }
                            }
                        } else {
                            c6446pN0.y(i11, (JQ1) object);
                        }
                    }
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 9:
                    iArr = iArr2;
                    i5 = length;
                    if (r(obj, i10, i2, i3, i4)) {
                        c6446pN0.C(i11, unsafe.getObject(obj, j2), c6277oU1.C(i10));
                    }
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 10:
                    iArr = iArr2;
                    i5 = length;
                    if (r(obj, i10, i2, i3, i4)) {
                        c6446pN0.y(i11, (JQ1) unsafe.getObject(obj, j2));
                    }
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 11:
                    iArr = iArr2;
                    i5 = length;
                    if (r(obj, i10, i2, i3, i4)) {
                        c6446pN0.J(i11, unsafe.getInt(obj, j2));
                    }
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 12:
                    iArr = iArr2;
                    i5 = length;
                    if (r(obj, i10, i2, i3, i4)) {
                        c6446pN0.v(i11, unsafe.getInt(obj, j2));
                    }
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 13:
                    iArr = iArr2;
                    i5 = length;
                    if (r(obj, i10, i2, i3, i4)) {
                        c6446pN0.F(i11, unsafe.getInt(obj, j2));
                    }
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 14:
                    iArr = iArr2;
                    i5 = length;
                    if (r(obj, i10, i2, i3, i4)) {
                        c6446pN0.E(i11, unsafe.getLong(obj, j2));
                    }
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 15:
                    iArr = iArr2;
                    i5 = length;
                    if (r(obj, i10, i2, i3, i4)) {
                        c6446pN0.H(i11, unsafe.getInt(obj, j2));
                    }
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 16:
                    iArr = iArr2;
                    i5 = length;
                    if (r(obj, i10, i2, i3, i4)) {
                        c6446pN0.G(i11, unsafe.getLong(obj, j2));
                    }
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 17:
                    iArr = iArr2;
                    i5 = length;
                    if (r(obj, i10, i2, i3, i4)) {
                        c6446pN0.x(i11, unsafe.getObject(obj, j2), c6277oU1.C(i10));
                    }
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 18:
                    z = false;
                    BL1.r(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 19:
                    z = false;
                    BL1.E(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 20:
                    z = false;
                    BL1.K(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 21:
                    z = false;
                    BL1.U(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 22:
                    z = false;
                    BL1.H(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 23:
                    z = false;
                    BL1.B(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 24:
                    z = false;
                    BL1.y(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 25:
                    z = false;
                    BL1.h(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 26:
                    BL1.p(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 27:
                    BL1.q(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, c6277oU1.C(i10));
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    BL1.f(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 29:
                    z = false;
                    BL1.T(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 30:
                    z = false;
                    BL1.v(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 31:
                    z = false;
                    BL1.N(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 32:
                    z = false;
                    BL1.Q(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 33:
                    z = false;
                    BL1.R(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 34:
                    z = false;
                    BL1.S(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, false);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case C4473c9.J /* 35 */:
                    BL1.r(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    BL1.E(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 37:
                    BL1.K(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case C4473c9.K /* 38 */:
                    BL1.U(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 39:
                    BL1.H(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case C4473c9.L /* 40 */:
                    BL1.B(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 41:
                    BL1.y(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case C4473c9.M /* 42 */:
                    BL1.h(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 43:
                    BL1.T(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 44:
                    BL1.v(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 45:
                    BL1.N(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 46:
                    BL1.Q(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 47:
                    BL1.R(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 48:
                    BL1.S(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, true);
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 49:
                    BL1.g(iArr2[i10], (List) unsafe.getObject(obj, j2), c6446pN0, c6277oU1.C(i10));
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        K22.c(c6277oU1.D(i10));
                        throw null;
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 51:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.s(i11, ((Double) VV1.o(j2, obj)).doubleValue());
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 52:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.q(((Float) VV1.o(j2, obj)).floatValue(), i11);
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 53:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.B(i11, A(j2, obj));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 54:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.I(i11, A(j2, obj));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 55:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.D(i11, v(j2, obj));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 56:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.w(i11, A(j2, obj));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 57:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.A(i11, v(j2, obj));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 58:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.z(i11, ((Boolean) VV1.o(j2, obj)).booleanValue());
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 59:
                    if (c6277oU1.x(i11, i10, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof String) {
                            String str2 = (String) object2;
                            c3964gR1.H(i11, 2);
                            int i17 = c3964gR1.e;
                            try {
                                int iA3 = C3964gR1.A(str2.length() * 3);
                                int iA4 = C3964gR1.A(str2.length());
                                byte[] bArr2 = c3964gR1.c;
                                if (iA4 == iA3) {
                                    int i18 = i17 + iA4;
                                    c3964gR1.e = i18;
                                    int iB2 = AbstractC4170hW1.b(str2, bArr2, i18, c3964gR1.k());
                                    c3964gR1.e = i17;
                                    c3964gR1.I((iB2 - i17) - iA4);
                                    c3964gR1.e = iB2;
                                } else {
                                    c3964gR1.I(AbstractC4170hW1.a(str2));
                                    c3964gR1.e = AbstractC4170hW1.b(str2, bArr2, c3964gR1.e, c3964gR1.k());
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                throw new C6353ou(e4);
                            } catch (C5710lW1 e5) {
                                c3964gR1.e = i17;
                                C3964gR1.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
                                byte[] bytes2 = str2.getBytes(BS1.a);
                                try {
                                    c3964gR1.I(bytes2.length);
                                    c3964gR1.q(bytes2, 0, bytes2.length);
                                } catch (IndexOutOfBoundsException e6) {
                                    throw new C6353ou(e6);
                                }
                            }
                        } else {
                            c6446pN0.y(i11, (JQ1) object2);
                        }
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 60:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.C(i11, unsafe.getObject(obj, j2), c6277oU1.C(i10));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 61:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.y(i11, (JQ1) unsafe.getObject(obj, j2));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 62:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.J(i11, v(j2, obj));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 63:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.v(i11, v(j2, obj));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.F(i11, v(j2, obj));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 65:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.E(i11, A(j2, obj));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 66:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.H(i11, v(j2, obj));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 67:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.G(i11, A(j2, obj));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                case 68:
                    if (c6277oU1.x(i11, i10, obj)) {
                        c6446pN0.x(i11, unsafe.getObject(obj, j2), c6277oU1.C(i10));
                    }
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
                default:
                    iArr = iArr2;
                    i5 = length;
                    i6 = i2;
                    i10 += 3;
                    i7 = 1048575;
                    c6277oU1 = this;
                    i9 = i3;
                    iArr2 = iArr;
                    length = i5;
                    i8 = i6;
            }
        }
        ((AbstractC6843rS1) obj).zzb.d(c6446pN0);
    }

    @Override // defpackage.InterfaceC3404dV1
    public final void h(Object obj, Object obj2) {
        if (!E(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                BL1.j(obj, obj2);
                return;
            }
            int iU = u(i2);
            long j2 = iU & 1048575;
            int i3 = iArr[i2];
            switch ((iU & 267386880) >>> 20) {
                case 0:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        VV1.e(obj, j2, VV1.c.a(j2, obj2));
                        s(i2, obj);
                        break;
                    }
                case 1:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        VV1.f(obj, j2, VV1.c.i(j2, obj2));
                        s(i2, obj);
                        break;
                    }
                case 2:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        TV1 tv1 = VV1.c;
                        tv1.b(j2, tv1.m(j2, obj2), obj);
                        s(i2, obj);
                        break;
                    }
                case 3:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        TV1 tv12 = VV1.c;
                        tv12.b(j2, tv12.m(j2, obj2), obj);
                        s(i2, obj);
                        break;
                    }
                case 4:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        VV1.c(j2, obj, VV1.c.l(j2, obj2));
                        s(i2, obj);
                        break;
                    }
                case 5:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        TV1 tv13 = VV1.c;
                        tv13.b(j2, tv13.m(j2, obj2), obj);
                        s(i2, obj);
                        break;
                    }
                case 6:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        VV1.c(j2, obj, VV1.c.l(j2, obj2));
                        s(i2, obj);
                        break;
                    }
                case 7:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        VV1.l(obj, j2, VV1.c.k(j2, obj2));
                        s(i2, obj);
                        break;
                    }
                case 8:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        VV1.d(j2, obj, VV1.o(j2, obj2));
                        s(i2, obj);
                        break;
                    }
                case 9:
                    q(obj, obj2, i2);
                    break;
                case 10:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        VV1.d(j2, obj, VV1.o(j2, obj2));
                        s(i2, obj);
                        break;
                    }
                case 11:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        VV1.c(j2, obj, VV1.c.l(j2, obj2));
                        s(i2, obj);
                        break;
                    }
                case 12:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        VV1.c(j2, obj, VV1.c.l(j2, obj2));
                        s(i2, obj);
                        break;
                    }
                case 13:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        VV1.c(j2, obj, VV1.c.l(j2, obj2));
                        s(i2, obj);
                        break;
                    }
                case 14:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        TV1 tv14 = VV1.c;
                        tv14.b(j2, tv14.m(j2, obj2), obj);
                        s(i2, obj);
                        break;
                    }
                case 15:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        VV1.c(j2, obj, VV1.c.l(j2, obj2));
                        s(i2, obj);
                        break;
                    }
                case 16:
                    if (!y(i2, obj2)) {
                        break;
                    } else {
                        TV1 tv15 = VV1.c;
                        tv15.b(j2, tv15.m(j2, obj2), obj);
                        s(i2, obj);
                        break;
                    }
                case 17:
                    q(obj, obj2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case C4473c9.J /* 35 */:
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                case 37:
                case C4473c9.K /* 38 */:
                case 39:
                case C4473c9.L /* 40 */:
                case 41:
                case C4473c9.M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    LS1 ls1A = (LS1) VV1.o(j2, obj);
                    LS1 ls1 = (LS1) VV1.o(j2, obj2);
                    int size = ls1A.size();
                    int size2 = ls1.size();
                    if (size > 0 && size2 > 0) {
                        if (!((RP1) ls1A).a) {
                            ls1A = ls1A.a(size2 + size);
                        }
                        ls1A.addAll(ls1);
                    }
                    if (size > 0) {
                        ls1 = ls1A;
                    }
                    VV1.d(j2, obj, ls1);
                    break;
                case 50:
                    VV1.d(j2, obj, K22.b(VV1.o(j2, obj), VV1.o(j2, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!x(i3, i2, obj2)) {
                        break;
                    } else {
                        VV1.d(j2, obj, VV1.o(j2, obj2));
                        VV1.c(iArr[i2 + 2] & 1048575, obj, i3);
                        break;
                    }
                case 60:
                    t(obj, i2, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case NativeMac.KEY_LENGTH /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (!x(i3, i2, obj2)) {
                        break;
                    } else {
                        VV1.d(j2, obj, VV1.o(j2, obj2));
                        VV1.c(iArr[i2 + 2] & 1048575, obj, i3);
                        break;
                    }
                case 68:
                    t(obj, i2, obj2);
                    break;
            }
            i2 += 3;
        }
    }

    public final int i(int i2, int i3) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:455:0x0bc0 A[PHI: r5 r9 r12 r13 r14 r21 r34
  0x0bc0: PHI (r5v79 int) = (r5v50 int), (r5v51 int), (r5v52 int), (r5v53 int), (r5v54 int), (r5v55 int), (r5v57 int), (r5v70 int), (r5v80 int) binds: [B:453:0x0bad, B:450:0x0b8c, B:447:0x0b68, B:444:0x0b47, B:441:0x0b26, B:438:0x0b04, B:430:0x0ad6, B:393:0x09cb, B:383:0x095f] A[DONT_GENERATE, DONT_INLINE]
  0x0bc0: PHI (r9v74 byte[]) = 
  (r9v50 byte[])
  (r9v51 byte[])
  (r9v52 byte[])
  (r9v53 byte[])
  (r9v54 byte[])
  (r9v55 byte[])
  (r9v57 byte[])
  (r9v66 byte[])
  (r9v75 byte[])
 binds: [B:453:0x0bad, B:450:0x0b8c, B:447:0x0b68, B:444:0x0b47, B:441:0x0b26, B:438:0x0b04, B:430:0x0ad6, B:393:0x09cb, B:383:0x095f] A[DONT_GENERATE, DONT_INLINE]
  0x0bc0: PHI (r12v81 VP1) = 
  (r12v56 VP1)
  (r12v57 VP1)
  (r12v58 VP1)
  (r12v59 VP1)
  (r12v60 VP1)
  (r12v61 VP1)
  (r12v63 VP1)
  (r12v72 VP1)
  (r12v82 VP1)
 binds: [B:453:0x0bad, B:450:0x0b8c, B:447:0x0b68, B:444:0x0b47, B:441:0x0b26, B:438:0x0b04, B:430:0x0ad6, B:393:0x09cb, B:383:0x095f] A[DONT_GENERATE, DONT_INLINE]
  0x0bc0: PHI (r13v70 int) = 
  (r13v44 int)
  (r13v45 int)
  (r13v46 int)
  (r13v47 int)
  (r13v48 int)
  (r13v49 int)
  (r13v51 int)
  (r13v60 int)
  (r13v71 int)
 binds: [B:453:0x0bad, B:450:0x0b8c, B:447:0x0b68, B:444:0x0b47, B:441:0x0b26, B:438:0x0b04, B:430:0x0ad6, B:393:0x09cb, B:383:0x095f] A[DONT_GENERATE, DONT_INLINE]
  0x0bc0: PHI (r14v65 oU1) = 
  (r14v41 oU1)
  (r14v42 oU1)
  (r14v43 oU1)
  (r14v44 oU1)
  (r14v45 oU1)
  (r14v46 oU1)
  (r14v48 oU1)
  (r14v57 oU1)
  (r14v66 oU1)
 binds: [B:453:0x0bad, B:450:0x0b8c, B:447:0x0b68, B:444:0x0b47, B:441:0x0b26, B:438:0x0b04, B:430:0x0ad6, B:393:0x09cb, B:383:0x095f] A[DONT_GENERATE, DONT_INLINE]
  0x0bc0: PHI (r21v43 int) = 
  (r21v26 int)
  (r21v27 int)
  (r21v28 int)
  (r21v29 int)
  (r21v30 int)
  (r21v31 int)
  (r21v33 int)
  (r21v40 int)
  (r21v44 int)
 binds: [B:453:0x0bad, B:450:0x0b8c, B:447:0x0b68, B:444:0x0b47, B:441:0x0b26, B:438:0x0b04, B:430:0x0ad6, B:393:0x09cb, B:383:0x095f] A[DONT_GENERATE, DONT_INLINE]
  0x0bc0: PHI (r34v28 sun.misc.Unsafe) = 
  (r34v9 sun.misc.Unsafe)
  (r34v10 sun.misc.Unsafe)
  (r34v11 sun.misc.Unsafe)
  (r34v12 sun.misc.Unsafe)
  (r34v13 sun.misc.Unsafe)
  (r34v14 sun.misc.Unsafe)
  (r34v16 sun.misc.Unsafe)
  (r34v22 sun.misc.Unsafe)
  (r34v29 sun.misc.Unsafe)
 binds: [B:453:0x0bad, B:450:0x0b8c, B:447:0x0b68, B:444:0x0b47, B:441:0x0b26, B:438:0x0b04, B:430:0x0ad6, B:393:0x09cb, B:383:0x095f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0bc3  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0bcc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x08ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x08de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, defpackage.VP1 r42) {
        /*
            Method dump skipped, instructions count: 3336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6277oU1.j(java.lang.Object, byte[], int, int, int, VP1):int");
    }

    public final Object k(int i2, int i3, Object obj) {
        InterfaceC3404dV1 interfaceC3404dV1C = C(i3);
        if (!x(i2, i3, obj)) {
            return interfaceC3404dV1C.zza();
        }
        Object object = j.getObject(obj, u(i3) & 1048575);
        if (E(object)) {
            return object;
        }
        AbstractC6843rS1 abstractC6843rS1Zza = interfaceC3404dV1C.zza();
        if (object != null) {
            interfaceC3404dV1C.h(abstractC6843rS1Zza, object);
        }
        return abstractC6843rS1Zza;
    }

    public final Object l(int i2, Object obj) {
        InterfaceC3404dV1 interfaceC3404dV1C = C(i2);
        long jU = u(i2) & 1048575;
        if (!y(i2, obj)) {
            return interfaceC3404dV1C.zza();
        }
        Object object = j.getObject(obj, jU);
        if (E(object)) {
            return object;
        }
        AbstractC6843rS1 abstractC6843rS1Zza = interfaceC3404dV1C.zza();
        if (object != null) {
            interfaceC3404dV1C.h(abstractC6843rS1Zza, object);
        }
        return abstractC6843rS1Zza;
    }

    public final void o(Object obj, int i2, Object obj2) {
        j.putObject(obj, u(i2) & 1048575, obj2);
        s(i2, obj);
    }

    public final void p(Object obj, int i2, Object obj2, int i3) {
        j.putObject(obj, u(i3) & 1048575, obj2);
        VV1.c(this.a[i3 + 2] & 1048575, obj, i2);
    }

    public final void q(Object obj, Object obj2, int i2) {
        if (y(i2, obj2)) {
            long jU = u(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, jU);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i2] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC3404dV1 interfaceC3404dV1C = C(i2);
            if (!y(i2, obj)) {
                if (E(object)) {
                    AbstractC6843rS1 abstractC6843rS1Zza = interfaceC3404dV1C.zza();
                    interfaceC3404dV1C.h(abstractC6843rS1Zza, object);
                    unsafe.putObject(obj, jU, abstractC6843rS1Zza);
                } else {
                    unsafe.putObject(obj, jU, object);
                }
                s(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jU);
            if (!E(object2)) {
                AbstractC6843rS1 abstractC6843rS1Zza2 = interfaceC3404dV1C.zza();
                interfaceC3404dV1C.h(abstractC6843rS1Zza2, object2);
                unsafe.putObject(obj, jU, abstractC6843rS1Zza2);
                object2 = abstractC6843rS1Zza2;
            }
            interfaceC3404dV1C.h(object2, object);
        }
    }

    public final boolean r(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? y(i2, obj) : (i4 & i5) != 0;
    }

    public final void s(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        VV1.c(j2, obj, (1 << (i3 >>> 20)) | VV1.c.l(j2, obj));
    }

    public final void t(Object obj, int i2, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (x(i3, i2, obj2)) {
            long jU = u(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, jU);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC3404dV1 interfaceC3404dV1C = C(i2);
            if (!x(i3, i2, obj)) {
                if (E(object)) {
                    AbstractC6843rS1 abstractC6843rS1Zza = interfaceC3404dV1C.zza();
                    interfaceC3404dV1C.h(abstractC6843rS1Zza, object);
                    unsafe.putObject(obj, jU, abstractC6843rS1Zza);
                } else {
                    unsafe.putObject(obj, jU, object);
                }
                VV1.c(iArr[i2 + 2] & 1048575, obj, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, jU);
            if (!E(object2)) {
                AbstractC6843rS1 abstractC6843rS1Zza2 = interfaceC3404dV1C.zza();
                interfaceC3404dV1C.h(abstractC6843rS1Zza2, object2);
                unsafe.putObject(obj, jU, abstractC6843rS1Zza2);
                object2 = abstractC6843rS1Zza2;
            }
            interfaceC3404dV1C.h(object2, object);
        }
    }

    public final int u(int i2) {
        return this.a[i2 + 1];
    }

    public final boolean x(int i2, int i3, Object obj) {
        return VV1.c.l((long) (this.a[i3 + 2] & 1048575), obj) == i2;
    }

    public final boolean y(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & VV1.c.l(j2, obj)) != 0;
        }
        int iU = u(i2);
        long j3 = iU & 1048575;
        switch ((iU & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(VV1.c.a(j3, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(VV1.c.i(j3, obj)) != 0;
            case 2:
                return VV1.c.m(j3, obj) != 0;
            case 3:
                return VV1.c.m(j3, obj) != 0;
            case 4:
                return VV1.c.l(j3, obj) != 0;
            case 5:
                return VV1.c.m(j3, obj) != 0;
            case 6:
                return VV1.c.l(j3, obj) != 0;
            case 7:
                return VV1.c.k(j3, obj);
            case 8:
                Object objO = VV1.o(j3, obj);
                if (objO instanceof String) {
                    return !((String) objO).isEmpty();
                }
                if (objO instanceof JQ1) {
                    return !JQ1.c.equals(objO);
                }
                throw new IllegalArgumentException();
            case 9:
                return VV1.o(j3, obj) != null;
            case 10:
                return !JQ1.c.equals(VV1.o(j3, obj));
            case 11:
                return VV1.c.l(j3, obj) != 0;
            case 12:
                return VV1.c.l(j3, obj) != 0;
            case 13:
                return VV1.c.l(j3, obj) != 0;
            case 14:
                return VV1.c.m(j3, obj) != 0;
            case 15:
                return VV1.c.l(j3, obj) != 0;
            case 16:
                return VV1.c.m(j3, obj) != 0;
            case 17:
                return VV1.o(j3, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean z(AbstractC6843rS1 abstractC6843rS1, Object obj, int i2) {
        return y(i2, abstractC6843rS1) == y(i2, obj);
    }

    @Override // defpackage.InterfaceC3404dV1
    public final AbstractC6843rS1 zza() {
        return (AbstractC6843rS1) ((AbstractC6843rS1) this.e).d(4);
    }
}
