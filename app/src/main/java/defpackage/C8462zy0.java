package defpackage;

import java.util.NoSuchElementException;

/* renamed from: zy0 */
/* loaded from: classes.dex */
public final class C8462zy0 {
    public final Object a;

    public C8462zy0() {
        this.a = null;
    }

    public final Object a() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.a != null;
    }

    public C8462zy0(Object obj) {
        if (obj != null) {
            this.a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
