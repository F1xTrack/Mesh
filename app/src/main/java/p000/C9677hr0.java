package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: hr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9677hr0 implements InterfaceC11973zp0, InterfaceC11846yp0 {

    /* renamed from: a */
    public final InterfaceC11973zp0[] f28631a;

    /* renamed from: b */
    public final IdentityHashMap f28632b;

    /* renamed from: c */
    public final C6914tt f28633c;

    /* renamed from: d */
    public final ArrayList f28634d = new ArrayList();

    /* renamed from: e */
    public final HashMap f28635e = new HashMap();

    /* renamed from: f */
    public InterfaceC11846yp0 f28636f;

    /* renamed from: g */
    public C8201Rb1 f28637g;

    /* renamed from: h */
    public InterfaceC11973zp0[] f28638h;

    /* renamed from: i */
    public C1568Yv f28639i;

    public C9677hr0(C6914tt c6914tt, long[] jArr, InterfaceC11973zp0... interfaceC11973zp0Arr) {
        this.f28633c = c6914tt;
        this.f28631a = interfaceC11973zp0Arr;
        c6914tt.getClass();
        N70 n70 = P70.f8867b;
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
        this.f28639i = new C1568Yv(c9367fQ0, c9367fQ0);
        this.f28632b = new IdentityHashMap();
        this.f28638h = new InterfaceC11973zp0[0];
        for (int i = 0; i < interfaceC11973zp0Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f28631a[i] = new C10412na1(interfaceC11973zp0Arr[i], j);
            }
        }
    }

    @Override // p000.InterfaceC11846yp0
    /* renamed from: a */
    public final void mo1876a(InterfaceC11973zp0 interfaceC11973zp0) {
        ArrayList arrayList = this.f28634d;
        arrayList.remove(interfaceC11973zp0);
        if (arrayList.isEmpty()) {
            InterfaceC11973zp0[] interfaceC11973zp0Arr = this.f28631a;
            int i = 0;
            for (InterfaceC11973zp0 interfaceC11973zp02 : interfaceC11973zp0Arr) {
                i += interfaceC11973zp02.mo1888q().f10321a;
            }
            C8149Qb1[] c8149Qb1Arr = new C8149Qb1[i];
            int i2 = 0;
            for (int i3 = 0; i3 < interfaceC11973zp0Arr.length; i3++) {
                C8201Rb1 c8201Rb1Mo1888q = interfaceC11973zp0Arr[i3].mo1888q();
                int i4 = c8201Rb1Mo1888q.f10321a;
                int i5 = 0;
                while (i5 < i4) {
                    C8149Qb1 c8149Qb1M7046a = c8201Rb1Mo1888q.m7046a(i5);
                    int i6 = c8149Qb1M7046a.f9687a;
                    C6686qX[] c6686qXArr = new C6686qX[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        C6686qX c6686qX = c8149Qb1M7046a.f9690d[i7];
                        C6623pX c6623pXM24020a = c6686qX.m24020a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        String str = c6686qX.f40962a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c6623pXM24020a.f40150a = sb.toString();
                        c6686qXArr[i7] = new C6686qX(c6623pXM24020a);
                    }
                    C8149Qb1 c8149Qb1 = new C8149Qb1(i3 + StringUtils.PROCESS_POSTFIX_DELIMITER + c8149Qb1M7046a.f9688b, c6686qXArr);
                    this.f28635e.put(c8149Qb1, c8149Qb1M7046a);
                    c8149Qb1Arr[i2] = c8149Qb1;
                    i5++;
                    i2++;
                }
            }
            this.f28637g = new C8201Rb1(c8149Qb1Arr);
            InterfaceC11846yp0 interfaceC11846yp0 = this.f28636f;
            interfaceC11846yp0.getClass();
            interfaceC11846yp0.mo1876a(this);
        }
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: b */
    public final long mo1877b(long j, DX0 dx0) {
        InterfaceC11973zp0[] interfaceC11973zp0Arr = this.f28638h;
        return (interfaceC11973zp0Arr.length > 0 ? interfaceC11973zp0Arr[0] : this.f28631a[0]).mo1877b(j, dx0);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: d */
    public final long mo1879d(InterfaceC6237jR[] interfaceC6237jRArr, boolean[] zArr, InterfaceC9121dV0[] interfaceC9121dV0Arr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        ArrayList arrayList;
        int[] iArr = new int[interfaceC6237jRArr.length];
        int[] iArr2 = new int[interfaceC6237jRArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = interfaceC6237jRArr.length;
            identityHashMap = this.f28632b;
            if (i2 >= length) {
                break;
            }
            InterfaceC9121dV0 interfaceC9121dV0 = interfaceC9121dV0Arr[i2];
            Integer num = interfaceC9121dV0 == null ? null : (Integer) identityHashMap.get(interfaceC9121dV0);
            iArr[i2] = num == null ? -1 : num.intValue();
            InterfaceC6237jR interfaceC6237jR = interfaceC6237jRArr[i2];
            if (interfaceC6237jR != null) {
                String str = interfaceC6237jR.mo2724d().f9688b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = interfaceC6237jRArr.length;
        InterfaceC9121dV0[] interfaceC9121dV0Arr2 = new InterfaceC9121dV0[length2];
        InterfaceC9121dV0[] interfaceC9121dV0Arr3 = new InterfaceC9121dV0[interfaceC6237jRArr.length];
        InterfaceC6237jR[] interfaceC6237jRArr2 = new InterfaceC6237jR[interfaceC6237jRArr.length];
        InterfaceC11973zp0[] interfaceC11973zp0Arr = this.f28631a;
        ArrayList arrayList2 = new ArrayList(interfaceC11973zp0Arr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < interfaceC11973zp0Arr.length) {
            int i4 = i;
            while (i4 < interfaceC6237jRArr.length) {
                interfaceC9121dV0Arr3[i4] = iArr[i4] == i3 ? interfaceC9121dV0Arr[i4] : null;
                if (iArr2[i4] == i3) {
                    InterfaceC6237jR interfaceC6237jR2 = interfaceC6237jRArr[i4];
                    interfaceC6237jR2.getClass();
                    arrayList = arrayList2;
                    C8149Qb1 c8149Qb1 = (C8149Qb1) this.f28635e.get(interfaceC6237jR2.mo2724d());
                    c8149Qb1.getClass();
                    interfaceC6237jRArr2[i4] = new C9549gr0(interfaceC6237jR2, c8149Qb1);
                } else {
                    arrayList = arrayList2;
                    interfaceC6237jRArr2[i4] = null;
                }
                i4++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i5 = i3;
            InterfaceC11973zp0[] interfaceC11973zp0Arr2 = interfaceC11973zp0Arr;
            InterfaceC6237jR[] interfaceC6237jRArr3 = interfaceC6237jRArr2;
            long jMo1879d = interfaceC11973zp0Arr[i3].mo1879d(interfaceC6237jRArr2, zArr, interfaceC9121dV0Arr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jMo1879d;
            } else if (jMo1879d != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < interfaceC6237jRArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    InterfaceC9121dV0 interfaceC9121dV02 = interfaceC9121dV0Arr3[i6];
                    interfaceC9121dV02.getClass();
                    interfaceC9121dV0Arr2[i6] = interfaceC9121dV0Arr3[i6];
                    identityHashMap.put(interfaceC9121dV02, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    YN1.m9281f(interfaceC9121dV0Arr3[i6] == null);
                }
            }
            if (z) {
                arrayList3.add(interfaceC11973zp0Arr2[i5]);
            }
            i3 = i5 + 1;
            arrayList2 = arrayList3;
            interfaceC11973zp0Arr = interfaceC11973zp0Arr2;
            interfaceC6237jRArr2 = interfaceC6237jRArr3;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(interfaceC9121dV0Arr2, i7, interfaceC9121dV0Arr, i7, length2);
        this.f28638h = (InterfaceC11973zp0[]) arrayList4.toArray(new InterfaceC11973zp0[i7]);
        AbstractList abstractListM24577b = AbstractC10978s10.m24577b(arrayList4, new C7754Im0(9));
        this.f28633c.getClass();
        this.f28639i = new C1568Yv(arrayList4, abstractListM24577b);
        return j2;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        return this.f28639i.mo1880e();
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: g */
    public final void mo1881g() {
        for (InterfaceC11973zp0 interfaceC11973zp0 : this.f28631a) {
            interfaceC11973zp0.mo1881g();
        }
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: h */
    public final long mo1882h(long j) {
        long jMo1882h = this.f28638h[0].mo1882h(j);
        int i = 1;
        while (true) {
            InterfaceC11973zp0[] interfaceC11973zp0Arr = this.f28638h;
            if (i >= interfaceC11973zp0Arr.length) {
                return jMo1882h;
            }
            if (interfaceC11973zp0Arr[i].mo1882h(jMo1882h) != jMo1882h) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: i */
    public final void mo1883i(long j) {
        for (InterfaceC11973zp0 interfaceC11973zp0 : this.f28638h) {
            interfaceC11973zp0.mo1883i(j);
        }
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        return this.f28639i.mo1884l();
    }

    @Override // p000.InterfaceC9383fY0
    /* renamed from: m */
    public final void mo1885m(InterfaceC9511gY0 interfaceC9511gY0) {
        InterfaceC11846yp0 interfaceC11846yp0 = this.f28636f;
        interfaceC11846yp0.getClass();
        interfaceC11846yp0.mo1885m(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: n */
    public final long mo1886n() {
        long j = -9223372036854775807L;
        for (InterfaceC11973zp0 interfaceC11973zp0 : this.f28638h) {
            long jMo1886n = interfaceC11973zp0.mo1886n();
            if (jMo1886n == -9223372036854775807L) {
                if (j != -9223372036854775807L && interfaceC11973zp0.mo1882h(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (InterfaceC11973zp0 interfaceC11973zp02 : this.f28638h) {
                    if (interfaceC11973zp02 == interfaceC11973zp0) {
                        break;
                    }
                    if (interfaceC11973zp02.mo1882h(jMo1886n) != jMo1886n) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jMo1886n;
            } else if (jMo1886n != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: o */
    public final void mo1887o(InterfaceC11846yp0 interfaceC11846yp0, long j) {
        this.f28636f = interfaceC11846yp0;
        ArrayList arrayList = this.f28634d;
        InterfaceC11973zp0[] interfaceC11973zp0Arr = this.f28631a;
        Collections.addAll(arrayList, interfaceC11973zp0Arr);
        for (InterfaceC11973zp0 interfaceC11973zp0 : interfaceC11973zp0Arr) {
            interfaceC11973zp0.mo1887o(this, j);
        }
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: q */
    public final C8201Rb1 mo1888q() {
        C8201Rb1 c8201Rb1 = this.f28637g;
        c8201Rb1.getClass();
        return c8201Rb1;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    public final boolean mo1889r(C11455vk0 c11455vk0) {
        ArrayList arrayList = this.f28634d;
        if (arrayList.isEmpty()) {
            return this.f28639i.mo1889r(c11455vk0);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC11973zp0) arrayList.get(i)).mo1889r(c11455vk0);
        }
        return false;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        return this.f28639i.mo1890s();
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
        this.f28639i.mo1891t(j);
    }
}
