package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class EI1 {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean b(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        int[] iArr = a;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static C21 c(XR xr, boolean z, boolean z2) {
        int i;
        int i2;
        long jO;
        int i3;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int[] iArr;
        boolean z5 = true;
        int i6 = 8;
        long length = xr.getLength();
        long j = -1;
        long j2 = 4096;
        if (length != -1 && length <= 4096) {
            j2 = length;
        }
        int i7 = (int) j2;
        C4103hA0 c4103hA0 = new C4103hA0(64);
        int i8 = 0;
        int i9 = 0;
        boolean z6 = false;
        while (i9 < i7) {
            c4103hA0.D(i6);
            if (!xr.f(c4103hA0.a, i8, i6, z5)) {
                break;
            }
            long jW = c4103hA0.w();
            int iG = c4103hA0.g();
            if (jW == 1) {
                xr.q(c4103hA0.a, i6, i6);
                i3 = 16;
                c4103hA0.F(16);
                jO = c4103hA0.o();
                i2 = i9;
            } else {
                if (jW == 0) {
                    long length2 = xr.getLength();
                    if (length2 != j) {
                        jW = (length2 - xr.j()) + i6;
                    }
                }
                i2 = i9;
                jO = jW;
                i3 = i6;
            }
            long j3 = i3;
            if (jO < j3) {
                return new C7304tt(i6);
            }
            int i10 = i2 + i3;
            if (iG == 1836019574) {
                i7 += (int) jO;
                if (length != -1 && i7 > length) {
                    i7 = (int) length;
                }
                i9 = i10;
                z5 = true;
                j = -1;
                i8 = 0;
            } else {
                if (iG == 1836019558 || iG == 1836475768) {
                    i = 1;
                    break;
                }
                long j4 = length;
                if (iG == 1835295092) {
                    z6 = true;
                }
                if ((i10 + jO) - j3 >= i7) {
                    i = 0;
                    break;
                }
                int i11 = (int) (jO - j3);
                i9 = i10 + i11;
                if (iG == 1718909296) {
                    i4 = 8;
                    if (i11 < 8) {
                        return new C7304tt(8);
                    }
                    c4103hA0.D(i11);
                    i5 = 0;
                    xr.q(c4103hA0.a, 0, i11);
                    z3 = z2;
                    if (b(c4103hA0.g(), z3)) {
                        z6 = true;
                    }
                    c4103hA0.H(4);
                    int iA = c4103hA0.a() / 4;
                    if (!z6 && iA > 0) {
                        iArr = new int[iA];
                        int i12 = 0;
                        while (true) {
                            if (i12 >= iA) {
                                z4 = true;
                                break;
                            }
                            int iG2 = c4103hA0.g();
                            iArr[i12] = iG2;
                            if (b(iG2, z3)) {
                                z4 = true;
                                z6 = true;
                                break;
                            }
                            i12++;
                        }
                    } else {
                        z4 = true;
                        iArr = null;
                    }
                    if (!z6) {
                        C0318Dv0 c0318Dv0 = new C0318Dv0(22);
                        if (iArr != null) {
                            int i13 = L70.c;
                            if (iArr.length != 0) {
                                new L70(Arrays.copyOf(iArr, iArr.length));
                            }
                        } else {
                            int i14 = L70.c;
                        }
                        return c0318Dv0;
                    }
                } else {
                    z3 = z2;
                    i4 = 8;
                    i5 = 0;
                    z4 = true;
                    if (i11 != 0) {
                        xr.k(i11);
                    }
                }
                i8 = i5;
                length = j4;
                i6 = i4;
                z5 = z4;
                j = -1;
            }
        }
        i = i8;
        if (!z6) {
            return C0162Bv0.f;
        }
        if (z != i) {
            return i != 0 ? C7304tt.d : C7304tt.e;
        }
        return null;
    }

    public static C1857Xo1 d(Object obj) {
        return new C1857Xo1(obj.getClass().getSimpleName(), 19);
    }
}
