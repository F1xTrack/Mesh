package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6195o31 extends AbstractC5507kS1 {
    public final C4103hA0 a = new C4103hA0();
    public final C0848Kq b = new C0848Kq();
    public C0724Ja1 c;

    @Override // defpackage.AbstractC5507kS1
    public final C0540Gr0 c(C0774Jr0 c0774Jr0, ByteBuffer byteBuffer) {
        InterfaceC0384Er0 c6958s31;
        int i;
        int i2;
        long j;
        ArrayList arrayList;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        int iA;
        int iU;
        int iU2;
        long jW;
        boolean z4;
        List list;
        long j4;
        long j5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i3;
        int i4;
        int iU3;
        boolean z9;
        int i5 = 32;
        boolean z10 = true;
        C0724Ja1 c0724Ja1 = this.c;
        if (c0724Ja1 == null || c0774Jr0.j != c0724Ja1.e()) {
            C0724Ja1 c0724Ja12 = new C0724Ja1(c0774Jr0.g);
            this.c = c0724Ja12;
            c0724Ja12.a(c0774Jr0.g - c0774Jr0.j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C4103hA0 c4103hA0 = this.a;
        c4103hA0.E(iLimit, bArrArray);
        C0848Kq c0848Kq = this.b;
        c0848Kq.r(iLimit, bArrArray);
        c0848Kq.w(39);
        long jL = (c0848Kq.l(1) << 32) | c0848Kq.l(32);
        c0848Kq.w(20);
        int iL = c0848Kq.l(12);
        int iL2 = c0848Kq.l(8);
        c4103hA0.H(14);
        if (iL2 == 0) {
            c6958s31 = new C6958s31();
        } else if (iL2 != 255) {
            long j6 = 1;
            long jW2 = -9223372036854775807L;
            if (iL2 == 4) {
                int iU4 = c4103hA0.u();
                ArrayList arrayList2 = new ArrayList(iU4);
                int i6 = 0;
                while (i6 < iU4) {
                    long jW3 = c4103hA0.w();
                    boolean z11 = (c4103hA0.u() & 128) != 0 ? z10 : false;
                    ArrayList arrayList3 = new ArrayList();
                    if (z11) {
                        i = i5;
                        i2 = i6;
                        j = j6;
                        arrayList = arrayList3;
                        j2 = -9223372036854775807L;
                        j3 = -9223372036854775807L;
                        z = false;
                        z2 = false;
                        z3 = false;
                        iA = 0;
                        iU = 0;
                        iU2 = 0;
                    } else {
                        int iU5 = c4103hA0.u();
                        boolean z12 = (iU5 & 128) != 0 ? z10 : false;
                        boolean z13 = (iU5 & 64) != 0 ? z10 : false;
                        boolean z14 = (iU5 & i5) != 0 ? z10 : false;
                        long jW4 = z13 ? c4103hA0.w() : -9223372036854775807L;
                        if (z13) {
                            i2 = i6;
                        } else {
                            int iU6 = c4103hA0.u();
                            ArrayList arrayList4 = new ArrayList(iU6);
                            int i7 = 0;
                            while (i7 < iU6) {
                                arrayList4.add(new C7149t31(c4103hA0.u(), c4103hA0.w()));
                                i7++;
                                i6 = i6;
                            }
                            i2 = i6;
                            arrayList3 = arrayList4;
                        }
                        if (z14) {
                            long jU = c4103hA0.u();
                            z4 = (jU & 128) != 0;
                            j = 1;
                            i = 32;
                            jW = ((((jU & 1) << 32) | c4103hA0.w()) * 1000) / 90;
                        } else {
                            i = 32;
                            j = 1;
                            jW = -9223372036854775807L;
                            z4 = false;
                        }
                        j3 = jW;
                        z3 = z4;
                        arrayList = arrayList3;
                        z = z12;
                        z2 = z13;
                        j2 = jW4;
                        iA = c4103hA0.A();
                        iU = c4103hA0.u();
                        iU2 = c4103hA0.u();
                    }
                    arrayList2.add(new C7340u31(jW3, z11, z, z2, arrayList, j2, z3, j3, iA, iU, iU2));
                    i6 = i2 + 1;
                    z10 = true;
                    i5 = i;
                    j6 = j;
                }
                c6958s31 = new C7531v31(arrayList2);
            } else if (iL2 == 5) {
                C0724Ja1 c0724Ja13 = this.c;
                long jW5 = c4103hA0.w();
                boolean z15 = (c4103hA0.u() & 128) != 0;
                List listEmptyList = Collections.emptyList();
                if (z15) {
                    list = listEmptyList;
                    j4 = -9223372036854775807L;
                    j5 = -9223372036854775807L;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    i3 = 0;
                    i4 = 0;
                    iU3 = 0;
                } else {
                    int iU7 = c4103hA0.u();
                    boolean z16 = (iU7 & 128) != 0;
                    boolean z17 = (iU7 & 64) != 0;
                    boolean z18 = (iU7 & 32) != 0;
                    boolean z19 = (iU7 & 16) != 0;
                    long jA = (!z17 || z19) ? -9223372036854775807L : C7440ua1.a(jL, c4103hA0);
                    if (!z17) {
                        int iU8 = c4103hA0.u();
                        ArrayList arrayList5 = new ArrayList(iU8);
                        for (int i8 = 0; i8 < iU8; i8++) {
                            int iU9 = c4103hA0.u();
                            long jA2 = !z19 ? C7440ua1.a(jL, c4103hA0) : -9223372036854775807L;
                            arrayList5.add(new C6386p31(iU9, jA2, c0724Ja13.b(jA2)));
                        }
                        listEmptyList = arrayList5;
                    }
                    if (z18) {
                        long jU2 = c4103hA0.u();
                        z9 = (jU2 & 128) != 0;
                        jW2 = ((((jU2 & 1) << 32) | c4103hA0.w()) * 1000) / 90;
                    } else {
                        z9 = false;
                    }
                    int iA2 = c4103hA0.A();
                    int iU10 = c4103hA0.u();
                    z8 = z9;
                    i3 = iA2;
                    list = listEmptyList;
                    iU3 = c4103hA0.u();
                    i4 = iU10;
                    z5 = z16;
                    j5 = jW2;
                    j4 = jA;
                    z7 = z19;
                    z6 = z17;
                }
                c6958s31 = new C6577q31(jW5, z15, z5, z6, z7, j4, c0724Ja13.b(j4), list, z8, j5, i3, i4, iU3);
            } else if (iL2 != 6) {
                c6958s31 = null;
            } else {
                C0724Ja1 c0724Ja14 = this.c;
                long jA3 = C7440ua1.a(jL, c4103hA0);
                c6958s31 = new C7440ua1(jA3, c0724Ja14.b(jA3));
            }
        } else {
            long jW6 = c4103hA0.w();
            int i9 = iL - 4;
            byte[] bArr = new byte[i9];
            c4103hA0.e(bArr, 0, i9);
            c6958s31 = new BD0(jW6, bArr, jL);
        }
        return c6958s31 == null ? new C0540Gr0(new InterfaceC0384Er0[0]) : new C0540Gr0(c6958s31);
    }
}
