package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: uZ0 */
/* loaded from: classes.dex */
public abstract class AbstractC11305uZ0 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f43750a;

    public /* synthetic */ AbstractC11305uZ0(int i) {
        this.f43750a = i;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f43750a) {
            case 0:
                collection.getClass();
                if (collection instanceof InterfaceC7352At0) {
                    collection = ((InterfaceC7352At0) collection).m366x();
                }
                boolean zRemove = false;
                if (!(collection instanceof Set) || collection.size() <= size()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        zRemove |= remove(it.next());
                    }
                } else {
                    Iterator<E> it2 = iterator();
                    collection.getClass();
                    while (it2.hasNext()) {
                        if (collection.contains(it2.next())) {
                            it2.remove();
                            zRemove = true;
                        }
                    }
                }
                return zRemove;
            default:
                return AbstractC9831j22.m21970e(this, collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f43750a) {
            case 0:
                collection.getClass();
                break;
            default:
                collection.getClass();
                break;
        }
        return super.retainAll(collection);
    }
}
