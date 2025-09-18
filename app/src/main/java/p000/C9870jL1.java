package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: jL1 */
/* loaded from: classes.dex */
public final class C9870jL1 extends AbstractC9608hI1 {

    /* renamed from: d */
    public String f35072d;

    /* renamed from: e */
    public String f35073e;

    /* renamed from: f */
    public int f35074f;

    /* renamed from: g */
    public String f35075g;

    /* renamed from: h */
    public String f35076h;

    /* renamed from: i */
    public long f35077i;

    /* renamed from: j */
    public long f35078j;

    /* renamed from: k */
    public List f35079k;

    /* renamed from: l */
    public String f35080l;

    /* renamed from: m */
    public int f35081m;

    /* renamed from: n */
    public String f35082n;

    /* renamed from: o */
    public String f35083o;

    /* renamed from: p */
    public String f35084p;

    /* renamed from: q */
    public long f35085q;

    /* renamed from: r */
    public String f35086r;

    /* renamed from: C1 */
    public final String m22025C1() {
        m18793A1();
        Preconditions.checkNotNull(this.f35072d);
        return this.f35072d;
    }

    /* renamed from: D1 */
    public final String m22026D1() {
        mo7681v1();
        m18793A1();
        Preconditions.checkNotNull(this.f35082n);
        return this.f35082n;
    }

    /* renamed from: E1 */
    public final void m22027E1() {
        String str;
        mo7681v1();
        if (m7851t1().m7995E1().m9048i(TQ1.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            m7852u1().m22870J2().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            mo6070n().f8385n.m24555d("Analytics Storage consent is not granted");
            str = null;
        }
        mo6070n().f8385n.m24555d("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f35084p = str;
        this.f35085q = ((C9110dP1) this.f11615b).f26044n.currentTimeMillis();
    }

    @Override // p000.AbstractC9608hI1
    /* renamed from: z1 */
    public final boolean mo2654z1() {
        return true;
    }
}
