package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.ko */
/* loaded from: classes2.dex */
class C3400ko extends AbstractC3218do<C3093Z2> {
    public C3400ko(C3426lo c3426lo, C3093Z2 c3093z2) {
        super(c3093z2);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3218do
    /* renamed from: a */
    public boolean mo15520a(AbstractC3218do<C3093Z2> abstractC3218do) {
        String str = ((C3093Z2) this.f23282a).f22909a;
        if (str == null ? abstractC3218do.f23282a.f22909a != null : !str.equals(abstractC3218do.f23282a.f22909a)) {
            return false;
        }
        String str2 = ((C3093Z2) this.f23282a).f22910b;
        return str2 != null ? str2.equals(abstractC3218do.f23282a.f22910b) : abstractC3218do.f23282a.f22910b == null;
    }

    public int hashCode() {
        String str = ((C3093Z2) this.f23282a).f22909a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = ((C3093Z2) this.f23282a).f22910b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
