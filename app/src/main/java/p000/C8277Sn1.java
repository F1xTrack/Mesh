package p000;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* renamed from: Sn1 */
/* loaded from: classes.dex */
public class C8277Sn1 {

    /* renamed from: b */
    public static final C8433Vn1 f10980b;

    /* renamed from: a */
    public final C8433Vn1 f10981a;

    static {
        int i = Build.VERSION.SDK_INT;
        f10980b = (i >= 30 ? new C7913Ln1() : i >= 29 ? new C7861Kn1() : new C7809Jn1()).mo4414b().f12756a.mo6430a().f12756a.mo6139b().f12756a.mo6140c();
    }

    public C8277Sn1(C8433Vn1 c8433Vn1) {
        this.f10981a = c8433Vn1;
    }

    /* renamed from: a */
    public C8433Vn1 mo6430a() {
        return this.f10981a;
    }

    /* renamed from: b */
    public C8433Vn1 mo6139b() {
        return this.f10981a;
    }

    /* renamed from: c */
    public C8433Vn1 mo6140c() {
        return this.f10981a;
    }

    /* renamed from: e */
    public C0525IK mo6431e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8277Sn1)) {
            return false;
        }
        C8277Sn1 c8277Sn1 = (C8277Sn1) obj;
        return mo5840n() == c8277Sn1.mo5840n() && mo6142m() == c8277Sn1.mo6142m() && Objects.equals(mo5838j(), c8277Sn1.mo5838j()) && Objects.equals(mo6141h(), c8277Sn1.mo6141h()) && Objects.equals(mo6431e(), c8277Sn1.mo6431e());
    }

    /* renamed from: f */
    public J80 mo5837f(int i) {
        return J80.f5351e;
    }

    /* renamed from: g */
    public J80 mo6785g() {
        return mo5838j();
    }

    /* renamed from: h */
    public J80 mo6141h() {
        return J80.f5351e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo5840n()), Boolean.valueOf(mo6142m()), mo5838j(), mo6141h(), mo6431e());
    }

    /* renamed from: i */
    public J80 mo6786i() {
        return mo5838j();
    }

    /* renamed from: j */
    public J80 mo5838j() {
        return J80.f5351e;
    }

    /* renamed from: k */
    public J80 mo6787k() {
        return mo5838j();
    }

    /* renamed from: l */
    public C8433Vn1 mo5839l(int i, int i2, int i3, int i4) {
        return f10980b;
    }

    /* renamed from: m */
    public boolean mo6142m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo5840n() {
        return false;
    }

    /* renamed from: o */
    public boolean mo5841o(int i) {
        return true;
    }

    /* renamed from: d */
    public void mo5836d(View view) {
    }

    /* renamed from: p */
    public void mo5842p(J80[] j80Arr) {
    }

    /* renamed from: q */
    public void mo5843q(C8433Vn1 c8433Vn1) {
    }

    /* renamed from: r */
    public void mo6143r(J80 j80) {
    }
}
