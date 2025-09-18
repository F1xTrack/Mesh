package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: Mk0 */
/* loaded from: classes.dex */
public final class C0986Mk0 implements InterfaceC0831Kk0 {
    public final LocaleList a;

    public C0986Mk0(Object obj) {
        this.a = AbstractC0909Lk0.l(obj);
    }

    @Override // defpackage.InterfaceC0831Kk0
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override // defpackage.InterfaceC0831Kk0
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((InterfaceC0831Kk0) obj).b());
    }

    @Override // defpackage.InterfaceC0831Kk0
    public final Locale get(int i) {
        return this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.InterfaceC0831Kk0
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.InterfaceC0831Kk0
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}
