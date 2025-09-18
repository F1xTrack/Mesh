package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: ir0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5200ir0 extends AbstractC1720Vv {
    public static final C6721qp0 r;
    public final AbstractC6883rg[] k;
    public final AbstractC0178Ca1[] l;
    public final ArrayList m;
    public final C7304tt n;
    public int o;
    public long[][] p;
    public C6353ou q;

    static {
        SV sv = new SV();
        N70 n70 = P70.b;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        Collections.emptyList();
        C3769fQ0 c3769fQ02 = C3769fQ0.e;
        C5575kp0 c5575kp0 = new C5575kp0();
        r = new C6721qp0("MergingMediaSource", new C5384jp0(sv), null, new C5766lp0(c5575kp0), C7484up0.A, C6148np0.a);
    }

    public C5200ir0(AbstractC6883rg... abstractC6883rgArr) {
        C7304tt c7304tt = new C7304tt(12);
        this.k = abstractC6883rgArr;
        this.n = c7304tt;
        this.m = new ArrayList(Arrays.asList(abstractC6883rgArr));
        this.o = -1;
        this.l = new AbstractC0178Ca1[abstractC6883rgArr.length];
        this.p = new long[0][];
        new HashMap();
        AbstractC3588eT1.b(8, "expectedKeys");
        new C7114st0().a().f0();
    }

    @Override // defpackage.AbstractC6883rg
    public final InterfaceC8435zp0 b(C0456Fp0 c0456Fp0, C5272jE c5272jE, long j) {
        AbstractC6883rg[] abstractC6883rgArr = this.k;
        int length = abstractC6883rgArr.length;
        InterfaceC8435zp0[] interfaceC8435zp0Arr = new InterfaceC8435zp0[length];
        AbstractC0178Ca1[] abstractC0178Ca1Arr = this.l;
        int iB = abstractC0178Ca1Arr[0].b(c0456Fp0.a);
        for (int i = 0; i < length; i++) {
            interfaceC8435zp0Arr[i] = abstractC6883rgArr[i].b(c0456Fp0.a(abstractC0178Ca1Arr[i].l(iB)), c5272jE, j - this.p[iB][i]);
        }
        return new C4232hr0(this.n, this.p[iB], interfaceC8435zp0Arr);
    }

    @Override // defpackage.AbstractC6883rg
    public final C6721qp0 h() {
        AbstractC6883rg[] abstractC6883rgArr = this.k;
        return abstractC6883rgArr.length > 0 ? abstractC6883rgArr[0].h() : r;
    }

    @Override // defpackage.AbstractC1720Vv, defpackage.AbstractC6883rg
    public final void j() throws C6353ou {
        C6353ou c6353ou = this.q;
        if (c6353ou != null) {
            throw c6353ou;
        }
        super.j();
    }

    @Override // defpackage.AbstractC6883rg
    public final void l(InterfaceC4188hc1 interfaceC4188hc1) {
        this.j = interfaceC4188hc1;
        this.i = AbstractC0277Dh1.n(null);
        int i = 0;
        while (true) {
            AbstractC6883rg[] abstractC6883rgArr = this.k;
            if (i >= abstractC6883rgArr.length) {
                return;
            }
            z(Integer.valueOf(i), abstractC6883rgArr[i]);
            i++;
        }
    }

    @Override // defpackage.AbstractC6883rg
    public final void o(InterfaceC8435zp0 interfaceC8435zp0) {
        C4232hr0 c4232hr0 = (C4232hr0) interfaceC8435zp0;
        int i = 0;
        while (true) {
            AbstractC6883rg[] abstractC6883rgArr = this.k;
            if (i >= abstractC6883rgArr.length) {
                return;
            }
            AbstractC6883rg abstractC6883rg = abstractC6883rgArr[i];
            InterfaceC8435zp0 interfaceC8435zp02 = c4232hr0.a[i];
            if (interfaceC8435zp02 instanceof C6104na1) {
                interfaceC8435zp02 = ((C6104na1) interfaceC8435zp02).a;
            }
            abstractC6883rg.o(interfaceC8435zp02);
            i++;
        }
    }

    @Override // defpackage.AbstractC1720Vv, defpackage.AbstractC6883rg
    public final void q() {
        super.q();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.AbstractC6883rg
    public final void t(C6721qp0 c6721qp0) {
        this.k[0].t(c6721qp0);
    }

    @Override // defpackage.AbstractC1720Vv
    public final C0456Fp0 u(Object obj, C0456Fp0 c0456Fp0) {
        if (((Integer) obj).intValue() == 0) {
            return c0456Fp0;
        }
        return null;
    }

    @Override // defpackage.AbstractC1720Vv
    public final void y(Object obj, AbstractC6883rg abstractC6883rg, AbstractC0178Ca1 abstractC0178Ca1) {
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            this.o = abstractC0178Ca1.h();
        } else if (abstractC0178Ca1.h() != this.o) {
            this.q = new C6353ou();
            return;
        }
        int length = this.p.length;
        AbstractC0178Ca1[] abstractC0178Ca1Arr = this.l;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.o, abstractC0178Ca1Arr.length);
        }
        ArrayList arrayList = this.m;
        arrayList.remove(abstractC6883rg);
        abstractC0178Ca1Arr[num.intValue()] = abstractC0178Ca1;
        if (arrayList.isEmpty()) {
            n(abstractC0178Ca1Arr[0]);
        }
    }
}
