package p000;

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

    /* renamed from: f */
    public static final Class f13117f;

    /* renamed from: g */
    public static final Class f13118g;

    /* renamed from: h */
    public static final Class f13119h;

    /* renamed from: a */
    public final SharedPreferences f13120a;

    /* renamed from: b */
    public Object f13121b;

    /* renamed from: c */
    public Object f13122c;

    /* renamed from: d */
    public final ExecutorService f13123d;

    /* renamed from: e */
    public final Handler f13124e;

    static {
        try {
            f13117f = InstallReferrerClient.class;
            f13118g = InstallReferrerStateListener.class;
            f13119h = ReferrerDetails.class;
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    public WH0(Context context) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f13123d = executorServiceNewSingleThreadExecutor;
        this.f13124e = new Handler(Looper.getMainLooper());
        this.f13120a = context.getSharedPreferences("react-native-device-info", 0);
        if (f13117f == null || f13118g == null || f13119h == null) {
            return;
        }
        executorServiceNewSingleThreadExecutor.execute(new MD0(this, 4, context));
    }
}
