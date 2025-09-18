package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: zc1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8397zc1 implements Iterator, InterfaceC7451ue0 {
    public final /* synthetic */ int a;
    public Iterator b;
    public final Object c;

    public C8397zc1(C6563q0 c6563q0) {
        this.a = 1;
        this.c = new ArrayList();
        this.b = c6563q0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return ((C0028Ac1) this.c).b.invoke(this.b.next());
            default:
                Object next = this.b.next();
                Iterator it = (Iterator) C0190Ce1.k.invoke(next);
                ArrayList arrayList = (ArrayList) this.c;
                if (it == null || !it.hasNext()) {
                    while (!this.b.hasNext() && !arrayList.isEmpty()) {
                        this.b = (Iterator) AbstractC8069xu.J(arrayList);
                        if (arrayList.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        arrayList.remove(AbstractC8259yu.d(arrayList));
                    }
                } else {
                    arrayList.add(this.b);
                    this.b = it;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8397zc1(C0028Ac1 c0028Ac1) {
        this.a = 0;
        this.c = c0028Ac1;
        this.b = c0028Ac1.a.iterator();
    }
}
