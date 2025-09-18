package defpackage;

import com.vk.push.common.clientid.ClientId;
import org.json.JSONException;

/* renamed from: ws1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7875ws1 extends AbstractC4286i71 implements InterfaceC6099nZ {
    public int a;
    public final /* synthetic */ C1155Oo1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ClientId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7875ws1(C1155Oo1 c1155Oo1, String str, ClientId clientId, InterfaceC1729Vy interfaceC1729Vy) {
        super(1, interfaceC1729Vy);
        this.b = c1155Oo1;
        this.c = str;
        this.d = clientId;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(InterfaceC1729Vy interfaceC1729Vy) {
        return new C7875ws1(this.b, this.c, this.d, interfaceC1729Vy);
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        return ((C7875ws1) create((InterfaceC1729Vy) obj)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objD;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            C2407bs1 c2407bs1 = (C2407bs1) this.b.a;
            this.a = 1;
            objD = c2407bs1.d(this.c, this.d, this);
            if (objD == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
            objD = ((PS0) obj).a;
        }
        return new PS0(objD);
    }
}
