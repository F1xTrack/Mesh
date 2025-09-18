package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* renamed from: rM1 */
/* loaded from: classes.dex */
public final class C10896rM1 extends AbstractC9512gY1 {

    /* renamed from: e */
    public final /* synthetic */ int f41619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10896rM1(C10152lY1 c10152lY1, int i) {
        super(c10152lY1);
        this.f41619e = i;
    }

    /* renamed from: D1 */
    public static byte[] m24321D1(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    @Override // p000.AbstractC9512gY1
    /* renamed from: B1 */
    public final boolean mo1721B1() {
        switch (this.f41619e) {
        }
        return false;
    }

    /* renamed from: C1 */
    public void m24322C1(String str, C10536oY1 c10536oY1, QK1 qk1, InterfaceC10128lM1 interfaceC10128lM1) {
        String str2 = c10536oY1.f39085a;
        mo7681v1();
        m18576z1();
        try {
            URL url = new URI(str2).toURL();
            m4343w1();
            byte[] bArrM3857c = qk1.m3857c();
            C11412vO1 c11412vO1Mo6071p0 = mo6071p0();
            Map mapEmptyMap = c10536oY1.f39086b;
            if (mapEmptyMap == null) {
                mapEmptyMap = Collections.emptyMap();
            }
            c11412vO1Mo6071p0.m25409B1(new RunnableC11662xM1(this, str, url, bArrM3857c, mapEmptyMap, interfaceC10128lM1));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8378g.m24553b(OL1.m6026B1(str), str2, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    /* renamed from: E1 */
    public boolean m24323E1() {
        m18576z1();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C9110dP1) this.f11615b).f26031a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
