package p000;

import expo.modules.securestore.SecureStoreOptions;
import kotlin.jvm.functions.Function2;

/* renamed from: pX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10661pX0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f40176a;

    /* renamed from: b */
    public final /* synthetic */ C11429vX0 f40177b;

    /* renamed from: c */
    public final /* synthetic */ String f40178c;

    /* renamed from: d */
    public final /* synthetic */ SecureStoreOptions f40179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10661pX0(C11429vX0 c11429vX0, String str, SecureStoreOptions secureStoreOptions, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f40177b = c11429vX0;
        this.f40178c = str;
        this.f40179d = secureStoreOptions;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C10661pX0(this.f40177b, this.f40178c, this.f40179d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10661pX0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f40176a;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f40176a = 1;
            obj = C11429vX0.m25430d(this.f40177b, this.f40178c, this.f40179d, this);
            if (obj == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        return obj;
    }
}
