package defpackage;

import java.util.Iterator;

/* renamed from: nz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6179nz1 implements Iterator {
    public final /* synthetic */ Iterator a;

    public C6179nz1(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new C1812Wz1((String) this.a.next());
    }
}
