package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class O70 extends P70 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ P70 e;

    public O70(P70 p70, int i, int i2) {
        this.e = p70;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.P70, java.util.List
    /* renamed from: F */
    public final P70 subList(int i, int i2) {
        QL1.f(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        QL1.c(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.J70
    public final Object[] h() {
        return this.e.h();
    }

    @Override // defpackage.J70
    public final int i() {
        return this.e.k() + this.c + this.d;
    }

    @Override // defpackage.P70, defpackage.J70, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.J70
    public final int k() {
        return this.e.k() + this.c;
    }

    @Override // defpackage.P70, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.J70
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.P70, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
