package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: z10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8283z10 extends Exception {
    public static final StackTraceElement[] f = new StackTraceElement[0];
    public final List a;
    public InterfaceC0660If0 b;
    public XC c;
    public Class d;
    public final String e;

    public C8283z10(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof C8283z10)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((C8283z10) th).a.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, C8093y10 c8093y10) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c8093y10.append("Cause (");
            int i2 = i + 1;
            c8093y10.append(String.valueOf(i2));
            c8093y10.append(" of ");
            c8093y10.append(String.valueOf(size));
            c8093y10.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C8283z10) {
                ((C8283z10) th).d(c8093y10);
            } else {
                c(th, c8093y10);
            }
            i = i2;
        }
    }

    public static void c(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d(Appendable appendable) throws IOException {
        c(this, appendable);
        try {
            b(this.a, new C8093y10(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        String str3 = "";
        if (this.d != null) {
            str = ", " + this.d;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.c != null) {
            str2 = ", " + this.c;
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.b != null) {
            str3 = ", " + this.b;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
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
        d(System.err);
    }

    public C8283z10(String str, List list) {
        this.e = str;
        setStackTrace(f);
        this.a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        d(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        d(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
