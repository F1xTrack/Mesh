package defpackage;

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
public abstract class AbstractC7601vQ1 {
    public static FileInputStream a(ReactApplicationContext reactApplicationContext, Uri uri) throws IOException {
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

    public static C1888Xz b(String str) {
        if (!str.equals("POST") && !str.equals("PUT") && !str.equals("PATCH")) {
            return null;
        }
        C0674Ik c0674Ik = C0674Ik.d;
        O90.f(c0674Ik, RemoteMessageConst.Notification.CONTENT);
        return new C1888Xz(null, 2, c0674Ik);
    }

    public static InputStream c(ReactApplicationContext reactApplicationContext, String str) {
        try {
            Uri uri = Uri.parse(str);
            if (uri.getScheme().startsWith("http")) {
                return a(reactApplicationContext, uri);
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
            AbstractC3393dS.h("ReactNative");
            return null;
        }
    }

    public static final WritableMap d(Throwable th) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", th.getMessage());
        writableMapCreateMap.putString("stacktrace", I02.e(th));
        if (th.getCause() != null) {
            Throwable cause = th.getCause();
            O90.c(cause);
            writableMapCreateMap.putMap("cause", d(cause));
        }
        return writableMapCreateMap;
    }

    public static WritableMap e(int i, String str, String str2, Throwable th) {
        if ((i & 4) != 0) {
            th = null;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", str);
        writableMapCreateMap.putString("message", str2);
        writableMapCreateMap.putMap("cause", th != null ? d(th) : null);
        writableMapCreateMap.putMap("userInfo", null);
        return writableMapCreateMap;
    }
}
