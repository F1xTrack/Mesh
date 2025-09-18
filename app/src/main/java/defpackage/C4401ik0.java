package defpackage;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ik0 */
/* loaded from: classes.dex */
public final class C4401ik0 {
    public static final C4211hk0 c = new C4211hk0(Object.class, Object.class, Object.class, Collections.singletonList(new PD(Object.class, Object.class, Object.class, Collections.emptyList(), new TE(6), null)), null);
    public final C7925x8 a = new C7925x8();
    public final AtomicReference b = new AtomicReference();

    public final void a(Class cls, Class cls2, Class cls3, C4211hk0 c4211hk0) {
        synchronized (this.a) {
            C7925x8 c7925x8 = this.a;
            C4047gt0 c4047gt0 = new C4047gt0(cls, cls2, cls3);
            if (c4211hk0 == null) {
                c4211hk0 = c;
            }
            c7925x8.put(c4047gt0, c4211hk0);
        }
    }
}
