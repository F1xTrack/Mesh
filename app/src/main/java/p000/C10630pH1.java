package p000;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.appmetrica.analytics.impl.C5043c9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* renamed from: pH1 */
/* loaded from: classes.dex */
public final class C10630pH1 implements PH1 {

    /* renamed from: k */
    public static final int[] f40000k = new int[0];

    /* renamed from: l */
    public static final Unsafe f40001l = BJ1.m590j();

    /* renamed from: a */
    public final int[] f40002a;

    /* renamed from: b */
    public final Object[] f40003b;

    /* renamed from: c */
    public final int f40004c;

    /* renamed from: d */
    public final int f40005d;

    /* renamed from: e */
    public final DB1 f40006e;

    /* renamed from: f */
    public final int[] f40007f;

    /* renamed from: g */
    public final int f40008g;

    /* renamed from: h */
    public final int f40009h;

    /* renamed from: i */
    public final XF1 f40010i;

    /* renamed from: j */
    public final PI1 f40011j;

    public C10630pH1(int[] iArr, Object[] objArr, int i, int i2, DB1 db1, int[] iArr2, int i3, int i4, XF1 xf1, PI1 pi1, ID1 id1) {
        this.f40002a = iArr;
        this.f40003b = objArr;
        this.f40004c = i;
        this.f40005d = i2;
        this.f40007f = iArr2;
        this.f40008g = i3;
        this.f40009h = i4;
        this.f40010i = xf1;
        this.f40011j = pi1;
        this.f40006e = db1;
    }

    /* renamed from: D */
    public static Field m23699D(Class cls, String str) {
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

    /* renamed from: q */
    public static boolean m23700q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof EE1) {
            return ((EE1) obj).m2099l();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:349:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0283  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C10630pH1 m23701t(p000.NH1 r33, p000.XF1 r34, p000.PI1 r35, p000.ID1 r36) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10630pH1.m23701t(NH1, XF1, PI1, ID1):pH1");
    }

    /* renamed from: u */
    public static int m23702u(long j, Object obj) {
        return ((Integer) BJ1.m589i(j, obj)).intValue();
    }

    /* renamed from: w */
    public static int m23703w(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: y */
    public static long m23704y(long j, Object obj) {
        return ((Long) BJ1.m589i(j, obj)).longValue();
    }

    /* renamed from: A */
    public final PH1 m23705A(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f40003b;
        PH1 ph1 = (PH1) objArr[i3];
        if (ph1 != null) {
            return ph1;
        }
        PH1 ph1M3806a = IH1.f4877c.m3806a((Class) objArr[i3 + 1]);
        objArr[i3] = ph1M3806a;
        return ph1M3806a;
    }

    /* renamed from: B */
    public final Object m23706B(int i, Object obj) {
        PH1 ph1M23705A = m23705A(i);
        int iM23719x = m23719x(i) & 1048575;
        if (!m23714o(i, obj)) {
            return ph1M23705A.zze();
        }
        Object object = f40001l.getObject(obj, iM23719x);
        if (m23700q(object)) {
            return object;
        }
        EE1 ee1Zze = ph1M23705A.zze();
        if (object != null) {
            ph1M23705A.mo6288c(ee1Zze, object);
        }
        return ee1Zze;
    }

    /* renamed from: C */
    public final Object m23707C(int i, int i2, Object obj) {
        PH1 ph1M23705A = m23705A(i2);
        if (!m23716r(i, i2, obj)) {
            return ph1M23705A.zze();
        }
        Object object = f40001l.getObject(obj, m23719x(i2) & 1048575);
        if (m23700q(object)) {
            return object;
        }
        EE1 ee1Zze = ph1M23705A.zze();
        if (object != null) {
            ph1M23705A.mo6288c(ee1Zze, object);
        }
        return ee1Zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0068  */
    @Override // p000.PH1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6286a(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = m23700q(r7)
            if (r0 != 0) goto L8
            goto L86
        L8:
            boolean r0 = r7 instanceof p000.EE1
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r7
            EE1 r0 = (p000.EE1) r0
            r0.m2097j()
            r0.zza = r1
            r0.m2096h()
        L18:
            int[] r0 = r6.f40002a
            int r2 = r0.length
            if (r1 >= r2) goto L7e
            int r2 = r6.m23719x(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = m23703w(r2)
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
            sun.misc.Unsafe r0 = p000.C10630pH1.f40001l
            java.lang.Object r2 = r0.getObject(r7, r3)
            if (r2 == 0) goto L7b
            r5 = r2
            FG1 r5 = (p000.FG1) r5
            r5.m2574i()
            r0.putObject(r7, r3, r2)
            goto L7b
        L4c:
            XF1 r0 = r6.f40010i
            r0.mo4937a(r3, r7)
            goto L7b
        L52:
            r0 = r0[r1]
            boolean r0 = r6.m23716r(r0, r1, r7)
            if (r0 == 0) goto L7b
            PH1 r0 = r6.m23705A(r1)
            sun.misc.Unsafe r2 = p000.C10630pH1.f40001l
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.mo6286a(r2)
            goto L7b
        L68:
            boolean r0 = r6.m23714o(r1, r7)
            if (r0 == 0) goto L7b
            PH1 r0 = r6.m23705A(r1)
            sun.misc.Unsafe r2 = p000.C10630pH1.f40001l
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.mo6286a(r2)
        L7b:
            int r1 = r1 + 3
            goto L18
        L7e:
            PI1 r0 = r6.f40011j
            r0.getClass()
            p000.PI1.m6299c(r7)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10630pH1.mo6286a(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x00a5  */
    @Override // p000.PH1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo6287b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10630pH1.mo6287b(java.lang.Object):boolean");
    }

    @Override // p000.PH1
    /* renamed from: c */
    public final void mo6288c(Object obj, Object obj2) {
        if (!m23700q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f40002a;
            if (i >= iArr.length) {
                UH1.m7977t(this.f40011j, obj, obj2);
                return;
            }
            int iM23719x = m23719x(i);
            int i2 = iM23719x & 1048575;
            int iM23703w = m23703w(iM23719x);
            int i3 = iArr[i];
            long j = i2;
            switch (iM23703w) {
                case 0:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m592l(obj, j, BJ1.f711c.mo159a(j, obj2));
                        m23710k(i, obj);
                        break;
                    }
                case 1:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m593m(obj, j, BJ1.f711c.mo160b(j, obj2));
                        m23710k(i, obj);
                        break;
                    }
                case 2:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m595o(j, BJ1.m587g(j, obj2), obj);
                        m23710k(i, obj);
                        break;
                    }
                case 3:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m595o(j, BJ1.m587g(j, obj2), obj);
                        m23710k(i, obj);
                        break;
                    }
                case 4:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m594n(j, obj, BJ1.m586f(j, obj2));
                        m23710k(i, obj);
                        break;
                    }
                case 5:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m595o(j, BJ1.m587g(j, obj2), obj);
                        m23710k(i, obj);
                        break;
                    }
                case 6:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m594n(j, obj, BJ1.m586f(j, obj2));
                        m23710k(i, obj);
                        break;
                    }
                case 7:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m591k(obj, j, BJ1.f711c.mo165g(j, obj2));
                        m23710k(i, obj);
                        break;
                    }
                case 8:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m596p(j, obj, BJ1.m589i(j, obj2));
                        m23710k(i, obj);
                        break;
                    }
                case 9:
                    m23708i(obj, i, obj2);
                    break;
                case 10:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m596p(j, obj, BJ1.m589i(j, obj2));
                        m23710k(i, obj);
                        break;
                    }
                case 11:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m594n(j, obj, BJ1.m586f(j, obj2));
                        m23710k(i, obj);
                        break;
                    }
                case 12:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m594n(j, obj, BJ1.m586f(j, obj2));
                        m23710k(i, obj);
                        break;
                    }
                case 13:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m594n(j, obj, BJ1.m586f(j, obj2));
                        m23710k(i, obj);
                        break;
                    }
                case 14:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m595o(j, BJ1.m587g(j, obj2), obj);
                        m23710k(i, obj);
                        break;
                    }
                case 15:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m594n(j, obj, BJ1.m586f(j, obj2));
                        m23710k(i, obj);
                        break;
                    }
                case 16:
                    if (!m23714o(i, obj2)) {
                        break;
                    } else {
                        BJ1.m595o(j, BJ1.m587g(j, obj2), obj);
                        m23710k(i, obj);
                        break;
                    }
                case 17:
                    m23708i(obj, i, obj2);
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
                    this.f40010i.mo4938b(j, obj, obj2);
                    break;
                case 50:
                    Class cls = UH1.f11716a;
                    BJ1.m596p(j, obj, JG1.m4272a(BJ1.m589i(j, obj), BJ1.m589i(j, obj2)));
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
                    if (!m23716r(i3, i, obj2)) {
                        break;
                    } else {
                        BJ1.m596p(j, obj, BJ1.m589i(j, obj2));
                        BJ1.m594n(iArr[i + 2] & 1048575, obj, i3);
                        break;
                    }
                case 60:
                    m23709j(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case NativeMac.KEY_LENGTH /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (!m23716r(i3, i, obj2)) {
                        break;
                    } else {
                        BJ1.m596p(j, obj, BJ1.m589i(j, obj2));
                        BJ1.m594n(iArr[i + 2] & 1048575, obj, i3);
                        break;
                    }
                case 68:
                    m23709j(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:206:0x01ea, B:164:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.PH1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo6289d(p000.EE1 r11) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10630pH1.mo6289d(EE1):int");
    }

    @Override // p000.PH1
    /* renamed from: e */
    public final boolean mo6290e(EE1 ee1, Object obj) {
        boolean zM7963f;
        int i = 0;
        while (true) {
            int[] iArr = this.f40002a;
            if (i >= iArr.length) {
                this.f40011j.getClass();
                return ee1.zzc.equals(((EE1) obj).zzc);
            }
            int iM23719x = m23719x(i);
            long j = iM23719x & 1048575;
            switch (m23703w(iM23719x)) {
                case 0:
                    if (!m23713n(ee1, obj, i)) {
                        break;
                    } else {
                        AbstractC10250mJ1 abstractC10250mJ1 = BJ1.f711c;
                        if (Double.doubleToLongBits(abstractC10250mJ1.mo159a(j, ee1)) != Double.doubleToLongBits(abstractC10250mJ1.mo159a(j, obj))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 1:
                    if (!m23713n(ee1, obj, i)) {
                        break;
                    } else {
                        AbstractC10250mJ1 abstractC10250mJ12 = BJ1.f711c;
                        if (Float.floatToIntBits(abstractC10250mJ12.mo160b(j, ee1)) != Float.floatToIntBits(abstractC10250mJ12.mo160b(j, obj))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 2:
                    if (!m23713n(ee1, obj, i) || BJ1.m587g(j, ee1) != BJ1.m587g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 3:
                    if (!m23713n(ee1, obj, i) || BJ1.m587g(j, ee1) != BJ1.m587g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 4:
                    if (!m23713n(ee1, obj, i) || BJ1.m586f(j, ee1) != BJ1.m586f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 5:
                    if (!m23713n(ee1, obj, i) || BJ1.m587g(j, ee1) != BJ1.m587g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 6:
                    if (!m23713n(ee1, obj, i) || BJ1.m586f(j, ee1) != BJ1.m586f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 7:
                    if (!m23713n(ee1, obj, i)) {
                        break;
                    } else {
                        AbstractC10250mJ1 abstractC10250mJ13 = BJ1.f711c;
                        if (abstractC10250mJ13.mo165g(j, ee1) != abstractC10250mJ13.mo165g(j, obj)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 8:
                    if (!m23713n(ee1, obj, i) || !UH1.m7963f(BJ1.m589i(j, ee1), BJ1.m589i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 9:
                    if (!m23713n(ee1, obj, i) || !UH1.m7963f(BJ1.m589i(j, ee1), BJ1.m589i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 10:
                    if (!m23713n(ee1, obj, i) || !UH1.m7963f(BJ1.m589i(j, ee1), BJ1.m589i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 11:
                    if (!m23713n(ee1, obj, i) || BJ1.m586f(j, ee1) != BJ1.m586f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 12:
                    if (!m23713n(ee1, obj, i) || BJ1.m586f(j, ee1) != BJ1.m586f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 13:
                    if (!m23713n(ee1, obj, i) || BJ1.m586f(j, ee1) != BJ1.m586f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 14:
                    if (!m23713n(ee1, obj, i) || BJ1.m587g(j, ee1) != BJ1.m587g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 15:
                    if (!m23713n(ee1, obj, i) || BJ1.m586f(j, ee1) != BJ1.m586f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 16:
                    if (!m23713n(ee1, obj, i) || BJ1.m587g(j, ee1) != BJ1.m587g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 17:
                    if (!m23713n(ee1, obj, i) || !UH1.m7963f(BJ1.m589i(j, ee1), BJ1.m589i(j, obj))) {
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
                    zM7963f = UH1.m7963f(BJ1.m589i(j, ee1), BJ1.m589i(j, obj));
                    break;
                case 50:
                    zM7963f = UH1.m7963f(BJ1.m589i(j, ee1), BJ1.m589i(j, obj));
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
                    if (BJ1.m586f(j2, ee1) != BJ1.m586f(j2, obj) || !UH1.m7963f(BJ1.m589i(j, ee1), BJ1.m589i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                default:
                    i += 3;
            }
            if (zM7963f) {
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
    @Override // p000.PH1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo6291f(p000.EE1 r19) {
        /*
            Method dump skipped, instructions count: 2012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10630pH1.mo6291f(EE1):int");
    }

    @Override // p000.PH1
    /* renamed from: g */
    public final void mo6292g(Object obj, byte[] bArr, int i, int i2, C0303Eo c0303Eo) throws C10114lF1 {
        m23717s(obj, bArr, i, i2, 0, c0303Eo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.PH1
    /* renamed from: h */
    public final void mo6293h(Object obj, C10525oT0 c10525oT0) {
        int i;
        int i2;
        int i3;
        Unsafe unsafe = f40001l;
        int i4 = 1048575;
        boolean z = 0;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f40002a;
            if (i7 >= iArr.length) {
                this.f40011j.getClass();
                PI1.m6300d(PI1.m6298b(obj), c10525oT0);
                return;
            }
            int iM23719x = m23719x(i7);
            int iM23703w = m23703w(iM23719x);
            int i8 = iArr[i7];
            if (iM23703w <= 17) {
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
            long j = iM23719x & i4;
            switch (iM23703w) {
                case 0:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23416A(i8, BJ1.m584d(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23420E(BJ1.m585e(j, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23423H(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23432t(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23422G(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23419D(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23418C(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23434w(i8, BJ1.m600t(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C9854jD1) c10525oT0.f39025a).m22001j(i8, (String) object);
                            break;
                        } else {
                            c10525oT0.m23436y(i8, (C11769yC1) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23424I(i8, unsafe.getObject(obj, j), m23705A(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23436y(i8, (C11769yC1) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23431s(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23417B(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23425J(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23426K(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23428n(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23429p(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m23715p(obj, i7, i, i2, i3)) {
                        c10525oT0.m23421F(i8, unsafe.getObject(obj, j), m23705A(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    UH1.m7979v(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 19:
                    UH1.m7983z(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 20:
                    UH1.m7956B(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 21:
                    UH1.m7962e(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 22:
                    UH1.m7955A(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 23:
                    UH1.m7982y(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 24:
                    UH1.m7981x(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 25:
                    UH1.m7978u(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 26:
                    int i11 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = UH1.f11716a;
                    if (list != null && !list.isEmpty()) {
                        c10525oT0.m23430r(i11, list);
                        break;
                    } else {
                        break;
                    }
                case 27:
                    int i12 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    PH1 ph1M23705A = m23705A(i7);
                    Class cls2 = UH1.f11716a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = z; i13 < list2.size(); i13++) {
                            c10525oT0.m23424I(i12, list2.get(i13), ph1M23705A);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    int i14 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = UH1.f11716a;
                    if (list3 != null && !list3.isEmpty()) {
                        c10525oT0.m23437z(i14, list3);
                        break;
                    } else {
                        break;
                    }
                    break;
                case 29:
                    UH1.m7961d(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 30:
                    UH1.m7980w(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 31:
                    UH1.m7957C(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 32:
                    UH1.m7958a(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 33:
                    UH1.m7959b(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case 34:
                    UH1.m7960c(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, z);
                    break;
                case C5043c9.f31374J /* 35 */:
                    UH1.m7979v(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    UH1.m7983z(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case 37:
                    UH1.m7956B(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case C5043c9.f31375K /* 38 */:
                    UH1.m7962e(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case 39:
                    UH1.m7955A(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case C5043c9.f31376L /* 40 */:
                    UH1.m7982y(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case 41:
                    UH1.m7981x(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case C5043c9.f31377M /* 42 */:
                    UH1.m7978u(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case 43:
                    UH1.m7961d(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case 44:
                    UH1.m7980w(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case 45:
                    UH1.m7957C(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case 46:
                    UH1.m7958a(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case 47:
                    UH1.m7959b(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case 48:
                    UH1.m7960c(iArr[i7], (List) unsafe.getObject(obj, j), c10525oT0, true);
                    break;
                case 49:
                    int i15 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    PH1 ph1M23705A2 = m23705A(i7);
                    Class cls4 = UH1.f11716a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i16 = z; i16 < list4.size(); i16++) {
                            c10525oT0.m23421F(i15, list4.get(i16), ph1M23705A2);
                        }
                        break;
                    } else {
                        break;
                    }
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        int i17 = i7 / 3;
                        AbstractC1374Vq.m8597p(this.f40003b[i17 + i17]);
                        throw null;
                    }
                    break;
                case 51:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23416A(i8, ((Double) BJ1.m589i(j, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23420E(((Float) BJ1.m589i(j, obj)).floatValue(), i8);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23423H(i8, m23704y(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23432t(i8, m23704y(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23422G(i8, m23702u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23419D(i8, m23704y(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23418C(i8, m23702u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23434w(i8, ((Boolean) BJ1.m589i(j, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m23716r(i8, i7, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((C9854jD1) c10525oT0.f39025a).m22001j(i8, (String) object2);
                            break;
                        } else {
                            c10525oT0.m23436y(i8, (C11769yC1) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23424I(i8, unsafe.getObject(obj, j), m23705A(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23436y(i8, (C11769yC1) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23431s(i8, m23702u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23417B(i8, m23702u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23425J(i8, m23702u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23426K(i8, m23704y(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23428n(i8, m23702u(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23429p(i8, m23704y(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m23716r(i8, i7, obj)) {
                        c10525oT0.m23421F(i8, unsafe.getObject(obj, j), m23705A(i7));
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

    /* renamed from: i */
    public final void m23708i(Object obj, int i, Object obj2) {
        if (m23714o(i, obj2)) {
            int iM23719x = m23719x(i) & 1048575;
            Unsafe unsafe = f40001l;
            long j = iM23719x;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f40002a[i] + " is present but null: " + obj2.toString());
            }
            PH1 ph1M23705A = m23705A(i);
            if (!m23714o(i, obj)) {
                if (m23700q(object)) {
                    EE1 ee1Zze = ph1M23705A.zze();
                    ph1M23705A.mo6288c(ee1Zze, object);
                    unsafe.putObject(obj, j, ee1Zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m23710k(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m23700q(object2)) {
                EE1 ee1Zze2 = ph1M23705A.zze();
                ph1M23705A.mo6288c(ee1Zze2, object2);
                unsafe.putObject(obj, j, ee1Zze2);
                object2 = ee1Zze2;
            }
            ph1M23705A.mo6288c(object2, object);
        }
    }

    /* renamed from: j */
    public final void m23709j(Object obj, int i, Object obj2) {
        int[] iArr = this.f40002a;
        int i2 = iArr[i];
        if (m23716r(i2, i, obj2)) {
            int iM23719x = m23719x(i) & 1048575;
            Unsafe unsafe = f40001l;
            long j = iM23719x;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            PH1 ph1M23705A = m23705A(i);
            if (!m23716r(i2, i, obj)) {
                if (m23700q(object)) {
                    EE1 ee1Zze = ph1M23705A.zze();
                    ph1M23705A.mo6288c(ee1Zze, object);
                    unsafe.putObject(obj, j, ee1Zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                BJ1.m594n(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m23700q(object2)) {
                EE1 ee1Zze2 = ph1M23705A.zze();
                ph1M23705A.mo6288c(ee1Zze2, object2);
                unsafe.putObject(obj, j, ee1Zze2);
                object2 = ee1Zze2;
            }
            ph1M23705A.mo6288c(object2, object);
        }
    }

    /* renamed from: k */
    public final void m23710k(int i, Object obj) {
        int i2 = this.f40002a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        BJ1.m594n(j, obj, (1 << (i2 >>> 20)) | BJ1.m586f(j, obj));
    }

    /* renamed from: l */
    public final void m23711l(Object obj, int i, Object obj2) {
        f40001l.putObject(obj, m23719x(i) & 1048575, obj2);
        m23710k(i, obj);
    }

    /* renamed from: m */
    public final void m23712m(Object obj, int i, Object obj2, int i2) {
        f40001l.putObject(obj, m23719x(i2) & 1048575, obj2);
        BJ1.m594n(this.f40002a[i2 + 2] & 1048575, obj, i);
    }

    /* renamed from: n */
    public final boolean m23713n(EE1 ee1, Object obj, int i) {
        return m23714o(i, ee1) == m23714o(i, obj);
    }

    /* renamed from: o */
    public final boolean m23714o(int i, Object obj) {
        int i2 = this.f40002a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & BJ1.m586f(j, obj)) != 0;
        }
        int iM23719x = m23719x(i);
        long j2 = iM23719x & 1048575;
        switch (m23703w(iM23719x)) {
            case 0:
                return Double.doubleToRawLongBits(BJ1.f711c.mo159a(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(BJ1.f711c.mo160b(j2, obj)) != 0;
            case 2:
                return BJ1.m587g(j2, obj) != 0;
            case 3:
                return BJ1.m587g(j2, obj) != 0;
            case 4:
                return BJ1.m586f(j2, obj) != 0;
            case 5:
                return BJ1.m587g(j2, obj) != 0;
            case 6:
                return BJ1.m586f(j2, obj) != 0;
            case 7:
                return BJ1.f711c.mo165g(j2, obj);
            case 8:
                Object objM589i = BJ1.m589i(j2, obj);
                if (objM589i instanceof String) {
                    return !((String) objM589i).isEmpty();
                }
                if (objM589i instanceof C11769yC1) {
                    return !C11769yC1.f46138c.equals(objM589i);
                }
                throw new IllegalArgumentException();
            case 9:
                return BJ1.m589i(j2, obj) != null;
            case 10:
                return !C11769yC1.f46138c.equals(BJ1.m589i(j2, obj));
            case 11:
                return BJ1.m586f(j2, obj) != 0;
            case 12:
                return BJ1.m586f(j2, obj) != 0;
            case 13:
                return BJ1.m586f(j2, obj) != 0;
            case 14:
                return BJ1.m587g(j2, obj) != 0;
            case 15:
                return BJ1.m586f(j2, obj) != 0;
            case 16:
                return BJ1.m587g(j2, obj) != 0;
            case 17:
                return BJ1.m589i(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: p */
    public final boolean m23715p(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m23714o(i, obj) : (i3 & i4) != 0;
    }

    /* renamed from: r */
    public final boolean m23716r(int i, int i2, Object obj) {
        return BJ1.m586f((long) (this.f40002a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1274:0x0ec7, code lost:
    
        if (r0 == r3) goto L1276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1275:0x0ec9, code lost:
    
        r35.putInt(r39, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1276:0x0ecf, code lost:
    
        r0 = r11.f40008g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1278:0x0ed3, code lost:
    
        if (r0 >= r11.f40009h) goto L1406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1279:0x0ed5, code lost:
    
        r1 = r11.f40007f[r0];
        r3 = r16[r1];
        r3 = p000.BJ1.m589i(r11.m23719x(r1) & 1048575, r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1280:0x0ee8, code lost:
    
        if (r3 != null) goto L1282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1283:0x0ef0, code lost:
    
        if (r11.m23720z(r1) != null) goto L1405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1285:0x0ef3, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1286:0x0ef5, code lost:
    
        r3 = (p000.FG1) r3;
        r1 = r1 / 3;
        p000.AbstractC1374Vq.m8597p(r24[r1 + r1]);
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
    
        throw p000.C10114lF1.m22374c();
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
    
        throw p000.C10114lF1.m22374c();
     */
    /* JADX WARN: Removed duplicated region for block: B:1165:0x0b69  */
    /* JADX WARN: Removed duplicated region for block: B:1167:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:1328:0x0e53 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1394:0x0e69 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:822:0x02da  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m23717s(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, p000.C0303Eo r44) throws p000.C10114lF1 {
        /*
            Method dump skipped, instructions count: 4026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10630pH1.m23717s(java.lang.Object, byte[], int, int, int, Eo):int");
    }

    /* renamed from: v */
    public final int m23718v(int i, int i2) {
        int[] iArr = this.f40002a;
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

    /* renamed from: x */
    public final int m23719x(int i) {
        return this.f40002a[i + 1];
    }

    /* renamed from: z */
    public final OE1 m23720z(int i) {
        int i2 = i / 3;
        return (OE1) this.f40003b[i2 + i2 + 1];
    }

    @Override // p000.PH1
    public final EE1 zze() {
        return (EE1) ((EE1) this.f40006e).mo1649m(4);
    }
}
