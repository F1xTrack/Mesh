package defpackage;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* renamed from: Ww1 */
/* loaded from: classes.dex */
public abstract class AbstractC1803Ww1 {
    public static final C1335Qw1 a;
    public static final Api b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        C1335Qw1 c1335Qw1 = new C1335Qw1();
        a = c1335Qw1;
        C1569Tw1 c1569Tw1 = new C1569Tw1();
        new Scope(Scopes.PROFILE);
        new Scope(Scopes.EMAIL);
        b = new Api("SignIn.API", c1335Qw1, clientKey);
        new Api("SignIn.INTERNAL_API", c1569Tw1, clientKey2);
    }
}
