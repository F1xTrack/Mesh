package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: la0 */
/* loaded from: classes.dex */
public final class C10155la0 extends AbstractC10168lg1 {

    /* renamed from: b */
    public int f37163b;

    /* renamed from: c */
    public Object f37164c;

    /* renamed from: d */
    public final /* synthetic */ int f37165d;

    /* renamed from: e */
    public final Iterator f37166e;

    /* renamed from: f */
    public final /* synthetic */ Object f37167f;

    public C10155la0() {
        super(0);
        this.f37163b = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i = this.f37163b;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 0) {
            return true;
        }
        if (iM26247x == 2) {
            return false;
        }
        this.f37163b = 4;
        switch (this.f37165d) {
            case 0:
                do {
                    Iterator it = this.f37166e;
                    if (!it.hasNext()) {
                        this.f37163b = 3;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((InterfaceC11895zC0) this.f37167f).apply(next));
            default:
                do {
                    Iterator it2 = this.f37166e;
                    if (!it2.hasNext()) {
                        this.f37163b = 3;
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((C10921rZ0) this.f37167f).f41733b.contains(next));
        }
        this.f37164c = next;
        if (this.f37163b == 3) {
            return false;
        }
        this.f37163b = 1;
        return true;
    }

    @Override // p000.AbstractC10168lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f37163b = 2;
        Object obj = this.f37164c;
        this.f37164c = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10155la0(Iterator it, InterfaceC11895zC0 interfaceC11895zC0) {
        this();
        this.f37165d = 0;
        this.f37166e = it;
        this.f37167f = interfaceC11895zC0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10155la0(C10921rZ0 c10921rZ0) {
        this();
        this.f37165d = 1;
        this.f37167f = c10921rZ0;
        this.f37166e = c10921rZ0.f41732a.iterator();
    }
}
