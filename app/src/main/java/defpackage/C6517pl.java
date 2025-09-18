package defpackage;

import android.os.Bundle;

/* renamed from: pl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6517pl {
    public static final long f = AbstractC6316oh1.a(C1478Ss0.b(1900, 0).f);
    public static final long g = AbstractC6316oh1.a(C1478Ss0.b(2100, 11).f);
    public Long c;
    public int d;
    public long a = f;
    public long b = g;
    public InterfaceC6708ql e = new C6796rD(Long.MIN_VALUE);

    public final C6898rl a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
        C1478Ss0 c1478Ss0C = C1478Ss0.c(this.a);
        C1478Ss0 c1478Ss0C2 = C1478Ss0.c(this.b);
        InterfaceC6708ql interfaceC6708ql = (InterfaceC6708ql) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = this.c;
        return new C6898rl(c1478Ss0C, c1478Ss0C2, interfaceC6708ql, l == null ? null : C1478Ss0.c(l.longValue()), this.d);
    }
}
