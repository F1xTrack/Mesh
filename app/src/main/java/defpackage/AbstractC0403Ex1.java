package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;
import java.util.Iterator;

/* renamed from: Ex1 */
/* loaded from: classes.dex */
public abstract class AbstractC0403Ex1 {
    public static final Logger a = new Logger("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        C0481Fx1.A(context).B();
        Iterator<GoogleApiClient> it = GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }
}
