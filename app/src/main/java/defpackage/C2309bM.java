package defpackage;

import java.util.Iterator;

/* renamed from: bM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2309bM implements Iterator, InterfaceC7451ue0 {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public int c;

    public C2309bM(Iterator it) {
        O90.f(it, "iterator");
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            default:
                return this.b.hasNext();
        }
        while (true) {
            int i = this.c;
            it = this.b;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            default:
                int i = this.c;
                this.c = i + 1;
                if (i >= 0) {
                    return new C5255j80(i, this.b.next());
                }
                AbstractC8259yu.j();
                throw null;
        }
        while (true) {
            int i2 = this.c;
            it = this.b;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.next();
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

    public C2309bM(C2499cM c2499cM) {
        this.b = c2499cM.a.iterator();
        this.c = c2499cM.b;
    }
}
