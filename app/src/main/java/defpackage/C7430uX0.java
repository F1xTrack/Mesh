package defpackage;

import android.content.SharedPreferences;
import expo.modules.securestore.SecureStoreOptions;

/* renamed from: uX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7430uX0 extends AbstractC1963Yy {
    public C7621vX0 a;
    public String b;
    public String c;
    public SecureStoreOptions d;
    public String e;
    public SharedPreferences f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C7621vX0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7430uX0(C7621vX0 c7621vX0, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.i = c7621vX0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.o(null, null, null, false, this);
    }
}
