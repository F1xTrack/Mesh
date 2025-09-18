package p000;

import java.io.IOException;

/* renamed from: lA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10103lA0 extends IOException {

    /* renamed from: a */
    public final boolean f36930a;

    /* renamed from: b */
    public final int f36931b;

    public C10103lA0(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.f36930a = z;
        this.f36931b = i;
    }

    /* renamed from: a */
    public static C10103lA0 m22366a(RuntimeException runtimeException, String str) {
        return new C10103lA0(str, runtimeException, true, 1);
    }

    /* renamed from: b */
    public static C10103lA0 m22367b(String str, Exception exc) {
        return new C10103lA0(str, exc, true, 4);
    }

    /* renamed from: c */
    public static C10103lA0 m22368c(String str) {
        return new C10103lA0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.f36930a);
        sb.append(", dataType=");
        return AbstractC1374Vq.m8591j(sb, this.f36931b, "}");
    }
}
