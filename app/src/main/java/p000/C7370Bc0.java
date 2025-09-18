package p000;

import com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: Bc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7370Bc0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f940a;

    /* renamed from: b */
    public final /* synthetic */ JsonSerializableFileDataStoreImpl f941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7370Bc0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f941b = jsonSerializableFileDataStoreImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C7370Bc0(this.f941b, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7370Bc0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f940a;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f940a = 1;
            if (this.f941b.clear(this) == enumC0817Mz) {
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
