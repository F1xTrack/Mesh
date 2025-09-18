package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class OB1 extends C7898x0 implements ListIterator {
    public final /* synthetic */ G0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OB1(G0 g0) {
        super(g0, (byte) 0);
        this.e = g0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        G0 g0 = this.e;
        boolean zIsEmpty = g0.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        ((C6223oC1) g0.g).getClass();
        if (zIsEmpty) {
            g0.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OB1(G0 g0, int i) {
        super(g0, ((List) g0.c).listIterator(i), (byte) 0);
        this.e = g0;
    }
}
