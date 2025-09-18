package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: ir0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9805ir0 extends AbstractC1379Vv {

    /* renamed from: r */
    public static final C10825qp0 f34770r;

    /* renamed from: k */
    public final AbstractC6758rg[] f34771k;

    /* renamed from: l */
    public final AbstractC7419Ca1[] f34772l;

    /* renamed from: m */
    public final ArrayList f34773m;

    /* renamed from: n */
    public final C6914tt f34774n;

    /* renamed from: o */
    public int f34775o;

    /* renamed from: p */
    public long[][] f34776p;

    /* renamed from: q */
    public C6583ou f34777q;

    static {
        C1164SV c1164sv = new C1164SV();
        N70 n70 = P70.f8867b;
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
        Collections.emptyList();
        C9367fQ0 c9367fQ02 = C9367fQ0.f27184e;
        C10057kp0 c10057kp0 = new C10057kp0();
        f34770r = new C10825qp0("MergingMediaSource", new C9929jp0(c1164sv), null, new C10185lp0(c10057kp0), C11337up0.f43931A, C10441np0.f38550a);
    }

    public C9805ir0(AbstractC6758rg... abstractC6758rgArr) {
        C6914tt c6914tt = new C6914tt(12);
        this.f34771k = abstractC6758rgArr;
        this.f34774n = c6914tt;
        this.f34773m = new ArrayList(Arrays.asList(abstractC6758rgArr));
        this.f34775o = -1;
        this.f34772l = new AbstractC7419Ca1[abstractC6758rgArr.length];
        this.f34776p = new long[0][];
        new HashMap();
        AbstractC9246eT1.m17997b(8, "expectedKeys");
        new C11089st0().m24851a().m7815f0();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: b */
    public final InterfaceC11973zp0 mo3162b(C7604Fp0 c7604Fp0, C6224jE c6224jE, long j) {
        AbstractC6758rg[] abstractC6758rgArr = this.f34771k;
        int length = abstractC6758rgArr.length;
        InterfaceC11973zp0[] interfaceC11973zp0Arr = new InterfaceC11973zp0[length];
        AbstractC7419Ca1[] abstractC7419Ca1Arr = this.f34772l;
        int iMo1245b = abstractC7419Ca1Arr[0].mo1245b(c7604Fp0.f3430a);
        for (int i = 0; i < length; i++) {
            interfaceC11973zp0Arr[i] = abstractC6758rgArr[i].mo3162b(c7604Fp0.m2790a(abstractC7419Ca1Arr[i].mo1255l(iMo1245b)), c6224jE, j - this.f34776p[iMo1245b][i]);
        }
        return new C9677hr0(this.f34774n, this.f34776p[iMo1245b], interfaceC11973zp0Arr);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: h */
    public final C10825qp0 mo6202h() {
        AbstractC6758rg[] abstractC6758rgArr = this.f34771k;
        return abstractC6758rgArr.length > 0 ? abstractC6758rgArr[0].mo6202h() : f34770r;
    }

    @Override // p000.AbstractC1379Vv, p000.AbstractC6758rg
    /* renamed from: j */
    public final void mo3163j() throws C6583ou {
        C6583ou c6583ou = this.f34777q;
        if (c6583ou != null) {
            throw c6583ou;
        }
        super.mo3163j();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: l */
    public final void mo6203l(InterfaceC9648hc1 interfaceC9648hc1) {
        this.f12861j = interfaceC9648hc1;
        this.f12860i = AbstractC7485Dh1.m1829n(null);
        int i = 0;
        while (true) {
            AbstractC6758rg[] abstractC6758rgArr = this.f34771k;
            if (i >= abstractC6758rgArr.length) {
                return;
            }
            m8639z(Integer.valueOf(i), abstractC6758rgArr[i]);
            i++;
        }
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: o */
    public final void mo3164o(InterfaceC11973zp0 interfaceC11973zp0) {
        C9677hr0 c9677hr0 = (C9677hr0) interfaceC11973zp0;
        int i = 0;
        while (true) {
            AbstractC6758rg[] abstractC6758rgArr = this.f34771k;
            if (i >= abstractC6758rgArr.length) {
                return;
            }
            AbstractC6758rg abstractC6758rg = abstractC6758rgArr[i];
            InterfaceC11973zp0 interfaceC11973zp02 = c9677hr0.f28631a[i];
            if (interfaceC11973zp02 instanceof C10412na1) {
                interfaceC11973zp02 = ((C10412na1) interfaceC11973zp02).f38382a;
            }
            abstractC6758rg.mo3164o(interfaceC11973zp02);
            i++;
        }
    }

    @Override // p000.AbstractC1379Vv, p000.AbstractC6758rg
    /* renamed from: q */
    public final void mo3165q() {
        super.mo3165q();
        Arrays.fill(this.f34772l, (Object) null);
        this.f34775o = -1;
        this.f34777q = null;
        ArrayList arrayList = this.f34773m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f34771k);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: t */
    public final void mo3166t(C10825qp0 c10825qp0) {
        this.f34771k[0].mo3166t(c10825qp0);
    }

    @Override // p000.AbstractC1379Vv
    /* renamed from: u */
    public final C7604Fp0 mo8635u(Object obj, C7604Fp0 c7604Fp0) {
        if (((Integer) obj).intValue() == 0) {
            return c7604Fp0;
        }
        return null;
    }

    @Override // p000.AbstractC1379Vv
    /* renamed from: y */
    public final void mo8638y(Object obj, AbstractC6758rg abstractC6758rg, AbstractC7419Ca1 abstractC7419Ca1) {
        Integer num = (Integer) obj;
        if (this.f34777q != null) {
            return;
        }
        if (this.f34775o == -1) {
            this.f34775o = abstractC7419Ca1.mo1251h();
        } else if (abstractC7419Ca1.mo1251h() != this.f34775o) {
            this.f34777q = new C6583ou();
            return;
        }
        int length = this.f34776p.length;
        AbstractC7419Ca1[] abstractC7419Ca1Arr = this.f34772l;
        if (length == 0) {
            this.f34776p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f34775o, abstractC7419Ca1Arr.length);
        }
        ArrayList arrayList = this.f34773m;
        arrayList.remove(abstractC6758rg);
        abstractC7419Ca1Arr[num.intValue()] = abstractC7419Ca1;
        if (arrayList.isEmpty()) {
            m24442n(abstractC7419Ca1Arr[0]);
        }
    }
}
