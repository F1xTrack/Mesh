package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.clientid.ClientId;
import kotlin.jvm.functions.Function2;

/* renamed from: xs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8065xs1 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ C1155Oo1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ClientId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8065xs1(C1155Oo1 c1155Oo1, String str, ClientId clientId, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c1155Oo1;
        this.c = str;
        this.d = clientId;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C8065xs1(this.b, this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C8065xs1) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Object objM85invokegIAlus;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            C1155Oo1 c1155Oo1 = this.b;
            C0388Es1 c0388Es1 = new C0388Es1((Logger) c1155Oo1.c);
            C7875ws1 c7875ws1 = new C7875ws1(c1155Oo1, this.c, this.d, null);
            this.a = 1;
            objM85invokegIAlus = c0388Es1.m85invokegIAlus(c7875ws1, this);
            if (objM85invokegIAlus == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
            objM85invokegIAlus = ((PS0) obj).a;
        }
        return new PS0(objM85invokegIAlus);
    }
}
