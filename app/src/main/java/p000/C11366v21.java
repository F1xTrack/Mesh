package p000;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: v21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11366v21 implements Iterator {

    /* renamed from: a */
    public boolean f44112a;

    /* renamed from: b */
    public final int f44113b;

    /* renamed from: c */
    public final /* synthetic */ C11494w21 f44114c;

    public C11366v21(C11494w21 c11494w21) {
        this.f44114c = c11494w21;
        this.f44113b = ((AbstractList) c11494w21).modCount;
    }

    /* renamed from: a */
    public final void m25308a() {
        C11494w21 c11494w21 = this.f44114c;
        int i = ((AbstractList) c11494w21).modCount;
        int i2 = this.f44113b;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) c11494w21).modCount + "; expected: " + i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f44112a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f44112a) {
            throw new NoSuchElementException();
        }
        this.f44112a = true;
        m25308a();
        return this.f44114c.f44660b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m25308a();
        this.f44114c.clear();
    }
}
