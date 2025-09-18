package defpackage;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class O51 {
    public final Method a;
    public final ThreadMode b;
    public final Class c;
    public final int d;
    public final boolean e;
    public String f;

    public O51(Method method, Class cls, ThreadMode threadMode, int i, boolean z) {
        this.a = method;
        this.b = threadMode;
        this.c = cls;
        this.d = i;
        this.e = z;
    }

    public final synchronized void a() {
        if (this.f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.a.getName());
            sb.append('(');
            sb.append(this.c.getName());
            this.f = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O51)) {
            return false;
        }
        a();
        O51 o51 = (O51) obj;
        o51.a();
        return this.f.equals(o51.f);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
