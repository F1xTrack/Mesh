package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10473o31 extends AbstractC10012kS1 {

    /* renamed from: a */
    public final C9591hA0 f38746a = new C9591hA0();

    /* renamed from: b */
    public final C0683Kq f38747b = new C0683Kq();

    /* renamed from: c */
    public C7783Ja1 f38748c;

    @Override // p000.AbstractC10012kS1
    /* renamed from: c */
    public final C7660Gr0 mo3312c(C7816Jr0 c7816Jr0, ByteBuffer byteBuffer) {
        InterfaceC7556Er0 c10985s31;
        int i;
        int i2;
        long j;
        ArrayList arrayList;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        int iM18735A;
        int iM18763u;
        int iM18763u2;
        long jM18765w;
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
        int iM18763u3;
        boolean z9;
        int i5 = 32;
        boolean z10 = true;
        C7783Ja1 c7783Ja1 = this.f38748c;
        if (c7783Ja1 == null || c7816Jr0.f5752j != c7783Ja1.m4354e()) {
            C7783Ja1 c7783Ja12 = new C7783Ja1(c7816Jr0.f14800g);
            this.f38748c = c7783Ja12;
            c7783Ja12.m4350a(c7816Jr0.f14800g - c7816Jr0.f5752j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C9591hA0 c9591hA0 = this.f38746a;
        c9591hA0.m18739E(iLimit, bArrArray);
        C0683Kq c0683Kq = this.f38747b;
        c0683Kq.m4758r(iLimit, bArrArray);
        c0683Kq.m4763w(39);
        long jM4752l = (c0683Kq.m4752l(1) << 32) | c0683Kq.m4752l(32);
        c0683Kq.m4763w(20);
        int iM4752l = c0683Kq.m4752l(12);
        int iM4752l2 = c0683Kq.m4752l(8);
        c9591hA0.m18742H(14);
        if (iM4752l2 == 0) {
            c10985s31 = new C10985s31();
        } else if (iM4752l2 != 255) {
            long j6 = 1;
            long jM18765w2 = -9223372036854775807L;
            if (iM4752l2 == 4) {
                int iM18763u4 = c9591hA0.m18763u();
                ArrayList arrayList2 = new ArrayList(iM18763u4);
                int i6 = 0;
                while (i6 < iM18763u4) {
                    long jM18765w3 = c9591hA0.m18765w();
                    boolean z11 = (c9591hA0.m18763u() & 128) != 0 ? z10 : false;
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
                        iM18735A = 0;
                        iM18763u = 0;
                        iM18763u2 = 0;
                    } else {
                        int iM18763u5 = c9591hA0.m18763u();
                        boolean z12 = (iM18763u5 & 128) != 0 ? z10 : false;
                        boolean z13 = (iM18763u5 & 64) != 0 ? z10 : false;
                        boolean z14 = (iM18763u5 & i5) != 0 ? z10 : false;
                        long jM18765w4 = z13 ? c9591hA0.m18765w() : -9223372036854775807L;
                        if (z13) {
                            i2 = i6;
                        } else {
                            int iM18763u6 = c9591hA0.m18763u();
                            ArrayList arrayList4 = new ArrayList(iM18763u6);
                            int i7 = 0;
                            while (i7 < iM18763u6) {
                                arrayList4.add(new C11113t31(c9591hA0.m18763u(), c9591hA0.m18765w()));
                                i7++;
                                i6 = i6;
                            }
                            i2 = i6;
                            arrayList3 = arrayList4;
                        }
                        if (z14) {
                            long jM18763u = c9591hA0.m18763u();
                            z4 = (jM18763u & 128) != 0;
                            j = 1;
                            i = 32;
                            jM18765w = ((((jM18763u & 1) << 32) | c9591hA0.m18765w()) * 1000) / 90;
                        } else {
                            i = 32;
                            j = 1;
                            jM18765w = -9223372036854775807L;
                            z4 = false;
                        }
                        j3 = jM18765w;
                        z3 = z4;
                        arrayList = arrayList3;
                        z = z12;
                        z2 = z13;
                        j2 = jM18765w4;
                        iM18735A = c9591hA0.m18735A();
                        iM18763u = c9591hA0.m18763u();
                        iM18763u2 = c9591hA0.m18763u();
                    }
                    arrayList2.add(new C11241u31(jM18765w3, z11, z, z2, arrayList, j2, z3, j3, iM18735A, iM18763u, iM18763u2));
                    i6 = i2 + 1;
                    z10 = true;
                    i5 = i;
                    j6 = j;
                }
                c10985s31 = new C11369v31(arrayList2);
            } else if (iM4752l2 == 5) {
                C7783Ja1 c7783Ja13 = this.f38748c;
                long jM18765w5 = c9591hA0.m18765w();
                boolean z15 = (c9591hA0.m18763u() & 128) != 0;
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
                    iM18763u3 = 0;
                } else {
                    int iM18763u7 = c9591hA0.m18763u();
                    boolean z16 = (iM18763u7 & 128) != 0;
                    boolean z17 = (iM18763u7 & 64) != 0;
                    boolean z18 = (iM18763u7 & 32) != 0;
                    boolean z19 = (iM18763u7 & 16) != 0;
                    long jM25211a = (!z17 || z19) ? -9223372036854775807L : C11308ua1.m25211a(jM4752l, c9591hA0);
                    if (!z17) {
                        int iM18763u8 = c9591hA0.m18763u();
                        ArrayList arrayList5 = new ArrayList(iM18763u8);
                        for (int i8 = 0; i8 < iM18763u8; i8++) {
                            int iM18763u9 = c9591hA0.m18763u();
                            long jM25211a2 = !z19 ? C11308ua1.m25211a(jM4752l, c9591hA0) : -9223372036854775807L;
                            arrayList5.add(new C10601p31(iM18763u9, jM25211a2, c7783Ja13.m4351b(jM25211a2)));
                        }
                        listEmptyList = arrayList5;
                    }
                    if (z18) {
                        long jM18763u2 = c9591hA0.m18763u();
                        z9 = (jM18763u2 & 128) != 0;
                        jM18765w2 = ((((jM18763u2 & 1) << 32) | c9591hA0.m18765w()) * 1000) / 90;
                    } else {
                        z9 = false;
                    }
                    int iM18735A2 = c9591hA0.m18735A();
                    int iM18763u10 = c9591hA0.m18763u();
                    z8 = z9;
                    i3 = iM18735A2;
                    list = listEmptyList;
                    iM18763u3 = c9591hA0.m18763u();
                    i4 = iM18763u10;
                    z5 = z16;
                    j5 = jM18765w2;
                    j4 = jM25211a;
                    z7 = z19;
                    z6 = z17;
                }
                c10985s31 = new C10729q31(jM18765w5, z15, z5, z6, z7, j4, c7783Ja13.m4351b(j4), list, z8, j5, i3, i4, iM18763u3);
            } else if (iM4752l2 != 6) {
                c10985s31 = null;
            } else {
                C7783Ja1 c7783Ja14 = this.f38748c;
                long jM25211a3 = C11308ua1.m25211a(jM4752l, c9591hA0);
                c10985s31 = new C11308ua1(jM25211a3, c7783Ja14.m4351b(jM25211a3));
            }
        } else {
            long jM18765w6 = c9591hA0.m18765w();
            int i9 = iM4752l - 4;
            byte[] bArr = new byte[i9];
            c9591hA0.m18747e(bArr, 0, i9);
            c10985s31 = new BD0(jM18765w6, bArr, jM4752l);
        }
        return c10985s31 == null ? new C7660Gr0(new InterfaceC7556Er0[0]) : new C7660Gr0(c10985s31);
    }
}
