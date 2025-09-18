package p000;

import android.view.Surface;
import java.util.List;
import java.util.Objects;

/* renamed from: fz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9437fz0 {

    /* renamed from: a */
    public final Object f27516a;

    public C9437fz0(Surface surface) {
        this.f27516a = new C9309ez0(surface);
    }

    /* renamed from: a */
    public void mo10397a(Surface surface) {
        if (mo9439e() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!mo9440f()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    /* renamed from: b */
    public void mo9436b() {
        ((C9309ez0) this.f27516a).f26992f = true;
    }

    /* renamed from: c */
    public Object mo9437c() {
        return null;
    }

    /* renamed from: d */
    public String mo9438d() {
        return ((C9309ez0) this.f27516a).f26991e;
    }

    /* renamed from: e */
    public Surface mo9439e() {
        List list = ((C9309ez0) this.f27516a).f26987a;
        if (list.size() == 0) {
            return null;
        }
        return (Surface) list.get(0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9437fz0)) {
            return false;
        }
        return Objects.equals(this.f27516a, ((C9437fz0) obj).f27516a);
    }

    /* renamed from: f */
    public boolean mo9440f() {
        return ((C9309ez0) this.f27516a).f26992f;
    }

    /* renamed from: g */
    public void mo9441g(long j) {
        ((C9309ez0) this.f27516a).f26993g = j;
    }

    public final int hashCode() {
        return this.f27516a.hashCode();
    }

    /* renamed from: i */
    public void mo9442i(String str) {
        ((C9309ez0) this.f27516a).f26991e = str;
    }

    public C9437fz0(Object obj) {
        this.f27516a = obj;
    }

    /* renamed from: h */
    public void mo17807h(int i) {
    }

    /* renamed from: j */
    public void mo17808j(long j) {
    }
}
