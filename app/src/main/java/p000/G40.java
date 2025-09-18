package p000;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class G40 extends AbstractC11920zO1 {

    /* renamed from: a */
    public final int f3563a;

    /* renamed from: b */
    public final ExecutorService f3564b;

    /* renamed from: c */
    public final RealtimeSinceBootClock f3565c;

    public G40() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.f3564b = Executors.newFixedThreadPool(3);
        this.f3565c = realtimeSinceBootClock;
        this.f3563a = 30000;
    }

    @Override // p000.AbstractC11920zO1
    /* renamed from: a */
    public final AbstractC1666aT mo2920a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        return new F40(abstractC1237Tf, rd0);
    }

    @Override // p000.AbstractC11920zO1
    /* renamed from: c */
    public final void mo2921c(AbstractC1666aT abstractC1666aT, ES1 es1) {
        F40 f40 = (F40) abstractC1666aT;
        f40.f3052f = this.f3565c.now();
        ((C7027vg) f40.f15523b).m25462a(new E40(this.f3564b.submit(new RunnableC1192Sx(this, f40, es1, 4, false)), 0, es1));
    }

    @Override // p000.AbstractC11920zO1
    /* renamed from: d */
    public final Map mo2922d(AbstractC1666aT abstractC1666aT, int i) {
        F40 f40 = (F40) abstractC1666aT;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(f40.f3053g - f40.f3052f));
        map.put("fetch_time", Long.toString(f40.f3054h - f40.f3053g));
        map.put("total_time", Long.toString(f40.f3054h - f40.f3052f));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    @Override // p000.AbstractC11920zO1
    /* renamed from: e */
    public final void mo2923e(AbstractC1666aT abstractC1666aT) {
        ((F40) abstractC1666aT).f3054h = this.f3565c.now();
    }

    /* renamed from: g */
    public final HttpURLConnection m2924g(Uri uri, int i) throws IOException {
        URL url;
        String str;
        Uri uri2 = AbstractC8885bh1.f17121a;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.f3563a);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        Uri uri3 = headerField != null ? Uri.parse(headerField) : null;
        String scheme = uri.getScheme();
        if (i > 0 && uri3 != null && !EI1.m2118a(uri3.getScheme(), scheme)) {
            return m2924g(uri3, i - 1);
        }
        if (i == 0) {
            String string = uri.toString();
            Locale.getDefault();
            str = "URL " + string + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
        }
        throw new IOException(str);
    }
}
