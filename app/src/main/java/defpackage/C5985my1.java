package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: my1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5985my1 implements Iterator {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ Iterator b;

    public C5985my1(Iterator it, Iterator it2) {
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Iterator it = this.a;
        if (it.hasNext()) {
            return new C1812Wz1(((Integer) it.next()).toString());
        }
        Iterator it2 = this.b;
        if (it2.hasNext()) {
            return new C1812Wz1((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
