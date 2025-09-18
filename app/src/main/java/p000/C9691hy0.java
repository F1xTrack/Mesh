package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: hy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9691hy0 implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public final /* synthetic */ int f28697a;

    /* renamed from: b */
    public boolean f28698b = true;

    /* renamed from: c */
    public final Object f28699c;

    public /* synthetic */ C9691hy0(int i, Object obj) {
        this.f28697a = i;
        this.f28699c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f28697a) {
        }
        return this.f28698b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f28697a) {
            case 0:
                if (!this.f28698b) {
                    throw new NoSuchElementException();
                }
                this.f28698b = false;
                return ((C9819iy0) this.f28699c).f34822a;
            default:
                if (!this.f28698b) {
                    throw new NoSuchElementException();
                }
                this.f28698b = false;
                return this.f28699c;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f28697a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
