package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* renamed from: Sn1 */
/* loaded from: classes.dex */
public class C1464Sn1 {
    public static final C1698Vn1 b;
    public final C1698Vn1 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 30 ? new C0919Ln1() : i >= 29 ? new C0841Kn1() : new C0763Jn1()).b().a.a().a.b().a.c();
    }

    public C1464Sn1(C1698Vn1 c1698Vn1) {
        this.a = c1698Vn1;
    }

    public C1698Vn1 a() {
        return this.a;
    }

    public C1698Vn1 b() {
        return this.a;
    }

    public C1698Vn1 c() {
        return this.a;
    }

    public IK e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1464Sn1)) {
            return false;
        }
        C1464Sn1 c1464Sn1 = (C1464Sn1) obj;
        return n() == c1464Sn1.n() && m() == c1464Sn1.m() && Objects.equals(j(), c1464Sn1.j()) && Objects.equals(h(), c1464Sn1.h()) && Objects.equals(e(), c1464Sn1.e());
    }

    public J80 f(int i) {
        return J80.e;
    }

    public J80 g() {
        return j();
    }

    public J80 h() {
        return J80.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public J80 i() {
        return j();
    }

    public J80 j() {
        return J80.e;
    }

    public J80 k() {
        return j();
    }

    public C1698Vn1 l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void p(J80[] j80Arr) {
    }

    public void q(C1698Vn1 c1698Vn1) {
    }

    public void r(J80 j80) {
    }
}
