package p000;

import android.content.Context;
import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class LY0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f6709a;

    /* renamed from: b */
    public final /* synthetic */ MY0 f6710b;

    /* renamed from: c */
    public final /* synthetic */ String f6711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LY0(MY0 my0, String str, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f6710b = my0;
        this.f6711c = str;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new LY0(this.f6710b, this.f6711c, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LY0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f6709a;
        try {
            if (i == 0) {
                RQ1.m7017d(obj);
                HY0 hy0 = MY0.f7218e;
                Context context = this.f6710b.f7220a;
                hy0.getClass();
                InterfaceC4039fD interfaceC4039fD = (InterfaceC4039fD) MY0.f7219f.getValue(context, HY0.f4339a[0]);
                KY0 ky0 = new KY0(this.f6711c, null);
                this.f6709a = 1;
                if (interfaceC4039fD.mo2067a(new NC0(ky0, null), this) == enumC0817Mz) {
                    return enumC0817Mz;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.m7017d(obj);
            }
        } catch (IOException e) {
            e.toString();
        }
        return C8313Tf1.f11463a;
    }
}
