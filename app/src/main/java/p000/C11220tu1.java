package p000;

import org.json.JSONException;

/* renamed from: tu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11220tu1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C8907bs1 f43407a;

    /* renamed from: b */
    public HS0 f43408b;

    /* renamed from: c */
    public /* synthetic */ Object f43409c;

    /* renamed from: d */
    public final /* synthetic */ C8907bs1 f43410d;

    /* renamed from: e */
    public int f43411e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11220tu1(C8907bs1 c8907bs1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f43410d = c8907bs1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws JSONException {
        this.f43409c = obj;
        this.f43411e |= Integer.MIN_VALUE;
        Object objM10536d = this.f43410d.m10536d(null, null, this);
        return objM10536d == EnumC0817Mz.f7418a ? objM10536d : new PS0(objM10536d);
    }
}
