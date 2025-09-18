package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: qs */
/* loaded from: classes2.dex */
public class C6707qs extends AbstractC0162CZ implements InterfaceC6522ny {

    /* renamed from: E */
    public final boolean f41218E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6707qs(InterfaceC6976us interfaceC6976us, InterfaceC6522ny interfaceC6522ny, InterfaceC0510I5 interfaceC0510I5, boolean z, int i, W21 w21) {
        super(i, interfaceC0510I5, interfaceC6976us, interfaceC6522ny, AbstractC9961k31.f36278e, w21);
        if (interfaceC6976us == null) {
            m24072b1(0);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m24072b1(1);
            throw null;
        }
        if (i == 0) {
            m24072b1(2);
            throw null;
        }
        if (w21 == null) {
            m24072b1(3);
            throw null;
        }
        this.f41218E = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m24072b1(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6707qs.m24072b1(int):void");
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC7158xl
    /* renamed from: H0 */
    public final void mo109H0(Collection collection) {
        if (collection != null) {
            return;
        }
        m24072b1(22);
        throw null;
    }

    @Override // p000.AbstractC0162CZ
    /* renamed from: J1, reason: merged with bridge method [inline-methods] */
    public C6707qs mo148A1(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21) {
        if (interfaceC0140CD == null) {
            m24072b1(23);
            throw null;
        }
        if (i == 0) {
            m24072b1(24);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m24072b1(25);
            throw null;
        }
        if (i == 1 || i == 4) {
            return new C6707qs((InterfaceC6976us) interfaceC0140CD, this, interfaceC0510I5, this.f41218E, 1, w21);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0140CD + "\nkind: " + AbstractC7222ym.m26248y(i));
    }

    @Override // p000.AbstractC0329FD, p000.InterfaceC0140CD
    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC6976us mo423i() {
        InterfaceC6976us interfaceC6976us = (InterfaceC6976us) super.mo423i();
        if (interfaceC6976us != null) {
            return interfaceC6976us;
        }
        m24072b1(17);
        throw null;
    }

    @Override // p000.AbstractC0329FD
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public final C6707qs mo2089x1() {
        C6707qs c6707qs = (C6707qs) super.mo2089x1();
        if (c6707qs != null) {
            return c6707qs;
        }
        m24072b1(19);
        throw null;
    }

    /* renamed from: M1 */
    public final void m24075M1(List list, C7003vI c7003vI) {
        if (list == null) {
            m24072b1(13);
            throw null;
        }
        if (c7003vI != null) {
            m24076N1(list, c7003vI, mo423i().mo1438o());
        } else {
            m24072b1(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* renamed from: N1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24076N1(java.util.List r12, p000.C7003vI r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L63
            if (r13 == 0) goto L5d
            if (r14 == 0) goto L57
            us r1 = r11.mo423i()
            boolean r2 = r1.mo1431N()
            if (r2 == 0) goto L21
            CD r1 = r1.mo423i()
            boolean r2 = r1 instanceof p000.InterfaceC6976us
            if (r2 == 0) goto L21
            us r1 = (p000.InterfaceC6976us) r1
            rh0 r1 = r1.mo1489a1()
            r4 = r1
            goto L22
        L21:
            r4 = r0
        L22:
            us r1 = r11.mo423i()
            java.util.List r2 = r1.mo1488S0()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            java.util.List r1 = r1.mo1488S0()
            if (r1 == 0) goto L38
        L36:
            r5 = r1
            goto L45
        L38:
            r12 = 15
            m24072b1(r12)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.emptyList()
            if (r1 == 0) goto L51
            goto L36
        L45:
            os0 r9 = p000.EnumC10575os0.f39323b
            r3 = 0
            r8 = 0
            r2 = r11
            r6 = r14
            r7 = r12
            r10 = r13
            r2.mo1215D1(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L51:
            r12 = 16
            m24072b1(r12)
            throw r0
        L57:
            r12 = 12
            m24072b1(r12)
            throw r0
        L5d:
            r12 = 11
            m24072b1(r12)
            throw r0
        L63:
            r12 = 10
            m24072b1(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6707qs.m24076N1(java.util.List, vI, java.util.List):void");
    }

    @Override // p000.AbstractC0162CZ, p000.R51
    /* renamed from: O1, reason: merged with bridge method [inline-methods] */
    public final C6707qs mo114b(C11571we1 c11571we1) {
        if (c11571we1 != null) {
            return (C6707qs) super.mo114b(c11571we1);
        }
        m24072b1(20);
        throw null;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2856s(this, obj);
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC7158xl, p000.InterfaceC7032vl
    /* renamed from: j */
    public final Collection mo1222j() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        m24072b1(21);
        throw null;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC7158xl
    /* renamed from: m0 */
    public final InterfaceC7158xl mo117m0(InterfaceC6976us interfaceC6976us, EnumC10575os0 enumC10575os0, C7003vI c7003vI) {
        return (C6707qs) m1223y1(interfaceC6976us, enumC10575os0, c7003vI);
    }

    @Override // p000.InterfaceC6522ny
    /* renamed from: y */
    public final boolean mo2718y() {
        return this.f41218E;
    }

    @Override // p000.InterfaceC6522ny
    /* renamed from: z */
    public final InterfaceC6976us mo2719z() {
        InterfaceC6976us interfaceC6976usMo423i = mo423i();
        if (interfaceC6976usMo423i != null) {
            return interfaceC6976usMo423i;
        }
        m24072b1(18);
        throw null;
    }
}
