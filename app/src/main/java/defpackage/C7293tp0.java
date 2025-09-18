package defpackage;

import android.net.Uri;

/* renamed from: tp0 */
/* loaded from: classes.dex */
public final class C7293tp0 {
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public byte[] g;
    public Integer h;
    public Uri i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Boolean m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Integer q;
    public Integer r;
    public Integer s;
    public CharSequence t;
    public CharSequence u;
    public CharSequence v;
    public CharSequence w;
    public CharSequence x;
    public Integer y;

    public final void a(int i, byte[] bArr) {
        if (this.g != null) {
            Integer numValueOf = Integer.valueOf(i);
            int i2 = AbstractC0277Dh1.a;
            if (!numValueOf.equals(3) && AbstractC0277Dh1.a(this.h, 3)) {
                return;
            }
        }
        this.g = (byte[]) bArr.clone();
        this.h = Integer.valueOf(i);
    }

    public final void b(CharSequence charSequence) {
        this.w = charSequence;
    }

    public final void c(Integer num) {
        this.p = num;
    }

    public final void d(Integer num) {
        this.o = num;
    }

    public final void e(Integer num) {
        this.n = num;
    }
}
