package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* renamed from: a91, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8689a91 {

    /* renamed from: a */
    public final C8817b91 f15333a;

    /* renamed from: b */
    public final String f15334b;

    /* renamed from: c */
    public boolean f15335c;

    /* renamed from: d */
    public P81 f15336d;

    /* renamed from: e */
    public final ArrayList f15337e;

    /* renamed from: f */
    public boolean f15338f;

    public C8689a91(C8817b91 c8817b91, String str) {
        O90.m5968f(c8817b91, "taskRunner");
        O90.m5968f(str, "name");
        this.f15333a = c8817b91;
        this.f15334b = str;
        this.f15337e = new ArrayList();
    }

    /* renamed from: a */
    public final void m9677a() {
        byte[] bArr = AbstractC7433Ch1.f1577a;
        synchronized (this.f15333a) {
            if (m9678b()) {
                this.f15333a.m10428d(this);
            }
        }
    }

    /* renamed from: b */
    public final boolean m9678b() {
        P81 p81 = this.f15336d;
        if (p81 != null && p81.f8872b) {
            this.f15338f = true;
        }
        ArrayList arrayList = this.f15337e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((P81) arrayList.get(size)).f8872b) {
                P81 p812 = (P81) arrayList.get(size);
                if (C8817b91.f16829i.isLoggable(Level.FINE)) {
                    AbstractC9120dU1.m17691a(p812, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void m9679c(P81 p81, long j) {
        O90.m5968f(p81, "task");
        synchronized (this.f15333a) {
            if (!this.f15335c) {
                if (m9680e(p81, j, false)) {
                    this.f15333a.m10428d(this);
                }
            } else if (p81.f8872b) {
                if (C8817b91.f16829i.isLoggable(Level.FINE)) {
                    AbstractC9120dU1.m17691a(p81, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C8817b91.f16829i.isLoggable(Level.FINE)) {
                    AbstractC9120dU1.m17691a(p81, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: e */
    public final boolean m9680e(P81 p81, long j, boolean z) {
        O90.m5968f(p81, "task");
        C8689a91 c8689a91 = p81.f8873c;
        if (c8689a91 != this) {
            if (c8689a91 != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            p81.f8873c = this;
        }
        C10641pN0 c10641pN0 = this.f15333a.f16830a;
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f15337e;
        int iIndexOf = arrayList.indexOf(p81);
        if (iIndexOf != -1) {
            if (p81.f8874d <= j2) {
                if (C8817b91.f16829i.isLoggable(Level.FINE)) {
                    AbstractC9120dU1.m17691a(p81, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        p81.f8874d = j2;
        if (C8817b91.f16829i.isLoggable(Level.FINE)) {
            AbstractC9120dU1.m17691a(p81, this, z ? "run again after ".concat(AbstractC9120dU1.m17692b(j2 - jNanoTime)) : "scheduled after ".concat(AbstractC9120dU1.m17692b(j2 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((P81) it.next()).f8874d - jNanoTime > j) {
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

    /* renamed from: f */
    public final void m9681f() {
        byte[] bArr = AbstractC7433Ch1.f1577a;
        synchronized (this.f15333a) {
            this.f15335c = true;
            if (m9678b()) {
                this.f15333a.m10428d(this);
            }
        }
    }

    public final String toString() {
        return this.f15334b;
    }
}
