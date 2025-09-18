package p000;

import java.util.NoSuchElementException;

/* renamed from: zy0 */
/* loaded from: classes.dex */
public final class C11991zy0 {

    /* renamed from: a */
    public final Object f47116a;

    public C11991zy0() {
        this.f47116a = null;
    }

    /* renamed from: a */
    public final Object m26593a() {
        Object obj = this.f47116a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: b */
    public final boolean m26594b() {
        return this.f47116a != null;
    }

    public C11991zy0(Object obj) {
        if (obj != null) {
            this.f47116a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
