package defpackage;

import java.util.NoSuchElementException;

/* renamed from: gE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3925gE1 extends AbstractC5740lg1 {
    public int b;
    public final int c;
    public final /* synthetic */ JE1 d;

    public C3925gE1(JE1 je1) {
        super(5);
        this.d = je1;
        this.b = 0;
        this.c = je1.i();
    }

    @Override // defpackage.AbstractC5740lg1
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return this.d.d(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
