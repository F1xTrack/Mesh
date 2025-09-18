package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: eY0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9255eY0 implements Iterator, InterfaceC1382Vy, InterfaceC11315ue0 {

    /* renamed from: a */
    public int f26744a;

    /* renamed from: b */
    public Object f26745b;

    /* renamed from: c */
    public Iterator f26746c;

    /* renamed from: d */
    public InterfaceC1382Vy f26747d;

    /* renamed from: b */
    public final RuntimeException m18007b() {
        int i = this.f26744a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f26744a);
    }

    @Override // p000.InterfaceC1382Vy
    public final InterfaceC0125Bz getContext() {
        return C0591JN.f5499a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f26744a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m18007b();
                }
                Iterator it = this.f26746c;
                O90.m5965c(it);
                if (it.hasNext()) {
                    this.f26744a = 2;
                    return true;
                }
                this.f26746c = null;
            }
            this.f26744a = 5;
            InterfaceC1382Vy interfaceC1382Vy = this.f26747d;
            O90.m5965c(interfaceC1382Vy);
            this.f26747d = null;
            interfaceC1382Vy.resumeWith(C8313Tf1.f11463a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f26744a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f26744a = 1;
            Iterator it = this.f26746c;
            O90.m5965c(it);
            return it.next();
        }
        if (i != 3) {
            throw m18007b();
        }
        this.f26744a = 0;
        Object obj = this.f26745b;
        this.f26745b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p000.InterfaceC1382Vy
    public final void resumeWith(Object obj) {
        RQ1.m7017d(obj);
        this.f26744a = 4;
    }
}
