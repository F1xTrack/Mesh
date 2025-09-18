package defpackage;

import java.util.ArrayDeque;

/* renamed from: v40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7534v40 implements InterfaceC7302ts0 {
    public static final C8272yy0 b = C8272yy0.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final C3513e41 a;

    public C7534v40(C3513e41 c3513e41) {
        this.a = c3513e41;
    }

    @Override // defpackage.InterfaceC7302ts0
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.InterfaceC7302ts0
    public final C7111ss0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        E10 e10 = (E10) obj;
        C3513e41 c3513e41 = this.a;
        if (c3513e41 != null) {
            C6730qs0 c6730qs0A = C6730qs0.a(e10);
            C6539ps0 c6539ps0 = (C6539ps0) c3513e41.b;
            Object objA = c6539ps0.a(c6730qs0A);
            ArrayDeque arrayDeque = C6730qs0.b;
            synchronized (arrayDeque) {
                arrayDeque.offer(c6730qs0A);
            }
            E10 e102 = (E10) objA;
            if (e102 == null) {
                c6539ps0.f(C6730qs0.a(e10), e10);
            } else {
                e10 = e102;
            }
        }
        return new C7111ss0(e10, new H40(e10, ((Integer) c0795Jy0.c(b)).intValue()));
    }
}
