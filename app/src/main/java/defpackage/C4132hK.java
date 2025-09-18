package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: hK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4132hK {
    public final ArrayDeque a;

    public C4132hK(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayDeque();
                break;
            default:
                this.a = new ArrayDeque();
                break;
        }
    }

    public C3941gK a() {
        C3941gK c3941gK;
        synchronized (this.a) {
            c3941gK = (C3941gK) this.a.poll();
        }
        return c3941gK == null ? new C3941gK() : c3941gK;
    }

    public void b(C3941gK c3941gK) {
        synchronized (this.a) {
            try {
                if (this.a.size() < 10) {
                    this.a.offer(c3941gK);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(JE1 je1) {
        if (!je1.r()) {
            if (!(je1 instanceof C7583vK1)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(je1.getClass())));
            }
            C7583vK1 c7583vK1 = (C7583vK1) je1;
            c(c7583vK1.d);
            c(c7583vK1.e);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(C7583vK1.h, je1.i());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        ArrayDeque arrayDeque = this.a;
        int iG = C7583vK1.G(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((JE1) arrayDeque.peek()).i() >= iG) {
            arrayDeque.push(je1);
            return;
        }
        int iG2 = C7583vK1.G(iBinarySearch);
        JE1 c7583vK12 = (JE1) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((JE1) arrayDeque.peek()).i() < iG2) {
            c7583vK12 = new C7583vK1((JE1) arrayDeque.pop(), c7583vK12);
        }
        C7583vK1 c7583vK13 = new C7583vK1(c7583vK12, je1);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(C7583vK1.h, c7583vK13.c);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((JE1) arrayDeque.peek()).i() >= C7583vK1.G(iBinarySearch2 + 1)) {
                break;
            } else {
                c7583vK13 = new C7583vK1((JE1) arrayDeque.pop(), c7583vK13);
            }
        }
        arrayDeque.push(c7583vK13);
    }
}
