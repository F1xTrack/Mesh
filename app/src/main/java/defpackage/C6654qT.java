package defpackage;

import com.vk.push.core.filedatastore.FileDataSource;
import kotlin.jvm.functions.Function2;

/* renamed from: qT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6654qT extends AbstractC4286i71 implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FileDataSource b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6654qT(FileDataSource fileDataSource, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = fileDataSource;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C6654qT c6654qT = new C6654qT(this.b, interfaceC1729Vy);
        c6654qT.a = obj;
        return c6654qT;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6654qT) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Object objB;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        try {
            objB = AbstractC5702lU.f(FileDataSource.access$getFileSource(this.b));
        } catch (Throwable th) {
            objB = RQ1.b(th);
        }
        return new PS0(objB);
    }
}
