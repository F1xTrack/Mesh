package defpackage;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class F9 {
    public final /* synthetic */ int a;
    public int b;

    public static String e(int i) {
        return "" + ((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public static int s(int i) {
        return (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public void a(int i) {
        this.b = i | this.b;
    }

    public abstract void b(XY xy);

    public abstract void d(XY xy);

    public boolean g(int i) {
        return (this.b & i) == i;
    }

    public abstract int i();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract void o(XY xy);

    public abstract void p(XY xy);

    public abstract void q(XY xy);

    public abstract C1135Oi r(XY xy);

    public String toString() {
        switch (this.a) {
            case 0:
                return e(this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ F9(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
