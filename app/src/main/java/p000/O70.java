package p000;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class O70 extends P70 {

    /* renamed from: c */
    public final transient int f8242c;

    /* renamed from: d */
    public final transient int f8243d;

    /* renamed from: e */
    public final /* synthetic */ P70 f8244e;

    public O70(P70 p70, int i, int i2) {
        this.f8244e = p70;
        this.f8242c = i;
        this.f8243d = i2;
    }

    @Override // p000.P70, java.util.List
    /* renamed from: F */
    public final P70 subList(int i, int i2) {
        QL1.m6670f(i, i2, this.f8243d);
        int i3 = this.f8242c;
        return this.f8244e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        QL1.m6667c(i, this.f8243d);
        return this.f8244e.get(i + this.f8242c);
    }

    @Override // p000.J70
    /* renamed from: h */
    public final Object[] mo4161h() {
        return this.f8244e.mo4161h();
    }

    @Override // p000.J70
    /* renamed from: i */
    public final int mo4162i() {
        return this.f8244e.mo4163k() + this.f8242c + this.f8243d;
    }

    @Override // p000.P70, p000.J70, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.J70
    /* renamed from: k */
    public final int mo4163k() {
        return this.f8244e.mo4163k() + this.f8242c;
    }

    @Override // p000.P70, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p000.J70
    /* renamed from: q */
    public final boolean mo4164q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8243d;
    }

    @Override // p000.P70, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
