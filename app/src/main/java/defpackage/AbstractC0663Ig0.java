package defpackage;

import java.util.List;

/* renamed from: Ig0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0663Ig0 implements InterfaceC6391p5, InterfaceC0974Mg0 {
    public int a;

    public abstract C0733Jd1 B();

    public abstract InterfaceC1200Pd1 E();

    public abstract boolean G();

    public abstract AbstractC0663Ig0 I(C1130Og0 c1130Og0);

    public abstract AbstractC1521Tg1 L();

    public abstract InterfaceC5578kq0 d0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0663Ig0)) {
            return false;
        }
        AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) obj;
        if (G() == abstractC0663Ig0.G()) {
            if (AbstractC7207tM1.c(C0240Cv0.g, L(), abstractC0663Ig0.L())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        return M5.a(B());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.a;
        if (i != 0) {
            return i;
        }
        if (S8.b(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (G() ? 1 : 0) + ((u().hashCode() + (E().hashCode() * 31)) * 31);
        }
        this.a = iHashCode;
        return iHashCode;
    }

    public abstract List u();
}
