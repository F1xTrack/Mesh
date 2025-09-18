package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.json.JSONException;
import p000.AbstractC11153tN0;
import p000.AbstractC7222ym;

/* loaded from: classes.dex */
public class Logger {
    private static final boolean DEBUG = false;
    private static final int MAX_STACK_DEEP_LENGTH = 20;
    private static final int MAX_STACK_DEEP_LENGTH_NORMAL = 8;
    private static final String SPLIT = "|";
    private static final String TAG = "NetworkKit_Logger";
    private static final String TAG_NETWORKKIT_PRE = "NetworkKit_";
    private static final String TAG_NETWORK_SDK_PRE = "NetworkSdk_";
    private static ExtLogger extLogger = null;
    private static boolean kitPrint = true;

    public static class ThrowableWrapper extends Throwable {
        private static final long serialVersionUID = 7129050843360571879L;
        private String message;
        private Throwable ownerThrowable;
        private Throwable thisCause;

        public /* synthetic */ ThrowableWrapper(Throwable th, C20811 c20811) {
            this(th);
        }

        public synchronized void setCause(Throwable th) {
            this.thisCause = th;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable getCause() {
            Throwable th;
            th = this.thisCause;
            if (th == this) {
                th = null;
            }
            return th;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.ownerThrowable;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.message == null) {
                return name;
            }
            String strConcat = name.concat(": ");
            if (this.message.startsWith(strConcat)) {
                return this.message;
            }
            StringBuilder sbM26238o = AbstractC7222ym.m26238o(strConcat);
            sbM26238o.append(this.message);
            return sbM26238o.toString();
        }

        private ThrowableWrapper(Throwable th) {
            this.ownerThrowable = th;
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i = ((th instanceof IOException) || (th instanceof JSONException)) ? 8 : 20;
            if (stackTrace.length > i) {
                setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i));
            } else {
                setStackTrace(stackTrace);
            }
            setMessage(StringUtils.anonymizeMessage(th.getMessage()));
        }
    }

    private static String complexAppTag(String str) {
        return AbstractC7222ym.m26245v(TAG_NETWORK_SDK_PRE, str);
    }

    private static String complexMsg(String str, int i) {
        return !TextUtils.isEmpty(str) ? AbstractC11153tN0.m24914z(new StringBuilder(), getCallMethodInfo(i), "|", str) : getCallMethodInfo(i);
    }

    private static String complexTag(String str) {
        return AbstractC7222ym.m26245v(TAG_NETWORKKIT_PRE, str);
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: d */
    public static void m11680d(String str, Object obj) {
        println(3, str, obj);
    }

    /* renamed from: e */
    public static void m11682e(String str, Object obj) {
        println(6, str, obj);
    }

    private static void extLogPrintln(int i, String str, String str2) {
        if (i == 2) {
            extLogger.m11677v(str, str2);
            return;
        }
        if (i == 3) {
            extLogger.m11673d(str, str2);
            return;
        }
        if (i == 4) {
            extLogger.m11676i(str, str2);
        } else if (i == 5) {
            extLogger.m11678w(str, str2);
        } else {
            if (i != 6) {
                return;
            }
            extLogger.m11674e(str, str2);
        }
    }

    private static String getCallMethodInfo(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return Thread.currentThread().getName() + "|" + stackTraceElement.getFileName() + "|" + stackTraceElement.getClassName() + "|" + stackTraceElement.getMethodName() + "|" + stackTraceElement.getLineNumber();
    }

    private static Throwable getNewThrowable(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        ThrowableWrapper throwableWrapper = new ThrowableWrapper(th);
        Throwable cause = th.getCause();
        ThrowableWrapper throwableWrapper2 = throwableWrapper;
        while (cause != null) {
            ThrowableWrapper throwableWrapper3 = new ThrowableWrapper(cause);
            throwableWrapper2.setCause(throwableWrapper3);
            cause = cause.getCause();
            throwableWrapper2 = throwableWrapper3;
        }
        return throwableWrapper;
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: i */
    public static void m11685i(String str, Object obj) {
        println(4, str, obj);
    }

    private static boolean isAPPLoggable(int i) {
        return extLogger != null && i >= 3;
    }

    private static boolean isKitLoggable(int i) {
        return kitPrint && isLoggable(i);
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(TAG_NETWORKKIT_PRE, i);
    }

    private static int logPrintln(int i, String str, String str2) {
        if (isAPPLoggable(i)) {
            extLogPrintln(i, complexAppTag(str), complexMsg(str2, 7));
        }
        if (isKitLoggable(i)) {
            return Log.println(i, complexTag(str), complexMsg(str2, 7));
        }
        return 1;
    }

    public static void println(int i, String str, Object obj) {
        if (i < 3) {
            return;
        }
        logPrintln(i, str, obj == null ? "null" : obj.toString());
    }

    public static void setExtLogger(ExtLogger extLogger2, boolean z) {
        extLogger = extLogger2;
        kitPrint = z;
        m11685i(TAG, "logger = " + extLogger2 + z);
    }

    /* renamed from: v */
    public static void m11688v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    /* renamed from: w */
    public static void m11689w(String str, Object obj) {
        println(5, str, obj);
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: d */
    public static void m11681d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    /* renamed from: e */
    public static void m11684e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: i */
    public static void m11686i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static void println(int i, String str, String str2, Object... objArr) {
        if (i >= 3 && str2 != null) {
            try {
                logPrintln(i, str, StringUtils.format(str2, objArr));
            } catch (IllegalFormatException e) {
                m11690w(TAG, "log format error".concat(str2), e);
            }
        }
    }

    /* renamed from: v */
    public static void m11687v(String str, Object obj) {
        println(2, str, obj);
    }

    /* renamed from: w */
    public static void m11691w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }

    /* renamed from: e */
    public static void m11683e(String str, String str2, Throwable th) {
        if (isAPPLoggable(6)) {
            extLogger.m11675e(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (kitPrint) {
            complexTag(str);
            complexMsg(str2, 5);
            getNewThrowable(th);
        }
    }

    /* renamed from: w */
    public static void m11690w(String str, String str2, Throwable th) {
        if (isAPPLoggable(5)) {
            extLogger.m11679w(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (kitPrint) {
            complexTag(str);
            complexMsg(str2, 5);
            getNewThrowable(th);
        }
    }
}
