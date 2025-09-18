package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import kotlin.jvm.functions.Function2;

/* renamed from: uu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7498uu extends AbstractC4286i71 implements Function2 {
    public Logger a;
    public StringBuilder b;
    public int c;
    public final /* synthetic */ CollectDeviceIdErrorsUseCase d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7498uu(CollectDeviceIdErrorsUseCase collectDeviceIdErrorsUseCase, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.d = collectDeviceIdErrorsUseCase;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C7498uu(this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7498uu) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        StringBuilder sbO;
        Logger logger;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.c;
        CollectDeviceIdErrorsUseCase collectDeviceIdErrorsUseCase = this.d;
        if (i == 0) {
            RQ1.d(obj);
            Logger logger2 = collectDeviceIdErrorsUseCase.c;
            sbO = AbstractC8235ym.o("Device ID = ");
            DeviceIdRepository deviceIdRepository = collectDeviceIdErrorsUseCase.a;
            this.a = logger2;
            this.b = sbO;
            this.c = 1;
            Object deviceId = deviceIdRepository.getDeviceId(this);
            if (deviceId == enumC1030Mz) {
                return enumC1030Mz;
            }
            logger = logger2;
            obj = deviceId;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.d(obj);
                return C1518Tf1.a;
            }
            sbO = this.b;
            logger = this.a;
            RQ1.d(obj);
        }
        sbO.append((String) obj);
        Logger.DefaultImpls.info$default(logger, sbO.toString(), null, 2, null);
        InterfaceC6472pW errorsFlow = collectDeviceIdErrorsUseCase.a.getErrorsFlow();
        C7307tu c7307tu = new C7307tu(0, collectDeviceIdErrorsUseCase);
        this.a = null;
        this.b = null;
        this.c = 2;
        if (errorsFlow.collect(c7307tu, this) == enumC1030Mz) {
            return enumC1030Mz;
        }
        return C1518Tf1.a;
    }
}
