package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* renamed from: a91, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2081a91 {
    public final C2272b91 a;
    public final String b;
    public boolean c;
    public P81 d;
    public final ArrayList e;
    public boolean f;

    public C2081a91(C2272b91 c2272b91, String str) {
        O90.f(c2272b91, "taskRunner");
        O90.f(str, "name");
        this.a = c2272b91;
        this.b = str;
        this.e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = AbstractC0199Ch1.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        P81 p81 = this.d;
        if (p81 != null && p81.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((P81) arrayList.get(size)).b) {
                P81 p812 = (P81) arrayList.get(size);
                if (C2272b91.i.isLoggable(Level.FINE)) {
                    AbstractC3401dU1.a(p812, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(P81 p81, long j) {
        O90.f(p81, "task");
        synchronized (this.a) {
            if (!this.c) {
                if (e(p81, j, false)) {
                    this.a.d(this);
                }
            } else if (p81.b) {
                if (C2272b91.i.isLoggable(Level.FINE)) {
                    AbstractC3401dU1.a(p81, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C2272b91.i.isLoggable(Level.FINE)) {
                    AbstractC3401dU1.a(p81, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(P81 p81, long j, boolean z) {
        O90.f(p81, "task");
        C2081a91 c2081a91 = p81.c;
        if (c2081a91 != this) {
            if (c2081a91 != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            p81.c = this;
        }
        C6446pN0 c6446pN0 = this.a.a;
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(p81);
        if (iIndexOf != -1) {
            if (p81.d <= j2) {
                if (C2272b91.i.isLoggable(Level.FINE)) {
                    AbstractC3401dU1.a(p81, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        p81.d = j2;
        if (C2272b91.i.isLoggable(Level.FINE)) {
            AbstractC3401dU1.a(p81, this, z ? "run again after ".concat(AbstractC3401dU1.b(j2 - jNanoTime)) : "scheduled after ".concat(AbstractC3401dU1.b(j2 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((P81) it.next()).d - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, p81);
        return size == 0;
    }

    public final void f() {
        byte[] bArr = AbstractC0199Ch1.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
