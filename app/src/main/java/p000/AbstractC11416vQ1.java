package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* renamed from: vQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11416vQ1 {
    /* renamed from: a */
    public static FileInputStream m25417a(ReactApplicationContext reactApplicationContext, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile("RequestBodyUtil", "temp", reactApplicationContext.getApplicationContext().getCacheDir());
        fileCreateTempFile.deleteOnExit();
        URL url = new URL(uri.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
            try {
                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    if (readableByteChannelNewChannel != null) {
                        readableByteChannelNewChannel.close();
                    }
                    if (inputStreamOpenStream != null) {
                        inputStreamOpenStream.close();
                    }
                    fileOutputStream.close();
                    return fileInputStream;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static C1509Xz m25418b(String str) {
        if (!str.equals("POST") && !str.equals("PUT") && !str.equals("PATCH")) {
            return null;
        }
        C0551Ik c0551Ik = C0551Ik.f5116d;
        O90.m5968f(c0551Ik, RemoteMessageConst.Notification.CONTENT);
        return new C1509Xz(null, 2, c0551Ik);
    }

    /* renamed from: c */
    public static InputStream m25419c(ReactApplicationContext reactApplicationContext, String str) {
        try {
            Uri uri = Uri.parse(str);
            if (uri.getScheme().startsWith("http")) {
                return m25417a(reactApplicationContext, uri);
            }
            if (!str.startsWith("data:")) {
                return reactApplicationContext.getContentResolver().openInputStream(uri);
            }
            byte[] bArrDecode = Base64.decode(str.split(StringUtils.COMMA)[1], 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        } catch (Exception unused) {
            AbstractC3929dS.m17675h("ReactNative");
            return null;
        }
    }

    /* renamed from: d */
    public static final WritableMap m25420d(Throwable th) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", th.getMessage());
        writableMapCreateMap.putString("stacktrace", I02.m3691e(th));
        if (th.getCause() != null) {
            Throwable cause = th.getCause();
            O90.m5965c(cause);
            writableMapCreateMap.putMap("cause", m25420d(cause));
        }
        return writableMapCreateMap;
    }

    /* renamed from: e */
    public static WritableMap m25421e(int i, String str, String str2, Throwable th) {
        if ((i & 4) != 0) {
            th = null;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", str);
        writableMapCreateMap.putString("message", str2);
        writableMapCreateMap.putMap("cause", th != null ? m25420d(th) : null);
        writableMapCreateMap.putMap("userInfo", null);
        return writableMapCreateMap;
    }
}
