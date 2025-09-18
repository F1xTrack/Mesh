package p000;

import expo.modules.securestore.SecureStoreOptions;

/* renamed from: tX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11173tX0 extends AbstractC1571Yy {

    /* renamed from: a */
    public C11429vX0 f43111a;

    /* renamed from: b */
    public String f43112b;

    /* renamed from: c */
    public SecureStoreOptions f43113c;

    /* renamed from: d */
    public /* synthetic */ Object f43114d;

    /* renamed from: e */
    public final /* synthetic */ C11429vX0 f43115e;

    /* renamed from: f */
    public int f43116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11173tX0(C11429vX0 c11429vX0, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f43115e = c11429vX0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f43114d = obj;
        this.f43116f |= Integer.MIN_VALUE;
        return this.f43115e.m25439l(null, null, null, this);
    }
}
