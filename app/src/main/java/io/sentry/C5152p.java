package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: io.sentry.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5152p implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException();
    }
}
