package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class EJ1 extends AbstractC5740lg1 {
    public final C7799wT0 b;
    public AbstractC5740lg1 c;

    public EJ1(C7583vK1 c7583vK1) {
        super(5);
        this.b = new C7799wT0(c7583vK1);
        this.c = b();
    }

    @Override // defpackage.AbstractC5740lg1
    public final byte a() {
        AbstractC5740lg1 abstractC5740lg1 = this.c;
        if (abstractC5740lg1 == null) {
            throw new NoSuchElementException();
        }
        byte bA = abstractC5740lg1.a();
        if (!this.c.hasNext()) {
            this.c = b();
        }
        return bA;
    }

    public final C3925gE1 b() {
        C7799wT0 c7799wT0 = this.b;
        if (c7799wT0.hasNext()) {
            return new C3925gE1(c7799wT0.b());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }
}
