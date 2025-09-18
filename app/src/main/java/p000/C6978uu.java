package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.core.DeviceIdRepository;
import com.p019vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import kotlin.jvm.functions.Function2;

/* renamed from: uu */
/* loaded from: classes2.dex */
public final class C6978uu extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public Logger f44004a;

    /* renamed from: b */
    public StringBuilder f44005b;

    /* renamed from: c */
    public int f44006c;

    /* renamed from: d */
    public final /* synthetic */ CollectDeviceIdErrorsUseCase f44007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6978uu(CollectDeviceIdErrorsUseCase collectDeviceIdErrorsUseCase, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f44007d = collectDeviceIdErrorsUseCase;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C6978uu(this.f44007d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6978uu) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        StringBuilder sbM26238o;
        Logger logger;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f44006c;
        CollectDeviceIdErrorsUseCase collectDeviceIdErrorsUseCase = this.f44007d;
        if (i == 0) {
            RQ1.m7017d(obj);
            Logger logger2 = collectDeviceIdErrorsUseCase.f20362c;
            sbM26238o = AbstractC7222ym.m26238o("Device ID = ");
            DeviceIdRepository deviceIdRepository = collectDeviceIdErrorsUseCase.f20360a;
            this.f44004a = logger2;
            this.f44005b = sbM26238o;
            this.f44006c = 1;
            Object deviceId = deviceIdRepository.getDeviceId(this);
            if (deviceId == enumC0817Mz) {
                return enumC0817Mz;
            }
            logger = logger2;
            obj = deviceId;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.m7017d(obj);
                return C8313Tf1.f11463a;
            }
            sbM26238o = this.f44005b;
            logger = this.f44004a;
            RQ1.m7017d(obj);
        }
        sbM26238o.append((String) obj);
        Logger.DefaultImpls.info$default(logger, sbM26238o.toString(), null, 2, null);
        InterfaceC6622pW errorsFlow = collectDeviceIdErrorsUseCase.f20360a.getErrorsFlow();
        C6915tu c6915tu = new C6915tu(0, collectDeviceIdErrorsUseCase);
        this.f44004a = null;
        this.f44005b = null;
        this.f44006c = 2;
        if (errorsFlow.collect(c6915tu, this) == enumC0817Mz) {
            return enumC0817Mz;
        }
        return C8313Tf1.f11463a;
    }
}
