package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: hy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4253hy0 implements Iterator, InterfaceC7451ue0 {
    public final /* synthetic */ int a;
    public boolean b = true;
    public final Object c;

    public /* synthetic */ C4253hy0(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    throw new NoSuchElementException();
                }
                this.b = false;
                return ((C5220iy0) this.c).a;
            default:
                if (!this.b) {
                    throw new NoSuchElementException();
                }
                this.b = false;
                return this.c;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
