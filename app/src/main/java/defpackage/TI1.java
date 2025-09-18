package defpackage;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.appmetrica.analytics.impl.C4473c9;
import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class TI1 implements InterfaceC8153yK1 {
    public static final int[] l = new int[0];
    public static final Unsafe m = HM1.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final DD1 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final TE j;
    public final C5806m12 k;

    public TI1(int[] iArr, Object[] objArr, int i, int i2, DD1 dd1, int[] iArr2, int i3, int i4, TE te, C5806m12 c5806m12) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        boolean z = false;
        if (c5806m12 != null && (dd1 instanceof AbstractC8331zG1)) {
            z = true;
        }
        this.f = z;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = te;
        this.k = c5806m12;
        this.e = dd1;
    }

    public static Field E(Class cls, String str) {
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

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof QG1) {
            return ((QG1) obj).k();
        }
        return true;
    }

    public static C3949gM1 t(Object obj) {
        QG1 qg1 = (QG1) obj;
        C3949gM1 c3949gM1 = qg1.zzc;
        if (c3949gM1 != C3949gM1.f) {
            return c3949gM1;
        }
        C3949gM1 c3949gM1B = C3949gM1.b();
        qg1.zzc = c3949gM1B;
        return c3949gM1B;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.TI1 u(defpackage.C8340zJ1 r33, defpackage.TE r34, defpackage.C5806m12 r35) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TI1.u(zJ1, TE, m12):TI1");
    }

    public static int v(long j, Object obj) {
        return ((Integer) HM1.i(j, obj)).intValue();
    }

    public static int x(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static long z(long j, Object obj) {
        return ((Long) HM1.i(j, obj)).longValue();
    }

    public final InterfaceC3743fH1 A(int i) {
        int i2 = i / 3;
        return (InterfaceC3743fH1) this.b[i2 + i2 + 1];
    }

    public final InterfaceC8153yK1 B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        InterfaceC8153yK1 interfaceC8153yK1 = (InterfaceC8153yK1) objArr[i3];
        if (interfaceC8153yK1 != null) {
            return interfaceC8153yK1;
        }
        InterfaceC8153yK1 interfaceC8153yK1A = C3940gJ1.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = interfaceC8153yK1A;
        return interfaceC8153yK1A;
    }

    public final Object C(int i, Object obj) {
        InterfaceC8153yK1 interfaceC8153yK1B = B(i);
        int iY = y(i) & 1048575;
        if (!o(i, obj)) {
            return interfaceC8153yK1B.zze();
        }
        Object object = m.getObject(obj, iY);
        if (q(object)) {
            return object;
        }
        Object objZze = interfaceC8153yK1B.zze();
        if (object != null) {
            interfaceC8153yK1B.c(objZze, object);
        }
        return objZze;
    }

    public final Object D(int i, int i2, Object obj) {
        InterfaceC8153yK1 interfaceC8153yK1B = B(i2);
        if (!r(i, i2, obj)) {
            return interfaceC8153yK1B.zze();
        }
        Object object = m.getObject(obj, y(i2) & 1048575);
        if (q(object)) {
            return object;
        }
        Object objZze = interfaceC8153yK1B.zze();
        if (object != null) {
            interfaceC8153yK1B.c(objZze, object);
        }
        return objZze;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // defpackage.InterfaceC8153yK1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = q(r7)
            if (r0 != 0) goto L8
            goto L98
        L8:
            boolean r0 = r7 instanceof defpackage.QG1
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r7
            QG1 r0 = (defpackage.QG1) r0
            r0.i()
            r0.zza = r1
            r0.g()
        L18:
            int[] r0 = r6.a
            int r2 = r0.length
            if (r1 >= r2) goto L84
            int r2 = r6.y(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = x(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6e
            r5 = 60
            if (r2 == r5) goto L58
            r5 = 68
            if (r2 == r5) goto L58
            switch(r2) {
                case 17: goto L6e;
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
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L81
        L3a:
            sun.misc.Unsafe r0 = defpackage.TI1.m
            java.lang.Object r2 = r0.getObject(r7, r3)
            if (r2 == 0) goto L81
            r5 = r2
            vI1 r5 = (defpackage.C7577vI1) r5
            r5.i()
            r0.putObject(r7, r3, r2)
            goto L81
        L4c:
            java.lang.Object r0 = defpackage.HM1.i(r3, r7)
            uH1 r0 = (defpackage.InterfaceC7383uH1) r0
            LD1 r0 = (defpackage.LD1) r0
            r0.b()
            goto L81
        L58:
            r0 = r0[r1]
            boolean r0 = r6.r(r0, r1, r7)
            if (r0 == 0) goto L81
            yK1 r0 = r6.B(r1)
            sun.misc.Unsafe r2 = defpackage.TI1.m
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.a(r2)
            goto L81
        L6e:
            boolean r0 = r6.o(r1, r7)
            if (r0 == 0) goto L81
            yK1 r0 = r6.B(r1)
            sun.misc.Unsafe r2 = defpackage.TI1.m
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.a(r2)
        L81:
            int r1 = r1 + 3
            goto L18
        L84:
            TE r0 = r6.j
            r0.getClass()
            defpackage.TE.N(r7)
            boolean r0 = r6.f
            if (r0 == 0) goto L98
            m12 r0 = r6.k
            r0.getClass()
            defpackage.C5806m12.j(r7)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TI1.a(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    @Override // defpackage.InterfaceC8153yK1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TI1.b(java.lang.Object):boolean");
    }

    @Override // defpackage.InterfaceC8153yK1
    public final void c(Object obj, Object obj2) {
        if (!q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                AbstractC3946gL1.t(obj, obj2);
                if (this.f) {
                    AbstractC3946gL1.s(obj, obj2);
                    return;
                }
                return;
            }
            int iY = y(i);
            int i2 = iY & 1048575;
            int iX = x(iY);
            int i3 = iArr[i];
            long j = i2;
            switch (iX) {
                case 0:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.l(obj, j, HM1.c.a(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 1:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.m(obj, j, HM1.c.b(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 2:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.o(j, HM1.g(j, obj2), obj);
                        k(i, obj);
                        break;
                    }
                case 3:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.o(j, HM1.g(j, obj2), obj);
                        k(i, obj);
                        break;
                    }
                case 4:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.n(j, obj, HM1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 5:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.o(j, HM1.g(j, obj2), obj);
                        k(i, obj);
                        break;
                    }
                case 6:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.n(j, obj, HM1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 7:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.k(obj, j, HM1.c.g(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 8:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.p(j, obj, HM1.i(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 9:
                    i(obj, i, obj2);
                    break;
                case 10:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.p(j, obj, HM1.i(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 11:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.n(j, obj, HM1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 12:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.n(j, obj, HM1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 13:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.n(j, obj, HM1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 14:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.o(j, HM1.g(j, obj2), obj);
                        k(i, obj);
                        break;
                    }
                case 15:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.n(j, obj, HM1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 16:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        HM1.o(j, HM1.g(j, obj2), obj);
                        k(i, obj);
                        break;
                    }
                case 17:
                    i(obj, i, obj2);
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
                    InterfaceC7383uH1 interfaceC7383uH1C = (InterfaceC7383uH1) HM1.i(j, obj);
                    InterfaceC7383uH1 interfaceC7383uH1 = (InterfaceC7383uH1) HM1.i(j, obj2);
                    int size = interfaceC7383uH1C.size();
                    int size2 = interfaceC7383uH1.size();
                    if (size > 0 && size2 > 0) {
                        if (!((LD1) interfaceC7383uH1C).a) {
                            interfaceC7383uH1C = interfaceC7383uH1C.c(size2 + size);
                        }
                        interfaceC7383uH1C.addAll(interfaceC7383uH1);
                    }
                    if (size > 0) {
                        interfaceC7383uH1 = interfaceC7383uH1C;
                    }
                    HM1.p(j, obj, interfaceC7383uH1);
                    break;
                case 50:
                    TE te = AbstractC3946gL1.a;
                    HM1.p(j, obj, C7761wG1.a(HM1.i(j, obj), HM1.i(j, obj2)));
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
                    if (!r(i3, i, obj2)) {
                        break;
                    } else {
                        HM1.p(j, obj, HM1.i(j, obj2));
                        HM1.n(iArr[i + 2] & 1048575, obj, i3);
                        break;
                    }
                case 60:
                    j(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case NativeMac.KEY_LENGTH /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (!r(i3, i, obj2)) {
                        break;
                    } else {
                        HM1.p(j, obj, HM1.i(j, obj2));
                        HM1.n(iArr[i + 2] & 1048575, obj, i3);
                        break;
                    }
                case 68:
                    j(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // defpackage.InterfaceC8153yK1
    public final boolean d(QG1 qg1, Object obj) {
        boolean zE;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                if (!qg1.zzc.equals(((QG1) obj).zzc)) {
                    return false;
                }
                if (this.f) {
                    return ((AbstractC8331zG1) qg1).zzb.equals(((AbstractC8331zG1) obj).zzb);
                }
                return true;
            }
            int iY = y(i);
            long j = iY & 1048575;
            switch (x(iY)) {
                case 0:
                    if (!n(qg1, obj, i)) {
                        break;
                    } else {
                        AbstractC5862mJ1 abstractC5862mJ1 = HM1.c;
                        if (Double.doubleToLongBits(abstractC5862mJ1.a(j, qg1)) != Double.doubleToLongBits(abstractC5862mJ1.a(j, obj))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 1:
                    if (!n(qg1, obj, i)) {
                        break;
                    } else {
                        AbstractC5862mJ1 abstractC5862mJ12 = HM1.c;
                        if (Float.floatToIntBits(abstractC5862mJ12.b(j, qg1)) != Float.floatToIntBits(abstractC5862mJ12.b(j, obj))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 2:
                    if (!n(qg1, obj, i) || HM1.g(j, qg1) != HM1.g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 3:
                    if (!n(qg1, obj, i) || HM1.g(j, qg1) != HM1.g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 4:
                    if (!n(qg1, obj, i) || HM1.f(j, qg1) != HM1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 5:
                    if (!n(qg1, obj, i) || HM1.g(j, qg1) != HM1.g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 6:
                    if (!n(qg1, obj, i) || HM1.f(j, qg1) != HM1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 7:
                    if (!n(qg1, obj, i)) {
                        break;
                    } else {
                        AbstractC5862mJ1 abstractC5862mJ13 = HM1.c;
                        if (abstractC5862mJ13.g(j, qg1) != abstractC5862mJ13.g(j, obj)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 8:
                    if (!n(qg1, obj, i) || !AbstractC3946gL1.e(HM1.i(j, qg1), HM1.i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 9:
                    if (!n(qg1, obj, i) || !AbstractC3946gL1.e(HM1.i(j, qg1), HM1.i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 10:
                    if (!n(qg1, obj, i) || !AbstractC3946gL1.e(HM1.i(j, qg1), HM1.i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 11:
                    if (!n(qg1, obj, i) || HM1.f(j, qg1) != HM1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 12:
                    if (!n(qg1, obj, i) || HM1.f(j, qg1) != HM1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 13:
                    if (!n(qg1, obj, i) || HM1.f(j, qg1) != HM1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 14:
                    if (!n(qg1, obj, i) || HM1.g(j, qg1) != HM1.g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 15:
                    if (!n(qg1, obj, i) || HM1.f(j, qg1) != HM1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 16:
                    if (!n(qg1, obj, i) || HM1.g(j, qg1) != HM1.g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 17:
                    if (!n(qg1, obj, i) || !AbstractC3946gL1.e(HM1.i(j, qg1), HM1.i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
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
                    zE = AbstractC3946gL1.e(HM1.i(j, qg1), HM1.i(j, obj));
                    break;
                case 50:
                    zE = AbstractC3946gL1.e(HM1.i(j, qg1), HM1.i(j, obj));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case NativeMac.KEY_LENGTH /* 64 */:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j2 = iArr[i + 2] & 1048575;
                    if (HM1.f(j2, qg1) != HM1.f(j2, obj) || !AbstractC3946gL1.e(HM1.i(j, qg1), HM1.i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                default:
                    i += 3;
            }
            if (zE) {
                i += 3;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC8153yK1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(defpackage.QG1 r11) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TI1.e(QG1):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05b8 A[PHI: r10
  0x05b8: PHI (r10v16 int) = (r10v3 int), (r10v4 int), (r10v8 int), (r10v9 int), (r10v15 int), (r10v17 int) binds: [B:267:0x0730, B:264:0x071f, B:252:0x06b0, B:249:0x069f, B:225:0x05cd, B:222:0x05b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    @Override // defpackage.InterfaceC8153yK1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.QG1 r20) {
        /*
            Method dump skipped, instructions count: 2088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TI1.f(QG1):int");
    }

    @Override // defpackage.InterfaceC8153yK1
    public final void g(Object obj, byte[] bArr, int i, int i2, C0779Jt c0779Jt) {
        s(obj, bArr, i, i2, 0, c0779Jt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0477 A[PHI: r21
  0x0477: PHI (r21v19 int) = 
  (r21v11 int)
  (r21v12 int)
  (r21v13 int)
  (r21v14 int)
  (r21v15 int)
  (r21v16 int)
  (r21v17 int)
  (r21v18 int)
  (r21v20 int)
 binds: [B:182:0x0590, B:179:0x056a, B:176:0x0546, B:173:0x0522, B:170:0x04fe, B:167:0x04da, B:164:0x04b6, B:161:0x0492, B:157:0x0466] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f2  */
    @Override // defpackage.InterfaceC8153yK1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r26, defpackage.L21 r27) throws defpackage.C6353ou {
        /*
            Method dump skipped, instructions count: 1970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TI1.h(java.lang.Object, L21):void");
    }

    public final void i(Object obj, int i, Object obj2) {
        if (o(i, obj2)) {
            int iY = y(i) & 1048575;
            Unsafe unsafe = m;
            long j = iY;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC8153yK1 interfaceC8153yK1B = B(i);
            if (!o(i, obj)) {
                if (q(object)) {
                    Object objZze = interfaceC8153yK1B.zze();
                    interfaceC8153yK1B.c(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                k(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!q(object2)) {
                Object objZze2 = interfaceC8153yK1B.zze();
                interfaceC8153yK1B.c(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            interfaceC8153yK1B.c(object2, object);
        }
    }

    public final void j(Object obj, int i, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (r(i2, i, obj2)) {
            int iY = y(i) & 1048575;
            Unsafe unsafe = m;
            long j = iY;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC8153yK1 interfaceC8153yK1B = B(i);
            if (!r(i2, i, obj)) {
                if (q(object)) {
                    Object objZze = interfaceC8153yK1B.zze();
                    interfaceC8153yK1B.c(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                HM1.n(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!q(object2)) {
                Object objZze2 = interfaceC8153yK1B.zze();
                interfaceC8153yK1B.c(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            interfaceC8153yK1B.c(object2, object);
        }
    }

    public final void k(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        HM1.n(j, obj, (1 << (i2 >>> 20)) | HM1.f(j, obj));
    }

    public final void l(Object obj, int i, Object obj2) {
        m.putObject(obj, y(i) & 1048575, obj2);
        k(i, obj);
    }

    public final void m(Object obj, int i, Object obj2, int i2) {
        m.putObject(obj, y(i2) & 1048575, obj2);
        HM1.n(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final boolean n(QG1 qg1, Object obj, int i) {
        return o(i, qg1) == o(i, obj);
    }

    public final boolean o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & HM1.f(j, obj)) != 0;
        }
        int iY = y(i);
        long j2 = iY & 1048575;
        switch (x(iY)) {
            case 0:
                return Double.doubleToRawLongBits(HM1.c.a(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(HM1.c.b(j2, obj)) != 0;
            case 2:
                return HM1.g(j2, obj) != 0;
            case 3:
                return HM1.g(j2, obj) != 0;
            case 4:
                return HM1.f(j2, obj) != 0;
            case 5:
                return HM1.g(j2, obj) != 0;
            case 6:
                return HM1.f(j2, obj) != 0;
            case 7:
                return HM1.c.g(j2, obj);
            case 8:
                Object objI = HM1.i(j2, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof JE1) {
                    return !JE1.b.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return HM1.i(j2, obj) != null;
            case 10:
                return !JE1.b.equals(HM1.i(j2, obj));
            case 11:
                return HM1.f(j2, obj) != 0;
            case 12:
                return HM1.f(j2, obj) != 0;
            case 13:
                return HM1.f(j2, obj) != 0;
            case 14:
                return HM1.g(j2, obj) != 0;
            case 15:
                return HM1.f(j2, obj) != 0;
            case 16:
                return HM1.g(j2, obj) != 0;
            case 17:
                return HM1.i(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean p(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? o(i, obj) : (i3 & i4) != 0;
    }

    public final boolean r(int i, int i2, Object obj) {
        return HM1.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:525:0x0e76  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0e22 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0aaf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0ac2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0e37 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, defpackage.C0779Jt r43) {
        /*
            Method dump skipped, instructions count: 4008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TI1.s(java.lang.Object, byte[], int, int, int, Jt):int");
    }

    public final int w(int i, int i2) {
        int[] iArr = this.a;
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

    public final int y(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.InterfaceC8153yK1
    public final Object zze() {
        return (QG1) ((QG1) this.e).m(4, null);
    }
}
