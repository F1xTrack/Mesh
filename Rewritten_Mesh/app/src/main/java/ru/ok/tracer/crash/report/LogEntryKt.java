package ru.ok.tracer.crash.report;

import defpackage.J8;
import defpackage.O90;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljava/io/OutputStream;", "", "message", "LTf1;", "writeAscii", "(Ljava/io/OutputStream;C)V", "", "(Ljava/io/OutputStream;Ljava/lang/String;)V", "", "", "maxSize", "coerceUtf8SizeAtMost", "([BI)[B", "tracer-crash-report_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LogEntryKt {
    public static final byte[] coerceUtf8SizeAtMost(byte[] bArr, int i) {
        O90.f(bArr, "<this>");
        if (bArr.length <= i) {
            return bArr;
        }
        if ((bArr[i] & 192) == 128) {
            do {
                i--;
                if (i < 0) {
                    break;
                }
            } while ((bArr[i] & 192) == 128);
        }
        return J8.i(bArr, 0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeAscii(OutputStream outputStream, char c) throws IOException {
        outputStream.write(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeAscii(OutputStream outputStream, String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            outputStream.write(str.charAt(i));
        }
    }
}
