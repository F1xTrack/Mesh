package defpackage;

import expo.modules.securestore.SecureStoreOptions;
import kotlin.jvm.functions.Function2;

/* renamed from: pX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6476pX0 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ C7621vX0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ SecureStoreOptions d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6476pX0(C7621vX0 c7621vX0, String str, SecureStoreOptions secureStoreOptions, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c7621vX0;
        this.c = str;
        this.d = secureStoreOptions;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C6476pX0(this.b, this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6476pX0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            this.a = 1;
            obj = C7621vX0.d(this.b, this.c, this.d, this);
            if (obj == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        return obj;
    }
}
