package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n0 */
/* loaded from: classes2.dex */
public abstract class AbstractC6462n0 implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public int f38026a;

    /* renamed from: b */
    public Object f38027b;

    /* renamed from: a */
    public abstract void mo17689a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f38026a;
        if (i == 0) {
            this.f38026a = 3;
            mo17689a();
            if (this.f38026a != 1) {
                return false;
            }
        } else if (i != 1) {
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f38026a;
        if (i == 1) {
            this.f38026a = 0;
            return this.f38027b;
        }
        if (i != 2) {
            this.f38026a = 3;
            mo17689a();
            if (this.f38026a == 1) {
                this.f38026a = 0;
                return this.f38027b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
