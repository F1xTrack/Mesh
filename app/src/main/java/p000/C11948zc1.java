package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: zc1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11948zc1 implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public final /* synthetic */ int f46896a;

    /* renamed from: b */
    public Iterator f46897b;

    /* renamed from: c */
    public final Object f46898c;

    public C11948zc1(C6653q0 c6653q0) {
        this.f46896a = 1;
        this.f46898c = new ArrayList();
        this.f46897b = c6653q0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f46896a) {
        }
        return this.f46897b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f46896a) {
            case 0:
                return ((C7319Ac1) this.f46898c).f285b.invoke(this.f46897b.next());
            default:
                Object next = this.f46897b.next();
                Iterator it = (Iterator) C7427Ce1.f1551k.invoke(next);
                ArrayList arrayList = (ArrayList) this.f46898c;
                if (it == null || !it.hasNext()) {
                    while (!this.f46897b.hasNext() && !arrayList.isEmpty()) {
                        this.f46897b = (Iterator) AbstractC7167xu.m25964J(arrayList);
                        if (arrayList.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        arrayList.remove(AbstractC7230yu.m26273d(arrayList));
                    }
                } else {
                    arrayList.add(this.f46897b);
                    this.f46897b = it;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f46896a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11948zc1(C7319Ac1 c7319Ac1) {
        this.f46896a = 0;
        this.f46898c = c7319Ac1;
        this.f46897b = c7319Ac1.f284a.iterator();
    }
}
