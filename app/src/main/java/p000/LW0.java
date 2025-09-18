package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class LW0 extends CO0 {

    /* renamed from: a */
    public C9021cl1 f6681a;

    /* renamed from: b */
    public final C10050kl1 f6682b;

    /* renamed from: c */
    public final C9794il1 f6683c;

    /* renamed from: d */
    public final LinearLayoutManager f6684d;

    /* renamed from: e */
    public int f6685e;

    /* renamed from: f */
    public int f6686f;

    /* renamed from: g */
    public final KW0 f6687g;

    /* renamed from: h */
    public int f6688h;

    /* renamed from: i */
    public int f6689i;

    /* renamed from: j */
    public boolean f6690j;

    /* renamed from: k */
    public boolean f6691k;

    /* renamed from: l */
    public boolean f6692l;

    public LW0(C10050kl1 c10050kl1) {
        this.f6682b = c10050kl1;
        C9794il1 c9794il1 = c10050kl1.f36670j;
        this.f6683c = c9794il1;
        this.f6684d = (LinearLayoutManager) c9794il1.getLayoutManager();
        this.f6687g = new KW0();
        m5013d();
    }

    @Override // p000.CO0
    /* renamed from: a */
    public final void mo468a(RecyclerView recyclerView, int i) {
        C9021cl1 c9021cl1;
        C9021cl1 c9021cl12;
        int i2 = this.f6685e;
        boolean z = true;
        if (!(i2 == 1 && this.f6686f == 1) && i == 1) {
            this.f6685e = 1;
            int i3 = this.f6689i;
            if (i3 != -1) {
                this.f6688h = i3;
                this.f6689i = -1;
            } else if (this.f6688h == -1) {
                this.f6688h = this.f6684d.m10194N0();
            }
            m5012c(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f6691k) {
                m5012c(2);
                this.f6690j = true;
                return;
            }
            return;
        }
        if (i2 != 1 && i2 != 4) {
            z = false;
        }
        KW0 kw0 = this.f6687g;
        if (z && i == 0) {
            m5014e();
            if (!this.f6691k) {
                int i4 = kw0.f6143b;
                if (i4 != -1 && (c9021cl12 = this.f6681a) != null) {
                    c9021cl12.mo6840b(i4, 0.0f, 0);
                }
            } else if (kw0.f6144c == 0) {
                int i5 = this.f6688h;
                int i6 = kw0.f6143b;
                if (i5 != i6 && (c9021cl1 = this.f6681a) != null) {
                    c9021cl1.mo6841c(i6);
                }
            }
            m5012c(0);
            m5013d();
        }
        if (this.f6685e == 2 && i == 0 && this.f6692l) {
            m5014e();
            if (kw0.f6144c == 0) {
                int i7 = this.f6689i;
                int i8 = kw0.f6143b;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    C9021cl1 c9021cl13 = this.f6681a;
                    if (c9021cl13 != null) {
                        c9021cl13.mo6841c(i8);
                    }
                }
                m5012c(0);
                m5013d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0028  */
    @Override // p000.CO0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo469b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f6691k = r6
            r5.m5014e()
            boolean r0 = r5.f6690j
            KW0 r1 = r5.f6687g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L40
            r5.f6690j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            kl1 r8 = r5.f6682b
            el1 r8 = r8.f36667g
            int r8 = r8.m26409C()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r1.f6144c
            if (r7 == 0) goto L30
            int r7 = r1.f6143b
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r1.f6143b
        L32:
            r5.f6689i = r7
            int r8 = r5.f6688h
            if (r8 == r7) goto L50
            cl1 r8 = r5.f6681a
            if (r8 == 0) goto L50
            r8.mo6841c(r7)
            goto L50
        L40:
            int r7 = r5.f6685e
            if (r7 != 0) goto L50
            int r7 = r1.f6143b
            if (r7 != r2) goto L49
            r7 = r3
        L49:
            cl1 r8 = r5.f6681a
            if (r8 == 0) goto L50
            r8.mo6841c(r7)
        L50:
            int r7 = r1.f6143b
            if (r7 != r2) goto L55
            r7 = r3
        L55:
            float r8 = r1.f6142a
            int r0 = r1.f6144c
            cl1 r4 = r5.f6681a
            if (r4 == 0) goto L60
            r4.mo6840b(r7, r8, r0)
        L60:
            int r7 = r1.f6143b
            int r8 = r5.f6689i
            if (r7 == r8) goto L68
            if (r8 != r2) goto L76
        L68:
            int r7 = r1.f6144c
            if (r7 != 0) goto L76
            int r7 = r5.f6686f
            if (r7 == r6) goto L76
            r5.m5012c(r3)
            r5.m5013d()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LW0.mo469b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: c */
    public final void m5012c(int i) {
        if ((this.f6685e == 3 && this.f6686f == 0) || this.f6686f == i) {
            return;
        }
        this.f6686f = i;
        C9021cl1 c9021cl1 = this.f6681a;
        if (c9021cl1 != null) {
            c9021cl1.mo6839a(i);
        }
    }

    /* renamed from: d */
    public final void m5013d() {
        this.f6685e = 0;
        this.f6686f = 0;
        KW0 kw0 = this.f6687g;
        kw0.f6143b = -1;
        kw0.f6142a = 0.0f;
        kw0.f6144c = 0;
        this.f6688h = -1;
        this.f6689i = -1;
        this.f6690j = false;
        this.f6691k = false;
        this.f6692l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x013e  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5014e() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LW0.m5014e():void");
    }
}
