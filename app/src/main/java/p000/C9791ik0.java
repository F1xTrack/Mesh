package p000;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ik0 */
/* loaded from: classes.dex */
public final class C9791ik0 {

    /* renamed from: c */
    public static final C9663hk0 f29435c = new C9663hk0(Object.class, Object.class, Object.class, Collections.singletonList(new C0958PD(Object.class, Object.class, Object.class, Collections.emptyList(), new C1210TE(6), null)), null);

    /* renamed from: a */
    public final C7119x8 f29436a = new C7119x8();

    /* renamed from: b */
    public final AtomicReference f29437b = new AtomicReference();

    /* renamed from: a */
    public final void m19073a(Class cls, Class cls2, Class cls3, C9663hk0 c9663hk0) {
        synchronized (this.f29436a) {
            C7119x8 c7119x8 = this.f29436a;
            C9553gt0 c9553gt0 = new C9553gt0(cls, cls2, cls3);
            if (c9663hk0 == null) {
                c9663hk0 = f29435c;
            }
            c7119x8.put(c9553gt0, c9663hk0);
        }
    }
}
