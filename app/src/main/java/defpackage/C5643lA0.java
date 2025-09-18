package defpackage;

import java.io.IOException;

/* renamed from: lA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5643lA0 extends IOException {
    public final boolean a;
    public final int b;

    public C5643lA0(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.a = z;
        this.b = i;
    }

    public static C5643lA0 a(RuntimeException runtimeException, String str) {
        return new C5643lA0(str, runtimeException, true, 1);
    }

    public static C5643lA0 b(String str, Exception exc) {
        return new C5643lA0(str, exc, true, 4);
    }

    public static C5643lA0 c(String str) {
        return new C5643lA0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return AbstractC1705Vq.j(sb, this.b, "}");
    }
}
