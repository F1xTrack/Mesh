package defpackage;

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
public final class C6825rM1 extends AbstractC3985gY1 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6825rM1(C5716lY1 c5716lY1, int i) {
        super(c5716lY1);
        this.e = i;
    }

    public static byte[] D1(HttpURLConnection httpURLConnection) throws IOException {
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

    @Override // defpackage.AbstractC3985gY1
    public final boolean B1() {
        switch (this.e) {
        }
        return false;
    }

    public void C1(String str, C6289oY1 c6289oY1, QK1 qk1, InterfaceC5680lM1 interfaceC5680lM1) {
        String str2 = c6289oY1.a;
        v1();
        z1();
        try {
            URL url = new URI(str2).toURL();
            w1();
            byte[] bArrC = qk1.c();
            C7595vO1 c7595vO1P0 = p0();
            Map mapEmptyMap = c6289oY1.b;
            if (mapEmptyMap == null) {
                mapEmptyMap = Collections.emptyMap();
            }
            c7595vO1P0.B1(new RunnableC7969xM1(this, str, url, bArrC, mapEmptyMap, interfaceC5680lM1));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            OL1 ol1N = n();
            ol1N.g.b(OL1.B1(str), str2, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    public boolean E1() {
        z1();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C3386dP1) this.b).a.getSystemService("connectivity");
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
