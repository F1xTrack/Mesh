package defpackage;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SQ0 extends AbstractC4286i71 implements Function2 {
    public TO0 a;
    public TO0 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ UQ0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQ0(UQ0 uq0, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.e = uq0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        SQ0 sq0 = new SQ0(this.e, interfaceC1729Vy);
        sq0.d = obj;
        return sq0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SQ0) create((JSONObject) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196 A[RETURN] */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SQ0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
