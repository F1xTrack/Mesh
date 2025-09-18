package defpackage;

import java.util.Iterator;

/* renamed from: zz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8466zz1 extends AbstractC1575Ty1 {
    public final transient C0954Lz1 c;
    public final transient C0409Ez1 d;

    public C8466zz1(C0954Lz1 c0954Lz1, C0409Ez1 c0409Ez1) {
        this.c = c0954Lz1;
        this.d = c0409Ez1;
    }

    @Override // defpackage.AbstractC2424by1
    public final int b(Object[] objArr) {
        return this.d.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.f;
    }
}
