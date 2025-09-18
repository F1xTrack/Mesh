package p000;

import java.util.Iterator;

/* renamed from: nz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10462nz1 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f38661a;

    public C10462nz1(Iterator it) {
        this.f38661a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38661a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new C8509Wz1((String) this.f38661a.next());
    }
}
