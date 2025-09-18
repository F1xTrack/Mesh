package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: rd0 */
/* loaded from: classes2.dex */
public final class C6875rd0 implements InterfaceC5578kq0 {
    public static final /* synthetic */ InterfaceC5927mf0[] f;
    public final C6045nH b;
    public final C0432Fh0 c;
    public final C0900Lh0 d;
    public final C1688Vk0 e;

    static {
        IP0 ip0 = BP0.a;
        f = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C6875rd0.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public C6875rd0(C6045nH c6045nH, C6643qP0 c6643qP0, C0432Fh0 c0432Fh0) {
        O90.f(c0432Fh0, "packageFragment");
        this.b = c6045nH;
        this.c = c0432Fh0;
        this.d = new C0900Lh0(c6045nH, c6643qP0, c0432Fh0);
        C1922Yk0 c1922Yk0 = (C1922Yk0) ((C4375ib0) c6045nH.b).a;
        C6685qd0 c6685qd0 = new C6685qd0(0, this);
        c1922Yk0.getClass();
        this.e = new C1688Vk0(c1922Yk0, c6685qd0);
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        i(c1559Tt0, interfaceC0600Hl0);
        InterfaceC5578kq0[] interfaceC5578kq0ArrH = h();
        Collection collectionA = this.d.a(c1559Tt0, interfaceC0600Hl0);
        for (InterfaceC5578kq0 interfaceC5578kq0 : interfaceC5578kq0ArrH) {
            collectionA = AbstractC6840rR1.b(collectionA, interfaceC5578kq0.a(c1559Tt0, interfaceC0600Hl0));
        }
        return collectionA == null ? SN.a : collectionA;
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set b() {
        InterfaceC5578kq0[] interfaceC5578kq0ArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC5578kq0 interfaceC5578kq0 : interfaceC5578kq0ArrH) {
            AbstractC0314Du.m(linkedHashSet, interfaceC5578kq0.b());
        }
        linkedHashSet.addAll(this.d.b());
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        i(c1559Tt0, interfaceC0600Hl0);
        C0900Lh0 c0900Lh0 = this.d;
        c0900Lh0.getClass();
        InterfaceC1087Ns interfaceC1087Ns = null;
        InterfaceC7492us interfaceC7492usV = c0900Lh0.v(c1559Tt0, null);
        if (interfaceC7492usV != null) {
            return interfaceC7492usV;
        }
        for (InterfaceC5578kq0 interfaceC5578kq0 : h()) {
            InterfaceC1087Ns interfaceC1087NsC = interfaceC5578kq0.c(c1559Tt0, interfaceC0600Hl0);
            if (interfaceC1087NsC != null) {
                if (!(interfaceC1087NsC instanceof InterfaceC1165Os) || !((InterfaceC1165Os) interfaceC1087NsC).M()) {
                    return interfaceC1087NsC;
                }
                if (interfaceC1087Ns == null) {
                    interfaceC1087Ns = interfaceC1087NsC;
                }
            }
        }
        return interfaceC1087Ns;
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set d() {
        InterfaceC5578kq0[] interfaceC5578kq0ArrH = h();
        O90.f(interfaceC5578kq0ArrH, "<this>");
        HashSet hashSetA = AbstractC8123yA1.a(interfaceC5578kq0ArrH.length == 0 ? MN.a : new L8(0, interfaceC5578kq0ArrH));
        if (hashSetA == null) {
            return null;
        }
        hashSetA.addAll(this.d.d());
        return hashSetA;
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        i(c1559Tt0, enumC8453zv0);
        InterfaceC5578kq0[] interfaceC5578kq0ArrH = h();
        this.d.getClass();
        Collection collectionB = MN.a;
        for (InterfaceC5578kq0 interfaceC5578kq0 : interfaceC5578kq0ArrH) {
            collectionB = AbstractC6840rR1.b(collectionB, interfaceC5578kq0.e(c1559Tt0, enumC8453zv0));
        }
        return collectionB == null ? SN.a : collectionB;
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set f() {
        InterfaceC5578kq0[] interfaceC5578kq0ArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC5578kq0 interfaceC5578kq0 : interfaceC5578kq0ArrH) {
            AbstractC0314Du.m(linkedHashSet, interfaceC5578kq0.f());
        }
        linkedHashSet.addAll(this.d.f());
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        InterfaceC5578kq0[] interfaceC5578kq0ArrH = h();
        Collection collectionG = this.d.g(c4317iI, interfaceC6099nZ);
        for (InterfaceC5578kq0 interfaceC5578kq0 : interfaceC5578kq0ArrH) {
            collectionG = AbstractC6840rR1.b(collectionG, interfaceC5578kq0.g(c4317iI, interfaceC6099nZ));
        }
        return collectionG == null ? SN.a : collectionG;
    }

    public final InterfaceC5578kq0[] h() {
        return (InterfaceC5578kq0[]) WS1.b(this.e, f[0]);
    }

    public final void i(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        C4375ib0 c4375ib0 = (C4375ib0) this.b.b;
        AbstractC7329u02.b((C3759fN) c4375ib0.n, interfaceC0600Hl0, this.c, c1559Tt0);
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
