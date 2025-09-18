package defpackage;

import android.net.Uri;
import io.appmetrica.analytics.impl.C4473c9;
import java.util.Arrays;

/* renamed from: up0 */
/* loaded from: classes.dex */
public final class C7484up0 {
    public static final C7484up0 A = new C7484up0(new C7293tp0());
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final byte[] g;
    public final Integer h;
    public final Uri i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final Boolean m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final CharSequence u;
    public final CharSequence v;
    public final CharSequence w;
    public final CharSequence x;
    public final CharSequence y;
    public final Integer z;

    static {
        AbstractC8235ym.t(0, 1, 2, 3, 4);
        AbstractC8235ym.t(5, 6, 8, 9, 10);
        AbstractC8235ym.t(11, 12, 13, 14, 15);
        AbstractC8235ym.t(16, 17, 18, 19, 20);
        AbstractC8235ym.t(21, 22, 23, 24, 25);
        AbstractC8235ym.t(26, 27, 28, 29, 30);
        AbstractC0277Dh1.L(31);
        AbstractC0277Dh1.L(32);
        AbstractC0277Dh1.L(33);
        AbstractC0277Dh1.L(1000);
    }

    public C7484up0(C7293tp0 c7293tp0) {
        Boolean boolValueOf = c7293tp0.m;
        Integer numValueOf = c7293tp0.l;
        Integer numValueOf2 = c7293tp0.y;
        int i = 1;
        int i2 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case C4473c9.J /* 35 */:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                numValueOf = Integer.valueOf(i2);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = c7293tp0.a;
        this.b = c7293tp0.b;
        this.c = c7293tp0.c;
        this.d = c7293tp0.d;
        this.e = c7293tp0.e;
        this.f = c7293tp0.f;
        this.g = c7293tp0.g;
        this.h = c7293tp0.h;
        this.i = c7293tp0.i;
        this.j = c7293tp0.j;
        this.k = c7293tp0.k;
        this.l = numValueOf;
        this.m = boolValueOf;
        Integer num = c7293tp0.n;
        this.n = num;
        this.o = num;
        this.p = c7293tp0.o;
        this.q = c7293tp0.p;
        this.r = c7293tp0.q;
        this.s = c7293tp0.r;
        this.t = c7293tp0.s;
        this.u = c7293tp0.t;
        this.v = c7293tp0.u;
        this.w = c7293tp0.v;
        this.x = c7293tp0.w;
        this.y = c7293tp0.x;
        this.z = numValueOf2;
    }

    public final C7293tp0 a() {
        C7293tp0 c7293tp0 = new C7293tp0();
        c7293tp0.a = this.a;
        c7293tp0.b = this.b;
        c7293tp0.c = this.c;
        c7293tp0.d = this.d;
        c7293tp0.e = this.e;
        c7293tp0.f = this.f;
        c7293tp0.g = this.g;
        c7293tp0.h = this.h;
        c7293tp0.i = this.i;
        c7293tp0.j = this.j;
        c7293tp0.k = this.k;
        c7293tp0.l = this.l;
        c7293tp0.m = this.m;
        c7293tp0.n = this.o;
        c7293tp0.o = this.p;
        c7293tp0.p = this.q;
        c7293tp0.q = this.r;
        c7293tp0.r = this.s;
        c7293tp0.s = this.t;
        c7293tp0.t = this.u;
        c7293tp0.u = this.v;
        c7293tp0.v = this.w;
        c7293tp0.w = this.x;
        c7293tp0.x = this.y;
        c7293tp0.y = this.z;
        return c7293tp0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7484up0.class != obj.getClass()) {
            return false;
        }
        C7484up0 c7484up0 = (C7484up0) obj;
        return AbstractC0277Dh1.a(this.a, c7484up0.a) && AbstractC0277Dh1.a(this.b, c7484up0.b) && AbstractC0277Dh1.a(this.c, c7484up0.c) && AbstractC0277Dh1.a(this.d, c7484up0.d) && AbstractC0277Dh1.a(null, null) && AbstractC0277Dh1.a(this.e, c7484up0.e) && AbstractC0277Dh1.a(this.f, c7484up0.f) && AbstractC0277Dh1.a(null, null) && AbstractC0277Dh1.a(null, null) && AbstractC0277Dh1.a(null, null) && Arrays.equals(this.g, c7484up0.g) && AbstractC0277Dh1.a(this.h, c7484up0.h) && AbstractC0277Dh1.a(this.i, c7484up0.i) && AbstractC0277Dh1.a(this.j, c7484up0.j) && AbstractC0277Dh1.a(this.k, c7484up0.k) && AbstractC0277Dh1.a(this.l, c7484up0.l) && AbstractC0277Dh1.a(this.m, c7484up0.m) && AbstractC0277Dh1.a(null, null) && AbstractC0277Dh1.a(this.o, c7484up0.o) && AbstractC0277Dh1.a(this.p, c7484up0.p) && AbstractC0277Dh1.a(this.q, c7484up0.q) && AbstractC0277Dh1.a(this.r, c7484up0.r) && AbstractC0277Dh1.a(this.s, c7484up0.s) && AbstractC0277Dh1.a(this.t, c7484up0.t) && AbstractC0277Dh1.a(this.u, c7484up0.u) && AbstractC0277Dh1.a(this.v, c7484up0.v) && AbstractC0277Dh1.a(this.w, c7484up0.w) && AbstractC0277Dh1.a(null, null) && AbstractC0277Dh1.a(null, null) && AbstractC0277Dh1.a(this.x, c7484up0.x) && AbstractC0277Dh1.a(null, null) && AbstractC0277Dh1.a(this.y, c7484up0.y) && AbstractC0277Dh1.a(this.z, c7484up0.z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, null, this.e, this.f, null, null, null, Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i, this.j, this.k, this.l, this.m, null, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, null, null, this.x, null, this.y, this.z, true});
    }
}
