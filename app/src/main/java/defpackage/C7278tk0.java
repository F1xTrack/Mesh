package defpackage;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: tk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7278tk0 extends AbstractC6706qk0 {
    public final Object a;
    public final C7087sk0 b;

    public C7278tk0(InterfaceC0903Li0 interfaceC0903Li0, C1923Yk1 c1923Yk1) {
        this.a = interfaceC0903Li0;
        this.b = (C7087sk0) new C5772lr0(c1923Yk1, C7087sk0.f).L(C7087sk0.class);
    }

    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C2443c31 c2443c31 = this.b.d;
        if (c2443c31.c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < c2443c31.c; i++) {
                C6896rk0 c6896rk0 = (C6896rk0) c2443c31.b[i];
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(c2443c31.a[i]);
                printWriter.print(": ");
                printWriter.println(c6896rk0.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                C7509ux1 c7509ux1 = c6896rk0.l;
                printWriter.println(c7509ux1);
                c7509ux1.d(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (c6896rk0.n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(c6896rk0.n);
                    C1135Oi c1135Oi = c6896rk0.n;
                    c1135Oi.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c1135Oi.b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                Object objD = c6896rk0.d();
                StringBuilder sb = new StringBuilder(64);
                if (objD == null) {
                    sb.append("null");
                } else {
                    Class<?> cls = objD.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(c6896rk0.c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
