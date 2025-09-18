package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Yn */
/* loaded from: classes2.dex */
public class C3089Yn extends AbstractC3218do<C3010Vj> {

    /* renamed from: com.yandex.metrica.impl.ob.Yn$a */
    public static class a implements InterfaceC3244eo<C3010Vj> {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3244eo
        /* renamed from: a */
        public AbstractC3218do mo15521a(C3010Vj c3010Vj) {
            return new C3089Yn(c3010Vj);
        }
    }

    public C3089Yn(C3010Vj c3010Vj) {
        super(c3010Vj);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3218do
    /* renamed from: a */
    public boolean mo15520a(AbstractC3218do<C3010Vj> abstractC3218do) {
        C3010Vj c3010Vj = abstractC3218do.f23282a;
        Object obj = this.f23282a;
        if (obj == c3010Vj) {
            return true;
        }
        if (((C3010Vj) obj).m15330c() != c3010Vj.m15330c()) {
            return false;
        }
        if (((C3010Vj) this.f23282a).m15338k() == null ? c3010Vj.m15338k() != null : !((C3010Vj) this.f23282a).m15338k().equals(c3010Vj.m15338k())) {
            return false;
        }
        if (((C3010Vj) this.f23282a).m15339l() == null ? c3010Vj.m15339l() != null : !((C3010Vj) this.f23282a).m15339l().equals(c3010Vj.m15339l())) {
            return false;
        }
        if (((C3010Vj) this.f23282a).m15332e() == null ? c3010Vj.m15332e() != null : !((C3010Vj) this.f23282a).m15332e().equals(c3010Vj.m15332e())) {
            return false;
        }
        if (((C3010Vj) this.f23282a).m15329b() == null ? c3010Vj.m15329b() != null : !((C3010Vj) this.f23282a).m15329b().equals(c3010Vj.m15329b())) {
            return false;
        }
        if (((C3010Vj) this.f23282a).m15340m() == null ? c3010Vj.m15340m() == null : ((C3010Vj) this.f23282a).m15340m().equals(c3010Vj.m15340m())) {
            return ((C3010Vj) this.f23282a).m15342o() != null ? ((C3010Vj) this.f23282a).m15342o().equals(c3010Vj.m15342o()) : c3010Vj.m15342o() == null;
        }
        return false;
    }

    public int hashCode() {
        return ((((C3010Vj) this.f23282a).m15330c() + ((((((((((((C3010Vj) this.f23282a).m15338k() != null ? ((C3010Vj) this.f23282a).m15338k().hashCode() : 0) * 31) + (((C3010Vj) this.f23282a).m15339l() != null ? ((C3010Vj) this.f23282a).m15339l().hashCode() : 0)) * 31) + (((C3010Vj) this.f23282a).m15332e() != null ? ((C3010Vj) this.f23282a).m15332e().hashCode() : 0)) * 31) + (((C3010Vj) this.f23282a).m15329b() != null ? ((C3010Vj) this.f23282a).m15329b().hashCode() : 0)) * 31) + (((C3010Vj) this.f23282a).m15340m() != null ? ((C3010Vj) this.f23282a).m15340m().hashCode() : 0)) * 31)) * 31) + (((C3010Vj) this.f23282a).m15342o() != null ? ((C3010Vj) this.f23282a).m15342o().hashCode() : 0);
    }
}
