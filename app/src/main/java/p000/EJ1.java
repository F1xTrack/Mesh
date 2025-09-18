package p000;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class EJ1 extends AbstractC10168lg1 {

    /* renamed from: b */
    public final C11548wT0 f2604b;

    /* renamed from: c */
    public AbstractC10168lg1 f2605c;

    public EJ1(C11404vK1 c11404vK1) {
        super(5);
        this.f2604b = new C11548wT0(c11404vK1);
        this.f2605c = m2125b();
    }

    @Override // p000.AbstractC10168lg1
    /* renamed from: a */
    public final byte mo2124a() {
        AbstractC10168lg1 abstractC10168lg1 = this.f2605c;
        if (abstractC10168lg1 == null) {
            throw new NoSuchElementException();
        }
        byte bMo2124a = abstractC10168lg1.mo2124a();
        if (!this.f2605c.hasNext()) {
            this.f2605c = m2125b();
        }
        return bMo2124a;
    }

    /* renamed from: b */
    public final C9472gE1 m2125b() {
        C11548wT0 c11548wT0 = this.f2604b;
        if (c11548wT0.hasNext()) {
            return new C9472gE1(c11548wT0.m25633b());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2605c != null;
    }
}
