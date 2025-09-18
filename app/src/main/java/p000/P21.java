package p000;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class P21 {

    /* renamed from: a */
    public boolean f8792a;

    /* renamed from: e */
    public float f8796e;

    /* renamed from: l */
    public int f8803l;

    /* renamed from: b */
    public int f8793b = -1;

    /* renamed from: c */
    public int f8794c = -1;

    /* renamed from: d */
    public int f8795d = 0;

    /* renamed from: f */
    public boolean f8797f = false;

    /* renamed from: g */
    public final float[] f8798g = new float[9];

    /* renamed from: h */
    public final float[] f8799h = new float[9];

    /* renamed from: i */
    public C0072B8[] f8800i = new C0072B8[16];

    /* renamed from: j */
    public int f8801j = 0;

    /* renamed from: k */
    public int f8802k = 0;

    public P21(int i) {
        this.f8803l = i;
    }

    /* renamed from: a */
    public final void m6208a(C0072B8 c0072b8) {
        int i = 0;
        while (true) {
            int i2 = this.f8801j;
            if (i >= i2) {
                C0072B8[] c0072b8Arr = this.f8800i;
                if (i2 >= c0072b8Arr.length) {
                    this.f8800i = (C0072B8[]) Arrays.copyOf(c0072b8Arr, c0072b8Arr.length * 2);
                }
                C0072B8[] c0072b8Arr2 = this.f8800i;
                int i3 = this.f8801j;
                c0072b8Arr2[i3] = c0072b8;
                this.f8801j = i3 + 1;
                return;
            }
            if (this.f8800i[i] == c0072b8) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public final void m6209b(C0072B8 c0072b8) {
        int i = this.f8801j;
        int i2 = 0;
        while (i2 < i) {
            if (this.f8800i[i2] == c0072b8) {
                while (i2 < i - 1) {
                    C0072B8[] c0072b8Arr = this.f8800i;
                    int i3 = i2 + 1;
                    c0072b8Arr[i2] = c0072b8Arr[i3];
                    i2 = i3;
                }
                this.f8801j--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void m6210c() {
        this.f8803l = 5;
        this.f8795d = 0;
        this.f8793b = -1;
        this.f8794c = -1;
        this.f8796e = 0.0f;
        this.f8797f = false;
        int i = this.f8801j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8800i[i2] = null;
        }
        this.f8801j = 0;
        this.f8802k = 0;
        this.f8792a = false;
        Arrays.fill(this.f8799h, 0.0f);
    }

    /* renamed from: d */
    public final void m6211d(C0072B8 c0072b8) {
        int i = this.f8801j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8800i[i2].mo525h(c0072b8, false);
        }
        this.f8801j = 0;
    }

    public final String toString() {
        return "" + this.f8793b;
    }
}
