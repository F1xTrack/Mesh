package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public final class LN0 extends P81 {
    public final /* synthetic */ MN0 e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LN0(String str, MN0 mn0, long j) {
        super(str, true);
        this.e = mn0;
        this.f = j;
    }

    @Override // defpackage.P81
    public final long a() {
        C0604Hm1 c0604Hm1;
        MN0 mn0 = this.e;
        synchronized (mn0) {
            try {
                if (!mn0.t && (c0604Hm1 = mn0.j) != null) {
                    int i = mn0.v ? mn0.u : -1;
                    mn0.u++;
                    mn0.v = true;
                    if (i != -1) {
                        StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                        sb.append(mn0.c);
                        sb.append("ms (after ");
                        mn0.c(new SocketTimeoutException(AbstractC1705Vq.j(sb, i - 1, " successful ping/pongs)")), null);
                    } else {
                        try {
                            C0674Ik c0674Ik = C0674Ik.d;
                            O90.f(c0674Ik, "payload");
                            c0604Hm1.a(c0674Ik, 9);
                        } catch (IOException e) {
                            mn0.c(e, null);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f;
    }
}
