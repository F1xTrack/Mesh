package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: y11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8094y11 extends AbstractC1963Yy {
    public I11 a;
    public Object b;
    public Serializable c;
    public Object d;
    public A11 e;
    public Iterator f;
    public /* synthetic */ Object g;
    public final /* synthetic */ I11 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8094y11(I11 i11, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.h = i11;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(this);
    }
}
