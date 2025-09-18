package p000;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: jA1 */
/* loaded from: classes.dex */
public final class C9848jA1 extends AbstractC10078kz1 {

    /* renamed from: g */
    public static final C9848jA1 f34955g = new C9848jA1(null, new Object[0], 0);

    /* renamed from: d */
    public final transient Object f34956d;

    /* renamed from: e */
    public final transient Object[] f34957e;

    /* renamed from: f */
    public final transient int f34958f;

    public C9848jA1(Object obj, Object[] objArr, int i) {
        this.f34956d = obj;
        this.f34957e = objArr;
        this.f34958f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* renamed from: a */
    public static C9848jA1 m21983a(int i, Object[] objArr, C1356VY c1356vy) {
        int iHighestOneBit;
        short[] sArr;
        char c;
        char c2;
        byte[] bArr;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return f34955g;
        }
        int i3 = 1;
        Object c8507Wy1 = null;
        if (i2 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new C9848jA1(null, objArrCopyOf, 1);
        }
        G12.m2912c(i2, objArrCopyOf.length >> 1);
        int iMax = Math.max(i2, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (iHighestOneBit * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i2 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            i2 = 1;
            c = 1;
            c2 = 2;
        } else {
            int i4 = iHighestOneBit - 1;
            char c3 = 65535;
            if (iHighestOneBit <= 128) {
                byte[] bArr2 = new byte[iHighestOneBit];
                Arrays.fill(bArr2, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object obj = objArrCopyOf[i8];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i8 ^ i3];
                    Objects.requireNonNull(obj2);
                    int iM4133c = J12.m4133c(obj.hashCode());
                    while (true) {
                        int i9 = iM4133c & i4;
                        int i10 = bArr2[i9] & 255;
                        if (i10 == 255) {
                            bArr2[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArrCopyOf[i7] = obj;
                                objArrCopyOf[i7 ^ 1] = obj2;
                            }
                            i6++;
                        } else {
                            if (obj.equals(objArrCopyOf[i10])) {
                                int i11 = i10 ^ 1;
                                Object obj3 = objArrCopyOf[i11];
                                Objects.requireNonNull(obj3);
                                c8507Wy1 = new C8507Wy1(obj, obj2, obj3);
                                objArrCopyOf[i11] = obj2;
                                break;
                            }
                            iM4133c = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    bArr = bArr2;
                } else {
                    bArr = new Object[]{bArr2, Integer.valueOf(i6), c8507Wy1};
                    c2 = 2;
                    c = 1;
                    c8507Wy1 = bArr;
                }
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i2; i13++) {
                    int i14 = i12 + i12;
                    int i15 = i13 + i13;
                    Object obj4 = objArrCopyOf[i15];
                    Objects.requireNonNull(obj4);
                    Object obj5 = objArrCopyOf[i15 ^ 1];
                    Objects.requireNonNull(obj5);
                    int iM4133c2 = J12.m4133c(obj4.hashCode());
                    while (true) {
                        int i16 = iM4133c2 & i4;
                        char c4 = (char) sArr[i16];
                        if (c4 == 65535) {
                            sArr[i16] = (short) i14;
                            if (i12 < i13) {
                                objArrCopyOf[i14] = obj4;
                                objArrCopyOf[i14 ^ 1] = obj5;
                            }
                            i12++;
                        } else {
                            if (obj4.equals(objArrCopyOf[c4])) {
                                int i17 = c4 ^ 1;
                                Object obj6 = objArrCopyOf[i17];
                                Objects.requireNonNull(obj6);
                                C8507Wy1 c8507Wy12 = new C8507Wy1(obj4, obj5, obj6);
                                objArrCopyOf[i17] = obj5;
                                c8507Wy1 = c8507Wy12;
                                break;
                            }
                            iM4133c2 = i16 + 1;
                        }
                    }
                }
                if (i12 != i2) {
                    c2 = 2;
                    c8507Wy1 = new Object[]{sArr, Integer.valueOf(i12), c8507Wy1};
                    c = 1;
                }
                bArr = sArr;
            } else {
                int i18 = 1;
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i19 = 0;
                int i20 = 0;
                while (i19 < i2) {
                    int i21 = i20 + i20;
                    int i22 = i19 + i19;
                    Object obj7 = objArrCopyOf[i22];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArrCopyOf[i22 ^ i18];
                    Objects.requireNonNull(obj8);
                    int iM4133c3 = J12.m4133c(obj7.hashCode());
                    while (true) {
                        int i23 = iM4133c3 & i4;
                        ?? r15 = sArr[i23];
                        if (r15 == c3) {
                            sArr[i23] = i21;
                            if (i20 < i19) {
                                objArrCopyOf[i21] = obj7;
                                objArrCopyOf[i21 ^ 1] = obj8;
                            }
                            i20++;
                        } else {
                            if (obj7.equals(objArrCopyOf[r15])) {
                                int i24 = r15 ^ 1;
                                Object obj9 = objArrCopyOf[i24];
                                Objects.requireNonNull(obj9);
                                C8507Wy1 c8507Wy13 = new C8507Wy1(obj7, obj8, obj9);
                                objArrCopyOf[i24] = obj8;
                                c8507Wy1 = c8507Wy13;
                                break;
                            }
                            iM4133c3 = i23 + 1;
                            c3 = 65535;
                        }
                    }
                    i19++;
                    c3 = 65535;
                    i18 = 1;
                }
                if (i20 != i2) {
                    c = 1;
                    c2 = 2;
                    c8507Wy1 = new Object[]{sArr, Integer.valueOf(i20), c8507Wy1};
                }
                bArr = sArr;
            }
            c2 = 2;
            c = 1;
            c8507Wy1 = bArr;
        }
        boolean z = c8507Wy1 instanceof Object[];
        Object obj10 = c8507Wy1;
        if (z) {
            Object[] objArr2 = (Object[]) c8507Wy1;
            C8507Wy1 c8507Wy14 = (C8507Wy1) objArr2[c2];
            if (c1356vy == null) {
                throw c8507Wy14.m8904a();
            }
            c1356vy.f12613d = c8507Wy14;
            Object obj11 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj10 = obj11;
            i2 = iIntValue;
        }
        return new C9848jA1(obj10, objArrCopyOf, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0003 A[EDGE_INSN: B:94:0x0003->B:54:0x0003 BREAK  A[LOOP:0: B:66:0x0038->B:72:0x004e], EDGE_INSN: B:97:0x0003->B:54:0x0003 BREAK  A[LOOP:1: B:76:0x0063->B:82:0x007a], EDGE_INSN: B:98:0x0003->B:54:0x0003 BREAK  A[LOOP:2: B:84:0x0089->B:93:0x00a0]] */
    @Override // p000.AbstractC10078kz1, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            r1 = 1
            int r2 = r9.f34958f
            java.lang.Object[] r3 = r9.f34957e
            if (r2 != r1) goto L20
            r2 = 0
            r2 = r3[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L3
            r10 = r3[r1]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r2 = r9.f34956d
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = p000.J12.m4133c(r2)
        L38:
            r2 = r2 & r6
            r5 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L4e:
            int r2 = r2 + 1
            goto L38
        L51:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = p000.J12.m4133c(r2)
        L63:
            r2 = r2 & r6
            short r5 = r4[r2]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L7a:
            int r2 = r2 + 1
            goto L63
        L7d:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = p000.J12.m4133c(r6)
        L89:
            r6 = r6 & r4
            r7 = r2[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r3[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r3[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9848jA1.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f34958f;
    }
}
