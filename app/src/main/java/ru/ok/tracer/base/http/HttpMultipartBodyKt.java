package ru.ok.tracer.base.http;

import defpackage.AbstractC7680vr;
import defpackage.O90;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "str", "LTf1;", "appendQuoted", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Ljava/io/OutputStream;", "string", "writeUtf8", "(Ljava/io/OutputStream;Ljava/lang/String;)V", "", "CRLF", "[B", "DASHDASH", "", "getUtf8Length", "(Ljava/lang/String;)I", "utf8Length", "tracer-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpMultipartBodyKt {
    private static final byte[] CRLF;
    private static final byte[] DASHDASH;

    static {
        Charset charset = AbstractC7680vr.a;
        byte[] bytes = "\r\n".getBytes(charset);
        O90.e(bytes, "this as java.lang.String).getBytes(charset)");
        CRLF = bytes;
        byte[] bytes2 = "--".getBytes(charset);
        O90.e(bytes2, "this as java.lang.String).getBytes(charset)");
        DASHDASH = bytes2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendQuoted(StringBuilder sb, String str) {
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"' || cCharAt == '\\' || cCharAt == '\r') {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 == '\"' || cCharAt2 == '\\' || cCharAt2 == '\r') {
                        sb.append('\\');
                    }
                    sb.append(cCharAt2);
                }
                sb.append('\"');
            }
        }
        sb.append(str);
        sb.append('\"');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getUtf8Length(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            i += cCharAt <= 127 ? 1 : cCharAt <= 2047 ? 2 : 3;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeUtf8(OutputStream outputStream, String str) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                outputStream.write(cCharAt);
            } else if (cCharAt <= 2047) {
                outputStream.write((cCharAt >> 6) | 192);
                outputStream.write((cCharAt & '?') | 128);
            } else {
                outputStream.write((cCharAt >> '\f') | 224);
                outputStream.write(((cCharAt >> 6) & 63) | 128);
                outputStream.write((cCharAt & '?') | 128);
            }
        }
    }
}
