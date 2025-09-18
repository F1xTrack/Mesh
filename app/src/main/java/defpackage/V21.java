package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class V21 {
    public String a;
    public Uri b;
    public boolean c;
    public boolean d;
    public String i;
    public C6045nH j;
    public C6030nC m;
    public boolean n;
    public C1375Rk o;
    public C01 q;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int k = 3;
    public final HashMap l = new HashMap();
    public C6511pj p = new C6511pj();

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof V21)) {
            return false;
        }
        V21 v21 = (V21) obj;
        return O90.a(this.b, v21.b) && this.f == v21.f && this.g == v21.g && this.e == v21.e && O90.a(this.i, v21.i) && O90.a(this.m, v21.m) && this.h == v21.h && O90.a(this.o, v21.o) && O90.a(this.q, v21.q) && O90.a(null, null) && this.k == v21.k && this.c == v21.c && this.d == v21.d && O90.a(this.p, v21.p);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), this.i, this.j, this.l);
    }
}
