package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* renamed from: wT0 */
/* loaded from: classes2.dex */
public final class C7799wT0 implements Iterator {
    public final /* synthetic */ int a;
    public final AbstractCollection b;
    public Iterable c;

    public C7799wT0(JE1 je1) {
        this.a = 1;
        if (!(je1 instanceof C7583vK1)) {
            this.b = null;
            this.c = (GE1) je1;
            return;
        }
        C7583vK1 c7583vK1 = (C7583vK1) je1;
        ArrayDeque arrayDeque = new ArrayDeque(c7583vK1.g);
        this.b = arrayDeque;
        arrayDeque.push(c7583vK1);
        JE1 je12 = c7583vK1.d;
        while (je12 instanceof C7583vK1) {
            C7583vK1 c7583vK12 = (C7583vK1) je12;
            ((ArrayDeque) this.b).push(c7583vK12);
            je12 = c7583vK12.d;
        }
        this.c = (GE1) je12;
    }

    public C1919Yj0 a() {
        C1919Yj0 c1919Yj0;
        C1919Yj0 c1919Yj02 = (C1919Yj0) this.c;
        if (c1919Yj02 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            Stack stack = (Stack) this.b;
            if (!stack.isEmpty()) {
                Object obj = ((C8179yT0) stack.pop()).d;
                while (obj instanceof C8179yT0) {
                    C8179yT0 c8179yT0 = (C8179yT0) obj;
                    stack.push(c8179yT0);
                    obj = c8179yT0.c;
                }
                c1919Yj0 = (C1919Yj0) obj;
                if (c1919Yj0.b.length != 0) {
                    break;
                }
            } else {
                c1919Yj0 = null;
                break;
            }
        }
        this.c = c1919Yj0;
        return c1919Yj02;
    }

    public GE1 b() {
        GE1 ge1;
        GE1 ge12 = (GE1) this.c;
        if (ge12 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = (ArrayDeque) this.b;
            ge1 = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            JE1 je1 = ((C7583vK1) arrayDeque.pop()).e;
            while (je1 instanceof C7583vK1) {
                C7583vK1 c7583vK1 = (C7583vK1) je1;
                arrayDeque.push(c7583vK1);
                je1 = c7583vK1.d;
            }
            ge1 = (GE1) je1;
        } while (ge1.i() == 0);
        this.c = ge1;
        return ge12;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (((C1919Yj0) this.c) != null) {
                }
                break;
            default:
                if (((GE1) this.c) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.a) {
            case 0:
                return a();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C7799wT0(AbstractC0596Hk abstractC0596Hk) {
        this.a = 0;
        this.b = new Stack();
        while (abstractC0596Hk instanceof C8179yT0) {
            C8179yT0 c8179yT0 = (C8179yT0) abstractC0596Hk;
            ((Stack) this.b).push(c8179yT0);
            abstractC0596Hk = c8179yT0.c;
        }
        this.c = (C1919Yj0) abstractC0596Hk;
    }
}
