package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Cl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7440Cl0 implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public final long f1606a;

    /* renamed from: b */
    public final long f1607b;

    /* renamed from: c */
    public boolean f1608c;

    /* renamed from: d */
    public long f1609d;

    public C7440Cl0(long j, long j2, long j3) {
        this.f1606a = j3;
        this.f1607b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.f1608c = z;
        this.f1609d = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1608c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f1609d;
        if (j != this.f1607b) {
            this.f1609d = this.f1606a + j;
        } else {
            if (!this.f1608c) {
                throw new NoSuchElementException();
            }
            this.f1608c = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
