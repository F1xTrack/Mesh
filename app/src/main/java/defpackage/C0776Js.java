package defpackage;

import java.lang.reflect.Method;

/* renamed from: Js, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776Js {
    public final int a;
    public final Method b;

    public C0776Js(int i, Method method) throws SecurityException {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0776Js)) {
            return false;
        }
        C0776Js c0776Js = (C0776Js) obj;
        return this.a == c0776Js.a && this.b.getName().equals(c0776Js.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
