package defpackage;

import org.json.JSONException;

/* renamed from: tu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7309tu1 extends AbstractC1963Yy {
    public C2407bs1 a;
    public HS0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C2407bs1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7309tu1(C2407bs1 c2407bs1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c2407bs1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws JSONException {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objD = this.d.d(null, null, this);
        return objD == EnumC1030Mz.a ? objD : new PS0(objD);
    }
}
