package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: f90, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9333f90 implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public final int f27090a;

    /* renamed from: b */
    public final int f27091b;

    /* renamed from: c */
    public boolean f27092c;

    /* renamed from: d */
    public int f27093d;

    public C9333f90(int i, int i2, int i3) {
        this.f27090a = i3;
        this.f27091b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f27092c = z;
        this.f27093d = z ? i : i2;
    }

    /* renamed from: a */
    public final int m18193a() {
        int i = this.f27093d;
        if (i != this.f27091b) {
            this.f27093d = this.f27090a + i;
        } else {
            if (!this.f27092c) {
                throw new NoSuchElementException();
            }
            this.f27092c = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27092c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(m18193a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
