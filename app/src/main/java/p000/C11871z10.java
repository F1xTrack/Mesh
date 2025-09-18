package p000;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: z10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11871z10 extends Exception {

    /* renamed from: f */
    public static final StackTraceElement[] f46586f = new StackTraceElement[0];

    /* renamed from: a */
    public final List f46587a;

    /* renamed from: b */
    public InterfaceC7740If0 f46588b;

    /* renamed from: c */
    public EnumC1460XC f46589c;

    /* renamed from: d */
    public Class f46590d;

    /* renamed from: e */
    public final String f46591e;

    public C11871z10(String str) {
        this(str, Collections.emptyList());
    }

    /* renamed from: a */
    public static void m26300a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof C11871z10)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((C11871z10) th).f46587a.iterator();
        while (it.hasNext()) {
            m26300a((Throwable) it.next(), arrayList);
        }
    }

    /* renamed from: b */
    public static void m26301b(List list, C11744y10 c11744y10) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c11744y10.append("Cause (");
            int i2 = i + 1;
            c11744y10.append(String.valueOf(i2));
            c11744y10.append(" of ");
            c11744y10.append(String.valueOf(size));
            c11744y10.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C11871z10) {
                ((C11871z10) th).m26303d(c11744y10);
            } else {
                m26302c(th, c11744y10);
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public static void m26302c(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: d */
    public final void m26303d(Appendable appendable) throws IOException {
        m26302c(this, appendable);
        try {
            m26301b(this.f46587a, new C11744y10(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f46591e);
        String str3 = "";
        if (this.f46590d != null) {
            str = ", " + this.f46590d;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f46589c != null) {
            str2 = ", " + this.f46589c;
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.f46588b != null) {
            str3 = ", " + this.f46588b;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        m26300a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        m26303d(System.err);
    }

    public C11871z10(String str, List list) {
        this.f46591e = str;
        setStackTrace(f46586f);
        this.f46587a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        m26303d(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        m26303d(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
