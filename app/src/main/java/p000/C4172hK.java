package p000;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: hK */
/* loaded from: classes.dex */
public final class C4172hK {

    /* renamed from: a */
    public final ArrayDeque f28377a;

    public C4172hK(int i) {
        switch (i) {
            case 1:
                this.f28377a = new ArrayDeque();
                break;
            default:
                this.f28377a = new ArrayDeque();
                break;
        }
    }

    /* renamed from: a */
    public C4109gK m18795a() {
        C4109gK c4109gK;
        synchronized (this.f28377a) {
            c4109gK = (C4109gK) this.f28377a.poll();
        }
        return c4109gK == null ? new C4109gK() : c4109gK;
    }

    /* renamed from: b */
    public void m18796b(C4109gK c4109gK) {
        synchronized (this.f28377a) {
            try {
                if (this.f28377a.size() < 10) {
                    this.f28377a.offer(c4109gK);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public void m18797c(JE1 je1) {
        if (!je1.mo3009r()) {
            if (!(je1 instanceof C11404vK1)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(je1.getClass())));
            }
            C11404vK1 c11404vK1 = (C11404vK1) je1;
            m18797c(c11404vK1.f44335d);
            m18797c(c11404vK1.f44336e);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(C11404vK1.f44333h, je1.mo3006i());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        ArrayDeque arrayDeque = this.f28377a;
        int iM25400G = C11404vK1.m25400G(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((JE1) arrayDeque.peek()).mo3006i() >= iM25400G) {
            arrayDeque.push(je1);
            return;
        }
        int iM25400G2 = C11404vK1.m25400G(iBinarySearch);
        JE1 c11404vK12 = (JE1) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((JE1) arrayDeque.peek()).mo3006i() < iM25400G2) {
            c11404vK12 = new C11404vK1((JE1) arrayDeque.pop(), c11404vK12);
        }
        C11404vK1 c11404vK13 = new C11404vK1(c11404vK12, je1);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(C11404vK1.f44333h, c11404vK13.f44334c);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((JE1) arrayDeque.peek()).mo3006i() >= C11404vK1.m25400G(iBinarySearch2 + 1)) {
                break;
            } else {
                c11404vK13 = new C11404vK1((JE1) arrayDeque.pop(), c11404vK13);
            }
        }
        arrayDeque.push(c11404vK13);
    }
}
