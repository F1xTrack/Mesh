package p000;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class H11 extends AbstractC1571Yy {

    /* renamed from: a */
    public I11 f3989a;

    /* renamed from: b */
    public File f3990b;

    /* renamed from: c */
    public FileOutputStream f3991c;

    /* renamed from: d */
    public FileOutputStream f3992d;

    /* renamed from: e */
    public /* synthetic */ Object f3993e;

    /* renamed from: f */
    public final /* synthetic */ I11 f3994f;

    /* renamed from: g */
    public int f3995g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H11(I11 i11, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f3994f = i11;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f3993e = obj;
        this.f3995g |= Integer.MIN_VALUE;
        return this.f3994f.m3730j(null, this);
    }
}
