package defpackage;

import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: uL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7393uL {
    public static final C7393uL b = new C7393uL();
    public static final boolean c = true;
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(20);

    public final void a(EnumC7202tL enumC7202tL) {
        if (!c) {
            return;
        }
        int i = 5;
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.a;
            if (arrayBlockingQueue.offer(enumC7202tL) || i <= 0) {
                return;
            }
            arrayBlockingQueue.poll();
            i--;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
