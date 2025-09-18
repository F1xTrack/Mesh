package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: CV */
/* loaded from: classes.dex */
public final class C0158CV extends AbstractC1571Yy {

    /* renamed from: a */
    public Map f1405a;

    /* renamed from: b */
    public Iterator f1406b;

    /* renamed from: c */
    public EnumC9897jZ0 f1407c;

    /* renamed from: d */
    public InterfaceC7924Lt0 f1408d;

    /* renamed from: e */
    public Map f1409e;

    /* renamed from: f */
    public Object f1410f;

    /* renamed from: g */
    public /* synthetic */ Object f1411g;

    /* renamed from: h */
    public final /* synthetic */ C0221DV f1412h;

    /* renamed from: i */
    public int f1413i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158CV(C0221DV c0221dv, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f1412h = c0221dv;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f1411g = obj;
        this.f1413i |= Integer.MIN_VALUE;
        return this.f1412h.m1707b(this);
    }
}
