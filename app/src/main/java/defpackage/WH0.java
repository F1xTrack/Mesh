package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class WH0 {
    public static final Class f;
    public static final Class g;
    public static final Class h;
    public final SharedPreferences a;
    public Object b;
    public Object c;
    public final ExecutorService d;
    public final Handler e;

    static {
        try {
            f = InstallReferrerClient.class;
            g = InstallReferrerStateListener.class;
            h = ReferrerDetails.class;
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    public WH0(Context context) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.d = executorServiceNewSingleThreadExecutor;
        this.e = new Handler(Looper.getMainLooper());
        this.a = context.getSharedPreferences("react-native-device-info", 0);
        if (f == null || g == null || h == null) {
            return;
        }
        executorServiceNewSingleThreadExecutor.execute(new MD0(this, 4, context));
    }
}
