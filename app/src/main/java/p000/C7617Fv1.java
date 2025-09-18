package p000;

import com.p019vk.push.common.Logger;
import kotlin.jvm.functions.Function2;

/* renamed from: Fv1 */
/* loaded from: classes2.dex */
public final class C7617Fv1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ int f3483a;

    /* renamed from: b */
    public int f3484b;

    /* renamed from: c */
    public final /* synthetic */ C8033Nv1 f3485c;

    /* renamed from: d */
    public final /* synthetic */ String f3486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7617Fv1(C8033Nv1 c8033Nv1, String str, InterfaceC1382Vy interfaceC1382Vy, int i) {
        super(2, interfaceC1382Vy);
        this.f3483a = i;
        this.f3485c = c8033Nv1;
        this.f3486d = str;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f3483a) {
            case 0:
                return new C7617Fv1(this.f3485c, this.f3486d, interfaceC1382Vy, 0);
            default:
                return new C7617Fv1(this.f3485c, this.f3486d, interfaceC1382Vy, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj2;
        switch (this.f3483a) {
            case 0:
                return new C7617Fv1(this.f3485c, this.f3486d, interfaceC1382Vy, 0).invokeSuspend(C8313Tf1.f11463a);
            default:
                return new C7617Fv1(this.f3485c, this.f3486d, interfaceC1382Vy, 1).invokeSuspend(C8313Tf1.f11463a);
        }
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Object objM7015b;
        Object objM7015b2;
        switch (this.f3483a) {
            case 0:
                EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
                int i = this.f3484b;
                C8033Nv1 c8033Nv1 = this.f3485c;
                if (i == 0) {
                    RQ1.m7017d(obj);
                    C7765Ir1 c7765Ir1 = c8033Nv1.f8131b;
                    this.f3484b = 1;
                    obj = c7765Ir1.m4050a(this);
                    if (obj == enumC0817Mz) {
                        return enumC0817Mz;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        RQ1.m7017d(obj);
                        objM7015b = ((PS0) obj).f9075a;
                        return new PS0(objM7015b);
                    }
                    RQ1.m7017d(obj);
                }
                String str = (String) obj;
                if (str != null) {
                    Logger logger = c8033Nv1.f8133d;
                    StringBuilder sb = new StringBuilder("Start subscribe to topic ");
                    String str2 = this.f3486d;
                    sb.append(str2);
                    Logger.DefaultImpls.info$default(logger, sb.toString(), null, 2, null);
                    this.f3484b = 2;
                    objM7015b = c8033Nv1.f8130a.m888e(str, str2, this);
                    if (objM7015b == enumC0817Mz) {
                        return enumC0817Mz;
                    }
                } else {
                    Logger.DefaultImpls.warn$default(c8033Nv1.f8133d, "Unable to subscribe to topic, token is not exists. You need to get Push Token before use subscribeToTopic", null, 2, null);
                    objM7015b = RQ1.m7015b(new Exception("Unable to subscribe to topic, token is not exists. You need to get Push Token before use subscribeToTopic"));
                }
                return new PS0(objM7015b);
            default:
                EnumC0817Mz enumC0817Mz2 = EnumC0817Mz.f7418a;
                int i2 = this.f3484b;
                C8033Nv1 c8033Nv12 = this.f3485c;
                if (i2 == 0) {
                    RQ1.m7017d(obj);
                    C7765Ir1 c7765Ir12 = c8033Nv12.f8131b;
                    this.f3484b = 1;
                    obj = c7765Ir12.m4050a(this);
                    if (obj == enumC0817Mz2) {
                        return enumC0817Mz2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        RQ1.m7017d(obj);
                        objM7015b2 = ((PS0) obj).f9075a;
                        return new PS0(objM7015b2);
                    }
                    RQ1.m7017d(obj);
                }
                String str3 = (String) obj;
                if (str3 != null) {
                    Logger logger2 = c8033Nv12.f8133d;
                    StringBuilder sb2 = new StringBuilder("Start unsubscribe from topic ");
                    String str4 = this.f3486d;
                    sb2.append(str4);
                    Logger.DefaultImpls.info$default(logger2, sb2.toString(), null, 2, null);
                    this.f3484b = 2;
                    objM7015b2 = c8033Nv12.f8130a.m889f(str3, str4, this);
                    if (objM7015b2 == enumC0817Mz2) {
                        return enumC0817Mz2;
                    }
                } else {
                    Logger.DefaultImpls.warn$default(c8033Nv12.f8133d, "Unable to unsubscribe from topic, token is not exists. You need to get Push Token before use unsubscribeFromTopic", null, 2, null);
                    objM7015b2 = RQ1.m7015b(new Exception("Unable to unsubscribe from topic, token is not exists. You need to get Push Token before use unsubscribeFromTopic"));
                }
                return new PS0(objM7015b2);
        }
    }
}
