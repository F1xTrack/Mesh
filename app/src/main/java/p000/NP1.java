package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class NP1 {
    /* renamed from: a */
    public static final long m5671a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = inputStream.read(bArr);
        long j = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j += i2;
            i2 = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: f */
    public static final byte[] m5672f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m5671a(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        O90.m5967e(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* renamed from: b */
    public abstract Method mo4630b(Class cls, Field field);

    /* renamed from: c */
    public abstract Constructor mo4631c(Class cls);

    /* renamed from: d */
    public abstract String[] mo4632d(Class cls);

    /* renamed from: e */
    public abstract boolean mo4633e(Class cls);
}
