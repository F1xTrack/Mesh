package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.test.TestPushPayload;
import com.vk.push.core.utils.StringExtensionsKt;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* renamed from: sv1 */
/* loaded from: classes2.dex */
public final class C7121sv1 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ C8074xv1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ T71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7121sv1(C8074xv1 c8074xv1, String str, T71 t71, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c8074xv1;
        this.c = str;
        this.d = t71;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C7121sv1(this.b, this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7121sv1) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Object objK;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        String str = this.c;
        if (i == 0) {
            RQ1.d(obj);
            C8074xv1 c8074xv1 = this.b;
            Logger.DefaultImpls.info$default(c8074xv1.c, "send test push to token = " + StringExtensionsKt.hideSensitive(str), null, 2, null);
            this.a = 1;
            obj = c8074xv1.a.invoke(this);
            if (obj == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.d(obj);
                objK = ((PS0) obj).a;
                return new PS0(objK);
            }
            RQ1.d(obj);
        }
        T71 t71 = this.d;
        O90.f(t71, "<this>");
        TestPushPayload testPushPayload = new TestPushPayload((String) t71.a, (String) t71.b, (String) t71.c, (LinkedHashMap) t71.d);
        this.a = 2;
        objK = ((C5782lu1) obj).k(str, testPushPayload, this);
        if (objK == enumC1030Mz) {
            return enumC1030Mz;
        }
        return new PS0(objK);
    }
}
