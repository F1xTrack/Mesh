package p000;

import kotlin.KotlinVersion;

/* renamed from: F9 */
/* loaded from: classes.dex */
public abstract class AbstractC0325F9 {

    /* renamed from: a */
    public final /* synthetic */ int f3081a;

    /* renamed from: b */
    public int f3082b;

    /* renamed from: e */
    public static String m2496e(int i) {
        return "" + ((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    /* renamed from: s */
    public static int m2497s(int i) {
        return (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: a */
    public void m2498a(int i) {
        this.f3082b = i | this.f3082b;
    }

    /* renamed from: b */
    public abstract void mo2499b(C1482XY c1482xy);

    /* renamed from: d */
    public abstract void mo2500d(C1482XY c1482xy);

    /* renamed from: g */
    public boolean m2501g(int i) {
        return (this.f3082b & i) == i;
    }

    /* renamed from: i */
    public abstract int mo2502i();

    /* renamed from: k */
    public abstract int mo2503k();

    /* renamed from: l */
    public abstract int mo2504l();

    /* renamed from: m */
    public abstract int mo2505m();

    /* renamed from: n */
    public abstract int mo2506n();

    /* renamed from: o */
    public abstract void mo2507o(C1482XY c1482xy);

    /* renamed from: p */
    public abstract void mo2508p(C1482XY c1482xy);

    /* renamed from: q */
    public abstract void mo2509q(C1482XY c1482xy);

    /* renamed from: r */
    public abstract C0926Oi mo2510r(C1482XY c1482xy);

    public String toString() {
        switch (this.f3081a) {
            case 0:
                return m2496e(this.f3082b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ AbstractC0325F9(int i, int i2) {
        this.f3081a = i2;
        this.f3082b = i;
    }
}
