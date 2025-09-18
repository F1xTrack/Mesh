package p000;

import android.os.Bundle;

/* renamed from: pl */
/* loaded from: classes.dex */
public final class C6637pl {

    /* renamed from: f */
    public static final long f40358f = AbstractC10554oh1.m23520a(C8286Ss0.m7456b(1900, 0).f11021f);

    /* renamed from: g */
    public static final long f40359g = AbstractC10554oh1.m23520a(C8286Ss0.m7456b(2100, 11).f11021f);

    /* renamed from: c */
    public Long f40362c;

    /* renamed from: d */
    public int f40363d;

    /* renamed from: a */
    public long f40360a = f40358f;

    /* renamed from: b */
    public long f40361b = f40359g;

    /* renamed from: e */
    public InterfaceC6700ql f40364e = new C6729rD(Long.MIN_VALUE);

    /* renamed from: a */
    public final C6763rl m23860a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f40364e);
        C8286Ss0 c8286Ss0M7457c = C8286Ss0.m7457c(this.f40360a);
        C8286Ss0 c8286Ss0M7457c2 = C8286Ss0.m7457c(this.f40361b);
        InterfaceC6700ql interfaceC6700ql = (InterfaceC6700ql) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = this.f40362c;
        return new C6763rl(c8286Ss0M7457c, c8286Ss0M7457c2, interfaceC6700ql, l == null ? null : C8286Ss0.m7457c(l.longValue()), this.f40363d);
    }
}
