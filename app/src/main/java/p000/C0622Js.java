package p000;

import java.lang.reflect.Method;

/* renamed from: Js */
/* loaded from: classes.dex */
public final class C0622Js {

    /* renamed from: a */
    public final int f5760a;

    /* renamed from: b */
    public final Method f5761b;

    public C0622Js(int i, Method method) throws SecurityException {
        this.f5760a = i;
        this.f5761b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0622Js)) {
            return false;
        }
        C0622Js c0622Js = (C0622Js) obj;
        return this.f5760a == c0622Js.f5760a && this.f5761b.getName().equals(c0622Js.f5761b.getName());
    }

    public final int hashCode() {
        return this.f5761b.getName().hashCode() + (this.f5760a * 31);
    }
}
