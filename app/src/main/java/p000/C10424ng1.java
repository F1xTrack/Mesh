package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ng1 */
/* loaded from: classes.dex */
public final class C10424ng1 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f38469a = 5;

    /* renamed from: b */
    public final Iterator f38470b;

    public C10424ng1(ZI1 zi1) {
        this.f38470b = zi1.f14850a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f38469a) {
        }
        return this.f38470b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f38469a) {
            case 0:
                return (String) this.f38470b.next();
            case 1:
                return (String) this.f38470b.next();
            case 2:
                return (String) this.f38470b.next();
            case 3:
                return (String) this.f38470b.next();
            case 4:
                return ((Map.Entry) this.f38470b.next()).getValue();
            default:
                return (String) this.f38470b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f38469a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException("Remove not supported");
            case 4:
                this.f38470b.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C10424ng1(Iterator it) {
        it.getClass();
        this.f38470b = it;
    }

    public C10424ng1(C10362nB1 c10362nB1) {
        this.f38470b = c10362nB1.f38167a.keySet().iterator();
    }

    public C10424ng1(C10552og1 c10552og1) {
        this.f38470b = c10552og1.f39174a.iterator();
    }

    public C10424ng1(C10680pg1 c10680pg1) {
        this.f38470b = c10680pg1.f40276a.iterator();
    }

    public C10424ng1(C10808qg1 c10808qg1) {
        this.f38470b = c10808qg1.f41103a.iterator();
    }
}
