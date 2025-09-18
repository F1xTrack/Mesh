package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: Lh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7900Lh0 extends AbstractC8316Th0 {

    /* renamed from: n */
    public final C10773qP0 f6800n;

    /* renamed from: o */
    public final C7588Fh0 f6801o;

    /* renamed from: p */
    public final C8374Uk0 f6802p;

    /* renamed from: q */
    public final C8478Wk0 f6803q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7900Lh0(C6479nH c6479nH, C10773qP0 c10773qP0, C7588Fh0 c7588Fh0) {
        super(c6479nH, null);
        O90.m5968f(c7588Fh0, "ownerDescriptor");
        this.f6800n = c10773qP0;
        this.f6801o = c7588Fh0;
        C8582Yk0 c8582Yk0 = (C8582Yk0) ((C9773ib0) c6479nH.f38228b).f29338a;
        C7053w5 c7053w5 = new C7053w5(c6479nH, 17, this);
        c8582Yk0.getClass();
        this.f6802p = new C8374Uk0(c8582Yk0, c7053w5);
        this.f6803q = c8582Yk0.m9351c(new C4027f1(this, 11, c6479nH));
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        return m5061v(c8340Tt0, null);
    }

    @Override // p000.AbstractC8160Qh0, p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: e */
    public final Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        return C0779MN.f7117a;
    }

    @Override // p000.AbstractC8160Qh0, p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        if (!c4233iI.m18998a(C4233iI.f29057l | C4233iI.f29050e)) {
            return C0779MN.f7117a;
        }
        Iterable iterable = (Iterable) this.f9741d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC0140CD interfaceC0140CD = (InterfaceC0140CD) obj;
            if (interfaceC0140CD instanceof InterfaceC6976us) {
                C8340Tt0 name = ((InterfaceC6976us) interfaceC0140CD).getName();
                O90.m5967e(name, "getName(...)");
                if (((Boolean) interfaceC6497nZ.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: h */
    public final Set mo1772h(C4233iI c4233iI, C9393fd0 c9393fd0) {
        O90.m5968f(c4233iI, "kindFilter");
        if (!c4233iI.m18998a(C4233iI.f29050e)) {
            return C1156SN.f10705a;
        }
        Set set = (Set) this.f6802p.invoke();
        if (set == null) {
            this.f6800n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(C8340Tt0.m7798e((String) it.next()));
        }
        return hashSet;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: i */
    public final Set mo1773i(C4233iI c4233iI, C9393fd0 c9393fd0) {
        O90.m5968f(c4233iI, "kindFilter");
        return C1156SN.f10705a;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: k */
    public final InterfaceC0581JD mo1775k() {
        return C0518ID.f4842a;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: m */
    public final void mo1776m(LinkedHashSet linkedHashSet, C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "name");
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: o */
    public final Set mo1778o(C4233iI c4233iI) {
        O90.m5968f(c4233iI, "kindFilter");
        return C1156SN.f10705a;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: q */
    public final InterfaceC0140CD mo1780q() {
        return this.f6801o;
    }

    /* renamed from: v */
    public final InterfaceC6976us m5061v(C8340Tt0 c8340Tt0, C9493gP0 c9493gP0) {
        C8340Tt0 c8340Tt02 = AbstractC9961k31.f36274a;
        O90.m5968f(c8340Tt0, "name");
        String strM7801b = c8340Tt0.m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        if (strM7801b.length() <= 0 || c8340Tt0.f11578b) {
            return null;
        }
        Set set = (Set) this.f6802p.invoke();
        if (c9493gP0 != null || set == null || set.contains(c8340Tt0.m7801b())) {
            return (InterfaceC6976us) this.f6803q.invoke(new C7692Hh0(c8340Tt0, c9493gP0));
        }
        return null;
    }
}
