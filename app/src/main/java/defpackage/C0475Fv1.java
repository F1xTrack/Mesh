package defpackage;

import com.vk.push.common.Logger;
import kotlin.jvm.functions.Function2;

/* renamed from: Fv1 */
/* loaded from: classes2.dex */
public final class C0475Fv1 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ C1098Nv1 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0475Fv1(C1098Nv1 c1098Nv1, String str, InterfaceC1729Vy interfaceC1729Vy, int i) {
        super(2, interfaceC1729Vy);
        this.a = i;
        this.c = c1098Nv1;
        this.d = str;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        switch (this.a) {
            case 0:
                return new C0475Fv1(this.c, this.d, interfaceC1729Vy, 0);
            default:
                return new C0475Fv1(this.c, this.d, interfaceC1729Vy, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj2;
        switch (this.a) {
            case 0:
                return new C0475Fv1(this.c, this.d, interfaceC1729Vy, 0).invokeSuspend(C1518Tf1.a);
            default:
                return new C0475Fv1(this.c, this.d, interfaceC1729Vy, 1).invokeSuspend(C1518Tf1.a);
        }
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objB2;
        switch (this.a) {
            case 0:
                EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
                int i = this.b;
                C1098Nv1 c1098Nv1 = this.c;
                if (i == 0) {
                    RQ1.d(obj);
                    C0697Ir1 c0697Ir1 = c1098Nv1.b;
                    this.b = 1;
                    obj = c0697Ir1.a(this);
                    if (obj == enumC1030Mz) {
                        return enumC1030Mz;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        RQ1.d(obj);
                        objB = ((PS0) obj).a;
                        return new PS0(objB);
                    }
                    RQ1.d(obj);
                }
                String str = (String) obj;
                if (str != null) {
                    Logger logger = c1098Nv1.d;
                    StringBuilder sb = new StringBuilder("Start subscribe to topic ");
                    String str2 = this.d;
                    sb.append(str2);
                    Logger.DefaultImpls.info$default(logger, sb.toString(), null, 2, null);
                    this.b = 2;
                    objB = c1098Nv1.a.e(str, str2, this);
                    if (objB == enumC1030Mz) {
                        return enumC1030Mz;
                    }
                } else {
                    Logger.DefaultImpls.warn$default(c1098Nv1.d, "Unable to subscribe to topic, token is not exists. You need to get Push Token before use subscribeToTopic", null, 2, null);
                    objB = RQ1.b(new Exception("Unable to subscribe to topic, token is not exists. You need to get Push Token before use subscribeToTopic"));
                }
                return new PS0(objB);
            default:
                EnumC1030Mz enumC1030Mz2 = EnumC1030Mz.a;
                int i2 = this.b;
                C1098Nv1 c1098Nv12 = this.c;
                if (i2 == 0) {
                    RQ1.d(obj);
                    C0697Ir1 c0697Ir12 = c1098Nv12.b;
                    this.b = 1;
                    obj = c0697Ir12.a(this);
                    if (obj == enumC1030Mz2) {
                        return enumC1030Mz2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        RQ1.d(obj);
                        objB2 = ((PS0) obj).a;
                        return new PS0(objB2);
                    }
                    RQ1.d(obj);
                }
                String str3 = (String) obj;
                if (str3 != null) {
                    Logger logger2 = c1098Nv12.d;
                    StringBuilder sb2 = new StringBuilder("Start unsubscribe from topic ");
                    String str4 = this.d;
                    sb2.append(str4);
                    Logger.DefaultImpls.info$default(logger2, sb2.toString(), null, 2, null);
                    this.b = 2;
                    objB2 = c1098Nv12.a.f(str3, str4, this);
                    if (objB2 == enumC1030Mz2) {
                        return enumC1030Mz2;
                    }
                } else {
                    Logger.DefaultImpls.warn$default(c1098Nv12.d, "Unable to unsubscribe from topic, token is not exists. You need to get Push Token before use unsubscribeFromTopic", null, 2, null);
                    objB2 = RQ1.b(new Exception("Unable to unsubscribe from topic, token is not exists. You need to get Push Token before use unsubscribeFromTopic"));
                }
                return new PS0(objB2);
        }
    }
}
