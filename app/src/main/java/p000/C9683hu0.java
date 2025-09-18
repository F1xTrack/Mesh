package p000;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: hu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9683hu0 {

    /* renamed from: a */
    public final ConcurrentLinkedQueue f28669a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public AbstractC9811iu0 f28670b = null;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0030 A[EDGE_INSN: B:28:0x0030->B:18:0x0030 BREAK  A[LOOP:0: B:6:0x000d->B:25:0x0048], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18885a(long r6, com.facebook.react.animated.C1881a r8) {
        /*
            r5 = this;
            boolean r0 = r5.m18886b()
            r1 = 0
            if (r0 == 0) goto L8
            goto L31
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Ld:
            iu0 r2 = r5.f28670b
            if (r2 == 0) goto L1d
            long r3 = r2.f34796a
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L18
            goto L30
        L18:
            r0.add(r2)
            r5.f28670b = r1
        L1d:
            java.util.concurrent.ConcurrentLinkedQueue r2 = r5.f28669a
            java.lang.Object r2 = r2.poll()
            iu0 r2 = (p000.AbstractC9811iu0) r2
            if (r2 != 0) goto L28
            goto L30
        L28:
            long r3 = r2.f34796a
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L48
            r5.f28670b = r2
        L30:
            r1 = r0
        L31:
            if (r1 == 0) goto L47
            java.util.Iterator r6 = r1.iterator()
        L37:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L47
            java.lang.Object r7 = r6.next()
            iu0 r7 = (p000.AbstractC9811iu0) r7
            r7.mo9180a(r8)
            goto L37
        L47:
            return
        L48:
            r0.add(r2)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9683hu0.m18885a(long, com.facebook.react.animated.a):void");
    }

    /* renamed from: b */
    public final boolean m18886b() {
        return this.f28669a.isEmpty() && this.f28670b == null;
    }
}
