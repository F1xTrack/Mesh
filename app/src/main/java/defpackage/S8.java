package defpackage;

/* loaded from: classes.dex */
public abstract class S8 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final boolean b(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0.L();
        return (abstractC1521Tg1L instanceof C4147hP) || ((abstractC1521Tg1L instanceof AbstractC3405dW) && (((AbstractC3405dW) abstractC1521Tg1L).U() instanceof C4147hP));
    }
}
