package p000;

import java.util.List;

/* renamed from: bv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8913bv1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C11730xu1 f17229a;

    /* renamed from: b */
    public Object f17230b;

    /* renamed from: c */
    public Object f17231c;

    /* renamed from: d */
    public List f17232d;

    /* renamed from: e */
    public /* synthetic */ Object f17233e;

    /* renamed from: f */
    public final /* synthetic */ C11730xu1 f17234f;

    /* renamed from: g */
    public int f17235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8913bv1(C11730xu1 c11730xu1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f17234f = c11730xu1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f17233e = obj;
        this.f17235g |= Integer.MIN_VALUE;
        return C11730xu1.m25999a(this.f17234f, null, this);
    }
}
