package defpackage;

import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.ipc.IpcRequest;
import kotlin.jvm.functions.Function2;

/* renamed from: dg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3435dg extends AbstractC4286i71 implements Function2 {
    public Function2 a;
    public Function2 b;
    public InterfaceC6099nZ c;
    public InterfaceC6099nZ d;
    public int e;
    public final /* synthetic */ BaseIPCClient f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ InterfaceC6099nZ j;
    public final /* synthetic */ InterfaceC6099nZ k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3435dg(BaseIPCClient baseIPCClient, Function2 function2, String str, Function2 function22, InterfaceC6099nZ interfaceC6099nZ, InterfaceC6099nZ interfaceC6099nZ2, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.f = baseIPCClient;
        this.g = function2;
        this.h = str;
        this.i = function22;
        this.j = interfaceC6099nZ;
        this.k = interfaceC6099nZ2;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C3435dg(this.f, this.g, this.h, this.i, this.j, this.k, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3435dg) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.e;
        if (i == 0) {
            RQ1.d(obj);
            BaseIPCClient baseIPCClient = this.f;
            Function2 function2 = this.g;
            this.a = function2;
            String str = this.h;
            Function2 function22 = this.i;
            this.b = function22;
            InterfaceC6099nZ interfaceC6099nZ = this.j;
            this.c = interfaceC6099nZ;
            InterfaceC6099nZ interfaceC6099nZ2 = this.k;
            this.d = interfaceC6099nZ2;
            this.e = 1;
            C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(this));
            c0767Jp.s();
            BaseIPCClient.access$executeWhenConnected(baseIPCClient, new IpcRequest.AsyncRequest(function2, str, function22, baseIPCClient.getLogger(), interfaceC6099nZ, c0767Jp), interfaceC6099nZ2);
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
