package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ng1 */
/* loaded from: classes.dex */
public final class C6122ng1 implements Iterator {
    public final /* synthetic */ int a = 5;
    public final Iterator b;

    public C6122ng1(ZI1 zi1) {
        this.b = zi1.a.iterator();
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
                return (String) this.b.next();
            case 1:
                return (String) this.b.next();
            case 2:
                return (String) this.b.next();
            case 3:
                return (String) this.b.next();
            case 4:
                return ((Map.Entry) this.b.next()).getValue();
            default:
                return (String) this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException("Remove not supported");
            case 4:
                this.b.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C6122ng1(Iterator it) {
        it.getClass();
        this.b = it;
    }

    public C6122ng1(C6029nB1 c6029nB1) {
        this.b = c6029nB1.a.keySet().iterator();
    }

    public C6122ng1(C6313og1 c6313og1) {
        this.b = c6313og1.a.iterator();
    }

    public C6122ng1(C6504pg1 c6504pg1) {
        this.b = c6504pg1.a.iterator();
    }

    public C6122ng1(C6695qg1 c6695qg1) {
        this.b = c6695qg1.a.iterator();
    }
}
