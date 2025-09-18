package defpackage;

import com.google.android.gms.common.api.Api;

/* renamed from: Sa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1423Sa {
    public static final Api a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        C6746qx1 c6746qx1 = new C6746qx1();
        C7318tx1 c7318tx1 = new C7318tx1();
        Api api = AbstractC1501Ta.a;
        new Api("Auth.CREDENTIALS_API", c6746qx1, clientKey);
        a = new Api("Auth.GOOGLE_SIGN_IN_API", c7318tx1, clientKey2);
    }
}
