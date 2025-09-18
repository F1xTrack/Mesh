package defpackage;

import android.content.Context;
import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class LY0 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ MY0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LY0(MY0 my0, String str, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = my0;
        this.c = str;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new LY0(this.b, this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LY0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        try {
            if (i == 0) {
                RQ1.d(obj);
                HY0 hy0 = MY0.e;
                Context context = this.b.a;
                hy0.getClass();
                InterfaceC3729fD interfaceC3729fD = (InterfaceC3729fD) MY0.f.getValue(context, HY0.a[0]);
                KY0 ky0 = new KY0(this.c, null);
                this.a = 1;
                if (interfaceC3729fD.a(new NC0(ky0, null), this) == enumC1030Mz) {
                    return enumC1030Mz;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.d(obj);
            }
        } catch (IOException e) {
            e.toString();
        }
        return C1518Tf1.a;
    }
}
