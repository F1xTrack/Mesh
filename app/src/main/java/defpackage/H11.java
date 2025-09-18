package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class H11 extends AbstractC1963Yy {
    public I11 a;
    public File b;
    public FileOutputStream c;
    public FileOutputStream d;
    public /* synthetic */ Object e;
    public final /* synthetic */ I11 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H11(I11 i11, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.f = i11;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.j(null, this);
    }
}
