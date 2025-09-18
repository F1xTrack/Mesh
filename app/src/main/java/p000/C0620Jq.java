package p000;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* renamed from: Jq */
/* loaded from: classes.dex */
public final class C0620Jq {

    /* renamed from: A */
    public static final boolean[] f5719A;

    /* renamed from: B */
    public static final int[] f5720B;

    /* renamed from: C */
    public static final int[] f5721C;

    /* renamed from: D */
    public static final int[] f5722D;

    /* renamed from: E */
    public static final int[] f5723E;

    /* renamed from: v */
    public static final int f5724v = m4447c(2, 2, 2, 0);

    /* renamed from: w */
    public static final int f5725w;

    /* renamed from: x */
    public static final int[] f5726x;

    /* renamed from: y */
    public static final int[] f5727y;

    /* renamed from: z */
    public static final int[] f5728z;

    /* renamed from: a */
    public final ArrayList f5729a = new ArrayList();

    /* renamed from: b */
    public final SpannableStringBuilder f5730b = new SpannableStringBuilder();

    /* renamed from: c */
    public boolean f5731c;

    /* renamed from: d */
    public boolean f5732d;

    /* renamed from: e */
    public int f5733e;

    /* renamed from: f */
    public boolean f5734f;

    /* renamed from: g */
    public int f5735g;

    /* renamed from: h */
    public int f5736h;

    /* renamed from: i */
    public int f5737i;

    /* renamed from: j */
    public int f5738j;

    /* renamed from: k */
    public int f5739k;

    /* renamed from: l */
    public int f5740l;

    /* renamed from: m */
    public int f5741m;

    /* renamed from: n */
    public int f5742n;

    /* renamed from: o */
    public int f5743o;

    /* renamed from: p */
    public int f5744p;

    /* renamed from: q */
    public int f5745q;

    /* renamed from: r */
    public int f5746r;

    /* renamed from: s */
    public int f5747s;

    /* renamed from: t */
    public int f5748t;

    /* renamed from: u */
    public int f5749u;

    static {
        int iM4447c = m4447c(0, 0, 0, 0);
        f5725w = iM4447c;
        int iM4447c2 = m4447c(0, 0, 0, 3);
        f5726x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f5727y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f5728z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f5719A = new boolean[]{false, false, false, true, true, true, false};
        f5720B = new int[]{iM4447c, iM4447c2, iM4447c, iM4447c, iM4447c2, iM4447c, iM4447c};
        f5721C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f5722D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f5723E = new int[]{iM4447c, iM4447c, iM4447c, iM4447c, iM4447c, iM4447c2, iM4447c2};
    }

    public C0620Jq() {
        m4450d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m4447c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            p000.YN1.m9279d(r4, r0)
            p000.YN1.m9279d(r5, r0)
            p000.YN1.m9279d(r6, r0)
            p000.YN1.m9279d(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0620Jq.m4447c(int, int, int, int):int");
    }

    /* renamed from: a */
    public final void m4448a(char c) {
        SpannableStringBuilder spannableStringBuilder = this.f5730b;
        if (c != '\n') {
            spannableStringBuilder.append(c);
            return;
        }
        ArrayList arrayList = this.f5729a;
        arrayList.add(m4449b());
        spannableStringBuilder.clear();
        if (this.f5743o != -1) {
            this.f5743o = 0;
        }
        if (this.f5744p != -1) {
            this.f5744p = 0;
        }
        if (this.f5745q != -1) {
            this.f5745q = 0;
        }
        if (this.f5747s != -1) {
            this.f5747s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f5738j && arrayList.size() < 15) {
                this.f5749u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    /* renamed from: b */
    public final SpannableString m4449b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f5730b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f5743o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f5743o, length, 33);
            }
            if (this.f5744p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f5744p, length, 33);
            }
            if (this.f5745q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f5746r), this.f5745q, length, 33);
            }
            if (this.f5747s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f5748t), this.f5747s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* renamed from: d */
    public final void m4450d() {
        this.f5729a.clear();
        this.f5730b.clear();
        this.f5743o = -1;
        this.f5744p = -1;
        this.f5745q = -1;
        this.f5747s = -1;
        this.f5749u = 0;
        this.f5731c = false;
        this.f5732d = false;
        this.f5733e = 4;
        this.f5734f = false;
        this.f5735g = 0;
        this.f5736h = 0;
        this.f5737i = 0;
        this.f5738j = 15;
        this.f5739k = 0;
        this.f5740l = 0;
        this.f5741m = 0;
        int i = f5725w;
        this.f5742n = i;
        this.f5746r = f5724v;
        this.f5748t = i;
    }

    /* renamed from: e */
    public final void m4451e(boolean z, boolean z2) {
        int i = this.f5743o;
        SpannableStringBuilder spannableStringBuilder = this.f5730b;
        if (i != -1) {
            if (!z) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f5743o, spannableStringBuilder.length(), 33);
                this.f5743o = -1;
            }
        } else if (z) {
            this.f5743o = spannableStringBuilder.length();
        }
        if (this.f5744p == -1) {
            if (z2) {
                this.f5744p = spannableStringBuilder.length();
            }
        } else {
            if (z2) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f5744p, spannableStringBuilder.length(), 33);
            this.f5744p = -1;
        }
    }

    /* renamed from: f */
    public final void m4452f(int i, int i2) {
        int i3 = this.f5745q;
        SpannableStringBuilder spannableStringBuilder = this.f5730b;
        if (i3 != -1 && this.f5746r != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f5746r), this.f5745q, spannableStringBuilder.length(), 33);
        }
        if (i != f5724v) {
            this.f5745q = spannableStringBuilder.length();
            this.f5746r = i;
        }
        if (this.f5747s != -1 && this.f5748t != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f5748t), this.f5747s, spannableStringBuilder.length(), 33);
        }
        if (i2 != f5725w) {
            this.f5747s = spannableStringBuilder.length();
            this.f5748t = i2;
        }
    }
}
