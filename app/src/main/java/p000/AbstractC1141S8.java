package p000;

/* renamed from: S8 */
/* loaded from: classes.dex */
public abstract class AbstractC1141S8 {

    /* renamed from: a */
    public static final char[] f10591a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static final int m7181a(char c) {
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

    /* renamed from: b */
    public static final boolean m7182b(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0.mo3963L();
        return (abstractC8315Tg1Mo3963L instanceof C4177hP) || ((abstractC8315Tg1Mo3963L instanceof AbstractC3933dW) && (((AbstractC3933dW) abstractC8315Tg1Mo3963L).mo17701U() instanceof C4177hP));
    }
}
