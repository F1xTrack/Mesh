package defpackage;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.appmetrica.analytics.impl.C4473c9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: tr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7299tr0 implements DV0 {
    public static final int[] j = new int[0];
    public static final Unsafe k = AbstractC1053Ng1.j();
    public final int[] a;
    public final Object[] b;
    public final J0 c;
    public final int[] d;
    public final int e;
    public final C6739qv0 f;
    public final AbstractC7847wj0 g;
    public final C4390ig1 h;
    public final C4410in0 i;

    public C7299tr0(int[] iArr, Object[] objArr, J0 j0, int[] iArr2, int i, C6739qv0 c6739qv0, AbstractC7847wj0 abstractC7847wj0, C4390ig1 c4390ig1, FR fr, C4410in0 c4410in0) {
        this.a = iArr;
        this.b = objArr;
        boolean z = j0 instanceof AbstractC8279z00;
        this.d = iArr2;
        this.e = i;
        this.f = c6739qv0;
        this.g = abstractC7847wj0;
        this.h = c4390ig1;
        this.c = j0;
        this.i = c4410in0;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC8279z00) {
            return ((AbstractC8279z00) obj).p();
        }
        return true;
    }

    public static C7299tr0 q(C5479kJ0 c5479kJ0, C6739qv0 c6739qv0, AbstractC7847wj0 abstractC7847wj0, C4390ig1 c4390ig1, FR fr, C4410in0 c4410in0) {
        if (c5479kJ0 instanceof C5479kJ0) {
            return r(c5479kJ0, c6739qv0, abstractC7847wj0, c4390ig1, fr, c4410in0);
        }
        c5479kJ0.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C7299tr0 r(defpackage.C5479kJ0 r30, defpackage.C6739qv0 r31, defpackage.AbstractC7847wj0 r32, defpackage.C4390ig1 r33, defpackage.FR r34, defpackage.C4410in0 r35) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7299tr0.r(kJ0, qv0, wj0, ig1, FR, in0):tr0");
    }

    public static int s(long j2, Object obj) {
        return ((Integer) AbstractC1053Ng1.c.i(j2, obj)).intValue();
    }

    public static long t(long j2, Object obj) {
        return ((Long) AbstractC1053Ng1.c.i(j2, obj)).longValue();
    }

    public static Field u(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbQ = AbstractC8235ym.q("Field ", str, " for ");
            NX.n(cls, sbQ, " not found. Known fields are ");
            sbQ.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbQ.toString());
        }
    }

    public static int w(int i) {
        return (i & 267386880) >>> 20;
    }

    @Override // defpackage.DV0
    public final AbstractC8279z00 a() {
        this.f.getClass();
        return (AbstractC8279z00) ((AbstractC8279z00) this.c).m(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // defpackage.DV0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = m(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r9 instanceof defpackage.AbstractC8279z00
            if (r0 == 0) goto L17
            r0 = r9
            z00 r0 = (defpackage.AbstractC8279z00) r0
            r0.g()
            r0.f()
            r0.q()
        L17:
            int[] r0 = r8.a
            int r1 = r0.length
            r2 = 0
        L1b:
            if (r2 >= r1) goto L80
            int r3 = r8.x(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = w(r3)
            r6 = 9
            if (r3 == r6) goto L6a
            r6 = 60
            if (r3 == r6) goto L54
            r6 = 68
            if (r3 == r6) goto L54
            switch(r3) {
                case 17: goto L6a;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7d
        L3a:
            sun.misc.Unsafe r3 = defpackage.C7299tr0.k
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L7d
            in0 r7 = r8.i
            r7.getClass()
            defpackage.C4410in0.b(r6)
            r3.putObject(r9, r4, r6)
            goto L7d
        L4e:
            wj0 r3 = r8.g
            r3.a(r4, r9)
            goto L7d
        L54:
            r3 = r0[r2]
            boolean r3 = r8.n(r3, r2, r9)
            if (r3 == 0) goto L7d
            DV0 r3 = r8.j(r2)
            sun.misc.Unsafe r6 = defpackage.C7299tr0.k
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.b(r4)
            goto L7d
        L6a:
            boolean r3 = r8.k(r2, r9)
            if (r3 == 0) goto L7d
            DV0 r3 = r8.j(r2)
            sun.misc.Unsafe r6 = defpackage.C7299tr0.k
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.b(r4)
        L7d:
            int r2 = r2 + 3
            goto L1b
        L80:
            ig1 r0 = r8.h
            r0.getClass()
            defpackage.C4390ig1.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7299tr0.b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    @Override // defpackage.DV0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7299tr0.c(java.lang.Object):boolean");
    }

    @Override // defpackage.DV0
    public final void d(Object obj, Object obj2) {
        if (!m(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                HV0.z(this.h, obj, obj2);
                return;
            }
            int iX = x(i);
            long j2 = iX & 1048575;
            int i2 = iArr[i];
            switch (w(iX)) {
                case 0:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC0898Lg1 abstractC0898Lg1 = AbstractC1053Ng1.c;
                        abstractC0898Lg1.m(obj, j2, abstractC0898Lg1.e(j2, obj2));
                        v(i, obj);
                        break;
                    }
                case 1:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC0898Lg1 abstractC0898Lg12 = AbstractC1053Ng1.c;
                        abstractC0898Lg12.n(obj, j2, abstractC0898Lg12.f(j2, obj2));
                        v(i, obj);
                        break;
                    }
                case 2:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC0898Lg1 abstractC0898Lg13 = AbstractC1053Ng1.c;
                        abstractC0898Lg13.p(j2, abstractC0898Lg13.h(j2, obj2), obj);
                        v(i, obj);
                        break;
                    }
                case 3:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC0898Lg1 abstractC0898Lg14 = AbstractC1053Ng1.c;
                        abstractC0898Lg14.p(j2, abstractC0898Lg14.h(j2, obj2), obj);
                        v(i, obj);
                        break;
                    }
                case 4:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC1053Ng1.n(j2, obj, AbstractC1053Ng1.c.g(j2, obj2));
                        v(i, obj);
                        break;
                    }
                case 5:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC0898Lg1 abstractC0898Lg15 = AbstractC1053Ng1.c;
                        abstractC0898Lg15.p(j2, abstractC0898Lg15.h(j2, obj2), obj);
                        v(i, obj);
                        break;
                    }
                case 6:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC1053Ng1.n(j2, obj, AbstractC1053Ng1.c.g(j2, obj2));
                        v(i, obj);
                        break;
                    }
                case 7:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC0898Lg1 abstractC0898Lg16 = AbstractC1053Ng1.c;
                        abstractC0898Lg16.k(obj, j2, abstractC0898Lg16.c(j2, obj2));
                        v(i, obj);
                        break;
                    }
                case 8:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC1053Ng1.o(j2, obj, AbstractC1053Ng1.c.i(j2, obj2));
                        v(i, obj);
                        break;
                    }
                case 9:
                    o(obj, i, obj2);
                    break;
                case 10:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC1053Ng1.o(j2, obj, AbstractC1053Ng1.c.i(j2, obj2));
                        v(i, obj);
                        break;
                    }
                case 11:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC1053Ng1.n(j2, obj, AbstractC1053Ng1.c.g(j2, obj2));
                        v(i, obj);
                        break;
                    }
                case 12:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC1053Ng1.n(j2, obj, AbstractC1053Ng1.c.g(j2, obj2));
                        v(i, obj);
                        break;
                    }
                case 13:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC1053Ng1.n(j2, obj, AbstractC1053Ng1.c.g(j2, obj2));
                        v(i, obj);
                        break;
                    }
                case 14:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC0898Lg1 abstractC0898Lg17 = AbstractC1053Ng1.c;
                        abstractC0898Lg17.p(j2, abstractC0898Lg17.h(j2, obj2), obj);
                        v(i, obj);
                        break;
                    }
                case 15:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC1053Ng1.n(j2, obj, AbstractC1053Ng1.c.g(j2, obj2));
                        v(i, obj);
                        break;
                    }
                case 16:
                    if (!k(i, obj2)) {
                        break;
                    } else {
                        AbstractC0898Lg1 abstractC0898Lg18 = AbstractC1053Ng1.c;
                        abstractC0898Lg18.p(j2, abstractC0898Lg18.h(j2, obj2), obj);
                        v(i, obj);
                        break;
                    }
                case 17:
                    o(obj, i, obj2);
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
                    this.g.b(j2, obj, obj2);
                    break;
                case 50:
                    Class cls = HV0.a;
                    AbstractC0898Lg1 abstractC0898Lg19 = AbstractC1053Ng1.c;
                    Object objI = abstractC0898Lg19.i(j2, obj);
                    Object objI2 = abstractC0898Lg19.i(j2, obj2);
                    this.i.getClass();
                    C4029gn0 c4029gn0I = (C4029gn0) objI;
                    C4029gn0 c4029gn0 = (C4029gn0) objI2;
                    if (!c4029gn0.isEmpty()) {
                        if (!c4029gn0I.a) {
                            c4029gn0I = c4029gn0I.i();
                        }
                        c4029gn0I.e();
                        if (!c4029gn0.isEmpty()) {
                            c4029gn0I.putAll(c4029gn0);
                        }
                    }
                    AbstractC1053Ng1.o(j2, obj, c4029gn0I);
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
                    if (!n(i2, i, obj2)) {
                        break;
                    } else {
                        AbstractC1053Ng1.o(j2, obj, AbstractC1053Ng1.c.i(j2, obj2));
                        AbstractC1053Ng1.n(iArr[i + 2] & 1048575, obj, i2);
                        break;
                    }
                case 60:
                    p(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case NativeMac.KEY_LENGTH /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (!n(i2, i, obj2)) {
                        break;
                    } else {
                        AbstractC1053Ng1.o(j2, obj, AbstractC1053Ng1.c.i(j2, obj2));
                        AbstractC1053Ng1.n(iArr[i + 2] & 1048575, obj, i2);
                        break;
                    }
                case 68:
                    p(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // defpackage.DV0
    public final int e(AbstractC8279z00 abstractC8279z00) {
        int i;
        int i2;
        int i3;
        int iE;
        int iC;
        int i4;
        int iT;
        int iV;
        Unsafe unsafe = k;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i8 >= iArr.length) {
                this.h.getClass();
                return abstractC8279z00.unknownFields.a() + i9;
            }
            int iX = x(i8);
            int iW = w(iX);
            int i10 = iArr[i8];
            int i11 = iArr[i8 + 2];
            int i12 = i11 & i5;
            if (iW <= 17) {
                if (i12 != i6) {
                    i7 = i12 == i5 ? 0 : unsafe.getInt(abstractC8279z00, i12);
                    i6 = i12;
                }
                i = i6;
                i2 = i7;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
            }
            long j2 = iX & i5;
            if (iW >= EnumC4350iT.b.a()) {
                EnumC4350iT.c.a();
            }
            switch (iW) {
                case 0:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.e(i10);
                        i9 += iE;
                        break;
                    }
                case 1:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.i(i10);
                        i9 += iE;
                        break;
                    }
                case 2:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.m(i10, unsafe.getLong(abstractC8279z00, j2));
                        i9 += iE;
                        break;
                    }
                case 3:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.w(i10, unsafe.getLong(abstractC8279z00, j2));
                        i9 += iE;
                        break;
                    }
                case 4:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.k(i10, unsafe.getInt(abstractC8279z00, j2));
                        i9 += iE;
                        break;
                    }
                case 5:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.h(i10);
                        i9 += iE;
                        break;
                    }
                case 6:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.g(i10);
                        i9 += iE;
                        break;
                    }
                case 7:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.b(i10);
                        i9 += iE;
                        break;
                    }
                case 8:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC8279z00, j2);
                        iC = object instanceof C0362Ek ? C6162nu.c(i10, (C0362Ek) object) : C6162nu.r(i10, (String) object);
                        i9 = iC + i9;
                        break;
                    }
                case 9:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = HV0.o(i10, unsafe.getObject(abstractC8279z00, j2), j(i8));
                        i9 += iE;
                        break;
                    }
                case 10:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.c(i10, (C0362Ek) unsafe.getObject(abstractC8279z00, j2));
                        i9 += iE;
                        break;
                    }
                case 11:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.u(i10, unsafe.getInt(abstractC8279z00, j2));
                        i9 += iE;
                        break;
                    }
                case 12:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.f(i10, unsafe.getInt(abstractC8279z00, j2));
                        i9 += iE;
                        break;
                    }
                case 13:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.n(i10);
                        i9 += iE;
                        break;
                    }
                case 14:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.o(i10);
                        i9 += iE;
                        break;
                    }
                case 15:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.p(i10, unsafe.getInt(abstractC8279z00, j2));
                        i9 += iE;
                        break;
                    }
                case 16:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.q(i10, unsafe.getLong(abstractC8279z00, j2));
                        i9 += iE;
                        break;
                    }
                case 17:
                    if (!l(abstractC8279z00, i8, i, i2, i3)) {
                        break;
                    } else {
                        iE = C6162nu.j(i10, (J0) unsafe.getObject(abstractC8279z00, j2), j(i8));
                        i9 += iE;
                        break;
                    }
                case 18:
                    iE = HV0.h(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 19:
                    iE = HV0.f(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 20:
                    iE = HV0.m(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 21:
                    iE = HV0.x(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 22:
                    iE = HV0.k(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 23:
                    iE = HV0.h(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 24:
                    iE = HV0.f(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 25:
                    iE = HV0.a(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 26:
                    iE = HV0.u(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 27:
                    iE = HV0.p(i10, (List) unsafe.getObject(abstractC8279z00, j2), j(i8));
                    i9 += iE;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iE = HV0.c(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 29:
                    iE = HV0.v(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 30:
                    iE = HV0.d(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 31:
                    iE = HV0.f(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 32:
                    iE = HV0.h(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 33:
                    iE = HV0.q(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case 34:
                    iE = HV0.s(i10, (List) unsafe.getObject(abstractC8279z00, j2));
                    i9 += iE;
                    break;
                case C4473c9.J /* 35 */:
                    i4 = HV0.i((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    i4 = HV0.g((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case 37:
                    i4 = HV0.n((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case C4473c9.K /* 38 */:
                    i4 = HV0.y((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case 39:
                    i4 = HV0.l((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case C4473c9.L /* 40 */:
                    i4 = HV0.i((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case 41:
                    i4 = HV0.g((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case C4473c9.M /* 42 */:
                    i4 = HV0.b((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case 43:
                    i4 = HV0.w((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case 44:
                    i4 = HV0.e((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case 45:
                    i4 = HV0.g((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case 46:
                    i4 = HV0.i((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case 47:
                    i4 = HV0.r((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case 48:
                    i4 = HV0.t((List) unsafe.getObject(abstractC8279z00, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        iT = C6162nu.t(i10);
                        iV = C6162nu.v(i4);
                        i9 += iV + iT + i4;
                        break;
                    }
                case 49:
                    iE = HV0.j(i10, (List) unsafe.getObject(abstractC8279z00, j2), j(i8));
                    i9 += iE;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC8279z00, j2);
                    Object obj = this.b[(i8 / 3) * 2];
                    this.i.getClass();
                    iE = C4410in0.a(object2, i10, obj);
                    i9 += iE;
                    break;
                case 51:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.e(i10);
                        i9 += iE;
                        break;
                    }
                case 52:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.i(i10);
                        i9 += iE;
                        break;
                    }
                case 53:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.m(i10, t(j2, abstractC8279z00));
                        i9 += iE;
                        break;
                    }
                case 54:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.w(i10, t(j2, abstractC8279z00));
                        i9 += iE;
                        break;
                    }
                case 55:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.k(i10, s(j2, abstractC8279z00));
                        i9 += iE;
                        break;
                    }
                case 56:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.h(i10);
                        i9 += iE;
                        break;
                    }
                case 57:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.g(i10);
                        i9 += iE;
                        break;
                    }
                case 58:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.b(i10);
                        i9 += iE;
                        break;
                    }
                case 59:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC8279z00, j2);
                        iC = object3 instanceof C0362Ek ? C6162nu.c(i10, (C0362Ek) object3) : C6162nu.r(i10, (String) object3);
                        i9 = iC + i9;
                        break;
                    }
                case 60:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = HV0.o(i10, unsafe.getObject(abstractC8279z00, j2), j(i8));
                        i9 += iE;
                        break;
                    }
                case 61:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.c(i10, (C0362Ek) unsafe.getObject(abstractC8279z00, j2));
                        i9 += iE;
                        break;
                    }
                case 62:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.u(i10, s(j2, abstractC8279z00));
                        i9 += iE;
                        break;
                    }
                case 63:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.f(i10, s(j2, abstractC8279z00));
                        i9 += iE;
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.n(i10);
                        i9 += iE;
                        break;
                    }
                case 65:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.o(i10);
                        i9 += iE;
                        break;
                    }
                case 66:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.p(i10, s(j2, abstractC8279z00));
                        i9 += iE;
                        break;
                    }
                case 67:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.q(i10, t(j2, abstractC8279z00));
                        i9 += iE;
                        break;
                    }
                case 68:
                    if (!n(i10, i8, abstractC8279z00)) {
                        break;
                    } else {
                        iE = C6162nu.j(i10, (J0) unsafe.getObject(abstractC8279z00, j2), j(i8));
                        i9 += iE;
                        break;
                    }
            }
            i8 += 3;
            i6 = i;
            i7 = i2;
            i5 = 1048575;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // defpackage.DV0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(defpackage.AbstractC8279z00 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7299tr0.f(z00, java.lang.Object):boolean");
    }

    @Override // defpackage.DV0
    public final void g(Object obj, C1562Tu0 c1562Tu0) {
        c1562Tu0.getClass();
        y(obj, c1562Tu0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.DV0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(defpackage.AbstractC8279z00 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7299tr0.h(z00):int");
    }

    public final boolean i(AbstractC8279z00 abstractC8279z00, Object obj, int i) {
        return k(i, abstractC8279z00) == k(i, obj);
    }

    public final DV0 j(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        DV0 dv0 = (DV0) objArr[i2];
        if (dv0 != null) {
            return dv0;
        }
        DV0 dv0A = YF0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = dv0A;
        return dv0A;
    }

    public final boolean k(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i2 >>> 20)) & AbstractC1053Ng1.c.g(j2, obj)) != 0;
        }
        int iX = x(i);
        long j3 = iX & 1048575;
        switch (w(iX)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC1053Ng1.c.e(j3, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC1053Ng1.c.f(j3, obj)) != 0;
            case 2:
                return AbstractC1053Ng1.c.h(j3, obj) != 0;
            case 3:
                return AbstractC1053Ng1.c.h(j3, obj) != 0;
            case 4:
                return AbstractC1053Ng1.c.g(j3, obj) != 0;
            case 5:
                return AbstractC1053Ng1.c.h(j3, obj) != 0;
            case 6:
                return AbstractC1053Ng1.c.g(j3, obj) != 0;
            case 7:
                return AbstractC1053Ng1.c.c(j3, obj);
            case 8:
                Object objI = AbstractC1053Ng1.c.i(j3, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof C0362Ek) {
                    return !C0362Ek.c.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC1053Ng1.c.i(j3, obj) != null;
            case 10:
                return !C0362Ek.c.equals(AbstractC1053Ng1.c.i(j3, obj));
            case 11:
                return AbstractC1053Ng1.c.g(j3, obj) != 0;
            case 12:
                return AbstractC1053Ng1.c.g(j3, obj) != 0;
            case 13:
                return AbstractC1053Ng1.c.g(j3, obj) != 0;
            case 14:
                return AbstractC1053Ng1.c.h(j3, obj) != 0;
            case 15:
                return AbstractC1053Ng1.c.g(j3, obj) != 0;
            case 16:
                return AbstractC1053Ng1.c.h(j3, obj) != 0;
            case 17:
                return AbstractC1053Ng1.c.i(j3, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean l(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? k(i, obj) : (i3 & i4) != 0;
    }

    public final boolean n(int i, int i2, Object obj) {
        return AbstractC1053Ng1.c.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void o(Object obj, int i, Object obj2) {
        if (k(i, obj2)) {
            long jX = x(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            DV0 dv0J = j(i);
            if (!k(i, obj)) {
                if (m(object)) {
                    AbstractC8279z00 abstractC8279z00A = dv0J.a();
                    dv0J.d(abstractC8279z00A, object);
                    unsafe.putObject(obj, jX, abstractC8279z00A);
                } else {
                    unsafe.putObject(obj, jX, object);
                }
                v(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jX);
            if (!m(object2)) {
                AbstractC8279z00 abstractC8279z00A2 = dv0J.a();
                dv0J.d(abstractC8279z00A2, object2);
                unsafe.putObject(obj, jX, abstractC8279z00A2);
                object2 = abstractC8279z00A2;
            }
            dv0J.d(object2, object);
        }
    }

    public final void p(Object obj, int i, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (n(i2, i, obj2)) {
            long jX = x(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            DV0 dv0J = j(i);
            if (!n(i2, i, obj)) {
                if (m(object)) {
                    AbstractC8279z00 abstractC8279z00A = dv0J.a();
                    dv0J.d(abstractC8279z00A, object);
                    unsafe.putObject(obj, jX, abstractC8279z00A);
                } else {
                    unsafe.putObject(obj, jX, object);
                }
                AbstractC1053Ng1.n(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jX);
            if (!m(object2)) {
                AbstractC8279z00 abstractC8279z00A2 = dv0J.a();
                dv0J.d(abstractC8279z00A2, object2);
                unsafe.putObject(obj, jX, abstractC8279z00A2);
                object2 = abstractC8279z00A2;
            }
            dv0J.d(object2, object);
        }
    }

    public final void v(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        AbstractC1053Ng1.n(j2, obj, (1 << (i2 >>> 20)) | AbstractC1053Ng1.c.g(j2, obj));
    }

    public final int x(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v51 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.Object r32, defpackage.C1562Tu0 r33) {
        /*
            Method dump skipped, instructions count: 2484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7299tr0.y(java.lang.Object, Tu0):void");
    }
}
