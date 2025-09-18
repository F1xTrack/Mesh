package defpackage;

import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.ipc.IpcRequest;
import kotlin.jvm.functions.Function2;

/* renamed from: fg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3816fg extends AbstractC4286i71 implements Function2 {
    public Function2 a;
    public InterfaceC6099nZ b;
    public InterfaceC6099nZ c;
    public int d;
    public final /* synthetic */ BaseIPCClient e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ InterfaceC6099nZ h;
    public final /* synthetic */ InterfaceC6099nZ i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3816fg(BaseIPCClient baseIPCClient, Function2 function2, String str, InterfaceC6099nZ interfaceC6099nZ, InterfaceC6099nZ interfaceC6099nZ2, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.e = baseIPCClient;
        this.f = function2;
        this.g = str;
        this.h = interfaceC6099nZ;
        this.i = interfaceC6099nZ2;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C3816fg(this.e, this.f, this.g, this.h, this.i, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3816fg) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.d;
        if (i == 0) {
            RQ1.d(obj);
            BaseIPCClient baseIPCClient = this.e;
            Function2 function2 = this.f;
            this.a = function2;
            String str = this.g;
            InterfaceC6099nZ interfaceC6099nZ = this.h;
            this.b = interfaceC6099nZ;
            InterfaceC6099nZ interfaceC6099nZ2 = this.i;
            this.c = interfaceC6099nZ2;
            this.d = 1;
            C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(this));
            c0767Jp.s();
            BaseIPCClient.access$executeWhenConnected(baseIPCClient, new IpcRequest.SimpleRequest(function2, str, baseIPCClient.getLogger(), interfaceC6099nZ, c0767Jp), interfaceC6099nZ2);
            obj = c0767Jp.r();
            if (obj == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        return obj;
    }
}
