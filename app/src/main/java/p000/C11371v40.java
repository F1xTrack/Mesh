package p000;

import java.util.ArrayDeque;

/* renamed from: v40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11371v40 implements InterfaceC11215ts0 {

    /* renamed from: b */
    public static final C11864yy0 f44134b = C11864yy0.m26288a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a */
    public final C9196e41 f44135a;

    public C11371v40(C9196e41 c9196e41) {
        this.f44135a = c9196e41;
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo8529a(Object obj) {
        return true;
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: b */
    public final C11087ss0 mo8530b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        E10 e10 = (E10) obj;
        C9196e41 c9196e41 = this.f44135a;
        if (c9196e41 != null) {
            C10831qs0 c10831qs0M24078a = C10831qs0.m24078a(e10);
            C10703ps0 c10703ps0 = (C10703ps0) c9196e41.f26532b;
            Object objM26534a = c10703ps0.m26534a(c10831qs0M24078a);
            ArrayDeque arrayDeque = C10831qs0.f41219b;
            synchronized (arrayDeque) {
                arrayDeque.offer(c10831qs0M24078a);
            }
            E10 e102 = (E10) objM26534a;
            if (e102 == null) {
                c10703ps0.m26537f(C10831qs0.m24078a(e10), e10);
            } else {
                e10 = e102;
            }
        }
        return new C11087ss0(e10, new H40(e10, ((Integer) c7830Jy0.m4482c(f44134b)).intValue()));
    }
}
