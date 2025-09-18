package defpackage;

import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.functions.Function2;

/* renamed from: Ao0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063Ao0 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ C0219Co0 b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ InputEvent d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063Ao0(C0219Co0 c0219Co0, Uri uri, InputEvent inputEvent, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c0219Co0;
        this.c = uri;
        this.d = inputEvent;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C0063Ao0(this.b, this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0063Ao0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            C8242yo0 c8242yo0 = this.b.a;
            this.a = 1;
            if (c8242yo0.c(this.c, this.d, this) == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        return C1518Tf1.a;
    }
}
