package p000;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11950zd1 extends AbstractC10930rd1 {

    /* renamed from: a */
    public final /* synthetic */ int f46917a;

    public /* synthetic */ C11950zd1(int i) {
        this.f46917a = i;
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: a */
    public final Object mo480a(C11820yc0 c11820yc0) {
        switch (this.f46917a) {
            case 0:
                return new AtomicBoolean(c11820yc0.m26180W());
            default:
                try {
                    return new AtomicInteger(c11820yc0.m26182b0());
                } catch (NumberFormatException e) {
                    throw new C10799qc0(e);
                }
        }
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: b */
    public final void mo481b(C7838Kc0 c7838Kc0, Object obj) throws IOException {
        switch (this.f46917a) {
            case 0:
                c7838Kc0.m4687e0(((AtomicBoolean) obj).get());
                break;
            default:
                c7838Kc0.m4684X(((AtomicInteger) obj).get());
                break;
        }
    }
}
