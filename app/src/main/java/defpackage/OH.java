package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class OH implements Iterator, InterfaceC7451ue0 {
    public int a = -1;
    public int b;
    public int c;
    public C3909g90 d;
    public int e;
    public final /* synthetic */ PH f;

    public OH(PH ph) {
        this.f = ph;
        int iC = AbstractC5686lO1.c(ph.b, 0, ph.a.length());
        this.b = iC;
        this.c = iC;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r0v1, types: [Vg0, kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r8 = this;
            int r0 = r8.c
            r1 = 0
            if (r0 >= 0) goto Lb
            r8.a = r1
            r0 = 0
            r8.d = r0
            goto L75
        Lb:
            PH r2 = r8.f
            int r3 = r2.c
            java.lang.CharSequence r4 = r2.a
            r5 = -1
            r6 = 1
            if (r3 <= 0) goto L1c
            int r7 = r8.e
            int r7 = r7 + r6
            r8.e = r7
            if (r7 >= r3) goto L22
        L1c:
            int r3 = r4.length()
            if (r0 <= r3) goto L32
        L22:
            g90 r0 = new g90
            int r1 = r8.b
            int r2 = defpackage.AbstractC7538v51.x(r4)
            r0.<init>(r1, r2, r6)
            r8.d = r0
            r8.c = r5
            goto L73
        L32:
            Vg0 r0 = r2.d
            int r2 = r8.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r4, r2)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L52
            g90 r0 = new g90
            int r1 = r8.b
            int r2 = defpackage.AbstractC7538v51.x(r4)
            r0.<init>(r1, r2, r6)
            r8.d = r0
            r8.c = r5
            goto L73
        L52:
            java.lang.Object r2 = r0.a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.b
            g90 r3 = defpackage.AbstractC5686lO1.h(r3, r2)
            r8.d = r3
            int r2 = r2 + r0
            r8.b = r2
            if (r0 != 0) goto L70
            r1 = r6
        L70:
            int r2 = r2 + r1
            r8.c = r2
        L73:
            r8.a = r6
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OH.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            throw new NoSuchElementException();
        }
        C3909g90 c3909g90 = this.d;
        O90.d(c3909g90, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.a = -1;
        return c3909g90;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
