package p000;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.impl.C5043c9;
import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class TI1 implements InterfaceC11785yK1 {

    /* renamed from: l */
    public static final int[] f11303l = new int[0];

    /* renamed from: m */
    public static final Unsafe f11304m = HM1.m3369j();

    /* renamed from: a */
    public final int[] f11305a;

    /* renamed from: b */
    public final Object[] f11306b;

    /* renamed from: c */
    public final int f11307c;

    /* renamed from: d */
    public final int f11308d;

    /* renamed from: e */
    public final DD1 f11309e;

    /* renamed from: f */
    public final boolean f11310f;

    /* renamed from: g */
    public final int[] f11311g;

    /* renamed from: h */
    public final int f11312h;

    /* renamed from: i */
    public final int f11313i;

    /* renamed from: j */
    public final C1210TE f11314j;

    /* renamed from: k */
    public final C10212m12 f11315k;

    public TI1(int[] iArr, Object[] objArr, int i, int i2, DD1 dd1, int[] iArr2, int i3, int i4, C1210TE c1210te, C10212m12 c10212m12) {
        this.f11305a = iArr;
        this.f11306b = objArr;
        this.f11307c = i;
        this.f11308d = i2;
        boolean z = false;
        if (c10212m12 != null && (dd1 instanceof AbstractC11904zG1)) {
            z = true;
        }
        this.f11310f = z;
        this.f11311g = iArr2;
        this.f11312h = i3;
        this.f11313i = i4;
        this.f11314j = c1210te;
        this.f11315k = c10212m12;
        this.f11309e = dd1;
    }

    /* renamed from: E */
    public static Field m7650E(Class cls, String str) {
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
    public static boolean m7651q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof QG1) {
            return ((QG1) obj).m6626k();
        }
        return true;
    }

    /* renamed from: t */
    public static C9488gM1 m7652t(Object obj) {
        QG1 qg1 = (QG1) obj;
        C9488gM1 c9488gM1 = qg1.zzc;
        if (c9488gM1 != C9488gM1.f27699f) {
            return c9488gM1;
        }
        C9488gM1 c9488gM1M18470b = C9488gM1.m18470b();
        qg1.zzc = c9488gM1M18470b;
        return c9488gM1M18470b;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0283  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.TI1 m7653u(p000.C11910zJ1 r33, p000.C1210TE r34, p000.C10212m12 r35) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.TI1.m7653u(zJ1, TE, m12):TI1");
    }

    /* renamed from: v */
    public static int m7654v(long j, Object obj) {
        return ((Integer) HM1.m3368i(j, obj)).intValue();
    }

    /* renamed from: x */
    public static int m7655x(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: z */
    public static long m7656z(long j, Object obj) {
        return ((Long) HM1.m3368i(j, obj)).longValue();
    }

    /* renamed from: A */
    public final InterfaceC9350fH1 m7657A(int i) {
        int i2 = i / 3;
        return (InterfaceC9350fH1) this.f11306b[i2 + i2 + 1];
    }

    /* renamed from: B */
    public final InterfaceC11785yK1 m7658B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f11306b;
        InterfaceC11785yK1 interfaceC11785yK1 = (InterfaceC11785yK1) objArr[i3];
        if (interfaceC11785yK1 != null) {
            return interfaceC11785yK1;
        }
        InterfaceC11785yK1 interfaceC11785yK1M18426a = C9482gJ1.f27672c.m18426a((Class) objArr[i3 + 1]);
        objArr[i3] = interfaceC11785yK1M18426a;
        return interfaceC11785yK1M18426a;
    }

    /* renamed from: C */
    public final Object m7659C(int i, Object obj) {
        InterfaceC11785yK1 interfaceC11785yK1M7658B = m7658B(i);
        int iM7680y = m7680y(i) & 1048575;
        if (!m7675o(i, obj)) {
            return interfaceC11785yK1M7658B.zze();
        }
        Object object = f11304m.getObject(obj, iM7680y);
        if (m7651q(object)) {
            return object;
        }
        Object objZze = interfaceC11785yK1M7658B.zze();
        if (object != null) {
            interfaceC11785yK1M7658B.mo7663c(objZze, object);
        }
        return objZze;
    }

    /* renamed from: D */
    public final Object m7660D(int i, int i2, Object obj) {
        InterfaceC11785yK1 interfaceC11785yK1M7658B = m7658B(i2);
        if (!m7677r(i, i2, obj)) {
            return interfaceC11785yK1M7658B.zze();
        }
        Object object = f11304m.getObject(obj, m7680y(i2) & 1048575);
        if (m7651q(object)) {
            return object;
        }
        Object objZze = interfaceC11785yK1M7658B.zze();
        if (object != null) {
            interfaceC11785yK1M7658B.mo7663c(objZze, object);
        }
        return objZze;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // p000.InterfaceC11785yK1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo7661a(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = m7651q(r7)
            if (r0 != 0) goto L8
            goto L98
        L8:
            boolean r0 = r7 instanceof p000.QG1
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r7
            QG1 r0 = (p000.QG1) r0
            r0.m6625i()
            r0.zza = r1
            r0.m6624g()
        L18:
            int[] r0 = r6.f11305a
            int r2 = r0.length
            if (r1 >= r2) goto L84
            int r2 = r6.m7680y(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = m7655x(r2)
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
            sun.misc.Unsafe r0 = p000.TI1.f11304m
            java.lang.Object r2 = r0.getObject(r7, r3)
            if (r2 == 0) goto L81
            r5 = r2
            vI1 r5 = (p000.C11400vI1) r5
            r5.m25385i()
            r0.putObject(r7, r3, r2)
            goto L81
        L4c:
            java.lang.Object r0 = p000.HM1.m3368i(r3, r7)
            uH1 r0 = (p000.InterfaceC11270uH1) r0
            LD1 r0 = (p000.LD1) r0
            r0.m4927b()
            goto L81
        L58:
            r0 = r0[r1]
            boolean r0 = r6.m7677r(r0, r1, r7)
            if (r0 == 0) goto L81
            yK1 r0 = r6.m7658B(r1)
            sun.misc.Unsafe r2 = p000.TI1.f11304m
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.mo7661a(r2)
            goto L81
        L6e:
            boolean r0 = r6.m7675o(r1, r7)
            if (r0 == 0) goto L81
            yK1 r0 = r6.m7658B(r1)
            sun.misc.Unsafe r2 = p000.TI1.f11304m
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.mo7661a(r2)
        L81:
            int r1 = r1 + 3
            goto L18
        L84:
            TE r0 = r6.f11314j
            r0.getClass()
            p000.C1210TE.m7638N(r7)
            boolean r0 = r6.f11310f
            if (r0 == 0) goto L98
            m12 r0 = r6.f11315k
            r0.getClass()
            p000.C10212m12.m22630j(r7)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.TI1.mo7661a(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    @Override // p000.InterfaceC11785yK1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo7662b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.TI1.mo7662b(java.lang.Object):boolean");
    }

    @Override // p000.InterfaceC11785yK1
    /* renamed from: c */
    public final void mo7663c(Object obj, Object obj2) {
        if (!m7651q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f11305a;
            if (i >= iArr.length) {
                AbstractC9486gL1.m18463t(obj, obj2);
                if (this.f11310f) {
                    AbstractC9486gL1.m18462s(obj, obj2);
                    return;
                }
                return;
            }
            int iM7680y = m7680y(i);
            int i2 = iM7680y & 1048575;
            int iM7655x = m7655x(iM7680y);
            int i3 = iArr[i];
            long j = i2;
            switch (iM7655x) {
                case 0:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3371l(obj, j, HM1.f4245c.mo159a(j, obj2));
                        m7671k(i, obj);
                        break;
                    }
                case 1:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3372m(obj, j, HM1.f4245c.mo160b(j, obj2));
                        m7671k(i, obj);
                        break;
                    }
                case 2:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3374o(j, HM1.m3366g(j, obj2), obj);
                        m7671k(i, obj);
                        break;
                    }
                case 3:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3374o(j, HM1.m3366g(j, obj2), obj);
                        m7671k(i, obj);
                        break;
                    }
                case 4:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3373n(j, obj, HM1.m3365f(j, obj2));
                        m7671k(i, obj);
                        break;
                    }
                case 5:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3374o(j, HM1.m3366g(j, obj2), obj);
                        m7671k(i, obj);
                        break;
                    }
                case 6:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3373n(j, obj, HM1.m3365f(j, obj2));
                        m7671k(i, obj);
                        break;
                    }
                case 7:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3370k(obj, j, HM1.f4245c.mo165g(j, obj2));
                        m7671k(i, obj);
                        break;
                    }
                case 8:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3375p(j, obj, HM1.m3368i(j, obj2));
                        m7671k(i, obj);
                        break;
                    }
                case 9:
                    m7669i(obj, i, obj2);
                    break;
                case 10:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3375p(j, obj, HM1.m3368i(j, obj2));
                        m7671k(i, obj);
                        break;
                    }
                case 11:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3373n(j, obj, HM1.m3365f(j, obj2));
                        m7671k(i, obj);
                        break;
                    }
                case 12:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3373n(j, obj, HM1.m3365f(j, obj2));
                        m7671k(i, obj);
                        break;
                    }
                case 13:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3373n(j, obj, HM1.m3365f(j, obj2));
                        m7671k(i, obj);
                        break;
                    }
                case 14:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3374o(j, HM1.m3366g(j, obj2), obj);
                        m7671k(i, obj);
                        break;
                    }
                case 15:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3373n(j, obj, HM1.m3365f(j, obj2));
                        m7671k(i, obj);
                        break;
                    }
                case 16:
                    if (!m7675o(i, obj2)) {
                        break;
                    } else {
                        HM1.m3374o(j, HM1.m3366g(j, obj2), obj);
                        m7671k(i, obj);
                        break;
                    }
                case 17:
                    m7669i(obj, i, obj2);
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
                    InterfaceC11270uH1 interfaceC11270uH1Mo7949c = (InterfaceC11270uH1) HM1.m3368i(j, obj);
                    InterfaceC11270uH1 interfaceC11270uH1 = (InterfaceC11270uH1) HM1.m3368i(j, obj2);
                    int size = interfaceC11270uH1Mo7949c.size();
                    int size2 = interfaceC11270uH1.size();
                    if (size > 0 && size2 > 0) {
                        if (!((LD1) interfaceC11270uH1Mo7949c).f6553a) {
                            interfaceC11270uH1Mo7949c = interfaceC11270uH1Mo7949c.mo7949c(size2 + size);
                        }
                        interfaceC11270uH1Mo7949c.addAll(interfaceC11270uH1);
                    }
                    if (size > 0) {
                        interfaceC11270uH1 = interfaceC11270uH1Mo7949c;
                    }
                    HM1.m3375p(j, obj, interfaceC11270uH1);
                    break;
                case 50:
                    C1210TE c1210te = AbstractC9486gL1.f27693a;
                    HM1.m3375p(j, obj, C11523wG1.m25582a(HM1.m3368i(j, obj), HM1.m3368i(j, obj2)));
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
                    if (!m7677r(i3, i, obj2)) {
                        break;
                    } else {
                        HM1.m3375p(j, obj, HM1.m3368i(j, obj2));
                        HM1.m3373n(iArr[i + 2] & 1048575, obj, i3);
                        break;
                    }
                case 60:
                    m7670j(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case NativeMac.KEY_LENGTH /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (!m7677r(i3, i, obj2)) {
                        break;
                    } else {
                        HM1.m3375p(j, obj, HM1.m3368i(j, obj2));
                        HM1.m3373n(iArr[i + 2] & 1048575, obj, i3);
                        break;
                    }
                case 68:
                    m7670j(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // p000.InterfaceC11785yK1
    /* renamed from: d */
    public final boolean mo7664d(QG1 qg1, Object obj) {
        boolean zM18448e;
        int i = 0;
        while (true) {
            int[] iArr = this.f11305a;
            if (i >= iArr.length) {
                if (!qg1.zzc.equals(((QG1) obj).zzc)) {
                    return false;
                }
                if (this.f11310f) {
                    return ((AbstractC11904zG1) qg1).zzb.equals(((AbstractC11904zG1) obj).zzb);
                }
                return true;
            }
            int iM7680y = m7680y(i);
            long j = iM7680y & 1048575;
            switch (m7655x(iM7680y)) {
                case 0:
                    if (!m7674n(qg1, obj, i)) {
                        break;
                    } else {
                        AbstractC10250mJ1 abstractC10250mJ1 = HM1.f4245c;
                        if (Double.doubleToLongBits(abstractC10250mJ1.mo159a(j, qg1)) != Double.doubleToLongBits(abstractC10250mJ1.mo159a(j, obj))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 1:
                    if (!m7674n(qg1, obj, i)) {
                        break;
                    } else {
                        AbstractC10250mJ1 abstractC10250mJ12 = HM1.f4245c;
                        if (Float.floatToIntBits(abstractC10250mJ12.mo160b(j, qg1)) != Float.floatToIntBits(abstractC10250mJ12.mo160b(j, obj))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 2:
                    if (!m7674n(qg1, obj, i) || HM1.m3366g(j, qg1) != HM1.m3366g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 3:
                    if (!m7674n(qg1, obj, i) || HM1.m3366g(j, qg1) != HM1.m3366g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 4:
                    if (!m7674n(qg1, obj, i) || HM1.m3365f(j, qg1) != HM1.m3365f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 5:
                    if (!m7674n(qg1, obj, i) || HM1.m3366g(j, qg1) != HM1.m3366g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 6:
                    if (!m7674n(qg1, obj, i) || HM1.m3365f(j, qg1) != HM1.m3365f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 7:
                    if (!m7674n(qg1, obj, i)) {
                        break;
                    } else {
                        AbstractC10250mJ1 abstractC10250mJ13 = HM1.f4245c;
                        if (abstractC10250mJ13.mo165g(j, qg1) != abstractC10250mJ13.mo165g(j, obj)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 8:
                    if (!m7674n(qg1, obj, i) || !AbstractC9486gL1.m18448e(HM1.m3368i(j, qg1), HM1.m3368i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 9:
                    if (!m7674n(qg1, obj, i) || !AbstractC9486gL1.m18448e(HM1.m3368i(j, qg1), HM1.m3368i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 10:
                    if (!m7674n(qg1, obj, i) || !AbstractC9486gL1.m18448e(HM1.m3368i(j, qg1), HM1.m3368i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 11:
                    if (!m7674n(qg1, obj, i) || HM1.m3365f(j, qg1) != HM1.m3365f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 12:
                    if (!m7674n(qg1, obj, i) || HM1.m3365f(j, qg1) != HM1.m3365f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 13:
                    if (!m7674n(qg1, obj, i) || HM1.m3365f(j, qg1) != HM1.m3365f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 14:
                    if (!m7674n(qg1, obj, i) || HM1.m3366g(j, qg1) != HM1.m3366g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 15:
                    if (!m7674n(qg1, obj, i) || HM1.m3365f(j, qg1) != HM1.m3365f(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 16:
                    if (!m7674n(qg1, obj, i) || HM1.m3366g(j, qg1) != HM1.m3366g(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 17:
                    if (!m7674n(qg1, obj, i) || !AbstractC9486gL1.m18448e(HM1.m3368i(j, qg1), HM1.m3368i(j, obj))) {
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
                    zM18448e = AbstractC9486gL1.m18448e(HM1.m3368i(j, qg1), HM1.m3368i(j, obj));
                    break;
                case 50:
                    zM18448e = AbstractC9486gL1.m18448e(HM1.m3368i(j, qg1), HM1.m3368i(j, obj));
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
                    if (HM1.m3365f(j2, qg1) != HM1.m3365f(j2, obj) || !AbstractC9486gL1.m18448e(HM1.m3368i(j, qg1), HM1.m3368i(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                default:
                    i += 3;
            }
            if (zM18448e) {
                i += 3;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.InterfaceC11785yK1
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo7665e(p000.QG1 r11) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.TI1.mo7665e(QG1):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05b8 A[PHI: r10
  0x05b8: PHI (r10v16 int) = (r10v3 int), (r10v4 int), (r10v8 int), (r10v9 int), (r10v15 int), (r10v17 int) binds: [B:267:0x0730, B:264:0x071f, B:252:0x06b0, B:249:0x069f, B:225:0x05cd, B:222:0x05b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    @Override // p000.InterfaceC11785yK1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo7666f(p000.QG1 r20) {
        /*
            Method dump skipped, instructions count: 2088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.TI1.mo7666f(QG1):int");
    }

    @Override // p000.InterfaceC11785yK1
    /* renamed from: g */
    public final void mo7667g(Object obj, byte[] bArr, int i, int i2, C0623Jt c0623Jt) {
        m7678s(obj, bArr, i, i2, 0, c0623Jt);
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
    @Override // p000.InterfaceC11785yK1
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo7668h(java.lang.Object r26, p000.L21 r27) throws p000.C6583ou {
        /*
            Method dump skipped, instructions count: 1970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.TI1.mo7668h(java.lang.Object, L21):void");
    }

    /* renamed from: i */
    public final void m7669i(Object obj, int i, Object obj2) {
        if (m7675o(i, obj2)) {
            int iM7680y = m7680y(i) & 1048575;
            Unsafe unsafe = f11304m;
            long j = iM7680y;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f11305a[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC11785yK1 interfaceC11785yK1M7658B = m7658B(i);
            if (!m7675o(i, obj)) {
                if (m7651q(object)) {
                    Object objZze = interfaceC11785yK1M7658B.zze();
                    interfaceC11785yK1M7658B.mo7663c(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m7671k(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m7651q(object2)) {
                Object objZze2 = interfaceC11785yK1M7658B.zze();
                interfaceC11785yK1M7658B.mo7663c(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            interfaceC11785yK1M7658B.mo7663c(object2, object);
        }
    }

    /* renamed from: j */
    public final void m7670j(Object obj, int i, Object obj2) {
        int[] iArr = this.f11305a;
        int i2 = iArr[i];
        if (m7677r(i2, i, obj2)) {
            int iM7680y = m7680y(i) & 1048575;
            Unsafe unsafe = f11304m;
            long j = iM7680y;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC11785yK1 interfaceC11785yK1M7658B = m7658B(i);
            if (!m7677r(i2, i, obj)) {
                if (m7651q(object)) {
                    Object objZze = interfaceC11785yK1M7658B.zze();
                    interfaceC11785yK1M7658B.mo7663c(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                HM1.m3373n(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m7651q(object2)) {
                Object objZze2 = interfaceC11785yK1M7658B.zze();
                interfaceC11785yK1M7658B.mo7663c(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            interfaceC11785yK1M7658B.mo7663c(object2, object);
        }
    }

    /* renamed from: k */
    public final void m7671k(int i, Object obj) {
        int i2 = this.f11305a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        HM1.m3373n(j, obj, (1 << (i2 >>> 20)) | HM1.m3365f(j, obj));
    }

    /* renamed from: l */
    public final void m7672l(Object obj, int i, Object obj2) {
        f11304m.putObject(obj, m7680y(i) & 1048575, obj2);
        m7671k(i, obj);
    }

    /* renamed from: m */
    public final void m7673m(Object obj, int i, Object obj2, int i2) {
        f11304m.putObject(obj, m7680y(i2) & 1048575, obj2);
        HM1.m3373n(this.f11305a[i2 + 2] & 1048575, obj, i);
    }

    /* renamed from: n */
    public final boolean m7674n(QG1 qg1, Object obj, int i) {
        return m7675o(i, qg1) == m7675o(i, obj);
    }

    /* renamed from: o */
    public final boolean m7675o(int i, Object obj) {
        int i2 = this.f11305a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & HM1.m3365f(j, obj)) != 0;
        }
        int iM7680y = m7680y(i);
        long j2 = iM7680y & 1048575;
        switch (m7655x(iM7680y)) {
            case 0:
                return Double.doubleToRawLongBits(HM1.f4245c.mo159a(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(HM1.f4245c.mo160b(j2, obj)) != 0;
            case 2:
                return HM1.m3366g(j2, obj) != 0;
            case 3:
                return HM1.m3366g(j2, obj) != 0;
            case 4:
                return HM1.m3365f(j2, obj) != 0;
            case 5:
                return HM1.m3366g(j2, obj) != 0;
            case 6:
                return HM1.m3365f(j2, obj) != 0;
            case 7:
                return HM1.f4245c.mo165g(j2, obj);
            case 8:
                Object objM3368i = HM1.m3368i(j2, obj);
                if (objM3368i instanceof String) {
                    return !((String) objM3368i).isEmpty();
                }
                if (objM3368i instanceof JE1) {
                    return !JE1.f5402b.equals(objM3368i);
                }
                throw new IllegalArgumentException();
            case 9:
                return HM1.m3368i(j2, obj) != null;
            case 10:
                return !JE1.f5402b.equals(HM1.m3368i(j2, obj));
            case 11:
                return HM1.m3365f(j2, obj) != 0;
            case 12:
                return HM1.m3365f(j2, obj) != 0;
            case 13:
                return HM1.m3365f(j2, obj) != 0;
            case 14:
                return HM1.m3366g(j2, obj) != 0;
            case 15:
                return HM1.m3365f(j2, obj) != 0;
            case 16:
                return HM1.m3366g(j2, obj) != 0;
            case 17:
                return HM1.m3368i(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: p */
    public final boolean m7676p(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m7675o(i, obj) : (i3 & i4) != 0;
    }

    /* renamed from: r */
    public final boolean m7677r(int i, int i2, Object obj) {
        return HM1.m3365f((long) (this.f11305a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:525:0x0e76  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0e22 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0aaf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0ac2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0e37 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bd  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m7678s(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, p000.C0623Jt r43) {
        /*
            Method dump skipped, instructions count: 4008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.TI1.m7678s(java.lang.Object, byte[], int, int, int, Jt):int");
    }

    /* renamed from: w */
    public final int m7679w(int i, int i2) {
        int[] iArr = this.f11305a;
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

    /* renamed from: y */
    public final int m7680y(int i) {
        return this.f11305a[i + 1];
    }

    @Override // p000.InterfaceC11785yK1
    public final Object zze() {
        return (QG1) ((QG1) this.f11309e).mo180m(4, null);
    }
}
