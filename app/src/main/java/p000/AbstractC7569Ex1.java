package p000;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;
import java.util.Iterator;

/* renamed from: Ex1 */
/* loaded from: classes.dex */
public abstract class AbstractC7569Ex1 {

    /* renamed from: a */
    public static final Logger f2983a = new Logger("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static void m2459a(Context context) {
        C7621Fx1.m2835A(context).m2838B();
        Iterator<GoogleApiClient> it = GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }
}
