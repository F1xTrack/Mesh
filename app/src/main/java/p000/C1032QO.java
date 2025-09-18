package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: QO */
/* loaded from: classes2.dex */
public final class C1032QO extends AbstractC10187lq0 {

    /* renamed from: b */
    public final C8270Sk0 f9606b;

    /* renamed from: c */
    public final C8270Sk0 f9607c;

    /* renamed from: d */
    public final C8426Vk0 f9608d;

    /* renamed from: e */
    public final /* synthetic */ C1094RO f9609e;

    public C1032QO(C1094RO c1094ro, Z41 z41) {
        if (z41 == null) {
            m6676h(0);
            throw null;
        }
        this.f9609e = c1094ro;
        C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
        this.f9606b = c8582Yk0.m9350b(new C0969PO(this, 0));
        this.f9607c = c8582Yk0.m9350b(new C0969PO(this, 1));
        this.f9608d = new C8426Vk0(c8582Yk0, new C6463n1(1, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0024  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m6676h(int r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1032QO.m6676h(int):void");
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: a */
    public final Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        if (c8340Tt0 != null) {
            return (Collection) this.f9606b.invoke(c8340Tt0);
        }
        m6676h(5);
        throw null;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: b */
    public final Set mo6677b() {
        Set set = (Set) this.f9609e.f10153i.invoke();
        if (set != null) {
            return set;
        }
        m6676h(17);
        throw null;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: d */
    public final Set mo4153d() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        m6676h(18);
        throw null;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: e */
    public final Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        if (c8340Tt0 != null) {
            return (Collection) this.f9607c.invoke(c8340Tt0);
        }
        m6676h(1);
        throw null;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: f */
    public final Set mo6678f() {
        Set set = (Set) this.f9609e.f10153i.invoke();
        if (set != null) {
            return set;
        }
        m6676h(19);
        throw null;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        if (c4233iI == null) {
            m6676h(13);
            throw null;
        }
        if (interfaceC6497nZ == null) {
            m6676h(14);
            throw null;
        }
        Collection collection = (Collection) this.f9608d.invoke();
        if (collection != null) {
            return collection;
        }
        m6676h(15);
        throw null;
    }

    /* renamed from: i */
    public final InterfaceC10059kq0 m6679i() {
        InterfaceC10059kq0 interfaceC10059kq0Mo3799d0 = ((AbstractC7742Ig0) ((AbstractC6337l1) this.f9609e.mo1439v()).mo5276b().iterator().next()).mo3799d0();
        if (interfaceC10059kq0Mo3799d0 != null) {
            return interfaceC10059kq0Mo3799d0;
        }
        m6676h(9);
        throw null;
    }

    /* renamed from: j */
    public final LinkedHashSet m6680j(C8340Tt0 c8340Tt0, Collection collection) {
        if (c8340Tt0 == null) {
            m6676h(10);
            throw null;
        }
        if (collection == null) {
            m6676h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C11229tz0.f43434c.m25061h(c8340Tt0, collection, Collections.emptySet(), this.f9609e, new C0208DI(linkedHashSet, 1));
        return linkedHashSet;
    }
}
