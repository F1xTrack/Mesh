package p000;

import java.util.List;

/* renamed from: Ig0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7742Ig0 implements InterfaceC6595p5, InterfaceC7950Mg0 {

    /* renamed from: a */
    public int f5080a;

    /* renamed from: B */
    public abstract C7789Jd1 mo3796B();

    /* renamed from: E */
    public abstract InterfaceC8101Pd1 mo3797E();

    /* renamed from: G */
    public abstract boolean mo3798G();

    /* renamed from: I */
    public abstract AbstractC7742Ig0 mo249I(C8054Og0 c8054Og0);

    /* renamed from: L */
    public abstract AbstractC8315Tg1 mo3963L();

    /* renamed from: d0 */
    public abstract InterfaceC10059kq0 mo3799d0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7742Ig0)) {
            return false;
        }
        AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) obj;
        if (mo3798G() == abstractC7742Ig0.mo3798G()) {
            if (AbstractC11152tM1.m24882c(C7460Cv0.f1757g, mo3963L(), abstractC7742Ig0.mo3963L())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        return AbstractC0761M5.m5256a(mo3796B());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.f5080a;
        if (i != 0) {
            return i;
        }
        if (AbstractC1141S8.m7182b(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (mo3798G() ? 1 : 0) + ((mo3800u().hashCode() + (mo3797E().hashCode() * 31)) * 31);
        }
        this.f5080a = iHashCode;
        return iHashCode;
    }

    /* renamed from: u */
    public abstract List mo3800u();
}
