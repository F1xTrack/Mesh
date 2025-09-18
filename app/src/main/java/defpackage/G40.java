package defpackage;

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
public final class G40 extends AbstractC8355zO1 {
    public final int a;
    public final ExecutorService b;
    public final RealtimeSinceBootClock c;

    public G40() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.b = Executors.newFixedThreadPool(3);
        this.c = realtimeSinceBootClock;
        this.a = 30000;
    }

    @Override // defpackage.AbstractC8355zO1
    public final AbstractC2139aT a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        return new F40(abstractC1516Tf, rd0);
    }

    @Override // defpackage.AbstractC8355zO1
    public final void c(AbstractC2139aT abstractC2139aT, ES1 es1) {
        F40 f40 = (F40) abstractC2139aT;
        f40.f = this.c.now();
        ((C7647vg) f40.b).a(new E40(this.b.submit(new RunnableC1492Sx(this, f40, es1, 4, false)), 0, es1));
    }

    @Override // defpackage.AbstractC8355zO1
    public final Map d(AbstractC2139aT abstractC2139aT, int i) {
        F40 f40 = (F40) abstractC2139aT;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(f40.g - f40.f));
        map.put("fetch_time", Long.toString(f40.h - f40.g));
        map.put("total_time", Long.toString(f40.h - f40.f));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    @Override // defpackage.AbstractC8355zO1
    public final void e(AbstractC2139aT abstractC2139aT) {
        ((F40) abstractC2139aT).h = this.c.now();
    }

    public final HttpURLConnection g(Uri uri, int i) throws IOException {
        URL url;
        String str;
        Uri uri2 = AbstractC2374bh1.a;
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
        httpURLConnection.setConnectTimeout(this.a);
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
        if (i > 0 && uri3 != null && !EI1.a(uri3.getScheme(), scheme)) {
            return g(uri3, i - 1);
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
