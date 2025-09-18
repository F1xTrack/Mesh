package p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: sx1 */
/* loaded from: classes.dex */
public final class RunnableC11098sx1 implements Runnable {

    /* renamed from: c */
    public static final Logger f42739c = new Logger("RevokeAccessOperation", new String[0]);

    /* renamed from: a */
    public final String f42740a;

    /* renamed from: b */
    public final StatusPendingResult f42741b = new StatusPendingResult((GoogleApiClient) null);

    public RunnableC11098sx1(String str) {
        this.f42740a = Preconditions.checkNotEmpty(str);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Logger logger = f42739c;
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f42740a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                logger.m11125e("Unable to revoke access!", new Object[0]);
            }
            logger.m11123d("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            logger.m11125e("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            logger.m11125e("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.f42741b.setResult(status);
    }
}
