package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: u4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7342u4 extends Handler {
    public static final C7342u4 a = new C7342u4();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        O90.f(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC7151t4.a;
        String loggerName = logRecord.getLoggerName();
        O90.e(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        O90.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strX = (String) AbstractC7151t4.b.get(loggerName);
        if (strX == null) {
            strX = AbstractC7538v51.X(23, loggerName);
        }
        if (Log.isLoggable(strX, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iZ = AbstractC7538v51.z(message, '\n', i2, false, 4);
                if (iZ == -1) {
                    iZ = length;
                }
                while (true) {
                    iMin = Math.min(iZ, i2 + 4000);
                    O90.e(message.substring(i2, iMin), "this as java.lang.String…ing(startIndex, endIndex)");
                    if (iMin >= iZ) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
