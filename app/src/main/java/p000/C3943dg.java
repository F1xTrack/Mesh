package p000;

import com.p019vk.push.core.ipc.BaseIPCClient;
import com.p019vk.push.core.ipc.IpcRequest;
import kotlin.jvm.functions.Function2;

/* renamed from: dg */
/* loaded from: classes2.dex */
public final class C3943dg extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public Function2 f26192a;

    /* renamed from: b */
    public Function2 f26193b;

    /* renamed from: c */
    public InterfaceC6497nZ f26194c;

    /* renamed from: d */
    public InterfaceC6497nZ f26195d;

    /* renamed from: e */
    public int f26196e;

    /* renamed from: f */
    public final /* synthetic */ BaseIPCClient f26197f;

    /* renamed from: g */
    public final /* synthetic */ Function2 f26198g;

    /* renamed from: h */
    public final /* synthetic */ String f26199h;

    /* renamed from: i */
    public final /* synthetic */ Function2 f26200i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC6497nZ f26201j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC6497nZ f26202k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3943dg(BaseIPCClient baseIPCClient, Function2 function2, String str, Function2 function22, InterfaceC6497nZ interfaceC6497nZ, InterfaceC6497nZ interfaceC6497nZ2, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f26197f = baseIPCClient;
        this.f26198g = function2;
        this.f26199h = str;
        this.f26200i = function22;
        this.f26201j = interfaceC6497nZ;
        this.f26202k = interfaceC6497nZ2;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C3943dg(this.f26197f, this.f26198g, this.f26199h, this.f26200i, this.f26201j, this.f26202k, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3943dg) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f26196e;
        if (i == 0) {
            RQ1.m7017d(obj);
            BaseIPCClient baseIPCClient = this.f26197f;
            Function2 function2 = this.f26198g;
            this.f26192a = function2;
            String str = this.f26199h;
            Function2 function22 = this.f26200i;
            this.f26193b = function22;
            InterfaceC6497nZ interfaceC6497nZ = this.f26201j;
            this.f26194c = interfaceC6497nZ;
            InterfaceC6497nZ interfaceC6497nZ2 = this.f26202k;
            this.f26195d = interfaceC6497nZ2;
            this.f26196e = 1;
            C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(this));
            c0619Jp.m4439s();
            BaseIPCClient.access$executeWhenConnected(baseIPCClient, new IpcRequest.AsyncRequest(function2, str, function22, baseIPCClient.getLogger(), interfaceC6497nZ, c0619Jp), interfaceC6497nZ2);
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
