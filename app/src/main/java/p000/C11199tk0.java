package p000;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: tk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11199tk0 extends AbstractC10815qk0 {

    /* renamed from: a */
    public final Object f43233a;

    /* renamed from: b */
    public final C11071sk0 f43234b;

    public C11199tk0(InterfaceC7902Li0 interfaceC7902Li0, C8583Yk1 c8583Yk1) {
        this.f43233a = interfaceC7902Li0;
        this.f43234b = (C11071sk0) new C10189lr0(c8583Yk1, C11071sk0.f42581f).m22554L(C11071sk0.class);
    }

    /* renamed from: b */
    public final void m24976b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C8932c31 c8932c31 = this.f43234b.f42582d;
        if (c8932c31.f17276c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < c8932c31.f17276c; i++) {
                C10943rk0 c10943rk0 = (C10943rk0) c8932c31.f17275b[i];
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(c8932c31.f17274a[i]);
                printWriter.print(": ");
                printWriter.println(c10943rk0.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                C11354ux1 c11354ux1 = c10943rk0.f41839l;
                printWriter.println(c11354ux1);
                c11354ux1.mo1582d(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (c10943rk0.f41841n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(c10943rk0.f41841n);
                    C0926Oi c0926Oi = c10943rk0.f41841n;
                    c0926Oi.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c0926Oi.f8575b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                Object objMo1868d = c10943rk0.mo1868d();
                StringBuilder sb = new StringBuilder(64);
                if (objMo1868d == null) {
                    sb.append("null");
                } else {
                    Class<?> cls = objMo1868d.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(c10943rk0.f16318c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f43233a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
