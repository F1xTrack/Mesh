package defpackage;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.appmetrica.analytics.impl.C4473c9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* renamed from: pH1 */
/* loaded from: classes.dex */
public final class C6429pH1 implements PH1 {
    public static final int[] k = new int[0];
    public static final Unsafe l = BJ1.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final DB1 e;
    public final int[] f;
    public final int g;
    public final int h;
    public final XF1 i;
    public final PI1 j;

    public C6429pH1(int[] iArr, Object[] objArr, int i, int i2, DB1 db1, int[] iArr2, int i3, int i4, XF1 xf1, PI1 pi1, ID1 id1) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = xf1;
        this.j = pi1;
        this.e = db1;
    }

    public static Field D(Class cls, String str) {
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
        if (obj instanceof EE1) {
            return ((EE1) obj).l();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:349:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C6429pH1 t(defpackage.NH1 r33, defpackage.XF1 r34, defpackage.PI1 r35, defpackage.ID1 r36) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6429pH1.t(NH1, XF1, PI1, ID1):pH1");
    }

    public static int u(long j, Object obj) {
        return ((Integer) BJ1.i(j, obj)).intValue();
    }

    public static int w(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static long y(long j, Object obj) {
        return ((Long) BJ1.i(j, obj)).longValue();
    }

    public final PH1 A(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        PH1 ph1 = (PH1) objArr[i3];
        if (ph1 != null) {
            return ph1;
        }
        PH1 ph1A = IH1.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = ph1A;
        return ph1A;
    }

    public final Object B(int i, Object obj) {
        PH1 ph1A = A(i);
        int iX = x(i) & 1048575;
        if (!o(i, obj)) {
            return ph1A.zze();
        }
        Object object = l.getObject(obj, iX);
        if (q(object)) {
            return object;
        }
        EE1 ee1Zze = ph1A.zze();
        if (object != null) {
            ph1A.c(ee1Zze, object);
        }
        return ee1Zze;
    }

    public final Object C(int i, int i2, Object obj) {
        PH1 ph1A = A(i2);
        if (!r(i, i2, obj)) {
            return ph1A.zze();
        }
        Object object = l.getObject(obj, x(i2) & 1048575);
        if (q(object)) {
            return object;
        }
        EE1 ee1Zze = ph1A.zze();
        if (object != null) {
            ph1A.c(ee1Zze, object);
        }
        return ee1Zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0068  */
    @Override // defpackage.PH1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = q(r7)
            if (r0 != 0) goto L8
            goto L86
        L8:
            boolean r0 = r7 instanceof defpackage.EE1
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r7
            EE1 r0 = (defpackage.EE1) r0
            r0.j()
            r0.zza = r1
            r0.h()
        L18:
            int[] r0 = r6.a
            int r2 = r0.length
            if (r1 >= r2) goto L7e
            int r2 = r6.x(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = w(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L68
            r5 = 60
            if (r2 == r5) goto L52
            r5 = 68
            if (r2 == r5) goto L52
            switch(r2) {
                case 17: goto L68;
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
            goto L7b
        L3a:
            sun.misc.Unsafe r0 = defpackage.C6429pH1.l
            java.lang.Object r2 = r0.getObject(r7, r3)
            if (r2 == 0) goto L7b
            r5 = r2
            FG1 r5 = (defpackage.FG1) r5
            r5.i()
            r0.putObject(r7, r3, r2)
            goto L7b
        L4c:
            XF1 r0 = r6.i
            r0.a(r3, r7)
            goto L7b
        L52:
            r0 = r0[r1]
            boolean r0 = r6.r(r0, r1, r7)
            if (r0 == 0) goto L7b
            PH1 r0 = r6.A(r1)
            sun.misc.Unsafe r2 = defpackage.C6429pH1.l
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.a(r2)
            goto L7b
        L68:
            boolean r0 = r6.o(r1, r7)
            if (r0 == 0) goto L7b
            PH1 r0 = r6.A(r1)
            sun.misc.Unsafe r2 = defpackage.C6429pH1.l
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.a(r2)
        L7b:
            int r1 = r1 + 3
            goto L18
        L7e:
            PI1 r0 = r6.j
            r0.getClass()
            defpackage.PI1.c(r7)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6429pH1.a(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x00a5  */
    @Override // defpackage.PH1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6429pH1.b(java.lang.Object):boolean");
    }

    @Override // defpackage.PH1
    public final void c(Object obj, Object obj2) {
        if (!q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                UH1.t(this.j, obj, obj2);
                return;
            }
            int iX = x(i);
            int i2 = iX & 1048575;
            int iW = w(iX);
            int i3 = iArr[i];
            long j = i2;
            switch (iW) {
                case 0:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.l(obj, j, BJ1.c.a(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 1:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m(obj, j, BJ1.c.b(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 2:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.o(j, BJ1.g(j, obj2), obj);
                        k(i, obj);
                        break;
                    }
                case 3:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.o(j, BJ1.g(j, obj2), obj);
                        k(i, obj);
                        break;
                    }
                case 4:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.n(j, obj, BJ1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 5:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.o(j, BJ1.g(j, obj2), obj);
                        k(i, obj);
                        break;
                    }
                case 6:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.n(j, obj, BJ1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 7:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.k(obj, j, BJ1.c.g(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 8:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.p(j, obj, BJ1.i(j, obj2));
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
                        BJ1.p(j, obj, BJ1.i(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 11:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.n(j, obj, BJ1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 12:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.n(j, obj, BJ1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 13:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.n(j, obj, BJ1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 14:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.o(j, BJ1.g(j, obj2), obj);
                        k(i, obj);
                        break;
                    }
                case 15:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.n(j, obj, BJ1.f(j, obj2));
                        k(i, obj);
                        break;
                    }
                case 16:
                    if (!o(i, obj2)) {
                        break;
                    } else {
                        BJ1.o(j, BJ1.g(j, obj2), obj);
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
                    this.i.b(j, obj, obj2);
                    break;
                case 50:
                    Class cls = UH1.a;
                    BJ1.p(j, obj, JG1.a(BJ1.i(j, obj), BJ1.i(j, obj2)));
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
                        BJ1.p(j, obj, BJ1.i(j, obj2));
                        BJ1.n(iArr[i + 2] & 1048575, obj, i3);
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
                        BJ1.p(j, obj, BJ1.i(j, obj2));
                        BJ1.n(iArr[i + 2] & 1048575, obj, i3);
                        break;
                    }
                case 68:
                    j(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:206:0x01ea, B:164:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.PH1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.EE1 r11) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6429pH1.d(EE1):int");
    }

    @Override // defpackage.PH1
    public final boolean e(EE1 ee1, Object obj) {
        boolean zF;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.j.getClass();
                return ee1.zzc.equals(((EE1) obj).zzc);
            }
            int iX = x(i);
            long j = iX & 1048575;
            switch (w(iX)) {
                case 0:
                    if (!n(ee1, obj, i)) {
                        break;
                    } else {
                        AbstractC5862mJ1 abstractC5862mJ1 = BJ1.c;
                        if (Double.doubleToLongBits(abstractC5862mJ1.a(j, ee1)) != Double.doubleToLongBits(abstractC5862mJ1.a(j, obj))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 1:
                    if (!n(ee1, obj, i)) {
                        break;
                    } else {
                        AbstractC5862mJ1 abstractC5862mJ12 = BJ1.c;
                        if (Float.floatToIntBits(abstractC5862mJ12.b(j, ee1)) != Float.floatToIntBits(abstractC5862mJ12.b(j, obj))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 2:
                    if (!n(ee1, obj, i) || BJ1.g(j, ee1) != BJ1.g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 3:
                    if (!n(ee1, obj, i) || BJ1.g(j, ee1) != BJ1.g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 4:
                    if (!n(ee1, obj, i) || BJ1.f(j, ee1) != BJ1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 5:
                    if (!n(ee1, obj, i) || BJ1.g(j, ee1) != BJ1.g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 6:
                    if (!n(ee1, obj, i) || BJ1.f(j, ee1) != BJ1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 7:
                    if (!n(ee1, obj, i)) {
                        break;
                    } else {
                        AbstractC5862mJ1 abstractC5862mJ13 = BJ1.c;
                        if (abstractC5862mJ13.g(j, ee1) != abstractC5862mJ13.g(j, obj)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 8:
                    if (!n(ee1, obj, i) || !UH1.f(BJ1.i(j, ee1), BJ1.i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 9:
                    if (!n(ee1, obj, i) || !UH1.f(BJ1.i(j, ee1), BJ1.i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 10:
                    if (!n(ee1, obj, i) || !UH1.f(BJ1.i(j, ee1), BJ1.i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 11:
                    if (!n(ee1, obj, i) || BJ1.f(j, ee1) != BJ1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 12:
                    if (!n(ee1, obj, i) || BJ1.f(j, ee1) != BJ1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 13:
                    if (!n(ee1, obj, i) || BJ1.f(j, ee1) != BJ1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 14:
                    if (!n(ee1, obj, i) || BJ1.g(j, ee1) != BJ1.g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 15:
                    if (!n(ee1, obj, i) || BJ1.f(j, ee1) != BJ1.f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 16:
                    if (!n(ee1, obj, i) || BJ1.g(j, ee1) != BJ1.g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 17:
                    if (!n(ee1, obj, i) || !UH1.f(BJ1.i(j, ee1), BJ1.i(j, obj))) {
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
                    zF = UH1.f(BJ1.i(j, ee1), BJ1.i(j, obj));
                    break;
                case 50:
                    zF = UH1.f(BJ1.i(j, ee1), BJ1.i(j, obj));
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
                    if (BJ1.f(j2, ee1) != BJ1.f(j2, obj) || !UH1.f(BJ1.i(j, ee1), BJ1.i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                default:
                    i += 3;
            }
            if (zF) {
                i += 3;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:385:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x05b8 A[PHI: r10
  0x05b8: PHI (r10v13 int) = (r10v0 int), (r10v1 int), (r10v5 int), (r10v6 int), (r10v12 int), (r10v14 int) binds: [B:614:0x0730, B:611:0x071f, B:599:0x06b0, B:596:0x069f, B:572:0x05cd, B:569:0x05b6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.PH1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.EE1 r19) {
        /*
            Method dump skipped, instructions count: 2012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6429pH1.f(EE1):int");
    }

    @Override // defpackage.PH1
    public final void g(Object obj, byte[] bArr, int i, int i2, C0374Eo c0374Eo) throws C5659lF1 {
        s(obj, bArr, i, i2, 0, c0374Eo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.PH1
    public final void h(Object obj, C6273oT0 c6273oT0) {
        int i;
        int i2;
        int i3;
        Unsafe unsafe = l;
        int i4 = 1048575;
        boolean z = 0;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                this.j.getClass();
                PI1.d(PI1.b(obj), c6273oT0);
                return;
            }
            int iX = x(i7);
            int iW = w(iX);
            int i8 = iArr[i7];
            if (iW <= 17) {
                int i9 = iArr[i7 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i6 = i10 == i4 ? z : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i3 = 1 << (i9 >>> 20);
                i = i5;
                i2 = i6;
            } else {
                i = i5;
                i2 = i6;
                i3 = z;
            }
            long j = iX & i4;
            switch (iW) {
                case 0:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.A(i8, BJ1.d(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.E(BJ1.e(j, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.H(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.t(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.G(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.D(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.C(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.w(i8, BJ1.t(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (p(obj, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C5271jD1) c6273oT0.a).j(i8, (String) object);
                            break;
                        } else {
                            c6273oT0.y(i8, (C8129yC1) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.I(i8, unsafe.getObject(obj, j), A(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.y(i8, (C8129yC1) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.s(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.B(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.J(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.K(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.n(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.p(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (p(obj, i7, i, i2, i3)) {
                        c6273oT0.F(i8, unsafe.getObject(obj, j), A(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    UH1.v(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 19:
                    UH1.z(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 20:
                    UH1.B(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 21:
                    UH1.e(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 22:
                    UH1.A(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 23:
                    UH1.y(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 24:
                    UH1.x(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 25:
                    UH1.u(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 26:
                    int i11 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = UH1.a;
                    if (list != null && !list.isEmpty()) {
                        c6273oT0.r(i11, list);
                        break;
                    } else {
                        break;
                    }
                case 27:
                    int i12 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    PH1 ph1A = A(i7);
                    Class cls2 = UH1.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = z; i13 < list2.size(); i13++) {
                            c6273oT0.I(i12, list2.get(i13), ph1A);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    int i14 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = UH1.a;
                    if (list3 != null && !list3.isEmpty()) {
                        c6273oT0.z(i14, list3);
                        break;
                    } else {
                        break;
                    }
                    break;
                case 29:
                    UH1.d(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 30:
                    UH1.w(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 31:
                    UH1.C(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 32:
                    UH1.a(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 33:
                    UH1.b(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case 34:
                    UH1.c(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, z);
                    break;
                case C4473c9.J /* 35 */:
                    UH1.v(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    UH1.z(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case 37:
                    UH1.B(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case C4473c9.K /* 38 */:
                    UH1.e(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case 39:
                    UH1.A(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case C4473c9.L /* 40 */:
                    UH1.y(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case 41:
                    UH1.x(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case C4473c9.M /* 42 */:
                    UH1.u(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case 43:
                    UH1.d(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case 44:
                    UH1.w(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case 45:
                    UH1.C(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case 46:
                    UH1.a(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case 47:
                    UH1.b(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case 48:
                    UH1.c(iArr[i7], (List) unsafe.getObject(obj, j), c6273oT0, true);
                    break;
                case 49:
                    int i15 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    PH1 ph1A2 = A(i7);
                    Class cls4 = UH1.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i16 = z; i16 < list4.size(); i16++) {
                            c6273oT0.F(i15, list4.get(i16), ph1A2);
                        }
                        break;
                    } else {
                        break;
                    }
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        int i17 = i7 / 3;
                        AbstractC1705Vq.p(this.b[i17 + i17]);
                        throw null;
                    }
                    break;
                case 51:
                    if (r(i8, i7, obj)) {
                        c6273oT0.A(i8, ((Double) BJ1.i(j, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i8, i7, obj)) {
                        c6273oT0.E(((Float) BJ1.i(j, obj)).floatValue(), i8);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i8, i7, obj)) {
                        c6273oT0.H(i8, y(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i8, i7, obj)) {
                        c6273oT0.t(i8, y(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i8, i7, obj)) {
                        c6273oT0.G(i8, u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i8, i7, obj)) {
                        c6273oT0.D(i8, y(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i8, i7, obj)) {
                        c6273oT0.C(i8, u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i8, i7, obj)) {
                        c6273oT0.w(i8, ((Boolean) BJ1.i(j, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i8, i7, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((C5271jD1) c6273oT0.a).j(i8, (String) object2);
                            break;
                        } else {
                            c6273oT0.y(i8, (C8129yC1) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (r(i8, i7, obj)) {
                        c6273oT0.I(i8, unsafe.getObject(obj, j), A(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i8, i7, obj)) {
                        c6273oT0.y(i8, (C8129yC1) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i8, i7, obj)) {
                        c6273oT0.s(i8, u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i8, i7, obj)) {
                        c6273oT0.B(i8, u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (r(i8, i7, obj)) {
                        c6273oT0.J(i8, u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i8, i7, obj)) {
                        c6273oT0.K(i8, y(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i8, i7, obj)) {
                        c6273oT0.n(i8, u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i8, i7, obj)) {
                        c6273oT0.p(i8, y(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i8, i7, obj)) {
                        c6273oT0.F(i8, unsafe.getObject(obj, j), A(i7));
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
            z = 0;
        }
    }

    public final void i(Object obj, int i, Object obj2) {
        if (o(i, obj2)) {
            int iX = x(i) & 1048575;
            Unsafe unsafe = l;
            long j = iX;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            PH1 ph1A = A(i);
            if (!o(i, obj)) {
                if (q(object)) {
                    EE1 ee1Zze = ph1A.zze();
                    ph1A.c(ee1Zze, object);
                    unsafe.putObject(obj, j, ee1Zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                k(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!q(object2)) {
                EE1 ee1Zze2 = ph1A.zze();
                ph1A.c(ee1Zze2, object2);
                unsafe.putObject(obj, j, ee1Zze2);
                object2 = ee1Zze2;
            }
            ph1A.c(object2, object);
        }
    }

    public final void j(Object obj, int i, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (r(i2, i, obj2)) {
            int iX = x(i) & 1048575;
            Unsafe unsafe = l;
            long j = iX;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            PH1 ph1A = A(i);
            if (!r(i2, i, obj)) {
                if (q(object)) {
                    EE1 ee1Zze = ph1A.zze();
                    ph1A.c(ee1Zze, object);
                    unsafe.putObject(obj, j, ee1Zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                BJ1.n(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!q(object2)) {
                EE1 ee1Zze2 = ph1A.zze();
                ph1A.c(ee1Zze2, object2);
                unsafe.putObject(obj, j, ee1Zze2);
                object2 = ee1Zze2;
            }
            ph1A.c(object2, object);
        }
    }

    public final void k(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        BJ1.n(j, obj, (1 << (i2 >>> 20)) | BJ1.f(j, obj));
    }

    public final void l(Object obj, int i, Object obj2) {
        l.putObject(obj, x(i) & 1048575, obj2);
        k(i, obj);
    }

    public final void m(Object obj, int i, Object obj2, int i2) {
        l.putObject(obj, x(i2) & 1048575, obj2);
        BJ1.n(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final boolean n(EE1 ee1, Object obj, int i) {
        return o(i, ee1) == o(i, obj);
    }

    public final boolean o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & BJ1.f(j, obj)) != 0;
        }
        int iX = x(i);
        long j2 = iX & 1048575;
        switch (w(iX)) {
            case 0:
                return Double.doubleToRawLongBits(BJ1.c.a(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(BJ1.c.b(j2, obj)) != 0;
            case 2:
                return BJ1.g(j2, obj) != 0;
            case 3:
                return BJ1.g(j2, obj) != 0;
            case 4:
                return BJ1.f(j2, obj) != 0;
            case 5:
                return BJ1.g(j2, obj) != 0;
            case 6:
                return BJ1.f(j2, obj) != 0;
            case 7:
                return BJ1.c.g(j2, obj);
            case 8:
                Object objI = BJ1.i(j2, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof C8129yC1) {
                    return !C8129yC1.c.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return BJ1.i(j2, obj) != null;
            case 10:
                return !C8129yC1.c.equals(BJ1.i(j2, obj));
            case 11:
                return BJ1.f(j2, obj) != 0;
            case 12:
                return BJ1.f(j2, obj) != 0;
            case 13:
                return BJ1.f(j2, obj) != 0;
            case 14:
                return BJ1.g(j2, obj) != 0;
            case 15:
                return BJ1.f(j2, obj) != 0;
            case 16:
                return BJ1.g(j2, obj) != 0;
            case 17:
                return BJ1.i(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean p(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? o(i, obj) : (i3 & i4) != 0;
    }

    public final boolean r(int i, int i2, Object obj) {
        return BJ1.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1274:0x0ec7, code lost:
    
        if (r0 == r3) goto L1276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1275:0x0ec9, code lost:
    
        r35.putInt(r39, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1276:0x0ecf, code lost:
    
        r0 = r11.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1278:0x0ed3, code lost:
    
        if (r0 >= r11.h) goto L1406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1279:0x0ed5, code lost:
    
        r1 = r11.f[r0];
        r3 = r16[r1];
        r3 = defpackage.BJ1.i(r11.x(r1) & 1048575, r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1280:0x0ee8, code lost:
    
        if (r3 != null) goto L1282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1283:0x0ef0, code lost:
    
        if (r11.z(r1) != null) goto L1405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1285:0x0ef3, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1286:0x0ef5, code lost:
    
        r3 = (defpackage.FG1) r3;
        r1 = r1 / 3;
        defpackage.AbstractC1705Vq.p(r24[r1 + r1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1287:0x0eff, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1288:0x0f00, code lost:
    
        if (r9 != 0) goto L1294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1290:0x0f04, code lost:
    
        if (r8 != r42) goto L1292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1293:0x0f0b, code lost:
    
        throw defpackage.C5659lF1.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1295:0x0f0e, code lost:
    
        if (r8 > r42) goto L1298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1296:0x0f10, code lost:
    
        if (r2 != r9) goto L1298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1297:0x0f12, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1299:0x0f17, code lost:
    
        throw defpackage.C5659lF1.c();
     */
    /* JADX WARN: Removed duplicated region for block: B:1165:0x0b69  */
    /* JADX WARN: Removed duplicated region for block: B:1167:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:1328:0x0e53 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1394:0x0e69 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:822:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, defpackage.C0374Eo r44) throws defpackage.C5659lF1 {
        /*
            Method dump skipped, instructions count: 4026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6429pH1.s(java.lang.Object, byte[], int, int, int, Eo):int");
    }

    public final int v(int i, int i2) {
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

    public final int x(int i) {
        return this.a[i + 1];
    }

    public final OE1 z(int i) {
        int i2 = i / 3;
        return (OE1) this.b[i2 + i2 + 1];
    }

    @Override // defpackage.PH1
    public final EE1 zze() {
        return (EE1) ((EE1) this.e).m(4);
    }
}
