package ru.ok.tracer.base.io;

import defpackage.AbstractC2141aT1;
import defpackage.AbstractC7680vr;
import defpackage.NP1;
import defpackage.O90;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"readBytesToGzippedByteArray", "", "Ljava/io/File;", "toGzippedByteArray", "", "tracer-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GZIPUtils {
    public static final byte[] readBytesToGzippedByteArray(File file) throws IOException {
        O90.f(file, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            NP1.a(fileInputStream, gZIPOutputStream, 8192);
            AbstractC2141aT1.a(fileInputStream, null);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            O90.e(byteArray, "baos.toByteArray()");
            return byteArray;
        } finally {
        }
    }

    public static final byte[] toGzippedByteArray(String str) {
        O90.f(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC7680vr.a);
        O90.e(bytes, "this as java.lang.String).getBytes(charset)");
        return toGzippedByteArray(bytes);
    }

    public static final byte[] toGzippedByteArray(byte[] bArr) throws IOException {
        O90.f(bArr, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        O90.e(byteArray, "baos.toByteArray()");
        return byteArray;
    }
}
