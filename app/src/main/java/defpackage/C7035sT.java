package defpackage;

import com.vk.push.core.filedatastore.FileDataSource;
import kotlin.jvm.functions.Function2;

/* renamed from: sT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7035sT extends AbstractC4286i71 implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FileDataSource b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7035sT(FileDataSource fileDataSource, String str, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = fileDataSource;
        this.c = str;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C7035sT c7035sT = new C7035sT(this.b, this.c, interfaceC1729Vy);
        c7035sT.a = obj;
        return c7035sT;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7035sT) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Object objB;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        FileDataSource fileDataSource = this.b;
        try {
            AbstractC5702lU.h(FileDataSource.access$getFileSource(fileDataSource), this.c);
            objB = C1518Tf1.a;
        } catch (Throwable th) {
            objB = RQ1.b(th);
        }
        return new PS0(objB);
    }
}
