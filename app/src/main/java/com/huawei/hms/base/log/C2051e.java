package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.huawei.hms.base.log.e */
/* loaded from: classes.dex */
public class C2051e {

    /* renamed from: b */
    private String f18856b;

    /* renamed from: c */
    private String f18857c;

    /* renamed from: d */
    private int f18858d;

    /* renamed from: g */
    private String f18861g;

    /* renamed from: h */
    private int f18862h;

    /* renamed from: i */
    private int f18863i;

    /* renamed from: j */
    private int f18864j;

    /* renamed from: a */
    private final StringBuilder f18855a = new StringBuilder();

    /* renamed from: e */
    private long f18859e = 0;

    /* renamed from: f */
    private long f18860f = 0;

    public C2051e(int i, String str, int i2, String str2) {
        this.f18857c = "HMS";
        this.f18864j = i;
        this.f18856b = str;
        this.f18858d = i2;
        if (str2 != null) {
            this.f18857c = str2;
        }
        m11553b();
    }

    /* renamed from: a */
    public static String m11551a(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? String.valueOf(i) : "E" : "W" : "I" : "D";
    }

    /* renamed from: b */
    private C2051e m11553b() {
        this.f18859e = System.currentTimeMillis();
        Thread threadCurrentThread = Thread.currentThread();
        this.f18860f = threadCurrentThread.getId();
        this.f18862h = Process.myPid();
        StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
        int length = stackTrace.length;
        int i = this.f18864j;
        if (length > i) {
            StackTraceElement stackTraceElement = stackTrace[i];
            this.f18861g = stackTraceElement.getFileName();
            this.f18863i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    /* renamed from: c */
    public String m11558c() {
        StringBuilder sb = new StringBuilder();
        m11554b(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m11554b(sb);
        m11552a(sb);
        return sb.toString();
    }

    /* renamed from: a */
    public <T> C2051e m11555a(T t) {
        this.f18855a.append(t);
        return this;
    }

    /* renamed from: a */
    public C2051e m11556a(Throwable th) {
        m11555a((C2051e) '\n').m11555a((C2051e) Log.getStackTraceString(th));
        return this;
    }

    /* renamed from: a */
    public String m11557a() {
        StringBuilder sb = new StringBuilder();
        m11552a(sb);
        return sb.toString();
    }

    /* renamed from: b */
    private StringBuilder m11554b(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.f18859e)));
        String strM11551a = m11551a(this.f18858d);
        sb.append(' ');
        sb.append(strM11551a);
        sb.append('/');
        sb.append(this.f18857c);
        sb.append('/');
        sb.append(this.f18856b);
        sb.append(' ');
        sb.append(this.f18862h);
        sb.append(':');
        sb.append(this.f18860f);
        sb.append(' ');
        sb.append(this.f18861g);
        sb.append(':');
        sb.append(this.f18863i);
        sb.append(']');
        return sb;
    }

    /* renamed from: a */
    private StringBuilder m11552a(StringBuilder sb) {
        sb.append(' ');
        sb.append(this.f18855a.toString());
        return sb;
    }
}
