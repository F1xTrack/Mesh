package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Yn extends Cdo<Vj> {

    public static class a implements eo<Vj> {
        @Override // com.yandex.metrica.impl.ob.eo
        public Cdo a(Vj vj) {
            return new Yn(vj);
        }
    }

    public Yn(Vj vj) {
        super(vj);
    }

    @Override // com.yandex.metrica.impl.ob.Cdo
    public boolean a(Cdo<Vj> cdo) {
        Vj vj = cdo.a;
        Object obj = this.a;
        if (obj == vj) {
            return true;
        }
        if (((Vj) obj).c() != vj.c()) {
            return false;
        }
        if (((Vj) this.a).k() == null ? vj.k() != null : !((Vj) this.a).k().equals(vj.k())) {
            return false;
        }
        if (((Vj) this.a).l() == null ? vj.l() != null : !((Vj) this.a).l().equals(vj.l())) {
            return false;
        }
        if (((Vj) this.a).e() == null ? vj.e() != null : !((Vj) this.a).e().equals(vj.e())) {
            return false;
        }
        if (((Vj) this.a).b() == null ? vj.b() != null : !((Vj) this.a).b().equals(vj.b())) {
            return false;
        }
        if (((Vj) this.a).m() == null ? vj.m() == null : ((Vj) this.a).m().equals(vj.m())) {
            return ((Vj) this.a).o() != null ? ((Vj) this.a).o().equals(vj.o()) : vj.o() == null;
        }
        return false;
    }

    public int hashCode() {
        return ((((Vj) this.a).c() + ((((((((((((Vj) this.a).k() != null ? ((Vj) this.a).k().hashCode() : 0) * 31) + (((Vj) this.a).l() != null ? ((Vj) this.a).l().hashCode() : 0)) * 31) + (((Vj) this.a).e() != null ? ((Vj) this.a).e().hashCode() : 0)) * 31) + (((Vj) this.a).b() != null ? ((Vj) this.a).b().hashCode() : 0)) * 31) + (((Vj) this.a).m() != null ? ((Vj) this.a).m().hashCode() : 0)) * 31)) * 31) + (((Vj) this.a).o() != null ? ((Vj) this.a).o().hashCode() : 0);
    }
}
