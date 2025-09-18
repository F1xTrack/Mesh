package p000;

import android.net.Uri;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class V21 {

    /* renamed from: a */
    public String f12314a;

    /* renamed from: b */
    public Uri f12315b;

    /* renamed from: c */
    public boolean f12316c;

    /* renamed from: d */
    public boolean f12317d;

    /* renamed from: i */
    public String f12322i;

    /* renamed from: j */
    public C6479nH f12323j;

    /* renamed from: m */
    public C6474nC f12326m;

    /* renamed from: n */
    public boolean f12327n;

    /* renamed from: o */
    public C1116Rk f12328o;

    /* renamed from: q */
    public C01 f12330q;

    /* renamed from: e */
    public int f12318e = -1;

    /* renamed from: f */
    public int f12319f = -1;

    /* renamed from: g */
    public int f12320g = -1;

    /* renamed from: h */
    public int f12321h = -1;

    /* renamed from: k */
    public int f12324k = 3;

    /* renamed from: l */
    public final HashMap f12325l = new HashMap();

    /* renamed from: p */
    public C6635pj f12329p = new C6635pj();

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof V21)) {
            return false;
        }
        V21 v21 = (V21) obj;
        return O90.m5963a(this.f12315b, v21.f12315b) && this.f12319f == v21.f12319f && this.f12320g == v21.f12320g && this.f12318e == v21.f12318e && O90.m5963a(this.f12322i, v21.f12322i) && O90.m5963a(this.f12326m, v21.f12326m) && this.f12321h == v21.f12321h && O90.m5963a(this.f12328o, v21.f12328o) && O90.m5963a(this.f12330q, v21.f12330q) && O90.m5963a(null, null) && this.f12324k == v21.f12324k && this.f12316c == v21.f12316c && this.f12317d == v21.f12317d && O90.m5963a(this.f12329p, v21.f12329p);
    }

    public final int hashCode() {
        return Objects.hash(this.f12314a, this.f12315b, Integer.valueOf(this.f12318e), Integer.valueOf(this.f12319f), Integer.valueOf(this.f12320g), this.f12322i, this.f12323j, this.f12325l);
    }
}
