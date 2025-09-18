package defpackage;

import com.vk.push.core.feature.FeatureManagerImpl;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class RS extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ FeatureManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RS(FeatureManagerImpl featureManagerImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = featureManagerImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new RS(this.b, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RS) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        FeatureManagerImpl featureManagerImpl = this.b;
        if (i == 0) {
            RQ1.d(obj);
            this.a = 1;
            if (FeatureManagerImpl.m76access$saveUpdateIntervalIoAF18A(featureManagerImpl, this) == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.d(obj);
                return C1518Tf1.a;
            }
            RQ1.d(obj);
            ((PS0) obj).getClass();
        }
        this.a = 2;
        if (FeatureManagerImpl.access$saveIssueKeysBlacklist(featureManagerImpl, this) == enumC1030Mz) {
            return enumC1030Mz;
        }
        return C1518Tf1.a;
    }
}
