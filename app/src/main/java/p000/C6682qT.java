package p000;

import com.p019vk.push.core.filedatastore.FileDataSource;
import kotlin.jvm.functions.Function2;

/* renamed from: qT */
/* loaded from: classes2.dex */
public final class C6682qT extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public /* synthetic */ Object f40880a;

    /* renamed from: b */
    public final /* synthetic */ FileDataSource f40881b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6682qT(FileDataSource fileDataSource, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f40881b = fileDataSource;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C6682qT c6682qT = new C6682qT(this.f40881b, interfaceC1382Vy);
        c6682qT.f40880a = obj;
        return c6682qT;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6682qT) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Object objM7015b;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        try {
            objM7015b = AbstractC6366lU.m22436f(FileDataSource.access$getFileSource(this.f40881b));
        } catch (Throwable th) {
            objM7015b = RQ1.m7015b(th);
        }
        return new PS0(objM7015b);
    }
}
