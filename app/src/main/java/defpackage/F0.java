package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class F0 extends C7898x0 implements ListIterator {
    public final /* synthetic */ G0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(G0 g0) {
        super(g0);
        this.e = g0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        G0 g0 = this.e;
        boolean zIsEmpty = g0.isEmpty();
        c().add(obj);
        ((AbstractC7326u0) g0.g).e++;
        if (zIsEmpty) {
            g0.b();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(G0 g0, int i) {
        super(g0, ((List) g0.c).listIterator(i));
        this.e = g0;
    }
}
