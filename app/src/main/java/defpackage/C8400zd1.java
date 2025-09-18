package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8400zd1 extends AbstractC6876rd1 {
    public final /* synthetic */ int a;

    public /* synthetic */ C8400zd1(int i) {
        this.a = i;
    }

    @Override // defpackage.AbstractC6876rd1
    public final Object a(C8206yc0 c8206yc0) {
        switch (this.a) {
            case 0:
                return new AtomicBoolean(c8206yc0.W());
            default:
                try {
                    return new AtomicInteger(c8206yc0.b0());
                } catch (NumberFormatException e) {
                    throw new C6682qc0(e);
                }
        }
    }

    @Override // defpackage.AbstractC6876rd1
    public final void b(C0807Kc0 c0807Kc0, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                c0807Kc0.e0(((AtomicBoolean) obj).get());
                break;
            default:
                c0807Kc0.X(((AtomicInteger) obj).get());
                break;
        }
    }
}
