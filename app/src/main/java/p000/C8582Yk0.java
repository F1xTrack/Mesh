package p000;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: Yk0 */
/* loaded from: classes2.dex */
public class C8582Yk0 implements Z41 {

    /* renamed from: d */
    public static final String f14496d = AbstractC11374v51.m25348W(C8582Yk0.class.getCanonicalName(), "");

    /* renamed from: e */
    public static final C8114Pk0 f14497e = new C8114Pk0("NO_LOCKS", C6914tt.f43392c);

    /* renamed from: a */
    public final V01 f14498a;

    /* renamed from: b */
    public final C6914tt f14499b;

    /* renamed from: c */
    public final String f14500c;

    public C8582Yk0(String str) {
        ReentrantLock reentrantLock = new ReentrantLock();
        O90.m5968f(reentrantLock, "lock");
        QQ0 qq0 = new QQ0();
        qq0.f9619a = reentrantLock;
        this(str, qq0);
    }

    /* renamed from: e */
    public static void m9348e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(f14496d)) {
                break;
            } else {
                i++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    /* renamed from: a */
    public final C8426Vk0 m9349a(InterfaceC6434mZ interfaceC6434mZ) {
        return new C8426Vk0(this, interfaceC6434mZ);
    }

    /* renamed from: b */
    public final C8270Sk0 m9350b(InterfaceC6497nZ interfaceC6497nZ) {
        return new C8270Sk0(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC6497nZ, 1);
    }

    /* renamed from: c */
    public final C8478Wk0 m9351c(InterfaceC6497nZ interfaceC6497nZ) {
        return new C8478Wk0(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC6497nZ);
    }

    /* renamed from: d */
    public C0926Oi mo6421d(Object obj, String str) {
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
        m9348e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return AbstractC1374Vq.m8593l(sb, this.f14500c, ")");
    }

    public C8582Yk0(String str, V01 v01) {
        C6914tt c6914tt = C6914tt.f43395f;
        this.f14498a = v01;
        this.f14499b = c6914tt;
        this.f14500c = str;
    }
}
