package p000;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public final class LN0 extends P81 {

    /* renamed from: e */
    public final /* synthetic */ MN0 f6617e;

    /* renamed from: f */
    public final /* synthetic */ long f6618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LN0(String str, MN0 mn0, long j) {
        super(str, true);
        this.f6617e = mn0;
        this.f6618f = j;
    }

    @Override // p000.P81
    /* renamed from: a */
    public final long mo4621a() {
        C7703Hm1 c7703Hm1;
        MN0 mn0 = this.f6617e;
        synchronized (mn0) {
            try {
                if (!mn0.f7138t && (c7703Hm1 = mn0.f7128j) != null) {
                    int i = mn0.f7140v ? mn0.f7139u : -1;
                    mn0.f7139u++;
                    mn0.f7140v = true;
                    if (i != -1) {
                        StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                        sb.append(mn0.f7121c);
                        sb.append("ms (after ");
                        mn0.m5351c(new SocketTimeoutException(AbstractC1374Vq.m8591j(sb, i - 1, " successful ping/pongs)")), null);
                    } else {
                        try {
                            C0551Ik c0551Ik = C0551Ik.f5116d;
                            O90.m5968f(c0551Ik, "payload");
                            c7703Hm1.m3588a(c0551Ik, 9);
                        } catch (IOException e) {
                            mn0.m5351c(e, null);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f6618f;
    }
}
