package p000;

import android.content.SharedPreferences;
import expo.modules.securestore.SecureStoreOptions;

/* renamed from: uX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11301uX0 extends AbstractC1571Yy {

    /* renamed from: a */
    public C11429vX0 f43720a;

    /* renamed from: b */
    public String f43721b;

    /* renamed from: c */
    public String f43722c;

    /* renamed from: d */
    public SecureStoreOptions f43723d;

    /* renamed from: e */
    public String f43724e;

    /* renamed from: f */
    public SharedPreferences f43725f;

    /* renamed from: g */
    public boolean f43726g;

    /* renamed from: h */
    public /* synthetic */ Object f43727h;

    /* renamed from: i */
    public final /* synthetic */ C11429vX0 f43728i;

    /* renamed from: j */
    public int f43729j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11301uX0(C11429vX0 c11429vX0, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f43728i = c11429vX0;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f43727h = obj;
        this.f43729j |= Integer.MIN_VALUE;
        return this.f43728i.m25441o(null, null, null, false, this);
    }
}
