package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: hr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4232hr0 implements InterfaceC8435zp0, InterfaceC8245yp0 {
    public final InterfaceC8435zp0[] a;
    public final IdentityHashMap b;
    public final C7304tt c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public InterfaceC8245yp0 f;
    public C1350Rb1 g;
    public InterfaceC8435zp0[] h;
    public C1954Yv i;

    public C4232hr0(C7304tt c7304tt, long[] jArr, InterfaceC8435zp0... interfaceC8435zp0Arr) {
        this.c = c7304tt;
        this.a = interfaceC8435zp0Arr;
        c7304tt.getClass();
        N70 n70 = P70.b;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        this.i = new C1954Yv(c3769fQ0, c3769fQ0);
        this.b = new IdentityHashMap();
        this.h = new InterfaceC8435zp0[0];
        for (int i = 0; i < interfaceC8435zp0Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new C6104na1(interfaceC8435zp0Arr[i], j);
            }
        }
    }

    @Override // defpackage.InterfaceC8245yp0
    public final void a(InterfaceC8435zp0 interfaceC8435zp0) {
        ArrayList arrayList = this.d;
        arrayList.remove(interfaceC8435zp0);
        if (arrayList.isEmpty()) {
            InterfaceC8435zp0[] interfaceC8435zp0Arr = this.a;
            int i = 0;
            for (InterfaceC8435zp0 interfaceC8435zp02 : interfaceC8435zp0Arr) {
                i += interfaceC8435zp02.q().a;
            }
            C1272Qb1[] c1272Qb1Arr = new C1272Qb1[i];
            int i2 = 0;
            for (int i3 = 0; i3 < interfaceC8435zp0Arr.length; i3++) {
                C1350Rb1 c1350Rb1Q = interfaceC8435zp0Arr[i3].q();
                int i4 = c1350Rb1Q.a;
                int i5 = 0;
                while (i5 < i4) {
                    C1272Qb1 c1272Qb1A = c1350Rb1Q.a(i5);
                    int i6 = c1272Qb1A.a;
                    C6666qX[] c6666qXArr = new C6666qX[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        C6666qX c6666qX = c1272Qb1A.d[i7];
                        C6475pX c6475pXA = c6666qX.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        String str = c6666qX.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c6475pXA.a = sb.toString();
                        c6666qXArr[i7] = new C6666qX(c6475pXA);
                    }
                    C1272Qb1 c1272Qb1 = new C1272Qb1(i3 + StringUtils.PROCESS_POSTFIX_DELIMITER + c1272Qb1A.b, c6666qXArr);
                    this.e.put(c1272Qb1, c1272Qb1A);
                    c1272Qb1Arr[i2] = c1272Qb1;
                    i5++;
                    i2++;
                }
            }
            this.g = new C1350Rb1(c1272Qb1Arr);
            InterfaceC8245yp0 interfaceC8245yp0 = this.f;
            interfaceC8245yp0.getClass();
            interfaceC8245yp0.a(this);
        }
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long b(long j, DX0 dx0) {
        InterfaceC8435zp0[] interfaceC8435zp0Arr = this.h;
        return (interfaceC8435zp0Arr.length > 0 ? interfaceC8435zp0Arr[0] : this.a[0]).b(j, dx0);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long d(InterfaceC5311jR[] interfaceC5311jRArr, boolean[] zArr, InterfaceC3403dV0[] interfaceC3403dV0Arr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        ArrayList arrayList;
        int[] iArr = new int[interfaceC5311jRArr.length];
        int[] iArr2 = new int[interfaceC5311jRArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = interfaceC5311jRArr.length;
            identityHashMap = this.b;
            if (i2 >= length) {
                break;
            }
            InterfaceC3403dV0 interfaceC3403dV0 = interfaceC3403dV0Arr[i2];
            Integer num = interfaceC3403dV0 == null ? null : (Integer) identityHashMap.get(interfaceC3403dV0);
            iArr[i2] = num == null ? -1 : num.intValue();
            InterfaceC5311jR interfaceC5311jR = interfaceC5311jRArr[i2];
            if (interfaceC5311jR != null) {
                String str = interfaceC5311jR.d().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = interfaceC5311jRArr.length;
        InterfaceC3403dV0[] interfaceC3403dV0Arr2 = new InterfaceC3403dV0[length2];
        InterfaceC3403dV0[] interfaceC3403dV0Arr3 = new InterfaceC3403dV0[interfaceC5311jRArr.length];
        InterfaceC5311jR[] interfaceC5311jRArr2 = new InterfaceC5311jR[interfaceC5311jRArr.length];
        InterfaceC8435zp0[] interfaceC8435zp0Arr = this.a;
        ArrayList arrayList2 = new ArrayList(interfaceC8435zp0Arr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < interfaceC8435zp0Arr.length) {
            int i4 = i;
            while (i4 < interfaceC5311jRArr.length) {
                interfaceC3403dV0Arr3[i4] = iArr[i4] == i3 ? interfaceC3403dV0Arr[i4] : null;
                if (iArr2[i4] == i3) {
                    InterfaceC5311jR interfaceC5311jR2 = interfaceC5311jRArr[i4];
                    interfaceC5311jR2.getClass();
                    arrayList = arrayList2;
                    C1272Qb1 c1272Qb1 = (C1272Qb1) this.e.get(interfaceC5311jR2.d());
                    c1272Qb1.getClass();
                    interfaceC5311jRArr2[i4] = new C4041gr0(interfaceC5311jR2, c1272Qb1);
                } else {
                    arrayList = arrayList2;
                    interfaceC5311jRArr2[i4] = null;
                }
                i4++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i5 = i3;
            InterfaceC8435zp0[] interfaceC8435zp0Arr2 = interfaceC8435zp0Arr;
            InterfaceC5311jR[] interfaceC5311jRArr3 = interfaceC5311jRArr2;
            long jD = interfaceC8435zp0Arr[i3].d(interfaceC5311jRArr2, zArr, interfaceC3403dV0Arr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jD;
            } else if (jD != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < interfaceC5311jRArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    InterfaceC3403dV0 interfaceC3403dV02 = interfaceC3403dV0Arr3[i6];
                    interfaceC3403dV02.getClass();
                    interfaceC3403dV0Arr2[i6] = interfaceC3403dV0Arr3[i6];
                    identityHashMap.put(interfaceC3403dV02, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    YN1.f(interfaceC3403dV0Arr3[i6] == null);
                }
            }
            if (z) {
                arrayList3.add(interfaceC8435zp0Arr2[i5]);
            }
            i3 = i5 + 1;
            arrayList2 = arrayList3;
            interfaceC8435zp0Arr = interfaceC8435zp0Arr2;
            interfaceC5311jRArr2 = interfaceC5311jRArr3;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(interfaceC3403dV0Arr2, i7, interfaceC3403dV0Arr, i7, length2);
        this.h = (InterfaceC8435zp0[]) arrayList4.toArray(new InterfaceC8435zp0[i7]);
        AbstractList abstractListB = AbstractC6949s10.b(arrayList4, new C0681Im0(9));
        this.c.getClass();
        this.i = new C1954Yv(arrayList4, abstractListB);
        return j2;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        return this.i.e();
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void g() {
        for (InterfaceC8435zp0 interfaceC8435zp0 : this.a) {
            interfaceC8435zp0.g();
        }
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long h(long j) {
        long jH = this.h[0].h(j);
        int i = 1;
        while (true) {
            InterfaceC8435zp0[] interfaceC8435zp0Arr = this.h;
            if (i >= interfaceC8435zp0Arr.length) {
                return jH;
            }
            if (interfaceC8435zp0Arr[i].h(jH) != jH) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void i(long j) {
        for (InterfaceC8435zp0 interfaceC8435zp0 : this.h) {
            interfaceC8435zp0.i(j);
        }
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        return this.i.l();
    }

    @Override // defpackage.InterfaceC3793fY0
    public final void m(InterfaceC3984gY0 interfaceC3984gY0) {
        InterfaceC8245yp0 interfaceC8245yp0 = this.f;
        interfaceC8245yp0.getClass();
        interfaceC8245yp0.m(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long n() {
        long j = -9223372036854775807L;
        for (InterfaceC8435zp0 interfaceC8435zp0 : this.h) {
            long jN = interfaceC8435zp0.n();
            if (jN == -9223372036854775807L) {
                if (j != -9223372036854775807L && interfaceC8435zp0.h(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (InterfaceC8435zp0 interfaceC8435zp02 : this.h) {
                    if (interfaceC8435zp02 == interfaceC8435zp0) {
                        break;
                    }
                    if (interfaceC8435zp02.h(jN) != jN) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jN;
            } else if (jN != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void o(InterfaceC8245yp0 interfaceC8245yp0, long j) {
        this.f = interfaceC8245yp0;
        ArrayList arrayList = this.d;
        InterfaceC8435zp0[] interfaceC8435zp0Arr = this.a;
        Collections.addAll(arrayList, interfaceC8435zp0Arr);
        for (InterfaceC8435zp0 interfaceC8435zp0 : interfaceC8435zp0Arr) {
            interfaceC8435zp0.o(this, j);
        }
    }

    @Override // defpackage.InterfaceC8435zp0
    public final C1350Rb1 q() {
        C1350Rb1 c1350Rb1 = this.g;
        c1350Rb1.getClass();
        return c1350Rb1;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean r(C7660vk0 c7660vk0) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.i.r(c7660vk0);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC8435zp0) arrayList.get(i)).r(c7660vk0);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        return this.i.s();
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
        this.i.t(j);
    }
}
