package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public abstract class P2<T> extends Q0<T> {
    public P2(long j, long j2) {
        super(j, j2);
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public synchronized T a() {
        return (T) super.a();
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public synchronized void b(T t) {
        super.b((P2<T>) t);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    @Override // com.yandex.metrica.impl.ob.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.yandex.metrica.impl.ob.O<T> r0 = r1.a     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            com.yandex.metrica.impl.ob.O<T> r0 = r1.a     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r1)
            return r0
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.P2.b():boolean");
    }
}
