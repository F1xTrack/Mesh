package p000;

import android.net.Uri;
import kotlin.jvm.functions.Function2;

/* renamed from: Bo0 */
/* loaded from: classes.dex */
public final class C7394Bo0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f1032a;

    /* renamed from: b */
    public final /* synthetic */ C7446Co0 f1033b;

    /* renamed from: c */
    public final /* synthetic */ Uri f1034c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7394Bo0(C7446Co0 c7446Co0, Uri uri, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f1033b = c7446Co0;
        this.f1034c = uri;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C7394Bo0(this.f1033b, this.f1034c, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7394Bo0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f1032a;
        if (i == 0) {
            RQ1.m7017d(obj);
            C11844yo0 c11844yo0 = this.f1033b.f1664a;
            this.f1032a = 1;
            if (c11844yo0.m26259d(this.f1034c, this) == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        return C8313Tf1.f11463a;
    }
}
