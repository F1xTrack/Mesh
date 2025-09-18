package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: Yk0 */
/* loaded from: classes2.dex */
public class C1922Yk0 implements Z41 {
    public static final String d = AbstractC7538v51.W(C1922Yk0.class.getCanonicalName(), "");
    public static final C1220Pk0 e = new C1220Pk0("NO_LOCKS", C7304tt.c);
    public final V01 a;
    public final C7304tt b;
    public final String c;

    public C1922Yk0(String str) {
        ReentrantLock reentrantLock = new ReentrantLock();
        O90.f(reentrantLock, "lock");
        QQ0 qq0 = new QQ0();
        qq0.a = reentrantLock;
        this(str, qq0);
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(d)) {
                break;
            } else {
                i++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    public final C1688Vk0 a(InterfaceC5908mZ interfaceC5908mZ) {
        return new C1688Vk0(this, interfaceC5908mZ);
    }

    public final C1454Sk0 b(InterfaceC6099nZ interfaceC6099nZ) {
        return new C1454Sk0(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC6099nZ, 1);
    }

    public final C1766Wk0 c(InterfaceC6099nZ interfaceC6099nZ) {
        return new C1766Wk0(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC6099nZ);
    }

    public C1135Oi d(Object obj, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return AbstractC1705Vq.l(sb, this.c, ")");
    }

    public C1922Yk0(String str, V01 v01) {
        C7304tt c7304tt = C7304tt.f;
        this.a = v01;
        this.b = c7304tt;
        this.c = str;
    }
}
