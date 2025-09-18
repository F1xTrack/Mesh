package p000;

import com.p019vk.push.core.feature.FeatureManagerImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: RS */
/* loaded from: classes2.dex */
public final class C1098RS extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f10180a;

    /* renamed from: b */
    public final /* synthetic */ FeatureManagerImpl f10181b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098RS(FeatureManagerImpl featureManagerImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f10181b = featureManagerImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C1098RS(this.f10181b, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1098RS) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f10180a;
        FeatureManagerImpl featureManagerImpl = this.f10181b;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f10180a = 1;
            if (FeatureManagerImpl.m26670access$saveUpdateIntervalIoAF18A(featureManagerImpl, this) == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.m7017d(obj);
                return C8313Tf1.f11463a;
            }
            RQ1.m7017d(obj);
            ((PS0) obj).getClass();
        }
        this.f10180a = 2;
        if (FeatureManagerImpl.access$saveIssueKeysBlacklist(featureManagerImpl, this) == enumC0817Mz) {
            return enumC0817Mz;
        }
        return C8313Tf1.f11463a;
    }
}
