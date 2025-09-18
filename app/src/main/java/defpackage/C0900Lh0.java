package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: Lh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0900Lh0 extends AbstractC1523Th0 {
    public final C6643qP0 n;
    public final C0432Fh0 o;
    public final C1610Uk0 p;
    public final C1766Wk0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0900Lh0(C6045nH c6045nH, C6643qP0 c6643qP0, C0432Fh0 c0432Fh0) {
        super(c6045nH, null);
        O90.f(c0432Fh0, "ownerDescriptor");
        this.n = c6643qP0;
        this.o = c0432Fh0;
        C1922Yk0 c1922Yk0 = (C1922Yk0) ((C4375ib0) c6045nH.b).a;
        C7726w5 c7726w5 = new C7726w5(c6045nH, 17, this);
        c1922Yk0.getClass();
        this.p = new C1610Uk0(c1922Yk0, c7726w5);
        this.q = c1922Yk0.c(new C3690f1(this, 11, c6045nH));
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        return v(c1559Tt0, null);
    }

    @Override // defpackage.AbstractC1289Qh0, defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        return MN.a;
    }

    @Override // defpackage.AbstractC1289Qh0, defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        if (!c4317iI.a(C4317iI.l | C4317iI.e)) {
            return MN.a;
        }
        Iterable iterable = (Iterable) this.d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            CD cd = (CD) obj;
            if (cd instanceof InterfaceC7492us) {
                C1559Tt0 name = ((InterfaceC7492us) cd).getName();
                O90.e(name, "getName(...)");
                if (((Boolean) interfaceC6099nZ.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final Set h(C4317iI c4317iI, C3808fd0 c3808fd0) {
        O90.f(c4317iI, "kindFilter");
        if (!c4317iI.a(C4317iI.e)) {
            return SN.a;
        }
        Set set = (Set) this.p.invoke();
        if (set == null) {
            this.n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(C1559Tt0.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final Set i(C4317iI c4317iI, C3808fd0 c3808fd0) {
        O90.f(c4317iI, "kindFilter");
        return SN.a;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final JD k() {
        return ID.a;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final void m(LinkedHashSet linkedHashSet, C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "name");
    }

    @Override // defpackage.AbstractC1289Qh0
    public final Set o(C4317iI c4317iI) {
        O90.f(c4317iI, "kindFilter");
        return SN.a;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final CD q() {
        return this.o;
    }

    public final InterfaceC7492us v(C1559Tt0 c1559Tt0, C3957gP0 c3957gP0) {
        C1559Tt0 c1559Tt02 = AbstractC5431k31.a;
        O90.f(c1559Tt0, "name");
        String strB = c1559Tt0.b();
        O90.e(strB, "asString(...)");
        if (strB.length() <= 0 || c1559Tt0.b) {
            return null;
        }
        Set set = (Set) this.p.invoke();
        if (c3957gP0 != null || set == null || set.contains(c1559Tt0.b())) {
            return (InterfaceC7492us) this.q.invoke(new C0588Hh0(c1559Tt0, c3957gP0));
        }
        return null;
    }
}
