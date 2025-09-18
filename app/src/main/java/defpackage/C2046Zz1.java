package defpackage;

import java.util.Iterator;

/* renamed from: Zz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2046Zz1 extends AbstractC6942rz1 {
    public final transient AbstractC5606kz1 c;
    public final transient C3531eA1 d;

    public C2046Zz1(AbstractC5606kz1 abstractC5606kz1, C3531eA1 c3531eA1) {
        this.c = abstractC5606kz1;
        this.d = c3531eA1;
    }

    @Override // defpackage.AbstractC7703vy1
    public final int b(Object[] objArr) {
        return this.d.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // defpackage.AbstractC6942rz1, defpackage.AbstractC7703vy1
    public final AbstractC1185Oy1 i() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((C5262jA1) this.c).f;
    }
}
