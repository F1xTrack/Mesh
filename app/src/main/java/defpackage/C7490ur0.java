package defpackage;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.facebook.crypto.mac.NativeMac;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.impl.C4473c9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* renamed from: ur0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7490ur0 implements EV0 {
    public static final int[] o = new int[0];
    public static final Unsafe p = AbstractC1131Og1.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final L0 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final C6929rv0 k;
    public final AbstractC8037xj0 l;
    public final C5358jg1 m;
    public final C5378jn0 n;

    public C7490ur0(int[] iArr, Object[] objArr, int i, int i2, L0 l0, boolean z, int[] iArr2, int i3, int i4, C6929rv0 c6929rv0, AbstractC8037xj0 abstractC8037xj0, C5358jg1 c5358jg1, GR gr, C5378jn0 c5378jn0) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = l0 instanceof B00;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = c6929rv0;
        this.l = abstractC8037xj0;
        this.m = c5358jg1;
        this.e = l0;
        this.n = c5378jn0;
    }

    public static int A(long j, Object obj) {
        return ((Integer) AbstractC1131Og1.d.i(j, obj)).intValue();
    }

    public static long B(long j, Object obj) {
        return ((Long) AbstractC1131Og1.d.i(j, obj)).longValue();
    }

    public static Field H(Class cls, String str) {
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

    public static int K(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void O(int i, Object obj, C1304Qm0 c1304Qm0) {
        if (!(obj instanceof String)) {
            c1304Qm0.A(i, (C0440Fk) obj);
        } else {
            ((C6735qu) c1304Qm0.b).R(i, (String) obj);
        }
    }

    public static List s(L0 l0, long j) {
        return (List) AbstractC1131Og1.d.i(j, l0);
    }

    public static C7490ur0 x(C5670lJ0 c5670lJ0, C6929rv0 c6929rv0, AbstractC8037xj0 abstractC8037xj0, C5358jg1 c5358jg1, GR gr, C5378jn0 c5378jn0) {
        if (c5670lJ0 instanceof C5670lJ0) {
            return y(c5670lJ0, c6929rv0, abstractC8037xj0, c5358jg1, gr, c5378jn0);
        }
        c5670lJ0.getClass();
        throw new ClassCastException();
    }

    public static C7490ur0 y(C5670lJ0 c5670lJ0, C6929rv0 c6929rv0, AbstractC8037xj0 abstractC8037xj0, C5358jg1 c5358jg1, GR gr, C5378jn0 c5378jn0) {
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
        Field fieldH;
        int i27;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        Field fieldH2;
        Field fieldH3;
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
        boolean z = c5670lJ0.d() == 2;
        String strC = c5670lJ0.c();
        int length = strC.length();
        int iCharAt3 = strC.charAt(0);
        if (iCharAt3 >= 55296) {
            int i36 = iCharAt3 & 8191;
            int i37 = 1;
            int i38 = 13;
            while (true) {
                i = i37 + 1;
                cCharAt14 = strC.charAt(i37);
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
        int iCharAt4 = strC.charAt(i);
        if (iCharAt4 >= 55296) {
            int i40 = iCharAt4 & 8191;
            int i41 = 13;
            while (true) {
                i34 = i39 + 1;
                cCharAt13 = strC.charAt(i39);
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
            iArr = o;
            i4 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt5 = strC.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i14 = i42 + 1;
                    cCharAt8 = strC.charAt(i42);
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
            int iCharAt6 = strC.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i13 = i45 + 1;
                    cCharAt7 = strC.charAt(i45);
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
            iCharAt = strC.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i12 = i48 + 1;
                    cCharAt6 = strC.charAt(i48);
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
            iCharAt2 = strC.charAt(i48);
            if (iCharAt2 >= 55296) {
                int i52 = iCharAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i11 = i51 + 1;
                    cCharAt5 = strC.charAt(i51);
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
            int iCharAt7 = strC.charAt(i51);
            if (iCharAt7 >= 55296) {
                int i55 = iCharAt7 & 8191;
                int i56 = 13;
                while (true) {
                    i10 = i54 + 1;
                    cCharAt4 = strC.charAt(i54);
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
            int iCharAt8 = strC.charAt(i54);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i9 = i57 + 1;
                    cCharAt3 = strC.charAt(i57);
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
            int iCharAt9 = strC.charAt(i57);
            if (iCharAt9 >= 55296) {
                int i61 = iCharAt9 & 8191;
                int i62 = i60;
                int i63 = 13;
                while (true) {
                    i8 = i62 + 1;
                    cCharAt2 = strC.charAt(i62);
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
            int iCharAt10 = strC.charAt(i2);
            if (iCharAt10 >= 55296) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i7 = i66 + 1;
                    cCharAt = strC.charAt(i66);
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
        Unsafe unsafe = p;
        Object[] objArrB = c5670lJ0.b();
        Class<?> cls = c5670lJ0.a().getClass();
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
            int iCharAt11 = strC.charAt(i72);
            if (iCharAt11 >= 55296) {
                int i77 = iCharAt11 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i33 = i78 + 1;
                    cCharAt12 = strC.charAt(i78);
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
            int iCharAt12 = strC.charAt(i16);
            if (iCharAt12 >= 55296) {
                int i81 = iCharAt12 & 8191;
                int i82 = i80;
                int i83 = 13;
                while (true) {
                    i32 = i82 + 1;
                    cCharAt11 = strC.charAt(i82);
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
                int iCharAt13 = strC.charAt(i18);
                if (iCharAt13 >= 55296) {
                    int i86 = iCharAt13 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i31 = i87 + 1;
                        cCharAt10 = strC.charAt(i87);
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
                    objArr[((i75 / 3) * 2) + 1] = objArrB[i3];
                    i3++;
                } else {
                    if (i89 == 12 && (iCharAt3 & 1) == 1) {
                        objArr[((i75 / 3) * 2) + 1] = objArrB[i3];
                        i3++;
                    }
                    i30 = 2;
                }
                int i91 = iCharAt13 * i30;
                Object obj = objArrB[i91];
                if (obj instanceof Field) {
                    fieldH2 = (Field) obj;
                } else {
                    fieldH2 = H(cls, (String) obj);
                    objArrB[i91] = fieldH2;
                }
                int i92 = iCharAt;
                int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH2);
                int i93 = i91 + 1;
                Object obj2 = objArrB[i93];
                if (obj2 instanceof Field) {
                    fieldH3 = (Field) obj2;
                } else {
                    fieldH3 = H(cls, (String) obj2);
                    objArrB[i93] = fieldH3;
                }
                i26 = iObjectFieldOffset2;
                c = 2;
                i21 = iCharAt12;
                i25 = i3;
                str = strC;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH3);
                i24 = 0;
                i20 = i92;
                i23 = i90;
            } else {
                i19 = iCharAt2;
                int i94 = iCharAt;
                int i95 = i3 + 1;
                Field fieldH4 = H(cls, (String) objArrB[i3]);
                i20 = i94;
                if (i84 == 9 || i84 == 17) {
                    i21 = iCharAt12;
                    i22 = 1;
                    objArr[((i75 / 3) * 2) + 1] = fieldH4.getType();
                } else {
                    if (i84 == 27 || i84 == 49) {
                        i21 = iCharAt12;
                        i22 = 1;
                        i28 = i3 + 2;
                        objArr[((i75 / 3) * 2) + 1] = objArrB[i95];
                    } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                        i21 = iCharAt12;
                        i22 = 1;
                        if ((iCharAt3 & 1) == 1) {
                            i28 = i3 + 2;
                            objArr[((i75 / 3) * 2) + 1] = objArrB[i95];
                        }
                    } else if (i84 == 50) {
                        int i96 = i71 + 1;
                        iArr[i71] = i75;
                        int i97 = (i75 / 3) * 2;
                        int i98 = i3 + 2;
                        objArr[i97] = objArrB[i95];
                        if ((iCharAt12 & 2048) != 0) {
                            i95 = i3 + 3;
                            objArr[i97 + 1] = objArrB[i98];
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
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldH4);
                if ((iCharAt3 & 1) != i22 || i84 > 17) {
                    str = strC;
                    c = 2;
                    i23 = i18;
                    iObjectFieldOffset = 0;
                    i24 = 0;
                } else {
                    i23 = i18 + 1;
                    int iCharAt14 = strC.charAt(i18);
                    if (iCharAt14 >= 55296) {
                        int i99 = iCharAt14 & 8191;
                        int i100 = 13;
                        while (true) {
                            i27 = i23 + 1;
                            cCharAt9 = strC.charAt(i23);
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
                    Object obj3 = objArrB[i101];
                    if (obj3 instanceof Field) {
                        fieldH = (Field) obj3;
                    } else {
                        fieldH = H(cls, (String) obj3);
                        objArrB[i101] = fieldH;
                    }
                    str = strC;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH);
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
            strC = str;
            z = z2;
            i3 = i104;
            iCharAt = i20;
            length = i15;
            i5 = i17;
            i35 = i106;
            iCharAt2 = i19;
        }
        return new C7490ur0(iArr3, objArr, iCharAt, iCharAt2, c5670lJ0.a(), z, iArr, i5, i70, c6929rv0, abstractC8037xj0, c5358jg1, gr, c5378jn0);
    }

    public static long z(int i) {
        return i & 1048575;
    }

    public final int C(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
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

    public final void D(Object obj, long j, C5971mu c5971mu, EV0 ev0, ER er) throws Z90 {
        int iZ;
        List listC = this.l.c(j, obj);
        int i = c5971mu.a;
        if ((i & 7) != 3) {
            throw Z90.b();
        }
        do {
            listC.add(c5971mu.s(ev0, er));
            C5589ku c5589ku = (C5589ku) c5971mu.d;
            if (c5589ku.c() || c5971mu.c != 0) {
                return;
            } else {
                iZ = c5589ku.z();
            }
        } while (iZ == i);
        c5971mu.c = iZ;
    }

    public final void E(Object obj, int i, C5971mu c5971mu, EV0 ev0, ER er) throws Z90 {
        int iZ;
        List listC = this.l.c(i & 1048575, obj);
        int i2 = c5971mu.a;
        if ((i2 & 7) != 2) {
            throw Z90.b();
        }
        do {
            listC.add(c5971mu.y(ev0, er));
            C5589ku c5589ku = (C5589ku) c5971mu.d;
            if (c5589ku.c() || c5971mu.c != 0) {
                return;
            } else {
                iZ = c5589ku.z();
            }
        } while (iZ == i2);
        c5971mu.c = iZ;
    }

    public final void F(Object obj, int i, C5971mu c5971mu) {
        if ((536870912 & i) != 0) {
            AbstractC1131Og1.r(i & 1048575, obj, c5971mu.K());
        } else if (this.f) {
            AbstractC1131Og1.r(i & 1048575, obj, c5971mu.I());
        } else {
            AbstractC1131Og1.r(i & 1048575, obj, c5971mu.f());
        }
    }

    public final void G(Object obj, int i, C5971mu c5971mu) throws Z90 {
        boolean z = (536870912 & i) != 0;
        AbstractC8037xj0 abstractC8037xj0 = this.l;
        if (z) {
            c5971mu.J(abstractC8037xj0.c(i & 1048575, obj), true);
        } else {
            c5971mu.J(abstractC8037xj0.c(i & 1048575, obj), false);
        }
    }

    public final void I(int i, Object obj) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        AbstractC1131Og1.p(j, obj, AbstractC1131Og1.d.g(j, obj) | (1 << (i2 >>> 20)));
    }

    public final void J(int i, int i2, Object obj) {
        AbstractC1131Og1.p(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int L(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, C1304Qm0 c1304Qm0) {
        int i;
        boolean z;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = p;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iL = L(i4);
            int i5 = iArr[i4];
            int iK = K(iL);
            if (this.g || iK > 17) {
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
            long j = iL & 1048575;
            switch (iK) {
                case 0:
                    if ((i & i3) != 0) {
                        c1304Qm0.B(i5, AbstractC1131Og1.d.e(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i & i3) != 0) {
                        c1304Qm0.F(i5, AbstractC1131Og1.d.f(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i & i3) != 0) {
                        c1304Qm0.K(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i & i3) != 0) {
                        c1304Qm0.S(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i & i3) != 0) {
                        c1304Qm0.I(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i & i3) != 0) {
                        c1304Qm0.E(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i & i3) != 0) {
                        c1304Qm0.D(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i & i3) != 0) {
                        c1304Qm0.z(i5, AbstractC1131Og1.d.c(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i & i3) != 0) {
                        O(i5, unsafe.getObject(obj, j), c1304Qm0);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i & i3) != 0) {
                        c1304Qm0.L(i5, unsafe.getObject(obj, j), n(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i & i3) != 0) {
                        c1304Qm0.A(i5, (C0440Fk) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i & i3) != 0) {
                        c1304Qm0.R(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i & i3) != 0) {
                        c1304Qm0.C(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i & i3) != 0) {
                        c1304Qm0.M(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i & i3) != 0) {
                        c1304Qm0.N(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i & i3) != 0) {
                        c1304Qm0.P(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i3) != 0) {
                        c1304Qm0.Q(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i & i3) != 0) {
                        c1304Qm0.H(i5, unsafe.getObject(obj, j), n(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    IV0.F(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 19:
                    IV0.J(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 20:
                    IV0.M(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 21:
                    IV0.U(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 22:
                    IV0.L(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 23:
                    IV0.I(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 24:
                    IV0.H(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 25:
                    IV0.D(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 26:
                    IV0.S(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0);
                    break;
                case 27:
                    IV0.N(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, n(i4));
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    IV0.E(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0);
                    break;
                case 29:
                    z = false;
                    IV0.T(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 30:
                    z = false;
                    IV0.G(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 31:
                    z = false;
                    IV0.O(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 32:
                    z = false;
                    IV0.P(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 33:
                    z = false;
                    IV0.Q(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case 34:
                    z = false;
                    IV0.R(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, false);
                    break;
                case C4473c9.J /* 35 */:
                    IV0.F(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    IV0.J(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case 37:
                    IV0.M(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case C4473c9.K /* 38 */:
                    IV0.U(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case 39:
                    IV0.L(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case C4473c9.L /* 40 */:
                    IV0.I(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case 41:
                    IV0.H(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case C4473c9.M /* 42 */:
                    IV0.D(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case 43:
                    IV0.T(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case 44:
                    IV0.G(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case 45:
                    IV0.O(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case 46:
                    IV0.P(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case 47:
                    IV0.Q(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case 48:
                    IV0.R(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, true);
                    break;
                case 49:
                    IV0.K(iArr[i4], (List) unsafe.getObject(obj, j), c1304Qm0, n(i4));
                    break;
                case 50:
                    N(c1304Qm0, i5, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.B(i5, ((Double) AbstractC1131Og1.d.i(j, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.F(i5, ((Float) AbstractC1131Og1.d.i(j, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.K(i5, B(j, obj));
                    }
                    break;
                case 54:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.S(i5, B(j, obj));
                    }
                    break;
                case 55:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.I(i5, A(j, obj));
                    }
                    break;
                case 56:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.E(i5, B(j, obj));
                    }
                    break;
                case 57:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.D(i5, A(j, obj));
                    }
                    break;
                case 58:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.z(i5, ((Boolean) AbstractC1131Og1.d.i(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i5, i4, obj)) {
                        O(i5, unsafe.getObject(obj, j), c1304Qm0);
                    }
                    break;
                case 60:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.L(i5, unsafe.getObject(obj, j), n(i4));
                    }
                    break;
                case 61:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.A(i5, (C0440Fk) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.R(i5, A(j, obj));
                    }
                    break;
                case 63:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.C(i5, A(j, obj));
                    }
                    break;
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.M(i5, A(j, obj));
                    }
                    break;
                case 65:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.N(i5, B(j, obj));
                    }
                    break;
                case 66:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.P(i5, A(j, obj));
                    }
                    break;
                case 67:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.Q(i5, B(j, obj));
                    }
                    break;
                case 68:
                    if (r(i5, i4, obj)) {
                        c1304Qm0.H(i5, unsafe.getObject(obj, j), n(i4));
                    }
                    break;
            }
        }
        this.m.getClass();
        ((B00) obj).unknownFields.d(c1304Qm0);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(defpackage.C1304Qm0 r23, int r24, java.lang.Object r25, int r26) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7490ur0.N(Qm0, int, java.lang.Object, int):void");
    }

    @Override // defpackage.EV0
    public final Object a() {
        this.k.getClass();
        return ((B00) this.e).d(4);
    }

    @Override // defpackage.EV0
    public final void b(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.i;
        while (true) {
            iArr = this.h;
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long jL = L(iArr[i2]) & 1048575;
            Object objI = AbstractC1131Og1.d.i(jL, obj);
            if (objI != null) {
                this.n.getClass();
                ((C4220hn0) objI).a = false;
                AbstractC1131Og1.r(jL, obj, objI);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.a(iArr[i], obj);
            i++;
        }
        this.m.getClass();
        ((B00) obj).unknownFields.e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    @Override // defpackage.EV0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7490ur0.c(java.lang.Object):boolean");
    }

    @Override // defpackage.EV0
    public final void d(Object obj, C1304Qm0 c1304Qm0) {
        c1304Qm0.getClass();
        if (!this.g) {
            M(obj, c1304Qm0);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iL = L(i);
            int i2 = iArr[i];
            switch (K(iL)) {
                case 0:
                    if (q(i, obj)) {
                        c1304Qm0.B(i2, AbstractC1131Og1.d.e(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i, obj)) {
                        c1304Qm0.F(i2, AbstractC1131Og1.d.f(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i, obj)) {
                        c1304Qm0.K(i2, AbstractC1131Og1.d.h(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i, obj)) {
                        c1304Qm0.S(i2, AbstractC1131Og1.d.h(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i, obj)) {
                        c1304Qm0.I(i2, AbstractC1131Og1.d.g(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i, obj)) {
                        c1304Qm0.E(i2, AbstractC1131Og1.d.h(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i, obj)) {
                        c1304Qm0.D(i2, AbstractC1131Og1.d.g(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(i, obj)) {
                        c1304Qm0.z(i2, AbstractC1131Og1.d.c(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i, obj)) {
                        O(i2, AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (q(i, obj)) {
                        c1304Qm0.L(i2, AbstractC1131Og1.d.i(iL & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i, obj)) {
                        c1304Qm0.A(i2, (C0440Fk) AbstractC1131Og1.d.i(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i, obj)) {
                        c1304Qm0.R(i2, AbstractC1131Og1.d.g(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i, obj)) {
                        c1304Qm0.C(i2, AbstractC1131Og1.d.g(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i, obj)) {
                        c1304Qm0.M(i2, AbstractC1131Og1.d.g(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i, obj)) {
                        c1304Qm0.N(i2, AbstractC1131Og1.d.h(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(i, obj)) {
                        c1304Qm0.P(i2, AbstractC1131Og1.d.g(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i, obj)) {
                        c1304Qm0.Q(i2, AbstractC1131Og1.d.h(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i, obj)) {
                        c1304Qm0.H(i2, AbstractC1131Og1.d.i(iL & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    IV0.F(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 19:
                    IV0.J(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 20:
                    IV0.M(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 21:
                    IV0.U(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 22:
                    IV0.L(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 23:
                    IV0.I(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 24:
                    IV0.H(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 25:
                    IV0.D(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 26:
                    IV0.S(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0);
                    break;
                case 27:
                    IV0.N(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, n(i));
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    IV0.E(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0);
                    break;
                case 29:
                    IV0.T(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 30:
                    IV0.G(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 31:
                    IV0.O(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 32:
                    IV0.P(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 33:
                    IV0.Q(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case 34:
                    IV0.R(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, false);
                    break;
                case C4473c9.J /* 35 */:
                    IV0.F(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    IV0.J(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case 37:
                    IV0.M(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case C4473c9.K /* 38 */:
                    IV0.U(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case 39:
                    IV0.L(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case C4473c9.L /* 40 */:
                    IV0.I(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case 41:
                    IV0.H(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case C4473c9.M /* 42 */:
                    IV0.D(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case 43:
                    IV0.T(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case 44:
                    IV0.G(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case 45:
                    IV0.O(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case 46:
                    IV0.P(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case 47:
                    IV0.Q(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case 48:
                    IV0.R(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, true);
                    break;
                case 49:
                    IV0.K(iArr[i], (List) AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0, n(i));
                    break;
                case 50:
                    N(c1304Qm0, i2, AbstractC1131Og1.d.i(iL & 1048575, obj), i);
                    break;
                case 51:
                    if (r(i2, i, obj)) {
                        c1304Qm0.B(i2, ((Double) AbstractC1131Og1.d.i(iL & 1048575, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i2, i, obj)) {
                        c1304Qm0.F(i2, ((Float) AbstractC1131Og1.d.i(iL & 1048575, obj)).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i2, i, obj)) {
                        c1304Qm0.K(i2, B(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i2, i, obj)) {
                        c1304Qm0.S(i2, B(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i2, i, obj)) {
                        c1304Qm0.I(i2, A(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i2, i, obj)) {
                        c1304Qm0.E(i2, B(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i2, i, obj)) {
                        c1304Qm0.D(i2, A(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i2, i, obj)) {
                        c1304Qm0.z(i2, ((Boolean) AbstractC1131Og1.d.i(iL & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i2, i, obj)) {
                        O(i2, AbstractC1131Og1.d.i(iL & 1048575, obj), c1304Qm0);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (r(i2, i, obj)) {
                        c1304Qm0.L(i2, AbstractC1131Og1.d.i(iL & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i2, i, obj)) {
                        c1304Qm0.A(i2, (C0440Fk) AbstractC1131Og1.d.i(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i2, i, obj)) {
                        c1304Qm0.R(i2, A(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i2, i, obj)) {
                        c1304Qm0.C(i2, A(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (r(i2, i, obj)) {
                        c1304Qm0.M(i2, A(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i2, i, obj)) {
                        c1304Qm0.N(i2, B(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i2, i, obj)) {
                        c1304Qm0.P(i2, A(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i2, i, obj)) {
                        c1304Qm0.Q(i2, B(iL & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i2, i, obj)) {
                        c1304Qm0.H(i2, AbstractC1131Og1.d.i(iL & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.m.getClass();
        ((B00) obj).unknownFields.d(c1304Qm0);
    }

    @Override // defpackage.EV0
    public final void e(Object obj, C5971mu c5971mu, ER er) throws Throwable {
        er.getClass();
        t(this.m, obj, c5971mu, er);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.EV0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.B00 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7490ur0.f(B00):int");
    }

    @Override // defpackage.EV0
    public final void g(B00 b00, B00 b002) {
        b002.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                if (this.g) {
                    return;
                }
                IV0.B(this.m, b00, b002);
                return;
            }
            int iL = L(i);
            long j = 1048575 & iL;
            int i2 = iArr[i];
            switch (K(iL)) {
                case 0:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC0975Mg1 abstractC0975Mg1 = AbstractC1131Og1.d;
                        abstractC0975Mg1.m(b00, j, abstractC0975Mg1.e(j, b002));
                        I(i, b00);
                        break;
                    }
                case 1:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC0975Mg1 abstractC0975Mg12 = AbstractC1131Og1.d;
                        abstractC0975Mg12.n(b00, j, abstractC0975Mg12.f(j, b002));
                        I(i, b00);
                        break;
                    }
                case 2:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.q(j, AbstractC1131Og1.d.h(j, b002), b00);
                        I(i, b00);
                        break;
                    }
                case 3:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.q(j, AbstractC1131Og1.d.h(j, b002), b00);
                        I(i, b00);
                        break;
                    }
                case 4:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.p(j, b00, AbstractC1131Og1.d.g(j, b002));
                        I(i, b00);
                        break;
                    }
                case 5:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.q(j, AbstractC1131Og1.d.h(j, b002), b00);
                        I(i, b00);
                        break;
                    }
                case 6:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.p(j, b00, AbstractC1131Og1.d.g(j, b002));
                        I(i, b00);
                        break;
                    }
                case 7:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC0975Mg1 abstractC0975Mg13 = AbstractC1131Og1.d;
                        abstractC0975Mg13.k(b00, j, abstractC0975Mg13.c(j, b002));
                        I(i, b00);
                        break;
                    }
                case 8:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.r(j, b00, AbstractC1131Og1.d.i(j, b002));
                        I(i, b00);
                        break;
                    }
                case 9:
                    v(b00, b002, i);
                    break;
                case 10:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.r(j, b00, AbstractC1131Og1.d.i(j, b002));
                        I(i, b00);
                        break;
                    }
                case 11:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.p(j, b00, AbstractC1131Og1.d.g(j, b002));
                        I(i, b00);
                        break;
                    }
                case 12:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.p(j, b00, AbstractC1131Og1.d.g(j, b002));
                        I(i, b00);
                        break;
                    }
                case 13:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.p(j, b00, AbstractC1131Og1.d.g(j, b002));
                        I(i, b00);
                        break;
                    }
                case 14:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.q(j, AbstractC1131Og1.d.h(j, b002), b00);
                        I(i, b00);
                        break;
                    }
                case 15:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.p(j, b00, AbstractC1131Og1.d.g(j, b002));
                        I(i, b00);
                        break;
                    }
                case 16:
                    if (!q(i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.q(j, AbstractC1131Og1.d.h(j, b002), b00);
                        I(i, b00);
                        break;
                    }
                case 17:
                    v(b00, b002, i);
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
                    this.l.b(b00, b002, j);
                    break;
                case 50:
                    Class cls = IV0.a;
                    AbstractC0975Mg1 abstractC0975Mg14 = AbstractC1131Og1.d;
                    Object objI = abstractC0975Mg14.i(j, b00);
                    Object objI2 = abstractC0975Mg14.i(j, b002);
                    this.n.getClass();
                    AbstractC1131Og1.r(j, b00, C5378jn0.b(objI, objI2));
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
                    if (!r(i2, i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.r(j, b00, AbstractC1131Og1.d.i(j, b002));
                        J(i2, i, b00);
                        break;
                    }
                case 60:
                    w(b00, b002, i);
                    break;
                case 61:
                case 62:
                case 63:
                case NativeMac.KEY_LENGTH /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (!r(i2, i, b002)) {
                        break;
                    } else {
                        AbstractC1131Og1.r(j, b00, AbstractC1131Og1.d.i(j, b002));
                        J(i2, i, b00);
                        break;
                    }
                case 68:
                    w(b00, b002, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // defpackage.EV0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(defpackage.B00 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7490ur0.h(B00, java.lang.Object):boolean");
    }

    @Override // defpackage.EV0
    public final int i(L0 l0) {
        return this.g ? p(l0) : o(l0);
    }

    public final boolean j(B00 b00, Object obj, int i) {
        return q(i, b00) == q(i, obj);
    }

    public final void k(Object obj, int i, Object obj2) {
        int i2 = this.a[i];
        if (AbstractC1131Og1.d.i(L(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final EV0 n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        EV0 ev0 = (EV0) objArr[i2];
        if (ev0 != null) {
            return ev0;
        }
        EV0 ev0A = ZF0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = ev0A;
        return ev0A;
    }

    public final int o(L0 l0) {
        int i;
        int iK;
        int i2;
        int i3;
        int iZ;
        Unsafe unsafe = p;
        int i4 = -1;
        int i5 = 0;
        int iF = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                this.m.getClass();
                return ((B00) l0).unknownFields.a() + iF;
            }
            int iL = L(i5);
            int i7 = iArr[i5];
            int iK2 = K(iL);
            if (iK2 <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i4) {
                    i6 = unsafe.getInt(l0, i9);
                    i4 = i9;
                }
            } else {
                i = 0;
            }
            long j = iL & 1048575;
            switch (iK2) {
                case 0:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.k(i7);
                        iF += iK;
                        break;
                    }
                case 1:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.o(i7);
                        iF += iK;
                        break;
                    }
                case 2:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.s(i7, unsafe.getLong(l0, j));
                        iF += iK;
                        break;
                    }
                case 3:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.C(i7, unsafe.getLong(l0, j));
                        iF += iK;
                        break;
                    }
                case 4:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.q(i7, unsafe.getInt(l0, j));
                        iF += iK;
                        break;
                    }
                case 5:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.n(i7);
                        iF += iK;
                        break;
                    }
                case 6:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.m(i7);
                        iF += iK;
                        break;
                    }
                case 7:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.h(i7);
                        iF += iK;
                        break;
                    }
                case 8:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(l0, j);
                        i2 = object instanceof C0440Fk ? C6735qu.i(i7, (C0440Fk) object) : C6735qu.x(i7, (String) object);
                        iF = i2 + iF;
                        break;
                    }
                case 9:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = IV0.o(i7, unsafe.getObject(l0, j), n(i5));
                        iF += iK;
                        break;
                    }
                case 10:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.i(i7, (C0440Fk) unsafe.getObject(l0, j));
                        iF += iK;
                        break;
                    }
                case 11:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.A(i7, unsafe.getInt(l0, j));
                        iF += iK;
                        break;
                    }
                case 12:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.l(i7, unsafe.getInt(l0, j));
                        iF += iK;
                        break;
                    }
                case 13:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.t(i7);
                        iF += iK;
                        break;
                    }
                case 14:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.u(i7);
                        iF += iK;
                        break;
                    }
                case 15:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.v(i7, unsafe.getInt(l0, j));
                        iF += iK;
                        break;
                    }
                case 16:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.w(i7, unsafe.getLong(l0, j));
                        iF += iK;
                        break;
                    }
                case 17:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        iK = C6735qu.p(i7, (L0) unsafe.getObject(l0, j), n(i5));
                        iF += iK;
                        break;
                    }
                case 18:
                    iK = IV0.h(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 19:
                    iK = IV0.f(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 20:
                    iK = IV0.m(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 21:
                    iK = IV0.x(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 22:
                    iK = IV0.k(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 23:
                    iK = IV0.h(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 24:
                    iK = IV0.f(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 25:
                    iK = IV0.a(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 26:
                    iK = IV0.u(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 27:
                    iK = IV0.p(i7, (List) unsafe.getObject(l0, j), n(i5));
                    iF += iK;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iK = IV0.c(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 29:
                    iK = IV0.v(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 30:
                    iK = IV0.d(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 31:
                    iK = IV0.f(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 32:
                    iK = IV0.h(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 33:
                    iK = IV0.q(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case 34:
                    iK = IV0.s(i7, (List) unsafe.getObject(l0, j));
                    iF += iK;
                    break;
                case C4473c9.J /* 35 */:
                    i3 = IV0.i((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    i3 = IV0.g((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case 37:
                    i3 = IV0.n((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case C4473c9.K /* 38 */:
                    i3 = IV0.y((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case 39:
                    i3 = IV0.l((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case C4473c9.L /* 40 */:
                    i3 = IV0.i((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case 41:
                    i3 = IV0.g((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case C4473c9.M /* 42 */:
                    i3 = IV0.b((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case 43:
                    i3 = IV0.w((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case 44:
                    i3 = IV0.e((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case 45:
                    i3 = IV0.g((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case 46:
                    i3 = IV0.i((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case 47:
                    i3 = IV0.r((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case 48:
                    i3 = IV0.t((List) unsafe.getObject(l0, j));
                    if (i3 <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i7);
                        iF = NX.f(i3, iZ, i3, iF);
                        break;
                    }
                case 49:
                    iK = IV0.j(i7, (List) unsafe.getObject(l0, j), n(i5));
                    iF += iK;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(l0, j);
                    Object objM = m(i5);
                    this.n.getClass();
                    iK = C5378jn0.a(object2, i7, objM);
                    iF += iK;
                    break;
                case 51:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.k(i7);
                        iF += iK;
                        break;
                    }
                case 52:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.o(i7);
                        iF += iK;
                        break;
                    }
                case 53:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.s(i7, B(j, l0));
                        iF += iK;
                        break;
                    }
                case 54:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.C(i7, B(j, l0));
                        iF += iK;
                        break;
                    }
                case 55:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.q(i7, A(j, l0));
                        iF += iK;
                        break;
                    }
                case 56:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.n(i7);
                        iF += iK;
                        break;
                    }
                case 57:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.m(i7);
                        iF += iK;
                        break;
                    }
                case 58:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.h(i7);
                        iF += iK;
                        break;
                    }
                case 59:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(l0, j);
                        i2 = object3 instanceof C0440Fk ? C6735qu.i(i7, (C0440Fk) object3) : C6735qu.x(i7, (String) object3);
                        iF = i2 + iF;
                        break;
                    }
                case 60:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = IV0.o(i7, unsafe.getObject(l0, j), n(i5));
                        iF += iK;
                        break;
                    }
                case 61:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.i(i7, (C0440Fk) unsafe.getObject(l0, j));
                        iF += iK;
                        break;
                    }
                case 62:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.A(i7, A(j, l0));
                        iF += iK;
                        break;
                    }
                case 63:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.l(i7, A(j, l0));
                        iF += iK;
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.t(i7);
                        iF += iK;
                        break;
                    }
                case 65:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.u(i7);
                        iF += iK;
                        break;
                    }
                case 66:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.v(i7, A(j, l0));
                        iF += iK;
                        break;
                    }
                case 67:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.w(i7, B(j, l0));
                        iF += iK;
                        break;
                    }
                case 68:
                    if (!r(i7, i5, l0)) {
                        break;
                    } else {
                        iK = C6735qu.p(i7, (L0) unsafe.getObject(l0, j), n(i5));
                        iF += iK;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    public final int p(L0 l0) {
        int iK;
        int i;
        int iZ;
        Unsafe unsafe = p;
        int i2 = 0;
        int iF = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                this.m.getClass();
                return ((B00) l0).unknownFields.a() + iF;
            }
            int iL = L(i2);
            int iK2 = K(iL);
            int i3 = iArr[i2];
            long j = iL & 1048575;
            if (iK2 >= EnumC5317jT.b.a() && iK2 <= EnumC5317jT.c.a()) {
                int i4 = iArr[i2 + 2];
            }
            switch (iK2) {
                case 0:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.k(i3);
                        iF = iK + iF;
                        break;
                    }
                case 1:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.o(i3);
                        iF = iK + iF;
                        break;
                    }
                case 2:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.s(i3, AbstractC1131Og1.j(l0, j));
                        iF = iK + iF;
                        break;
                    }
                case 3:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.C(i3, AbstractC1131Og1.j(l0, j));
                        iF = iK + iF;
                        break;
                    }
                case 4:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.q(i3, AbstractC1131Og1.i(l0, j));
                        iF = iK + iF;
                        break;
                    }
                case 5:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.n(i3);
                        iF = iK + iF;
                        break;
                    }
                case 6:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.m(i3);
                        iF = iK + iF;
                        break;
                    }
                case 7:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.h(i3);
                        iF = iK + iF;
                        break;
                    }
                case 8:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        Object objK = AbstractC1131Og1.k(j, l0);
                        iK = objK instanceof C0440Fk ? C6735qu.i(i3, (C0440Fk) objK) : C6735qu.x(i3, (String) objK);
                        iF = iK + iF;
                        break;
                    }
                case 9:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = IV0.o(i3, AbstractC1131Og1.k(j, l0), n(i2));
                        iF = iK + iF;
                        break;
                    }
                case 10:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.i(i3, (C0440Fk) AbstractC1131Og1.k(j, l0));
                        iF = iK + iF;
                        break;
                    }
                case 11:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.A(i3, AbstractC1131Og1.i(l0, j));
                        iF = iK + iF;
                        break;
                    }
                case 12:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.l(i3, AbstractC1131Og1.i(l0, j));
                        iF = iK + iF;
                        break;
                    }
                case 13:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.t(i3);
                        iF = iK + iF;
                        break;
                    }
                case 14:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.u(i3);
                        iF = iK + iF;
                        break;
                    }
                case 15:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.v(i3, AbstractC1131Og1.i(l0, j));
                        iF = iK + iF;
                        break;
                    }
                case 16:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.w(i3, AbstractC1131Og1.j(l0, j));
                        iF = iK + iF;
                        break;
                    }
                case 17:
                    if (!q(i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.p(i3, (L0) AbstractC1131Og1.k(j, l0), n(i2));
                        iF = iK + iF;
                        break;
                    }
                case 18:
                    iK = IV0.h(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 19:
                    iK = IV0.f(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 20:
                    iK = IV0.m(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 21:
                    iK = IV0.x(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 22:
                    iK = IV0.k(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 23:
                    iK = IV0.h(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 24:
                    iK = IV0.f(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 25:
                    iK = IV0.a(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 26:
                    iK = IV0.u(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 27:
                    iK = IV0.p(i3, s(l0, j), n(i2));
                    iF = iK + iF;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iK = IV0.c(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 29:
                    iK = IV0.v(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 30:
                    iK = IV0.d(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 31:
                    iK = IV0.f(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 32:
                    iK = IV0.h(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 33:
                    iK = IV0.q(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case 34:
                    iK = IV0.s(i3, s(l0, j));
                    iF = iK + iF;
                    break;
                case C4473c9.J /* 35 */:
                    i = IV0.i((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    i = IV0.g((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case 37:
                    i = IV0.n((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case C4473c9.K /* 38 */:
                    i = IV0.y((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case 39:
                    i = IV0.l((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case C4473c9.L /* 40 */:
                    i = IV0.i((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case 41:
                    i = IV0.g((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case C4473c9.M /* 42 */:
                    i = IV0.b((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case 43:
                    i = IV0.w((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case 44:
                    i = IV0.e((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case 45:
                    i = IV0.g((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case 46:
                    i = IV0.i((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case 47:
                    i = IV0.r((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case 48:
                    i = IV0.t((List) unsafe.getObject(l0, j));
                    if (i <= 0) {
                        break;
                    } else {
                        iZ = C6735qu.z(i3);
                        iF = NX.f(i, iZ, i, iF);
                        break;
                    }
                case 49:
                    iK = IV0.j(i3, s(l0, j), n(i2));
                    iF = iK + iF;
                    break;
                case 50:
                    Object objK2 = AbstractC1131Og1.k(j, l0);
                    Object objM = m(i2);
                    this.n.getClass();
                    iK = C5378jn0.a(objK2, i3, objM);
                    iF = iK + iF;
                    break;
                case 51:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.k(i3);
                        iF = iK + iF;
                        break;
                    }
                case 52:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.o(i3);
                        iF = iK + iF;
                        break;
                    }
                case 53:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.s(i3, B(j, l0));
                        iF = iK + iF;
                        break;
                    }
                case 54:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.C(i3, B(j, l0));
                        iF = iK + iF;
                        break;
                    }
                case 55:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.q(i3, A(j, l0));
                        iF = iK + iF;
                        break;
                    }
                case 56:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.n(i3);
                        iF = iK + iF;
                        break;
                    }
                case 57:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.m(i3);
                        iF = iK + iF;
                        break;
                    }
                case 58:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.h(i3);
                        iF = iK + iF;
                        break;
                    }
                case 59:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        Object objK3 = AbstractC1131Og1.k(j, l0);
                        iK = objK3 instanceof C0440Fk ? C6735qu.i(i3, (C0440Fk) objK3) : C6735qu.x(i3, (String) objK3);
                        iF = iK + iF;
                        break;
                    }
                case 60:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = IV0.o(i3, AbstractC1131Og1.k(j, l0), n(i2));
                        iF = iK + iF;
                        break;
                    }
                case 61:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.i(i3, (C0440Fk) AbstractC1131Og1.k(j, l0));
                        iF = iK + iF;
                        break;
                    }
                case 62:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.A(i3, A(j, l0));
                        iF = iK + iF;
                        break;
                    }
                case 63:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.l(i3, A(j, l0));
                        iF = iK + iF;
                        break;
                    }
                case NativeMac.KEY_LENGTH /* 64 */:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.t(i3);
                        iF = iK + iF;
                        break;
                    }
                case 65:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.u(i3);
                        iF = iK + iF;
                        break;
                    }
                case 66:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.v(i3, A(j, l0));
                        iF = iK + iF;
                        break;
                    }
                case 67:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.w(i3, B(j, l0));
                        iF = iK + iF;
                        break;
                    }
                case 68:
                    if (!r(i3, i2, l0)) {
                        break;
                    } else {
                        iK = C6735qu.p(i3, (L0) AbstractC1131Og1.k(j, l0), n(i2));
                        iF = iK + iF;
                        break;
                    }
            }
            i2 += 3;
        }
    }

    public final boolean q(int i, Object obj) {
        if (!this.g) {
            int i2 = this.a[i + 2];
            return (AbstractC1131Og1.d.g((long) (i2 & 1048575), obj) & (1 << (i2 >>> 20))) != 0;
        }
        int iL = L(i);
        long j = iL & 1048575;
        switch (K(iL)) {
            case 0:
                return AbstractC1131Og1.d.e(j, obj) != ConfigValue.DOUBLE_DEFAULT_VALUE;
            case 1:
                return AbstractC1131Og1.d.f(j, obj) != 0.0f;
            case 2:
                return AbstractC1131Og1.d.h(j, obj) != 0;
            case 3:
                return AbstractC1131Og1.d.h(j, obj) != 0;
            case 4:
                return AbstractC1131Og1.d.g(j, obj) != 0;
            case 5:
                return AbstractC1131Og1.d.h(j, obj) != 0;
            case 6:
                return AbstractC1131Og1.d.g(j, obj) != 0;
            case 7:
                return AbstractC1131Og1.d.c(j, obj);
            case 8:
                Object objI = AbstractC1131Og1.d.i(j, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof C0440Fk) {
                    return !C0440Fk.c.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC1131Og1.d.i(j, obj) != null;
            case 10:
                return !C0440Fk.c.equals(AbstractC1131Og1.d.i(j, obj));
            case 11:
                return AbstractC1131Og1.d.g(j, obj) != 0;
            case 12:
                return AbstractC1131Og1.d.g(j, obj) != 0;
            case 13:
                return AbstractC1131Og1.d.g(j, obj) != 0;
            case 14:
                return AbstractC1131Og1.d.h(j, obj) != 0;
            case 15:
                return AbstractC1131Og1.d.g(j, obj) != 0;
            case 16:
                return AbstractC1131Og1.d.h(j, obj) != 0;
            case 17:
                return AbstractC1131Og1.d.i(j, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean r(int i, int i2, Object obj) {
        return AbstractC1131Og1.d.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x05f1 A[Catch: all -> 0x024d, TryCatch #4 {all -> 0x024d, blocks: (B:132:0x05ec, B:134:0x05f1, B:136:0x05f8, B:138:0x05ff, B:73:0x0248, B:76:0x0250, B:77:0x0260, B:78:0x0270, B:79:0x0280, B:80:0x0290, B:81:0x02a6, B:82:0x02b6, B:83:0x02c6, B:84:0x02d6, B:85:0x02e6, B:86:0x02f6, B:87:0x0306, B:88:0x0316, B:89:0x0326, B:90:0x0336, B:91:0x0346, B:92:0x0356, B:93:0x0366, B:94:0x0376, B:95:0x038c, B:96:0x039c, B:97:0x03ac, B:98:0x03c0, B:99:0x03c8, B:100:0x03d8, B:101:0x03e8, B:102:0x03f8, B:103:0x0408, B:104:0x0418, B:105:0x0428, B:106:0x0438, B:107:0x0448, B:109:0x0451, B:110:0x046e, B:111:0x0482, B:112:0x0495, B:113:0x04a8, B:114:0x04bb, B:115:0x04ce, B:116:0x04e4, B:117:0x04f7, B:118:0x050a, B:120:0x0513, B:121:0x0530, B:122:0x0544, B:123:0x054f, B:124:0x0564, B:125:0x0577, B:126:0x058a, B:127:0x059d, B:128:0x05b0, B:129:0x05c2, B:130:0x05d6), top: B:162:0x05ec }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0605 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.C5358jg1 r18, java.lang.Object r19, defpackage.C5971mu r20, defpackage.ER r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7490ur0.t(jg1, java.lang.Object, mu, ER):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(java.lang.Object r9, int r10, java.lang.Object r11, defpackage.ER r12, defpackage.C5971mu r13) throws defpackage.Z90 {
        /*
            r8 = this;
            int r10 = r8.L(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            Mg1 r10 = defpackage.AbstractC1131Og1.d
            java.lang.Object r10 = r10.i(r0, r9)
            jn0 r2 = r8.n
            if (r10 != 0) goto L20
            r2.getClass()
            hn0 r10 = defpackage.C4220hn0.b
            hn0 r10 = r10.e()
            defpackage.AbstractC1131Og1.r(r0, r9, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            hn0 r3 = (defpackage.C4220hn0) r3
            boolean r3 = r3.a
            if (r3 != 0) goto L37
            hn0 r3 = defpackage.C4220hn0.b
            hn0 r3 = r3.e()
            defpackage.C5378jn0.b(r3, r10)
            defpackage.AbstractC1131Og1.r(r0, r9, r3)
            r10 = r3
        L37:
            r2.getClass()
            hn0 r10 = (defpackage.C4220hn0) r10
            fn0 r11 = (defpackage.C3838fn0) r11
            Xo1 r9 = r11.a
            r11 = 2
            r13.R(r11)
            java.lang.Object r0 = r13.d
            ku r0 = (defpackage.C5589ku) r0
            int r1 = r0.A()
            int r1 = r0.e(r1)
            java.lang.String r2 = ""
            java.lang.Object r3 = r9.d
            UC0 r3 = (defpackage.UC0) r3
            r4 = r3
        L57:
            int r5 = r13.b()     // Catch: java.lang.Throwable -> L7b
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto La1
            boolean r6 = r0.c()     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto L67
            goto La1
        L67:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L8a
            if (r5 == r11) goto L7d
            boolean r5 = r13.S()     // Catch: java.lang.Throwable -> L7b defpackage.W90 -> L94
            if (r5 == 0) goto L75
            goto L57
        L75:
            Z90 r5 = new Z90     // Catch: java.lang.Throwable -> L7b defpackage.W90 -> L94
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L7b defpackage.W90 -> L94
            throw r5     // Catch: java.lang.Throwable -> L7b defpackage.W90 -> L94
        L7b:
            r9 = move-exception
            goto La8
        L7d:
            java.lang.Object r5 = r9.c     // Catch: java.lang.Throwable -> L7b defpackage.W90 -> L94
            jo1 r5 = (defpackage.C5382jo1) r5     // Catch: java.lang.Throwable -> L7b defpackage.W90 -> L94
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L7b defpackage.W90 -> L94
            java.lang.Object r4 = r13.l(r5, r6, r12)     // Catch: java.lang.Throwable -> L7b defpackage.W90 -> L94
            goto L57
        L8a:
            java.lang.Object r5 = r9.b     // Catch: java.lang.Throwable -> L7b defpackage.W90 -> L94
            do1 r5 = (defpackage.C3460do1) r5     // Catch: java.lang.Throwable -> L7b defpackage.W90 -> L94
            r6 = 0
            java.lang.Object r2 = r13.l(r5, r6, r6)     // Catch: java.lang.Throwable -> L7b defpackage.W90 -> L94
            goto L57
        L94:
            boolean r5 = r13.S()     // Catch: java.lang.Throwable -> L7b
            if (r5 == 0) goto L9b
            goto L57
        L9b:
            Z90 r9 = new Z90     // Catch: java.lang.Throwable -> L7b
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L7b
            throw r9     // Catch: java.lang.Throwable -> L7b
        La1:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L7b
            r0.d(r1)
            return
        La8:
            r0.d(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7490ur0.u(java.lang.Object, int, java.lang.Object, ER, mu):void");
    }

    public final void v(B00 b00, B00 b002, int i) {
        long jL = L(i) & 1048575;
        if (q(i, b002)) {
            AbstractC0975Mg1 abstractC0975Mg1 = AbstractC1131Og1.d;
            Object objI = abstractC0975Mg1.i(jL, b00);
            Object objI2 = abstractC0975Mg1.i(jL, b002);
            if (objI != null && objI2 != null) {
                AbstractC1131Og1.r(jL, b00, AbstractC8309z90.c(objI, objI2));
                I(i, b00);
            } else if (objI2 != null) {
                AbstractC1131Og1.r(jL, b00, objI2);
                I(i, b00);
            }
        }
    }

    public final void w(B00 b00, B00 b002, int i) {
        int iL = L(i);
        int i2 = this.a[i];
        long j = iL & 1048575;
        if (r(i2, i, b002)) {
            AbstractC0975Mg1 abstractC0975Mg1 = AbstractC1131Og1.d;
            Object objI = abstractC0975Mg1.i(j, b00);
            Object objI2 = abstractC0975Mg1.i(j, b002);
            if (objI != null && objI2 != null) {
                AbstractC1131Og1.r(j, b00, AbstractC8309z90.c(objI, objI2));
                J(i2, i, b00);
            } else if (objI2 != null) {
                AbstractC1131Og1.r(j, b00, objI2);
                J(i2, i, b00);
            }
        }
    }
}
