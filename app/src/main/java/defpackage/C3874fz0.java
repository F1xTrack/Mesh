package defpackage;

import android.view.Surface;
import java.util.List;
import java.util.Objects;

/* renamed from: fz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3874fz0 {
    public final Object a;

    public C3874fz0(Surface surface) {
        this.a = new C3683ez0(surface);
    }

    public void a(Surface surface) {
        if (e() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!f()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    public void b() {
        ((C3683ez0) this.a).f = true;
    }

    public Object c() {
        return null;
    }

    public String d() {
        return ((C3683ez0) this.a).e;
    }

    public Surface e() {
        List list = ((C3683ez0) this.a).a;
        if (list.size() == 0) {
            return null;
        }
        return (Surface) list.get(0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3874fz0)) {
            return false;
        }
        return Objects.equals(this.a, ((C3874fz0) obj).a);
    }

    public boolean f() {
        return ((C3683ez0) this.a).f;
    }

    public void g(long j) {
        ((C3683ez0) this.a).g = j;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public void i(String str) {
        ((C3683ez0) this.a).e = str;
    }

    public C3874fz0(Object obj) {
        this.a = obj;
    }

    public void h(int i) {
    }

    public void j(long j) {
    }
}
