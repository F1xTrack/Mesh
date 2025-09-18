package p000;

/* renamed from: bq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8903bq1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C8387Uq1 f17182a;

    /* renamed from: b */
    public String f17183b;

    /* renamed from: c */
    public /* synthetic */ Object f17184c;

    /* renamed from: d */
    public final /* synthetic */ C8387Uq1 f17185d;

    /* renamed from: e */
    public int f17186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8903bq1(C8387Uq1 c8387Uq1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f17185d = c8387Uq1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f17184c = obj;
        this.f17186e |= Integer.MIN_VALUE;
        return this.f17185d.m8187a(this);
    }
}
