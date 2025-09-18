package p000;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class EI1 {

    /* renamed from: a */
    public static final int[] f2599a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m2118a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static boolean m2119b(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        int[] iArr = f2599a;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static C21 m2120c(InterfaceC1475XR interfaceC1475XR, boolean z, boolean z2) {
        int i;
        int i2;
        long jM18757o;
        int i3;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int[] iArr;
        boolean z5 = true;
        int i6 = 8;
        long length = interfaceC1475XR.getLength();
        long j = -1;
        long j2 = 4096;
        if (length != -1 && length <= 4096) {
            j2 = length;
        }
        int i7 = (int) j2;
        C9591hA0 c9591hA0 = new C9591hA0(64);
        int i8 = 0;
        int i9 = 0;
        boolean z6 = false;
        while (i9 < i7) {
            c9591hA0.m18738D(i6);
            if (!interfaceC1475XR.mo3620f(c9591hA0.f28293a, i8, i6, z5)) {
                break;
            }
            long jM18765w = c9591hA0.m18765w();
            int iM18749g = c9591hA0.m18749g();
            if (jM18765w == 1) {
                interfaceC1475XR.mo3628q(c9591hA0.f28293a, i6, i6);
                i3 = 16;
                c9591hA0.m18740F(16);
                jM18757o = c9591hA0.m18757o();
                i2 = i9;
            } else {
                if (jM18765w == 0) {
                    long length2 = interfaceC1475XR.getLength();
                    if (length2 != j) {
                        jM18765w = (length2 - interfaceC1475XR.mo3624j()) + i6;
                    }
                }
                i2 = i9;
                jM18757o = jM18765w;
                i3 = i6;
            }
            long j3 = i3;
            if (jM18757o < j3) {
                return new C6914tt(i6);
            }
            int i10 = i2 + i3;
            if (iM18749g == 1836019574) {
                i7 += (int) jM18757o;
                if (length != -1 && i7 > length) {
                    i7 = (int) length;
                }
                i9 = i10;
                z5 = true;
                j = -1;
                i8 = 0;
            } else {
                if (iM18749g == 1836019558 || iM18749g == 1836475768) {
                    i = 1;
                    break;
                }
                long j4 = length;
                if (iM18749g == 1835295092) {
                    z6 = true;
                }
                if ((i10 + jM18757o) - j3 >= i7) {
                    i = 0;
                    break;
                }
                int i11 = (int) (jM18757o - j3);
                i9 = i10 + i11;
                if (iM18749g == 1718909296) {
                    i4 = 8;
                    if (i11 < 8) {
                        return new C6914tt(8);
                    }
                    c9591hA0.m18738D(i11);
                    i5 = 0;
                    interfaceC1475XR.mo3628q(c9591hA0.f28293a, 0, i11);
                    z3 = z2;
                    if (m2119b(c9591hA0.m18749g(), z3)) {
                        z6 = true;
                    }
                    c9591hA0.m18742H(4);
                    int iM18743a = c9591hA0.m18743a() / 4;
                    if (!z6 && iM18743a > 0) {
                        iArr = new int[iM18743a];
                        int i12 = 0;
                        while (true) {
                            if (i12 >= iM18743a) {
                                z4 = true;
                                break;
                            }
                            int iM18749g2 = c9591hA0.m18749g();
                            iArr[i12] = iM18749g2;
                            if (m2119b(iM18749g2, z3)) {
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
                        C7512Dv0 c7512Dv0 = new C7512Dv0(22);
                        if (iArr != null) {
                            int i13 = L70.f6497c;
                            if (iArr.length != 0) {
                                new L70(Arrays.copyOf(iArr, iArr.length));
                            }
                        } else {
                            int i14 = L70.f6497c;
                        }
                        return c7512Dv0;
                    }
                } else {
                    z3 = z2;
                    i4 = 8;
                    i5 = 0;
                    z4 = true;
                    if (i11 != 0) {
                        interfaceC1475XR.mo3625k(i11);
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
            return C7408Bv0.f1081f;
        }
        if (z != i) {
            return i != 0 ? C6914tt.f43393d : C6914tt.f43394e;
        }
        return null;
    }

    /* renamed from: d */
    public static C8539Xo1 m2121d(Object obj) {
        return new C8539Xo1(obj.getClass().getSimpleName(), 19);
    }
}
