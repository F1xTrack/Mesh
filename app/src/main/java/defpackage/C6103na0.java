package defpackage;

import java.util.NoSuchElementException;

/* renamed from: na0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6103na0 extends AbstractC5740lg1 {
    public static final Object c = new Object();
    public Object b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != c;
    }

    @Override // defpackage.AbstractC5740lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.b = obj2;
        return obj;
    }
}
