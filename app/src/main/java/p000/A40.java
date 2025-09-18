package p000;

import com.p019vk.push.common.Logger;

/* loaded from: classes2.dex */
public final class A40 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f58e;

    /* renamed from: f */
    public final /* synthetic */ Logger f59f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A40(Logger logger, int i) {
        super(0);
        this.f58e = i;
        this.f59f = logger;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f58e) {
            case 0:
                return this.f59f.createLogger("HttpLogging");
            default:
                return this.f59f.createLogger("MessagesIPC");
        }
    }
}
