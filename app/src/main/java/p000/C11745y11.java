package p000;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: y11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11745y11 extends AbstractC1571Yy {

    /* renamed from: a */
    public I11 f46029a;

    /* renamed from: b */
    public Object f46030b;

    /* renamed from: c */
    public Serializable f46031c;

    /* renamed from: d */
    public Object f46032d;

    /* renamed from: e */
    public A11 f46033e;

    /* renamed from: f */
    public Iterator f46034f;

    /* renamed from: g */
    public /* synthetic */ Object f46035g;

    /* renamed from: h */
    public final /* synthetic */ I11 f46036h;

    /* renamed from: i */
    public int f46037i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11745y11(I11 i11, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f46036h = i11;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f46035g = obj;
        this.f46037i |= Integer.MIN_VALUE;
        return this.f46036h.m3724d(this);
    }
}
