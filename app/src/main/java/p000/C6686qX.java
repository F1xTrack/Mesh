package p000;

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
public final class C6686qX {

    /* renamed from: A */
    public final int f40951A;

    /* renamed from: B */
    public final int f40952B;

    /* renamed from: C */
    public final int f40953C;

    /* renamed from: D */
    public final int f40954D;

    /* renamed from: E */
    public final int f40955E;

    /* renamed from: F */
    public final int f40956F;

    /* renamed from: G */
    public final int f40957G;

    /* renamed from: H */
    public final int f40958H;

    /* renamed from: I */
    public final int f40959I;

    /* renamed from: J */
    public final int f40960J;

    /* renamed from: K */
    public int f40961K;

    /* renamed from: a */
    public final String f40962a;

    /* renamed from: b */
    public final String f40963b;

    /* renamed from: c */
    public final P70 f40964c;

    /* renamed from: d */
    public final String f40965d;

    /* renamed from: e */
    public final int f40966e;

    /* renamed from: f */
    public final int f40967f;

    /* renamed from: g */
    public final int f40968g;

    /* renamed from: h */
    public final int f40969h;

    /* renamed from: i */
    public final int f40970i;

    /* renamed from: j */
    public final String f40971j;

    /* renamed from: k */
    public final C7660Gr0 f40972k;

    /* renamed from: l */
    public final String f40973l;

    /* renamed from: m */
    public final String f40974m;

    /* renamed from: n */
    public final int f40975n;

    /* renamed from: o */
    public final int f40976o;

    /* renamed from: p */
    public final List f40977p;

    /* renamed from: q */
    public final C0589JL f40978q;

    /* renamed from: r */
    public final long f40979r;

    /* renamed from: s */
    public final int f40980s;

    /* renamed from: t */
    public final int f40981t;

    /* renamed from: u */
    public final float f40982u;

    /* renamed from: v */
    public final int f40983v;

    /* renamed from: w */
    public final float f40984w;

    /* renamed from: x */
    public final byte[] f40985x;

    /* renamed from: y */
    public final int f40986y;

    /* renamed from: z */
    public final C0372Fu f40987z;

    static {
        new C6686qX(new C6623pX());
        AbstractC7485Dh1.m1797L(0);
        AbstractC7485Dh1.m1797L(1);
        AbstractC7485Dh1.m1797L(2);
        AbstractC7485Dh1.m1797L(3);
        AbstractC7485Dh1.m1797L(4);
        AbstractC7222ym.m26243t(5, 6, 7, 8, 9);
        AbstractC7222ym.m26243t(10, 11, 12, 13, 14);
        AbstractC7222ym.m26243t(15, 16, 17, 18, 19);
        AbstractC7222ym.m26243t(20, 21, 22, 23, 24);
        AbstractC7222ym.m26243t(25, 26, 27, 28, 29);
        AbstractC7485Dh1.m1797L(30);
        AbstractC7485Dh1.m1797L(31);
        AbstractC7485Dh1.m1797L(32);
    }

    public C6686qX(C6623pX c6623pX) throws MissingResourceException {
        boolean z;
        String str;
        this.f40962a = c6623pX.f40150a;
        String strM1803R = AbstractC7485Dh1.m1803R(c6623pX.f40153d);
        this.f40965d = strM1803R;
        if (c6623pX.f40152c.isEmpty() && c6623pX.f40151b != null) {
            this.f40964c = P70.m6229B(new C8366Ug0(strM1803R, c6623pX.f40151b));
            this.f40963b = c6623pX.f40151b;
        } else if (!c6623pX.f40152c.isEmpty() && c6623pX.f40151b == null) {
            P70 p70 = c6623pX.f40152c;
            this.f40964c = p70;
            Iterator it = p70.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C8366Ug0) p70.get(0)).f11974b;
                    break;
                }
                C8366Ug0 c8366Ug0 = (C8366Ug0) it.next();
                if (TextUtils.equals(c8366Ug0.f11973a, strM1803R)) {
                    str = c8366Ug0.f11974b;
                    break;
                }
            }
            this.f40963b = str;
        } else if (c6623pX.f40152c.isEmpty() && c6623pX.f40151b == null) {
            z = true;
            YN1.m9281f(z);
            this.f40964c = c6623pX.f40152c;
            this.f40963b = c6623pX.f40151b;
        } else {
            for (int i = 0; i < c6623pX.f40152c.size(); i++) {
                if (((C8366Ug0) c6623pX.f40152c.get(i)).f11974b.equals(c6623pX.f40151b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            YN1.m9281f(z);
            this.f40964c = c6623pX.f40152c;
            this.f40963b = c6623pX.f40151b;
        }
        this.f40966e = c6623pX.f40154e;
        this.f40967f = c6623pX.f40155f;
        int i2 = c6623pX.f40156g;
        this.f40968g = i2;
        int i3 = c6623pX.f40157h;
        this.f40969h = i3;
        this.f40970i = i3 != -1 ? i3 : i2;
        this.f40971j = c6623pX.f40158i;
        this.f40972k = c6623pX.f40159j;
        this.f40973l = c6623pX.f40160k;
        this.f40974m = c6623pX.f40161l;
        this.f40975n = c6623pX.f40162m;
        this.f40976o = c6623pX.f40163n;
        List list = c6623pX.f40164o;
        this.f40977p = list == null ? Collections.emptyList() : list;
        C0589JL c0589jl = c6623pX.f40165p;
        this.f40978q = c0589jl;
        this.f40979r = c6623pX.f40166q;
        this.f40980s = c6623pX.f40167r;
        this.f40981t = c6623pX.f40168s;
        this.f40982u = c6623pX.f40169t;
        int i4 = c6623pX.f40170u;
        this.f40983v = i4 == -1 ? 0 : i4;
        float f = c6623pX.f40171v;
        this.f40984w = f == -1.0f ? 1.0f : f;
        this.f40985x = c6623pX.f40172w;
        this.f40986y = c6623pX.f40173x;
        this.f40987z = c6623pX.f40174y;
        this.f40951A = c6623pX.f40175z;
        this.f40952B = c6623pX.f40141A;
        this.f40953C = c6623pX.f40142B;
        int i5 = c6623pX.f40143C;
        this.f40954D = i5 == -1 ? 0 : i5;
        int i6 = c6623pX.f40144D;
        this.f40955E = i6 != -1 ? i6 : 0;
        this.f40956F = c6623pX.f40145E;
        this.f40957G = c6623pX.f40146F;
        this.f40958H = c6623pX.f40147G;
        this.f40959I = c6623pX.f40148H;
        int i7 = c6623pX.f40149I;
        if (i7 != 0 || c0589jl == null) {
            this.f40960J = i7;
        } else {
            this.f40960J = 1;
        }
    }

    /* renamed from: d */
    public static String m24019d(C6686qX c6686qX) {
        String str;
        int i;
        if (c6686qX == null) {
            return "null";
        }
        StringBuilder sbM26238o = AbstractC7222ym.m26238o("id=");
        sbM26238o.append(c6686qX.f40962a);
        sbM26238o.append(", mimeType=");
        sbM26238o.append(c6686qX.f40974m);
        String str2 = c6686qX.f40973l;
        if (str2 != null) {
            sbM26238o.append(", container=");
            sbM26238o.append(str2);
        }
        int i2 = c6686qX.f40970i;
        if (i2 != -1) {
            sbM26238o.append(", bitrate=");
            sbM26238o.append(i2);
        }
        String str3 = c6686qX.f40971j;
        if (str3 != null) {
            sbM26238o.append(", codecs=");
            sbM26238o.append(str3);
        }
        C0589JL c0589jl = c6686qX.f40978q;
        if (c0589jl != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i3 = 0; i3 < c0589jl.f5488d; i3++) {
                UUID uuid = c0589jl.f5485a[i3].f4899b;
                if (uuid.equals(AbstractC0865Nk.f7978b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC0865Nk.f7979c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC0865Nk.f7981e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC0865Nk.f7980d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC0865Nk.f7977a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbM26238o.append(", drm=[");
            new C6333ky(String.valueOf(','), 1).m22321a(sbM26238o, linkedHashSet.iterator());
            sbM26238o.append(']');
        }
        int i4 = c6686qX.f40980s;
        if (i4 != -1 && (i = c6686qX.f40981t) != -1) {
            sbM26238o.append(", res=");
            sbM26238o.append(i4);
            sbM26238o.append("x");
            sbM26238o.append(i);
        }
        C0372Fu c0372Fu = c6686qX.f40987z;
        if (c0372Fu != null) {
            int i5 = c0372Fu.f3469f;
            int i6 = c0372Fu.f3468e;
            if ((i6 != -1 && i5 != -1) || c0372Fu.m2822d()) {
                sbM26238o.append(", color=");
                if (c0372Fu.m2822d()) {
                    String strM2817b = C0372Fu.m2817b(c0372Fu.f3464a);
                    String strM2816a = C0372Fu.m2816a(c0372Fu.f3465b);
                    String strM2818c = C0372Fu.m2818c(c0372Fu.f3466c);
                    Locale locale = Locale.US;
                    str = strM2817b + "/" + strM2816a + "/" + strM2818c;
                } else {
                    str = "NA/NA/NA";
                }
                sbM26238o.append(str + "/" + ((i6 == -1 || i5 == -1) ? "NA/NA" : i6 + "/" + i5));
            }
        }
        float f = c6686qX.f40982u;
        if (f != -1.0f) {
            sbM26238o.append(", fps=");
            sbM26238o.append(f);
        }
        int i7 = c6686qX.f40951A;
        if (i7 != -1) {
            sbM26238o.append(", channels=");
            sbM26238o.append(i7);
        }
        int i8 = c6686qX.f40952B;
        if (i8 != -1) {
            sbM26238o.append(", sample_rate=");
            sbM26238o.append(i8);
        }
        String str4 = c6686qX.f40965d;
        if (str4 != null) {
            sbM26238o.append(", language=");
            sbM26238o.append(str4);
        }
        P70 p70 = c6686qX.f40964c;
        if (!p70.isEmpty()) {
            sbM26238o.append(", labels=[");
            new C6333ky(String.valueOf(','), 1).m22321a(sbM26238o, p70.iterator());
            sbM26238o.append("]");
        }
        int i9 = c6686qX.f40966e;
        if (i9 != 0) {
            sbM26238o.append(", selectionFlags=[");
            C6333ky c6333ky = new C6333ky(String.valueOf(','), 1);
            int i10 = AbstractC7485Dh1.f2166a;
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
            c6333ky.m22321a(sbM26238o, arrayList.iterator());
            sbM26238o.append("]");
        }
        int i11 = c6686qX.f40967f;
        if (i11 != 0) {
            sbM26238o.append(", roleFlags=[");
            C6333ky c6333ky2 = new C6333ky(String.valueOf(','), 1);
            int i12 = AbstractC7485Dh1.f2166a;
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
            c6333ky2.m22321a(sbM26238o, arrayList2.iterator());
            sbM26238o.append("]");
        }
        return sbM26238o.toString();
    }

    /* renamed from: a */
    public final C6623pX m24020a() {
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40150a = this.f40962a;
        c6623pX.f40151b = this.f40963b;
        c6623pX.f40152c = this.f40964c;
        c6623pX.f40153d = this.f40965d;
        c6623pX.f40154e = this.f40966e;
        c6623pX.f40155f = this.f40967f;
        c6623pX.f40156g = this.f40968g;
        c6623pX.f40157h = this.f40969h;
        c6623pX.f40158i = this.f40971j;
        c6623pX.f40159j = this.f40972k;
        c6623pX.f40160k = this.f40973l;
        c6623pX.f40161l = this.f40974m;
        c6623pX.f40162m = this.f40975n;
        c6623pX.f40163n = this.f40976o;
        c6623pX.f40164o = this.f40977p;
        c6623pX.f40165p = this.f40978q;
        c6623pX.f40166q = this.f40979r;
        c6623pX.f40167r = this.f40980s;
        c6623pX.f40168s = this.f40981t;
        c6623pX.f40169t = this.f40982u;
        c6623pX.f40170u = this.f40983v;
        c6623pX.f40171v = this.f40984w;
        c6623pX.f40172w = this.f40985x;
        c6623pX.f40173x = this.f40986y;
        c6623pX.f40174y = this.f40987z;
        c6623pX.f40175z = this.f40951A;
        c6623pX.f40141A = this.f40952B;
        c6623pX.f40142B = this.f40953C;
        c6623pX.f40143C = this.f40954D;
        c6623pX.f40144D = this.f40955E;
        c6623pX.f40145E = this.f40956F;
        c6623pX.f40146F = this.f40957G;
        c6623pX.f40147G = this.f40958H;
        c6623pX.f40148H = this.f40959I;
        c6623pX.f40149I = this.f40960J;
        return c6623pX;
    }

    /* renamed from: b */
    public final int m24021b() {
        int i;
        int i2 = this.f40980s;
        if (i2 == -1 || (i = this.f40981t) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: c */
    public final boolean m24022c(C6686qX c6686qX) {
        List list = this.f40977p;
        if (list.size() != c6686qX.f40977p.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) c6686qX.f40977p.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final C6686qX m24023e(C6686qX c6686qX) {
        String str;
        float f;
        String str2;
        int i;
        int i2;
        if (this == c6686qX) {
            return this;
        }
        int iM9165h = AbstractC8544Xr0.m9165h(this.f40974m);
        String str3 = c6686qX.f40962a;
        String str4 = c6686qX.f40963b;
        if (str4 == null) {
            str4 = this.f40963b;
        }
        P70 p70 = c6686qX.f40964c;
        if (p70.isEmpty()) {
            p70 = this.f40964c;
        }
        if ((iM9165h != 3 && iM9165h != 1) || (str = c6686qX.f40965d) == null) {
            str = this.f40965d;
        }
        int i3 = this.f40968g;
        if (i3 == -1) {
            i3 = c6686qX.f40968g;
        }
        int i4 = this.f40969h;
        if (i4 == -1) {
            i4 = c6686qX.f40969h;
        }
        String str5 = this.f40971j;
        if (str5 == null) {
            String strM1835t = AbstractC7485Dh1.m1835t(iM9165h, c6686qX.f40971j);
            if (AbstractC7485Dh1.m1817c0(strM1835t).length == 1) {
                str5 = strM1835t;
            }
        }
        C7660Gr0 c7660Gr0M3182b = c6686qX.f40972k;
        C7660Gr0 c7660Gr0 = this.f40972k;
        if (c7660Gr0 != null) {
            c7660Gr0M3182b = c7660Gr0.m3182b(c7660Gr0M3182b);
        }
        float f2 = this.f40982u;
        if (f2 == -1.0f && iM9165h == 2) {
            f2 = c6686qX.f40982u;
        }
        int i5 = this.f40966e | c6686qX.f40966e;
        int i6 = this.f40967f | c6686qX.f40967f;
        ArrayList arrayList = new ArrayList();
        C0589JL c0589jl = c6686qX.f40978q;
        if (c0589jl != null) {
            C0526IL[] c0526ilArr = c0589jl.f5485a;
            int length = c0526ilArr.length;
            f = f2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = length;
                C0526IL c0526il = c0526ilArr[i7];
                C0526IL[] c0526ilArr2 = c0526ilArr;
                if (c0526il.f4902e != null) {
                    arrayList.add(c0526il);
                }
                i7++;
                length = i8;
                c0526ilArr = c0526ilArr2;
            }
            str2 = c0589jl.f5487c;
        } else {
            f = f2;
            str2 = null;
        }
        C0589JL c0589jl2 = this.f40978q;
        if (c0589jl2 != null) {
            if (str2 == null) {
                str2 = c0589jl2.f5487c;
            }
            int size = arrayList.size();
            C0526IL[] c0526ilArr3 = c0589jl2.f5485a;
            int length2 = c0526ilArr3.length;
            int i9 = 0;
            while (true) {
                String str6 = str2;
                if (i9 >= length2) {
                    break;
                }
                C0526IL c0526il2 = c0526ilArr3[i9];
                C0526IL[] c0526ilArr4 = c0526ilArr3;
                if (c0526il2.f4902e != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            i = size;
                            i2 = length2;
                            arrayList.add(c0526il2);
                            break;
                        }
                        i = size;
                        i2 = length2;
                        if (((C0526IL) arrayList.get(i10)).f4899b.equals(c0526il2.f4899b)) {
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
                c0526ilArr3 = c0526ilArr4;
                length2 = i2;
                size = i;
            }
        }
        C0589JL c0589jl3 = arrayList.isEmpty() ? null : new C0589JL(str2, arrayList);
        C6623pX c6623pXM24020a = m24020a();
        c6623pXM24020a.f40150a = str3;
        c6623pXM24020a.f40151b = str4;
        c6623pXM24020a.f40152c = P70.m6234u(p70);
        c6623pXM24020a.f40153d = str;
        c6623pXM24020a.f40154e = i5;
        c6623pXM24020a.f40155f = i6;
        c6623pXM24020a.f40156g = i3;
        c6623pXM24020a.f40157h = i4;
        c6623pXM24020a.f40158i = str5;
        c6623pXM24020a.f40159j = c7660Gr0M3182b;
        c6623pXM24020a.f40165p = c0589jl3;
        c6623pXM24020a.f40169t = f;
        c6623pXM24020a.f40147G = c6686qX.f40958H;
        c6623pXM24020a.f40148H = c6686qX.f40959I;
        return new C6686qX(c6623pXM24020a);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C6686qX.class != obj.getClass()) {
            return false;
        }
        C6686qX c6686qX = (C6686qX) obj;
        int i2 = this.f40961K;
        if (i2 == 0 || (i = c6686qX.f40961K) == 0 || i2 == i) {
            return this.f40966e == c6686qX.f40966e && this.f40967f == c6686qX.f40967f && this.f40968g == c6686qX.f40968g && this.f40969h == c6686qX.f40969h && this.f40975n == c6686qX.f40975n && this.f40979r == c6686qX.f40979r && this.f40980s == c6686qX.f40980s && this.f40981t == c6686qX.f40981t && this.f40983v == c6686qX.f40983v && this.f40986y == c6686qX.f40986y && this.f40951A == c6686qX.f40951A && this.f40952B == c6686qX.f40952B && this.f40953C == c6686qX.f40953C && this.f40954D == c6686qX.f40954D && this.f40955E == c6686qX.f40955E && this.f40956F == c6686qX.f40956F && this.f40958H == c6686qX.f40958H && this.f40959I == c6686qX.f40959I && this.f40960J == c6686qX.f40960J && Float.compare(this.f40982u, c6686qX.f40982u) == 0 && Float.compare(this.f40984w, c6686qX.f40984w) == 0 && Objects.equals(this.f40962a, c6686qX.f40962a) && Objects.equals(this.f40963b, c6686qX.f40963b) && this.f40964c.equals(c6686qX.f40964c) && Objects.equals(this.f40971j, c6686qX.f40971j) && Objects.equals(this.f40973l, c6686qX.f40973l) && Objects.equals(this.f40974m, c6686qX.f40974m) && Objects.equals(this.f40965d, c6686qX.f40965d) && Arrays.equals(this.f40985x, c6686qX.f40985x) && Objects.equals(this.f40972k, c6686qX.f40972k) && Objects.equals(this.f40987z, c6686qX.f40987z) && Objects.equals(this.f40978q, c6686qX.f40978q) && m24022c(c6686qX);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f40961K == 0) {
            String str = this.f40962a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f40963b;
            int iHashCode2 = (this.f40964c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f40965d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f40966e) * 31) + this.f40967f) * 31) + this.f40968g) * 31) + this.f40969h) * 31;
            String str4 = this.f40971j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C7660Gr0 c7660Gr0 = this.f40972k;
            int iHashCode5 = (iHashCode4 + (c7660Gr0 == null ? 0 : c7660Gr0.hashCode())) * 961;
            String str5 = this.f40973l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f40974m;
            this.f40961K = ((((((((((((((((((((Float.floatToIntBits(this.f40984w) + ((((Float.floatToIntBits(this.f40982u) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f40975n) * 31) + ((int) this.f40979r)) * 31) + this.f40980s) * 31) + this.f40981t) * 31)) * 31) + this.f40983v) * 31)) * 31) + this.f40986y) * 31) + this.f40951A) * 31) + this.f40952B) * 31) + this.f40953C) * 31) + this.f40954D) * 31) + this.f40955E) * 31) + this.f40956F) * 31) + this.f40958H) * 31) + this.f40959I) * 31) + this.f40960J;
        }
        return this.f40961K;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f40962a);
        sb.append(", ");
        sb.append(this.f40963b);
        sb.append(", ");
        sb.append(this.f40973l);
        sb.append(", ");
        sb.append(this.f40974m);
        sb.append(", ");
        sb.append(this.f40971j);
        sb.append(", ");
        sb.append(this.f40970i);
        sb.append(", ");
        sb.append(this.f40965d);
        sb.append(", [");
        sb.append(this.f40980s);
        sb.append(", ");
        sb.append(this.f40981t);
        sb.append(", ");
        sb.append(this.f40982u);
        sb.append(", ");
        sb.append(this.f40987z);
        sb.append("], [");
        sb.append(this.f40951A);
        sb.append(", ");
        return AbstractC1374Vq.m8591j(sb, this.f40952B, "])");
    }
}
