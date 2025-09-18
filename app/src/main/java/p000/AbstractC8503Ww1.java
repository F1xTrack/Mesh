package p000;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* renamed from: Ww1 */
/* loaded from: classes.dex */
public abstract class AbstractC8503Ww1 {

    /* renamed from: a */
    public static final C8191Qw1 f13459a;

    /* renamed from: b */
    public static final Api f13460b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        C8191Qw1 c8191Qw1 = new C8191Qw1();
        f13459a = c8191Qw1;
        C8347Tw1 c8347Tw1 = new C8347Tw1();
        new Scope(Scopes.PROFILE);
        new Scope(Scopes.EMAIL);
        f13460b = new Api("SignIn.API", c8191Qw1, clientKey);
        new Api("SignIn.INTERNAL_API", c8347Tw1, clientKey2);
    }
}
