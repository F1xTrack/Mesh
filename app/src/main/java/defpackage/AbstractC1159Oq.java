package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: Oq */
/* loaded from: classes.dex */
public abstract class AbstractC1159Oq implements V51 {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public C1003Mq d;
    public long e;
    public long f;
    public long g;

    public AbstractC1159Oq() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new C1003Mq(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            B7 b7 = new B7(18, this);
            C1081Nq c1081Nq = new C1081Nq();
            c1081Nq.h = b7;
            arrayDeque.add(c1081Nq);
        }
        this.c = new PriorityQueue();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.VD
    public final void a(long j) {
        this.g = j;
    }

    @Override // defpackage.V51
    public final void b(long j) {
        this.e = j;
    }

    @Override // defpackage.VD
    public final Object d() {
        YN1.f(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C1003Mq c1003Mq = (C1003Mq) arrayDeque.pollFirst();
        this.d = c1003Mq;
        return c1003Mq;
    }

    @Override // defpackage.VD
    public final void e(C2072a61 c2072a61) {
        YN1.c(c2072a61 == this.d);
        C1003Mq c1003Mq = (C1003Mq) c2072a61;
        long j = this.g;
        if (j == -9223372036854775807L || c1003Mq.g >= j) {
            long j2 = this.f;
            this.f = 1 + j2;
            c1003Mq.k = j2;
            this.c.add(c1003Mq);
        } else {
            c1003Mq.t();
            this.a.add(c1003Mq);
        }
        this.d = null;
    }

    public abstract C1237Pq f();

    @Override // defpackage.VD
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            C1003Mq c1003Mq = (C1003Mq) priorityQueue.poll();
            int i = AbstractC0277Dh1.a;
            c1003Mq.t();
            arrayDeque.add(c1003Mq);
        }
        C1003Mq c1003Mq2 = this.d;
        if (c1003Mq2 != null) {
            c1003Mq2.t();
            arrayDeque.add(c1003Mq2);
            this.d = null;
        }
    }

    public abstract void g(C1003Mq c1003Mq);

    @Override // defpackage.VD
    /* renamed from: h */
    public C1081Nq c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (!priorityQueue.isEmpty()) {
                C1003Mq c1003Mq = (C1003Mq) priorityQueue.peek();
                int i = AbstractC0277Dh1.a;
                if (c1003Mq.g > this.e) {
                    break;
                }
                C1003Mq c1003Mq2 = (C1003Mq) priorityQueue.poll();
                boolean zG = c1003Mq2.g(4);
                ArrayDeque arrayDeque2 = this.a;
                if (zG) {
                    C1081Nq c1081Nq = (C1081Nq) arrayDeque.pollFirst();
                    c1081Nq.a(4);
                    c1003Mq2.t();
                    arrayDeque2.add(c1003Mq2);
                    return c1081Nq;
                }
                g(c1003Mq2);
                if (i()) {
                    C1237Pq c1237PqF = f();
                    C1081Nq c1081Nq2 = (C1081Nq) arrayDeque.pollFirst();
                    long j = c1003Mq2.g;
                    c1081Nq2.c = j;
                    c1081Nq2.e = c1237PqF;
                    c1081Nq2.f = j;
                    c1003Mq2.t();
                    arrayDeque2.add(c1003Mq2);
                    return c1081Nq2;
                }
                c1003Mq2.t();
                arrayDeque2.add(c1003Mq2);
            } else {
                break;
            }
        }
        return null;
    }

    public abstract boolean i();

    @Override // defpackage.VD
    public void release() {
    }
}
