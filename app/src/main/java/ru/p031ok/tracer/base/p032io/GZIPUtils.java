package ru.p031ok.tracer.base.p032io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import p000.AbstractC7038vr;
import p000.AbstractC8729aT1;
import p000.NP1;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0004¨\u0006\u0005"}, m22267d2 = {"readBytesToGzippedByteArray", "", "Ljava/io/File;", "toGzippedByteArray", "", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class GZIPUtils {
    public static final byte[] readBytesToGzippedByteArray(File file) throws IOException {
        O90.m5968f(file, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            NP1.m5671a(fileInputStream, gZIPOutputStream, 8192);
            AbstractC8729aT1.m9749a(fileInputStream, null);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            O90.m5967e(byteArray, "baos.toByteArray()");
            return byteArray;
        } finally {
        }
    }

    public static final byte[] toGzippedByteArray(String str) {
        O90.m5968f(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC7038vr.f44561a);
        O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
        return toGzippedByteArray(bytes);
    }

    public static final byte[] toGzippedByteArray(byte[] bArr) throws IOException {
        O90.m5968f(bArr, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        O90.m5967e(byteArray, "baos.toByteArray()");
        return byteArray;
    }
}
