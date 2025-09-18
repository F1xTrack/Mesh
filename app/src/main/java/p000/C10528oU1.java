package p000;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.appmetrica.analytics.impl.C5043c9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* renamed from: oU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10528oU1 implements InterfaceC9122dV1 {

    /* renamed from: i */
    public static final int[] f39028i = new int[0];

    /* renamed from: j */
    public static final Unsafe f39029j = VV1.m8452i();

    /* renamed from: a */
    public final int[] f39030a;

    /* renamed from: b */
    public final Object[] f39031b;

    /* renamed from: c */
    public final int f39032c;

    /* renamed from: d */
    public final int f39033d;

    /* renamed from: e */
    public final IP1 f39034e;

    /* renamed from: f */
    public final int[] f39035f;

    /* renamed from: g */
    public final int f39036g;

    /* renamed from: h */
    public final int f39037h;

    public C10528oU1(int[] iArr, Object[] objArr, int i, int i2, IP1 ip1, int[] iArr2, int i3, int i4, C9606hH1 c9606hH1) {
        this.f39030a = iArr;
        this.f39031b = objArr;
        this.f39032c = i;
        this.f39033d = i2;
        boolean z = ip1 instanceof AbstractC10908rS1;
        this.f39035f = iArr2;
        this.f39036g = i3;
        this.f39037h = i4;
        this.f39034e = ip1;
    }

    /* renamed from: A */
    public static long m23471A(long j, Object obj) {
        return ((Long) VV1.m8458o(j, obj)).longValue();
    }

    /* renamed from: E */
    public static boolean m23472E(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC10908rS1) {
            return ((AbstractC10908rS1) obj).m24349l();
        }
        return true;
    }

    /* renamed from: m */
    public static Field m23473m(Class cls, String str) {
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
            StringBuilder sbM2541x = F91.m2541x("Field ", str, " for ", name, " not found. Known fields are ");
            sbM2541x.append(string);
            throw new RuntimeException(sbM2541x.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0282  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C10528oU1 m23474n(p000.YU1 r31, p000.C9606hH1 r32) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10528oU1.m23474n(YU1, hH1):oU1");
    }

    /* renamed from: v */
    public static int m23475v(long j, Object obj) {
        return ((Integer) VV1.m8458o(j, obj)).intValue();
    }

    /* renamed from: w */
    public static PV1 m23476w(Object obj) {
        AbstractC10908rS1 abstractC10908rS1 = (AbstractC10908rS1) obj;
        PV1 pv1 = abstractC10908rS1.zzb;
        if (pv1 != PV1.f9096f) {
            return pv1;
        }
        PV1 pv1M6377e = PV1.m6377e();
        abstractC10908rS1.zzb = pv1M6377e;
        return pv1M6377e;
    }

    /* renamed from: B */
    public final IS1 m23477B(int i) {
        return (IS1) this.f39031b[((i / 3) << 1) + 1];
    }

    /* renamed from: C */
    public final InterfaceC9122dV1 m23478C(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.f39031b;
        InterfaceC9122dV1 interfaceC9122dV1 = (InterfaceC9122dV1) objArr[i2];
        if (interfaceC9122dV1 != null) {
            return interfaceC9122dV1;
        }
        InterfaceC9122dV1 interfaceC9122dV1M7696a = TU1.f11400c.m7696a((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC9122dV1M7696a;
        return interfaceC9122dV1M7696a;
    }

    /* renamed from: D */
    public final Object m23479D(int i) {
        return this.f39031b[(i / 3) << 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // p000.InterfaceC9122dV1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo17693a(p000.AbstractC10908rS1 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10528oU1.mo17693a(rS1, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    @Override // p000.InterfaceC9122dV1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo17694b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10528oU1.mo17694b(java.lang.Object):boolean");
    }

    @Override // p000.InterfaceC9122dV1
    /* renamed from: c */
    public final void mo17695c(Object obj, byte[] bArr, int i, int i2, VP1 vp1) {
        m23481j(obj, bArr, i, i2, 0, vp1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    @Override // p000.InterfaceC9122dV1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo17696d(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = m23472E(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof p000.AbstractC10908rS1
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            rS1 r0 = (p000.AbstractC10908rS1) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.m24345h(r2)
            r0.zza = r1
            r0.m24348k()
        L1a:
            int[] r0 = r7.f39030a
            int r2 = r0.length
        L1d:
            if (r1 >= r2) goto L7c
            int r3 = r7.m23490u(r1)
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
            sun.misc.Unsafe r3 = p000.C10528oU1.f39029j
            java.lang.Object r6 = r3.getObject(r8, r4)
            if (r6 == 0) goto L79
            p000.K22.m4535f(r6)
            r3.putObject(r8, r4, r6)
            goto L79
        L4c:
            p000.J22.m4144a(r4, r8)
            goto L79
        L50:
            r3 = r0[r1]
            boolean r3 = r7.m23491x(r3, r1, r8)
            if (r3 == 0) goto L79
            dV1 r3 = r7.m23478C(r1)
            sun.misc.Unsafe r6 = p000.C10528oU1.f39029j
            java.lang.Object r4 = r6.getObject(r8, r4)
            r3.mo17696d(r4)
            goto L79
        L66:
            boolean r3 = r7.m23492y(r1, r8)
            if (r3 == 0) goto L79
            dV1 r3 = r7.m23478C(r1)
            sun.misc.Unsafe r6 = p000.C10528oU1.f39029j
            java.lang.Object r4 = r6.getObject(r8, r4)
            r3.mo17696d(r4)
        L79:
            int r1 = r1 + 3
            goto L1d
        L7c:
            p000.C9937jt0.m22117u(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10528oU1.mo17696d(java.lang.Object):void");
    }

    @Override // p000.InterfaceC9122dV1
    /* renamed from: e */
    public final int mo17697e(AbstractC10908rS1 abstractC10908rS1) {
        int i;
        int i2;
        int i3;
        int iM18530i;
        int iM691x;
        int iM18541w;
        int iM18522A;
        Unsafe unsafe = f39029j;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f39030a;
            if (i7 >= iArr.length) {
                return C9937jt0.m22115r(C9937jt0.m22116t(abstractC10908rS1)) + i8;
            }
            int iM23490u = m23490u(i7);
            int i9 = (267386880 & iM23490u) >>> 20;
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i4;
            if (i9 <= 17) {
                if (i12 != i5) {
                    i6 = i12 == i4 ? 0 : unsafe.getInt(abstractC10908rS1, i12);
                    i5 = i12;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = iM23490u & i4;
            if (i9 >= EnumC8983cS1.f17524b.m10699a()) {
                EnumC8983cS1.f17525c.m10699a();
            }
            switch (i9) {
                case 0:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18530i(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 1:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18523a(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 2:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18533m(i10, unsafe.getLong(abstractC10908rS1, j));
                        i8 += iM18530i;
                        break;
                    }
                case 3:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18539u(i10, unsafe.getLong(abstractC10908rS1, j));
                        i8 += iM18530i;
                        break;
                    }
                case 4:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18535p(i10, unsafe.getInt(abstractC10908rS1, j));
                        i8 += iM18530i;
                        break;
                    }
                case 5:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18531j(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 6:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18532l(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 7:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18529h(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 8:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC10908rS1, j);
                        iM18530i = object instanceof JQ1 ? C9498gR1.m18527e(i10, (JQ1) object) : C9498gR1.m18525c(i10, (String) object);
                        i8 += iM18530i;
                        break;
                    }
                case 9:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = BL1.m669b(i10, unsafe.getObject(abstractC10908rS1, j), m23478C(i7));
                        i8 += iM18530i;
                        break;
                    }
                case 10:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18527e(i10, (JQ1) unsafe.getObject(abstractC10908rS1, j));
                        i8 += iM18530i;
                        break;
                    }
                case 11:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18542x(i10, unsafe.getInt(abstractC10908rS1, j));
                        i8 += iM18530i;
                        break;
                    }
                case 12:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18524b(i10, unsafe.getInt(abstractC10908rS1, j));
                        i8 += iM18530i;
                        break;
                    }
                case 13:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18536r(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 14:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18534o(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 15:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18538t(i10, unsafe.getInt(abstractC10908rS1, j));
                        i8 += iM18530i;
                        break;
                    }
                case 16:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18537s(i10, unsafe.getLong(abstractC10908rS1, j));
                        i8 += iM18530i;
                        break;
                    }
                case 17:
                    if (!m23487r(abstractC10908rS1, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18526d(i10, (IP1) unsafe.getObject(abstractC10908rS1, j), m23478C(i7));
                        i8 += iM18530i;
                        break;
                    }
                case 18:
                    iM18530i = BL1.m690w(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 19:
                    iM18530i = BL1.m687t(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 20:
                    iM18530i = BL1.m649C(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 21:
                    iM18530i = BL1.m661O(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 22:
                    iM18530i = BL1.m693z(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 23:
                    iM18530i = BL1.m690w(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 24:
                    iM18530i = BL1.m687t(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 25:
                    iM18530i = BL1.m670c(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 26:
                    iM18530i = BL1.m686s(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 27:
                    iM18530i = BL1.m681n(i10, (List) unsafe.getObject(abstractC10908rS1, j), m23478C(i7));
                    i8 += iM18530i;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iM18530i = BL1.m679l(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 29:
                    iM18530i = BL1.m658L(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 30:
                    iM18530i = BL1.m680m(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 31:
                    iM18530i = BL1.m687t(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 32:
                    iM18530i = BL1.m690w(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 33:
                    iM18530i = BL1.m652F(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case 34:
                    iM18530i = BL1.m655I(i10, (List) unsafe.getObject(abstractC10908rS1, j));
                    i8 += iM18530i;
                    break;
                case C5043c9.f31374J /* 35 */:
                    iM691x = BL1.m691x((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    iM691x = BL1.m688u((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case 37:
                    iM691x = BL1.m650D((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case C5043c9.f31375K /* 38 */:
                    iM691x = BL1.m662P((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case 39:
                    iM691x = BL1.m647A((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case C5043c9.f31376L /* 40 */:
                    iM691x = BL1.m691x((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case 41:
                    iM691x = BL1.m688u((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case C5043c9.f31377M /* 42 */:
                    iM691x = BL1.m672e((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case 43:
                    iM691x = BL1.m659M((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case 44:
                    iM691x = BL1.m682o((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case 45:
                    iM691x = BL1.m688u((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case 46:
                    iM691x = BL1.m691x((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case 47:
                    iM691x = BL1.m653G((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case 48:
                    iM691x = BL1.m656J((List) unsafe.getObject(abstractC10908rS1, j));
                    if (iM691x <= 0) {
                        break;
                    } else {
                        iM18541w = C9498gR1.m18541w(i10);
                        iM18522A = C9498gR1.m18522A(iM691x);
                        i8 += iM18522A + iM18541w + iM691x;
                        break;
                    }
                case 49:
                    iM18530i = BL1.m671d(i10, (List) unsafe.getObject(abstractC10908rS1, j), m23478C(i7));
                    i8 += iM18530i;
                    break;
                case 50:
                    K22.m4533d(unsafe.getObject(abstractC10908rS1, j), m23479D(i7));
                    break;
                case 51:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18530i(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 52:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18523a(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 53:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18533m(i10, m23471A(j, abstractC10908rS1));
                        i8 += iM18530i;
                        break;
                    }
                case 54:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18539u(i10, m23471A(j, abstractC10908rS1));
                        i8 += iM18530i;
                        break;
                    }
                case 55:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18535p(i10, m23475v(j, abstractC10908rS1));
                        i8 += iM18530i;
                        break;
                    }
                case 56:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18531j(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 57:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18532l(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 58:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18529h(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 59:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(abstractC10908rS1, j);
                        iM18530i = object2 instanceof JQ1 ? C9498gR1.m18527e(i10, (JQ1) object2) : C9498gR1.m18525c(i10, (String) object2);
                        i8 += iM18530i;
                        break;
                    }
                case 60:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = BL1.m669b(i10, unsafe.getObject(abstractC10908rS1, j), m23478C(i7));
                        i8 += iM18530i;
                        break;
                    }
                case 61:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18527e(i10, (JQ1) unsafe.getObject(abstractC10908rS1, j));
                        i8 += iM18530i;
                        break;
                    }
                case 62:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18542x(i10, m23475v(j, abstractC10908rS1));
                        i8 += iM18530i;
                        break;
                    }
                case 63:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18524b(i10, m23475v(j, abstractC10908rS1));
                        i8 += iM18530i;
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18536r(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 65:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18534o(i10);
                        i8 += iM18530i;
                        break;
                    }
                case 66:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18538t(i10, m23475v(j, abstractC10908rS1));
                        i8 += iM18530i;
                        break;
                    }
                case 67:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18537s(i10, m23471A(j, abstractC10908rS1));
                        i8 += iM18530i;
                        break;
                    }
                case 68:
                    if (!m23491x(i10, i7, abstractC10908rS1)) {
                        break;
                    } else {
                        iM18530i = C9498gR1.m18526d(i10, (IP1) unsafe.getObject(abstractC10908rS1, j), m23478C(i7));
                        i8 += iM18530i;
                        break;
                    }
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[PHI: r3
  0x00d8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01fd, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.InterfaceC9122dV1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo17698f(p000.AbstractC10908rS1 r12) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10528oU1.mo17698f(rS1):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.InterfaceC9122dV1
    /* renamed from: g */
    public final void mo17699g(Object obj, C10641pN0 c10641pN0) throws C6583ou {
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        boolean z;
        C10528oU1 c10528oU1 = this;
        c10641pN0.getClass();
        int[] iArr2 = c10528oU1.f39030a;
        int length = iArr2.length;
        Unsafe unsafe = f39029j;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i9 < length) {
            int iM23490u = c10528oU1.m23490u(i9);
            int i10 = iArr2[i9];
            int i11 = (267386880 & iM23490u) >>> 20;
            if (i11 <= 17) {
                int i12 = iArr2[i9 + 2];
                int i13 = i12 & i6;
                if (i13 != i7) {
                    i8 = i13 == i6 ? 0 : unsafe.getInt(obj, i13);
                    i7 = i13;
                }
                i = i7;
                i2 = i8;
                i3 = 1 << (i12 >>> 20);
            } else {
                i = i7;
                i2 = i8;
                i3 = 0;
            }
            long j = iM23490u & i6;
            C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
            switch (i11) {
                case 0:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m23487r(obj, i9, i5, i2, i3)) {
                        c10641pN0.m23762s(i10, VV1.m8444a(j, obj));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 1:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m23487r(obj, i9, i5, i2, i3)) {
                        c10641pN0.m23761q(VV1.m8450g(j, obj), i10);
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 2:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m23487r(obj, i9, i5, i2, i3)) {
                        c10641pN0.m23748B(i10, unsafe.getLong(obj, j));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 3:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m23487r(obj, i9, i5, i2, i3)) {
                        c10641pN0.m23755I(i10, unsafe.getLong(obj, j));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 4:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m23487r(obj, i9, i5, i2, i3)) {
                        c10641pN0.m23750D(i10, unsafe.getInt(obj, j));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 5:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m23487r(obj, i9, i5, i2, i3)) {
                        c10641pN0.m23764w(i10, unsafe.getLong(obj, j));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 6:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m23487r(obj, i9, i5, i2, i3)) {
                        c10641pN0.m23747A(i10, unsafe.getInt(obj, j));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 7:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m23487r(obj, i9, i5, i2, i3)) {
                        c10641pN0.m23767z(i10, VV1.m8459p(j, obj));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 8:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m23487r(obj, i9, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            String str = (String) object;
                            c9498gR1.m18549H(i10, 2);
                            int i14 = c9498gR1.f27804e;
                            try {
                                int iM18522A = C9498gR1.m18522A(str.length() * 3);
                                int iM18522A2 = C9498gR1.m18522A(str.length());
                                byte[] bArr = c9498gR1.f27802c;
                                if (iM18522A2 == iM18522A) {
                                    int i15 = i14 + iM18522A2;
                                    c9498gR1.f27804e = i15;
                                    int iM18822b = AbstractC9636hW1.m18822b(str, bArr, i15, c9498gR1.m18553k());
                                    c9498gR1.f27804e = i14;
                                    c9498gR1.m18550I((iM18822b - i14) - iM18522A2);
                                    c9498gR1.f27804e = iM18822b;
                                } else {
                                    c9498gR1.m18550I(AbstractC9636hW1.m18821a(str));
                                    c9498gR1.f27804e = AbstractC9636hW1.m18822b(str, bArr, c9498gR1.f27804e, c9498gR1.m18553k());
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new C6583ou(e);
                            } catch (C10148lW1 e2) {
                                c9498gR1.f27804e = i14;
                                C9498gR1.f27799f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                                byte[] bytes = str.getBytes(BS1.f826a);
                                try {
                                    c9498gR1.m18550I(bytes.length);
                                    c9498gR1.m18555q(bytes, 0, bytes.length);
                                } catch (IndexOutOfBoundsException e3) {
                                    throw new C6583ou(e3);
                                }
                            }
                        } else {
                            c10641pN0.m23766y(i10, (JQ1) object);
                        }
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 9:
                    iArr = iArr2;
                    i4 = length;
                    if (m23487r(obj, i9, i, i2, i3)) {
                        c10641pN0.m23749C(i10, unsafe.getObject(obj, j), c10528oU1.m23478C(i9));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 10:
                    iArr = iArr2;
                    i4 = length;
                    if (m23487r(obj, i9, i, i2, i3)) {
                        c10641pN0.m23766y(i10, (JQ1) unsafe.getObject(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 11:
                    iArr = iArr2;
                    i4 = length;
                    if (m23487r(obj, i9, i, i2, i3)) {
                        c10641pN0.m23756J(i10, unsafe.getInt(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 12:
                    iArr = iArr2;
                    i4 = length;
                    if (m23487r(obj, i9, i, i2, i3)) {
                        c10641pN0.m23763v(i10, unsafe.getInt(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 13:
                    iArr = iArr2;
                    i4 = length;
                    if (m23487r(obj, i9, i, i2, i3)) {
                        c10641pN0.m23752F(i10, unsafe.getInt(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 14:
                    iArr = iArr2;
                    i4 = length;
                    if (m23487r(obj, i9, i, i2, i3)) {
                        c10641pN0.m23751E(i10, unsafe.getLong(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 15:
                    iArr = iArr2;
                    i4 = length;
                    if (m23487r(obj, i9, i, i2, i3)) {
                        c10641pN0.m23754H(i10, unsafe.getInt(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 16:
                    iArr = iArr2;
                    i4 = length;
                    if (m23487r(obj, i9, i, i2, i3)) {
                        c10641pN0.m23753G(i10, unsafe.getLong(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 17:
                    iArr = iArr2;
                    i4 = length;
                    if (m23487r(obj, i9, i, i2, i3)) {
                        c10641pN0.m23765x(i10, unsafe.getObject(obj, j), c10528oU1.m23478C(i9));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 18:
                    z = false;
                    BL1.m685r(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 19:
                    z = false;
                    BL1.m651E(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 20:
                    z = false;
                    BL1.m657K(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 21:
                    z = false;
                    BL1.m667U(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 22:
                    z = false;
                    BL1.m654H(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 23:
                    z = false;
                    BL1.m648B(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 24:
                    z = false;
                    BL1.m692y(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 25:
                    z = false;
                    BL1.m675h(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 26:
                    BL1.m683p(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 27:
                    BL1.m684q(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, c10528oU1.m23478C(i9));
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    BL1.m673f(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 29:
                    z = false;
                    BL1.m666T(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 30:
                    z = false;
                    BL1.m689v(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 31:
                    z = false;
                    BL1.m660N(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 32:
                    z = false;
                    BL1.m663Q(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 33:
                    z = false;
                    BL1.m664R(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 34:
                    z = false;
                    BL1.m665S(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case C5043c9.f31374J /* 35 */:
                    BL1.m685r(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    BL1.m651E(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 37:
                    BL1.m657K(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case C5043c9.f31375K /* 38 */:
                    BL1.m667U(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 39:
                    BL1.m654H(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case C5043c9.f31376L /* 40 */:
                    BL1.m648B(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 41:
                    BL1.m692y(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case C5043c9.f31377M /* 42 */:
                    BL1.m675h(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 43:
                    BL1.m666T(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 44:
                    BL1.m689v(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 45:
                    BL1.m660N(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 46:
                    BL1.m663Q(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 47:
                    BL1.m664R(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 48:
                    BL1.m665S(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 49:
                    BL1.m674g(iArr2[i9], (List) unsafe.getObject(obj, j), c10641pN0, c10528oU1.m23478C(i9));
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        K22.m4532c(c10528oU1.m23479D(i9));
                        throw null;
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 51:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23762s(i10, ((Double) VV1.m8458o(j, obj)).doubleValue());
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 52:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23761q(((Float) VV1.m8458o(j, obj)).floatValue(), i10);
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 53:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23748B(i10, m23471A(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 54:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23755I(i10, m23471A(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 55:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23750D(i10, m23475v(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 56:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23764w(i10, m23471A(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 57:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23747A(i10, m23475v(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 58:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23767z(i10, ((Boolean) VV1.m8458o(j, obj)).booleanValue());
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 59:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            String str2 = (String) object2;
                            c9498gR1.m18549H(i10, 2);
                            int i16 = c9498gR1.f27804e;
                            try {
                                int iM18522A3 = C9498gR1.m18522A(str2.length() * 3);
                                int iM18522A4 = C9498gR1.m18522A(str2.length());
                                byte[] bArr2 = c9498gR1.f27802c;
                                if (iM18522A4 == iM18522A3) {
                                    int i17 = i16 + iM18522A4;
                                    c9498gR1.f27804e = i17;
                                    int iM18822b2 = AbstractC9636hW1.m18822b(str2, bArr2, i17, c9498gR1.m18553k());
                                    c9498gR1.f27804e = i16;
                                    c9498gR1.m18550I((iM18822b2 - i16) - iM18522A4);
                                    c9498gR1.f27804e = iM18822b2;
                                } else {
                                    c9498gR1.m18550I(AbstractC9636hW1.m18821a(str2));
                                    c9498gR1.f27804e = AbstractC9636hW1.m18822b(str2, bArr2, c9498gR1.f27804e, c9498gR1.m18553k());
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                throw new C6583ou(e4);
                            } catch (C10148lW1 e5) {
                                c9498gR1.f27804e = i16;
                                C9498gR1.f27799f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
                                byte[] bytes2 = str2.getBytes(BS1.f826a);
                                try {
                                    c9498gR1.m18550I(bytes2.length);
                                    c9498gR1.m18555q(bytes2, 0, bytes2.length);
                                } catch (IndexOutOfBoundsException e6) {
                                    throw new C6583ou(e6);
                                }
                            }
                        } else {
                            c10641pN0.m23766y(i10, (JQ1) object2);
                        }
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 60:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23749C(i10, unsafe.getObject(obj, j), c10528oU1.m23478C(i9));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 61:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23766y(i10, (JQ1) unsafe.getObject(obj, j));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 62:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23756J(i10, m23475v(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 63:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23763v(i10, m23475v(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23752F(i10, m23475v(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 65:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23751E(i10, m23471A(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 66:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23754H(i10, m23475v(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 67:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23753G(i10, m23471A(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 68:
                    if (c10528oU1.m23491x(i10, i9, obj)) {
                        c10641pN0.m23765x(i10, unsafe.getObject(obj, j), c10528oU1.m23478C(i9));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                default:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c10528oU1 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
            }
        }
        ((AbstractC10908rS1) obj).zzb.m6381d(c10641pN0);
    }

    @Override // p000.InterfaceC9122dV1
    /* renamed from: h */
    public final void mo17700h(Object obj, Object obj2) {
        if (!m23472E(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f39030a;
            if (i >= iArr.length) {
                BL1.m677j(obj, obj2);
                return;
            }
            int iM23490u = m23490u(i);
            long j = iM23490u & 1048575;
            int i2 = iArr[i];
            switch ((iM23490u & 267386880) >>> 20) {
                case 0:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        VV1.m8448e(obj, j, VV1.f12598c.mo7384a(j, obj2));
                        m23488s(i, obj);
                        break;
                    }
                case 1:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        VV1.m8449f(obj, j, VV1.f12598c.mo7389i(j, obj2));
                        m23488s(i, obj);
                        break;
                    }
                case 2:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        TV1 tv1 = VV1.f12598c;
                        tv1.m7697b(j, tv1.m7702m(j, obj2), obj);
                        m23488s(i, obj);
                        break;
                    }
                case 3:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        TV1 tv12 = VV1.f12598c;
                        tv12.m7697b(j, tv12.m7702m(j, obj2), obj);
                        m23488s(i, obj);
                        break;
                    }
                case 4:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        VV1.m8446c(j, obj, VV1.f12598c.m7701l(j, obj2));
                        m23488s(i, obj);
                        break;
                    }
                case 5:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        TV1 tv13 = VV1.f12598c;
                        tv13.m7697b(j, tv13.m7702m(j, obj2), obj);
                        m23488s(i, obj);
                        break;
                    }
                case 6:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        VV1.m8446c(j, obj, VV1.f12598c.m7701l(j, obj2));
                        m23488s(i, obj);
                        break;
                    }
                case 7:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        VV1.m8455l(obj, j, VV1.f12598c.mo7390k(j, obj2));
                        m23488s(i, obj);
                        break;
                    }
                case 8:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        VV1.m8447d(j, obj, VV1.m8458o(j, obj2));
                        m23488s(i, obj);
                        break;
                    }
                case 9:
                    m23486q(obj, obj2, i);
                    break;
                case 10:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        VV1.m8447d(j, obj, VV1.m8458o(j, obj2));
                        m23488s(i, obj);
                        break;
                    }
                case 11:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        VV1.m8446c(j, obj, VV1.f12598c.m7701l(j, obj2));
                        m23488s(i, obj);
                        break;
                    }
                case 12:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        VV1.m8446c(j, obj, VV1.f12598c.m7701l(j, obj2));
                        m23488s(i, obj);
                        break;
                    }
                case 13:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        VV1.m8446c(j, obj, VV1.f12598c.m7701l(j, obj2));
                        m23488s(i, obj);
                        break;
                    }
                case 14:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        TV1 tv14 = VV1.f12598c;
                        tv14.m7697b(j, tv14.m7702m(j, obj2), obj);
                        m23488s(i, obj);
                        break;
                    }
                case 15:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        VV1.m8446c(j, obj, VV1.f12598c.m7701l(j, obj2));
                        m23488s(i, obj);
                        break;
                    }
                case 16:
                    if (!m23492y(i, obj2)) {
                        break;
                    } else {
                        TV1 tv15 = VV1.f12598c;
                        tv15.m7697b(j, tv15.m7702m(j, obj2), obj);
                        m23488s(i, obj);
                        break;
                    }
                case 17:
                    m23486q(obj, obj2, i);
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
                case C5043c9.f31374J /* 35 */:
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                case 37:
                case C5043c9.f31375K /* 38 */:
                case 39:
                case C5043c9.f31376L /* 40 */:
                case 41:
                case C5043c9.f31377M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    LS1 ls1Mo724a = (LS1) VV1.m8458o(j, obj);
                    LS1 ls1 = (LS1) VV1.m8458o(j, obj2);
                    int size = ls1Mo724a.size();
                    int size2 = ls1.size();
                    if (size > 0 && size2 > 0) {
                        if (!((RP1) ls1Mo724a).f10166a) {
                            ls1Mo724a = ls1Mo724a.mo724a(size2 + size);
                        }
                        ls1Mo724a.addAll(ls1);
                    }
                    if (size > 0) {
                        ls1 = ls1Mo724a;
                    }
                    VV1.m8447d(j, obj, ls1);
                    break;
                case 50:
                    VV1.m8447d(j, obj, K22.m4531b(VV1.m8458o(j, obj), VV1.m8458o(j, obj2)));
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
                    if (!m23491x(i2, i, obj2)) {
                        break;
                    } else {
                        VV1.m8447d(j, obj, VV1.m8458o(j, obj2));
                        VV1.m8446c(iArr[i + 2] & 1048575, obj, i2);
                        break;
                    }
                case 60:
                    m23489t(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case NativeMac.KEY_LENGTH /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (!m23491x(i2, i, obj2)) {
                        break;
                    } else {
                        VV1.m8447d(j, obj, VV1.m8458o(j, obj2));
                        VV1.m8446c(iArr[i + 2] & 1048575, obj, i2);
                        break;
                    }
                case 68:
                    m23489t(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* renamed from: i */
    public final int m23480i(int i, int i2) {
        int[] iArr = this.f39030a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
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
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m23481j(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, p000.VP1 r42) {
        /*
            Method dump skipped, instructions count: 3336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10528oU1.m23481j(java.lang.Object, byte[], int, int, int, VP1):int");
    }

    /* renamed from: k */
    public final Object m23482k(int i, int i2, Object obj) {
        InterfaceC9122dV1 interfaceC9122dV1M23478C = m23478C(i2);
        if (!m23491x(i, i2, obj)) {
            return interfaceC9122dV1M23478C.zza();
        }
        Object object = f39029j.getObject(obj, m23490u(i2) & 1048575);
        if (m23472E(object)) {
            return object;
        }
        AbstractC10908rS1 abstractC10908rS1Zza = interfaceC9122dV1M23478C.zza();
        if (object != null) {
            interfaceC9122dV1M23478C.mo17700h(abstractC10908rS1Zza, object);
        }
        return abstractC10908rS1Zza;
    }

    /* renamed from: l */
    public final Object m23483l(int i, Object obj) {
        InterfaceC9122dV1 interfaceC9122dV1M23478C = m23478C(i);
        long jM23490u = m23490u(i) & 1048575;
        if (!m23492y(i, obj)) {
            return interfaceC9122dV1M23478C.zza();
        }
        Object object = f39029j.getObject(obj, jM23490u);
        if (m23472E(object)) {
            return object;
        }
        AbstractC10908rS1 abstractC10908rS1Zza = interfaceC9122dV1M23478C.zza();
        if (object != null) {
            interfaceC9122dV1M23478C.mo17700h(abstractC10908rS1Zza, object);
        }
        return abstractC10908rS1Zza;
    }

    /* renamed from: o */
    public final void m23484o(Object obj, int i, Object obj2) {
        f39029j.putObject(obj, m23490u(i) & 1048575, obj2);
        m23488s(i, obj);
    }

    /* renamed from: p */
    public final void m23485p(Object obj, int i, Object obj2, int i2) {
        f39029j.putObject(obj, m23490u(i2) & 1048575, obj2);
        VV1.m8446c(this.f39030a[i2 + 2] & 1048575, obj, i);
    }

    /* renamed from: q */
    public final void m23486q(Object obj, Object obj2, int i) {
        if (m23492y(i, obj2)) {
            long jM23490u = m23490u(i) & 1048575;
            Unsafe unsafe = f39029j;
            Object object = unsafe.getObject(obj2, jM23490u);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f39030a[i] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC9122dV1 interfaceC9122dV1M23478C = m23478C(i);
            if (!m23492y(i, obj)) {
                if (m23472E(object)) {
                    AbstractC10908rS1 abstractC10908rS1Zza = interfaceC9122dV1M23478C.zza();
                    interfaceC9122dV1M23478C.mo17700h(abstractC10908rS1Zza, object);
                    unsafe.putObject(obj, jM23490u, abstractC10908rS1Zza);
                } else {
                    unsafe.putObject(obj, jM23490u, object);
                }
                m23488s(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM23490u);
            if (!m23472E(object2)) {
                AbstractC10908rS1 abstractC10908rS1Zza2 = interfaceC9122dV1M23478C.zza();
                interfaceC9122dV1M23478C.mo17700h(abstractC10908rS1Zza2, object2);
                unsafe.putObject(obj, jM23490u, abstractC10908rS1Zza2);
                object2 = abstractC10908rS1Zza2;
            }
            interfaceC9122dV1M23478C.mo17700h(object2, object);
        }
    }

    /* renamed from: r */
    public final boolean m23487r(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m23492y(i, obj) : (i3 & i4) != 0;
    }

    /* renamed from: s */
    public final void m23488s(int i, Object obj) {
        int i2 = this.f39030a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        VV1.m8446c(j, obj, (1 << (i2 >>> 20)) | VV1.f12598c.m7701l(j, obj));
    }

    /* renamed from: t */
    public final void m23489t(Object obj, int i, Object obj2) {
        int[] iArr = this.f39030a;
        int i2 = iArr[i];
        if (m23491x(i2, i, obj2)) {
            long jM23490u = m23490u(i) & 1048575;
            Unsafe unsafe = f39029j;
            Object object = unsafe.getObject(obj2, jM23490u);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC9122dV1 interfaceC9122dV1M23478C = m23478C(i);
            if (!m23491x(i2, i, obj)) {
                if (m23472E(object)) {
                    AbstractC10908rS1 abstractC10908rS1Zza = interfaceC9122dV1M23478C.zza();
                    interfaceC9122dV1M23478C.mo17700h(abstractC10908rS1Zza, object);
                    unsafe.putObject(obj, jM23490u, abstractC10908rS1Zza);
                } else {
                    unsafe.putObject(obj, jM23490u, object);
                }
                VV1.m8446c(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM23490u);
            if (!m23472E(object2)) {
                AbstractC10908rS1 abstractC10908rS1Zza2 = interfaceC9122dV1M23478C.zza();
                interfaceC9122dV1M23478C.mo17700h(abstractC10908rS1Zza2, object2);
                unsafe.putObject(obj, jM23490u, abstractC10908rS1Zza2);
                object2 = abstractC10908rS1Zza2;
            }
            interfaceC9122dV1M23478C.mo17700h(object2, object);
        }
    }

    /* renamed from: u */
    public final int m23490u(int i) {
        return this.f39030a[i + 1];
    }

    /* renamed from: x */
    public final boolean m23491x(int i, int i2, Object obj) {
        return VV1.f12598c.m7701l((long) (this.f39030a[i2 + 2] & 1048575), obj) == i;
    }

    /* renamed from: y */
    public final boolean m23492y(int i, Object obj) {
        int i2 = this.f39030a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & VV1.f12598c.m7701l(j, obj)) != 0;
        }
        int iM23490u = m23490u(i);
        long j2 = iM23490u & 1048575;
        switch ((iM23490u & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(VV1.f12598c.mo7384a(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(VV1.f12598c.mo7389i(j2, obj)) != 0;
            case 2:
                return VV1.f12598c.m7702m(j2, obj) != 0;
            case 3:
                return VV1.f12598c.m7702m(j2, obj) != 0;
            case 4:
                return VV1.f12598c.m7701l(j2, obj) != 0;
            case 5:
                return VV1.f12598c.m7702m(j2, obj) != 0;
            case 6:
                return VV1.f12598c.m7701l(j2, obj) != 0;
            case 7:
                return VV1.f12598c.mo7390k(j2, obj);
            case 8:
                Object objM8458o = VV1.m8458o(j2, obj);
                if (objM8458o instanceof String) {
                    return !((String) objM8458o).isEmpty();
                }
                if (objM8458o instanceof JQ1) {
                    return !JQ1.f5516c.equals(objM8458o);
                }
                throw new IllegalArgumentException();
            case 9:
                return VV1.m8458o(j2, obj) != null;
            case 10:
                return !JQ1.f5516c.equals(VV1.m8458o(j2, obj));
            case 11:
                return VV1.f12598c.m7701l(j2, obj) != 0;
            case 12:
                return VV1.f12598c.m7701l(j2, obj) != 0;
            case 13:
                return VV1.f12598c.m7701l(j2, obj) != 0;
            case 14:
                return VV1.f12598c.m7702m(j2, obj) != 0;
            case 15:
                return VV1.f12598c.m7701l(j2, obj) != 0;
            case 16:
                return VV1.f12598c.m7702m(j2, obj) != 0;
            case 17:
                return VV1.m8458o(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: z */
    public final boolean m23493z(AbstractC10908rS1 abstractC10908rS1, Object obj, int i) {
        return m23492y(i, abstractC10908rS1) == m23492y(i, obj);
    }

    @Override // p000.InterfaceC9122dV1
    public final AbstractC10908rS1 zza() {
        return (AbstractC10908rS1) ((AbstractC10908rS1) this.f39034e).mo644d(4);
    }
}
