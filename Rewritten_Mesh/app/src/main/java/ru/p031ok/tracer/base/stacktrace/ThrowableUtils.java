package ru.p031ok.tracer.base.stacktrace;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0576J8;
import p000.C8313Tf1;
import p000.O90;

@Metadata(m22266d1 = {"\u00006\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0011\u001a\u001d\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a_\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u000fH\u0002¢\u0006\u0004\b\u0005\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u0004*\u00020\f2\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u000e\u001a\u00020\u00072\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u001b\u001a.\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001c*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0082\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m22267d2 = {"", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "LTf1;", "appendStackTraceTo", "(Ljava/lang/Throwable;Ljava/lang/Appendable;)V", "", "indent", "", "prefix", "", "Ljava/lang/StackTraceElement;", "trace", "framesInCommon", "", "visited", "(Ljava/lang/Throwable;Ljava/lang/Appendable;ILjava/lang/String;[Ljava/lang/StackTraceElement;ILjava/util/Map;)V", "ex", "framesRepeat", "(Ljava/lang/Throwable;[Ljava/lang/StackTraceElement;)I", "appendTo", "(Ljava/lang/StackTraceElement;Ljava/lang/Appendable;ILjava/lang/String;)V", "appendIndent", "(Ljava/lang/Appendable;I)Ljava/lang/Appendable;", "a", "b", "([Ljava/lang/StackTraceElement;[Ljava/lang/StackTraceElement;)I", "T", "key", "plusAssign", "(Ljava/util/Map;Ljava/lang/Object;)V", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ThrowableUtils {
    private static final Appendable appendIndent(Appendable appendable, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            appendable.append("\t");
        }
        return appendable;
    }

    public static final void appendStackTraceTo(Throwable th, Appendable appendable) throws IOException {
        O90.m5968f(th, "<this>");
        O90.m5968f(appendable, "out");
        StackTraceElement[] stackTrace = th.getStackTrace();
        O90.m5967e(stackTrace, "stackTrace");
        appendStackTraceTo$default(th, appendable, 0, null, stackTrace, 0, new IdentityHashMap(), 22, null);
    }

    public static /* synthetic */ void appendStackTraceTo$default(Throwable th, Appendable appendable, int i, String str, StackTraceElement[] stackTraceElementArr, int i2, Map map, int i3, Object obj) throws IOException {
        appendStackTraceTo(th, appendable, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str, stackTraceElementArr, (i3 & 16) != 0 ? 0 : i2, map);
    }

    public static final void appendTo(StackTraceElement stackTraceElement, Appendable appendable, int i, String str) throws IOException {
        String fileName;
        O90.m5968f(stackTraceElement, "<this>");
        O90.m5968f(appendable, "out");
        O90.m5968f(str, "prefix");
        appendIndent(appendable, i).append(str);
        if (stackTraceElement.isNativeMethod()) {
            fileName = "Native Method";
        } else {
            fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "Unknown Source";
            }
        }
        appendable.append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(fileName);
        if (stackTraceElement.getLineNumber() >= 0) {
            appendable.append(StringUtils.PROCESS_POSTFIX_DELIMITER).append(String.valueOf(stackTraceElement.getLineNumber()));
        }
        Appendable appendableAppend = appendable.append(")");
        O90.m5967e(appendableAppend, "out.append(\")\")");
        O90.m5967e(appendableAppend.append('\n'), "append('\\n')");
    }

    public static /* synthetic */ void appendTo$default(StackTraceElement stackTraceElement, Appendable appendable, int i, String str, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            str = "at ";
        }
        appendTo(stackTraceElement, appendable, i, str);
    }

    private static final int framesInCommon(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int iM4189p = AbstractC0576J8.m4189p(stackTraceElementArr);
        for (int iM4189p2 = AbstractC0576J8.m4189p(stackTraceElementArr2); iM4189p >= 0 && iM4189p2 >= 0 && O90.m5963a(stackTraceElementArr[iM4189p], stackTraceElementArr2[iM4189p2]); iM4189p2--) {
            iM4189p--;
        }
        return (stackTraceElementArr.length - 1) - iM4189p;
    }

    private static final int framesRepeat(Throwable th, StackTraceElement[] stackTraceElementArr) {
        if (th instanceof StackOverflowError) {
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            int length = stackTraceElementArr.length;
            for (int i = 1; i < length; i++) {
                if (O90.m5963a(stackTraceElement, stackTraceElementArr[i])) {
                    return i;
                }
            }
        }
        return 0;
    }

    private static final <T> void plusAssign(Map<T, C8313Tf1> map, T t) {
        O90.m5968f(map, "<this>");
        map.put(t, C8313Tf1.f11463a);
    }

    private static final void appendStackTraceTo(Throwable th, Appendable appendable, int i, String str, StackTraceElement[] stackTraceElementArr, int i2, Map<Throwable, C8313Tf1> map) throws IOException {
        if (map.containsKey(th)) {
            Appendable appendableAppend = appendIndent(appendable, 1).append("[CIRCULAR REFERENCE: ").append(th.toString()).append("]");
            O90.m5967e(appendableAppend, "out.appendIndent(1)\n    …s.toString()).append(\"]\")");
            O90.m5967e(appendableAppend.append('\n'), "append('\\n')");
            return;
        }
        plusAssign(map, th);
        Appendable appendableAppend2 = appendIndent(appendable, i).append(str).append(th.toString());
        O90.m5967e(appendableAppend2, "out.appendIndent(indent)…).append(this.toString())");
        O90.m5967e(appendableAppend2.append('\n'), "append('\\n')");
        int iFramesRepeat = framesRepeat(th, stackTraceElementArr);
        int length = iFramesRepeat > 0 ? iFramesRepeat : stackTraceElementArr.length - i2;
        for (int i3 = 0; i3 < length; i3++) {
            appendTo$default(stackTraceElementArr[i3], appendable, i + 1, null, 4, null);
        }
        if (iFramesRepeat > 0) {
            Appendable appendableAppend3 = appendIndent(appendable, i + 1).append("... ").append(String.valueOf(iFramesRepeat)).append(" calls repeat");
            O90.m5967e(appendableAppend3, "out.appendIndent(indent …).append(\" calls repeat\")");
            O90.m5967e(appendableAppend3.append('\n'), "append('\\n')");
        } else if (i2 != 0) {
            Appendable appendableAppend4 = appendIndent(appendable, i + 1).append("... ").append(String.valueOf(i2)).append(" more");
            O90.m5967e(appendableAppend4, "out.appendIndent(indent …String()).append(\" more\")");
            O90.m5967e(appendableAppend4.append('\n'), "append('\\n')");
        }
        Throwable[] suppressed = th.getSuppressed();
        O90.m5967e(suppressed, "suppressed");
        for (Throwable th2 : suppressed) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            O90.m5967e(stackTrace, "suppTrace");
            appendStackTraceTo(th2, appendable, i + 1, "Suppressed: ", stackTrace, framesInCommon(stackTraceElementArr, stackTrace), map);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            O90.m5967e(stackTrace2, "causeTrace");
            appendStackTraceTo(cause, appendable, i, "Caused by: ", stackTrace2, framesInCommon(stackTraceElementArr, stackTrace2), map);
        }
    }
}
