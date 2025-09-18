package defpackage;

/* renamed from: rr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6916rr implements InterfaceC8318zC0 {
    public abstract boolean a(char c);

    @Override // defpackage.InterfaceC8318zC0
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
