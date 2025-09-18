package p000;

import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.functions.Function2;

/* renamed from: Ao0 */
/* loaded from: classes.dex */
public final class C7342Ao0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f376a;

    /* renamed from: b */
    public final /* synthetic */ C7446Co0 f377b;

    /* renamed from: c */
    public final /* synthetic */ Uri f378c;

    /* renamed from: d */
    public final /* synthetic */ InputEvent f379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7342Ao0(C7446Co0 c7446Co0, Uri uri, InputEvent inputEvent, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f377b = c7446Co0;
        this.f378c = uri;
        this.f379d = inputEvent;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C7342Ao0(this.f377b, this.f378c, this.f379d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7342Ao0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f376a;
        if (i == 0) {
            RQ1.m7017d(obj);
            C11844yo0 c11844yo0 = this.f377b.f1664a;
            this.f376a = 1;
            if (c11844yo0.m26258c(this.f378c, this.f379d, this) == enumC0817Mz) {
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
