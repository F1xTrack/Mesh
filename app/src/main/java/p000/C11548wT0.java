package p000;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* renamed from: wT0 */
/* loaded from: classes2.dex */
public final class C11548wT0 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f44892a;

    /* renamed from: b */
    public final AbstractCollection f44893b;

    /* renamed from: c */
    public Iterable f44894c;

    public C11548wT0(JE1 je1) {
        this.f44892a = 1;
        if (!(je1 instanceof C11404vK1)) {
            this.f44893b = null;
            this.f44894c = (GE1) je1;
            return;
        }
        C11404vK1 c11404vK1 = (C11404vK1) je1;
        ArrayDeque arrayDeque = new ArrayDeque(c11404vK1.f44338g);
        this.f44893b = arrayDeque;
        arrayDeque.push(c11404vK1);
        JE1 je12 = c11404vK1.f44335d;
        while (je12 instanceof C11404vK1) {
            C11404vK1 c11404vK12 = (C11404vK1) je12;
            ((ArrayDeque) this.f44893b).push(c11404vK12);
            je12 = c11404vK12.f44335d;
        }
        this.f44894c = (GE1) je12;
    }

    /* renamed from: a */
    public C8580Yj0 m25632a() {
        C8580Yj0 c8580Yj0;
        C8580Yj0 c8580Yj02 = (C8580Yj0) this.f44894c;
        if (c8580Yj02 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            Stack stack = (Stack) this.f44893b;
            if (!stack.isEmpty()) {
                Object obj = ((C11802yT0) stack.pop()).f46267d;
                while (obj instanceof C11802yT0) {
                    C11802yT0 c11802yT0 = (C11802yT0) obj;
                    stack.push(c11802yT0);
                    obj = c11802yT0.f46266c;
                }
                c8580Yj0 = (C8580Yj0) obj;
                if (c8580Yj0.f14490b.length != 0) {
                    break;
                }
            } else {
                c8580Yj0 = null;
                break;
            }
        }
        this.f44894c = c8580Yj0;
        return c8580Yj02;
    }

    /* renamed from: b */
    public GE1 m25633b() {
        GE1 ge1;
        GE1 ge12 = (GE1) this.f44894c;
        if (ge12 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = (ArrayDeque) this.f44893b;
            ge1 = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            JE1 je1 = ((C11404vK1) arrayDeque.pop()).f44336e;
            while (je1 instanceof C11404vK1) {
                C11404vK1 c11404vK1 = (C11404vK1) je1;
                arrayDeque.push(c11404vK1);
                je1 = c11404vK1.f44335d;
            }
            ge1 = (GE1) je1;
        } while (ge1.mo3006i() == 0);
        this.f44894c = ge1;
        return ge12;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f44892a) {
            case 0:
                if (((C8580Yj0) this.f44894c) != null) {
                }
                break;
            default:
                if (((GE1) this.f44894c) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f44892a) {
            case 0:
                return m25632a();
            default:
                return m25633b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f44892a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C11548wT0(AbstractC0488Hk abstractC0488Hk) {
        this.f44892a = 0;
        this.f44893b = new Stack();
        while (abstractC0488Hk instanceof C11802yT0) {
            C11802yT0 c11802yT0 = (C11802yT0) abstractC0488Hk;
            ((Stack) this.f44893b).push(c11802yT0);
            abstractC0488Hk = c11802yT0.f46266c;
        }
        this.f44894c = (C8580Yj0) abstractC0488Hk;
    }
}
