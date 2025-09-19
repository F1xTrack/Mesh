package com.gzip;

import android.util.Base64;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = GzipModule.NAME)
/* loaded from: classes.dex */
public class GzipModule extends ReactContextBaseJavaModule {
    public static final String ER_FAILURE = "ERROR_FAILED";
    private static final int GZIP_DEFAULT_BUFFER_SIZE = 512;
    public static final String NAME = "Gzip";

    public GzipModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static byte[] compress(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public static String decompress(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[GZIP_DEFAULT_BUFFER_SIZE];
        while (true) {
            int i = gZIPInputStream.read(bArr2);
            if (i == -1) {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
    }

    @ReactMethod
    public void deflate(String str, Promise promise) {
        try {
            promise.resolve(Base64.encodeToString(compress(str), 2));
        } catch (Throwable th) {
            promise.reject(ER_FAILURE, th);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void inflate(String str, Promise promise) {
        try {
            promise.resolve(decompress(Base64.decode(str, 0)));
        } catch (Throwable th) {
            promise.reject(ER_FAILURE, th);
        }
    }
}
