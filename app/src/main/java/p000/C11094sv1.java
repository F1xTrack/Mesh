package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.core.test.TestPushPayload;
import com.p019vk.push.core.utils.StringExtensionsKt;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* renamed from: sv1 */
/* loaded from: classes2.dex */
public final class C11094sv1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f42728a;

    /* renamed from: b */
    public final /* synthetic */ C11732xv1 f42729b;

    /* renamed from: c */
    public final /* synthetic */ String f42730c;

    /* renamed from: d */
    public final /* synthetic */ T71 f42731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11094sv1(C11732xv1 c11732xv1, String str, T71 t71, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f42729b = c11732xv1;
        this.f42730c = str;
        this.f42731d = t71;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C11094sv1(this.f42729b, this.f42730c, this.f42731d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11094sv1) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Object objM22597k;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f42728a;
        String str = this.f42730c;
        if (i == 0) {
            RQ1.m7017d(obj);
            C11732xv1 c11732xv1 = this.f42729b;
            Logger.DefaultImpls.info$default(c11732xv1.f45903c, "send test push to token = " + StringExtensionsKt.hideSensitive(str), null, 2, null);
            this.f42728a = 1;
            obj = c11732xv1.f45901a.invoke(this);
            if (obj == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.m7017d(obj);
                objM22597k = ((PS0) obj).f9075a;
                return new PS0(objM22597k);
            }
            RQ1.m7017d(obj);
        }
        T71 t71 = this.f42731d;
        O90.m5968f(t71, "<this>");
        TestPushPayload testPushPayload = new TestPushPayload((String) t71.f11173a, (String) t71.f11174b, (String) t71.f11175c, (LinkedHashMap) t71.f11176d);
        this.f42728a = 2;
        objM22597k = ((C10196lu1) obj).m22597k(str, testPushPayload, this);
        if (objM22597k == enumC0817Mz) {
            return enumC0817Mz;
        }
        return new PS0(objM22597k);
    }
}
