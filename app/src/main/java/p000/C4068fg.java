package p000;

import com.p019vk.push.core.ipc.BaseIPCClient;
import com.p019vk.push.core.ipc.IpcRequest;
import kotlin.jvm.functions.Function2;

/* renamed from: fg */
/* loaded from: classes2.dex */
public final class C4068fg extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public Function2 f27313a;

    /* renamed from: b */
    public InterfaceC6497nZ f27314b;

    /* renamed from: c */
    public InterfaceC6497nZ f27315c;

    /* renamed from: d */
    public int f27316d;

    /* renamed from: e */
    public final /* synthetic */ BaseIPCClient f27317e;

    /* renamed from: f */
    public final /* synthetic */ Function2 f27318f;

    /* renamed from: g */
    public final /* synthetic */ String f27319g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC6497nZ f27320h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC6497nZ f27321i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4068fg(BaseIPCClient baseIPCClient, Function2 function2, String str, InterfaceC6497nZ interfaceC6497nZ, InterfaceC6497nZ interfaceC6497nZ2, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f27317e = baseIPCClient;
        this.f27318f = function2;
        this.f27319g = str;
        this.f27320h = interfaceC6497nZ;
        this.f27321i = interfaceC6497nZ2;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C4068fg(this.f27317e, this.f27318f, this.f27319g, this.f27320h, this.f27321i, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4068fg) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f27316d;
        if (i == 0) {
            RQ1.m7017d(obj);
            BaseIPCClient baseIPCClient = this.f27317e;
            Function2 function2 = this.f27318f;
            this.f27313a = function2;
            String str = this.f27319g;
            InterfaceC6497nZ interfaceC6497nZ = this.f27320h;
            this.f27314b = interfaceC6497nZ;
            InterfaceC6497nZ interfaceC6497nZ2 = this.f27321i;
            this.f27315c = interfaceC6497nZ2;
            this.f27316d = 1;
            C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(this));
            c0619Jp.m4439s();
            BaseIPCClient.access$executeWhenConnected(baseIPCClient, new IpcRequest.SimpleRequest(function2, str, baseIPCClient.getLogger(), interfaceC6497nZ, c0619Jp), interfaceC6497nZ2);
            obj = c0619Jp.m4438r();
            if (obj == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        return obj;
    }
}
