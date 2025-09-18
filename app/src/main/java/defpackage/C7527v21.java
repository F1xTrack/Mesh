package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: v21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7527v21 implements Iterator {
    public boolean a;
    public final int b;
    public final /* synthetic */ C7718w21 c;

    public C7527v21(C7718w21 c7718w21) {
        this.c = c7718w21;
        this.b = ((AbstractList) c7718w21).modCount;
    }

    public final void a() {
        C7718w21 c7718w21 = this.c;
        int i = ((AbstractList) c7718w21).modCount;
        int i2 = this.b;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) c7718w21).modCount + "; expected: " + i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        a();
        return this.c.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.c.clear();
    }
}
