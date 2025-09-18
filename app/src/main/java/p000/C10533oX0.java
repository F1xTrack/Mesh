package p000;

import expo.modules.securestore.SecureStoreOptions;
import kotlin.jvm.functions.Function2;

/* renamed from: oX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10533oX0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f39073a;

    /* renamed from: b */
    public final /* synthetic */ C11429vX0 f39074b;

    /* renamed from: c */
    public final /* synthetic */ String f39075c;

    /* renamed from: d */
    public final /* synthetic */ String f39076d;

    /* renamed from: e */
    public final /* synthetic */ SecureStoreOptions f39077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10533oX0(C11429vX0 c11429vX0, String str, String str2, SecureStoreOptions secureStoreOptions, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f39074b = c11429vX0;
        this.f39075c = str;
        this.f39076d = str2;
        this.f39077e = secureStoreOptions;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C10533oX0(this.f39074b, this.f39075c, this.f39076d, this.f39077e, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10533oX0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f39073a;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f39073a = 1;
            if (this.f39074b.m25441o(this.f39075c, this.f39076d, this.f39077e, false, this) == enumC0817Mz) {
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
