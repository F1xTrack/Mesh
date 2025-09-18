package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class P21 {
    public boolean a;
    public float e;
    public int l;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public B8[] i = new B8[16];
    public int j = 0;
    public int k = 0;

    public P21(int i) {
        this.l = i;
    }

    public final void a(B8 b8) {
        int i = 0;
        while (true) {
            int i2 = this.j;
            if (i >= i2) {
                B8[] b8Arr = this.i;
                if (i2 >= b8Arr.length) {
                    this.i = (B8[]) Arrays.copyOf(b8Arr, b8Arr.length * 2);
                }
                B8[] b8Arr2 = this.i;
                int i3 = this.j;
                b8Arr2[i3] = b8;
                this.j = i3 + 1;
                return;
            }
            if (this.i[i] == b8) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(B8 b8) {
        int i = this.j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == b8) {
                while (i2 < i - 1) {
                    B8[] b8Arr = this.i;
                    int i3 = i2 + 1;
                    b8Arr[i2] = b8Arr[i3];
                    i2 = i3;
                }
                this.j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.l = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.j = 0;
        this.k = 0;
        this.a = false;
        Arrays.fill(this.h, 0.0f);
    }

    public final void d(B8 b8) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(b8, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
