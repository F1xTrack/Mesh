package p000;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class D11 extends AbstractC1571Yy {

    /* renamed from: a */
    public I11 f1800a;

    /* renamed from: b */
    public FileInputStream f1801b;

    /* renamed from: c */
    public /* synthetic */ Object f1802c;

    /* renamed from: d */
    public final /* synthetic */ I11 f1803d;

    /* renamed from: e */
    public int f1804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11(I11 i11, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f1803d = i11;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f1802c = obj;
        this.f1804e |= Integer.MIN_VALUE;
        return this.f1803d.m3727g(this);
    }
}
