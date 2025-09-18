package p000;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: u4 */
/* loaded from: classes2.dex */
public final class C6926u4 extends Handler {

    /* renamed from: a */
    public static final C6926u4 f43482a = new C6926u4();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        O90.m5968f(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC6863t4.f42822a;
        String loggerName = logRecord.getLoggerName();
        O90.m5967e(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        O90.m5967e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strM25349X = (String) AbstractC6863t4.f42823b.get(loggerName);
        if (strM25349X == null) {
            strM25349X = AbstractC11374v51.m25349X(23, loggerName);
        }
        if (Log.isLoggable(strM25349X, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iM25361z = AbstractC11374v51.m25361z(message, '\n', i2, false, 4);
                if (iM25361z == -1) {
                    iM25361z = length;
                }
                while (true) {
                    iMin = Math.min(iM25361z, i2 + 4000);
                    O90.m5967e(message.substring(i2, iMin), "this as java.lang.String…ing(startIndex, endIndex)");
                    if (iMin >= iM25361z) {
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
