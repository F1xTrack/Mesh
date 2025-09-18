package p000;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.impl.C5043c9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: tr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11213tr0 implements DV0 {

    /* renamed from: j */
    public static final int[] f43366j = new int[0];

    /* renamed from: k */
    public static final Unsafe f43367k = AbstractC8003Ng1.m5808j();

    /* renamed from: a */
    public final int[] f43368a;

    /* renamed from: b */
    public final Object[] f43369b;

    /* renamed from: c */
    public final AbstractC0568J0 f43370c;

    /* renamed from: d */
    public final int[] f43371d;

    /* renamed from: e */
    public final int f43372e;

    /* renamed from: f */
    public final C10837qv0 f43373f;

    /* renamed from: g */
    public final AbstractC11580wj0 f43374g;

    /* renamed from: h */
    public final C9784ig1 f43375h;

    /* renamed from: i */
    public final C9797in0 f43376i;

    public C11213tr0(int[] iArr, Object[] objArr, AbstractC0568J0 abstractC0568J0, int[] iArr2, int i, C10837qv0 c10837qv0, AbstractC11580wj0 abstractC11580wj0, C9784ig1 c9784ig1, C0343FR c0343fr, C9797in0 c9797in0) {
        this.f43368a = iArr;
        this.f43369b = objArr;
        boolean z = abstractC0568J0 instanceof AbstractC11868z00;
        this.f43371d = iArr2;
        this.f43372e = i;
        this.f43373f = c10837qv0;
        this.f43374g = abstractC11580wj0;
        this.f43375h = c9784ig1;
        this.f43370c = abstractC0568J0;
        this.f43376i = c9797in0;
    }

    /* renamed from: m */
    public static boolean m24999m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC11868z00) {
            return ((AbstractC11868z00) obj).m26296p();
        }
        return true;
    }

    /* renamed from: q */
    public static C11213tr0 m25000q(C9993kJ0 c9993kJ0, C10837qv0 c10837qv0, AbstractC11580wj0 abstractC11580wj0, C9784ig1 c9784ig1, C0343FR c0343fr, C9797in0 c9797in0) {
        if (c9993kJ0 instanceof C9993kJ0) {
            return m25001r(c9993kJ0, c10837qv0, abstractC11580wj0, c9784ig1, c0343fr, c9797in0);
        }
        c9993kJ0.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0250  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C11213tr0 m25001r(p000.C9993kJ0 r30, p000.C10837qv0 r31, p000.AbstractC11580wj0 r32, p000.C9784ig1 r33, p000.C0343FR r34, p000.C9797in0 r35) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11213tr0.m25001r(kJ0, qv0, wj0, ig1, FR, in0):tr0");
    }

    /* renamed from: s */
    public static int m25002s(long j, Object obj) {
        return ((Integer) AbstractC8003Ng1.f7951c.m5056i(j, obj)).intValue();
    }

    /* renamed from: t */
    public static long m25003t(long j, Object obj) {
        return ((Long) AbstractC8003Ng1.f7951c.m5056i(j, obj)).longValue();
    }

    /* renamed from: u */
    public static Field m25004u(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("Field ", str, " for ");
            AbstractC0852NX.m5765n(cls, sbM26240q, " not found. Known fields are ");
            sbM26240q.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM26240q.toString());
        }
    }

    /* renamed from: w */
    public static int m25005w(int i) {
        return (i & 267386880) >>> 20;
    }

    @Override // p000.DV0
    /* renamed from: a */
    public final AbstractC11868z00 mo1708a() {
        this.f43373f.getClass();
        return (AbstractC11868z00) ((AbstractC11868z00) this.f43370c).mo2061m(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // p000.DV0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1709b(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = m24999m(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r9 instanceof p000.AbstractC11868z00
            if (r0 == 0) goto L17
            r0 = r9
            z00 r0 = (p000.AbstractC11868z00) r0
            r0.m26294g()
            r0.m26293f()
            r0.m26297q()
        L17:
            int[] r0 = r8.f43368a
            int r1 = r0.length
            r2 = 0
        L1b:
            if (r2 >= r1) goto L80
            int r3 = r8.m25014x(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = m25005w(r3)
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
            sun.misc.Unsafe r3 = p000.C11213tr0.f43367k
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L7d
            in0 r7 = r8.f43376i
            r7.getClass()
            p000.C9797in0.m19102b(r6)
            r3.putObject(r9, r4, r6)
            goto L7d
        L4e:
            wj0 r3 = r8.f43374g
            r3.mo24772a(r4, r9)
            goto L7d
        L54:
            r3 = r0[r2]
            boolean r3 = r8.m25010n(r3, r2, r9)
            if (r3 == 0) goto L7d
            DV0 r3 = r8.m25007j(r2)
            sun.misc.Unsafe r6 = p000.C11213tr0.f43367k
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.mo1709b(r4)
            goto L7d
        L6a:
            boolean r3 = r8.m25008k(r2, r9)
            if (r3 == 0) goto L7d
            DV0 r3 = r8.m25007j(r2)
            sun.misc.Unsafe r6 = p000.C11213tr0.f43367k
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.mo1709b(r4)
        L7d:
            int r2 = r2 + 3
            goto L1b
        L80:
            ig1 r0 = r8.f43375h
            r0.getClass()
            p000.C9784ig1.m19066a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11213tr0.mo1709b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    @Override // p000.DV0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1710c(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11213tr0.mo1710c(java.lang.Object):boolean");
    }

    @Override // p000.DV0
    /* renamed from: d */
    public final void mo1711d(Object obj, Object obj2) {
        if (!m24999m(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f43368a;
            if (i >= iArr.length) {
                HV0.m3497z(this.f43375h, obj, obj2);
                return;
            }
            int iM25014x = m25014x(i);
            long j = iM25014x & 1048575;
            int i2 = iArr[i];
            switch (m25005w(iM25014x)) {
                case 0:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC7899Lg1 abstractC7899Lg1 = AbstractC8003Ng1.f7951c;
                        abstractC7899Lg1.mo3546m(obj, j, abstractC7899Lg1.mo3542e(j, obj2));
                        m25013v(i, obj);
                        break;
                    }
                case 1:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC7899Lg1 abstractC7899Lg12 = AbstractC8003Ng1.f7951c;
                        abstractC7899Lg12.mo3547n(obj, j, abstractC7899Lg12.mo3543f(j, obj2));
                        m25013v(i, obj);
                        break;
                    }
                case 2:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC7899Lg1 abstractC7899Lg13 = AbstractC8003Ng1.f7951c;
                        abstractC7899Lg13.m5059p(j, abstractC7899Lg13.m5055h(j, obj2), obj);
                        m25013v(i, obj);
                        break;
                    }
                case 3:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC7899Lg1 abstractC7899Lg14 = AbstractC8003Ng1.f7951c;
                        abstractC7899Lg14.m5059p(j, abstractC7899Lg14.m5055h(j, obj2), obj);
                        m25013v(i, obj);
                        break;
                    }
                case 4:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC8003Ng1.m5812n(j, obj, AbstractC8003Ng1.f7951c.m5054g(j, obj2));
                        m25013v(i, obj);
                        break;
                    }
                case 5:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC7899Lg1 abstractC7899Lg15 = AbstractC8003Ng1.f7951c;
                        abstractC7899Lg15.m5059p(j, abstractC7899Lg15.m5055h(j, obj2), obj);
                        m25013v(i, obj);
                        break;
                    }
                case 6:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC8003Ng1.m5812n(j, obj, AbstractC8003Ng1.f7951c.m5054g(j, obj2));
                        m25013v(i, obj);
                        break;
                    }
                case 7:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC7899Lg1 abstractC7899Lg16 = AbstractC8003Ng1.f7951c;
                        abstractC7899Lg16.mo3544k(obj, j, abstractC7899Lg16.mo3540c(j, obj2));
                        m25013v(i, obj);
                        break;
                    }
                case 8:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC8003Ng1.m5813o(j, obj, AbstractC8003Ng1.f7951c.m5056i(j, obj2));
                        m25013v(i, obj);
                        break;
                    }
                case 9:
                    m25011o(obj, i, obj2);
                    break;
                case 10:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC8003Ng1.m5813o(j, obj, AbstractC8003Ng1.f7951c.m5056i(j, obj2));
                        m25013v(i, obj);
                        break;
                    }
                case 11:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC8003Ng1.m5812n(j, obj, AbstractC8003Ng1.f7951c.m5054g(j, obj2));
                        m25013v(i, obj);
                        break;
                    }
                case 12:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC8003Ng1.m5812n(j, obj, AbstractC8003Ng1.f7951c.m5054g(j, obj2));
                        m25013v(i, obj);
                        break;
                    }
                case 13:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC8003Ng1.m5812n(j, obj, AbstractC8003Ng1.f7951c.m5054g(j, obj2));
                        m25013v(i, obj);
                        break;
                    }
                case 14:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC7899Lg1 abstractC7899Lg17 = AbstractC8003Ng1.f7951c;
                        abstractC7899Lg17.m5059p(j, abstractC7899Lg17.m5055h(j, obj2), obj);
                        m25013v(i, obj);
                        break;
                    }
                case 15:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC8003Ng1.m5812n(j, obj, AbstractC8003Ng1.f7951c.m5054g(j, obj2));
                        m25013v(i, obj);
                        break;
                    }
                case 16:
                    if (!m25008k(i, obj2)) {
                        break;
                    } else {
                        AbstractC7899Lg1 abstractC7899Lg18 = AbstractC8003Ng1.f7951c;
                        abstractC7899Lg18.m5059p(j, abstractC7899Lg18.m5055h(j, obj2), obj);
                        m25013v(i, obj);
                        break;
                    }
                case 17:
                    m25011o(obj, i, obj2);
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
                    this.f43374g.mo24773b(j, obj, obj2);
                    break;
                case 50:
                    Class cls = HV0.f4324a;
                    AbstractC7899Lg1 abstractC7899Lg19 = AbstractC8003Ng1.f7951c;
                    Object objM5056i = abstractC7899Lg19.m5056i(j, obj);
                    Object objM5056i2 = abstractC7899Lg19.m5056i(j, obj2);
                    this.f43376i.getClass();
                    C9541gn0 c9541gn0M18641i = (C9541gn0) objM5056i;
                    C9541gn0 c9541gn0 = (C9541gn0) objM5056i2;
                    if (!c9541gn0.isEmpty()) {
                        if (!c9541gn0M18641i.f27994a) {
                            c9541gn0M18641i = c9541gn0M18641i.m18641i();
                        }
                        c9541gn0M18641i.m18640e();
                        if (!c9541gn0.isEmpty()) {
                            c9541gn0M18641i.putAll(c9541gn0);
                        }
                    }
                    AbstractC8003Ng1.m5813o(j, obj, c9541gn0M18641i);
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
                    if (!m25010n(i2, i, obj2)) {
                        break;
                    } else {
                        AbstractC8003Ng1.m5813o(j, obj, AbstractC8003Ng1.f7951c.m5056i(j, obj2));
                        AbstractC8003Ng1.m5812n(iArr[i + 2] & 1048575, obj, i2);
                        break;
                    }
                case 60:
                    m25012p(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case NativeMac.KEY_LENGTH /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (!m25010n(i2, i, obj2)) {
                        break;
                    } else {
                        AbstractC8003Ng1.m5813o(j, obj, AbstractC8003Ng1.f7951c.m5056i(j, obj2));
                        AbstractC8003Ng1.m5812n(iArr[i + 2] & 1048575, obj, i2);
                        break;
                    }
                case 68:
                    m25012p(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // p000.DV0
    /* renamed from: e */
    public final int mo1712e(AbstractC11868z00 abstractC11868z00) {
        int i;
        int i2;
        int i3;
        int iM23247e;
        int iM23245c;
        int iM3480i;
        int iM23262t;
        int iM23264v;
        Unsafe unsafe = f43367k;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f43368a;
            if (i7 >= iArr.length) {
                this.f43375h.getClass();
                return abstractC11868z00.unknownFields.m18596a() + i8;
            }
            int iM25014x = m25014x(i7);
            int iM25005w = m25005w(iM25014x);
            int i9 = iArr[i7];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & i4;
            if (iM25005w <= 17) {
                if (i11 != i5) {
                    i6 = i11 == i4 ? 0 : unsafe.getInt(abstractC11868z00, i11);
                    i5 = i11;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i10 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = iM25014x & i4;
            if (iM25005w >= EnumC4244iT.f29138b.m19048a()) {
                EnumC4244iT.f29139c.m19048a();
            }
            switch (iM25005w) {
                case 0:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23247e(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 1:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23251i(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 2:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23255m(i9, unsafe.getLong(abstractC11868z00, j));
                        i8 += iM23247e;
                        break;
                    }
                case 3:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23265w(i9, unsafe.getLong(abstractC11868z00, j));
                        i8 += iM23247e;
                        break;
                    }
                case 4:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23253k(i9, unsafe.getInt(abstractC11868z00, j));
                        i8 += iM23247e;
                        break;
                    }
                case 5:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23250h(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 6:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23249g(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 7:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23244b(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 8:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC11868z00, j);
                        iM23245c = object instanceof C0299Ek ? C6518nu.m23245c(i9, (C0299Ek) object) : C6518nu.m23260r(i9, (String) object);
                        i8 = iM23245c + i8;
                        break;
                    }
                case 9:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = HV0.m3486o(i9, unsafe.getObject(abstractC11868z00, j), m25007j(i7));
                        i8 += iM23247e;
                        break;
                    }
                case 10:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23245c(i9, (C0299Ek) unsafe.getObject(abstractC11868z00, j));
                        i8 += iM23247e;
                        break;
                    }
                case 11:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23263u(i9, unsafe.getInt(abstractC11868z00, j));
                        i8 += iM23247e;
                        break;
                    }
                case 12:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23248f(i9, unsafe.getInt(abstractC11868z00, j));
                        i8 += iM23247e;
                        break;
                    }
                case 13:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23256n(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 14:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23257o(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 15:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23258p(i9, unsafe.getInt(abstractC11868z00, j));
                        i8 += iM23247e;
                        break;
                    }
                case 16:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23259q(i9, unsafe.getLong(abstractC11868z00, j));
                        i8 += iM23247e;
                        break;
                    }
                case 17:
                    if (!m25009l(abstractC11868z00, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23252j(i9, (AbstractC0568J0) unsafe.getObject(abstractC11868z00, j), m25007j(i7));
                        i8 += iM23247e;
                        break;
                    }
                case 18:
                    iM23247e = HV0.m3479h(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 19:
                    iM23247e = HV0.m3477f(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 20:
                    iM23247e = HV0.m3484m(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 21:
                    iM23247e = HV0.m3495x(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 22:
                    iM23247e = HV0.m3482k(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 23:
                    iM23247e = HV0.m3479h(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 24:
                    iM23247e = HV0.m3477f(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 25:
                    iM23247e = HV0.m3472a(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 26:
                    iM23247e = HV0.m3492u(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 27:
                    iM23247e = HV0.m3487p(i9, (List) unsafe.getObject(abstractC11868z00, j), m25007j(i7));
                    i8 += iM23247e;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iM23247e = HV0.m3474c(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 29:
                    iM23247e = HV0.m3493v(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 30:
                    iM23247e = HV0.m3475d(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 31:
                    iM23247e = HV0.m3477f(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 32:
                    iM23247e = HV0.m3479h(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 33:
                    iM23247e = HV0.m3488q(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case 34:
                    iM23247e = HV0.m3490s(i9, (List) unsafe.getObject(abstractC11868z00, j));
                    i8 += iM23247e;
                    break;
                case C5043c9.f31374J /* 35 */:
                    iM3480i = HV0.m3480i((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    iM3480i = HV0.m3478g((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case 37:
                    iM3480i = HV0.m3485n((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case C5043c9.f31375K /* 38 */:
                    iM3480i = HV0.m3496y((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case 39:
                    iM3480i = HV0.m3483l((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case C5043c9.f31376L /* 40 */:
                    iM3480i = HV0.m3480i((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case 41:
                    iM3480i = HV0.m3478g((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case C5043c9.f31377M /* 42 */:
                    iM3480i = HV0.m3473b((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case 43:
                    iM3480i = HV0.m3494w((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case 44:
                    iM3480i = HV0.m3476e((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case 45:
                    iM3480i = HV0.m3478g((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case 46:
                    iM3480i = HV0.m3480i((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case 47:
                    iM3480i = HV0.m3489r((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case 48:
                    iM3480i = HV0.m3491t((List) unsafe.getObject(abstractC11868z00, j));
                    if (iM3480i <= 0) {
                        break;
                    } else {
                        iM23262t = C6518nu.m23262t(i9);
                        iM23264v = C6518nu.m23264v(iM3480i);
                        i8 += iM23264v + iM23262t + iM3480i;
                        break;
                    }
                case 49:
                    iM23247e = HV0.m3481j(i9, (List) unsafe.getObject(abstractC11868z00, j), m25007j(i7));
                    i8 += iM23247e;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC11868z00, j);
                    Object obj = this.f43369b[(i7 / 3) * 2];
                    this.f43376i.getClass();
                    iM23247e = C9797in0.m19101a(object2, i9, obj);
                    i8 += iM23247e;
                    break;
                case 51:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23247e(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 52:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23251i(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 53:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23255m(i9, m25003t(j, abstractC11868z00));
                        i8 += iM23247e;
                        break;
                    }
                case 54:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23265w(i9, m25003t(j, abstractC11868z00));
                        i8 += iM23247e;
                        break;
                    }
                case 55:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23253k(i9, m25002s(j, abstractC11868z00));
                        i8 += iM23247e;
                        break;
                    }
                case 56:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23250h(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 57:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23249g(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 58:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23244b(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 59:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC11868z00, j);
                        iM23245c = object3 instanceof C0299Ek ? C6518nu.m23245c(i9, (C0299Ek) object3) : C6518nu.m23260r(i9, (String) object3);
                        i8 = iM23245c + i8;
                        break;
                    }
                case 60:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = HV0.m3486o(i9, unsafe.getObject(abstractC11868z00, j), m25007j(i7));
                        i8 += iM23247e;
                        break;
                    }
                case 61:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23245c(i9, (C0299Ek) unsafe.getObject(abstractC11868z00, j));
                        i8 += iM23247e;
                        break;
                    }
                case 62:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23263u(i9, m25002s(j, abstractC11868z00));
                        i8 += iM23247e;
                        break;
                    }
                case 63:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23248f(i9, m25002s(j, abstractC11868z00));
                        i8 += iM23247e;
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23256n(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 65:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23257o(i9);
                        i8 += iM23247e;
                        break;
                    }
                case 66:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23258p(i9, m25002s(j, abstractC11868z00));
                        i8 += iM23247e;
                        break;
                    }
                case 67:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23259q(i9, m25003t(j, abstractC11868z00));
                        i8 += iM23247e;
                        break;
                    }
                case 68:
                    if (!m25010n(i9, i7, abstractC11868z00)) {
                        break;
                    } else {
                        iM23247e = C6518nu.m23252j(i9, (AbstractC0568J0) unsafe.getObject(abstractC11868z00, j), m25007j(i7));
                        i8 += iM23247e;
                        break;
                    }
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // p000.DV0
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1713f(p000.AbstractC11868z00 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11213tr0.mo1713f(z00, java.lang.Object):boolean");
    }

    @Override // p000.DV0
    /* renamed from: g */
    public final void mo1714g(Object obj, C8342Tu0 c8342Tu0) {
        c8342Tu0.getClass();
        m25015y(obj, c8342Tu0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.DV0
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo1715h(p000.AbstractC11868z00 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11213tr0.mo1715h(z00):int");
    }

    /* renamed from: i */
    public final boolean m25006i(AbstractC11868z00 abstractC11868z00, Object obj, int i) {
        return m25008k(i, abstractC11868z00) == m25008k(i, obj);
    }

    /* renamed from: j */
    public final DV0 m25007j(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f43369b;
        DV0 dv0 = (DV0) objArr[i2];
        if (dv0 != null) {
            return dv0;
        }
        DV0 dv0M9251a = YF0.f14212c.m9251a((Class) objArr[i2 + 1]);
        objArr[i2] = dv0M9251a;
        return dv0M9251a;
    }

    /* renamed from: k */
    public final boolean m25008k(int i, Object obj) {
        int i2 = this.f43368a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & AbstractC8003Ng1.f7951c.m5054g(j, obj)) != 0;
        }
        int iM25014x = m25014x(i);
        long j2 = iM25014x & 1048575;
        switch (m25005w(iM25014x)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC8003Ng1.f7951c.mo3542e(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC8003Ng1.f7951c.mo3543f(j2, obj)) != 0;
            case 2:
                return AbstractC8003Ng1.f7951c.m5055h(j2, obj) != 0;
            case 3:
                return AbstractC8003Ng1.f7951c.m5055h(j2, obj) != 0;
            case 4:
                return AbstractC8003Ng1.f7951c.m5054g(j2, obj) != 0;
            case 5:
                return AbstractC8003Ng1.f7951c.m5055h(j2, obj) != 0;
            case 6:
                return AbstractC8003Ng1.f7951c.m5054g(j2, obj) != 0;
            case 7:
                return AbstractC8003Ng1.f7951c.mo3540c(j2, obj);
            case 8:
                Object objM5056i = AbstractC8003Ng1.f7951c.m5056i(j2, obj);
                if (objM5056i instanceof String) {
                    return !((String) objM5056i).isEmpty();
                }
                if (objM5056i instanceof C0299Ek) {
                    return !C0299Ek.f2870c.equals(objM5056i);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC8003Ng1.f7951c.m5056i(j2, obj) != null;
            case 10:
                return !C0299Ek.f2870c.equals(AbstractC8003Ng1.f7951c.m5056i(j2, obj));
            case 11:
                return AbstractC8003Ng1.f7951c.m5054g(j2, obj) != 0;
            case 12:
                return AbstractC8003Ng1.f7951c.m5054g(j2, obj) != 0;
            case 13:
                return AbstractC8003Ng1.f7951c.m5054g(j2, obj) != 0;
            case 14:
                return AbstractC8003Ng1.f7951c.m5055h(j2, obj) != 0;
            case 15:
                return AbstractC8003Ng1.f7951c.m5054g(j2, obj) != 0;
            case 16:
                return AbstractC8003Ng1.f7951c.m5055h(j2, obj) != 0;
            case 17:
                return AbstractC8003Ng1.f7951c.m5056i(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: l */
    public final boolean m25009l(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m25008k(i, obj) : (i3 & i4) != 0;
    }

    /* renamed from: n */
    public final boolean m25010n(int i, int i2, Object obj) {
        return AbstractC8003Ng1.f7951c.m5054g((long) (this.f43368a[i2 + 2] & 1048575), obj) == i;
    }

    /* renamed from: o */
    public final void m25011o(Object obj, int i, Object obj2) {
        if (m25008k(i, obj2)) {
            long jM25014x = m25014x(i) & 1048575;
            Unsafe unsafe = f43367k;
            Object object = unsafe.getObject(obj2, jM25014x);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f43368a[i] + " is present but null: " + obj2);
            }
            DV0 dv0M25007j = m25007j(i);
            if (!m25008k(i, obj)) {
                if (m24999m(object)) {
                    AbstractC11868z00 abstractC11868z00Mo1708a = dv0M25007j.mo1708a();
                    dv0M25007j.mo1711d(abstractC11868z00Mo1708a, object);
                    unsafe.putObject(obj, jM25014x, abstractC11868z00Mo1708a);
                } else {
                    unsafe.putObject(obj, jM25014x, object);
                }
                m25013v(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM25014x);
            if (!m24999m(object2)) {
                AbstractC11868z00 abstractC11868z00Mo1708a2 = dv0M25007j.mo1708a();
                dv0M25007j.mo1711d(abstractC11868z00Mo1708a2, object2);
                unsafe.putObject(obj, jM25014x, abstractC11868z00Mo1708a2);
                object2 = abstractC11868z00Mo1708a2;
            }
            dv0M25007j.mo1711d(object2, object);
        }
    }

    /* renamed from: p */
    public final void m25012p(Object obj, int i, Object obj2) {
        int[] iArr = this.f43368a;
        int i2 = iArr[i];
        if (m25010n(i2, i, obj2)) {
            long jM25014x = m25014x(i) & 1048575;
            Unsafe unsafe = f43367k;
            Object object = unsafe.getObject(obj2, jM25014x);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            DV0 dv0M25007j = m25007j(i);
            if (!m25010n(i2, i, obj)) {
                if (m24999m(object)) {
                    AbstractC11868z00 abstractC11868z00Mo1708a = dv0M25007j.mo1708a();
                    dv0M25007j.mo1711d(abstractC11868z00Mo1708a, object);
                    unsafe.putObject(obj, jM25014x, abstractC11868z00Mo1708a);
                } else {
                    unsafe.putObject(obj, jM25014x, object);
                }
                AbstractC8003Ng1.m5812n(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM25014x);
            if (!m24999m(object2)) {
                AbstractC11868z00 abstractC11868z00Mo1708a2 = dv0M25007j.mo1708a();
                dv0M25007j.mo1711d(abstractC11868z00Mo1708a2, object2);
                unsafe.putObject(obj, jM25014x, abstractC11868z00Mo1708a2);
                object2 = abstractC11868z00Mo1708a2;
            }
            dv0M25007j.mo1711d(object2, object);
        }
    }

    /* renamed from: v */
    public final void m25013v(int i, Object obj) {
        int i2 = this.f43368a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC8003Ng1.m5812n(j, obj, (1 << (i2 >>> 20)) | AbstractC8003Ng1.f7951c.m5054g(j, obj));
    }

    /* renamed from: x */
    public final int m25014x(int i) {
        return this.f43368a[i + 1];
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
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25015y(java.lang.Object r32, p000.C8342Tu0 r33) {
        /*
            Method dump skipped, instructions count: 2484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11213tr0.m25015y(java.lang.Object, Tu0):void");
    }
}
