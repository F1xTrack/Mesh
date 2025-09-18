package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.UUID;

/* renamed from: qX */
/* loaded from: classes.dex */
public final class C6666qX {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public int K;
    public final String a;
    public final String b;
    public final P70 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final C0540Gr0 k;
    public final String l;
    public final String m;
    public final int n;
    public final int o;
    public final List p;
    public final JL q;
    public final long r;
    public final int s;
    public final int t;
    public final float u;
    public final int v;
    public final float w;
    public final byte[] x;
    public final int y;
    public final C0470Fu z;

    static {
        new C6666qX(new C6475pX());
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
        AbstractC0277Dh1.L(2);
        AbstractC0277Dh1.L(3);
        AbstractC0277Dh1.L(4);
        AbstractC8235ym.t(5, 6, 7, 8, 9);
        AbstractC8235ym.t(10, 11, 12, 13, 14);
        AbstractC8235ym.t(15, 16, 17, 18, 19);
        AbstractC8235ym.t(20, 21, 22, 23, 24);
        AbstractC8235ym.t(25, 26, 27, 28, 29);
        AbstractC0277Dh1.L(30);
        AbstractC0277Dh1.L(31);
        AbstractC0277Dh1.L(32);
    }

    public C6666qX(C6475pX c6475pX) throws MissingResourceException {
        boolean z;
        String str;
        this.a = c6475pX.a;
        String strR = AbstractC0277Dh1.R(c6475pX.d);
        this.d = strR;
        if (c6475pX.c.isEmpty() && c6475pX.b != null) {
            this.c = P70.B(new C1598Ug0(strR, c6475pX.b));
            this.b = c6475pX.b;
        } else if (!c6475pX.c.isEmpty() && c6475pX.b == null) {
            P70 p70 = c6475pX.c;
            this.c = p70;
            Iterator it = p70.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C1598Ug0) p70.get(0)).b;
                    break;
                }
                C1598Ug0 c1598Ug0 = (C1598Ug0) it.next();
                if (TextUtils.equals(c1598Ug0.a, strR)) {
                    str = c1598Ug0.b;
                    break;
                }
            }
            this.b = str;
        } else if (c6475pX.c.isEmpty() && c6475pX.b == null) {
            z = true;
            YN1.f(z);
            this.c = c6475pX.c;
            this.b = c6475pX.b;
        } else {
            for (int i = 0; i < c6475pX.c.size(); i++) {
                if (((C1598Ug0) c6475pX.c.get(i)).b.equals(c6475pX.b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            YN1.f(z);
            this.c = c6475pX.c;
            this.b = c6475pX.b;
        }
        this.e = c6475pX.e;
        this.f = c6475pX.f;
        int i2 = c6475pX.g;
        this.g = i2;
        int i3 = c6475pX.h;
        this.h = i3;
        this.i = i3 != -1 ? i3 : i2;
        this.j = c6475pX.i;
        this.k = c6475pX.j;
        this.l = c6475pX.k;
        this.m = c6475pX.l;
        this.n = c6475pX.m;
        this.o = c6475pX.n;
        List list = c6475pX.o;
        this.p = list == null ? Collections.emptyList() : list;
        JL jl = c6475pX.p;
        this.q = jl;
        this.r = c6475pX.q;
        this.s = c6475pX.r;
        this.t = c6475pX.s;
        this.u = c6475pX.t;
        int i4 = c6475pX.u;
        this.v = i4 == -1 ? 0 : i4;
        float f = c6475pX.v;
        this.w = f == -1.0f ? 1.0f : f;
        this.x = c6475pX.w;
        this.y = c6475pX.x;
        this.z = c6475pX.y;
        this.A = c6475pX.z;
        this.B = c6475pX.A;
        this.C = c6475pX.B;
        int i5 = c6475pX.C;
        this.D = i5 == -1 ? 0 : i5;
        int i6 = c6475pX.D;
        this.E = i6 != -1 ? i6 : 0;
        this.F = c6475pX.E;
        this.G = c6475pX.F;
        this.H = c6475pX.G;
        this.I = c6475pX.H;
        int i7 = c6475pX.I;
        if (i7 != 0 || jl == null) {
            this.J = i7;
        } else {
            this.J = 1;
        }
    }

    public static String d(C6666qX c6666qX) {
        String str;
        int i;
        if (c6666qX == null) {
            return "null";
        }
        StringBuilder sbO = AbstractC8235ym.o("id=");
        sbO.append(c6666qX.a);
        sbO.append(", mimeType=");
        sbO.append(c6666qX.m);
        String str2 = c6666qX.l;
        if (str2 != null) {
            sbO.append(", container=");
            sbO.append(str2);
        }
        int i2 = c6666qX.i;
        if (i2 != -1) {
            sbO.append(", bitrate=");
            sbO.append(i2);
        }
        String str3 = c6666qX.j;
        if (str3 != null) {
            sbO.append(", codecs=");
            sbO.append(str3);
        }
        JL jl = c6666qX.q;
        if (jl != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i3 = 0; i3 < jl.d; i3++) {
                UUID uuid = jl.a[i3].b;
                if (uuid.equals(AbstractC1063Nk.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC1063Nk.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC1063Nk.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC1063Nk.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC1063Nk.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbO.append(", drm=[");
            new C5601ky(String.valueOf(','), 1).a(sbO, linkedHashSet.iterator());
            sbO.append(']');
        }
        int i4 = c6666qX.s;
        if (i4 != -1 && (i = c6666qX.t) != -1) {
            sbO.append(", res=");
            sbO.append(i4);
            sbO.append("x");
            sbO.append(i);
        }
        C0470Fu c0470Fu = c6666qX.z;
        if (c0470Fu != null) {
            int i5 = c0470Fu.f;
            int i6 = c0470Fu.e;
            if ((i6 != -1 && i5 != -1) || c0470Fu.d()) {
                sbO.append(", color=");
                if (c0470Fu.d()) {
                    String strB = C0470Fu.b(c0470Fu.a);
                    String strA = C0470Fu.a(c0470Fu.b);
                    String strC = C0470Fu.c(c0470Fu.c);
                    Locale locale = Locale.US;
                    str = strB + "/" + strA + "/" + strC;
                } else {
                    str = "NA/NA/NA";
                }
                sbO.append(str + "/" + ((i6 == -1 || i5 == -1) ? "NA/NA" : i6 + "/" + i5));
            }
        }
        float f = c6666qX.u;
        if (f != -1.0f) {
            sbO.append(", fps=");
            sbO.append(f);
        }
        int i7 = c6666qX.A;
        if (i7 != -1) {
            sbO.append(", channels=");
            sbO.append(i7);
        }
        int i8 = c6666qX.B;
        if (i8 != -1) {
            sbO.append(", sample_rate=");
            sbO.append(i8);
        }
        String str4 = c6666qX.d;
        if (str4 != null) {
            sbO.append(", language=");
            sbO.append(str4);
        }
        P70 p70 = c6666qX.c;
        if (!p70.isEmpty()) {
            sbO.append(", labels=[");
            new C5601ky(String.valueOf(','), 1).a(sbO, p70.iterator());
            sbO.append("]");
        }
        int i9 = c6666qX.e;
        if (i9 != 0) {
            sbO.append(", selectionFlags=[");
            C5601ky c5601ky = new C5601ky(String.valueOf(','), 1);
            int i10 = AbstractC0277Dh1.a;
            ArrayList arrayList = new ArrayList();
            if ((i9 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i9 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i9 & 2) != 0) {
                arrayList.add("forced");
            }
            c5601ky.a(sbO, arrayList.iterator());
            sbO.append("]");
        }
        int i11 = c6666qX.f;
        if (i11 != 0) {
            sbO.append(", roleFlags=[");
            C5601ky c5601ky2 = new C5601ky(String.valueOf(','), 1);
            int i12 = AbstractC0277Dh1.a;
            ArrayList arrayList2 = new ArrayList();
            if ((1 & i11) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i11 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i11 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i11 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i11 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i11 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i11 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i11 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i11 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            c5601ky2.a(sbO, arrayList2.iterator());
            sbO.append("]");
        }
        return sbO.toString();
    }

    public final C6475pX a() {
        C6475pX c6475pX = new C6475pX();
        c6475pX.a = this.a;
        c6475pX.b = this.b;
        c6475pX.c = this.c;
        c6475pX.d = this.d;
        c6475pX.e = this.e;
        c6475pX.f = this.f;
        c6475pX.g = this.g;
        c6475pX.h = this.h;
        c6475pX.i = this.j;
        c6475pX.j = this.k;
        c6475pX.k = this.l;
        c6475pX.l = this.m;
        c6475pX.m = this.n;
        c6475pX.n = this.o;
        c6475pX.o = this.p;
        c6475pX.p = this.q;
        c6475pX.q = this.r;
        c6475pX.r = this.s;
        c6475pX.s = this.t;
        c6475pX.t = this.u;
        c6475pX.u = this.v;
        c6475pX.v = this.w;
        c6475pX.w = this.x;
        c6475pX.x = this.y;
        c6475pX.y = this.z;
        c6475pX.z = this.A;
        c6475pX.A = this.B;
        c6475pX.B = this.C;
        c6475pX.C = this.D;
        c6475pX.D = this.E;
        c6475pX.E = this.F;
        c6475pX.F = this.G;
        c6475pX.G = this.H;
        c6475pX.H = this.I;
        c6475pX.I = this.J;
        return c6475pX;
    }

    public final int b() {
        int i;
        int i2 = this.s;
        if (i2 == -1 || (i = this.t) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(C6666qX c6666qX) {
        List list = this.p;
        if (list.size() != c6666qX.p.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) c6666qX.p.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final C6666qX e(C6666qX c6666qX) {
        String str;
        float f;
        String str2;
        int i;
        int i2;
        if (this == c6666qX) {
            return this;
        }
        int iH = AbstractC1865Xr0.h(this.m);
        String str3 = c6666qX.a;
        String str4 = c6666qX.b;
        if (str4 == null) {
            str4 = this.b;
        }
        P70 p70 = c6666qX.c;
        if (p70.isEmpty()) {
            p70 = this.c;
        }
        if ((iH != 3 && iH != 1) || (str = c6666qX.d) == null) {
            str = this.d;
        }
        int i3 = this.g;
        if (i3 == -1) {
            i3 = c6666qX.g;
        }
        int i4 = this.h;
        if (i4 == -1) {
            i4 = c6666qX.h;
        }
        String str5 = this.j;
        if (str5 == null) {
            String strT = AbstractC0277Dh1.t(iH, c6666qX.j);
            if (AbstractC0277Dh1.c0(strT).length == 1) {
                str5 = strT;
            }
        }
        C0540Gr0 c0540Gr0B = c6666qX.k;
        C0540Gr0 c0540Gr0 = this.k;
        if (c0540Gr0 != null) {
            c0540Gr0B = c0540Gr0.b(c0540Gr0B);
        }
        float f2 = this.u;
        if (f2 == -1.0f && iH == 2) {
            f2 = c6666qX.u;
        }
        int i5 = this.e | c6666qX.e;
        int i6 = this.f | c6666qX.f;
        ArrayList arrayList = new ArrayList();
        JL jl = c6666qX.q;
        if (jl != null) {
            IL[] ilArr = jl.a;
            int length = ilArr.length;
            f = f2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = length;
                IL il = ilArr[i7];
                IL[] ilArr2 = ilArr;
                if (il.e != null) {
                    arrayList.add(il);
                }
                i7++;
                length = i8;
                ilArr = ilArr2;
            }
            str2 = jl.c;
        } else {
            f = f2;
            str2 = null;
        }
        JL jl2 = this.q;
        if (jl2 != null) {
            if (str2 == null) {
                str2 = jl2.c;
            }
            int size = arrayList.size();
            IL[] ilArr3 = jl2.a;
            int length2 = ilArr3.length;
            int i9 = 0;
            while (true) {
                String str6 = str2;
                if (i9 >= length2) {
                    break;
                }
                IL il2 = ilArr3[i9];
                IL[] ilArr4 = ilArr3;
                if (il2.e != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            i = size;
                            i2 = length2;
                            arrayList.add(il2);
                            break;
                        }
                        i = size;
                        i2 = length2;
                        if (((IL) arrayList.get(i10)).b.equals(il2.b)) {
                            break;
                        }
                        i10++;
                        length2 = i2;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = length2;
                }
                i9++;
                str2 = str6;
                ilArr3 = ilArr4;
                length2 = i2;
                size = i;
            }
        }
        JL jl3 = arrayList.isEmpty() ? null : new JL(str2, arrayList);
        C6475pX c6475pXA = a();
        c6475pXA.a = str3;
        c6475pXA.b = str4;
        c6475pXA.c = P70.u(p70);
        c6475pXA.d = str;
        c6475pXA.e = i5;
        c6475pXA.f = i6;
        c6475pXA.g = i3;
        c6475pXA.h = i4;
        c6475pXA.i = str5;
        c6475pXA.j = c0540Gr0B;
        c6475pXA.p = jl3;
        c6475pXA.t = f;
        c6475pXA.G = c6666qX.H;
        c6475pXA.H = c6666qX.I;
        return new C6666qX(c6475pXA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C6666qX.class != obj.getClass()) {
            return false;
        }
        C6666qX c6666qX = (C6666qX) obj;
        int i2 = this.K;
        if (i2 == 0 || (i = c6666qX.K) == 0 || i2 == i) {
            return this.e == c6666qX.e && this.f == c6666qX.f && this.g == c6666qX.g && this.h == c6666qX.h && this.n == c6666qX.n && this.r == c6666qX.r && this.s == c6666qX.s && this.t == c6666qX.t && this.v == c6666qX.v && this.y == c6666qX.y && this.A == c6666qX.A && this.B == c6666qX.B && this.C == c6666qX.C && this.D == c6666qX.D && this.E == c6666qX.E && this.F == c6666qX.F && this.H == c6666qX.H && this.I == c6666qX.I && this.J == c6666qX.J && Float.compare(this.u, c6666qX.u) == 0 && Float.compare(this.w, c6666qX.w) == 0 && Objects.equals(this.a, c6666qX.a) && Objects.equals(this.b, c6666qX.b) && this.c.equals(c6666qX.c) && Objects.equals(this.j, c6666qX.j) && Objects.equals(this.l, c6666qX.l) && Objects.equals(this.m, c6666qX.m) && Objects.equals(this.d, c6666qX.d) && Arrays.equals(this.x, c6666qX.x) && Objects.equals(this.k, c6666qX.k) && Objects.equals(this.z, c6666qX.z) && Objects.equals(this.q, c6666qX.q) && c(c6666qX);
        }
        return false;
    }

    public final int hashCode() {
        if (this.K == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            String str4 = this.j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C0540Gr0 c0540Gr0 = this.k;
            int iHashCode5 = (iHashCode4 + (c0540Gr0 == null ? 0 : c0540Gr0.hashCode())) * 961;
            String str5 = this.l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.m;
            this.K = ((((((((((((((((((((Float.floatToIntBits(this.w) + ((((Float.floatToIntBits(this.u) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.n) * 31) + ((int) this.r)) * 31) + this.s) * 31) + this.t) * 31)) * 31) + this.v) * 31)) * 31) + this.y) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.H) * 31) + this.I) * 31) + this.J;
        }
        return this.K;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.s);
        sb.append(", ");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.z);
        sb.append("], [");
        sb.append(this.A);
        sb.append(", ");
        return AbstractC1705Vq.j(sb, this.B, "])");
    }
}
