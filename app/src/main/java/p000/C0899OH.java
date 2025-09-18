package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: OH */
/* loaded from: classes2.dex */
public final class C0899OH implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public int f8331a = -1;

    /* renamed from: b */
    public int f8332b;

    /* renamed from: c */
    public int f8333c;

    /* renamed from: d */
    public C9461g90 f8334d;

    /* renamed from: e */
    public int f8335e;

    /* renamed from: f */
    public final /* synthetic */ C0962PH f8336f;

    public C0899OH(C0962PH c0962ph) {
        this.f8336f = c0962ph;
        int iM22418c = AbstractC10132lO1.m22418c(c0962ph.f8977b, 0, c0962ph.f8976a.length());
        this.f8332b = iM22418c;
        this.f8333c = iM22418c;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r0v1, types: [Vg0, kotlin.jvm.functions.Function2] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6004a() {
        /*
            r8 = this;
            int r0 = r8.f8333c
            r1 = 0
            if (r0 >= 0) goto Lb
            r8.f8331a = r1
            r0 = 0
            r8.f8334d = r0
            goto L75
        Lb:
            PH r2 = r8.f8336f
            int r3 = r2.f8978c
            java.lang.CharSequence r4 = r2.f8976a
            r5 = -1
            r6 = 1
            if (r3 <= 0) goto L1c
            int r7 = r8.f8335e
            int r7 = r7 + r6
            r8.f8335e = r7
            if (r7 >= r3) goto L22
        L1c:
            int r3 = r4.length()
            if (r0 <= r3) goto L32
        L22:
            g90 r0 = new g90
            int r1 = r8.f8332b
            int r2 = p000.AbstractC11374v51.m25359x(r4)
            r0.<init>(r1, r2, r6)
            r8.f8334d = r0
            r8.f8333c = r5
            goto L73
        L32:
            Vg0 r0 = r2.f8979d
            int r2 = r8.f8333c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r4, r2)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L52
            g90 r0 = new g90
            int r1 = r8.f8332b
            int r2 = p000.AbstractC11374v51.m25359x(r4)
            r0.<init>(r1, r2, r6)
            r8.f8334d = r0
            r8.f8333c = r5
            goto L73
        L52:
            java.lang.Object r2 = r0.f36702a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f36703b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.f8332b
            g90 r3 = p000.AbstractC10132lO1.m22423h(r3, r2)
            r8.f8334d = r3
            int r2 = r2 + r0
            r8.f8332b = r2
            if (r0 != 0) goto L70
            r1 = r6
        L70:
            int r2 = r2 + r1
            r8.f8333c = r2
        L73:
            r8.f8331a = r6
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0899OH.m6004a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8331a == -1) {
            m6004a();
        }
        return this.f8331a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8331a == -1) {
            m6004a();
        }
        if (this.f8331a == 0) {
            throw new NoSuchElementException();
        }
        C9461g90 c9461g90 = this.f8334d;
        O90.m5966d(c9461g90, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f8334d = null;
        this.f8331a = -1;
        return c9461g90;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
