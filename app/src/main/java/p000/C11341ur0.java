package p000;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.impl.C5043c9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* renamed from: ur0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11341ur0 implements EV0 {

    /* renamed from: o */
    public static final int[] f43980o = new int[0];

    /* renamed from: p */
    public static final Unsafe f43981p = AbstractC8055Og1.m6109l();

    /* renamed from: a */
    public final int[] f43982a;

    /* renamed from: b */
    public final Object[] f43983b;

    /* renamed from: c */
    public final int f43984c;

    /* renamed from: d */
    public final int f43985d;

    /* renamed from: e */
    public final AbstractC0694L0 f43986e;

    /* renamed from: f */
    public final boolean f43987f;

    /* renamed from: g */
    public final boolean f43988g;

    /* renamed from: h */
    public final int[] f43989h;

    /* renamed from: i */
    public final int f43990i;

    /* renamed from: j */
    public final int f43991j;

    /* renamed from: k */
    public final C10965rv0 f43992k;

    /* renamed from: l */
    public final AbstractC11707xj0 f43993l;

    /* renamed from: m */
    public final C9912jg1 f43994m;

    /* renamed from: n */
    public final C9925jn0 f43995n;

    public C11341ur0(int[] iArr, Object[] objArr, int i, int i2, AbstractC0694L0 abstractC0694L0, boolean z, int[] iArr2, int i3, int i4, C10965rv0 c10965rv0, AbstractC11707xj0 abstractC11707xj0, C9912jg1 c9912jg1, C0406GR c0406gr, C9925jn0 c9925jn0) {
        this.f43982a = iArr;
        this.f43983b = objArr;
        this.f43984c = i;
        this.f43985d = i2;
        this.f43987f = abstractC0694L0 instanceof B00;
        this.f43988g = z;
        this.f43989h = iArr2;
        this.f43990i = i3;
        this.f43991j = i4;
        this.f43992k = c10965rv0;
        this.f43993l = abstractC11707xj0;
        this.f43994m = c9912jg1;
        this.f43986e = abstractC0694L0;
        this.f43995n = c9925jn0;
    }

    /* renamed from: A */
    public static int m25254A(long j, Object obj) {
        return ((Integer) AbstractC8055Og1.f8565d.m5421i(j, obj)).intValue();
    }

    /* renamed from: B */
    public static long m25255B(long j, Object obj) {
        return ((Long) AbstractC8055Og1.f8565d.m5421i(j, obj)).longValue();
    }

    /* renamed from: H */
    public static Field m25256H(Class cls, String str) {
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

    /* renamed from: K */
    public static int m25257K(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: O */
    public static void m25258O(int i, Object obj, C8170Qm0 c8170Qm0) {
        if (!(obj instanceof String)) {
            c8170Qm0.m6754A(i, (C0362Fk) obj);
        } else {
            ((C6709qu) c8170Qm0.f9780b).m24115R(i, (String) obj);
        }
    }

    /* renamed from: s */
    public static List m25259s(AbstractC0694L0 abstractC0694L0, long j) {
        return (List) AbstractC8055Og1.f8565d.m5421i(j, abstractC0694L0);
    }

    /* renamed from: x */
    public static C11341ur0 m25260x(C10121lJ0 c10121lJ0, C10965rv0 c10965rv0, AbstractC11707xj0 abstractC11707xj0, C9912jg1 c9912jg1, C0406GR c0406gr, C9925jn0 c9925jn0) {
        if (c10121lJ0 instanceof C10121lJ0) {
            return m25261y(c10121lJ0, c10965rv0, abstractC11707xj0, c9912jg1, c0406gr, c9925jn0);
        }
        c10121lJ0.getClass();
        throw new ClassCastException();
    }

    /* renamed from: y */
    public static C11341ur0 m25261y(C10121lJ0 c10121lJ0, C10965rv0 c10965rv0, AbstractC11707xj0 abstractC11707xj0, C9912jg1 c9912jg1, C0406GR c0406gr, C9925jn0 c9925jn0) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        String str;
        char c;
        int i23;
        int iObjectFieldOffset;
        int i24;
        int i25;
        int i26;
        Field fieldM25256H;
        int i27;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        Field fieldM25256H2;
        Field fieldM25256H3;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        char cCharAt14;
        int i35 = 0;
        boolean z = c10121lJ0.m22385d() == 2;
        String strM22384c = c10121lJ0.m22384c();
        int length = strM22384c.length();
        int iCharAt3 = strM22384c.charAt(0);
        if (iCharAt3 >= 55296) {
            int i36 = iCharAt3 & 8191;
            int i37 = 1;
            int i38 = 13;
            while (true) {
                i = i37 + 1;
                cCharAt14 = strM22384c.charAt(i37);
                if (cCharAt14 < 55296) {
                    break;
                }
                i36 |= (cCharAt14 & 8191) << i38;
                i38 += 13;
                i37 = i;
            }
            iCharAt3 = i36 | (cCharAt14 << i38);
        } else {
            i = 1;
        }
        int i39 = i + 1;
        int iCharAt4 = strM22384c.charAt(i);
        if (iCharAt4 >= 55296) {
            int i40 = iCharAt4 & 8191;
            int i41 = 13;
            while (true) {
                i34 = i39 + 1;
                cCharAt13 = strM22384c.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i34;
            }
            iCharAt4 = i40 | (cCharAt13 << i41);
            i39 = i34;
        }
        if (iCharAt4 == 0) {
            i6 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i5 = 0;
            i3 = 0;
            iArr = f43980o;
            i4 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt5 = strM22384c.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i14 = i42 + 1;
                    cCharAt8 = strM22384c.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i14;
                }
                iCharAt5 = i43 | (cCharAt8 << i44);
                i42 = i14;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strM22384c.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i13 = i45 + 1;
                    cCharAt7 = strM22384c.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i13;
                }
                iCharAt6 = i46 | (cCharAt7 << i47);
                i45 = i13;
            }
            int i48 = i45 + 1;
            iCharAt = strM22384c.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i12 = i48 + 1;
                    cCharAt6 = strM22384c.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i12;
                }
                iCharAt = i49 | (cCharAt6 << i50);
                i48 = i12;
            }
            int i51 = i48 + 1;
            iCharAt2 = strM22384c.charAt(i48);
            if (iCharAt2 >= 55296) {
                int i52 = iCharAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i11 = i51 + 1;
                    cCharAt5 = strM22384c.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i11;
                }
                iCharAt2 = i52 | (cCharAt5 << i53);
                i51 = i11;
            }
            int i54 = i51 + 1;
            int iCharAt7 = strM22384c.charAt(i51);
            if (iCharAt7 >= 55296) {
                int i55 = iCharAt7 & 8191;
                int i56 = 13;
                while (true) {
                    i10 = i54 + 1;
                    cCharAt4 = strM22384c.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i10;
                }
                iCharAt7 = i55 | (cCharAt4 << i56);
                i54 = i10;
            }
            int i57 = i54 + 1;
            int iCharAt8 = strM22384c.charAt(i54);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i9 = i57 + 1;
                    cCharAt3 = strM22384c.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i9;
                }
                iCharAt8 = i58 | (cCharAt3 << i59);
                i57 = i9;
            }
            int i60 = i57 + 1;
            int iCharAt9 = strM22384c.charAt(i57);
            if (iCharAt9 >= 55296) {
                int i61 = iCharAt9 & 8191;
                int i62 = i60;
                int i63 = 13;
                while (true) {
                    i8 = i62 + 1;
                    cCharAt2 = strM22384c.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i63;
                    i63 += 13;
                    i62 = i8;
                }
                iCharAt9 = i61 | (cCharAt2 << i63);
                i2 = i8;
            } else {
                i2 = i60;
            }
            int i64 = i2 + 1;
            int iCharAt10 = strM22384c.charAt(i2);
            if (iCharAt10 >= 55296) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i7 = i66 + 1;
                    cCharAt = strM22384c.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i65 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i66 = i7;
                }
                iCharAt10 = i65 | (cCharAt << i67);
                i64 = i7;
            }
            int[] iArr2 = new int[iCharAt10 + iCharAt8 + iCharAt9];
            i3 = (iCharAt5 * 2) + iCharAt6;
            i4 = iCharAt8;
            i5 = iCharAt10;
            i35 = iCharAt5;
            i39 = i64;
            int i68 = iCharAt7;
            iArr = iArr2;
            i6 = i68;
        }
        Unsafe unsafe = f43981p;
        Object[] objArrM22383b = c10121lJ0.m22383b();
        Class<?> cls = c10121lJ0.m22382a().getClass();
        int i69 = i39;
        int[] iArr3 = new int[i6 * 3];
        Object[] objArr = new Object[i6 * 2];
        int i70 = i5 + i4;
        int i71 = i5;
        int i72 = i69;
        int i73 = i70;
        int i74 = 0;
        int i75 = 0;
        while (i72 < length) {
            int i76 = i72 + 1;
            int iCharAt11 = strM22384c.charAt(i72);
            if (iCharAt11 >= 55296) {
                int i77 = iCharAt11 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i33 = i78 + 1;
                    cCharAt12 = strM22384c.charAt(i78);
                    i15 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i77 |= (cCharAt12 & 8191) << i79;
                    i79 += 13;
                    i78 = i33;
                    length = i15;
                }
                iCharAt11 = i77 | (cCharAt12 << i79);
                i16 = i33;
            } else {
                i15 = length;
                i16 = i76;
            }
            int i80 = i16 + 1;
            int iCharAt12 = strM22384c.charAt(i16);
            if (iCharAt12 >= 55296) {
                int i81 = iCharAt12 & 8191;
                int i82 = i80;
                int i83 = 13;
                while (true) {
                    i32 = i82 + 1;
                    cCharAt11 = strM22384c.charAt(i82);
                    i17 = i5;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i81 |= (cCharAt11 & 8191) << i83;
                    i83 += 13;
                    i82 = i32;
                    i5 = i17;
                }
                iCharAt12 = i81 | (cCharAt11 << i83);
                i18 = i32;
            } else {
                i17 = i5;
                i18 = i80;
            }
            int i84 = iCharAt12 & KotlinVersion.MAX_COMPONENT_VALUE;
            boolean z2 = z;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i74] = i75;
                i74++;
            }
            if (i84 >= 51) {
                int i85 = i18 + 1;
                int iCharAt13 = strM22384c.charAt(i18);
                if (iCharAt13 >= 55296) {
                    int i86 = iCharAt13 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i31 = i87 + 1;
                        cCharAt10 = strM22384c.charAt(i87);
                        i19 = iCharAt2;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i88;
                        i88 += 13;
                        i87 = i31;
                        iCharAt2 = i19;
                    }
                    iCharAt13 = i86 | (cCharAt10 << i88);
                    i29 = i31;
                } else {
                    i19 = iCharAt2;
                    i29 = i85;
                }
                int i89 = i84 - 51;
                int i90 = i29;
                if (i89 == 9 || i89 == 17) {
                    i30 = 2;
                    objArr[((i75 / 3) * 2) + 1] = objArrM22383b[i3];
                    i3++;
                } else {
                    if (i89 == 12 && (iCharAt3 & 1) == 1) {
                        objArr[((i75 / 3) * 2) + 1] = objArrM22383b[i3];
                        i3++;
                    }
                    i30 = 2;
                }
                int i91 = iCharAt13 * i30;
                Object obj = objArrM22383b[i91];
                if (obj instanceof Field) {
                    fieldM25256H2 = (Field) obj;
                } else {
                    fieldM25256H2 = m25256H(cls, (String) obj);
                    objArrM22383b[i91] = fieldM25256H2;
                }
                int i92 = iCharAt;
                int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM25256H2);
                int i93 = i91 + 1;
                Object obj2 = objArrM22383b[i93];
                if (obj2 instanceof Field) {
                    fieldM25256H3 = (Field) obj2;
                } else {
                    fieldM25256H3 = m25256H(cls, (String) obj2);
                    objArrM22383b[i93] = fieldM25256H3;
                }
                i26 = iObjectFieldOffset2;
                c = 2;
                i21 = iCharAt12;
                i25 = i3;
                str = strM22384c;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM25256H3);
                i24 = 0;
                i20 = i92;
                i23 = i90;
            } else {
                i19 = iCharAt2;
                int i94 = iCharAt;
                int i95 = i3 + 1;
                Field fieldM25256H4 = m25256H(cls, (String) objArrM22383b[i3]);
                i20 = i94;
                if (i84 == 9 || i84 == 17) {
                    i21 = iCharAt12;
                    i22 = 1;
                    objArr[((i75 / 3) * 2) + 1] = fieldM25256H4.getType();
                } else {
                    if (i84 == 27 || i84 == 49) {
                        i21 = iCharAt12;
                        i22 = 1;
                        i28 = i3 + 2;
                        objArr[((i75 / 3) * 2) + 1] = objArrM22383b[i95];
                    } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                        i21 = iCharAt12;
                        i22 = 1;
                        if ((iCharAt3 & 1) == 1) {
                            i28 = i3 + 2;
                            objArr[((i75 / 3) * 2) + 1] = objArrM22383b[i95];
                        }
                    } else if (i84 == 50) {
                        int i96 = i71 + 1;
                        iArr[i71] = i75;
                        int i97 = (i75 / 3) * 2;
                        int i98 = i3 + 2;
                        objArr[i97] = objArrM22383b[i95];
                        if ((iCharAt12 & 2048) != 0) {
                            i95 = i3 + 3;
                            objArr[i97 + 1] = objArrM22383b[i98];
                            i21 = iCharAt12;
                            i71 = i96;
                            i22 = 1;
                        } else {
                            i71 = i96;
                            i95 = i98;
                            i21 = iCharAt12;
                            i22 = 1;
                        }
                    } else {
                        i21 = iCharAt12;
                        i22 = 1;
                    }
                    i95 = i28;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM25256H4);
                if ((iCharAt3 & 1) != i22 || i84 > 17) {
                    str = strM22384c;
                    c = 2;
                    i23 = i18;
                    iObjectFieldOffset = 0;
                    i24 = 0;
                } else {
                    i23 = i18 + 1;
                    int iCharAt14 = strM22384c.charAt(i18);
                    if (iCharAt14 >= 55296) {
                        int i99 = iCharAt14 & 8191;
                        int i100 = 13;
                        while (true) {
                            i27 = i23 + 1;
                            cCharAt9 = strM22384c.charAt(i23);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i99 |= (cCharAt9 & 8191) << i100;
                            i100 += 13;
                            i23 = i27;
                        }
                        iCharAt14 = i99 | (cCharAt9 << i100);
                        i23 = i27;
                    }
                    c = 2;
                    int i101 = (iCharAt14 / 32) + (i35 * 2);
                    Object obj3 = objArrM22383b[i101];
                    if (obj3 instanceof Field) {
                        fieldM25256H = (Field) obj3;
                    } else {
                        fieldM25256H = m25256H(cls, (String) obj3);
                        objArrM22383b[i101] = fieldM25256H;
                    }
                    str = strM22384c;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM25256H);
                    i24 = iCharAt14 % 32;
                }
                if (i84 >= 18 && i84 <= 49) {
                    iArr[i73] = iObjectFieldOffset3;
                    i73++;
                }
                i25 = i95;
                i26 = iObjectFieldOffset3;
            }
            int i102 = i75 + 1;
            iArr3[i75] = iCharAt11;
            int i103 = i75 + 2;
            int i104 = i25;
            int i105 = i21;
            int i106 = i35;
            iArr3[i102] = ((i105 & 256) != 0 ? 268435456 : 0) | ((i105 & 512) != 0 ? 536870912 : 0) | (i84 << 20) | i26;
            i75 += 3;
            iArr3[i103] = iObjectFieldOffset | (i24 << 20);
            i72 = i23;
            strM22384c = str;
            z = z2;
            i3 = i104;
            iCharAt = i20;
            length = i15;
            i5 = i17;
            i35 = i106;
            iCharAt2 = i19;
        }
        return new C11341ur0(iArr3, objArr, iCharAt, iCharAt2, c10121lJ0.m22382a(), z, iArr, i5, i70, c10965rv0, abstractC11707xj0, c9912jg1, c0406gr, c9925jn0);
    }

    /* renamed from: z */
    public static long m25262z(int i) {
        return i & 1048575;
    }

    /* renamed from: C */
    public final int m25263C(int i) {
        if (i < this.f43984c || i > this.f43985d) {
            return -1;
        }
        int[] iArr = this.f43982a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    /* renamed from: D */
    public final void m25264D(Object obj, long j, C6455mu c6455mu, EV0 ev0, C0280ER c0280er) throws Z90 {
        int iM22311z;
        List listMo24975c = this.f43993l.mo24975c(j, obj);
        int i = c6455mu.f37981a;
        if ((i & 7) != 3) {
            throw Z90.m9497b();
        }
        do {
            listMo24975c.add(c6455mu.m23009s(ev0, c0280er));
            C6329ku c6329ku = (C6329ku) c6455mu.f37984d;
            if (c6329ku.m22288c() || c6455mu.f37983c != 0) {
                return;
            } else {
                iM22311z = c6329ku.m22311z();
            }
        } while (iM22311z == i);
        c6455mu.f37983c = iM22311z;
    }

    /* renamed from: E */
    public final void m25265E(Object obj, int i, C6455mu c6455mu, EV0 ev0, C0280ER c0280er) throws Z90 {
        int iM22311z;
        List listMo24975c = this.f43993l.mo24975c(i & 1048575, obj);
        int i2 = c6455mu.f37981a;
        if ((i2 & 7) != 2) {
            throw Z90.m9497b();
        }
        do {
            listMo24975c.add(c6455mu.m23015y(ev0, c0280er));
            C6329ku c6329ku = (C6329ku) c6455mu.f37984d;
            if (c6329ku.m22288c() || c6455mu.f37983c != 0) {
                return;
            } else {
                iM22311z = c6329ku.m22311z();
            }
        } while (iM22311z == i2);
        c6455mu.f37983c = iM22311z;
    }

    /* renamed from: F */
    public final void m25266F(Object obj, int i, C6455mu c6455mu) {
        if ((536870912 & i) != 0) {
            AbstractC8055Og1.m6115r(i & 1048575, obj, c6455mu.m22982K());
        } else if (this.f43987f) {
            AbstractC8055Og1.m6115r(i & 1048575, obj, c6455mu.m22980I());
        } else {
            AbstractC8055Og1.m6115r(i & 1048575, obj, c6455mu.m22996f());
        }
    }

    /* renamed from: G */
    public final void m25267G(Object obj, int i, C6455mu c6455mu) throws Z90 {
        boolean z = (536870912 & i) != 0;
        AbstractC11707xj0 abstractC11707xj0 = this.f43993l;
        if (z) {
            c6455mu.m22981J(abstractC11707xj0.mo24975c(i & 1048575, obj), true);
        } else {
            c6455mu.m22981J(abstractC11707xj0.mo24975c(i & 1048575, obj), false);
        }
    }

    /* renamed from: I */
    public final void m25268I(int i, Object obj) {
        if (this.f43988g) {
            return;
        }
        int i2 = this.f43982a[i + 2];
        long j = i2 & 1048575;
        AbstractC8055Og1.m6113p(j, obj, AbstractC8055Og1.f8565d.m5419g(j, obj) | (1 << (i2 >>> 20)));
    }

    /* renamed from: J */
    public final void m25269J(int i, int i2, Object obj) {
        AbstractC8055Og1.m6113p(this.f43982a[i2 + 2] & 1048575, obj, i);
    }

    /* renamed from: L */
    public final int m25270L(int i) {
        return this.f43982a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: M */
    public final void m25271M(Object obj, C8170Qm0 c8170Qm0) {
        int i;
        boolean z;
        int[] iArr = this.f43982a;
        int length = iArr.length;
        Unsafe unsafe = f43981p;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM25270L = m25270L(i4);
            int i5 = iArr[i4];
            int iM25257K = m25257K(iM25270L);
            if (this.f43988g || iM25257K > 17) {
                i = 0;
            } else {
                int i6 = iArr[i4 + 2];
                int i7 = i6 & 1048575;
                if (i7 != i2) {
                    i3 = unsafe.getInt(obj, i7);
                    i2 = i7;
                }
                i = 1 << (i6 >>> 20);
            }
            long j = iM25270L & 1048575;
            switch (iM25257K) {
                case 0:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6755B(i5, AbstractC8055Og1.f8565d.mo3966e(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6759F(i5, AbstractC8055Og1.f8565d.mo3967f(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6764K(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6772S(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6762I(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6758E(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6757D(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6783z(i5, AbstractC8055Og1.f8565d.mo3964c(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i & i3) != 0) {
                        m25258O(i5, unsafe.getObject(obj, j), c8170Qm0);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6765L(i5, unsafe.getObject(obj, j), m25277n(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6754A(i5, (C0362Fk) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6771R(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6756C(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6766M(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6767N(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6769P(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6770Q(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i & i3) != 0) {
                        c8170Qm0.m6761H(i5, unsafe.getObject(obj, j), m25277n(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    IV0.m3887F(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 19:
                    IV0.m3891J(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 20:
                    IV0.m3894M(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 21:
                    IV0.m3902U(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 22:
                    IV0.m3893L(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 23:
                    IV0.m3890I(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 24:
                    IV0.m3889H(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 25:
                    IV0.m3885D(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 26:
                    IV0.m3900S(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0);
                    break;
                case 27:
                    IV0.m3895N(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, m25277n(i4));
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    IV0.m3886E(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0);
                    break;
                case 29:
                    z = false;
                    IV0.m3901T(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 30:
                    z = false;
                    IV0.m3888G(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 31:
                    z = false;
                    IV0.m3896O(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 32:
                    z = false;
                    IV0.m3897P(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 33:
                    z = false;
                    IV0.m3898Q(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case 34:
                    z = false;
                    IV0.m3899R(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, false);
                    break;
                case C5043c9.f31374J /* 35 */:
                    IV0.m3887F(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    IV0.m3891J(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case 37:
                    IV0.m3894M(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case C5043c9.f31375K /* 38 */:
                    IV0.m3902U(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case 39:
                    IV0.m3893L(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case C5043c9.f31376L /* 40 */:
                    IV0.m3890I(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case 41:
                    IV0.m3889H(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case C5043c9.f31377M /* 42 */:
                    IV0.m3885D(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case 43:
                    IV0.m3901T(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case 44:
                    IV0.m3888G(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case 45:
                    IV0.m3896O(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case 46:
                    IV0.m3897P(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case 47:
                    IV0.m3898Q(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case 48:
                    IV0.m3899R(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, true);
                    break;
                case 49:
                    IV0.m3892K(iArr[i4], (List) unsafe.getObject(obj, j), c8170Qm0, m25277n(i4));
                    break;
                case 50:
                    m25272N(c8170Qm0, i5, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6755B(i5, ((Double) AbstractC8055Og1.f8565d.m5421i(j, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6759F(i5, ((Float) AbstractC8055Og1.f8565d.m5421i(j, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6764K(i5, m25255B(j, obj));
                    }
                    break;
                case 54:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6772S(i5, m25255B(j, obj));
                    }
                    break;
                case 55:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6762I(i5, m25254A(j, obj));
                    }
                    break;
                case 56:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6758E(i5, m25255B(j, obj));
                    }
                    break;
                case 57:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6757D(i5, m25254A(j, obj));
                    }
                    break;
                case 58:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6783z(i5, ((Boolean) AbstractC8055Og1.f8565d.m5421i(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (m25281r(i5, i4, obj)) {
                        m25258O(i5, unsafe.getObject(obj, j), c8170Qm0);
                    }
                    break;
                case 60:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6765L(i5, unsafe.getObject(obj, j), m25277n(i4));
                    }
                    break;
                case 61:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6754A(i5, (C0362Fk) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6771R(i5, m25254A(j, obj));
                    }
                    break;
                case 63:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6756C(i5, m25254A(j, obj));
                    }
                    break;
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6766M(i5, m25254A(j, obj));
                    }
                    break;
                case 65:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6767N(i5, m25255B(j, obj));
                    }
                    break;
                case 66:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6769P(i5, m25254A(j, obj));
                    }
                    break;
                case 67:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6770Q(i5, m25255B(j, obj));
                    }
                    break;
                case 68:
                    if (m25281r(i5, i4, obj)) {
                        c8170Qm0.m6761H(i5, unsafe.getObject(obj, j), m25277n(i4));
                    }
                    break;
            }
        }
        this.f43994m.getClass();
        ((B00) obj).unknownFields.m18847d(c8170Qm0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0143 A[SYNTHETIC] */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25272N(p000.C8170Qm0 r23, int r24, java.lang.Object r25, int r26) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11341ur0.m25272N(Qm0, int, java.lang.Object, int):void");
    }

    @Override // p000.EV0
    /* renamed from: a */
    public final Object mo2317a() {
        this.f43992k.getClass();
        return ((B00) this.f43986e).mo432d(4);
    }

    @Override // p000.EV0
    /* renamed from: b */
    public final void mo2318b(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.f43990i;
        while (true) {
            iArr = this.f43989h;
            i = this.f43991j;
            if (i2 >= i) {
                break;
            }
            long jM25270L = m25270L(iArr[i2]) & 1048575;
            Object objM5421i = AbstractC8055Og1.f8565d.m5421i(jM25270L, obj);
            if (objM5421i != null) {
                this.f43995n.getClass();
                ((C9669hn0) objM5421i).f28585a = false;
                AbstractC8055Og1.m6115r(jM25270L, obj, objM5421i);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f43993l.mo24973a(iArr[i], obj);
            i++;
        }
        this.f43994m.getClass();
        ((B00) obj).unknownFields.f28527e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    @Override // p000.EV0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2319c(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11341ur0.mo2319c(java.lang.Object):boolean");
    }

    @Override // p000.EV0
    /* renamed from: d */
    public final void mo2320d(Object obj, C8170Qm0 c8170Qm0) {
        c8170Qm0.getClass();
        if (!this.f43988g) {
            m25271M(obj, c8170Qm0);
            return;
        }
        int[] iArr = this.f43982a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iM25270L = m25270L(i);
            int i2 = iArr[i];
            switch (m25257K(iM25270L)) {
                case 0:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6755B(i2, AbstractC8055Og1.f8565d.mo3966e(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6759F(i2, AbstractC8055Og1.f8565d.mo3967f(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6764K(i2, AbstractC8055Og1.f8565d.m5420h(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6772S(i2, AbstractC8055Og1.f8565d.m5420h(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6762I(i2, AbstractC8055Og1.f8565d.m5419g(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6758E(i2, AbstractC8055Og1.f8565d.m5420h(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6757D(i2, AbstractC8055Og1.f8565d.m5419g(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6783z(i2, AbstractC8055Og1.f8565d.mo3964c(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m25280q(i, obj)) {
                        m25258O(i2, AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6765L(i2, AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), m25277n(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6754A(i2, (C0362Fk) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6771R(i2, AbstractC8055Og1.f8565d.m5419g(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6756C(i2, AbstractC8055Og1.f8565d.m5419g(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6766M(i2, AbstractC8055Og1.f8565d.m5419g(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6767N(i2, AbstractC8055Og1.f8565d.m5420h(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6769P(i2, AbstractC8055Og1.f8565d.m5419g(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6770Q(i2, AbstractC8055Og1.f8565d.m5420h(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m25280q(i, obj)) {
                        c8170Qm0.m6761H(i2, AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), m25277n(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    IV0.m3887F(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 19:
                    IV0.m3891J(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 20:
                    IV0.m3894M(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 21:
                    IV0.m3902U(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 22:
                    IV0.m3893L(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 23:
                    IV0.m3890I(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 24:
                    IV0.m3889H(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 25:
                    IV0.m3885D(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 26:
                    IV0.m3900S(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0);
                    break;
                case 27:
                    IV0.m3895N(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, m25277n(i));
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    IV0.m3886E(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0);
                    break;
                case 29:
                    IV0.m3901T(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 30:
                    IV0.m3888G(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 31:
                    IV0.m3896O(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 32:
                    IV0.m3897P(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 33:
                    IV0.m3898Q(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case 34:
                    IV0.m3899R(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, false);
                    break;
                case C5043c9.f31374J /* 35 */:
                    IV0.m3887F(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    IV0.m3891J(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case 37:
                    IV0.m3894M(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case C5043c9.f31375K /* 38 */:
                    IV0.m3902U(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case 39:
                    IV0.m3893L(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case C5043c9.f31376L /* 40 */:
                    IV0.m3890I(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case 41:
                    IV0.m3889H(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case C5043c9.f31377M /* 42 */:
                    IV0.m3885D(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case 43:
                    IV0.m3901T(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case 44:
                    IV0.m3888G(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case 45:
                    IV0.m3896O(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case 46:
                    IV0.m3897P(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case 47:
                    IV0.m3898Q(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case 48:
                    IV0.m3899R(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, true);
                    break;
                case 49:
                    IV0.m3892K(iArr[i], (List) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0, m25277n(i));
                    break;
                case 50:
                    m25272N(c8170Qm0, i2, AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), i);
                    break;
                case 51:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6755B(i2, ((Double) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6759F(i2, ((Float) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj)).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6764K(i2, m25255B(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6772S(i2, m25255B(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6762I(i2, m25254A(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6758E(i2, m25255B(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6757D(i2, m25254A(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6783z(i2, ((Boolean) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m25281r(i2, i, obj)) {
                        m25258O(i2, AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), c8170Qm0);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6765L(i2, AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), m25277n(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6754A(i2, (C0362Fk) AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6771R(i2, m25254A(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6756C(i2, m25254A(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6766M(i2, m25254A(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6767N(i2, m25255B(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6769P(i2, m25254A(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6770Q(i2, m25255B(iM25270L & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m25281r(i2, i, obj)) {
                        c8170Qm0.m6761H(i2, AbstractC8055Og1.f8565d.m5421i(iM25270L & 1048575, obj), m25277n(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f43994m.getClass();
        ((B00) obj).unknownFields.m18847d(c8170Qm0);
    }

    @Override // p000.EV0
    /* renamed from: e */
    public final void mo2321e(Object obj, C6455mu c6455mu, C0280ER c0280er) throws Throwable {
        c0280er.getClass();
        m25282t(this.f43994m, obj, c6455mu, c0280er);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.EV0
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo2322f(p000.B00 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11341ur0.mo2322f(B00):int");
    }

    @Override // p000.EV0
    /* renamed from: g */
    public final void mo2323g(B00 b00, B00 b002) {
        b002.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f43982a;
            if (i >= iArr.length) {
                if (this.f43988g) {
                    return;
                }
                IV0.m3883B(this.f43994m, b00, b002);
                return;
            }
            int iM25270L = m25270L(i);
            long j = 1048575 & iM25270L;
            int i2 = iArr[i];
            switch (m25257K(iM25270L)) {
                case 0:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC7951Mg1 abstractC7951Mg1 = AbstractC8055Og1.f8565d;
                        abstractC7951Mg1.mo3970m(b00, j, abstractC7951Mg1.mo3966e(j, b002));
                        m25268I(i, b00);
                        break;
                    }
                case 1:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC7951Mg1 abstractC7951Mg12 = AbstractC8055Og1.f8565d;
                        abstractC7951Mg12.mo3971n(b00, j, abstractC7951Mg12.mo3967f(j, b002));
                        m25268I(i, b00);
                        break;
                    }
                case 2:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6114q(j, AbstractC8055Og1.f8565d.m5420h(j, b002), b00);
                        m25268I(i, b00);
                        break;
                    }
                case 3:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6114q(j, AbstractC8055Og1.f8565d.m5420h(j, b002), b00);
                        m25268I(i, b00);
                        break;
                    }
                case 4:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6113p(j, b00, AbstractC8055Og1.f8565d.m5419g(j, b002));
                        m25268I(i, b00);
                        break;
                    }
                case 5:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6114q(j, AbstractC8055Og1.f8565d.m5420h(j, b002), b00);
                        m25268I(i, b00);
                        break;
                    }
                case 6:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6113p(j, b00, AbstractC8055Og1.f8565d.m5419g(j, b002));
                        m25268I(i, b00);
                        break;
                    }
                case 7:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC7951Mg1 abstractC7951Mg13 = AbstractC8055Og1.f8565d;
                        abstractC7951Mg13.mo3968k(b00, j, abstractC7951Mg13.mo3964c(j, b002));
                        m25268I(i, b00);
                        break;
                    }
                case 8:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6115r(j, b00, AbstractC8055Og1.f8565d.m5421i(j, b002));
                        m25268I(i, b00);
                        break;
                    }
                case 9:
                    m25284v(b00, b002, i);
                    break;
                case 10:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6115r(j, b00, AbstractC8055Og1.f8565d.m5421i(j, b002));
                        m25268I(i, b00);
                        break;
                    }
                case 11:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6113p(j, b00, AbstractC8055Og1.f8565d.m5419g(j, b002));
                        m25268I(i, b00);
                        break;
                    }
                case 12:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6113p(j, b00, AbstractC8055Og1.f8565d.m5419g(j, b002));
                        m25268I(i, b00);
                        break;
                    }
                case 13:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6113p(j, b00, AbstractC8055Og1.f8565d.m5419g(j, b002));
                        m25268I(i, b00);
                        break;
                    }
                case 14:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6114q(j, AbstractC8055Og1.f8565d.m5420h(j, b002), b00);
                        m25268I(i, b00);
                        break;
                    }
                case 15:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6113p(j, b00, AbstractC8055Og1.f8565d.m5419g(j, b002));
                        m25268I(i, b00);
                        break;
                    }
                case 16:
                    if (!m25280q(i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6114q(j, AbstractC8055Og1.f8565d.m5420h(j, b002), b00);
                        m25268I(i, b00);
                        break;
                    }
                case 17:
                    m25284v(b00, b002, i);
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
                    this.f43993l.mo24974b(b00, b002, j);
                    break;
                case 50:
                    Class cls = IV0.f4959a;
                    AbstractC7951Mg1 abstractC7951Mg14 = AbstractC8055Og1.f8565d;
                    Object objM5421i = abstractC7951Mg14.m5421i(j, b00);
                    Object objM5421i2 = abstractC7951Mg14.m5421i(j, b002);
                    this.f43995n.getClass();
                    AbstractC8055Og1.m6115r(j, b00, C9925jn0.m22101b(objM5421i, objM5421i2));
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
                    if (!m25281r(i2, i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6115r(j, b00, AbstractC8055Og1.f8565d.m5421i(j, b002));
                        m25269J(i2, i, b00);
                        break;
                    }
                case 60:
                    m25285w(b00, b002, i);
                    break;
                case 61:
                case 62:
                case 63:
                case NativeMac.KEY_LENGTH /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (!m25281r(i2, i, b002)) {
                        break;
                    } else {
                        AbstractC8055Og1.m6115r(j, b00, AbstractC8055Og1.f8565d.m5421i(j, b002));
                        m25269J(i2, i, b00);
                        break;
                    }
                case 68:
                    m25285w(b00, b002, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // p000.EV0
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2324h(p000.B00 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11341ur0.mo2324h(B00, java.lang.Object):boolean");
    }

    @Override // p000.EV0
    /* renamed from: i */
    public final int mo2325i(AbstractC0694L0 abstractC0694L0) {
        return this.f43988g ? m25279p(abstractC0694L0) : m25278o(abstractC0694L0);
    }

    /* renamed from: j */
    public final boolean m25273j(B00 b00, Object obj, int i) {
        return m25280q(i, b00) == m25280q(i, obj);
    }

    /* renamed from: k */
    public final void m25274k(Object obj, int i, Object obj2) {
        int i2 = this.f43982a[i];
        if (AbstractC8055Og1.f8565d.m5421i(m25270L(i) & 1048575, obj) == null) {
            return;
        }
        m25275l(i);
    }

    /* renamed from: l */
    public final void m25275l(int i) {
        if (this.f43983b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: m */
    public final Object m25276m(int i) {
        return this.f43983b[(i / 3) * 2];
    }

    /* renamed from: n */
    public final EV0 m25277n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f43983b;
        EV0 ev0 = (EV0) objArr[i2];
        if (ev0 != null) {
            return ev0;
        }
        EV0 ev0M9517a = ZF0.f14820c.m9517a((Class) objArr[i2 + 1]);
        objArr[i2] = ev0M9517a;
        return ev0M9517a;
    }

    /* renamed from: o */
    public final int m25278o(AbstractC0694L0 abstractC0694L0) {
        int i;
        int iM24086k;
        int iM24084i;
        int iM3911i;
        int iM24101z;
        Unsafe unsafe = f43981p;
        int i2 = -1;
        int i3 = 0;
        int iM5757f = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f43982a;
            if (i3 >= iArr.length) {
                this.f43994m.getClass();
                return ((B00) abstractC0694L0).unknownFields.m18845a() + iM5757f;
            }
            int iM25270L = m25270L(i3);
            int i5 = iArr[i3];
            int iM25257K = m25257K(iM25270L);
            if (iM25257K <= 17) {
                int i6 = iArr[i3 + 2];
                int i7 = i6 & 1048575;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i4 = unsafe.getInt(abstractC0694L0, i7);
                    i2 = i7;
                }
            } else {
                i = 0;
            }
            long j = iM25270L & 1048575;
            switch (iM25257K) {
                case 0:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24086k(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 1:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24090o(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 2:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24094s(i5, unsafe.getLong(abstractC0694L0, j));
                        iM5757f += iM24086k;
                        break;
                    }
                case 3:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24081C(i5, unsafe.getLong(abstractC0694L0, j));
                        iM5757f += iM24086k;
                        break;
                    }
                case 4:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24092q(i5, unsafe.getInt(abstractC0694L0, j));
                        iM5757f += iM24086k;
                        break;
                    }
                case 5:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24089n(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 6:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24088m(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 7:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24083h(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 8:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0694L0, j);
                        iM24084i = object instanceof C0362Fk ? C6709qu.m24084i(i5, (C0362Fk) object) : C6709qu.m24099x(i5, (String) object);
                        iM5757f = iM24084i + iM5757f;
                        break;
                    }
                case 9:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = IV0.m3917o(i5, unsafe.getObject(abstractC0694L0, j), m25277n(i3));
                        iM5757f += iM24086k;
                        break;
                    }
                case 10:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24084i(i5, (C0362Fk) unsafe.getObject(abstractC0694L0, j));
                        iM5757f += iM24086k;
                        break;
                    }
                case 11:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24079A(i5, unsafe.getInt(abstractC0694L0, j));
                        iM5757f += iM24086k;
                        break;
                    }
                case 12:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24087l(i5, unsafe.getInt(abstractC0694L0, j));
                        iM5757f += iM24086k;
                        break;
                    }
                case 13:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24095t(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 14:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24096u(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 15:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24097v(i5, unsafe.getInt(abstractC0694L0, j));
                        iM5757f += iM24086k;
                        break;
                    }
                case 16:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24098w(i5, unsafe.getLong(abstractC0694L0, j));
                        iM5757f += iM24086k;
                        break;
                    }
                case 17:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24091p(i5, (AbstractC0694L0) unsafe.getObject(abstractC0694L0, j), m25277n(i3));
                        iM5757f += iM24086k;
                        break;
                    }
                case 18:
                    iM24086k = IV0.m3910h(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 19:
                    iM24086k = IV0.m3908f(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 20:
                    iM24086k = IV0.m3915m(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 21:
                    iM24086k = IV0.m3926x(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 22:
                    iM24086k = IV0.m3913k(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 23:
                    iM24086k = IV0.m3910h(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 24:
                    iM24086k = IV0.m3908f(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 25:
                    iM24086k = IV0.m3903a(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 26:
                    iM24086k = IV0.m3923u(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 27:
                    iM24086k = IV0.m3918p(i5, (List) unsafe.getObject(abstractC0694L0, j), m25277n(i3));
                    iM5757f += iM24086k;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iM24086k = IV0.m3905c(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 29:
                    iM24086k = IV0.m3924v(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 30:
                    iM24086k = IV0.m3906d(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 31:
                    iM24086k = IV0.m3908f(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 32:
                    iM24086k = IV0.m3910h(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 33:
                    iM24086k = IV0.m3919q(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case 34:
                    iM24086k = IV0.m3921s(i5, (List) unsafe.getObject(abstractC0694L0, j));
                    iM5757f += iM24086k;
                    break;
                case C5043c9.f31374J /* 35 */:
                    iM3911i = IV0.m3911i((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    iM3911i = IV0.m3909g((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 37:
                    iM3911i = IV0.m3916n((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case C5043c9.f31375K /* 38 */:
                    iM3911i = IV0.m3927y((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 39:
                    iM3911i = IV0.m3914l((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case C5043c9.f31376L /* 40 */:
                    iM3911i = IV0.m3911i((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 41:
                    iM3911i = IV0.m3909g((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case C5043c9.f31377M /* 42 */:
                    iM3911i = IV0.m3904b((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 43:
                    iM3911i = IV0.m3925w((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 44:
                    iM3911i = IV0.m3907e((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 45:
                    iM3911i = IV0.m3909g((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 46:
                    iM3911i = IV0.m3911i((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 47:
                    iM3911i = IV0.m3920r((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 48:
                    iM3911i = IV0.m3922t((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i5);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 49:
                    iM24086k = IV0.m3912j(i5, (List) unsafe.getObject(abstractC0694L0, j), m25277n(i3));
                    iM5757f += iM24086k;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0694L0, j);
                    Object objM25276m = m25276m(i3);
                    this.f43995n.getClass();
                    iM24086k = C9925jn0.m22100a(object2, i5, objM25276m);
                    iM5757f += iM24086k;
                    break;
                case 51:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24086k(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 52:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24090o(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 53:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24094s(i5, m25255B(j, abstractC0694L0));
                        iM5757f += iM24086k;
                        break;
                    }
                case 54:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24081C(i5, m25255B(j, abstractC0694L0));
                        iM5757f += iM24086k;
                        break;
                    }
                case 55:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24092q(i5, m25254A(j, abstractC0694L0));
                        iM5757f += iM24086k;
                        break;
                    }
                case 56:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24089n(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 57:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24088m(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 58:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24083h(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 59:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0694L0, j);
                        iM24084i = object3 instanceof C0362Fk ? C6709qu.m24084i(i5, (C0362Fk) object3) : C6709qu.m24099x(i5, (String) object3);
                        iM5757f = iM24084i + iM5757f;
                        break;
                    }
                case 60:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = IV0.m3917o(i5, unsafe.getObject(abstractC0694L0, j), m25277n(i3));
                        iM5757f += iM24086k;
                        break;
                    }
                case 61:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24084i(i5, (C0362Fk) unsafe.getObject(abstractC0694L0, j));
                        iM5757f += iM24086k;
                        break;
                    }
                case 62:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24079A(i5, m25254A(j, abstractC0694L0));
                        iM5757f += iM24086k;
                        break;
                    }
                case 63:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24087l(i5, m25254A(j, abstractC0694L0));
                        iM5757f += iM24086k;
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24095t(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 65:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24096u(i5);
                        iM5757f += iM24086k;
                        break;
                    }
                case 66:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24097v(i5, m25254A(j, abstractC0694L0));
                        iM5757f += iM24086k;
                        break;
                    }
                case 67:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24098w(i5, m25255B(j, abstractC0694L0));
                        iM5757f += iM24086k;
                        break;
                    }
                case 68:
                    if (!m25281r(i5, i3, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24091p(i5, (AbstractC0694L0) unsafe.getObject(abstractC0694L0, j), m25277n(i3));
                        iM5757f += iM24086k;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    /* renamed from: p */
    public final int m25279p(AbstractC0694L0 abstractC0694L0) {
        int iM24086k;
        int iM3911i;
        int iM24101z;
        Unsafe unsafe = f43981p;
        int i = 0;
        int iM5757f = 0;
        while (true) {
            int[] iArr = this.f43982a;
            if (i >= iArr.length) {
                this.f43994m.getClass();
                return ((B00) abstractC0694L0).unknownFields.m18845a() + iM5757f;
            }
            int iM25270L = m25270L(i);
            int iM25257K = m25257K(iM25270L);
            int i2 = iArr[i];
            long j = iM25270L & 1048575;
            if (iM25257K >= EnumC6239jT.f35153b.m22034a() && iM25257K <= EnumC6239jT.f35154c.m22034a()) {
                int i3 = iArr[i + 2];
            }
            switch (iM25257K) {
                case 0:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24086k(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 1:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24090o(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 2:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24094s(i2, AbstractC8055Og1.m6107j(abstractC0694L0, j));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 3:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24081C(i2, AbstractC8055Og1.m6107j(abstractC0694L0, j));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 4:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24092q(i2, AbstractC8055Og1.m6106i(abstractC0694L0, j));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 5:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24089n(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 6:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24088m(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 7:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24083h(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 8:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        Object objM6108k = AbstractC8055Og1.m6108k(j, abstractC0694L0);
                        iM24086k = objM6108k instanceof C0362Fk ? C6709qu.m24084i(i2, (C0362Fk) objM6108k) : C6709qu.m24099x(i2, (String) objM6108k);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 9:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = IV0.m3917o(i2, AbstractC8055Og1.m6108k(j, abstractC0694L0), m25277n(i));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 10:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24084i(i2, (C0362Fk) AbstractC8055Og1.m6108k(j, abstractC0694L0));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 11:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24079A(i2, AbstractC8055Og1.m6106i(abstractC0694L0, j));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 12:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24087l(i2, AbstractC8055Og1.m6106i(abstractC0694L0, j));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 13:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24095t(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 14:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24096u(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 15:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24097v(i2, AbstractC8055Og1.m6106i(abstractC0694L0, j));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 16:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24098w(i2, AbstractC8055Og1.m6107j(abstractC0694L0, j));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 17:
                    if (!m25280q(i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24091p(i2, (AbstractC0694L0) AbstractC8055Og1.m6108k(j, abstractC0694L0), m25277n(i));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 18:
                    iM24086k = IV0.m3910h(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 19:
                    iM24086k = IV0.m3908f(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 20:
                    iM24086k = IV0.m3915m(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 21:
                    iM24086k = IV0.m3926x(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 22:
                    iM24086k = IV0.m3913k(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 23:
                    iM24086k = IV0.m3910h(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 24:
                    iM24086k = IV0.m3908f(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 25:
                    iM24086k = IV0.m3903a(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 26:
                    iM24086k = IV0.m3923u(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 27:
                    iM24086k = IV0.m3918p(i2, m25259s(abstractC0694L0, j), m25277n(i));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iM24086k = IV0.m3905c(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 29:
                    iM24086k = IV0.m3924v(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 30:
                    iM24086k = IV0.m3906d(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 31:
                    iM24086k = IV0.m3908f(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 32:
                    iM24086k = IV0.m3910h(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 33:
                    iM24086k = IV0.m3919q(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 34:
                    iM24086k = IV0.m3921s(i2, m25259s(abstractC0694L0, j));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case C5043c9.f31374J /* 35 */:
                    iM3911i = IV0.m3911i((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    iM3911i = IV0.m3909g((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 37:
                    iM3911i = IV0.m3916n((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case C5043c9.f31375K /* 38 */:
                    iM3911i = IV0.m3927y((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 39:
                    iM3911i = IV0.m3914l((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case C5043c9.f31376L /* 40 */:
                    iM3911i = IV0.m3911i((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 41:
                    iM3911i = IV0.m3909g((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case C5043c9.f31377M /* 42 */:
                    iM3911i = IV0.m3904b((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 43:
                    iM3911i = IV0.m3925w((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 44:
                    iM3911i = IV0.m3907e((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 45:
                    iM3911i = IV0.m3909g((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 46:
                    iM3911i = IV0.m3911i((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 47:
                    iM3911i = IV0.m3920r((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 48:
                    iM3911i = IV0.m3922t((List) unsafe.getObject(abstractC0694L0, j));
                    if (iM3911i <= 0) {
                        break;
                    } else {
                        iM24101z = C6709qu.m24101z(i2);
                        iM5757f = AbstractC0852NX.m5757f(iM3911i, iM24101z, iM3911i, iM5757f);
                        break;
                    }
                case 49:
                    iM24086k = IV0.m3912j(i2, m25259s(abstractC0694L0, j), m25277n(i));
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 50:
                    Object objM6108k2 = AbstractC8055Og1.m6108k(j, abstractC0694L0);
                    Object objM25276m = m25276m(i);
                    this.f43995n.getClass();
                    iM24086k = C9925jn0.m22100a(objM6108k2, i2, objM25276m);
                    iM5757f = iM24086k + iM5757f;
                    break;
                case 51:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24086k(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 52:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24090o(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 53:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24094s(i2, m25255B(j, abstractC0694L0));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 54:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24081C(i2, m25255B(j, abstractC0694L0));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 55:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24092q(i2, m25254A(j, abstractC0694L0));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 56:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24089n(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 57:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24088m(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 58:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24083h(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 59:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        Object objM6108k3 = AbstractC8055Og1.m6108k(j, abstractC0694L0);
                        iM24086k = objM6108k3 instanceof C0362Fk ? C6709qu.m24084i(i2, (C0362Fk) objM6108k3) : C6709qu.m24099x(i2, (String) objM6108k3);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 60:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = IV0.m3917o(i2, AbstractC8055Og1.m6108k(j, abstractC0694L0), m25277n(i));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 61:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24084i(i2, (C0362Fk) AbstractC8055Og1.m6108k(j, abstractC0694L0));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 62:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24079A(i2, m25254A(j, abstractC0694L0));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 63:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24087l(i2, m25254A(j, abstractC0694L0));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24095t(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 65:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24096u(i2);
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 66:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24097v(i2, m25254A(j, abstractC0694L0));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 67:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24098w(i2, m25255B(j, abstractC0694L0));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
                case 68:
                    if (!m25281r(i2, i, abstractC0694L0)) {
                        break;
                    } else {
                        iM24086k = C6709qu.m24091p(i2, (AbstractC0694L0) AbstractC8055Og1.m6108k(j, abstractC0694L0), m25277n(i));
                        iM5757f = iM24086k + iM5757f;
                        break;
                    }
            }
            i += 3;
        }
    }

    /* renamed from: q */
    public final boolean m25280q(int i, Object obj) {
        if (!this.f43988g) {
            int i2 = this.f43982a[i + 2];
            return (AbstractC8055Og1.f8565d.m5419g((long) (i2 & 1048575), obj) & (1 << (i2 >>> 20))) != 0;
        }
        int iM25270L = m25270L(i);
        long j = iM25270L & 1048575;
        switch (m25257K(iM25270L)) {
            case 0:
                return AbstractC8055Og1.f8565d.mo3966e(j, obj) != ConfigValue.DOUBLE_DEFAULT_VALUE;
            case 1:
                return AbstractC8055Og1.f8565d.mo3967f(j, obj) != 0.0f;
            case 2:
                return AbstractC8055Og1.f8565d.m5420h(j, obj) != 0;
            case 3:
                return AbstractC8055Og1.f8565d.m5420h(j, obj) != 0;
            case 4:
                return AbstractC8055Og1.f8565d.m5419g(j, obj) != 0;
            case 5:
                return AbstractC8055Og1.f8565d.m5420h(j, obj) != 0;
            case 6:
                return AbstractC8055Og1.f8565d.m5419g(j, obj) != 0;
            case 7:
                return AbstractC8055Og1.f8565d.mo3964c(j, obj);
            case 8:
                Object objM5421i = AbstractC8055Og1.f8565d.m5421i(j, obj);
                if (objM5421i instanceof String) {
                    return !((String) objM5421i).isEmpty();
                }
                if (objM5421i instanceof C0362Fk) {
                    return !C0362Fk.f3403c.equals(objM5421i);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC8055Og1.f8565d.m5421i(j, obj) != null;
            case 10:
                return !C0362Fk.f3403c.equals(AbstractC8055Og1.f8565d.m5421i(j, obj));
            case 11:
                return AbstractC8055Og1.f8565d.m5419g(j, obj) != 0;
            case 12:
                return AbstractC8055Og1.f8565d.m5419g(j, obj) != 0;
            case 13:
                return AbstractC8055Og1.f8565d.m5419g(j, obj) != 0;
            case 14:
                return AbstractC8055Og1.f8565d.m5420h(j, obj) != 0;
            case 15:
                return AbstractC8055Og1.f8565d.m5419g(j, obj) != 0;
            case 16:
                return AbstractC8055Og1.f8565d.m5420h(j, obj) != 0;
            case 17:
                return AbstractC8055Og1.f8565d.m5421i(j, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: r */
    public final boolean m25281r(int i, int i2, Object obj) {
        return AbstractC8055Og1.f8565d.m5419g((long) (this.f43982a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x05f1 A[Catch: all -> 0x024d, TryCatch #4 {all -> 0x024d, blocks: (B:132:0x05ec, B:134:0x05f1, B:136:0x05f8, B:138:0x05ff, B:73:0x0248, B:76:0x0250, B:77:0x0260, B:78:0x0270, B:79:0x0280, B:80:0x0290, B:81:0x02a6, B:82:0x02b6, B:83:0x02c6, B:84:0x02d6, B:85:0x02e6, B:86:0x02f6, B:87:0x0306, B:88:0x0316, B:89:0x0326, B:90:0x0336, B:91:0x0346, B:92:0x0356, B:93:0x0366, B:94:0x0376, B:95:0x038c, B:96:0x039c, B:97:0x03ac, B:98:0x03c0, B:99:0x03c8, B:100:0x03d8, B:101:0x03e8, B:102:0x03f8, B:103:0x0408, B:104:0x0418, B:105:0x0428, B:106:0x0438, B:107:0x0448, B:109:0x0451, B:110:0x046e, B:111:0x0482, B:112:0x0495, B:113:0x04a8, B:114:0x04bb, B:115:0x04ce, B:116:0x04e4, B:117:0x04f7, B:118:0x050a, B:120:0x0513, B:121:0x0530, B:122:0x0544, B:123:0x054f, B:124:0x0564, B:125:0x0577, B:126:0x058a, B:127:0x059d, B:128:0x05b0, B:129:0x05c2, B:130:0x05d6), top: B:162:0x05ec }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0605 A[SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25282t(p000.C9912jg1 r18, java.lang.Object r19, p000.C6455mu r20, p000.C0280ER r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11341ur0.m25282t(jg1, java.lang.Object, mu, ER):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        r0.m22289d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        return;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25283u(java.lang.Object r9, int r10, java.lang.Object r11, p000.C0280ER r12, p000.C6455mu r13) throws p000.Z90 {
        /*
            r8 = this;
            int r10 = r8.m25270L(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            Mg1 r10 = p000.AbstractC8055Og1.f8565d
            java.lang.Object r10 = r10.m5421i(r0, r9)
            jn0 r2 = r8.f43995n
            if (r10 != 0) goto L20
            r2.getClass()
            hn0 r10 = p000.C9669hn0.f28584b
            hn0 r10 = r10.m18881e()
            p000.AbstractC8055Og1.m6115r(r0, r9, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            hn0 r3 = (p000.C9669hn0) r3
            boolean r3 = r3.f28585a
            if (r3 != 0) goto L37
            hn0 r3 = p000.C9669hn0.f28584b
            hn0 r3 = r3.m18881e()
            p000.C9925jn0.m22101b(r3, r10)
            p000.AbstractC8055Og1.m6115r(r0, r9, r3)
            r10 = r3
        L37:
            r2.getClass()
            hn0 r10 = (p000.C9669hn0) r10
            fn0 r11 = (p000.C9413fn0) r11
            Xo1 r9 = r11.f27380a
            r11 = 2
            r13.m22989R(r11)
            java.lang.Object r0 = r13.f37984d
            ku r0 = (p000.C6329ku) r0
            int r1 = r0.m22279A()
            int r1 = r0.m22290e(r1)
            java.lang.String r2 = ""
            java.lang.Object r3 = r9.f13983d
            UC0 r3 = (p000.UC0) r3
            r4 = r3
        L57:
            int r5 = r13.m22992b()     // Catch: java.lang.Throwable -> L7b
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto La1
            boolean r6 = r0.m22288c()     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto L67
            goto La1
        L67:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L8a
            if (r5 == r11) goto L7d
            boolean r5 = r13.m22990S()     // Catch: java.lang.Throwable -> L7b p000.W90 -> L94
            if (r5 == 0) goto L75
            goto L57
        L75:
            Z90 r5 = new Z90     // Catch: java.lang.Throwable -> L7b p000.W90 -> L94
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L7b p000.W90 -> L94
            throw r5     // Catch: java.lang.Throwable -> L7b p000.W90 -> L94
        L7b:
            r9 = move-exception
            goto La8
        L7d:
            java.lang.Object r5 = r9.f13982c     // Catch: java.lang.Throwable -> L7b p000.W90 -> L94
            jo1 r5 = (p000.C9928jo1) r5     // Catch: java.lang.Throwable -> L7b p000.W90 -> L94
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L7b p000.W90 -> L94
            java.lang.Object r4 = r13.m23002l(r5, r6, r12)     // Catch: java.lang.Throwable -> L7b p000.W90 -> L94
            goto L57
        L8a:
            java.lang.Object r5 = r9.f13981b     // Catch: java.lang.Throwable -> L7b p000.W90 -> L94
            do1 r5 = (p000.C9160do1) r5     // Catch: java.lang.Throwable -> L7b p000.W90 -> L94
            r6 = 0
            java.lang.Object r2 = r13.m23002l(r5, r6, r6)     // Catch: java.lang.Throwable -> L7b p000.W90 -> L94
            goto L57
        L94:
            boolean r5 = r13.m22990S()     // Catch: java.lang.Throwable -> L7b
            if (r5 == 0) goto L9b
            goto L57
        L9b:
            Z90 r9 = new Z90     // Catch: java.lang.Throwable -> L7b
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L7b
            throw r9     // Catch: java.lang.Throwable -> L7b
        La1:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L7b
            r0.m22289d(r1)
            return
        La8:
            r0.m22289d(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11341ur0.m25283u(java.lang.Object, int, java.lang.Object, ER, mu):void");
    }

    /* renamed from: v */
    public final void m25284v(B00 b00, B00 b002, int i) {
        long jM25270L = m25270L(i) & 1048575;
        if (m25280q(i, b002)) {
            AbstractC7951Mg1 abstractC7951Mg1 = AbstractC8055Og1.f8565d;
            Object objM5421i = abstractC7951Mg1.m5421i(jM25270L, b00);
            Object objM5421i2 = abstractC7951Mg1.m5421i(jM25270L, b002);
            if (objM5421i != null && objM5421i2 != null) {
                AbstractC8055Og1.m6115r(jM25270L, b00, AbstractC11889z90.m26315c(objM5421i, objM5421i2));
                m25268I(i, b00);
            } else if (objM5421i2 != null) {
                AbstractC8055Og1.m6115r(jM25270L, b00, objM5421i2);
                m25268I(i, b00);
            }
        }
    }

    /* renamed from: w */
    public final void m25285w(B00 b00, B00 b002, int i) {
        int iM25270L = m25270L(i);
        int i2 = this.f43982a[i];
        long j = iM25270L & 1048575;
        if (m25281r(i2, i, b002)) {
            AbstractC7951Mg1 abstractC7951Mg1 = AbstractC8055Og1.f8565d;
            Object objM5421i = abstractC7951Mg1.m5421i(j, b00);
            Object objM5421i2 = abstractC7951Mg1.m5421i(j, b002);
            if (objM5421i != null && objM5421i2 != null) {
                AbstractC8055Og1.m6115r(j, b00, AbstractC11889z90.m26315c(objM5421i, objM5421i2));
                m25269J(i2, i, b00);
            } else if (objM5421i2 != null) {
                AbstractC8055Og1.m6115r(j, b00, objM5421i2);
                m25269J(i2, i, b00);
            }
        }
    }
}
