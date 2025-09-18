package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class B60 implements Closeable {

    /* renamed from: a */
    public final URL f569a;

    /* renamed from: b */
    public volatile Future f570b;

    /* renamed from: c */
    public C9450g32 f571c;

    public B60(URL url) {
        this.f569a = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f570b.cancel(true);
    }

    /* renamed from: m */
    public final Bitmap m496m() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f569a;
        if (zIsLoggable) {
            Objects.toString(url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrM178c = AP1.m178c(new C7283zk(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = bArrM178c.length;
                Objects.toString(url);
            }
            if (bArrM178c.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM178c, 0, bArrM178c.length);
            if (bitmapDecodeByteArray != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Objects.toString(url);
                }
                return bitmapDecodeByteArray;
            }
            throw new IOException("Failed to decode image: " + url);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
