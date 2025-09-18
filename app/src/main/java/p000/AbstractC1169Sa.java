package p000;

import com.google.android.gms.common.api.Api;

/* renamed from: Sa */
/* loaded from: classes.dex */
public abstract class AbstractC1169Sa {

    /* renamed from: a */
    public static final Api f10859a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        C10842qx1 c10842qx1 = new C10842qx1();
        C11226tx1 c11226tx1 = new C11226tx1();
        Api api = AbstractC1232Ta.f11432a;
        new Api("Auth.CREDENTIALS_API", c10842qx1, clientKey);
        f10859a = new Api("Auth.GOOGLE_SIGN_IN_API", c11226tx1, clientKey2);
    }
}
