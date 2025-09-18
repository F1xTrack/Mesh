package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: jL1 */
/* loaded from: classes.dex */
public final class C5295jL1 extends AbstractC4128hI1 {
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public long i;
    public long j;
    public List k;
    public String l;
    public int m;
    public String n;
    public String o;
    public String p;
    public long q;
    public String r;

    public final String C1() {
        A1();
        Preconditions.checkNotNull(this.d);
        return this.d;
    }

    public final String D1() {
        v1();
        A1();
        Preconditions.checkNotNull(this.n);
        return this.n;
    }

    public final void E1() {
        String str;
        v1();
        if (t1().E1().i(TQ1.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            u1().J2().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            n().n.d("Analytics Storage consent is not granted");
            str = null;
        }
        n().n.d("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.p = str;
        this.q = ((C3386dP1) this.b).n.currentTimeMillis();
    }

    @Override // defpackage.AbstractC4128hI1
    public final boolean z1() {
        return true;
    }
}
