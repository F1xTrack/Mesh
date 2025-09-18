package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: my1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10332my1 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f38020a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f38021b;

    public C10332my1(Iterator it, Iterator it2) {
        this.f38020a = it;
        this.f38021b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f38020a.hasNext()) {
            return true;
        }
        return this.f38021b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Iterator it = this.f38020a;
        if (it.hasNext()) {
            return new C8509Wz1(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f38021b;
        if (it2.hasNext()) {
            return new C8509Wz1((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
