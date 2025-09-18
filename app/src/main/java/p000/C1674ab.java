package p000;

import javax.crypto.Cipher;
import kotlin.jvm.functions.Function2;

/* renamed from: ab */
/* loaded from: classes2.dex */
public final class C1674ab extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f15571a;

    /* renamed from: b */
    public final /* synthetic */ C10910rT1 f15572b;

    /* renamed from: c */
    public final /* synthetic */ Cipher f15573c;

    /* renamed from: d */
    public final /* synthetic */ X11 f15574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674ab(C10910rT1 c10910rT1, Cipher cipher, X11 x11, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f15572b = c10910rT1;
        this.f15573c = cipher;
        this.f15574d = x11;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C1674ab(this.f15572b, this.f15573c, this.f15574d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1674ab) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f15571a;
        X11 x11 = this.f15574d;
        try {
            if (i == 0) {
                RQ1.m7017d(obj);
                C10910rT1 c10910rT1 = this.f15572b;
                Cipher cipher = this.f15573c;
                this.f15571a = 1;
                obj = c10910rT1.m24381m(cipher, this);
                if (obj == enumC0817Mz) {
                    return enumC0817Mz;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.m7017d(obj);
            }
            C0548Ih c0548Ih = (C0548Ih) obj;
            if (c0548Ih != null) {
                return c0548Ih;
            }
            throw new C1547Ya("Couldn't get the authentication result");
        } finally {
            x11.f13487b = false;
        }
    }
}
