package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p018my.tracker.MyTrackerConfig;
import java.io.OutputStream;

/* renamed from: com.my.tracker.obfuscated.t0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2369t0 {

    /* renamed from: com.my.tracker.obfuscated.t0$a */
    public interface a {
        /* renamed from: a */
        String mo13349a();

        /* renamed from: a */
        void mo13351a(OutputStream outputStream);
    }

    /* renamed from: com.my.tracker.obfuscated.t0$b */
    public static final class b {

        /* renamed from: a */
        boolean f20123a;

        /* renamed from: b */
        Object f20124b;

        /* renamed from: c */
        String f20125c;

        private b() {
        }

        /* renamed from: d */
        public static b m13499d() {
            return new b();
        }

        /* renamed from: a */
        public String m13500a() {
            return this.f20125c;
        }

        /* renamed from: b */
        public Object m13501b() {
            return this.f20124b;
        }

        /* renamed from: c */
        public boolean m13502c() {
            return this.f20123a;
        }
    }

    /* renamed from: a */
    public static boolean m13498a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    /* renamed from: a */
    public abstract b mo13274a(String str);

    /* renamed from: a */
    public static AbstractC2369t0 m13496a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (okHttpClientProvider != null) {
            try {
                return new C2334k1(okHttpClientProvider);
            } catch (Throwable th) {
                AbstractC2391y2.m13569a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new C2361r0();
    }

    /* renamed from: a */
    public static AbstractC2369t0 m13497a(a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        if (okHttpClientProvider != null) {
            try {
                return new C2338l1(aVar, okHttpClientProvider, z);
            } catch (Throwable th) {
                AbstractC2391y2.m13569a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new C2365s0(aVar, z);
    }
}
