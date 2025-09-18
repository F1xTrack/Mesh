package defpackage;

import expo.modules.securestore.SecureStoreOptions;

/* renamed from: tX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7239tX0 extends AbstractC1963Yy {
    public C7621vX0 a;
    public String b;
    public SecureStoreOptions c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C7621vX0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7239tX0(C7621vX0 c7621vX0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.e = c7621vX0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.l(null, null, null, this);
    }
}
