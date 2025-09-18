package p000;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class O51 {

    /* renamed from: a */
    public final Method f8222a;

    /* renamed from: b */
    public final ThreadMode f8223b;

    /* renamed from: c */
    public final Class f8224c;

    /* renamed from: d */
    public final int f8225d;

    /* renamed from: e */
    public final boolean f8226e;

    /* renamed from: f */
    public String f8227f;

    public O51(Method method, Class cls, ThreadMode threadMode, int i, boolean z) {
        this.f8222a = method;
        this.f8223b = threadMode;
        this.f8224c = cls;
        this.f8225d = i;
        this.f8226e = z;
    }

    /* renamed from: a */
    public final synchronized void m5953a() {
        if (this.f8227f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f8222a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f8222a.getName());
            sb.append('(');
            sb.append(this.f8224c.getName());
            this.f8227f = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O51)) {
            return false;
        }
        m5953a();
        O51 o51 = (O51) obj;
        o51.m5953a();
        return this.f8227f.equals(o51.f8227f);
    }

    public final int hashCode() {
        return this.f8222a.hashCode();
    }
}
