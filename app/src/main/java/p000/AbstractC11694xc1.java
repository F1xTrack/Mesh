package p000;

import java.util.Iterator;

/* renamed from: xc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11694xc1 implements Iterator {

    /* renamed from: a */
    public final Iterator f45711a;

    public AbstractC11694xc1(Iterator it) {
        it.getClass();
        this.f45711a = it;
    }

    /* renamed from: a */
    public abstract Object mo8541a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45711a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo8541a(this.f45711a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f45711a.remove();
    }
}
