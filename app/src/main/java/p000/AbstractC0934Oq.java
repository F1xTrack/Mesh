package p000;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: Oq */
/* loaded from: classes.dex */
public abstract class AbstractC0934Oq implements V51 {

    /* renamed from: a */
    public final ArrayDeque f8634a = new ArrayDeque();

    /* renamed from: b */
    public final ArrayDeque f8635b;

    /* renamed from: c */
    public final PriorityQueue f8636c;

    /* renamed from: d */
    public C0808Mq f8637d;

    /* renamed from: e */
    public long f8638e;

    /* renamed from: f */
    public long f8639f;

    /* renamed from: g */
    public long f8640g;

    public AbstractC0934Oq() {
        for (int i = 0; i < 10; i++) {
            this.f8634a.add(new C0808Mq(1));
        }
        this.f8635b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.f8635b;
            C0071B7 c0071b7 = new C0071B7(18, this);
            C0871Nq c0871Nq = new C0871Nq();
            c0871Nq.f8027h = c0071b7;
            arrayDeque.add(c0871Nq);
        }
        this.f8636c = new PriorityQueue();
        this.f8640g = -9223372036854775807L;
    }

    @Override // p000.InterfaceC1335VD
    /* renamed from: a */
    public final void mo6160a(long j) {
        this.f8640g = j;
    }

    @Override // p000.V51
    /* renamed from: b */
    public final void mo6161b(long j) {
        this.f8638e = j;
    }

    @Override // p000.InterfaceC1335VD
    /* renamed from: d */
    public final Object mo6162d() {
        YN1.m9281f(this.f8637d == null);
        ArrayDeque arrayDeque = this.f8634a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C0808Mq c0808Mq = (C0808Mq) arrayDeque.pollFirst();
        this.f8637d = c0808Mq;
        return c0808Mq;
    }

    @Override // p000.InterfaceC1335VD
    /* renamed from: e */
    public final void mo6163e(C8683a61 c8683a61) {
        YN1.m9278c(c8683a61 == this.f8637d);
        C0808Mq c0808Mq = (C0808Mq) c8683a61;
        long j = this.f8640g;
        if (j == -9223372036854775807L || c0808Mq.f14800g >= j) {
            long j2 = this.f8639f;
            this.f8639f = 1 + j2;
            c0808Mq.f7367k = j2;
            this.f8636c.add(c0808Mq);
        } else {
            c0808Mq.mo7722t();
            this.f8634a.add(c0808Mq);
        }
        this.f8637d = null;
    }

    /* renamed from: f */
    public abstract C0997Pq mo3600f();

    @Override // p000.InterfaceC1335VD
    public void flush() {
        ArrayDeque arrayDeque;
        this.f8639f = 0L;
        this.f8638e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f8636c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f8634a;
            if (zIsEmpty) {
                break;
            }
            C0808Mq c0808Mq = (C0808Mq) priorityQueue.poll();
            int i = AbstractC7485Dh1.f2166a;
            c0808Mq.mo7722t();
            arrayDeque.add(c0808Mq);
        }
        C0808Mq c0808Mq2 = this.f8637d;
        if (c0808Mq2 != null) {
            c0808Mq2.mo7722t();
            arrayDeque.add(c0808Mq2);
            this.f8637d = null;
        }
    }

    /* renamed from: g */
    public abstract void mo3601g(C0808Mq c0808Mq);

    @Override // p000.InterfaceC1335VD
    /* renamed from: h */
    public C0871Nq mo3599c() {
        ArrayDeque arrayDeque = this.f8635b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f8636c;
            if (!priorityQueue.isEmpty()) {
                C0808Mq c0808Mq = (C0808Mq) priorityQueue.peek();
                int i = AbstractC7485Dh1.f2166a;
                if (c0808Mq.f14800g > this.f8638e) {
                    break;
                }
                C0808Mq c0808Mq2 = (C0808Mq) priorityQueue.poll();
                boolean zM2501g = c0808Mq2.m2501g(4);
                ArrayDeque arrayDeque2 = this.f8634a;
                if (zM2501g) {
                    C0871Nq c0871Nq = (C0871Nq) arrayDeque.pollFirst();
                    c0871Nq.m2498a(4);
                    c0808Mq2.mo7722t();
                    arrayDeque2.add(c0808Mq2);
                    return c0871Nq;
                }
                mo3601g(c0808Mq2);
                if (mo3603i()) {
                    C0997Pq c0997PqMo3600f = mo3600f();
                    C0871Nq c0871Nq2 = (C0871Nq) arrayDeque.pollFirst();
                    long j = c0808Mq2.f14800g;
                    c0871Nq2.f15398c = j;
                    c0871Nq2.f8024e = c0997PqMo3600f;
                    c0871Nq2.f8025f = j;
                    c0808Mq2.mo7722t();
                    arrayDeque2.add(c0808Mq2);
                    return c0871Nq2;
                }
                c0808Mq2.mo7722t();
                arrayDeque2.add(c0808Mq2);
            } else {
                break;
            }
        }
        return null;
    }

    /* renamed from: i */
    public abstract boolean mo3603i();

    @Override // p000.InterfaceC1335VD
    public void release() {
    }
}
