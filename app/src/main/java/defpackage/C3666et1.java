package defpackage;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.domain.model.CallingAppIds;
import kotlin.jvm.functions.Function2;

/* renamed from: et1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3666et1 extends AbstractC4286i71 implements Function2 {
    public String a;
    public int b;
    public final /* synthetic */ C6924rt1 c;
    public final /* synthetic */ CallingAppIds d;
    public final /* synthetic */ AsyncCallback e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3666et1(C6924rt1 c6924rt1, CallingAppIds callingAppIds, AsyncCallback asyncCallback, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = c6924rt1;
        this.d = callingAppIds;
        this.e = asyncCallback;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C3666et1(this.c, this.d, this.e, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3666et1) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3666et1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
