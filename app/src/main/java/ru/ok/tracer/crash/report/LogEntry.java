package ru.ok.tracer.crash.report;

import defpackage.AbstractC7680vr;
import defpackage.J8;
import defpackage.O90;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0017\u0010 \u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006$"}, d2 = {"Lru/ok/tracer/crash/report/LogEntry;", "", "", "ts", "", "messageBytes", "<init>", "(J[B)V", "Ljava/io/OutputStream;", "stream", "", "seq", "LTf1;", "writeToApi", "(Ljava/io/OutputStream;I)V", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ljava/io/DataOutput;", "output", "writeToStorage", "(Ljava/io/DataOutput;)V", "J", "getTs", "()J", "[B", "apiLineLength", "I", "getApiLineLength", "Companion", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LogEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_MESSAGE_LENGTH = 65506;
    private final int apiLineLength;
    private final byte[] messageBytes;
    private final long ts;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ok/tracer/crash/report/LogEntry$Companion;", "", "()V", "MAX_MESSAGE_LENGTH", "", "invoke", "Lru/ok/tracer/crash/report/LogEntry;", "ts", "", "message", "", "parseFromStorage", "input", "Ljava/nio/ByteBuffer;", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LogEntry invoke(long ts, String message) {
            O90.f(message, "message");
            byte[] bytes = message.getBytes(AbstractC7680vr.a);
            O90.e(bytes, "this as java.lang.String).getBytes(charset)");
            return new LogEntry(ts, LogEntryKt.coerceUtf8SizeAtMost(bytes, LogEntry.MAX_MESSAGE_LENGTH), null);
        }

        public final LogEntry parseFromStorage(ByteBuffer input) throws BufferUnderflowException {
            O90.f(input, "input");
            if (!input.hasArray()) {
                throw new IllegalArgumentException("Only buffers with backing array supported");
            }
            long j = input.getLong();
            int i = input.getInt();
            if (input.remaining() < i) {
                throw new BufferUnderflowException();
            }
            int iPosition = input.position() + input.arrayOffset();
            byte[] bArrArray = input.array();
            O90.e(bArrArray, "input.array()");
            LogEntry logEntry = new LogEntry(j, J8.i(bArrArray, iPosition, iPosition + i), null);
            input.position(input.position() + i);
            return logEntry;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LogEntry(long j, byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, bArr);
    }

    public static /* synthetic */ void writeToApi$default(LogEntry logEntry, OutputStream outputStream, int i, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        logEntry.writeToApi(outputStream, i);
    }

    public boolean equals(Object other) {
        if (other instanceof LogEntry) {
            LogEntry logEntry = (LogEntry) other;
            if (this.ts == logEntry.ts && Arrays.equals(this.messageBytes, logEntry.messageBytes)) {
                return true;
            }
        }
        return false;
    }

    public final int getApiLineLength() {
        return this.apiLineLength;
    }

    public final long getTs() {
        return this.ts;
    }

    public int hashCode() {
        long j = this.ts;
        return ((int) (j ^ (j >>> 32))) | Arrays.hashCode(this.messageBytes);
    }

    public String toString() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeToApi$default(this, byteArrayOutputStream, 0, 2, null);
        String string = byteArrayOutputStream.toString();
        O90.e(string, "ByteArrayOutputStream().…(::writeToApi).toString()");
        return string;
    }

    public final void writeToApi(OutputStream stream, int seq) throws IOException {
        O90.f(stream, "stream");
        LogEntryKt.writeAscii(stream, '#');
        LogEntryKt.writeAscii(stream, String.valueOf(seq));
        LogEntryKt.writeAscii(stream, ' ');
        LogEntryKt.writeAscii(stream, String.valueOf(this.ts));
        LogEntryKt.writeAscii(stream, " | ");
        stream.write(this.messageBytes);
        LogEntryKt.writeAscii(stream, '\n');
    }

    public final void writeToStorage(DataOutput output) throws IOException {
        O90.f(output, "output");
        output.writeLong(this.ts);
        output.writeInt(this.messageBytes.length);
        output.write(this.messageBytes);
    }

    private LogEntry(long j, byte[] bArr) {
        this.ts = j;
        this.messageBytes = bArr;
        this.apiLineLength = bArr.length + 30;
    }
}
