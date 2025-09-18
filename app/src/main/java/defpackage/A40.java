package defpackage;

import com.vk.push.common.Logger;

/* loaded from: classes2.dex */
public final class A40 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Logger f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A40(Logger logger, int i) {
        super(0);
        this.e = i;
        this.f = logger;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return this.f.createLogger("HttpLogging");
            default:
                return this.f.createLogger("MessagesIPC");
        }
    }
}
