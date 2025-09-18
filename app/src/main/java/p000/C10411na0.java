package p000;

import java.util.NoSuchElementException;

/* renamed from: na0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10411na0 extends AbstractC10168lg1 {

    /* renamed from: c */
    public static final Object f38380c = new Object();

    /* renamed from: b */
    public Object f38381b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38381b != f38380c;
    }

    @Override // p000.AbstractC10168lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        Object obj = this.f38381b;
        Object obj2 = f38380c;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f38381b = obj2;
        return obj;
    }
}
