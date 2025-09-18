package p000;

import com.p019vk.push.core.filedatastore.FileDataSource;
import kotlin.jvm.functions.Function2;

/* renamed from: sT */
/* loaded from: classes2.dex */
public final class C6825sT extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public /* synthetic */ Object f42442a;

    /* renamed from: b */
    public final /* synthetic */ FileDataSource f42443b;

    /* renamed from: c */
    public final /* synthetic */ String f42444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6825sT(FileDataSource fileDataSource, String str, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f42443b = fileDataSource;
        this.f42444c = str;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C6825sT c6825sT = new C6825sT(this.f42443b, this.f42444c, interfaceC1382Vy);
        c6825sT.f42442a = obj;
        return c6825sT;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6825sT) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Object objM7015b;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        FileDataSource fileDataSource = this.f42443b;
        try {
            AbstractC6366lU.m22438h(FileDataSource.access$getFileSource(fileDataSource), this.f42444c);
            objM7015b = C8313Tf1.f11463a;
        } catch (Throwable th) {
            objM7015b = RQ1.m7015b(th);
        }
        return new PS0(objM7015b);
    }
}
