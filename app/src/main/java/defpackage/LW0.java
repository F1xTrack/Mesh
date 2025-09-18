package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class LW0 extends CO0 {
    public C2576cl1 a;
    public final C5564kl1 b;
    public final C4405il1 c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final KW0 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public LW0(C5564kl1 c5564kl1) {
        this.b = c5564kl1;
        C4405il1 c4405il1 = c5564kl1.j;
        this.c = c4405il1;
        this.d = (LinearLayoutManager) c4405il1.getLayoutManager();
        this.g = new KW0();
        d();
    }

    @Override // defpackage.CO0
    public final void a(RecyclerView recyclerView, int i) {
        C2576cl1 c2576cl1;
        C2576cl1 c2576cl12;
        int i2 = this.e;
        boolean z = true;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            this.e = 1;
            int i3 = this.i;
            if (i3 != -1) {
                this.h = i3;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.N0();
            }
            c(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                c(2);
                this.j = true;
                return;
            }
            return;
        }
        if (i2 != 1 && i2 != 4) {
            z = false;
        }
        KW0 kw0 = this.g;
        if (z && i == 0) {
            e();
            if (!this.k) {
                int i4 = kw0.b;
                if (i4 != -1 && (c2576cl12 = this.a) != null) {
                    c2576cl12.b(i4, 0.0f, 0);
                }
            } else if (kw0.c == 0) {
                int i5 = this.h;
                int i6 = kw0.b;
                if (i5 != i6 && (c2576cl1 = this.a) != null) {
                    c2576cl1.c(i6);
                }
            }
            c(0);
            d();
        }
        if (this.e == 2 && i == 0 && this.l) {
            e();
            if (kw0.c == 0) {
                int i7 = this.i;
                int i8 = kw0.b;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    C2576cl1 c2576cl13 = this.a;
                    if (c2576cl13 != null) {
                        c2576cl13.c(i8);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0028  */
    @Override // defpackage.CO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.k = r6
            r5.e()
            boolean r0 = r5.j
            KW0 r1 = r5.g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L40
            r5.j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            kl1 r8 = r5.b
            el1 r8 = r8.g
            int r8 = r8.C()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r1.c
            if (r7 == 0) goto L30
            int r7 = r1.b
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r1.b
        L32:
            r5.i = r7
            int r8 = r5.h
            if (r8 == r7) goto L50
            cl1 r8 = r5.a
            if (r8 == 0) goto L50
            r8.c(r7)
            goto L50
        L40:
            int r7 = r5.e
            if (r7 != 0) goto L50
            int r7 = r1.b
            if (r7 != r2) goto L49
            r7 = r3
        L49:
            cl1 r8 = r5.a
            if (r8 == 0) goto L50
            r8.c(r7)
        L50:
            int r7 = r1.b
            if (r7 != r2) goto L55
            r7 = r3
        L55:
            float r8 = r1.a
            int r0 = r1.c
            cl1 r4 = r5.a
            if (r4 == 0) goto L60
            r4.b(r7, r8, r0)
        L60:
            int r7 = r1.b
            int r8 = r5.i
            if (r7 == r8) goto L68
            if (r8 != r2) goto L76
        L68:
            int r7 = r1.c
            if (r7 != 0) goto L76
            int r7 = r5.f
            if (r7 == r6) goto L76
            r5.c(r3)
            r5.d()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LW0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        C2576cl1 c2576cl1 = this.a;
        if (c2576cl1 != null) {
            c2576cl1.a(i);
        }
    }

    public final void d() {
        this.e = 0;
        this.f = 0;
        KW0 kw0 = this.g;
        kw0.b = -1;
        kw0.a = 0.0f;
        kw0.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LW0.e():void");
    }
}
