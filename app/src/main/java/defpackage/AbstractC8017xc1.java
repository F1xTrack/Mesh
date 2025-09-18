package defpackage;

import java.util.Iterator;

/* renamed from: xc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8017xc1 implements Iterator {
    public final Iterator a;

    public AbstractC8017xc1(Iterator it) {
        it.getClass();
        this.a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
