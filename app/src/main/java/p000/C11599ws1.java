package p000;

import com.p019vk.push.common.clientid.ClientId;
import org.json.JSONException;

/* renamed from: ws1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11599ws1 extends AbstractC9714i71 implements InterfaceC6497nZ {

    /* renamed from: a */
    public int f45151a;

    /* renamed from: b */
    public final /* synthetic */ C8071Oo1 f45152b;

    /* renamed from: c */
    public final /* synthetic */ String f45153c;

    /* renamed from: d */
    public final /* synthetic */ ClientId f45154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11599ws1(C8071Oo1 c8071Oo1, String str, ClientId clientId, InterfaceC1382Vy interfaceC1382Vy) {
        super(1, interfaceC1382Vy);
        this.f45152b = c8071Oo1;
        this.f45153c = str;
        this.f45154d = clientId;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(InterfaceC1382Vy interfaceC1382Vy) {
        return new C11599ws1(this.f45152b, this.f45153c, this.f45154d, interfaceC1382Vy);
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        return ((C11599ws1) create((InterfaceC1382Vy) obj)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objM10536d;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f45151a;
        if (i == 0) {
            RQ1.m7017d(obj);
            C8907bs1 c8907bs1 = (C8907bs1) this.f45152b.f8627a;
            this.f45151a = 1;
            objM10536d = c8907bs1.m10536d(this.f45153c, this.f45154d, this);
            if (objM10536d == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            objM10536d = ((PS0) obj).f9075a;
        }
        return new PS0(objM10536d);
    }
}
