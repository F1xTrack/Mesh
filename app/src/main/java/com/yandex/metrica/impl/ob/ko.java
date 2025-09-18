package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
class ko extends Cdo<Z2> {
    public ko(lo loVar, Z2 z2) {
        super(z2);
    }

    @Override // com.yandex.metrica.impl.ob.Cdo
    public boolean a(Cdo<Z2> cdo) {
        String str = ((Z2) this.a).a;
        if (str == null ? cdo.a.a != null : !str.equals(cdo.a.a)) {
            return false;
        }
        String str2 = ((Z2) this.a).b;
        return str2 != null ? str2.equals(cdo.a.b) : cdo.a.b == null;
    }

    public int hashCode() {
        String str = ((Z2) this.a).a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = ((Z2) this.a).b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
