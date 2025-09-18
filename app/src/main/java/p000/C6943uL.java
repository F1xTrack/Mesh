package p000;

import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: uL */
/* loaded from: classes.dex */
public final class C6943uL {

    /* renamed from: b */
    public static final C6943uL f43669b = new C6943uL();

    /* renamed from: c */
    public static final boolean f43670c = true;

    /* renamed from: a */
    public final ArrayBlockingQueue f43671a = new ArrayBlockingQueue(20);

    /* renamed from: a */
    public final void m25182a(EnumC6880tL enumC6880tL) {
        if (!f43670c) {
            return;
        }
        int i = 5;
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.f43671a;
            if (arrayBlockingQueue.offer(enumC6880tL) || i <= 0) {
                return;
            }
            arrayBlockingQueue.poll();
            i--;
        }
    }

    public final String toString() {
        return this.f43671a.toString();
    }
}
